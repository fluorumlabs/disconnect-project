package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox</a>
 *
 */
public interface PlotBoxplotDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotBoxplotDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotBoxplotDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotBoxplotDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotBoxplotDragDropGuideBoxDefaultOptions value);
}
