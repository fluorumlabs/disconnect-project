package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide box
 * has one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox</a>
 *
 */
public interface PlotXrangeDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox.default">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotXrangeDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotXrangeDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox.default">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotXrangeDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotXrangeDragDropGuideBoxDefaultOptions value);
}
