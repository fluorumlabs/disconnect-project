@echo off
rd /s /q node_modules
rd /s /q %cd%\..\src\main\java\js
del package-lock.json
call npm install
cd node_modules
cd ..
call java -jar %cd%\..\..\disconnect-binding-generator\target\parse-dts.jar -i %cd%\node_modules\highcharts -p js.lang.external -o %cd%\.. -e es-modules/masters -s
