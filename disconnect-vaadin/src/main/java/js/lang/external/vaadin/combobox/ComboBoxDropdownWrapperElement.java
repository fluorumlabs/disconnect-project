package js.lang.external.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;

/**
 * Element for internal use only.
 */
@NpmPackage(name = "@vaadin/vaadin-combo-box", version = "^5.3.0-alpha4")
@Import(module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-dropdown-wrapper.js")
public interface ComboBoxDropdownWrapperElement<T extends Any> extends HTMLElement {

    // !wca! adjustScrollPosition: (): void

    // !wca! ensureItemsRendered: (): void

    // !wca! getItemLabel: (item: any, itemLabelPath: any): string

    // !wca! indexOfLabel: (label: any): number

    // !wca! updateViewportBoundaries: (): void

    // !wca! get loading: boolean

    // !wca! set loading: boolean

    // !wca! get opened: ?

    // !wca! set opened: ?

    // !wca! get positionTarget: object

    // !wca! set positionTarget: object

    // !wca! get renderer: ?

    // !wca! set renderer: ?

    // !wca! get theme: ?

    // !wca! set theme: ?

    // !wca! get touchDevice: boolean

    // !wca! set touchDevice: boolean
}
