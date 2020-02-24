package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) An array of data points for the series. For the <code>mappoint</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
 * either starting at 0 and incremented by 1, or from <code>pointStart</code> and
 * <code>pointInterval</code> given in the series options. If the axis has categories,
 * these will be used. Example:(see online documentation for example)
 *
 * </li>
 * <li>
 * An array of arrays with 2 values. In this case, the values correspond to
 * <code>x,y</code>. If the first value is a string, it is applied as the name of the
 * point, and the <code>x</code> value is inferred.(see online documentation for example)
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
 * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data">https://api.highcharts.com/highmaps/series.mappoint.data</a>
 *
 */
public interface SeriesMappointDataOptions extends Any {
  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.color">https://api.highcharts.com/highmaps/series.mappoint.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.color">https://api.highcharts.com/highmaps/series.mappoint.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.color">https://api.highcharts.com/highmaps/series.mappoint.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.color">https://api.highcharts.com/highmaps/series.mappoint.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.dataLabels">https://api.highcharts.com/highmaps/series.mappoint.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.dataLabels">https://api.highcharts.com/highmaps/series.mappoint.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.drilldown">https://api.highcharts.com/highmaps/series.mappoint.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.drilldown">https://api.highcharts.com/highmaps/series.mappoint.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highmaps) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.events">https://api.highcharts.com/highmaps/series.mappoint.data.events</a>
   *
   * @implspec events?: SeriesMappointDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesMappointDataEventsOptions getEvents();

  /**
   * (Highmaps) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.events">https://api.highcharts.com/highmaps/series.mappoint.data.events</a>
   *
   * @implspec events?: SeriesMappointDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesMappointDataEventsOptions value);

  /**
   * (Highmaps) An id for the point. This can be used after render time to get
   * a pointer to the point object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.id">https://api.highcharts.com/highmaps/series.mappoint.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.id">https://api.highcharts.com/highmaps/series.mappoint.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highmaps) The latitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.lat">https://api.highcharts.com/highmaps/series.mappoint.data.lat</a>
   *
   * @implspec lat?: number;
   *
   */
  @JSProperty("lat")
  double getLat();

  /**
   * (Highmaps) The latitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.lat">https://api.highcharts.com/highmaps/series.mappoint.data.lat</a>
   *
   * @implspec lat?: number;
   *
   */
  @JSProperty("lat")
  void setLat(double value);

  /**
   * (Highmaps) The longitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.lon">https://api.highcharts.com/highmaps/series.mappoint.data.lon</a>
   *
   * @implspec lon?: number;
   *
   */
  @JSProperty("lon")
  double getLon();

  /**
   * (Highmaps) The longitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.lon">https://api.highcharts.com/highmaps/series.mappoint.data.lon</a>
   *
   * @implspec lon?: number;
   *
   */
  @JSProperty("lon")
  void setLon(double value);

  /**
   * (Highmaps) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.name">https://api.highcharts.com/highmaps/series.mappoint.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.name">https://api.highcharts.com/highmaps/series.mappoint.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.x">https://api.highcharts.com/highmaps/series.mappoint.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.x">https://api.highcharts.com/highmaps/series.mappoint.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.y">https://api.highcharts.com/highmaps/series.mappoint.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mappoint.data.y">https://api.highcharts.com/highmaps/series.mappoint.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
