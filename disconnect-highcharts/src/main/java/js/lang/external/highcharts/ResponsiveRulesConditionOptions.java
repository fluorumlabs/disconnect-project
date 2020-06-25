package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
 * applies.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ResponsiveRulesConditionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
   * complete control on when the responsive rule applies. Return <code>true</code> if it
   * applies. This opens for checking against other metrics than the chart
   * size, for example the document size or other elements.
   *
   */
  @JSProperty("callback")
  @Nullable
  ResponsiveCallbackFunction getCallback();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
   * complete control on when the responsive rule applies. Return <code>true</code> if it
   * applies. This opens for checking against other metrics than the chart
   * size, for example the document size or other elements.
   *
   */
  @JSProperty("callback")
  void setCallback(@Nullable ResponsiveCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart height is less than this.
   *
   */
  @JSProperty("maxHeight")
  double getMaxHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart height is less than this.
   *
   */
  @JSProperty("maxHeight")
  void setMaxHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart width is less than this.
   *
   */
  @JSProperty("maxWidth")
  double getMaxWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart width is less than this.
   *
   */
  @JSProperty("maxWidth")
  void setMaxWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart height is greater than this.
   *
   */
  @JSProperty("minHeight")
  double getMinHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart height is greater than this.
   *
   */
  @JSProperty("minHeight")
  void setMinHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart width is greater than this.
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
   * the chart width is greater than this.
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);

  class Builder {
    private final ResponsiveRulesConditionOptions object = Any.empty();

    public ResponsiveRulesConditionOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
     * complete control on when the responsive rule applies. Return <code>true</code> if it
     * applies. This opens for checking against other metrics than the chart
     * size, for example the document size or other elements.
     *
     */
    public Builder callback(@Nullable ResponsiveCallbackFunction value) {
      object.setCallback(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart height is less than this.
     *
     */
    public Builder maxHeight(double value) {
      object.setMaxHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart width is less than this.
     *
     */
    public Builder maxWidth(double value) {
      object.setMaxWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart height is greater than this.
     *
     */
    public Builder minHeight(double value) {
      object.setMinHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart width is greater than this.
     *
     */
    public Builder minWidth(double value) {
      object.setMinWidth(value);
      return this;
    }
  }
}
