package js.lang.external.vaadin.datepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <strong>Mixins:</strong> ThemableMixin, GestureEventListeners, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-picker", version = "^4.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-picker/theme/material/vaadin-month-calendar.js")
public interface MonthCalendarElement extends HTMLElement {

    // !wca! get disabled: boolean

    // !wca! set disabled: boolean

    // !wca! get focusedDate: ?

    // !wca! set focusedDate: ?

    // !wca! get i18n: object

    // !wca! set i18n: object

    // !wca! get ignoreTaps: boolean

    // !wca! set ignoreTaps: boolean

    // !wca! get maxDate: ?

    // !wca! set maxDate: ?

    // !wca! get minDate: ?

    // !wca! set minDate: ?

    // !wca! get month: ?

    // !wca! set month: ?

    // !wca! get selectedDate: ?

    // !wca! set selectedDate: ?

    // !wca! get showWeekNumbers: boolean

    // !wca! set showWeekNumbers: boolean

    // !wca! get theme: string | null | undefined
}
