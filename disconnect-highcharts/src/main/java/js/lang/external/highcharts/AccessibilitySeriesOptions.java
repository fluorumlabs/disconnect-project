package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | number ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to all
 * data series. Individual series can also have specific accessibility options
 * set.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AccessibilitySeriesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
   * descriptions to charts with a single series.
   *
   */
  @JSProperty("describeSingleSeries")
  boolean getDescribeSingleSeries();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
   * descriptions to charts with a single series.
   *
   */
  @JSProperty("describeSingleSeries")
  void setDescribeSingleSeries(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
   * instead of the default for series descriptions. Receives one argument,
   * <code>series</code>, referring to the series to describe. Should return a string
   * with the description of the series for a screen reader user. If <code>false</code>
   * is returned, the default formatter will be used for that series.
   *
   */
  @JSProperty("descriptionFormatter")
  @Nullable
  ScreenReaderFormatterCallbackFunction<Series> getDescriptionFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
   * instead of the default for series descriptions. Receives one argument,
   * <code>series</code>, referring to the series to describe. Should return a string
   * with the description of the series for a screen reader user. If <code>false</code>
   * is returned, the default formatter will be used for that series.
   *
   */
  @JSProperty("descriptionFormatter")
  void setDescriptionFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Series> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
   * points than this, we no longer expose information about individual points
   * to screen readers.
   *
   * Set to <code>false</code> to disable.
   *
   */
  @JSProperty("pointDescriptionEnabledThreshold")
  @Nullable
  Unknown /* ( boolean | number ) */ getPointDescriptionEnabledThreshold();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
   * points than this, we no longer expose information about individual points
   * to screen readers.
   *
   * Set to <code>false</code> to disable.
   *
   */
  @JSProperty("pointDescriptionEnabledThreshold")
  void setPointDescriptionEnabledThreshold(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
   * points than this, we no longer expose information about individual points
   * to screen readers.
   *
   * Set to <code>false</code> to disable.
   *
   */
  @JSProperty("pointDescriptionEnabledThreshold")
  void setPointDescriptionEnabledThreshold(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AccessibilitySeriesOptions object = Any.empty();

    private Builder() {
    }

    public AccessibilitySeriesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
     * descriptions to charts with a single series.
     *
     */
    public Builder describeSingleSeries(boolean value) {
      object.setDescribeSingleSeries(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
     * instead of the default for series descriptions. Receives one argument,
     * <code>series</code>, referring to the series to describe. Should return a string
     * with the description of the series for a screen reader user. If <code>false</code>
     * is returned, the default formatter will be used for that series.
     *
     */
    public Builder descriptionFormatter(
        @Nullable ScreenReaderFormatterCallbackFunction<Series> value) {
      object.setDescriptionFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
     * points than this, we no longer expose information about individual points
     * to screen readers.
     *
     * Set to <code>false</code> to disable.
     *
     */
    public Builder pointDescriptionEnabledThreshold(boolean value) {
      object.setPointDescriptionEnabledThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
     * points than this, we no longer expose information about individual points
     * to screen readers.
     *
     * Set to <code>false</code> to disable.
     *
     */
    public Builder pointDescriptionEnabledThreshold(double value) {
      object.setPointDescriptionEnabledThreshold(value);
      return this;
    }
  }
}
