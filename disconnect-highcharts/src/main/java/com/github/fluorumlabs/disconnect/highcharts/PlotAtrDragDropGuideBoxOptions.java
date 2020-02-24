package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.atr.dragDrop.guideBox</a>
 *
 */
public interface PlotAtrDragDropGuideBoxOptions extends Any {
  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.atr.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotAtrDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotAtrDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.atr.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotAtrDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotAtrDragDropGuideBoxDefaultOptions value);
}
