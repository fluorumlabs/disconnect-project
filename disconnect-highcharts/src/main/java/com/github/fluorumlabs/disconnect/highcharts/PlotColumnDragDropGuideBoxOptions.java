package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Style options for the guide box. The guide box has
 * one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.column.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.column.dragDrop.guideBox</a>
 *
 */
public interface PlotColumnDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.column.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.column.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotColumnDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotColumnDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.column.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.column.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotColumnDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotColumnDragDropGuideBoxDefaultOptions value);
}
