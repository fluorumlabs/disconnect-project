package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( NavigatorSeriesOptions | SeriesOptionsType | Array < NavigatorSeriesOptions > | Array < SeriesOptionsType > ) */;
import js.lang.Unknown /* ( NavigatorXAxisOptions | Array < NavigatorXAxisOptions > ) */;
import js.lang.Unknown /* ( NavigatorYAxisOptions | Array < NavigatorYAxisOptions > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) The navigator is a small series below the main series,
 * displaying a view of the entire data set. It provides tools to zoom in and
 * out on parts of the data as well as panning across the dataset.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorOptions extends Any {
  /**
   * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
   * updated data in the base X axis. When loading data async, as in the demo
   * below, this should be <code>false</code>. Otherwise new data will trigger navigator
   * redraw, which will cause unwanted looping. In the demo below, the data in
   * the navigator is set only once. On navigating, only the main chart
   * content is updated.
   *
   */
  @JSProperty("adaptToUpdatedData")
  boolean getAdaptToUpdatedData();

  /**
   * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
   * updated data in the base X axis. When loading data async, as in the demo
   * below, this should be <code>false</code>. Otherwise new data will trigger navigator
   * redraw, which will cause unwanted looping. In the demo below, the data in
   * the navigator is set only once. On navigating, only the main chart
   * content is updated.
   *
   */
  @JSProperty("adaptToUpdatedData")
  void setAdaptToUpdatedData(boolean value);

  /**
   * (Highstock, Gantt) Enable or disable the navigator.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock, Gantt) Enable or disable the navigator.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
   *
   */
  @JSProperty("handles")
  @Nullable
  NavigatorHandlesOptions getHandles();

  /**
   * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
   *
   */
  @JSProperty("handles")
  void setHandles(@Nullable NavigatorHandlesOptions value);

  /**
   * (Highstock, Gantt) The height of the navigator.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock, Gantt) The height of the navigator.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock, Gantt) The distance from the nearest element, the X axis or X
   * axis labels.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highstock, Gantt) The distance from the nearest element, the X axis or X
   * axis labels.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highstock, Gantt) The color of the mask covering the areas of the
   * navigator series that are currently not visible in the main series. The
   * default color is bluish with an opacity of 0.3 to see the series below.
   *
   */
  @JSProperty("maskFill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getMaskFill();

  /**
   * (Highstock, Gantt) The color of the mask covering the areas of the
   * navigator series that are currently not visible in the main series. The
   * default color is bluish with an opacity of 0.3 to see the series below.
   *
   */
  @JSProperty("maskFill")
  void setMaskFill(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the mask covering the areas of the
   * navigator series that are currently not visible in the main series. The
   * default color is bluish with an opacity of 0.3 to see the series below.
   *
   */
  @JSProperty("maskFill")
  void setMaskFill(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the mask covering the areas of the
   * navigator series that are currently not visible in the main series. The
   * default color is bluish with an opacity of 0.3 to see the series below.
   *
   */
  @JSProperty("maskFill")
  void setMaskFill(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) Whether the mask should be inside the range marking
   * the zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
   *
   */
  @JSProperty("maskInside")
  boolean getMaskInside();

  /**
   * (Highstock, Gantt) Whether the mask should be inside the range marking
   * the zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
   *
   */
  @JSProperty("maskInside")
  void setMaskInside(boolean value);

  /**
   * (Highstock, Gantt) When the chart is inverted, whether to draw the
   * navigator on the opposite side.
   *
   */
  @JSProperty("opposite")
  boolean getOpposite();

  /**
   * (Highstock, Gantt) When the chart is inverted, whether to draw the
   * navigator on the opposite side.
   *
   */
  @JSProperty("opposite")
  void setOpposite(boolean value);

  /**
   * (Highstock, Gantt) The color of the line marking the currently zoomed
   * area in the navigator.
   *
   */
  @JSProperty("outlineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getOutlineColor();

  /**
   * (Highstock, Gantt) The color of the line marking the currently zoomed
   * area in the navigator.
   *
   */
  @JSProperty("outlineColor")
  void setOutlineColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the line marking the currently zoomed
   * area in the navigator.
   *
   */
  @JSProperty("outlineColor")
  void setOutlineColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the line marking the currently zoomed
   * area in the navigator.
   *
   */
  @JSProperty("outlineColor")
  void setOutlineColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The width of the line marking the currently zoomed
   * area in the navigator.
   *
   */
  @JSProperty("outlineWidth")
  double getOutlineWidth();

  /**
   * (Highstock, Gantt) The width of the line marking the currently zoomed
   * area in the navigator.
   *
   */
  @JSProperty("outlineWidth")
  void setOutlineWidth(double value);

  /**
   * (Highstock, Gantt) Options for the navigator series. Available options
   * are the same as any series, documented at plotOptions and series.
   *
   * Unless data is explicitly defined on navigator.series, the data is
   * borrowed from the first series in the chart.
   *
   * Default series options for the navigator series are: (see online
   * documentation for example)
   *
   */
  @JSProperty("series")
  @Nullable
  Unknown /* ( NavigatorSeriesOptions | SeriesOptionsType | Array < NavigatorSeriesOptions > | Array < SeriesOptionsType > ) */ getSeries(
      );

  /**
   * (Highstock, Gantt) Options for the navigator series. Available options
   * are the same as any series, documented at plotOptions and series.
   *
   * Unless data is explicitly defined on navigator.series, the data is
   * borrowed from the first series in the chart.
   *
   * Default series options for the navigator series are: (see online
   * documentation for example)
   *
   */
  @JSProperty("series")
  void setSeries(@Nullable NavigatorSeriesOptions value);

  /**
   * (Highstock, Gantt) Options for the navigator series. Available options
   * are the same as any series, documented at plotOptions and series.
   *
   * Unless data is explicitly defined on navigator.series, the data is
   * borrowed from the first series in the chart.
   *
   * Default series options for the navigator series are: (see online
   * documentation for example)
   *
   */
  @JSProperty("series")
  void setSeries(NavigatorSeriesOptions... value);

  /**
   * (Highstock, Gantt) Options for the navigator series. Available options
   * are the same as any series, documented at plotOptions and series.
   *
   * Unless data is explicitly defined on navigator.series, the data is
   * borrowed from the first series in the chart.
   *
   * Default series options for the navigator series are: (see online
   * documentation for example)
   *
   */
  @JSProperty("series")
  void setSeries(SeriesOptionsRegistry... value);

  /**
   * (Highstock, Gantt) Options for the navigator X axis. Default series
   * options for the navigator xAxis are: (see online documentation for
   * example)
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown /* ( NavigatorXAxisOptions | Array < NavigatorXAxisOptions > ) */ getXAxis();

  /**
   * (Highstock, Gantt) Options for the navigator X axis. Default series
   * options for the navigator xAxis are: (see online documentation for
   * example)
   *
   */
  @JSProperty("xAxis")
  void setXAxis(@Nullable NavigatorXAxisOptions value);

  /**
   * (Highstock, Gantt) Options for the navigator X axis. Default series
   * options for the navigator xAxis are: (see online documentation for
   * example)
   *
   */
  @JSProperty("xAxis")
  void setXAxis(NavigatorXAxisOptions... value);

  /**
   * (Highstock, Gantt) Options for the navigator Y axis. Default series
   * options for the navigator yAxis are: (see online documentation for
   * example)
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown /* ( NavigatorYAxisOptions | Array < NavigatorYAxisOptions > ) */ getYAxis();

  /**
   * (Highstock, Gantt) Options for the navigator Y axis. Default series
   * options for the navigator yAxis are: (see online documentation for
   * example)
   *
   */
  @JSProperty("yAxis")
  void setYAxis(@Nullable NavigatorYAxisOptions value);

  /**
   * (Highstock, Gantt) Options for the navigator Y axis. Default series
   * options for the navigator yAxis are: (see online documentation for
   * example)
   *
   */
  @JSProperty("yAxis")
  void setYAxis(NavigatorYAxisOptions... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigatorOptions object = Any.empty();

    private Builder() {
    }

    public NavigatorOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
     * updated data in the base X axis. When loading data async, as in the demo
     * below, this should be <code>false</code>. Otherwise new data will trigger navigator
     * redraw, which will cause unwanted looping. In the demo below, the data in
     * the navigator is set only once. On navigating, only the main chart
     * content is updated.
     *
     */
    public Builder adaptToUpdatedData(boolean value) {
      object.setAdaptToUpdatedData(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Enable or disable the navigator.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
     *
     */
    public Builder handles(@Nullable NavigatorHandlesOptions value) {
      object.setHandles(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The height of the navigator.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The distance from the nearest element, the X axis or X
     * axis labels.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the mask covering the areas of the
     * navigator series that are currently not visible in the main series. The
     * default color is bluish with an opacity of 0.3 to see the series below.
     *
     */
    public Builder maskFill(@Nullable PatternObject value) {
      object.setMaskFill(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the mask covering the areas of the
     * navigator series that are currently not visible in the main series. The
     * default color is bluish with an opacity of 0.3 to see the series below.
     *
     */
    public Builder maskFill(@Nullable String value) {
      object.setMaskFill(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the mask covering the areas of the
     * navigator series that are currently not visible in the main series. The
     * default color is bluish with an opacity of 0.3 to see the series below.
     *
     */
    public Builder maskFill(@Nullable GradientColorObject value) {
      object.setMaskFill(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Whether the mask should be inside the range marking
     * the zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
     *
     */
    public Builder maskInside(boolean value) {
      object.setMaskInside(value);
      return this;
    }

    /**
     * (Highstock, Gantt) When the chart is inverted, whether to draw the
     * navigator on the opposite side.
     *
     */
    public Builder opposite(boolean value) {
      object.setOpposite(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the line marking the currently zoomed
     * area in the navigator.
     *
     */
    public Builder outlineColor(@Nullable PatternObject value) {
      object.setOutlineColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the line marking the currently zoomed
     * area in the navigator.
     *
     */
    public Builder outlineColor(@Nullable String value) {
      object.setOutlineColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the line marking the currently zoomed
     * area in the navigator.
     *
     */
    public Builder outlineColor(@Nullable GradientColorObject value) {
      object.setOutlineColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The width of the line marking the currently zoomed
     * area in the navigator.
     *
     */
    public Builder outlineWidth(double value) {
      object.setOutlineWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator series. Available options
     * are the same as any series, documented at plotOptions and series.
     *
     * Unless data is explicitly defined on navigator.series, the data is
     * borrowed from the first series in the chart.
     *
     * Default series options for the navigator series are: (see online
     * documentation for example)
     *
     */
    public Builder series(@Nullable NavigatorSeriesOptions value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator series. Available options
     * are the same as any series, documented at plotOptions and series.
     *
     * Unless data is explicitly defined on navigator.series, the data is
     * borrowed from the first series in the chart.
     *
     * Default series options for the navigator series are: (see online
     * documentation for example)
     *
     */
    public Builder series(NavigatorSeriesOptions... value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator series. Available options
     * are the same as any series, documented at plotOptions and series.
     *
     * Unless data is explicitly defined on navigator.series, the data is
     * borrowed from the first series in the chart.
     *
     * Default series options for the navigator series are: (see online
     * documentation for example)
     *
     */
    public Builder series(SeriesOptionsRegistry... value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator X axis. Default series
     * options for the navigator xAxis are: (see online documentation for
     * example)
     *
     */
    public Builder xAxis(@Nullable NavigatorXAxisOptions value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator X axis. Default series
     * options for the navigator xAxis are: (see online documentation for
     * example)
     *
     */
    public Builder xAxis(NavigatorXAxisOptions... value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator Y axis. Default series
     * options for the navigator yAxis are: (see online documentation for
     * example)
     *
     */
    public Builder yAxis(@Nullable NavigatorYAxisOptions value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Options for the navigator Y axis. Default series
     * options for the navigator yAxis are: (see online documentation for
     * example)
     *
     */
    public Builder yAxis(NavigatorYAxisOptions... value) {
      object.setYAxis(value);
      return this;
    }
  }
}
