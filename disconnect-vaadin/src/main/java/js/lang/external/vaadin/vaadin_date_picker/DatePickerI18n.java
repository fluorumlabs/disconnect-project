package js.lang.external.vaadin.vaadin_date_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-date-picker",
    version = "^4.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-picker/vaadin-date-picker.js"
)
public interface DatePickerI18n extends Any {
  @JSProperty("monthNames")
  String[] getMonthNames();

  @JSProperty("monthNames")
  void setMonthNames(String[] value);

  @JSProperty("weekdays")
  String[] getWeekdays();

  @JSProperty("weekdays")
  void setWeekdays(String[] value);

  @JSProperty("weekdaysShort")
  String[] getWeekdaysShort();

  @JSProperty("weekdaysShort")
  void setWeekdaysShort(String[] value);

  @JSProperty("firstDayOfWeek")
  double getFirstDayOfWeek();

  @JSProperty("firstDayOfWeek")
  void setFirstDayOfWeek(double value);

  @JSProperty("week")
  String getWeek();

  @JSProperty("week")
  void setWeek(String value);

  @JSProperty("calendar")
  String getCalendar();

  @JSProperty("calendar")
  void setCalendar(String value);

  @JSProperty("clear")
  String getClear();

  @JSProperty("clear")
  void setClear(String value);

  @JSProperty("today")
  String getToday();

  @JSProperty("today")
  void setToday(String value);

  @JSProperty("cancel")
  String getCancel();

  @JSProperty("cancel")
  void setCancel(String value);

  @Nullable
  DatePickerDate parseDate(String date);

  String formatDate(DatePickerDate date);

  String formatTitle(String monthName, double fullYear);

  class Builder {
    private final DatePickerI18n object = Any.empty();

    public DatePickerI18n build() {
      return object;
    }

    public Builder monthNames(String[] value) {
      object.setMonthNames(value);
      return this;
    }

    public Builder weekdays(String[] value) {
      object.setWeekdays(value);
      return this;
    }

    public Builder weekdaysShort(String[] value) {
      object.setWeekdaysShort(value);
      return this;
    }

    public Builder firstDayOfWeek(double value) {
      object.setFirstDayOfWeek(value);
      return this;
    }

    public Builder week(String value) {
      object.setWeek(value);
      return this;
    }

    public Builder calendar(String value) {
      object.setCalendar(value);
      return this;
    }

    public Builder clear(String value) {
      object.setClear(value);
      return this;
    }

    public Builder today(String value) {
      object.setToday(value);
      return this;
    }

    public Builder cancel(String value) {
      object.setCancel(value);
      return this;
    }
  }
}
