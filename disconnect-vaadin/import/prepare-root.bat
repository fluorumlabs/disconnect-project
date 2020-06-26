@echo off
echo ===[ Fetching NPM modules ]===
rd /s /q node_modules
rd /s /q %cd%\..\src\main\java\js
del package-lock.json
call npm install
rd /s /q %cd%\node_modules\@vaadin\vaadin-element-mixin\custom_typings
rd /s /q %cd%\node_modules\lit-element\ts3.4
rd /s /q %cd%\node_modules\lit-html\ts3.4
