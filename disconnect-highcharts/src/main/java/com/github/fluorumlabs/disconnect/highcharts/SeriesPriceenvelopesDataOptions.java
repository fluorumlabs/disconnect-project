package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An array of data points for the series. For the <code>priceenvelopes</code>
 * series type, points are calculated dynamically.
 *
 * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data">https://api.highcharts.com/highstock/series.priceenvelopes.data</a>
 *
 */
public interface SeriesPriceenvelopesDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.className">https://api.highcharts.com/highcharts/series.priceenvelopes.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.className">https://api.highcharts.com/gantt/series.priceenvelopes.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.className">https://api.highcharts.com/highcharts/series.priceenvelopes.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.className">https://api.highcharts.com/gantt/series.priceenvelopes.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.color">https://api.highcharts.com/highcharts/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.color">https://api.highcharts.com/highstock/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.color">https://api.highcharts.com/gantt/series.priceenvelopes.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.color">https://api.highcharts.com/highcharts/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.color">https://api.highcharts.com/highstock/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.color">https://api.highcharts.com/gantt/series.priceenvelopes.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.color">https://api.highcharts.com/highcharts/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.color">https://api.highcharts.com/highstock/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.color">https://api.highcharts.com/gantt/series.priceenvelopes.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.color">https://api.highcharts.com/highcharts/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.color">https://api.highcharts.com/highstock/series.priceenvelopes.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.color">https://api.highcharts.com/gantt/series.priceenvelopes.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.colorIndex">https://api.highcharts.com/highcharts/series.priceenvelopes.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.colorIndex">https://api.highcharts.com/gantt/series.priceenvelopes.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.colorIndex">https://api.highcharts.com/highcharts/series.priceenvelopes.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.colorIndex">https://api.highcharts.com/gantt/series.priceenvelopes.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.dataLabels">https://api.highcharts.com/highcharts/series.priceenvelopes.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.dataLabels">https://api.highcharts.com/highstock/series.priceenvelopes.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.dataLabels">https://api.highcharts.com/gantt/series.priceenvelopes.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.dataLabels">https://api.highcharts.com/highcharts/series.priceenvelopes.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.dataLabels">https://api.highcharts.com/highstock/series.priceenvelopes.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.dataLabels">https://api.highcharts.com/gantt/series.priceenvelopes.data.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSeriesDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSeriesDataLabelsOptions value);

  /**
   * (Highstock) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.description">https://api.highcharts.com/highstock/series.priceenvelopes.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highstock) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.description">https://api.highcharts.com/highstock/series.priceenvelopes.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.dragDrop">https://api.highcharts.com/highcharts/series.priceenvelopes.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.dragDrop">https://api.highcharts.com/highstock/series.priceenvelopes.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.priceenvelopes.data.dragDrop">https://api.highcharts.com/highmaps/series.priceenvelopes.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesPriceenvelopesDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesPriceenvelopesDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.dragDrop">https://api.highcharts.com/highcharts/series.priceenvelopes.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.dragDrop">https://api.highcharts.com/highstock/series.priceenvelopes.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.priceenvelopes.data.dragDrop">https://api.highcharts.com/highmaps/series.priceenvelopes.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesPriceenvelopesDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesPriceenvelopesDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.drilldown">https://api.highcharts.com/highcharts/series.priceenvelopes.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.drilldown">https://api.highcharts.com/highcharts/series.priceenvelopes.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.events">https://api.highcharts.com/highcharts/series.priceenvelopes.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.events">https://api.highcharts.com/highstock/series.priceenvelopes.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.events">https://api.highcharts.com/gantt/series.priceenvelopes.data.events</a>
   *
   * @implspec events?: SeriesPriceenvelopesDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesPriceenvelopesDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.events">https://api.highcharts.com/highcharts/series.priceenvelopes.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.events">https://api.highcharts.com/highstock/series.priceenvelopes.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.events">https://api.highcharts.com/gantt/series.priceenvelopes.data.events</a>
   *
   * @implspec events?: SeriesPriceenvelopesDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesPriceenvelopesDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.id">https://api.highcharts.com/highcharts/series.priceenvelopes.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.id">https://api.highcharts.com/highstock/series.priceenvelopes.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.id">https://api.highcharts.com/gantt/series.priceenvelopes.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.id">https://api.highcharts.com/highcharts/series.priceenvelopes.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.id">https://api.highcharts.com/highstock/series.priceenvelopes.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.id">https://api.highcharts.com/gantt/series.priceenvelopes.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highstock) The rank for this point's data label in case of collision. If
   * two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.labelrank">https://api.highcharts.com/highstock/series.priceenvelopes.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highstock) The rank for this point's data label in case of collision. If
   * two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.labelrank">https://api.highcharts.com/highstock/series.priceenvelopes.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.marker">https://api.highcharts.com/highcharts/series.priceenvelopes.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.marker">https://api.highcharts.com/highstock/series.priceenvelopes.data.marker</a>
   *
   * @implspec marker?: SeriesPriceenvelopesDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  SeriesPriceenvelopesDataMarkerOptions getMarker();

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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.marker">https://api.highcharts.com/highcharts/series.priceenvelopes.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.marker">https://api.highcharts.com/highstock/series.priceenvelopes.data.marker</a>
   *
   * @implspec marker?: SeriesPriceenvelopesDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(SeriesPriceenvelopesDataMarkerOptions value);

  /**
   * (Highstock) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.name">https://api.highcharts.com/highstock/series.priceenvelopes.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highstock) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.name">https://api.highcharts.com/highstock/series.priceenvelopes.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.selected">https://api.highcharts.com/highcharts/series.priceenvelopes.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.selected">https://api.highcharts.com/highstock/series.priceenvelopes.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.selected">https://api.highcharts.com/gantt/series.priceenvelopes.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.selected">https://api.highcharts.com/highcharts/series.priceenvelopes.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.selected">https://api.highcharts.com/highstock/series.priceenvelopes.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.priceenvelopes.data.selected">https://api.highcharts.com/gantt/series.priceenvelopes.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.x">https://api.highcharts.com/highcharts/series.priceenvelopes.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.x">https://api.highcharts.com/highstock/series.priceenvelopes.data.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.x">https://api.highcharts.com/highcharts/series.priceenvelopes.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.x">https://api.highcharts.com/highstock/series.priceenvelopes.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.y">https://api.highcharts.com/highcharts/series.priceenvelopes.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.y">https://api.highcharts.com/highstock/series.priceenvelopes.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.priceenvelopes.data.y">https://api.highcharts.com/highcharts/series.priceenvelopes.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.priceenvelopes.data.y">https://api.highcharts.com/highstock/series.priceenvelopes.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
