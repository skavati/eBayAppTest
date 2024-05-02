cls
cd .\
# to get TestDataFile name from config.xml under 'TestMBDevice'
$configXml = [xml](Get-Content .\config.xml)
$TestDataFile=$configXml.config.TestDataFile
# To get "Parallel" node value from config.xml file
$configXmlFiles = Get-ChildItem $project -Filter *.xml -Recurse | % { $_.FullName }
 ForEach ($configXmlFile in $configXmlFiles)
 { 
 if ($configXmlFile.Contains("config\") -and ($configXmlFile.Contains("resources")))  { 
   $configXmlContent = [xml](Get-Content $configXmlFile)
   Write-Output "config.xml file full path: "+$configXmlFile
   }
 }

$Parallel=$configXmlContent.config.Parallel
Write-Host "Parallel node value: " $Parallel
if ($Parallel -eq "true"){
# getting row count of "DeviceList" sheet

$excelFiles = Get-ChildItem $project -Filter *.xlsx -Recurse | % { $_.FullName }
 ForEach ($excelFile in $excelFiles)
 { 
 if ($excelFile.Contains("\$TestDataFile") -and ($excelFile.Contains("resources")))
  {
   Write-Output "test data file full path: "+$excelFile
   break
   }
 }
 
$sheetName = "DeviceList"
$objExcel = New-Object -ComObject Excel.Application
$objExcel.Visible = $false
$WorkBook = $objExcel.Workbooks.Open($excelFile)
$WorkSheet = $WorkBook.sheets.item($sheetName)
$WorksheetRange = $workSheet.UsedRange
$RowCount = $WorksheetRange.Rows.Count
# To get forkCount from RowCount
$forkCount=($RowCount-1)
} else {
$forkCount=1
}
Write-Host "forkCount: " $forkCount
cmd /c taskkill /f /im EXCEL.EXE
# now run project either parallely or serially based on $forkCount
cmd /c mvn install "-Dfork_count=$forkCount"
