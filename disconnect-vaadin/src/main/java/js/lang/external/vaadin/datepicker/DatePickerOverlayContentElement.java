package js.lang.external.vaadin.datepicker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <strong>Mixins:</strong> ThemableMixin, DirMixin, GestureEventListeners, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-picker", version = "^4.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-picker/theme/material/vaadin-date-picker-overlay-content.js")
public interface DatePickerOverlayContentElement extends HTMLElement {

    // !wca! announceFocusedDate: (): void

    // !wca! focusCancel: (): void

    // !wca! revealDate: (date: any): void

    // !wca! scrollToDate: (date: any, animate: any): void

    // !wca! get focusedDate: ?

    // !wca! set focusedDate: ?

    // !wca! get i18n: object

    // !wca! set i18n: object

    // !wca! get initialPosition: ?

    // !wca! set initialPosition: ?

    // !wca! get label: string

    // !wca! set label: string

    // !wca! get maxDate: ?

    // !wca! set maxDate: ?

    // !wca! get minDate: ?

    // !wca! set minDate: ?

    // !wca! get selectedDate: ?

    // !wca! set selectedDate: ?

    // !wca! get showWeekNumbers: boolean

    // !wca! set showWeekNumbers: boolean

    // !wca! get theme: string | null | undefined
}
