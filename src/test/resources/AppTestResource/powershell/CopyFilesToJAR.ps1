cls
cd .\
# delete folder 'MBResource' if exists
if( (Test-Path -Path "MBResource") )
{
   Remove-Item "MBResource" -Recurse
}
#create folder MBResource\config
$configDir=".\MBResource\config"
#create folder MBResource\data
$dataDir=".\MBResource\data"
#create folder MBResource\featurelist
$featurelistDir=".\MBResource\featurelist"
#create data,config and featurelist directories
New-Item -ItemType Directory -Force -Path $configDir
New-Item -ItemType Directory -Force -Path $dataDir
New-Item -ItemType Directory -Force -Path $featurelistDir
# to get TestDataFile name from config.xml
$configXml = [xml](Get-Content .\config.xml)
$TestDataFile=$configXml.config.TestDataFile
#To copy TestDataFile to MBResource\data
Copy-Item ".\$TestDataFile" $dataDir
#To copy config.xml to MBResource\config
Copy-Item ".\config.xml" $configDir
#To copy config.xml to MBResource\config
Copy-Item ".\FeatureList_MBank.txt" $featurelistDir
$configFile="$configDir\config.xml"
$dataFile="$dataDir\$TestDataFile"
$featurelistFile="$featurelistDir\FeatureList_MBank1.txt"

Write-Progress -Activity "Copying files to JAR in Progress..."
#to copy MBResource\config\config.xml and MBResource\data\testDataFile to JAR
cmd /c jar uf MBank-0.0.1-SNAPSHOT-jar-with-dependencies.jar $dataFile $configFile $featurelistFile
Write-Progress -Activity "Completed"

if( (Test-Path -Path "MBResource") )
{
   Remove-Item "MBResource" -Recurse
}