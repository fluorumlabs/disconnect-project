package js.lang.external.vaadin.datetimepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;

/**
 * The time-picker element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-time-picker/blob/master/src/vaadin-time-picker.html"><code>&lt;vaadin-time-picker&gt;</code> documentation</a> for <code>&lt;vaadin-date-time-picker-time-picker&gt;</code> parts and available slots (prefix, suffix etc.)
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-time-picker", version = "^1.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-time-picker/src/vaadin-date-time-picker-time-picker.js")
public interface DateTimePickerTimePickerElement extends HTMLElement {

    // !wca! checkValidity: (): boolean

    // !wca! click: (): void

    // !wca! validate: (): boolean

    // !wca! get autoOpenDisabled: boolean | null | undefined

    // !wca! set autoOpenDisabled: boolean | null | undefined

    // !wca! get autofocus: boolean | null | undefined

    // !wca! set autofocus: boolean | null | undefined

    // !wca! get clearButtonVisible: boolean

    // !wca! set clearButtonVisible: boolean

    // !wca! get disabled: boolean

    // !wca! set disabled: boolean

    // !wca! get errorMessage: string | null | undefined

    // !wca! set errorMessage: string | null | undefined

    // !wca! get focusElement: HTMLElement

    // !wca! get i18n: TimePickerI18n

    // !wca! set i18n: TimePickerI18n

    // !wca! get invalid: boolean

    // !wca! set invalid: boolean

    // !wca! get label: string | null | undefined

    // !wca! set label: string | null | undefined

    // !wca! get max: string

    // !wca! set max: string

    // !wca! get min: string

    // !wca! set min: string

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get pattern: string | null | undefined

    // !wca! set pattern: string | null | undefined

    // !wca! get placeholder: string

    // !wca! set placeholder: string

    // !wca! get preventInvalidInput: boolean | null | undefined

    // !wca! set preventInvalidInput: boolean | null | undefined

    // !wca! get readonly: boolean

    // !wca! set readonly: boolean

    // !wca! get required: boolean

    // !wca! set required: boolean

    // !wca! get step: number | null | undefined

    // !wca! set step: number | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get value: string

    // !wca! set value: string
}
