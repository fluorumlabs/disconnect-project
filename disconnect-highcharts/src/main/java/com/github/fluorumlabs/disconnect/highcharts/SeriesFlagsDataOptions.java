package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An array of data points for the series. For the <code>flags</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available.</li>
 * </ol>
 * <pre><code class="language-js">text: &quot;Second event&quot; }]&lt;/pre&gt;
 *
 * @see https://api.highcharts.com/highstock/series.flags.data
 * </code></pre>
 */
public interface SeriesFlagsDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.className">https://api.highcharts.com/highcharts/series.flags.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.className">https://api.highcharts.com/gantt/series.flags.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.className">https://api.highcharts.com/highcharts/series.flags.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.className">https://api.highcharts.com/gantt/series.flags.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.color">https://api.highcharts.com/highcharts/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.color">https://api.highcharts.com/highstock/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.color">https://api.highcharts.com/gantt/series.flags.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.color">https://api.highcharts.com/highcharts/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.color">https://api.highcharts.com/highstock/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.color">https://api.highcharts.com/gantt/series.flags.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.color">https://api.highcharts.com/highcharts/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.color">https://api.highcharts.com/highstock/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.color">https://api.highcharts.com/gantt/series.flags.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.color">https://api.highcharts.com/highcharts/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.color">https://api.highcharts.com/highstock/series.flags.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.color">https://api.highcharts.com/gantt/series.flags.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.colorIndex">https://api.highcharts.com/highcharts/series.flags.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.colorIndex">https://api.highcharts.com/gantt/series.flags.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.colorIndex">https://api.highcharts.com/highcharts/series.flags.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.colorIndex">https://api.highcharts.com/gantt/series.flags.data.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highstock) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.description">https://api.highcharts.com/highstock/series.flags.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.description">https://api.highcharts.com/highstock/series.flags.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.dragDrop">https://api.highcharts.com/highcharts/series.flags.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.dragDrop">https://api.highcharts.com/highstock/series.flags.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.flags.data.dragDrop">https://api.highcharts.com/highmaps/series.flags.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesFlagsDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesFlagsDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.dragDrop">https://api.highcharts.com/highcharts/series.flags.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.dragDrop">https://api.highcharts.com/highstock/series.flags.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.flags.data.dragDrop">https://api.highcharts.com/highmaps/series.flags.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesFlagsDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesFlagsDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.drilldown">https://api.highcharts.com/highcharts/series.flags.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.drilldown">https://api.highcharts.com/highcharts/series.flags.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.events">https://api.highcharts.com/highcharts/series.flags.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.events">https://api.highcharts.com/highstock/series.flags.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.events">https://api.highcharts.com/gantt/series.flags.data.events</a>
   *
   * @implspec events?: SeriesFlagsDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesFlagsDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.events">https://api.highcharts.com/highcharts/series.flags.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.events">https://api.highcharts.com/highstock/series.flags.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.events">https://api.highcharts.com/gantt/series.flags.data.events</a>
   *
   * @implspec events?: SeriesFlagsDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesFlagsDataEventsOptions value);

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.fillColor">https://api.highcharts.com/highstock/series.flags.data.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.fillColor">https://api.highcharts.com/highstock/series.flags.data.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.fillColor">https://api.highcharts.com/highstock/series.flags.data.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.id">https://api.highcharts.com/highcharts/series.flags.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.id">https://api.highcharts.com/highstock/series.flags.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.id">https://api.highcharts.com/gantt/series.flags.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.id">https://api.highcharts.com/highcharts/series.flags.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.id">https://api.highcharts.com/highstock/series.flags.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.id">https://api.highcharts.com/gantt/series.flags.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.labelrank">https://api.highcharts.com/highstock/series.flags.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.labelrank">https://api.highcharts.com/highstock/series.flags.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.selected">https://api.highcharts.com/highcharts/series.flags.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.selected">https://api.highcharts.com/highstock/series.flags.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.selected">https://api.highcharts.com/gantt/series.flags.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.selected">https://api.highcharts.com/highcharts/series.flags.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.selected">https://api.highcharts.com/highstock/series.flags.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.flags.data.selected">https://api.highcharts.com/gantt/series.flags.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highstock) The longer text to be shown in the flag's tooltip.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.text">https://api.highcharts.com/highstock/series.flags.data.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highstock) The longer text to be shown in the flag's tooltip.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.text">https://api.highcharts.com/highstock/series.flags.data.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highstock) The short text to be shown on the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.title">https://api.highcharts.com/highstock/series.flags.data.title</a>
   *
   * @implspec title?: string;
   *
   */
  @JSProperty("title")
  @Nullable
  String getTitle();

  /**
   * (Highstock) The short text to be shown on the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.title">https://api.highcharts.com/highstock/series.flags.data.title</a>
   *
   * @implspec title?: string;
   *
   */
  @JSProperty("title")
  void setTitle(String value);

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.x">https://api.highcharts.com/highcharts/series.flags.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.x">https://api.highcharts.com/highstock/series.flags.data.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.flags.data.x">https://api.highcharts.com/highcharts/series.flags.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.flags.data.x">https://api.highcharts.com/highstock/series.flags.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);
}
