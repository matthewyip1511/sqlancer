# PowerShell script to add required imports and verifyException method
# Define the path to your evosuite-tests folder
$evosuiteFolderPath = "C:\Users\yewjo\OneDrive\Desktop\NUS\y4s2\cs3213\project\sqlancer\test\sqlancer\evosuite"

# Define the imports we want to add
$importAssertions = "import static org.junit.jupiter.api.Assertions.*;"
$importTest = "import org.junit.jupiter.api.Test;"

# Define the verifyException method to add
$verifyExceptionMethod = @"

  private void verifyException(String s, Exception e) { }
"@

# Process all *ESTest.java files recursively
Get-ChildItem -Path $evosuiteFolderPath -Filter "*ESTest.java" -Recurse | ForEach-Object {
    $filePath = $_.FullName
    $fileName = $_.Name
    $fileModified = $false
    $methodAdded = $false

    # Read file content line by line
    $lines = Get-Content -Path $filePath

    # Check if file needs verifyException method
    $needsVerifyExceptionMethod = $lines | Where-Object { $_ -match "verifyException\(" }
    $hasVerifyExceptionMethod = $lines | Where-Object { $_ -match "private void verifyException\(" }

    # Check if imports already exist
    $hasAssertionsImport = $lines | Where-Object { $_ -match [regex]::Escape($importAssertions) }
    $hasTestImport = $lines | Where-Object { $_ -match [regex]::Escape($importTest) }

    # If imports don't exist, we need to add them in lexicographical order
    if (-not $hasAssertionsImport -or -not $hasTestImport) {
        $fileModified = $true

        # Get all import lines
        $importLines = $lines | Where-Object { $_ -match "^import " }

        # Add our new imports to the collection
        if (-not $hasAssertionsImport) {
            $importLines += $importAssertions
        }
        if (-not $hasTestImport) {
            $importLines += $importTest
        }

        # Sort imports lexicographically, but keep static imports first
        $staticImports = $importLines | Where-Object { $_ -match "^import static " } | Sort-Object
        $regularImports = $importLines | Where-Object { $_ -match "^import " -and $_ -notmatch "^import static " } | Sort-Object
        $sortedImports = $staticImports + $regularImports

        # Remove all import lines from original content
        $nonImportLines = $lines | Where-Object { $_ -notmatch "^import " }

        # Find the package line index
        $packageLineIndex = -1
        for ($i = 0; $i -lt $nonImportLines.Count; $i++) {
            if ($nonImportLines[$i] -match "^package ") {
                $packageLineIndex = $i
                break
            }
        }

        # Construct new content with sorted imports after package line
        $newLines = @()
        for ($i = 0; $i -lt $nonImportLines.Count; $i++) {
            $newLines += $nonImportLines[$i]
            # Insert imports after package line
            if ($i -eq $packageLineIndex) {
                $newLines += ""  # Add empty line after package
                $newLines += $sortedImports
                $newLines += ""  # Add empty line after imports
            }
        }

        $lines = $newLines
    }

    # Add verifyException method if needed and doesn't already exist
    if ($needsVerifyExceptionMethod -and -not $hasVerifyExceptionMethod) {
        $fileModified = $true
        $methodAdded = $true

        # Find the class opening brace line index
        $classOpenBraceIndex = -1
        for ($i = 0; $i -lt $lines.Count; $i++) {
            if ($lines[$i] -match "public class .+\s*{") {
                $classOpenBraceIndex = $i
                break
            }
        }

        if ($classOpenBraceIndex -ne -1) {
            # Insert method after class opening brace
            $newLines = @()
            for ($i = 0; $i -lt $lines.Count; $i++) {
                $newLines += $lines[$i]
                if ($i -eq $classOpenBraceIndex) {
                    $newLines += $verifyExceptionMethod
                }
            }
            $lines = $newLines
        }
    }

    # Write back to file if changes were made
    if ($fileModified) {
        Set-Content -Path $filePath -Value $lines
        $message = "Updated: $fileName - Added imports"
        if ($methodAdded) {
            $message += " and verifyException method"
        }
        Write-Host $message
    }
}

Write-Host "Completed processing all ESTest.java files."