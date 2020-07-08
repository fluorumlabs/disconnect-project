package js.lang.external.vaadin.contextmenu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * The vaadin-context-menu-list-box element.
 *
 * <strong>Mixins:</strong> MultiSelectListMixin, ThemableMixin, ElementMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-context-menu", version = "^4.5.0-alpha2")
@Import(module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js")
public interface ContextMenuListBoxElement extends HTMLElement {

    // !wca! focus: (): void

    // !wca! get focused: Element | null

    // !wca! set focused: Element | null

    // !wca! get items: Element[] | undefined

    // !wca! get multiple: boolean | null | undefined

    // !wca! set multiple: boolean | null | undefined

    // !wca! get orientation: ListOrientation

    // !wca! set orientation: ListOrientation

    // !wca! get selected: number | null | undefined

    // !wca! set selected: number | null | undefined

    // !wca! get selectedValues: string[] | null | undefined

    // !wca! set selectedValues: string[] | null | undefined

    // !wca! get theme: string | null | undefined
}
