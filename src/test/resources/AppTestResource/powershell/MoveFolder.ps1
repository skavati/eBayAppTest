cls
$mbank = "C:\Users\c70032.CLIENT\eclipse-workspace\MBankWeb\src\main\java\mbankweb"
if( (Test-Path  $mbank) )
{
 Move-Item $mbank C:\Users\c70032.CLIENT\eclipse-workspace\MBankWeb\src\test\java -force
 echo "mbankweb moved to test\java"
}else {
    echo "mbankweb doesn't exist"
}

$mbresource="C:\Users\c70032.CLIENT\eclipse-workspace\MBankWeb\src\main\resources\MBResource"

if( (Test-Path $mbresource) )
{
 Move-Item  $mbresource C:\Users\c70032.CLIENT\eclipse-workspace\MBankWeb\src\test\resources -force
 echo "MBResource moved to test\resource"
}else {
    echo "MBResource doesn't exist"
}

