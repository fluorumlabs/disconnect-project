package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) An array of configuration objects for the buttons.
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
public interface RangeSelectorButtonsOptions extends Any {
  /**
   * (Highstock, Gantt) How many units of the defined type the button should
   * span. If <code>type</code> is &quot;month&quot; and <code>count</code> is 3, the button spans three
   * months.
   *
   */
  @JSProperty("count")
  double getCount();

  /**
   * (Highstock, Gantt) How many units of the defined type the button should
   * span. If <code>type</code> is &quot;month&quot; and <code>count</code> is 3, the button spans three
   * months.
   *
   */
  @JSProperty("count")
  void setCount(double value);

  /**
   * (Highstock) A custom data grouping object for each button.
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  DataGroupingOptionsObject getDataGrouping();

  /**
   * (Highstock) A custom data grouping object for each button.
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(@Nullable DataGroupingOptionsObject value);

  @JSProperty("events")
  @Nullable
  RangeSelectorButtonsEventsOptions getEvents();

  @JSProperty("events")
  void setEvents(@Nullable RangeSelectorButtonsEventsOptions value);

  /**
   * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
   * the calculated time span.
   *
   */
  @JSProperty("offsetMax")
  double getOffsetMax();

  /**
   * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
   * the calculated time span.
   *
   */
  @JSProperty("offsetMax")
  void setOffsetMax(double value);

  /**
   * (Highstock, Gantt) Additional range (in milliseconds) added to the start
   * of the calculated time span.
   *
   */
  @JSProperty("offsetMin")
  double getOffsetMin();

  /**
   * (Highstock, Gantt) Additional range (in milliseconds) added to the start
   * of the calculated time span.
   *
   */
  @JSProperty("offsetMin")
  void setOffsetMin(double value);

  /**
   * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
   * default zooming in/out will deselect buttons and unset dataGrouping.
   * Enable this option to keep buttons selected when extremes change.
   *
   */
  @JSProperty("preserveDataGrouping")
  boolean getPreserveDataGrouping();

  /**
   * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
   * default zooming in/out will deselect buttons and unset dataGrouping.
   * Enable this option to keep buttons selected when extremes change.
   *
   */
  @JSProperty("preserveDataGrouping")
  void setPreserveDataGrouping(boolean value);

  /**
   * (Highstock, Gantt) The text for the button itself.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highstock, Gantt) The text for the button itself.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highstock, Gantt) Defined the time span for the button. Can be one of
   * <code>millisecond</code>, <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>,
   * <code>year</code>, <code>ytd</code>, and <code>all</code>.
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highstock, Gantt) Defined the time span for the button. Can be one of
   * <code>millisecond</code>, <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>,
   * <code>year</code>, <code>ytd</code>, and <code>all</code>.
   *
   */
  @JSProperty("type")
  void setType(@Nullable Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type ALL = JsEnum.of("all");

    public static final Type DAY = JsEnum.of("day");

    public static final Type HOUR = JsEnum.of("hour");

    public static final Type MILLISECOND = JsEnum.of("millisecond");

    public static final Type MINUTE = JsEnum.of("minute");

    public static final Type MONTH = JsEnum.of("month");

    public static final Type SECOND = JsEnum.of("second");

    public static final Type WEEK = JsEnum.of("week");

    public static final Type YEAR = JsEnum.of("year");

    public static final Type YTD = JsEnum.of("ytd");
  }

  final class Builder {
    private final RangeSelectorButtonsOptions object = Any.empty();

    private Builder() {
    }

    public RangeSelectorButtonsOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) How many units of the defined type the button should
     * span. If <code>type</code> is &quot;month&quot; and <code>count</code> is 3, the button spans three
     * months.
     *
     */
    public Builder count(double value) {
      object.setCount(value);
      return this;
    }

    /**
     * (Highstock) A custom data grouping object for each button.
     *
     */
    public Builder dataGrouping(@Nullable DataGroupingOptionsObject value) {
      object.setDataGrouping(value);
      return this;
    }

    public Builder events(@Nullable RangeSelectorButtonsEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
     * the calculated time span.
     *
     */
    public Builder offsetMax(double value) {
      object.setOffsetMax(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Additional range (in milliseconds) added to the start
     * of the calculated time span.
     *
     */
    public Builder offsetMin(double value) {
      object.setOffsetMin(value);
      return this;
    }

    /**
     * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
     * default zooming in/out will deselect buttons and unset dataGrouping.
     * Enable this option to keep buttons selected when extremes change.
     *
     */
    public Builder preserveDataGrouping(boolean value) {
      object.setPreserveDataGrouping(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The text for the button itself.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Defined the time span for the button. Can be one of
     * <code>millisecond</code>, <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>,
     * <code>year</code>, <code>ytd</code>, and <code>all</code>.
     *
     */
    public Builder type(@Nullable Type value) {
      object.setType(value);
      return this;
    }
  }
}
