package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) An array of data points for the series. For the <code>map</code> series type,
 * points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>value</code> options. Example:(see online documentation for
 * example)
 *
 * </li>
 * <li>
 * An array of arrays with 2 values. In this case, the values correspond to
 * <code>[hc-key, value]</code>. Example:(see online documentation for example)
 *
 * </li>
 * <li>
 * An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available.(see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * @see <a href="https://api.highcharts.com/highmaps/series.map.data">https://api.highcharts.com/highmaps/series.map.data</a>
 *
 */
public interface SeriesMapDataOptions extends Any {
  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.color">https://api.highcharts.com/highmaps/series.map.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.color">https://api.highcharts.com/highmaps/series.map.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.color">https://api.highcharts.com/highmaps/series.map.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.color">https://api.highcharts.com/highmaps/series.map.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highmaps) Individual data label for each point. The options are the same
   * as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.dataLabels">https://api.highcharts.com/highmaps/series.map.data.dataLabels</a>
   *
   * @implspec dataLabels?: object;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Any getDataLabels();

  /**
   * (Highmaps) Individual data label for each point. The options are the same
   * as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.dataLabels">https://api.highcharts.com/highmaps/series.map.data.dataLabels</a>
   *
   * @implspec dataLabels?: object;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(Any value);

  /**
   * (Highmaps) The <code>id</code> of a series in the drilldown.series array to use for
   * a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.drilldown">https://api.highcharts.com/highmaps/series.map.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highmaps) The <code>id</code> of a series in the drilldown.series array to use for
   * a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.drilldown">https://api.highcharts.com/highmaps/series.map.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highmaps) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.events">https://api.highcharts.com/highmaps/series.map.data.events</a>
   *
   * @implspec events?: SeriesMapDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesMapDataEventsOptions getEvents();

  /**
   * (Highmaps) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.events">https://api.highcharts.com/highmaps/series.map.data.events</a>
   *
   * @implspec events?: SeriesMapDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesMapDataEventsOptions value);

  /**
   * (Highmaps) An id for the point. This can be used after render time to get
   * a pointer to the point object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.id">https://api.highcharts.com/highmaps/series.map.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highmaps) An id for the point. This can be used after render time to get
   * a pointer to the point object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.id">https://api.highcharts.com/highmaps/series.map.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highmaps) When data labels are laid out on a map, Highmaps runs a
   * simplified algorithm to detect collision. When two labels collide, the
   * one with the lowest rank is hidden. By default the rank is computed from
   * the area.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.labelrank">https://api.highcharts.com/highmaps/series.map.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highmaps) When data labels are laid out on a map, Highmaps runs a
   * simplified algorithm to detect collision. When two labels collide, the
   * one with the lowest rank is hidden. By default the rank is computed from
   * the area.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.labelrank">https://api.highcharts.com/highmaps/series.map.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be
   * defined there.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.middleX">https://api.highcharts.com/highmaps/series.map.data.middleX</a>
   *
   * @implspec middleX?: number;
   *
   */
  @JSProperty("middleX")
  double getMiddleX();

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be
   * defined there.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.middleX">https://api.highcharts.com/highmaps/series.map.data.middleX</a>
   *
   * @implspec middleX?: number;
   *
   */
  @JSProperty("middleX")
  void setMiddleX(double value);

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be
   * defined there.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.middleY">https://api.highcharts.com/highmaps/series.map.data.middleY</a>
   *
   * @implspec middleY?: number;
   *
   */
  @JSProperty("middleY")
  double getMiddleY();

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be
   * defined there.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.middleY">https://api.highcharts.com/highmaps/series.map.data.middleY</a>
   *
   * @implspec middleY?: number;
   *
   */
  @JSProperty("middleY")
  void setMiddleY(double value);

  /**
   * (Highmaps) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.name">https://api.highcharts.com/highmaps/series.map.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highmaps) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.name">https://api.highcharts.com/highmaps/series.map.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highmaps) For map and mapline series types, the SVG path for the shape.
   * For compatibily with old IE, not all SVG path definitions are supported,
   * but M, L and C operators are safe.
   *
   * To achieve a better separation between the structure and the data, it is
   * recommended to use <code>mapData</code> to define that paths instead of defining
   * them on the data points themselves.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.path">https://api.highcharts.com/highmaps/series.map.data.path</a>
   *
   * @implspec path?: string;
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * (Highmaps) For map and mapline series types, the SVG path for the shape.
   * For compatibily with old IE, not all SVG path definitions are supported,
   * but M, L and C operators are safe.
   *
   * To achieve a better separation between the structure and the data, it is
   * recommended to use <code>mapData</code> to define that paths instead of defining
   * them on the data points themselves.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.path">https://api.highcharts.com/highmaps/series.map.data.path</a>
   *
   * @implspec path?: string;
   *
   */
  @JSProperty("path")
  void setPath(String value);

  /**
   * (Highmaps) The numeric value of the data point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.value">https://api.highcharts.com/highmaps/series.map.data.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highmaps) The numeric value of the data point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.map.data.value">https://api.highcharts.com/highmaps/series.map.data.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);
}
