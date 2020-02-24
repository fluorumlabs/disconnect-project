package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) An array of data points for the series. For the <code>mapbubble</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>z</code> options. Example:(see online documentation for example)
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
 * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data">https://api.highcharts.com/highmaps/series.mapbubble.data</a>
 *
 */
public interface SeriesMapbubbleDataOptions extends Any {
  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.color">https://api.highcharts.com/highmaps/series.mapbubble.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.color">https://api.highcharts.com/highmaps/series.mapbubble.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.color">https://api.highcharts.com/highmaps/series.mapbubble.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.color">https://api.highcharts.com/highmaps/series.mapbubble.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.dataLabels">https://api.highcharts.com/highmaps/series.mapbubble.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.dataLabels">https://api.highcharts.com/highmaps/series.mapbubble.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.drilldown">https://api.highcharts.com/highmaps/series.mapbubble.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.drilldown">https://api.highcharts.com/highmaps/series.mapbubble.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highmaps) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.events">https://api.highcharts.com/highmaps/series.mapbubble.data.events</a>
   *
   * @implspec events?: SeriesMapbubbleDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesMapbubbleDataEventsOptions getEvents();

  /**
   * (Highmaps) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.events">https://api.highcharts.com/highmaps/series.mapbubble.data.events</a>
   *
   * @implspec events?: SeriesMapbubbleDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesMapbubbleDataEventsOptions value);

  /**
   * (Highmaps) An id for the point. This can be used after render time to get
   * a pointer to the point object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.id">https://api.highcharts.com/highmaps/series.mapbubble.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.id">https://api.highcharts.com/highmaps/series.mapbubble.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highmaps) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.name">https://api.highcharts.com/highmaps/series.mapbubble.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.name">https://api.highcharts.com/highmaps/series.mapbubble.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highmaps) While the <code>x</code> and <code>y</code> values of the bubble are determined by
   * the underlying map, the <code>z</code> indicates the actual value that gives the
   * size of the bubble.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.z">https://api.highcharts.com/highmaps/series.mapbubble.data.z</a>
   *
   * @implspec z?: number;
   *
   */
  @JSProperty("z")
  double getZ();

  /**
   * (Highmaps) While the <code>x</code> and <code>y</code> values of the bubble are determined by
   * the underlying map, the <code>z</code> indicates the actual value that gives the
   * size of the bubble.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapbubble.data.z">https://api.highcharts.com/highmaps/series.mapbubble.data.z</a>
   *
   * @implspec z?: number;
   *
   */
  @JSProperty("z")
  void setZ(double value);
}
