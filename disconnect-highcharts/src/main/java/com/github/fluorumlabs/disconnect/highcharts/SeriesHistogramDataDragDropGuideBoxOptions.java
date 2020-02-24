package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Style options for the guide box. The guide
 * box has one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.histogram.data.dragDrop.guideBox">https://api.highcharts.com/highcharts/series.histogram.data.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/series.histogram.data.dragDrop.guideBox">https://api.highcharts.com/highstock/series.histogram.data.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.histogram.data.dragDrop.guideBox">https://api.highcharts.com/highmaps/series.histogram.data.dragDrop.guideBox</a>
 *
 */
public interface SeriesHistogramDataDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.histogram.data.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/series.histogram.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/series.histogram.data.dragDrop.guideBox.default">https://api.highcharts.com/highstock/series.histogram.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.histogram.data.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/series.histogram.data.dragDrop.guideBox.default</a>
   *
   * @implspec default?: SeriesHistogramDataDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  SeriesHistogramDataDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.histogram.data.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/series.histogram.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/series.histogram.data.dragDrop.guideBox.default">https://api.highcharts.com/highstock/series.histogram.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.histogram.data.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/series.histogram.data.dragDrop.guideBox.default</a>
   *
   * @implspec default?: SeriesHistogramDataDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(SeriesHistogramDataDragDropGuideBoxDefaultOptions value);
}
