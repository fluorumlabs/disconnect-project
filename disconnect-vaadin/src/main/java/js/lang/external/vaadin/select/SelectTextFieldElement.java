package js.lang.external.vaadin.select;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The text-field element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html"><code>&lt;vaadin-text-field&gt;</code> documentation</a> for <code>&lt;vaadin-select-text-field&gt;</code> parts and available slots (prefix, suffix etc.)
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-select", version = "^2.3.0-alpha4")
@Import(module = "@vaadin/vaadin-select/src/vaadin-select-text-field.js")
public interface SelectTextFieldElement extends HTMLElement {

    // !wca! checkValidity: (): boolean

    // !wca! clear: (): void

    // !wca! click: (): void

    // !wca! validate: (): boolean

    // !wca! get autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined

    // !wca! set autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined

    // !wca! get autocomplete: string | null | undefined

    // !wca! set autocomplete: string | null | undefined

    // !wca! get autocorrect: "on" | "off" | undefined

    // !wca! set autocorrect: "on" | "off" | undefined

    // !wca! get autofocus: boolean | null | undefined

    // !wca! set autofocus: boolean | null | undefined

    // !wca! get autoselect: boolean

    // !wca! set autoselect: boolean

    // !wca! get clearButtonVisible: boolean

    // !wca! set clearButtonVisible: boolean

    // !wca! get disabled: boolean | null | undefined

    // !wca! set disabled: boolean | null | undefined

    // !wca! get errorMessage: string

    // !wca! set errorMessage: string

    // !wca! get focusElement: ?

    // !wca! get hasValue: boolean | null | undefined

    // !wca! set hasValue: boolean | null | undefined

    // !wca! get i18n: { clear: string; }

    // !wca! set i18n: { clear: string; }

    // !wca! get inputElement: ?

    // !wca! get invalid: boolean

    // !wca! set invalid: boolean

    // !wca! get label: string

    // !wca! set label: string

    // !wca! get list: string | null | undefined

    // !wca! set list: string | null | undefined

    // !wca! get maxlength: number | null | undefined

    // !wca! set maxlength: number | null | undefined

    // !wca! get minlength: number | null | undefined

    // !wca! set minlength: number | null | undefined

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get pattern: string | null | undefined

    // !wca! set pattern: string | null | undefined

    // !wca! get placeholder: string | null | undefined

    // !wca! set placeholder: string | null | undefined

    // !wca! get preventInvalidInput: boolean | null | undefined

    // !wca! set preventInvalidInput: boolean | null | undefined

    // !wca! get readonly: boolean | null | undefined

    // !wca! set readonly: boolean | null | undefined

    // !wca! get required: boolean | null | undefined

    // !wca! set required: boolean | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get title: string

    // !wca! set title: string

    // !wca! get value: string

    // !wca! set value: string
}
