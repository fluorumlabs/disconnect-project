package js.lang.external.vaadin.vaadin_time_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* string | number */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-time-picker",
    version = "^2.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-time-picker/vaadin-time-picker.js"
)
public interface TimePickerTime extends Any {
  @JSProperty("hours")
  Unknown /* string | number */ getHours();

  @JSProperty("hours")
  void setHours(double value);

  @JSProperty("hours")
  void setHours(String value);

  @JSProperty("minutes")
  Unknown /* string | number */ getMinutes();

  @JSProperty("minutes")
  void setMinutes(double value);

  @JSProperty("minutes")
  void setMinutes(String value);

  @JSProperty("seconds")
  @Nullable
  Unknown /* string | number */ getSeconds();

  @JSProperty("seconds")
  void setSeconds(double value);

  @JSProperty("seconds")
  void setSeconds(@Nullable String value);

  @JSProperty("milliseconds")
  @Nullable
  Unknown /* string | number */ getMilliseconds();

  @JSProperty("milliseconds")
  void setMilliseconds(double value);

  @JSProperty("milliseconds")
  void setMilliseconds(@Nullable String value);

  class Builder {
    private final TimePickerTime object = Any.empty();

    public TimePickerTime build() {
      return object;
    }

    public Builder hours(double value) {
      object.setHours(value);
      return this;
    }

    public Builder hours(String value) {
      object.setHours(value);
      return this;
    }

    public Builder minutes(double value) {
      object.setMinutes(value);
      return this;
    }

    public Builder minutes(String value) {
      object.setMinutes(value);
      return this;
    }

    public Builder seconds(double value) {
      object.setSeconds(value);
      return this;
    }

    public Builder seconds(@Nullable String value) {
      object.setSeconds(value);
      return this;
    }

    public Builder milliseconds(double value) {
      object.setMilliseconds(value);
      return this;
    }

    public Builder milliseconds(@Nullable String value) {
      object.setMilliseconds(value);
      return this;
    }
  }
}
