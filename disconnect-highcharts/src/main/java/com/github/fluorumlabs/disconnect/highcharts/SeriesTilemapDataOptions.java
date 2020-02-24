package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) An array of data points for the series. For the
 * <code>tilemap</code> series type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of arrays with 3 or 2 values. In this case, the values correspond
 * to <code>x,y,value</code>. If the first value is a string, it is applied as the name of
 * the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted,
 * in which case the inner arrays should be of length 2. Then the <code>x</code> value is
 * automatically calculated, either starting at 0 and incremented by 1, or from
 * <code>pointStart</code> and <code>pointInterval</code> given in the series options.(see online
 * documentation for example)
 *
 * </li>
 * <li>
 * An array of objects with named values. The objects are point configuration
 * objects as seen below. If the total number of data points exceeds the series'
 * turboThreshold, this option is not available.(see online documentation for
 * example)
 *
 * </li>
 * </ol>
 * Note that for some tileShapes the grid coordinates are offset.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data">https://api.highcharts.com/highcharts/series.tilemap.data</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data">https://api.highcharts.com/highmaps/series.tilemap.data</a>
 *
 */
public interface SeriesTilemapDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.className">https://api.highcharts.com/highcharts/series.tilemap.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.className">https://api.highcharts.com/gantt/series.tilemap.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.className">https://api.highcharts.com/highcharts/series.tilemap.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.className">https://api.highcharts.com/gantt/series.tilemap.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highmaps) The color of the point. In tilemaps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.color">https://api.highcharts.com/highcharts/series.tilemap.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.color">https://api.highcharts.com/highmaps/series.tilemap.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highmaps) The color of the point. In tilemaps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.color">https://api.highcharts.com/highcharts/series.tilemap.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.color">https://api.highcharts.com/highmaps/series.tilemap.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highmaps) The color of the point. In tilemaps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.color">https://api.highcharts.com/highcharts/series.tilemap.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.color">https://api.highcharts.com/highmaps/series.tilemap.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highmaps) The color of the point. In tilemaps the point
   * color is rarely set explicitly, as we use the color to denote the
   * <code>value</code>. Options for this are set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.color">https://api.highcharts.com/highcharts/series.tilemap.data.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.color">https://api.highcharts.com/highmaps/series.tilemap.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.colorIndex">https://api.highcharts.com/highcharts/series.tilemap.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.colorIndex">https://api.highcharts.com/gantt/series.tilemap.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.colorIndex">https://api.highcharts.com/highcharts/series.tilemap.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.colorIndex">https://api.highcharts.com/gantt/series.tilemap.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.dataLabels">https://api.highcharts.com/highcharts/series.tilemap.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.dataLabels">https://api.highcharts.com/highstock/series.tilemap.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.dataLabels">https://api.highcharts.com/gantt/series.tilemap.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.dataLabels">https://api.highcharts.com/highcharts/series.tilemap.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.dataLabels">https://api.highcharts.com/highstock/series.tilemap.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.dataLabels">https://api.highcharts.com/gantt/series.tilemap.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSeriesDataLabelsOptions value);

  /**
   * (Highcharts, Highmaps) A description of the point to add to the screen
   * reader information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.description">https://api.highcharts.com/highcharts/series.tilemap.data.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.description">https://api.highcharts.com/highmaps/series.tilemap.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highmaps) A description of the point to add to the screen
   * reader information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.description">https://api.highcharts.com/highcharts/series.tilemap.data.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.description">https://api.highcharts.com/highmaps/series.tilemap.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.dragDrop">https://api.highcharts.com/highcharts/series.tilemap.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.dragDrop">https://api.highcharts.com/highstock/series.tilemap.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.dragDrop">https://api.highcharts.com/highmaps/series.tilemap.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesTilemapDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesTilemapDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.dragDrop">https://api.highcharts.com/highcharts/series.tilemap.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.dragDrop">https://api.highcharts.com/highstock/series.tilemap.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.dragDrop">https://api.highcharts.com/highmaps/series.tilemap.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesTilemapDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesTilemapDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.drilldown">https://api.highcharts.com/highcharts/series.tilemap.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.drilldown">https://api.highcharts.com/highcharts/series.tilemap.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.events">https://api.highcharts.com/highcharts/series.tilemap.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.events">https://api.highcharts.com/highstock/series.tilemap.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.events">https://api.highcharts.com/gantt/series.tilemap.data.events</a>
   *
   * @implspec events?: SeriesTilemapDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesTilemapDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.events">https://api.highcharts.com/highcharts/series.tilemap.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.events">https://api.highcharts.com/highstock/series.tilemap.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.events">https://api.highcharts.com/gantt/series.tilemap.data.events</a>
   *
   * @implspec events?: SeriesTilemapDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesTilemapDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.id">https://api.highcharts.com/highcharts/series.tilemap.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.id">https://api.highcharts.com/highstock/series.tilemap.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.id">https://api.highcharts.com/gantt/series.tilemap.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.id">https://api.highcharts.com/highcharts/series.tilemap.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.id">https://api.highcharts.com/highstock/series.tilemap.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.id">https://api.highcharts.com/gantt/series.tilemap.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highmaps) The rank for this point's data label in case of
   * collision. If two data labels are about to overlap, only the one with the
   * highest <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.labelrank">https://api.highcharts.com/highcharts/series.tilemap.data.labelrank</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.labelrank">https://api.highcharts.com/highmaps/series.tilemap.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highcharts, Highmaps) The rank for this point's data label in case of
   * collision. If two data labels are about to overlap, only the one with the
   * highest <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.labelrank">https://api.highcharts.com/highcharts/series.tilemap.data.labelrank</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.labelrank">https://api.highcharts.com/highmaps/series.tilemap.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts, Highmaps) The name of the point as shown in the legend,
   * tooltip, dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.name">https://api.highcharts.com/highcharts/series.tilemap.data.name</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.name">https://api.highcharts.com/highmaps/series.tilemap.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highmaps) The name of the point as shown in the legend,
   * tooltip, dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.name">https://api.highcharts.com/highcharts/series.tilemap.data.name</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.name">https://api.highcharts.com/highmaps/series.tilemap.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highmaps) Point padding for a single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.pointPadding">https://api.highcharts.com/highcharts/series.tilemap.data.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.pointPadding">https://api.highcharts.com/highmaps/series.tilemap.data.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highmaps) Point padding for a single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.pointPadding">https://api.highcharts.com/highcharts/series.tilemap.data.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.pointPadding">https://api.highcharts.com/highmaps/series.tilemap.data.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.selected">https://api.highcharts.com/highcharts/series.tilemap.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.selected">https://api.highcharts.com/highstock/series.tilemap.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.selected">https://api.highcharts.com/gantt/series.tilemap.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.selected">https://api.highcharts.com/highcharts/series.tilemap.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.tilemap.data.selected">https://api.highcharts.com/highstock/series.tilemap.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.tilemap.data.selected">https://api.highcharts.com/gantt/series.tilemap.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highmaps) The value of the point, resulting in a color
   * controled by options as set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.value">https://api.highcharts.com/highcharts/series.tilemap.data.value</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.value">https://api.highcharts.com/highmaps/series.tilemap.data.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highmaps) The value of the point, resulting in a color
   * controled by options as set in the colorAxis configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.value">https://api.highcharts.com/highcharts/series.tilemap.data.value</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.value">https://api.highcharts.com/highmaps/series.tilemap.data.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * (Highcharts, Highmaps) The x coordinate of the point.
   *
   * Note that for some tileShapes the grid coordinates are offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.x">https://api.highcharts.com/highcharts/series.tilemap.data.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.x">https://api.highcharts.com/highmaps/series.tilemap.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highmaps) The x coordinate of the point.
   *
   * Note that for some tileShapes the grid coordinates are offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.x">https://api.highcharts.com/highcharts/series.tilemap.data.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.x">https://api.highcharts.com/highmaps/series.tilemap.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highmaps) The y coordinate of the point.
   *
   * Note that for some tileShapes the grid coordinates are offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.y">https://api.highcharts.com/highcharts/series.tilemap.data.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.y">https://api.highcharts.com/highmaps/series.tilemap.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highmaps) The y coordinate of the point.
   *
   * Note that for some tileShapes the grid coordinates are offset.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.tilemap.data.y">https://api.highcharts.com/highcharts/series.tilemap.data.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.tilemap.data.y">https://api.highcharts.com/highmaps/series.tilemap.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
