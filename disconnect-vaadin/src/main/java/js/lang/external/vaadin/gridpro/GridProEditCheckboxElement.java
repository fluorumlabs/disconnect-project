package js.lang.external.vaadin.gridpro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The cell editor checkbox element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-checkbox/blob/master/src/vaadin-checkbox.html"><code>&lt;vaadin-checkbox&gt;</code> documentation</a> for <code>&lt;vaadin-checkbox&gt;</code> parts.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid-pro", version = "^2.2.0-alpha3")
@Import(module = "@vaadin/vaadin-grid-pro/theme/material/vaadin-grid-pro-edit-checkbox.js")
public interface GridProEditCheckboxElement extends HTMLElement {

    // !wca! click: (): void

    // !wca! get autofocus: boolean | null | undefined

    // !wca! set autofocus: boolean | null | undefined

    // !wca! get checked: boolean

    // !wca! set checked: boolean

    // !wca! get disabled: boolean | null | undefined

    // !wca! set disabled: boolean | null | undefined

    // !wca! get focusElement: HTMLInputElement

    // !wca! get indeterminate: boolean

    // !wca! set indeterminate: boolean

    // !wca! get name: string

    // !wca! set name: string

    // !wca! get theme: string | null | undefined

    // !wca! get value: string | null | undefined

    // !wca! set value: string | null | undefined
}
