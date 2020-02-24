package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of data points for the series. For
 * the <code>xrange</code> series type, points can be given in the following ways:
 *
 * <ol>
 * <li>An array of objects with named values. The objects are point configuration
 * objects as seen below.(see online documentation for example)</li>
 * </ol>
 * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data">https://api.highcharts.com/highcharts/series.xrange.data</a>
 * @see <a href="https://api.highcharts.com/highstock/series.xrange.data">https://api.highcharts.com/highstock/series.xrange.data</a>
 * @see <a href="https://api.highcharts.com/gantt/series.xrange.data">https://api.highcharts.com/gantt/series.xrange.data</a>
 *
 */
public interface SeriesXrangeDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.className">https://api.highcharts.com/highcharts/series.xrange.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.className">https://api.highcharts.com/gantt/series.xrange.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.className">https://api.highcharts.com/highcharts/series.xrange.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.className">https://api.highcharts.com/gantt/series.xrange.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.color">https://api.highcharts.com/highcharts/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.color">https://api.highcharts.com/highstock/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.color">https://api.highcharts.com/gantt/series.xrange.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.color">https://api.highcharts.com/highcharts/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.color">https://api.highcharts.com/highstock/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.color">https://api.highcharts.com/gantt/series.xrange.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.color">https://api.highcharts.com/highcharts/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.color">https://api.highcharts.com/highstock/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.color">https://api.highcharts.com/gantt/series.xrange.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.color">https://api.highcharts.com/highcharts/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.color">https://api.highcharts.com/highstock/series.xrange.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.color">https://api.highcharts.com/gantt/series.xrange.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Gantt) A specific color index to use for the point, so its
   * graphic representations are given the class name <code>highcharts-color-{n}</code>.
   * In styled mode this will change the color of the graphic. In non-styled
   * mode, the color by is set by the <code>fill</code> attribute, so the change in class
   * name won't have a visual effect by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.colorIndex">https://api.highcharts.com/highcharts/series.xrange.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.colorIndex">https://api.highcharts.com/gantt/series.xrange.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Gantt) A specific color index to use for the point, so its
   * graphic representations are given the class name <code>highcharts-color-{n}</code>.
   * In styled mode this will change the color of the graphic. In non-styled
   * mode, the color by is set by the <code>fill</code> attribute, so the change in class
   * name won't have a visual effect by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.colorIndex">https://api.highcharts.com/highcharts/series.xrange.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.colorIndex">https://api.highcharts.com/gantt/series.xrange.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Gantt) Connect to a point. Requires Highcharts Gantt to be loaded. This
   * option can be either a string, referring to the ID of another point, or
   * an object, or an array of either. If the option is an array, each element
   * defines a connection.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.connect">https://api.highcharts.com/gantt/series.xrange.data.connect</a>
   *
   * @implspec connect?: (string|SeriesXrangeDataConnectOptions|Array&lt;(string|SeriesXrangeDataConnectOptions)&gt;);
   *
   */
  @JSProperty("connect")
  @Nullable
  Unknown getConnect();

  /**
   * (Gantt) Connect to a point. Requires Highcharts Gantt to be loaded. This
   * option can be either a string, referring to the ID of another point, or
   * an object, or an array of either. If the option is an array, each element
   * defines a connection.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.connect">https://api.highcharts.com/gantt/series.xrange.data.connect</a>
   *
   * @implspec connect?: (string|SeriesXrangeDataConnectOptions|Array&lt;(string|SeriesXrangeDataConnectOptions)&gt;);
   *
   */
  @JSProperty("connect")
  void setConnect(String value);

  /**
   * (Gantt) Connect to a point. Requires Highcharts Gantt to be loaded. This
   * option can be either a string, referring to the ID of another point, or
   * an object, or an array of either. If the option is an array, each element
   * defines a connection.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.connect">https://api.highcharts.com/gantt/series.xrange.data.connect</a>
   *
   * @implspec connect?: (string|SeriesXrangeDataConnectOptions|Array&lt;(string|SeriesXrangeDataConnectOptions)&gt;);
   *
   */
  @JSProperty("connect")
  void setConnect(SeriesXrangeDataConnectOptions value);

  /**
   * (Gantt) Connect to a point. Requires Highcharts Gantt to be loaded. This
   * option can be either a string, referring to the ID of another point, or
   * an object, or an array of either. If the option is an array, each element
   * defines a connection.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.connect">https://api.highcharts.com/gantt/series.xrange.data.connect</a>
   *
   * @implspec connect?: (string|SeriesXrangeDataConnectOptions|Array&lt;(string|SeriesXrangeDataConnectOptions)&gt;);
   *
   */
  @JSProperty("connect")
  void setConnect(Array<Unknown> value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.dataLabels">https://api.highcharts.com/highcharts/series.xrange.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.dataLabels">https://api.highcharts.com/highstock/series.xrange.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.dataLabels">https://api.highcharts.com/gantt/series.xrange.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotSeriesDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.dataLabels">https://api.highcharts.com/highcharts/series.xrange.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.dataLabels">https://api.highcharts.com/highstock/series.xrange.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.dataLabels">https://api.highcharts.com/gantt/series.xrange.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSeriesDataLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) A description of the point to add to the
   * screen reader information about the point. Requires the Accessibility
   * module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.description">https://api.highcharts.com/highcharts/series.xrange.data.description</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.description">https://api.highcharts.com/highstock/series.xrange.data.description</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.description">https://api.highcharts.com/gantt/series.xrange.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Gantt) A description of the point to add to the
   * screen reader information about the point. Requires the Accessibility
   * module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.description">https://api.highcharts.com/highcharts/series.xrange.data.description</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.description">https://api.highcharts.com/highstock/series.xrange.data.description</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.description">https://api.highcharts.com/gantt/series.xrange.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.dragDrop">https://api.highcharts.com/highcharts/series.xrange.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.dragDrop">https://api.highcharts.com/highstock/series.xrange.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.xrange.data.dragDrop">https://api.highcharts.com/highmaps/series.xrange.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesXrangeDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesXrangeDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.dragDrop">https://api.highcharts.com/highcharts/series.xrange.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.dragDrop">https://api.highcharts.com/highstock/series.xrange.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.xrange.data.dragDrop">https://api.highcharts.com/highmaps/series.xrange.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesXrangeDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesXrangeDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.drilldown">https://api.highcharts.com/highcharts/series.xrange.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.drilldown">https://api.highcharts.com/highcharts/series.xrange.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.events">https://api.highcharts.com/highcharts/series.xrange.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.events">https://api.highcharts.com/highstock/series.xrange.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.events">https://api.highcharts.com/gantt/series.xrange.data.events</a>
   *
   * @implspec events?: SeriesXrangeDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesXrangeDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.events">https://api.highcharts.com/highcharts/series.xrange.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.events">https://api.highcharts.com/highstock/series.xrange.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.events">https://api.highcharts.com/gantt/series.xrange.data.events</a>
   *
   * @implspec events?: SeriesXrangeDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesXrangeDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.id">https://api.highcharts.com/highcharts/series.xrange.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.id">https://api.highcharts.com/highstock/series.xrange.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.id">https://api.highcharts.com/gantt/series.xrange.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.id">https://api.highcharts.com/highcharts/series.xrange.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.id">https://api.highcharts.com/highstock/series.xrange.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.id">https://api.highcharts.com/gantt/series.xrange.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Gantt) The rank for this point's data label in
   * case of collision. If two data labels are about to overlap, only the one
   * with the highest <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.labelrank">https://api.highcharts.com/highcharts/series.xrange.data.labelrank</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.labelrank">https://api.highcharts.com/highstock/series.xrange.data.labelrank</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.labelrank">https://api.highcharts.com/gantt/series.xrange.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highcharts, Highstock, Gantt) The rank for this point's data label in
   * case of collision. If two data labels are about to overlap, only the one
   * with the highest <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.labelrank">https://api.highcharts.com/highcharts/series.xrange.data.labelrank</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.labelrank">https://api.highcharts.com/highstock/series.xrange.data.labelrank</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.labelrank">https://api.highcharts.com/gantt/series.xrange.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define
   * the visual appearance of the markers. Other series types, like column
   * series, don't have markers, but have visual options on the series level
   * instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.marker">https://api.highcharts.com/highcharts/series.xrange.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.marker">https://api.highcharts.com/highstock/series.xrange.data.marker</a>
   *
   * @implspec marker?: SeriesXrangeDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  SeriesXrangeDataMarkerOptions getMarker();

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define
   * the visual appearance of the markers. Other series types, like column
   * series, don't have markers, but have visual options on the series level
   * instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.marker">https://api.highcharts.com/highcharts/series.xrange.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.marker">https://api.highcharts.com/highstock/series.xrange.data.marker</a>
   *
   * @implspec marker?: SeriesXrangeDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(SeriesXrangeDataMarkerOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The name of the point as shown in the
   * legend, tooltip, dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.name">https://api.highcharts.com/highcharts/series.xrange.data.name</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.name">https://api.highcharts.com/highstock/series.xrange.data.name</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.name">https://api.highcharts.com/gantt/series.xrange.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highstock, Gantt) The name of the point as shown in the
   * legend, tooltip, dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.name">https://api.highcharts.com/highcharts/series.xrange.data.name</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.name">https://api.highcharts.com/highstock/series.xrange.data.name</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.name">https://api.highcharts.com/gantt/series.xrange.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill">https://api.highcharts.com/highcharts/series.xrange.data.partialFill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill">https://api.highcharts.com/highstock/series.xrange.data.partialFill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill">https://api.highcharts.com/gantt/series.xrange.data.partialFill</a>
   *
   * @implspec partialFill?: SeriesXrangeDataPartialFillOptions;
   *
   */
  @JSProperty("partialFill")
  @Nullable
  SeriesXrangeDataPartialFillOptions getPartialFill();

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill">https://api.highcharts.com/highcharts/series.xrange.data.partialFill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill">https://api.highcharts.com/highstock/series.xrange.data.partialFill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill">https://api.highcharts.com/gantt/series.xrange.data.partialFill</a>
   *
   * @implspec partialFill?: SeriesXrangeDataPartialFillOptions;
   *
   */
  @JSProperty("partialFill")
  void setPartialFill(SeriesXrangeDataPartialFillOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.selected">https://api.highcharts.com/highcharts/series.xrange.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.selected">https://api.highcharts.com/highstock/series.xrange.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.selected">https://api.highcharts.com/gantt/series.xrange.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.selected">https://api.highcharts.com/highcharts/series.xrange.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.selected">https://api.highcharts.com/highstock/series.xrange.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.selected">https://api.highcharts.com/gantt/series.xrange.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) The starting X value of the range point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.x">https://api.highcharts.com/highcharts/series.xrange.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.x">https://api.highcharts.com/highstock/series.xrange.data.x</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.x">https://api.highcharts.com/gantt/series.xrange.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) The starting X value of the range point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.x">https://api.highcharts.com/highcharts/series.xrange.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.x">https://api.highcharts.com/highstock/series.xrange.data.x</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.x">https://api.highcharts.com/gantt/series.xrange.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) The ending X value of the range point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.x2">https://api.highcharts.com/highcharts/series.xrange.data.x2</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.x2">https://api.highcharts.com/highstock/series.xrange.data.x2</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.x2">https://api.highcharts.com/gantt/series.xrange.data.x2</a>
   *
   * @implspec x2?: number;
   *
   */
  @JSProperty("x2")
  double getX2();

  /**
   * (Highcharts, Highstock, Gantt) The ending X value of the range point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.x2">https://api.highcharts.com/highcharts/series.xrange.data.x2</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.x2">https://api.highcharts.com/highstock/series.xrange.data.x2</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.x2">https://api.highcharts.com/gantt/series.xrange.data.x2</a>
   *
   * @implspec x2?: number;
   *
   */
  @JSProperty("x2")
  void setX2(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Y value of the range point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.y">https://api.highcharts.com/highcharts/series.xrange.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.y">https://api.highcharts.com/highstock/series.xrange.data.y</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.y">https://api.highcharts.com/gantt/series.xrange.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) The Y value of the range point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.y">https://api.highcharts.com/highcharts/series.xrange.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.y">https://api.highcharts.com/highstock/series.xrange.data.y</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.y">https://api.highcharts.com/gantt/series.xrange.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
