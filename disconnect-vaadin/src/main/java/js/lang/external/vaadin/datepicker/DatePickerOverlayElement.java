package js.lang.external.vaadin.datepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * The overlay element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-date-picker-overlay&gt;</code> parts.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> DisableUpgradeMixin, ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-picker", version = "^4.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-picker/theme/material/vaadin-date-picker-overlay.js")
public interface DatePickerOverlayElement extends HTMLElement {

    // !wca! bringToFront: (): void

    // !wca! close: (sourceEvent?: Event | null | undefined): void

    // !wca! get content: HTMLElement | undefined

    // !wca! set content: HTMLElement | undefined

    // !wca! get focusTrap: boolean

    // !wca! set focusTrap: boolean

    // !wca! get hidden: boolean

    // !wca! set hidden: boolean

    // !wca! get instanceProps: object | null | undefined

    // !wca! set instanceProps: object | null | undefined

    // !wca! get model: object | null | undefined

    // !wca! set model: object | null | undefined

    // !wca! get modeless: boolean

    // !wca! set modeless: boolean

    // !wca! get opened: boolean | null | undefined

    // !wca! set opened: boolean | null | undefined

    // !wca! get owner: HTMLElement | null

    // !wca! set owner: HTMLElement | null

    // !wca! get renderer: OverlayRenderer | null | undefined

    // !wca! set renderer: OverlayRenderer | null | undefined

    // !wca! get restoreFocusOnClose: boolean

    // !wca! set restoreFocusOnClose: boolean

    // !wca! get template: HTMLTemplateElement | null | undefined

    // !wca! set template: HTMLTemplateElement | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get withBackdrop: boolean

    // !wca! set withBackdrop: boolean
}
