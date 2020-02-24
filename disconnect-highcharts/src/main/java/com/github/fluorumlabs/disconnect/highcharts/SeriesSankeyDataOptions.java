package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>sankey</code> series
 * type, points can be given in the following way:
 *
 * An array of objects with named values. The following snippet shows only a few
 * settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available.(see
 * online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data">https://api.highcharts.com/highcharts/series.sankey.data</a>
 *
 */
public interface SeriesSankeyDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.className">https://api.highcharts.com/highcharts/series.sankey.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.className">https://api.highcharts.com/gantt/series.sankey.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.className">https://api.highcharts.com/highcharts/series.sankey.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.className">https://api.highcharts.com/gantt/series.sankey.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.color">https://api.highcharts.com/highcharts/series.sankey.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.color">https://api.highcharts.com/highcharts/series.sankey.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.color">https://api.highcharts.com/highcharts/series.sankey.data.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.color">https://api.highcharts.com/highcharts/series.sankey.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.colorIndex">https://api.highcharts.com/highcharts/series.sankey.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.colorIndex">https://api.highcharts.com/gantt/series.sankey.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.colorIndex">https://api.highcharts.com/highcharts/series.sankey.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.colorIndex">https://api.highcharts.com/gantt/series.sankey.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dataLabels">https://api.highcharts.com/highcharts/series.sankey.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dataLabels">https://api.highcharts.com/highstock/series.sankey.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.dataLabels">https://api.highcharts.com/gantt/series.sankey.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dataLabels">https://api.highcharts.com/highcharts/series.sankey.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dataLabels">https://api.highcharts.com/highstock/series.sankey.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.dataLabels">https://api.highcharts.com/gantt/series.sankey.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.description">https://api.highcharts.com/highcharts/series.sankey.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.description">https://api.highcharts.com/highcharts/series.sankey.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop">https://api.highcharts.com/highstock/series.sankey.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesSankeyDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesSankeyDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop">https://api.highcharts.com/highstock/series.sankey.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesSankeyDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesSankeyDataDragDropOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.events">https://api.highcharts.com/highcharts/series.sankey.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.events">https://api.highcharts.com/highstock/series.sankey.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.events">https://api.highcharts.com/gantt/series.sankey.data.events</a>
   *
   * @implspec events?: SeriesSankeyDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesSankeyDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.events">https://api.highcharts.com/highcharts/series.sankey.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.events">https://api.highcharts.com/highstock/series.sankey.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.events">https://api.highcharts.com/gantt/series.sankey.data.events</a>
   *
   * @implspec events?: SeriesSankeyDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesSankeyDataEventsOptions value);

  /**
   * (Highcharts) The node that the link runs from.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.from">https://api.highcharts.com/highcharts/series.sankey.data.from</a>
   *
   * @implspec from?: string;
   *
   */
  @JSProperty("from")
  @Nullable
  String getFrom();

  /**
   * (Highcharts) The node that the link runs from.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.from">https://api.highcharts.com/highcharts/series.sankey.data.from</a>
   *
   * @implspec from?: string;
   *
   */
  @JSProperty("from")
  void setFrom(String value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.id">https://api.highcharts.com/highcharts/series.sankey.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.id">https://api.highcharts.com/highstock/series.sankey.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.id">https://api.highcharts.com/gantt/series.sankey.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.id">https://api.highcharts.com/highcharts/series.sankey.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.id">https://api.highcharts.com/highstock/series.sankey.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.id">https://api.highcharts.com/gantt/series.sankey.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.labelrank">https://api.highcharts.com/highcharts/series.sankey.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.labelrank">https://api.highcharts.com/highcharts/series.sankey.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.name">https://api.highcharts.com/highcharts/series.sankey.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.name">https://api.highcharts.com/highcharts/series.sankey.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts) Whether the link goes out of the system.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.outgoing">https://api.highcharts.com/highcharts/series.sankey.data.outgoing</a>
   *
   * @implspec outgoing?: boolean;
   *
   */
  @JSProperty("outgoing")
  boolean getOutgoing();

  /**
   * (Highcharts) Whether the link goes out of the system.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.outgoing">https://api.highcharts.com/highcharts/series.sankey.data.outgoing</a>
   *
   * @implspec outgoing?: boolean;
   *
   */
  @JSProperty("outgoing")
  void setOutgoing(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.selected">https://api.highcharts.com/highcharts/series.sankey.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.selected">https://api.highcharts.com/highstock/series.sankey.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.selected">https://api.highcharts.com/gantt/series.sankey.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.selected">https://api.highcharts.com/highcharts/series.sankey.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.selected">https://api.highcharts.com/highstock/series.sankey.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.sankey.data.selected">https://api.highcharts.com/gantt/series.sankey.data.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) The node that the link runs to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.to">https://api.highcharts.com/highcharts/series.sankey.data.to</a>
   *
   * @implspec to?: string;
   *
   */
  @JSProperty("to")
  @Nullable
  String getTo();

  /**
   * (Highcharts) The node that the link runs to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.to">https://api.highcharts.com/highcharts/series.sankey.data.to</a>
   *
   * @implspec to?: string;
   *
   */
  @JSProperty("to")
  void setTo(String value);

  /**
   * (Highcharts) The weight of the link.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.weight">https://api.highcharts.com/highcharts/series.sankey.data.weight</a>
   *
   * @implspec weight?: number;
   *
   */
  @JSProperty("weight")
  double getWeight();

  /**
   * (Highcharts) The weight of the link.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.weight">https://api.highcharts.com/highcharts/series.sankey.data.weight</a>
   *
   * @implspec weight?: number;
   *
   */
  @JSProperty("weight")
  void setWeight(double value);
}
