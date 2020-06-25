@echo off
rd /s /q node_modules
rd /s /q %cd%\..\src\main\java\js
del package-lock.json
call npm install
rd /s /q %cd%\node_modules\@vaadin\router
rd /s /q %cd%\node_modules\@vaadin\vaadin-element-mixin\custom_typings
rd /s /q %cd%\node_modules\@webcomponents
rd /s /q %cd%\node_modules\cookieconsent
rd /s /q %cd%\node_modules\highcharts
rd /s /q %cd%\node_modules\lit-html\ts3.4
rd /s /q %cd%\node_modules\lit-element\ts3.4
rd /s /q %cd%\node_modules\path-to-regexp
call java -jar %cd%\..\..\disconnect-binding-generator\target\parse-dts.jar -i %cd%\node_modules -p js.lang.external -o %cd%\..
