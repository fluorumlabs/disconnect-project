package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The overview of the chart's series. The legend object is instanciated
 * internally in the chart constructor, and is available from the <code>chart.legend</code>
 * property. Each chart has only one legend.
 *
 */
public interface Legend extends Any {
  /**
   * The overview of the chart's series. The legend object is instanciated
   * internally in the chart constructor, and is available from the
   * <code>chart.legend</code> property. Each chart has only one legend.
   *
   * @param chart
   * The chart instance.
   *
   * @param options
   * Legend options.
   *
   * @implspec constructor(chart: Chart, options: LegendOptions);
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Legend(chart, options)"
  )
  static Legend create(Chart chart, LegendOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * All items for the legend, which is an array of series for most series and
   * an array of points for pie series and its derivatives.
   *
   * @implspec allItems: Array&lt;(Point|Series)&gt;;
   *
   */
  @JSProperty("allItems")
  Array<Unknown> getAllItems();

  /**
   * All items for the legend, which is an array of series for most series and
   * an array of points for pie series and its derivatives.
   *
   * @implspec allItems: Array&lt;(Point|Series)&gt;;
   *
   */
  @JSProperty("allItems")
  void setAllItems(Array<Unknown> value);

  /**
   * SVG element of the legend box.
   *
   * @implspec box: SVGElement;
   *
   */
  @JSProperty("box")
  SVGElement getBox();

  /**
   * SVG element of the legend box.
   *
   * @implspec box: SVGElement;
   *
   */
  @JSProperty("box")
  void setBox(SVGElement value);

  /**
   * Chart of this legend.
   *
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * Chart of this legend.
   *
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  void setChart(Chart value);

  /**
   * SVG group of the legend.
   *
   * @implspec group: SVGElement;
   *
   */
  @JSProperty("group")
  SVGElement getGroup();

  /**
   * SVG group of the legend.
   *
   * @implspec group: SVGElement;
   *
   */
  @JSProperty("group")
  void setGroup(SVGElement value);

  /**
   * Legend options.
   *
   * @implspec options: LegendOptions;
   *
   */
  @JSProperty("options")
  LegendOptions getOptions();

  /**
   * Legend options.
   *
   * @implspec options: LegendOptions;
   *
   */
  @JSProperty("options")
  void setOptions(LegendOptions value);

  /**
   * SVG element of the legend title.
   *
   * @implspec title: SVGElement;
   *
   */
  @JSProperty("title")
  SVGElement getTitle();

  /**
   * SVG element of the legend title.
   *
   * @implspec title: SVGElement;
   *
   */
  @JSProperty("title")
  void setTitle(SVGElement value);

  /**
   * Set the legend item text.
   *
   * @param item
   * The item for which to update the text in the legend.
   *
   * @implspec setText(item: (Point|Series)): void;
   *
   */
  void setText(Point item);

  /**
   * Set the legend item text.
   *
   * @param item
   * The item for which to update the text in the legend.
   *
   * @implspec setText(item: (Point|Series)): void;
   *
   */
  void setText(Series item);

  /**
   * Update the legend with new options. Equivalent to running <code>chart.update</code>
   * with a legend configuration option.
   *
   * @param options
   * Legend options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @implspec update(options: LegendOptions, redraw?: boolean): void;
   *
   */
  void update(LegendOptions options, boolean redraw);

  /**
   * Update the legend with new options. Equivalent to running <code>chart.update</code>
   * with a legend configuration option.
   *
   * @param options
   * Legend options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @implspec update(options: LegendOptions, redraw?: boolean): void;
   *
   */
  void update(LegendOptions options);
}
