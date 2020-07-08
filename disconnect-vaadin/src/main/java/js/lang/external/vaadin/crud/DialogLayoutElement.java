package js.lang.external.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-crud", version = "^1.3.0-alpha2")
@Import(module = "@vaadin/vaadin-crud/src/vaadin-dialog-layout.js")
public interface DialogLayoutElement extends HTMLElement {

    // !wca! get editorPosition: string

    // !wca! set editorPosition: string

    // !wca! get mobile: boolean

    // !wca! set mobile: boolean

    // !wca! get noCloseOnEsc: boolean

    // !wca! set noCloseOnEsc: boolean

    // !wca! get noCloseOnOutsideClick: boolean

    // !wca! set noCloseOnOutsideClick: boolean

    // !wca! get opened: boolean

    // !wca! set opened: boolean

    // !wca! get theme: string

    // !wca! set theme: string
}
