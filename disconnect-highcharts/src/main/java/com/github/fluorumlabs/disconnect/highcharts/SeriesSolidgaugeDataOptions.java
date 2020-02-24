package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>solidgauge</code>
 * series type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>y</code> options. Example:(see online documentation for example)
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
 * The typical gauge only contains a single data value.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data">https://api.highcharts.com/highcharts/series.solidgauge.data</a>
 *
 */
public interface SeriesSolidgaugeDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.className">https://api.highcharts.com/highcharts/series.solidgauge.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.className">https://api.highcharts.com/gantt/series.solidgauge.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.className">https://api.highcharts.com/highcharts/series.solidgauge.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.className">https://api.highcharts.com/gantt/series.solidgauge.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.color">https://api.highcharts.com/highcharts/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.color">https://api.highcharts.com/highstock/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.color">https://api.highcharts.com/gantt/series.solidgauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.color">https://api.highcharts.com/highcharts/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.color">https://api.highcharts.com/highstock/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.color">https://api.highcharts.com/gantt/series.solidgauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.color">https://api.highcharts.com/highcharts/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.color">https://api.highcharts.com/highstock/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.color">https://api.highcharts.com/gantt/series.solidgauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.color">https://api.highcharts.com/highcharts/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.color">https://api.highcharts.com/highstock/series.solidgauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.color">https://api.highcharts.com/gantt/series.solidgauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.colorIndex">https://api.highcharts.com/highcharts/series.solidgauge.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.colorIndex">https://api.highcharts.com/gantt/series.solidgauge.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.colorIndex">https://api.highcharts.com/highcharts/series.solidgauge.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.colorIndex">https://api.highcharts.com/gantt/series.solidgauge.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.dataLabels">https://api.highcharts.com/highcharts/series.solidgauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.dataLabels">https://api.highcharts.com/highstock/series.solidgauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.dataLabels">https://api.highcharts.com/gantt/series.solidgauge.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.dataLabels">https://api.highcharts.com/highcharts/series.solidgauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.dataLabels">https://api.highcharts.com/highstock/series.solidgauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.dataLabels">https://api.highcharts.com/gantt/series.solidgauge.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.description">https://api.highcharts.com/highcharts/series.solidgauge.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.description">https://api.highcharts.com/highcharts/series.solidgauge.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.dragDrop">https://api.highcharts.com/highcharts/series.solidgauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.dragDrop">https://api.highcharts.com/highstock/series.solidgauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.solidgauge.data.dragDrop">https://api.highcharts.com/highmaps/series.solidgauge.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesSolidgaugeDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesSolidgaugeDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.dragDrop">https://api.highcharts.com/highcharts/series.solidgauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.dragDrop">https://api.highcharts.com/highstock/series.solidgauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.solidgauge.data.dragDrop">https://api.highcharts.com/highmaps/series.solidgauge.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesSolidgaugeDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesSolidgaugeDataDragDropOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.events">https://api.highcharts.com/highcharts/series.solidgauge.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.events">https://api.highcharts.com/highstock/series.solidgauge.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.events">https://api.highcharts.com/gantt/series.solidgauge.data.events</a>
   *
   * @implspec events?: SeriesSolidgaugeDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesSolidgaugeDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.events">https://api.highcharts.com/highcharts/series.solidgauge.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.events">https://api.highcharts.com/highstock/series.solidgauge.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.events">https://api.highcharts.com/gantt/series.solidgauge.data.events</a>
   *
   * @implspec events?: SeriesSolidgaugeDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesSolidgaugeDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.id">https://api.highcharts.com/highcharts/series.solidgauge.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.id">https://api.highcharts.com/highstock/series.solidgauge.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.id">https://api.highcharts.com/gantt/series.solidgauge.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.id">https://api.highcharts.com/highcharts/series.solidgauge.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.id">https://api.highcharts.com/highstock/series.solidgauge.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.id">https://api.highcharts.com/gantt/series.solidgauge.data.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts) The inner radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.innerRadius">https://api.highcharts.com/highcharts/series.solidgauge.data.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  @Nullable
  Unknown getInnerRadius();

  /**
   * (Highcharts) The inner radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.innerRadius">https://api.highcharts.com/highcharts/series.solidgauge.data.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(double value);

  /**
   * (Highcharts) The inner radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.innerRadius">https://api.highcharts.com/highcharts/series.solidgauge.data.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(String value);

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.labelrank">https://api.highcharts.com/highcharts/series.solidgauge.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.labelrank">https://api.highcharts.com/highcharts/series.solidgauge.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.name">https://api.highcharts.com/highcharts/series.solidgauge.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.name">https://api.highcharts.com/highcharts/series.solidgauge.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts) The outer radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.radius">https://api.highcharts.com/highcharts/series.solidgauge.data.radius</a>
   *
   * @implspec radius?: (number|string);
   *
   */
  @JSProperty("radius")
  @Nullable
  Unknown getRadius();

  /**
   * (Highcharts) The outer radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.radius">https://api.highcharts.com/highcharts/series.solidgauge.data.radius</a>
   *
   * @implspec radius?: (number|string);
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts) The outer radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.radius">https://api.highcharts.com/highcharts/series.solidgauge.data.radius</a>
   *
   * @implspec radius?: (number|string);
   *
   */
  @JSProperty("radius")
  void setRadius(String value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.selected">https://api.highcharts.com/highcharts/series.solidgauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.selected">https://api.highcharts.com/highstock/series.solidgauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.selected">https://api.highcharts.com/gantt/series.solidgauge.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.selected">https://api.highcharts.com/highcharts/series.solidgauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.selected">https://api.highcharts.com/highstock/series.solidgauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.solidgauge.data.selected">https://api.highcharts.com/gantt/series.solidgauge.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.y">https://api.highcharts.com/highcharts/series.solidgauge.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.y">https://api.highcharts.com/highstock/series.solidgauge.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.solidgauge.data.y">https://api.highcharts.com/highcharts/series.solidgauge.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.solidgauge.data.y">https://api.highcharts.com/highstock/series.solidgauge.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
