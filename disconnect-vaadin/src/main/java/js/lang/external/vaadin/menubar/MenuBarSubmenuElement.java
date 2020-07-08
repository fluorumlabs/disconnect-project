package js.lang.external.vaadin.menubar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <strong>Mixins:</strong> ElementMixin, ThemePropertyMixin, ItemsMixin, GestureEventListeners, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-menu-bar", version = "^1.2.0-alpha1")
@Import(module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-submenu.js")
public interface MenuBarSubmenuElement extends HTMLElement {

    // !wca! close: (): void

    // !wca! open: (e: Event | undefined): void

    // !wca! get closeOn: string

    // !wca! set closeOn: string

    // !wca! get items: ContextMenuItem[] | undefined

    // !wca! set items: ContextMenuItem[] | undefined

    // !wca! get listenOn: HTMLElement

    // !wca! set listenOn: HTMLElement

    // !wca! get openOn: string

    // !wca! set openOn: string

    // !wca! get opened: boolean

    // !wca! get renderer: ContextMenuRenderer | null | undefined

    // !wca! set renderer: ContextMenuRenderer | null | undefined

    // !wca! get selector: string | null | undefined

    // !wca! set selector: string | null | undefined

    // !wca! get theme: string | null | undefined
}
