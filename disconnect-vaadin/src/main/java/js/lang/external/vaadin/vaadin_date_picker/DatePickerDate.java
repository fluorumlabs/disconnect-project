package js.lang.external.vaadin.vaadin_date_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-date-picker",
    version = "^4.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-picker/vaadin-date-picker.js"
)
public interface DatePickerDate extends Any {
  @JSProperty("day")
  double getDay();

  @JSProperty("day")
  void setDay(double value);

  @JSProperty("month")
  double getMonth();

  @JSProperty("month")
  void setMonth(double value);

  @JSProperty("year")
  double getYear();

  @JSProperty("year")
  void setYear(double value);

  class Builder {
    private final DatePickerDate object = Any.empty();

    public DatePickerDate build() {
      return object;
    }

    public Builder day(double value) {
      object.setDay(value);
      return this;
    }

    public Builder month(double value) {
      object.setMonth(value);
      return this;
    }

    public Builder year(double value) {
      object.setYear(value);
      return this;
    }
  }
}
