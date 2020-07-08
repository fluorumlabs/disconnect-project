package js.lang.external.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * Element for internal use only.
 *
 * <strong>Mixins:</strong> DisableUpgradeMixin, mixinBehaviors, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-combo-box", version = "^5.3.0-alpha4")
@Import(module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-dropdown.js")
public interface ComboBoxDropdownElement extends HTMLElement {

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! notifyResize: (): void

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! get alignedAbove: boolean

    // !wca! set alignedAbove: boolean

    // !wca! get opened: boolean

    // !wca! set opened: boolean

    // !wca! get positionTarget: object

    // !wca! set positionTarget: object

    // !wca! get template: object

    // !wca! set template: object

    // !wca! get theme: string

    // !wca! set theme: string
}
