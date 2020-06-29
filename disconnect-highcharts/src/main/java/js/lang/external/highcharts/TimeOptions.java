package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply globally
 * or to individual charts. These settings affect how <code>datetime</code> axes are laid
 * out, how tooltips are formatted, how series pointIntervalUnit works and how
 * the Highstock range selector handles time.
 *
 * The common use case is that all charts in the same Highcharts object share
 * the same time settings, in which case the global settings are set using
 * <code>setOptions</code>. (see online documentation for example)
 *
 * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
 * <code>time</code> object, and time options can be set on each individual chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TimeOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A custom <code>Date</code> class for advanced date
   * handling. For example, JDate can be hooked in to handle Jalali dates.
   *
   */
  @JSProperty("Date")
  @Nullable
  Any getDate();

  /**
   * (Highcharts, Highstock, Gantt) A custom <code>Date</code> class for advanced date
   * handling. For example, JDate can be hooked in to handle Jalali dates.
   *
   */
  @JSProperty("Date")
  void setDate(@Nullable Any value);

  /**
   * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
   * for a given datetime. It takes the timestamp in terms of milliseconds
   * since January 1 1970, and returns the timezone offset in minutes. This
   * provides a hook for drawing time based charts in specific time zones
   * using their local DST crossover dates, with the help of external
   * libraries.
   *
   */
  @JSProperty("getTimezoneOffset")
  @Nullable
  TimezoneOffsetCallbackFunction getGetTimezoneOffset();

  /**
   * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
   * for a given datetime. It takes the timestamp in terms of milliseconds
   * since January 1 1970, and returns the timezone offset in minutes. This
   * provides a hook for drawing time based charts in specific time zones
   * using their local DST crossover dates, with the help of external
   * libraries.
   *
   */
  @JSProperty("getTimezoneOffset")
  void setGetTimezoneOffset(@Nullable TimezoneOffsetCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
   * is specified, it creates a default getTimezoneOffset function that looks
   * up the specified timezone in moment.js. If moment.js is not included,
   * this throws a Highcharts error in the console, but does not crash the
   * chart.
   *
   */
  @JSProperty("timezone")
  @Nullable
  String getTimezone();

  /**
   * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
   * is specified, it creates a default getTimezoneOffset function that looks
   * up the specified timezone in moment.js. If moment.js is not included,
   * this throws a Highcharts error in the console, but does not crash the
   * chart.
   *
   */
  @JSProperty("timezone")
  void setTimezone(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
   * values are west, negative values are east of UTC, as in the ECMAScript
   * getTimezoneOffset method. Use this to display UTC based data in a
   * predefined time zone.
   *
   */
  @JSProperty("timezoneOffset")
  double getTimezoneOffset();

  /**
   * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
   * values are west, negative values are east of UTC, as in the ECMAScript
   * getTimezoneOffset method. Use this to display UTC based data in a
   * predefined time zone.
   *
   */
  @JSProperty("timezoneOffset")
  void setTimezoneOffset(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
   * scaling, tickmark placement and time display in <code>Highcharts.dateFormat</code>.
   * Advantages of using UTC is that the time displays equally regardless of
   * the user agent's time zone settings. Local time can be used when the data
   * is loaded in real time or when correct Daylight Saving Time transitions
   * are required.
   *
   */
  @JSProperty("useUTC")
  boolean getUseUTC();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
   * scaling, tickmark placement and time display in <code>Highcharts.dateFormat</code>.
   * Advantages of using UTC is that the time displays equally regardless of
   * the user agent's time zone settings. Local time can be used when the data
   * is loaded in real time or when correct Daylight Saving Time transitions
   * are required.
   *
   */
  @JSProperty("useUTC")
  void setUseUTC(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final TimeOptions object = Any.empty();

    private Builder() {
    }

    public TimeOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) A custom <code>Date</code> class for advanced date
     * handling. For example, JDate can be hooked in to handle Jalali dates.
     *
     */
    public Builder Date(@Nullable Any value) {
      object.setDate(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
     * for a given datetime. It takes the timestamp in terms of milliseconds
     * since January 1 1970, and returns the timezone offset in minutes. This
     * provides a hook for drawing time based charts in specific time zones
     * using their local DST crossover dates, with the help of external
     * libraries.
     *
     */
    public Builder getTimezoneOffset(@Nullable TimezoneOffsetCallbackFunction value) {
      object.setGetTimezoneOffset(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
     * is specified, it creates a default getTimezoneOffset function that looks
     * up the specified timezone in moment.js. If moment.js is not included,
     * this throws a Highcharts error in the console, but does not crash the
     * chart.
     *
     */
    public Builder timezone(@Nullable String value) {
      object.setTimezone(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
     * values are west, negative values are east of UTC, as in the ECMAScript
     * getTimezoneOffset method. Use this to display UTC based data in a
     * predefined time zone.
     *
     */
    public Builder timezoneOffset(double value) {
      object.setTimezoneOffset(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
     * scaling, tickmark placement and time display in <code>Highcharts.dateFormat</code>.
     * Advantages of using UTC is that the time displays equally regardless of
     * the user agent's time zone settings. Local time can be used when the data
     * is loaded in real time or when correct Daylight Saving Time transitions
     * are required.
     *
     */
    public Builder useUTC(boolean value) {
      object.setUseUTC(value);
      return this;
    }
  }
}
