# PowerShell script to remove EvoSuite test files with only notGeneratedAnyTest() method
# Define the path to your evosuite-tests folder
$evosuiteFolderPath = "C:\Users\yewjo\OneDrive\Desktop\NUS\y4s2\cs3213\project\sqlancer\test\sqlancer\evosuite"

# Count for statistics
$filesRemoved = 0
$filesChecked = 0

# Process all *ESTest.java files recursively
Get-ChildItem -Path $evosuiteFolderPath -Filter "*ESTest.java" -Recurse | ForEach-Object {
    $filePath = $_.FullName
    $fileName = $_.Name
    $filesChecked++

    # Read file content
    $content = Get-Content -Path $filePath -Raw

    # Check if the file only contains the notGeneratedAnyTest() method and no other test methods
    # Pattern to look for: contains notGeneratedAnyTest() but doesn't contain any other @Test methods
    $hasNotGeneratedMethod = $content -match "notGeneratedAnyTest\s*\(\s*\)"
    $hasOtherTestMethods = $content -match "@Test(?!\s*\r?\n\s*public\s+void\s+notGeneratedAnyTest)"

    # If it only has the notGeneratedAnyTest method and no other test methods, delete it
    if ($hasNotGeneratedMethod -and -not $hasOtherTestMethods) {
        Remove-Item -Path $filePath -Force
        Write-Host "Removed file with no tests: $fileName"
        $filesRemoved++
    }
}

Write-Host "Completed. Checked $filesChecked files, removed $filesRemoved empty test files."