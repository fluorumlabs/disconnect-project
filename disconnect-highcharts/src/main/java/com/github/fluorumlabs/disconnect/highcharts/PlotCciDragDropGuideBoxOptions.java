package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.cci.dragDrop.guideBox</a>
 *
 */
public interface PlotCciDragDropGuideBoxOptions extends Any {
  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.cci.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotCciDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotCciDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.cci.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotCciDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotCciDragDropGuideBoxDefaultOptions value);
}
