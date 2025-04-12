# PowerShell script to remove deprecated Integer boxing syntax and Random.setNext lines
# Define the path to your evosuite-tests folder
$evosuiteFolderPath = "C:\Users\yewjo\OneDrive\Desktop\NUS\y4s2\cs3213\project\sqlancer\test\sqlancer\evosuite"

# Process all *ESTest.java files recursively
Get-ChildItem -Path $evosuiteFolderPath -Filter "*ESTest.java" -Recurse | ForEach-Object {
    $filePath = $_.FullName
    $fileName = $_.Name

    # Read file content as an array of lines to handle line removal
    $lines = Get-Content -Path $filePath
    $modified = $false
    $newLines = @()

    # Check if file contains any target patterns
    $fileContent = Get-Content -Path $filePath -Raw
    $needsProcessing = $fileContent -match "new\s+Integer\s*\(" -or $fileContent -match "Random\.setNext"

    if ($needsProcessing) {
        # Process each line
        foreach ($line in $lines) {
            # Skip lines with Random.setNext
            if ($line -match "Random\.setNext") {
                $modified = $true
                continue
            }

            # Replace Integer boxing on this line if exists
            if ($line -match "new\s+Integer\s*\(") {
                $newLine = $line -replace "new\s+Integer\s*\(\s*([^)]+)\s*\)", '$1'
                if ($line -ne $newLine) {
                    $modified = $true
                    $newLines += $newLine
                } else {
                    $newLines += $line
                }
            } else {
                $newLines += $line
            }
        }

        # Write back to file if changes were made
        if ($modified) {
            Set-Content -Path $filePath -Value $newLines
            Write-Host "Updated: $fileName - Removed Integer boxing and/or Random.setNext lines"
        }
    }
}

Write-Host "Completed processing all ESTest.java files."