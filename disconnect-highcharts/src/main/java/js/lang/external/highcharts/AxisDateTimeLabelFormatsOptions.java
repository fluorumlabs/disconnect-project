package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
 * automatically adjust to the appropriate unit. This member gives the default
 * string representations used for each unit. For intermediate values, different
 * units may be used, for example the <code>day</code> unit can be used on midnight and
 * <code>hour</code> unit be used for intermediate values on the same axis. For an overview
 * of the replacement codes, see dateFormat.
 *
 * Defaults to: (see online documentation for example)
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisDateTimeLabelFormatsOptions extends Any {
  @JSProperty("day")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getDay();

  @JSProperty("day")
  void setDay(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("day")
  void setDay(@Nullable String value);

  @JSProperty("hour")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getHour();

  @JSProperty("hour")
  void setHour(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("hour")
  void setHour(@Nullable String value);

  @JSProperty("millisecond")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getMillisecond();

  @JSProperty("millisecond")
  void setMillisecond(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("millisecond")
  void setMillisecond(@Nullable String value);

  @JSProperty("minute")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getMinute();

  @JSProperty("minute")
  void setMinute(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("minute")
  void setMinute(@Nullable String value);

  @JSProperty("month")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getMonth();

  @JSProperty("month")
  void setMonth(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("month")
  void setMonth(@Nullable String value);

  @JSProperty("second")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getSecond();

  @JSProperty("second")
  void setSecond(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("second")
  void setSecond(@Nullable String value);

  @JSProperty("week")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getWeek();

  @JSProperty("week")
  void setWeek(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("week")
  void setWeek(@Nullable String value);

  @JSProperty("year")
  @Nullable
  Unknown /* ( string | AxisDateTimeLabelFormatsOptionsObject ) */ getYear();

  @JSProperty("year")
  void setYear(@Nullable AxisDateTimeLabelFormatsOptionsObject value);

  @JSProperty("year")
  void setYear(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AxisDateTimeLabelFormatsOptions object = Any.empty();

    private Builder() {
    }

    public AxisDateTimeLabelFormatsOptions build() {
      return object;
    }

    public Builder day(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setDay(value);
      return this;
    }

    public Builder day(@Nullable String value) {
      object.setDay(value);
      return this;
    }

    public Builder hour(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setHour(value);
      return this;
    }

    public Builder hour(@Nullable String value) {
      object.setHour(value);
      return this;
    }

    public Builder millisecond(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setMillisecond(value);
      return this;
    }

    public Builder millisecond(@Nullable String value) {
      object.setMillisecond(value);
      return this;
    }

    public Builder minute(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setMinute(value);
      return this;
    }

    public Builder minute(@Nullable String value) {
      object.setMinute(value);
      return this;
    }

    public Builder month(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setMonth(value);
      return this;
    }

    public Builder month(@Nullable String value) {
      object.setMonth(value);
      return this;
    }

    public Builder second(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setSecond(value);
      return this;
    }

    public Builder second(@Nullable String value) {
      object.setSecond(value);
      return this;
    }

    public Builder week(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setWeek(value);
      return this;
    }

    public Builder week(@Nullable String value) {
      object.setWeek(value);
      return this;
    }

    public Builder year(@Nullable AxisDateTimeLabelFormatsOptionsObject value) {
      object.setYear(value);
      return this;
    }

    public Builder year(@Nullable String value) {
      object.setYear(value);
      return this;
    }
  }
}
