cls
cd .\
$filePath =$PSScriptRoot+"\TestData_MBank_Appium.xlsx"
Write-Host "test data file full path: " $filePath
$sheetName = "DeviceList"
$objExcel = New-Object -ComObject Excel.Application
$objExcel.Visible = $false
$WorkBook = $objExcel.Workbooks.Open($filePath)
$WorkSheet = $WorkBook.sheets.item($sheetName)
$WorksheetRange = $workSheet.UsedRange
$RowCount = $WorksheetRange.Rows.Count
#$ColumnCount = $WorksheetRange.Columns.Count
Write-Host "Excel RowCount:" $RowCount
Write-Host "forkCount:" ($RowCount-1)
#Write-Host "ColumnCount" $ColumnCount
