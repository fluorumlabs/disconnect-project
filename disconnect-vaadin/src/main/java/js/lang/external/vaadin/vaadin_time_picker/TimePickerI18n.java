package js.lang.external.vaadin.vaadin_time_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final TimePickerI18n object = Any.empty();

    private Builder() {
    }

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
