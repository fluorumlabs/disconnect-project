package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of arrays with 5 or 4 values. In this case, the values correspond
 * to <code>x,open,high,low,close</code>. If the first value is a string, it is applied as
 * the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also
 * be omitted, in which case the inner arrays should be of length 4. Then the
 * <code>x</code> value is automatically calculated, either starting at 0 and incremented
 * by 1, or from <code>pointStart</code> and <code>pointInterval</code> given in the series
 * options.(see online documentation for example)
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
 * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data">https://api.highcharts.com/highstock/series.ohlc.data</a>
 *
 */
public interface SeriesOhlcDataOptions extends Any {
  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.className">https://api.highcharts.com/highcharts/series.ohlc.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.className">https://api.highcharts.com/gantt/series.ohlc.data.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.className">https://api.highcharts.com/highcharts/series.ohlc.data.className</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.className">https://api.highcharts.com/gantt/series.ohlc.data.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highstock) The closing value of each data point.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.close">https://api.highcharts.com/highstock/series.ohlc.data.close</a>
   *
   * @implspec close?: number;
   *
   */
  @JSProperty("close")
  double getClose();

  /**
   * (Highstock) The closing value of each data point.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.close">https://api.highcharts.com/highstock/series.ohlc.data.close</a>
   *
   * @implspec close?: number;
   *
   */
  @JSProperty("close")
  void setClose(double value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.color">https://api.highcharts.com/highcharts/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.color">https://api.highcharts.com/highstock/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.color">https://api.highcharts.com/gantt/series.ohlc.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.color">https://api.highcharts.com/highcharts/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.color">https://api.highcharts.com/highstock/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.color">https://api.highcharts.com/gantt/series.ohlc.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.color">https://api.highcharts.com/highcharts/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.color">https://api.highcharts.com/highstock/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.color">https://api.highcharts.com/gantt/series.ohlc.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.color">https://api.highcharts.com/highcharts/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.color">https://api.highcharts.com/highstock/series.ohlc.data.color</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.color">https://api.highcharts.com/gantt/series.ohlc.data.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.colorIndex">https://api.highcharts.com/highcharts/series.ohlc.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.colorIndex">https://api.highcharts.com/gantt/series.ohlc.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.colorIndex">https://api.highcharts.com/highcharts/series.ohlc.data.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.colorIndex">https://api.highcharts.com/gantt/series.ohlc.data.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.dataLabels">https://api.highcharts.com/highcharts/series.ohlc.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.dataLabels">https://api.highcharts.com/highstock/series.ohlc.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.dataLabels">https://api.highcharts.com/gantt/series.ohlc.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.dataLabels">https://api.highcharts.com/highcharts/series.ohlc.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.dataLabels">https://api.highcharts.com/highstock/series.ohlc.data.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.dataLabels">https://api.highcharts.com/gantt/series.ohlc.data.dataLabels</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.description">https://api.highcharts.com/highstock/series.ohlc.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.description">https://api.highcharts.com/highstock/series.ohlc.data.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.dragDrop">https://api.highcharts.com/highcharts/series.ohlc.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.dragDrop">https://api.highcharts.com/highstock/series.ohlc.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.ohlc.data.dragDrop">https://api.highcharts.com/highmaps/series.ohlc.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesOhlcDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesOhlcDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.dragDrop">https://api.highcharts.com/highcharts/series.ohlc.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.dragDrop">https://api.highcharts.com/highstock/series.ohlc.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.ohlc.data.dragDrop">https://api.highcharts.com/highmaps/series.ohlc.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesOhlcDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesOhlcDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.drilldown">https://api.highcharts.com/highcharts/series.ohlc.data.drilldown</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.drilldown">https://api.highcharts.com/highcharts/series.ohlc.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.events">https://api.highcharts.com/highcharts/series.ohlc.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.events">https://api.highcharts.com/highstock/series.ohlc.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.events">https://api.highcharts.com/gantt/series.ohlc.data.events</a>
   *
   * @implspec events?: SeriesOhlcDataEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesOhlcDataEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Individual point events
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.events">https://api.highcharts.com/highcharts/series.ohlc.data.events</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.events">https://api.highcharts.com/highstock/series.ohlc.data.events</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.events">https://api.highcharts.com/gantt/series.ohlc.data.events</a>
   *
   * @implspec events?: SeriesOhlcDataEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(SeriesOhlcDataEventsOptions value);

  /**
   * (Highcharts, Highstock) The high or maximum value for each data point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.high">https://api.highcharts.com/highcharts/series.ohlc.data.high</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.high">https://api.highcharts.com/highstock/series.ohlc.data.high</a>
   *
   * @implspec high?: number;
   *
   */
  @JSProperty("high")
  double getHigh();

  /**
   * (Highcharts, Highstock) The high or maximum value for each data point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.high">https://api.highcharts.com/highcharts/series.ohlc.data.high</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.high">https://api.highcharts.com/highstock/series.ohlc.data.high</a>
   *
   * @implspec high?: number;
   *
   */
  @JSProperty("high")
  void setHigh(double value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.id">https://api.highcharts.com/highcharts/series.ohlc.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.id">https://api.highcharts.com/highstock/series.ohlc.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.id">https://api.highcharts.com/gantt/series.ohlc.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.id">https://api.highcharts.com/highcharts/series.ohlc.data.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.id">https://api.highcharts.com/highstock/series.ohlc.data.id</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.id">https://api.highcharts.com/gantt/series.ohlc.data.id</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.labelrank">https://api.highcharts.com/highstock/series.ohlc.data.labelrank</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.labelrank">https://api.highcharts.com/highstock/series.ohlc.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts, Highstock) The low or minimum value for each data point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.low">https://api.highcharts.com/highcharts/series.ohlc.data.low</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.low">https://api.highcharts.com/highstock/series.ohlc.data.low</a>
   *
   * @implspec low?: number;
   *
   */
  @JSProperty("low")
  double getLow();

  /**
   * (Highcharts, Highstock) The low or minimum value for each data point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.low">https://api.highcharts.com/highcharts/series.ohlc.data.low</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.low">https://api.highcharts.com/highstock/series.ohlc.data.low</a>
   *
   * @implspec low?: number;
   *
   */
  @JSProperty("low")
  void setLow(double value);

  /**
   * (Highstock) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.name">https://api.highcharts.com/highstock/series.ohlc.data.name</a>
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
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.name">https://api.highcharts.com/highstock/series.ohlc.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highstock) The opening value of each data point.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.open">https://api.highcharts.com/highstock/series.ohlc.data.open</a>
   *
   * @implspec open?: number;
   *
   */
  @JSProperty("open")
  double getOpen();

  /**
   * (Highstock) The opening value of each data point.
   *
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.open">https://api.highcharts.com/highstock/series.ohlc.data.open</a>
   *
   * @implspec open?: number;
   *
   */
  @JSProperty("open")
  void setOpen(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.selected">https://api.highcharts.com/highcharts/series.ohlc.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.selected">https://api.highcharts.com/highstock/series.ohlc.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.selected">https://api.highcharts.com/gantt/series.ohlc.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.selected">https://api.highcharts.com/highcharts/series.ohlc.data.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.selected">https://api.highcharts.com/highstock/series.ohlc.data.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/series.ohlc.data.selected">https://api.highcharts.com/gantt/series.ohlc.data.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.x">https://api.highcharts.com/highcharts/series.ohlc.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.x">https://api.highcharts.com/highstock/series.ohlc.data.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/series.ohlc.data.x">https://api.highcharts.com/highcharts/series.ohlc.data.x</a>
   * @see <a href="https://api.highcharts.com/highstock/series.ohlc.data.x">https://api.highcharts.com/highstock/series.ohlc.data.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);
}
