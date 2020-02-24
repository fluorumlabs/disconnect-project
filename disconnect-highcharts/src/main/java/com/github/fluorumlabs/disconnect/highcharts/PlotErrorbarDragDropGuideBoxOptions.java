package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Style options for the guide box. The guide box has
 * one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox</a>
 *
 */
public interface PlotErrorbarDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotErrorbarDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotErrorbarDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.errorbar.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.errorbar.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotErrorbarDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotErrorbarDragDropGuideBoxDefaultOptions value);
}
