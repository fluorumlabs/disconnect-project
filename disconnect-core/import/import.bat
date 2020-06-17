@echo off
rd /s /q node_modules
rd /s /q %cd%\..\src\main\java\js
del package-lock.json
call npm install
del %cd%\node_modules\universal-router\src\UniversalRouterSync.d.ts
call java -jar %cd%\..\..\disconnect-binding-generator\target\parse-dts.jar -i %cd%\node_modules\@vaadin -p js.lang.external -o %cd%\..
