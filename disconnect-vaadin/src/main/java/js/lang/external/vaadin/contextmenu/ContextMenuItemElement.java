package js.lang.external.vaadin.contextmenu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * The vaadin-context-menu-item element.
 *
 * <strong>Mixins:</strong> ItemMixin, ThemableMixin, DirMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-context-menu", version = "^4.5.0-alpha2")
@Import(module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js")
public interface ContextMenuItemElement extends HTMLElement {

    // !wca! get disabled: boolean

    // !wca! set disabled: boolean

    // !wca! get selected: boolean

    // !wca! set selected: boolean

    // !wca! get theme: string | null | undefined

    // !wca! get value: string

    // !wca! set value: string
}
