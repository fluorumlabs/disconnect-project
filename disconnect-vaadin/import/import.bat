@echo off
call java -jar %cd%\..\..\disconnect-wca-binding-generator\target\parse-wca.jar -jp com.github.fluorumlabs.disconnect -jsp js.lang.external -i @vaadin/vaadin@next -o %cd%\.. -q

