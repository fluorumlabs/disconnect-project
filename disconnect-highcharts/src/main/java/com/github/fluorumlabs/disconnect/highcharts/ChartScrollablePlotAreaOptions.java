package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Gantt) Options for a scrollable plot area. This feature provides
 * a minimum width for the plot area of the chart. If the width gets smaller
 * than this, typically on mobile devices, a native browser scrollbar is
 * presented below the chart. This scrollbar provides smooth scrolling for the
 * contents of the plot area, whereas the title, legend and axes are fixed.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea">https://api.highcharts.com/highcharts/chart.scrollablePlotArea</a>
 * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea">https://api.highcharts.com/gantt/chart.scrollablePlotArea</a>
 *
 */
public interface ChartScrollablePlotAreaOptions extends Any {
  /**
   * (Highcharts, Gantt) The minimum width for the plot area. If it gets
   * smaller than this, the plot area will become scrollable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea.minWidth">https://api.highcharts.com/highcharts/chart.scrollablePlotArea.minWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea.minWidth">https://api.highcharts.com/gantt/chart.scrollablePlotArea.minWidth</a>
   *
   * @implspec minWidth?: number;
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highcharts, Gantt) The minimum width for the plot area. If it gets
   * smaller than this, the plot area will become scrollable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea.minWidth">https://api.highcharts.com/highcharts/chart.scrollablePlotArea.minWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea.minWidth">https://api.highcharts.com/gantt/chart.scrollablePlotArea.minWidth</a>
   *
   * @implspec minWidth?: number;
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);

  /**
   * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
   * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
   * aligns it to the right. Typically we would use 1 if the chart has right
   * aligned Y axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea.scrollPositionX">https://api.highcharts.com/highcharts/chart.scrollablePlotArea.scrollPositionX</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea.scrollPositionX">https://api.highcharts.com/gantt/chart.scrollablePlotArea.scrollPositionX</a>
   *
   * @implspec scrollPositionX?: number;
   *
   */
  @JSProperty("scrollPositionX")
  double getScrollPositionX();

  /**
   * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
   * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
   * aligns it to the right. Typically we would use 1 if the chart has right
   * aligned Y axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea.scrollPositionX">https://api.highcharts.com/highcharts/chart.scrollablePlotArea.scrollPositionX</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea.scrollPositionX">https://api.highcharts.com/gantt/chart.scrollablePlotArea.scrollPositionX</a>
   *
   * @implspec scrollPositionX?: number;
   *
   */
  @JSProperty("scrollPositionX")
  void setScrollPositionX(double value);
}
