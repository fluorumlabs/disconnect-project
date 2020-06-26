package js.lang.external.vaadin.vaadin_time_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-time-picker",
    version = "^2.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-time-picker/vaadin-time-picker.js"
)
public interface TimePickerI18n extends Any {
  @Nullable
  TimePickerTime parseTime(String time);

  String formatTime(TimePickerTime time);

  @JSProperty("clear")
  String getClear();

  @JSProperty("clear")
  void setClear(String value);

  @JSProperty("selector")
  String getSelector();

  @JSProperty("selector")
  void setSelector(String value);

  class Builder {
    private final TimePickerI18n object = Any.empty();

    public TimePickerI18n build() {
      return object;
    }

    public Builder clear(String value) {
      object.setClear(value);
      return this;
    }

    public Builder selector(String value) {
      object.setSelector(value);
      return this;
    }
  }
}
