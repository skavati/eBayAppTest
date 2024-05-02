cls
cd .\
# To get "Parallel" node value from config.xml file
$configPath=$PSScriptRoot+"\config.xml"
$configXml = [xml](Get-Content $configPath)
$Parallel=$configXml.config.Parallel
Write-Host "Parallel node value: " $Parallel
if ($Parallel -eq "true"){
# getting row count of "DeviceList" sheet
$excelFilePath =$PSScriptRoot+"\TestData_MBank_Appium.xlsx"
Write-Host "test data file full path: " $excelFilePath
$sheetName = "DeviceList"
$objExcel = New-Object -ComObject Excel.Application
$objExcel.Visible = $false
$WorkBook = $objExcel.Workbooks.Open($excelFilePath)
$WorkSheet = $WorkBook.sheets.item($sheetName)
$WorksheetRange = $workSheet.UsedRange
$RowCount = $WorksheetRange.Rows.Count
# To get forkCount from RowCount
$forkCount=($RowCount-1)
} else {
$forkCount=1
}
Write-Host "forkCount: " $forkCount

#Below is to use in Jenkins before build run (pre build setup)
#Replace fork_count in pom.xml then run
$POMPath = $PSScriptRoot+"\pom.xml"
[xml]$xmlDoc = Get-Content $POMPath
$xmlDoc.project.properties.fork_count = "$forkCount"
$xmlDoc.Save($POMPath)
