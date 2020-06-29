package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the screen
 * reader information sections added before and after the chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AccessibilityScreenReaderSectionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
   * information region after the chart. Analogous to beforeChartFormat.
   *
   */
  @JSProperty("afterChartFormat")
  @Nullable
  String getAfterChartFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
   * information region after the chart. Analogous to beforeChartFormat.
   *
   */
  @JSProperty("afterChartFormat")
  void setAfterChartFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
   * the HTML contents of the hidden screen reader information region after
   * the chart. Analogous to beforeChartFormatter.
   *
   */
  @JSProperty("afterChartFormatter")
  @Nullable
  ScreenReaderFormatterCallbackFunction<Chart> getAfterChartFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
   * the HTML contents of the hidden screen reader information region after
   * the chart. Analogous to beforeChartFormatter.
   *
   */
  @JSProperty("afterChartFormatter")
  void setAfterChartFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Chart> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
   * range of datetime axes.
   *
   * For an overview of the replacement codes, see dateFormat.
   *
   */
  @JSProperty("axisRangeDateFormat")
  @Nullable
  String getAxisRangeDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
   * range of datetime axes.
   *
   * For an overview of the replacement codes, see dateFormat.
   *
   */
  @JSProperty("axisRangeDateFormat")
  void setAxisRangeDateFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
   * information region before the chart. Supported HTML tags are <code>&lt;h1-7&gt;</code>,
   * <code>&lt;p&gt;</code>, <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, <code>&lt;ul&gt;</code>, <code>&lt;ol&gt;</code>, <code>&lt;li&gt;</code>, and <code>&lt;button&gt;</code>. Attributes
   * are not supported, except for id on <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, and <code>&lt;button&gt;</code>. Id is
   * required on <code>&lt;a&gt;</code> and <code>&lt;button&gt;</code> in the format <code>&lt;tag id=&quot;abcd&quot;&gt;</code>.
   * Numbers, lower- and uppercase letters, &quot;-&quot; and &quot;#&quot; are valid characters
   * in IDs.
   *
   */
  @JSProperty("beforeChartFormat")
  @Nullable
  String getBeforeChartFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
   * information region before the chart. Supported HTML tags are <code>&lt;h1-7&gt;</code>,
   * <code>&lt;p&gt;</code>, <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, <code>&lt;ul&gt;</code>, <code>&lt;ol&gt;</code>, <code>&lt;li&gt;</code>, and <code>&lt;button&gt;</code>. Attributes
   * are not supported, except for id on <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, and <code>&lt;button&gt;</code>. Id is
   * required on <code>&lt;a&gt;</code> and <code>&lt;button&gt;</code> in the format <code>&lt;tag id=&quot;abcd&quot;&gt;</code>.
   * Numbers, lower- and uppercase letters, &quot;-&quot; and &quot;#&quot; are valid characters
   * in IDs.
   *
   */
  @JSProperty("beforeChartFormat")
  void setBeforeChartFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
   * the HTML contents of the hidden screen reader information region before
   * the chart. Receives one argument, <code>chart</code>, referring to the chart object.
   * Should return a string with the HTML content of the region. By default
   * this returns an automatic description of the chart based on
   * beforeChartFormat.
   *
   */
  @JSProperty("beforeChartFormatter")
  @Nullable
  ScreenReaderFormatterCallbackFunction<Chart> getBeforeChartFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
   * the HTML contents of the hidden screen reader information region before
   * the chart. Receives one argument, <code>chart</code>, referring to the chart object.
   * Should return a string with the HTML content of the region. By default
   * this returns an automatic description of the chart based on
   * beforeChartFormat.
   *
   */
  @JSProperty("beforeChartFormatter")
  void setBeforeChartFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Chart> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
   * the &quot;Play as sound&quot; button in the screen reader region.
   *
   * By default Highcharts will call the <code>chart.sonify</code> function.
   *
   */
  @JSProperty("onPlayAsSoundClick")
  @Nullable
  ScreenReaderClickCallbackFunction getOnPlayAsSoundClick();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
   * the &quot;Play as sound&quot; button in the screen reader region.
   *
   * By default Highcharts will call the <code>chart.sonify</code> function.
   *
   */
  @JSProperty("onPlayAsSoundClick")
  void setOnPlayAsSoundClick(@Nullable ScreenReaderClickCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
   * the &quot;View as Data Table&quot; link in the screen reader region.
   *
   * By default Highcharts will insert and set focus to a data table
   * representation of the chart.
   *
   */
  @JSProperty("onViewDataTableClick")
  @Nullable
  ScreenReaderClickCallbackFunction getOnViewDataTableClick();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
   * the &quot;View as Data Table&quot; link in the screen reader region.
   *
   * By default Highcharts will insert and set focus to a data table
   * representation of the chart.
   *
   */
  @JSProperty("onViewDataTableClick")
  void setOnViewDataTableClick(@Nullable ScreenReaderClickCallbackFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AccessibilityScreenReaderSectionOptions object = Any.empty();

    private Builder() {
    }

    public AccessibilityScreenReaderSectionOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
     * information region after the chart. Analogous to beforeChartFormat.
     *
     */
    public Builder afterChartFormat(@Nullable String value) {
      object.setAfterChartFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
     * the HTML contents of the hidden screen reader information region after
     * the chart. Analogous to beforeChartFormatter.
     *
     */
    public Builder afterChartFormatter(
        @Nullable ScreenReaderFormatterCallbackFunction<Chart> value) {
      object.setAfterChartFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
     * range of datetime axes.
     *
     * For an overview of the replacement codes, see dateFormat.
     *
     */
    public Builder axisRangeDateFormat(@Nullable String value) {
      object.setAxisRangeDateFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
     * information region before the chart. Supported HTML tags are <code>&lt;h1-7&gt;</code>,
     * <code>&lt;p&gt;</code>, <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, <code>&lt;ul&gt;</code>, <code>&lt;ol&gt;</code>, <code>&lt;li&gt;</code>, and <code>&lt;button&gt;</code>. Attributes
     * are not supported, except for id on <code>&lt;div&gt;</code>, <code>&lt;a&gt;</code>, and <code>&lt;button&gt;</code>. Id is
     * required on <code>&lt;a&gt;</code> and <code>&lt;button&gt;</code> in the format <code>&lt;tag id=&quot;abcd&quot;&gt;</code>.
     * Numbers, lower- and uppercase letters, &quot;-&quot; and &quot;#&quot; are valid characters
     * in IDs.
     *
     */
    public Builder beforeChartFormat(@Nullable String value) {
      object.setBeforeChartFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
     * the HTML contents of the hidden screen reader information region before
     * the chart. Receives one argument, <code>chart</code>, referring to the chart object.
     * Should return a string with the HTML content of the region. By default
     * this returns an automatic description of the chart based on
     * beforeChartFormat.
     *
     */
    public Builder beforeChartFormatter(
        @Nullable ScreenReaderFormatterCallbackFunction<Chart> value) {
      object.setBeforeChartFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
     * the &quot;Play as sound&quot; button in the screen reader region.
     *
     * By default Highcharts will call the <code>chart.sonify</code> function.
     *
     */
    public Builder onPlayAsSoundClick(@Nullable ScreenReaderClickCallbackFunction value) {
      object.setOnPlayAsSoundClick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
     * the &quot;View as Data Table&quot; link in the screen reader region.
     *
     * By default Highcharts will insert and set focus to a data table
     * representation of the chart.
     *
     */
    public Builder onViewDataTableClick(@Nullable ScreenReaderClickCallbackFunction value) {
      object.setOnViewDataTableClick(value);
      return this;
    }
  }
}
