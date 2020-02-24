package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>variwide</code>
 * series type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of arrays with 3 or 2 values. In this case, the values correspond
 * to <code>x,y,z</code>. If the first value is a string, it is applied as the name of the
 * point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in
 * which case the inner arrays should be of length 2. Then the <code>x</code> value is
 * automatically calculated, either starting at 0 and incremented by 1, or from
 * <code>pointStart</code> and <code>pointInterval</code> given in the series options.(see online
 * documentation for example)
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
 * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data">https://api.highcharts.com/highcharts/series.variwide.data</a>
 *
 */
public interface SeriesVariwideDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.className">https://api.highcharts.com/highcharts/series.variwide.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.className">https://api.highcharts.com/gantt/series.variwide.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.className">https://api.highcharts.com/highcharts/series.variwide.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.className">https://api.highcharts.com/gantt/series.variwide.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.color">https://api.highcharts.com/highcharts/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.color">https://api.highcharts.com/highstock/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.color">https://api.highcharts.com/gantt/series.variwide.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.color">https://api.highcharts.com/highcharts/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.color">https://api.highcharts.com/highstock/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.color">https://api.highcharts.com/gantt/series.variwide.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.color">https://api.highcharts.com/highcharts/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.color">https://api.highcharts.com/highstock/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.color">https://api.highcharts.com/gantt/series.variwide.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.color">https://api.highcharts.com/highcharts/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.color">https://api.highcharts.com/highstock/series.variwide.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.color">https://api.highcharts.com/gantt/series.variwide.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.colorIndex">https://api.highcharts.com/highcharts/series.variwide.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.colorIndex">https://api.highcharts.com/gantt/series.variwide.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.colorIndex">https://api.highcharts.com/highcharts/series.variwide.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.colorIndex">https://api.highcharts.com/gantt/series.variwide.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.dataLabels">https://api.highcharts.com/highcharts/series.variwide.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.dataLabels">https://api.highcharts.com/highstock/series.variwide.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.dataLabels">https://api.highcharts.com/gantt/series.variwide.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.dataLabels">https://api.highcharts.com/highcharts/series.variwide.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.dataLabels">https://api.highcharts.com/highstock/series.variwide.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.dataLabels">https://api.highcharts.com/gantt/series.variwide.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSeriesDataLabelsOptions value);

  /**
   * (Highcharts) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.description">https://api.highcharts.com/highcharts/series.variwide.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.description">https://api.highcharts.com/highcharts/series.variwide.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.dragDrop">https://api.highcharts.com/highcharts/series.variwide.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.dragDrop">https://api.highcharts.com/highstock/series.variwide.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.variwide.data.dragDrop">https://api.highcharts.com/highmaps/series.variwide.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesVariwideDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesVariwideDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.dragDrop">https://api.highcharts.com/highcharts/series.variwide.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.dragDrop">https://api.highcharts.com/highstock/series.variwide.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.variwide.data.dragDrop">https://api.highcharts.com/highmaps/series.variwide.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesVariwideDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesVariwideDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.drilldown">https://api.highcharts.com/highcharts/series.variwide.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.drilldown">https://api.highcharts.com/highcharts/series.variwide.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.events">https://api.highcharts.com/highcharts/series.variwide.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.events">https://api.highcharts.com/highstock/series.variwide.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.events">https://api.highcharts.com/gantt/series.variwide.data.events</a>
   *
   * @implspec events?: SeriesVariwideDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesVariwideDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.events">https://api.highcharts.com/highcharts/series.variwide.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.events">https://api.highcharts.com/highstock/series.variwide.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.events">https://api.highcharts.com/gantt/series.variwide.data.events</a>
   *
   * @implspec events?: SeriesVariwideDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesVariwideDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.id">https://api.highcharts.com/highcharts/series.variwide.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.id">https://api.highcharts.com/highstock/series.variwide.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.id">https://api.highcharts.com/gantt/series.variwide.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.id">https://api.highcharts.com/highcharts/series.variwide.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.id">https://api.highcharts.com/highstock/series.variwide.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.id">https://api.highcharts.com/gantt/series.variwide.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.labelrank">https://api.highcharts.com/highcharts/series.variwide.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.labelrank">https://api.highcharts.com/highcharts/series.variwide.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.name">https://api.highcharts.com/highcharts/series.variwide.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.name">https://api.highcharts.com/highcharts/series.variwide.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.selected">https://api.highcharts.com/highcharts/series.variwide.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.selected">https://api.highcharts.com/highstock/series.variwide.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.selected">https://api.highcharts.com/gantt/series.variwide.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.selected">https://api.highcharts.com/highcharts/series.variwide.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.selected">https://api.highcharts.com/highstock/series.variwide.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.variwide.data.selected">https://api.highcharts.com/gantt/series.variwide.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.x">https://api.highcharts.com/highcharts/series.variwide.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.x">https://api.highcharts.com/highstock/series.variwide.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.x">https://api.highcharts.com/highcharts/series.variwide.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.x">https://api.highcharts.com/highstock/series.variwide.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.y">https://api.highcharts.com/highcharts/series.variwide.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.y">https://api.highcharts.com/highstock/series.variwide.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.y">https://api.highcharts.com/highcharts/series.variwide.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.variwide.data.y">https://api.highcharts.com/highstock/series.variwide.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts) The relative width for each column. On a category axis, the
   * widths are distributed so they sum up to the X axis length. On linear and
   * datetime axes, the columns will be laid out from the X value and Z units
   * along the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.z">https://api.highcharts.com/highcharts/series.variwide.data.z</a>
   *
   * @implspec z?: number;
   *
   */
  @JSProperty("z")
  double getZ();

  /**
   * (Highcharts) The relative width for each column. On a category axis, the
   * widths are distributed so they sum up to the X axis length. On linear and
   * datetime axes, the columns will be laid out from the X value and Z units
   * along the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.variwide.data.z">https://api.highcharts.com/highcharts/series.variwide.data.z</a>
   *
   * @implspec z?: number;
   *
   */
  @JSProperty("z")
  void setZ(double value);
}
