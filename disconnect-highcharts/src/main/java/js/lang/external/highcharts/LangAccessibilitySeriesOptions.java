package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
 * series types. For more dynamic control over the series element descriptions,
 * see accessibility.seriesDescriptionFormatter.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilitySeriesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
   * This is added in the point comment description by default if present.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
   * This is added in the point comment description by default if present.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Description for the value of
   * null points.
   *
   */
  @JSProperty("nullPointValue")
  @Nullable
  String getNullPointValue();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Description for the value of
   * null points.
   *
   */
  @JSProperty("nullPointValue")
  void setNullPointValue(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Description for annotations on a
   * point, as it is made available to assistive technology.
   *
   */
  @JSProperty("pointAnnotationsDescription")
  @Nullable
  String getPointAnnotationsDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Description for annotations on a
   * point, as it is made available to assistive technology.
   *
   */
  @JSProperty("pointAnnotationsDescription")
  void setPointAnnotationsDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
   * series main summary. Each series type has two modes:
   *
   * <ol>
   * <li>
   * This series type is the only series type used in the chart
   *
   * </li>
   * <li>
   * This is a combination chart with multiple series types
   *
   * </li>
   * </ol>
   * If a definition does not exist for the specific series type and mode, the
   * 'default' lang definitions are used.
   *
   */
  @JSProperty("summary")
  @Nullable
  LangAccessibilitySeriesSummaryOptions getSummary();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
   * series main summary. Each series type has two modes:
   *
   * <ol>
   * <li>
   * This series type is the only series type used in the chart
   *
   * </li>
   * <li>
   * This is a combination chart with multiple series types
   *
   * </li>
   * </ol>
   * If a definition does not exist for the specific series type and mode, the
   * 'default' lang definitions are used.
   *
   */
  @JSProperty("summary")
  void setSummary(@Nullable LangAccessibilitySeriesSummaryOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
   * there are multiple xAxes in the chart.
   *
   */
  @JSProperty("xAxisDescription")
  @Nullable
  String getXAxisDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
   * there are multiple xAxes in the chart.
   *
   */
  @JSProperty("xAxisDescription")
  void setXAxisDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
   * there are multiple yAxes in the chart.
   *
   */
  @JSProperty("yAxisDescription")
  @Nullable
  String getYAxisDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
   * there are multiple yAxes in the chart.
   *
   */
  @JSProperty("yAxisDescription")
  void setYAxisDescription(@Nullable String value);

  class Builder {
    private final LangAccessibilitySeriesOptions object = Any.empty();

    public LangAccessibilitySeriesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
     * This is added in the point comment description by default if present.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Description for the value of
     * null points.
     *
     */
    public Builder nullPointValue(@Nullable String value) {
      object.setNullPointValue(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Description for annotations on a
     * point, as it is made available to assistive technology.
     *
     */
    public Builder pointAnnotationsDescription(@Nullable String value) {
      object.setPointAnnotationsDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
     * series main summary. Each series type has two modes:
     *
     * <ol>
     * <li>
     * This series type is the only series type used in the chart
     *
     * </li>
     * <li>
     * This is a combination chart with multiple series types
     *
     * </li>
     * </ol>
     * If a definition does not exist for the specific series type and mode, the
     * 'default' lang definitions are used.
     *
     */
    public Builder summary(@Nullable LangAccessibilitySeriesSummaryOptions value) {
      object.setSummary(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
     * there are multiple xAxes in the chart.
     *
     */
    public Builder xAxisDescription(@Nullable String value) {
      object.setXAxisDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
     * there are multiple yAxes in the chart.
     *
     */
    public Builder yAxisDescription(@Nullable String value) {
      object.setYAxisDescription(value);
      return this;
    }
  }
}
