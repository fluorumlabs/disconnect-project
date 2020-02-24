package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>gauge</code> series
 * type, points can be given in the following ways:
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
 * points exceeds the series' turboThreshold, this option is not available.
 *
 * </li>
 * </ol>
 * <pre><code class="language-js">&quot;Point1&quot;, color: &quot;#FF00FF&quot; }]&lt;/pre&gt;
 *
 * The typical gauge only contains a single data value.
 *
 * @see https://api.highcharts.com/highcharts/series.gauge.data
 * </code></pre>
 */
public interface SeriesGaugeDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.className">https://api.highcharts.com/highcharts/series.gauge.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.className">https://api.highcharts.com/gantt/series.gauge.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.className">https://api.highcharts.com/highcharts/series.gauge.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.className">https://api.highcharts.com/gantt/series.gauge.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.color">https://api.highcharts.com/highcharts/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.color">https://api.highcharts.com/highstock/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.color">https://api.highcharts.com/gantt/series.gauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.color">https://api.highcharts.com/highcharts/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.color">https://api.highcharts.com/highstock/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.color">https://api.highcharts.com/gantt/series.gauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.color">https://api.highcharts.com/highcharts/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.color">https://api.highcharts.com/highstock/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.color">https://api.highcharts.com/gantt/series.gauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.color">https://api.highcharts.com/highcharts/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.color">https://api.highcharts.com/highstock/series.gauge.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.color">https://api.highcharts.com/gantt/series.gauge.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.colorIndex">https://api.highcharts.com/highcharts/series.gauge.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.colorIndex">https://api.highcharts.com/gantt/series.gauge.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.colorIndex">https://api.highcharts.com/highcharts/series.gauge.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.colorIndex">https://api.highcharts.com/gantt/series.gauge.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.dataLabels">https://api.highcharts.com/highcharts/series.gauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.dataLabels">https://api.highcharts.com/highstock/series.gauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.dataLabels">https://api.highcharts.com/gantt/series.gauge.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.dataLabels">https://api.highcharts.com/highcharts/series.gauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.dataLabels">https://api.highcharts.com/highstock/series.gauge.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.dataLabels">https://api.highcharts.com/gantt/series.gauge.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.description">https://api.highcharts.com/highcharts/series.gauge.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.description">https://api.highcharts.com/highcharts/series.gauge.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.dragDrop">https://api.highcharts.com/highcharts/series.gauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.dragDrop">https://api.highcharts.com/highstock/series.gauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gauge.data.dragDrop">https://api.highcharts.com/highmaps/series.gauge.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesGaugeDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesGaugeDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.dragDrop">https://api.highcharts.com/highcharts/series.gauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.dragDrop">https://api.highcharts.com/highstock/series.gauge.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gauge.data.dragDrop">https://api.highcharts.com/highmaps/series.gauge.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesGaugeDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesGaugeDataDragDropOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.events">https://api.highcharts.com/highcharts/series.gauge.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.events">https://api.highcharts.com/highstock/series.gauge.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.events">https://api.highcharts.com/gantt/series.gauge.data.events</a>
   *
   * @implspec events?: SeriesGaugeDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesGaugeDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.events">https://api.highcharts.com/highcharts/series.gauge.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.events">https://api.highcharts.com/highstock/series.gauge.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.events">https://api.highcharts.com/gantt/series.gauge.data.events</a>
   *
   * @implspec events?: SeriesGaugeDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesGaugeDataEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.id">https://api.highcharts.com/highcharts/series.gauge.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.id">https://api.highcharts.com/highstock/series.gauge.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.id">https://api.highcharts.com/gantt/series.gauge.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.id">https://api.highcharts.com/highcharts/series.gauge.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.id">https://api.highcharts.com/highstock/series.gauge.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.id">https://api.highcharts.com/gantt/series.gauge.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.labelrank">https://api.highcharts.com/highcharts/series.gauge.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.labelrank">https://api.highcharts.com/highcharts/series.gauge.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.name">https://api.highcharts.com/highcharts/series.gauge.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.name">https://api.highcharts.com/highcharts/series.gauge.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.selected">https://api.highcharts.com/highcharts/series.gauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.selected">https://api.highcharts.com/highstock/series.gauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.selected">https://api.highcharts.com/gantt/series.gauge.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.selected">https://api.highcharts.com/highcharts/series.gauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.selected">https://api.highcharts.com/highstock/series.gauge.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.gauge.data.selected">https://api.highcharts.com/gantt/series.gauge.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.y">https://api.highcharts.com/highcharts/series.gauge.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.y">https://api.highcharts.com/highstock/series.gauge.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gauge.data.y">https://api.highcharts.com/highcharts/series.gauge.data.y</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gauge.data.y">https://api.highcharts.com/highstock/series.gauge.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
