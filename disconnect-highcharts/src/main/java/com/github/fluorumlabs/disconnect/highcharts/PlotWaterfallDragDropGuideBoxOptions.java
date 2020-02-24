package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop.guideBox</a>
 *
 */
public interface PlotWaterfallDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotWaterfallDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotWaterfallDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.waterfall.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotWaterfallDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotWaterfallDragDropGuideBoxDefaultOptions value);
}
