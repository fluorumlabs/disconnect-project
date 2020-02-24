package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The navigator is a small series below the main series, displaying
 * a view of the entire data set. It provides tools to zoom in and out on parts
 * of the data as well as panning across the dataset.
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator">https://api.highcharts.com/highstock/navigator</a>
 *
 */
public interface NavigatorOptions extends Any {
  /**
   * (Highstock) Whether the navigator and scrollbar should adapt to updated
   * data in the base X axis. When loading data async, as in the demo below,
   * this should be <code>false</code>. Otherwise new data will trigger navigator redraw,
   * which will cause unwanted looping. In the demo below, the data in the
   * navigator is set only once. On navigating, only the main chart content is
   * updated.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.adaptToUpdatedData">https://api.highcharts.com/highstock/navigator.adaptToUpdatedData</a>
   *
   * @implspec adaptToUpdatedData?: boolean;
   *
   */
  @JSProperty("adaptToUpdatedData")
  boolean getAdaptToUpdatedData();

  /**
   * (Highstock) Whether the navigator and scrollbar should adapt to updated
   * data in the base X axis. When loading data async, as in the demo below,
   * this should be <code>false</code>. Otherwise new data will trigger navigator redraw,
   * which will cause unwanted looping. In the demo below, the data in the
   * navigator is set only once. On navigating, only the main chart content is
   * updated.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.adaptToUpdatedData">https://api.highcharts.com/highstock/navigator.adaptToUpdatedData</a>
   *
   * @implspec adaptToUpdatedData?: boolean;
   *
   */
  @JSProperty("adaptToUpdatedData")
  void setAdaptToUpdatedData(boolean value);

  /**
   * (Highstock) An integer identifying the index to use for the base series,
   * or a string representing the id of the series.
   *
   * <strong>Note</strong>: As of Highcharts 5.0, this is now a deprecated option. Prefer
   * series.showInNavigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.baseSeries">https://api.highcharts.com/highstock/navigator.baseSeries</a>
   *
   * @implspec baseSeries?: any;
   *
   */
  @JSProperty("baseSeries")
  @Nullable
  Any getBaseSeries();

  /**
   * (Highstock) An integer identifying the index to use for the base series,
   * or a string representing the id of the series.
   *
   * <strong>Note</strong>: As of Highcharts 5.0, this is now a deprecated option. Prefer
   * series.showInNavigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.baseSeries">https://api.highcharts.com/highstock/navigator.baseSeries</a>
   *
   * @implspec baseSeries?: any;
   *
   */
  @JSProperty("baseSeries")
  void setBaseSeries(Any value);

  /**
   * (Highstock) Enable or disable the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.enabled">https://api.highcharts.com/highstock/navigator.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.enabled">https://api.highcharts.com/highstock/navigator.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Options for the handles for dragging the zoomed area.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles">https://api.highcharts.com/highstock/navigator.handles</a>
   *
   * @implspec handles?: NavigatorHandlesOptions;
   *
   */
  @JSProperty("handles")
  @Nullable
  NavigatorHandlesOptions getHandles();

  /**
   * (Highstock) Options for the handles for dragging the zoomed area.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles">https://api.highcharts.com/highstock/navigator.handles</a>
   *
   * @implspec handles?: NavigatorHandlesOptions;
   *
   */
  @JSProperty("handles")
  void setHandles(NavigatorHandlesOptions value);

  /**
   * (Highstock) The height of the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.height">https://api.highcharts.com/highstock/navigator.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) The height of the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.height">https://api.highcharts.com/highstock/navigator.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) The distance from the nearest element, the X axis or X axis
   * labels.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.margin">https://api.highcharts.com/highstock/navigator.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highstock) The distance from the nearest element, the X axis or X axis
   * labels.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.margin">https://api.highcharts.com/highstock/navigator.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highstock) The color of the mask covering the areas of the navigator
   * series that are currently not visible in the main series. The default
   * color is bluish with an opacity of 0.3 to see the series below.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.maskFill">https://api.highcharts.com/highstock/navigator.maskFill</a>
   *
   * @implspec maskFill?: ColorString;
   *
   */
  @JSProperty("maskFill")
  @Nullable
  String getMaskFill();

  /**
   * (Highstock) The color of the mask covering the areas of the navigator
   * series that are currently not visible in the main series. The default
   * color is bluish with an opacity of 0.3 to see the series below.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.maskFill">https://api.highcharts.com/highstock/navigator.maskFill</a>
   *
   * @implspec maskFill?: ColorString;
   *
   */
  @JSProperty("maskFill")
  void setMaskFill(String value);

