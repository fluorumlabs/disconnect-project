package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for the navigator series. Available options are the same
 * as any series, documented at plotOptions and series.
 *
 * Unless data is explicitly defined on navigator.series, the data is borrowed
 * from the first series in the chart.
 *
 * Default series options for the navigator series are:
 *
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator.series">https://api.highcharts.com/highstock/navigator.series</a>
 *
 */
public interface NavigatorSeriesOptions extends Any {
  /**
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highstock) Data grouping options for the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.dataGrouping">https://api.highcharts.com/highstock/navigator.series.dataGrouping</a>
   *
   * @implspec dataGrouping?: NavigatorSeriesDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  NavigatorSeriesDataGroupingOptions getDataGrouping();

  /**
   * (Highstock) Data grouping options for the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.dataGrouping">https://api.highcharts.com/highstock/navigator.series.dataGrouping</a>
   *
   * @implspec dataGrouping?: NavigatorSeriesDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(NavigatorSeriesDataGroupingOptions value);

  /**
   * (Highstock) Data label options for the navigator series. Data labels are
   * disabled by default on the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.dataLabels">https://api.highcharts.com/highstock/navigator.series.dataLabels</a>
   *
   * @implspec dataLabels?: NavigatorSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  NavigatorSeriesDataLabelsOptions getDataLabels();

  /**
   * (Highstock) Data label options for the navigator series. Data labels are
   * disabled by default on the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.dataLabels">https://api.highcharts.com/highstock/navigator.series.dataLabels</a>
   *
   * @implspec dataLabels?: NavigatorSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(NavigatorSeriesDataLabelsOptions value);

  /**
   * (Highstock) The fill opacity of the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.fillOpacity">https://api.highcharts.com/highstock/navigator.series.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highstock) The fill opacity of the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.fillOpacity">https://api.highcharts.com/highstock/navigator.series.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  /**
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highstock) Line color for the navigator series. Allows setting the color
   * while disallowing the default candlestick setting.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.lineColor">https://api.highcharts.com/highstock/navigator.series.lineColor</a>
   *
   * @implspec lineColor?: (ColorString|null);
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) Line color for the navigator series. Allows setting the color
   * while disallowing the default candlestick setting.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.lineColor">https://api.highcharts.com/highstock/navigator.series.lineColor</a>
   *
   * @implspec lineColor?: (ColorString|null);
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) The pixel line width of the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.lineWidth">https://api.highcharts.com/highstock/navigator.series.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The pixel line width of the navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.lineWidth">https://api.highcharts.com/highstock/navigator.series.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * @implspec marker?: NavigatorSeriesMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  NavigatorSeriesMarkerOptions getMarker();

  /**
   * @implspec marker?: NavigatorSeriesMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(NavigatorSeriesMarkerOptions value);

  /**
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

  /**
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highstock) The threshold option. Setting it to 0 will make the default
   * navigator area series draw its area from the 0 value and up.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.threshold">https://api.highcharts.com/highstock/navigator.series.threshold</a>
   *
   * @implspec threshold?: (number|null);
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highstock) The threshold option. Setting it to 0 will make the default
   * navigator area series draw its area from the 0 value and up.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.threshold">https://api.highcharts.com/highstock/navigator.series.threshold</a>
   *
   * @implspec threshold?: (number|null);
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highstock) The type of the navigator series. Defaults to <code>areaspline</code> if
   * defined, otherwise <code>line</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.type">https://api.highcharts.com/highstock/navigator.series.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * (Highstock) The type of the navigator series. Defaults to <code>areaspline</code> if
   * defined, otherwise <code>line</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.series.type">https://api.highcharts.com/highstock/navigator.series.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  void setType(String value);
}
