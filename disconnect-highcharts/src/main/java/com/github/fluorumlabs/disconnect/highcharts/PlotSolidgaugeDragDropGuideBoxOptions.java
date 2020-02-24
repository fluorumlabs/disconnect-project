package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dragDrop.guideBox</a>
 *
 */
public interface PlotSolidgaugeDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotSolidgaugeDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotSolidgaugeDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.solidgauge.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotSolidgaugeDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotSolidgaugeDragDropGuideBoxDefaultOptions value);
}
