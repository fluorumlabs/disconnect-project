package js.lang.external.vaadin.datetimepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * The date-picker element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-date-picker/blob/master/src/vaadin-date-picker.html"><code>&lt;vaadin-date-picker&gt;</code> documentation</a> for <code>&lt;vaadin-date-time-picker-date-picker&gt;</code> parts and available slots (prefix, suffix etc.)
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, DatePickerMixin, GestureEventListeners, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-time-picker", version = "^1.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-time-picker/src/vaadin-date-time-picker-date-picker.js")
public interface DateTimePickerDatePickerElement extends HTMLElement {

    // !wca! checkValidity: (): boolean

    // !wca! click: (): void

    // !wca! close: (): void

    // !wca! open: (): void

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

    // !wca! get i18n: DatePickerI18n

    // !wca! set i18n: DatePickerI18n

    // !wca! get initialPosition: string | null | undefined

    // !wca! set initialPosition: string | null | undefined

    // !wca! get invalid: boolean

    // !wca! set invalid: boolean

    // !wca! get label: string | null | undefined

    // !wca! set label: string | null | undefined

    // !wca! get max: string | undefined

    // !wca! set max: string | undefined

    // !wca! get min: string | undefined

    // !wca! set min: string | undefined

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get opened: boolean | null | undefined

    // !wca! set opened: boolean | null | undefined

    // !wca! get placeholder: string | null | undefined

    // !wca! set placeholder: string | null | undefined

    // !wca! get readonly: boolean

    // !wca! set readonly: boolean

    // !wca! get required: boolean

    // !wca! set required: boolean

    // !wca! get showWeekNumbers: boolean | null | undefined

    // !wca! set showWeekNumbers: boolean | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get value: string

    // !wca! set value: string
}