  /**
   * (Highstock) Whether the mask should be inside the range marking the
   * zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.maskInside">https://api.highcharts.com/highstock/navigator.maskInside</a>
   *
   * @implspec maskInside?: boolean;
   *
   */
  @JSProperty("maskInside")
  boolean getMaskInside();

  /**
   * (Highstock) Whether the mask should be inside the range marking the
   * zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.maskInside">https://api.highcharts.com/highstock/navigator.maskInside</a>
   *
   * @implspec maskInside?: boolean;
   *
   */
  @JSProperty("maskInside")
  void setMaskInside(boolean value);

  /**
   * (Highstock) When the chart is inverted, whether to draw the navigator on
   * the opposite side.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.opposite">https://api.highcharts.com/highstock/navigator.opposite</a>
   *
   * @implspec opposite?: boolean;
   *
   */
  @JSProperty("opposite")
  boolean getOpposite();

  /**
   * (Highstock) When the chart is inverted, whether to draw the navigator on
   * the opposite side.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.opposite">https://api.highcharts.com/highstock/navigator.opposite</a>
   *
   * @implspec opposite?: boolean;
   *
   */
  @JSProperty("opposite")
  void setOpposite(boolean value);

  /**
   * (Highstock) The color of the line marking the currently zoomed area in
   * the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.outlineColor">https://api.highcharts.com/highstock/navigator.outlineColor</a>
   *
   * @implspec outlineColor?: ColorString;
   *
   */
  @JSProperty("outlineColor")
  @Nullable
  String getOutlineColor();

  /**
   * (Highstock) The color of the line marking the currently zoomed area in
   * the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.outlineColor">https://api.highcharts.com/highstock/navigator.outlineColor</a>
   *
   * @implspec outlineColor?: ColorString;
   *
   */
  @JSProperty("outlineColor")
  void setOutlineColor(String value);

  /**
   * (Highstock) The width of the line marking the currently zoomed area in
   * the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.outlineWidth">https://api.highcharts.com/highstock/navigator.outlineWidth</a>
   *
   * @implspec outlineWidth?: number;
   *
   */
  @JSProperty("outlineWidth")
  double getOutlineWidth();

  /**
   * (Highstock) The width of the line marking the currently zoomed area in
   * the navigator.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.outlineWidth">https://api.highcharts.com/highstock/navigator.outlineWidth</a>
   *
   * @implspec outlineWidth?: number;
   *
   */
  @JSProperty("outlineWidth")
  void setOutlineWidth(double value);

  /**
   * (Highstock) Options for the navigator series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * Unless data is explicitly defined on navigator.series, the data is
   * borrowed from the first series in the chart.
   *
   * Default series options for the navigator series are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series">https://api.highcharts.com/highstock/navigator.series</a>
   *
   * @implspec series?: NavigatorSeriesOptions;
   *
   */
  @JSProperty("series")
  @Nullable
  NavigatorSeriesOptions getSeries();

  /**
   * (Highstock) Options for the navigator series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * Unless data is explicitly defined on navigator.series, the data is
   * borrowed from the first series in the chart.
   *
   * Default series options for the navigator series are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series">https://api.highcharts.com/highstock/navigator.series</a>
   *
   * @implspec series?: NavigatorSeriesOptions;
   *
   */
  @JSProperty("series")
  void setSeries(NavigatorSeriesOptions value);

  /**
   * (Highstock) Options for the navigator X axis. Default series options for
   * the navigator xAxis are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis">https://api.highcharts.com/highstock/navigator.xAxis</a>
   *
   * @implspec xAxis?: NavigatorXAxisOptions;
   *
   */
  @JSProperty("xAxis")
  @Nullable
  NavigatorXAxisOptions getXAxis();

  /**
   * (Highstock) Options for the navigator X axis. Default series options for
   * the navigator xAxis are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis">https://api.highcharts.com/highstock/navigator.xAxis</a>
   *
   * @implspec xAxis?: NavigatorXAxisOptions;
   *
   */
  @JSProperty("xAxis")
  void setXAxis(NavigatorXAxisOptions value);

  /**
   * (Highstock) Options for the navigator Y axis. Default series options for
   * the navigator yAxis are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis">https://api.highcharts.com/highstock/navigator.yAxis</a>
   *
   * @implspec yAxis?: NavigatorYAxisOptions;
   *
   */
  @JSProperty("yAxis")
  @Nullable
  NavigatorYAxisOptions getYAxis();

  /**
   * (Highstock) Options for the navigator Y axis. Default series options for
   * the navigator yAxis are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis">https://api.highcharts.com/highstock/navigator.yAxis</a>
   *
   * @implspec yAxis?: NavigatorYAxisOptions;
   *
   */
  @JSProperty("yAxis")
  void setYAxis(NavigatorYAxisOptions value);
}
