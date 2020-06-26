@echo off
echo ---[ Importing %1 ]---
call java -jar %cd%\..\..\disconnect-binding-generator\target\parse-dts.jar -i %cd%\node_modules\%1 -p js.lang.external -o %cd%\..
