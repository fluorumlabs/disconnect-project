@echo off
rd /s /q node_modules
rd /s /q %cd%\..\src\main\java\js
del package-lock.json
call npm install
call java -jar %cd%\..\..\disconnect-zero-binding-generator\target\disconnect-zero-binding-generator-0.1.0-alpha3-jar-with-dependencies.jar -i %cd%\node_modules\@polymer -p js.lang.external.polymer -o %cd%\..
