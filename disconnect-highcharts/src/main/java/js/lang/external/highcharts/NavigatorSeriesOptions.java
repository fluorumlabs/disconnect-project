package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( NavigatorSeriesDataLabelsOptions | Array < NavigatorSeriesDataLabelsOptions > ) */;
import js.lang.Unknown /* Array < ( number | Array < ( number | string | null ) > | object | null ) > */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) Options for the navigator series. Available options are
 * the same as any series, documented at plotOptions and series.
 *
 * Unless data is explicitly defined on navigator.series, the data is borrowed
 * from the first series in the chart.
 *
 * Default series options for the navigator series are: (see online
 * documentation for example)
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorSeriesOptions extends Any {
  @JSProperty("className")
  @Nullable
  String getClassName();

  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highstock, Gantt) Sets the fill color of the navigator series.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highstock, Gantt) Sets the fill color of the navigator series.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) Sets the fill color of the navigator series.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highstock, Gantt) Sets the fill color of the navigator series.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) Unless data is explicitly defined, the data is borrowed from
   * the first series in the chart.
   *
   */
  @JSProperty("data")
  @Nullable
  Unknown /* Array < ( number | Array < ( number | string | null ) > | object | null ) > */ getData(
      );

  /**
   * (Highstock) Unless data is explicitly defined, the data is borrowed from
   * the first series in the chart.
   *
   */
  @JSProperty("data")
  void setData(double[] value);

  /**
   * (Highstock) Unless data is explicitly defined, the data is borrowed from
   * the first series in the chart.
   *
   */
  @JSProperty("data")
  void setData(Any[] value);

  /**
   * (Highstock) Unless data is explicitly defined, the data is borrowed from
   * the first series in the chart.
   *
   */
  @JSProperty("data")
  void setData(String[] value);

  /**
   * (Highstock) Data grouping options for the navigator series.
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  DataGroupingOptionsObject getDataGrouping();

  /**
   * (Highstock) Data grouping options for the navigator series.
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(@Nullable DataGroupingOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
   * navigator series. Data labels are disabled by default on the navigator
   * series.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( NavigatorSeriesDataLabelsOptions | Array < NavigatorSeriesDataLabelsOptions > ) */ getDataLabels(
      );

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
   * navigator series. Data labels are disabled by default on the navigator
   * series.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable NavigatorSeriesDataLabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
   * navigator series. Data labels are disabled by default on the navigator
   * series.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(NavigatorSeriesDataLabelsOptions[] value);

  /**
   * (Highstock, Gantt) The fill opacity of the navigator series.
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highstock, Gantt) The fill opacity of the navigator series.
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  @JSProperty("id")
  @Nullable
  String getId();

  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highstock, Gantt) Line color for the navigator series. Allows setting
   * the color while disallowing the default candlestick setting.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock, Gantt) Line color for the navigator series. Allows setting
   * the color while disallowing the default candlestick setting.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The pixel line width of the navigator series.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock, Gantt) The pixel line width of the navigator series.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  @JSProperty("marker")
  @Nullable
  NavigatorSeriesMarkerOptions getMarker();

  @JSProperty("marker")
  void setMarker(@Nullable NavigatorSeriesMarkerOptions value);

  /**
   * (Highstock) Since Highstock v8, default value is the same as default
   * <code>pointRange</code> defined for a specific type (e.g. <code>null</code> for column type).
   *
   * In Highstock version &lt; 8, defaults to 0.
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

  /**
   * (Highstock) Since Highstock v8, default value is the same as default
   * <code>pointRange</code> defined for a specific type (e.g. <code>null</code> for column type).
   *
   * In Highstock version &lt; 8, defaults to 0.
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
   * default navigator area series draw its area from the 0 value and up.
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
   * default navigator area series draw its area from the 0 value and up.
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  class Builder {
    private final NavigatorSeriesOptions object = Any.empty();

    public NavigatorSeriesOptions build() {
      return object;
    }

    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Sets the fill color of the navigator series.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Sets the fill color of the navigator series.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Sets the fill color of the navigator series.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock) Unless data is explicitly defined, the data is borrowed from
     * the first series in the chart.
     *
     */
    public Builder data(double[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highstock) Unless data is explicitly defined, the data is borrowed from
     * the first series in the chart.
     *
     */
    public Builder data(Any[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highstock) Unless data is explicitly defined, the data is borrowed from
     * the first series in the chart.
     *
     */
    public Builder data(String[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highstock) Data grouping options for the navigator series.
     *
     */
    public Builder dataGrouping(@Nullable DataGroupingOptionsObject value) {
      object.setDataGrouping(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
     * navigator series. Data labels are disabled by default on the navigator
     * series.
     *
     */
    public Builder dataLabels(@Nullable NavigatorSeriesDataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
     * navigator series. Data labels are disabled by default on the navigator
     * series.
     *
     */
    public Builder dataLabels(NavigatorSeriesDataLabelsOptions[] value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The fill opacity of the navigator series.
     *
     */
    public Builder fillOpacity(double value) {
      object.setFillOpacity(value);
      return this;
    }

    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Line color for the navigator series. Allows setting
     * the color while disallowing the default candlestick setting.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The pixel line width of the navigator series.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    public Builder marker(@Nullable NavigatorSeriesMarkerOptions value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highstock) Since Highstock v8, default value is the same as default
     * <code>pointRange</code> defined for a specific type (e.g. <code>null</code> for column type).
     *
     * In Highstock version &lt; 8, defaults to 0.
     *
     */
    public Builder pointRange(double value) {
      object.setPointRange(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
     * default navigator area series draw its area from the 0 value and up.
     *
     */
    public Builder threshold(double value) {
      object.setThreshold(value);
      return this;
    }
  }
}
