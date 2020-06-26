@echo off
:call prepare-root.bat

echo ===[ Polymer ]===
:call import.bat @polymer/polymer

echo ===[ lit ]===
:call import.bat lit-html
:call import.bat lit-element

echo ===[ Iron ]===
:call import.bat @polymer/iron-a11y-announcer
:call import.bat @polymer/iron-a11y-keys-behavior
:call import.bat @polymer/iron-fit-behavior
:call import.bat @polymer/iron-flex-layout
:call import.bat @polymer/iron-icon
:call import.bat @polymer/iron-iconset-svg
:call import.bat @polymer/iron-list
:call import.bat @polymer/iron-media-query
:call import.bat @polymer/iron-meta
:call import.bat @polymer/iron-overlay-behavior
:call import.bat @polymer/iron-resizable-behavior
:call import.bat @polymer/iron-scroll-target-behavior

echo ===[ Vaadin ]===
:call import.bat @vaadin/vaadin-control-state-mixin
:call import.bat @vaadin/vaadin-element-mixin
:call import.bat @vaadin/vaadin-list-mixin
:call import.bat @vaadin/vaadin-themable-mixin
:call import.bat @vaadin/vaadin-item
:call import.bat @vaadin/vaadin-accordion
call import.bat @vaadin/vaadin-app-layout
:call import.bat @vaadin/vaadin-board
:call import.bat @vaadin/vaadin-button
:call import.bat @vaadin/vaadin-charts
:call import.bat @vaadin/vaadin-checkbox
:call import.bat @vaadin/vaadin-combo-box
:call import.bat @vaadin/vaadin-confirm-dialog
:call import.bat @vaadin/vaadin-context-menu
:call import.bat @vaadin/vaadin-cookie-consent
:call import.bat @vaadin/vaadin-crud
:call import.bat @vaadin/vaadin-custom-field
:call import.bat @vaadin/vaadin-date-picker
:call import.bat @vaadin/vaadin-date-time-picker
:call import.bat @vaadin/vaadin-details
:call import.bat @vaadin/vaadin-dialog
:call import.bat @vaadin/vaadin-form-layout
:call import.bat @vaadin/vaadin-grid
:call import.bat @vaadin/vaadin-grid-pro
:call import.bat @vaadin/vaadin-icons
:call import.bat @vaadin/vaadin-list-box
:call import.bat @vaadin/vaadin-login
:call import.bat @vaadin/vaadin-menu-bar
:call import.bat @vaadin/vaadin-notification
:call import.bat @vaadin/vaadin-ordered-layout
:call import.bat @vaadin/vaadin-overlay
:call import.bat @vaadin/vaadin-progress-bar
:call import.bat @vaadin/vaadin-radio-button
:call import.bat @vaadin/vaadin-rich-text-editor
:call import.bat @vaadin/vaadin-select
:call import.bat @vaadin/vaadin-split-layout
:call import.bat @vaadin/vaadin-tabs
:call import.bat @vaadin/vaadin-text-field
:call import.bat @vaadin/vaadin-time-picker
:call import.bat @vaadin/vaadin-upload
