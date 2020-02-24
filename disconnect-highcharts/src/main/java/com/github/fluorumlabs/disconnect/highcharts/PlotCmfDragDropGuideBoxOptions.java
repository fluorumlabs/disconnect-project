package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.cmf.dragDrop.guideBox</a>
 *
 */
public interface PlotCmfDragDropGuideBoxOptions extends Any {
  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.cmf.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotCmfDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotCmfDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.cmf.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotCmfDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotCmfDragDropGuideBoxDefaultOptions value);
}
