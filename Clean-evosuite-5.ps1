# PowerShell script to disable test methods containing mock() function calls
# Define the path to your evosuite-tests folder
$evosuiteFolderPath = "C:\Users\yewjo\OneDrive\Desktop\NUS\y4s2\cs3213\project\sqlancer\test\sqlancer\evosuite"

# Process all *ESTest.java files recursively
Get-ChildItem -Path $evosuiteFolderPath -Filter "*ESTest.java" -Recurse | ForEach-Object {
    $filePath = $_.FullName
    $fileName = $_.Name
    $fileContent = Get-Content -Path $filePath -Raw
    $modified = $false

    # Check if the file contains any mock() calls
    if ($fileContent -match "mock\(") {
        # Split into lines to process
        $lines = $fileContent -split "`r?`n"
        $newLines = @()
        $inTestMethod = $false
        $currentMethodLines = @()
        $methodHasMock = $false
        $openBraces = 0

        foreach ($line in $lines) {
            # Check if we're already in a test method or starting a new one
            if (!$inTestMethod) {
                # Starting a new test method
                if ($line -match "@Test" -or $line -match "public\s+void\s+test") {
                    $inTestMethod = $true
                    $currentMethodLines = @($line)
                    $methodHasMock = $false
                    $openBraces = 0

                    # Count opening braces in the current line
                    if ($line -match "{") {
                        $openBraces += ($line | Select-String -Pattern "{" -AllMatches).Matches.Count
                    }

                    # Check for mock() call
                    if ($line -match "mock\(") {
                        $methodHasMock = $true
                    }
                } else {
                    # Not in test method, add line as-is
                    $newLines += $line
                }
            } else {
                # Already in a test method, continue collecting lines
                $currentMethodLines += $line

                # Count opening braces in the current line
                if ($line -match "{") {
                    $openBraces += ($line | Select-String -Pattern "{" -AllMatches).Matches.Count
                }

                # Check for mock() call
                if ($line -match "mock\(") {
                    $methodHasMock = $true
                }

                # Count closing braces in the current line
                if ($line -match "}") {
                    $openBraces -= ($line | Select-String -Pattern "}" -AllMatches).Matches.Count
                }

                # If braces are balanced, we've reached the end of the method
                if ($openBraces -eq 0 -and $line -match "}") {
                    $inTestMethod = $false

                    # If method has mock calls, comment it out and add explanation
                    if ($methodHasMock) {
                        $modified = $true
                        $newLines += "/* Test disabled because it contains mock() function calls that are not implemented"
                        $newLines += $currentMethodLines
                        $newLines += "*/"
                    } else {
                        # If no mock calls, keep the method as is
                        $newLines += $currentMethodLines
                    }
                }
            }
        }

        # Write back to file if changes were made
        if ($modified) {
            $newContent = $newLines -join "`n"
            Set-Content -Path $filePath -Value $newContent -NoNewline
            Write-Host "Updated: $fileName - Disabled test methods containing mock() calls"
        }
    }
}

Write-Host "Completed processing all ESTest.java files."