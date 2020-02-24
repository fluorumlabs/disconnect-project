package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Style options for the guide box. The guide
 * box has one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.series.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.series.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.series.dragDrop.guideBox</a>
 *
 */
public interface PlotSeriesDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.series.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.series.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.series.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotSeriesDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotSeriesDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.series.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.series.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.series.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotSeriesDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotSeriesDragDropGuideBoxDefaultOptions value);
}
