package js.lang.external.vaadin.vaadin_date_time_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.vaadin.vaadin_date_picker.DatePickerI18n;
import js.lang.external.vaadin.vaadin_time_picker.TimePickerI18n;

@NpmPackage(
    name = "@vaadin/vaadin-date-time-picker",
    version = "^1.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-time-picker/vaadin-date-time-picker.js"
)
public interface DateTimePickerI18n extends DatePickerI18n, TimePickerI18n {
}
