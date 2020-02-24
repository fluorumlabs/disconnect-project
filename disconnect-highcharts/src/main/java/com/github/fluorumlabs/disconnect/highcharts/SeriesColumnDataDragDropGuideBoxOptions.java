package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Style options for the guide box. The guide
 * box has one state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.column.data.dragDrop.guideBox">https://api.highcharts.com/highcharts/series.column.data.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highstock/series.column.data.dragDrop.guideBox">https://api.highcharts.com/highstock/series.column.data.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.column.data.dragDrop.guideBox">https://api.highcharts.com/highmaps/series.column.data.dragDrop.guideBox</a>
 *
 */
public interface SeriesColumnDataDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.column.data.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/series.column.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/series.column.data.dragDrop.guideBox.default">https://api.highcharts.com/highstock/series.column.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.column.data.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/series.column.data.dragDrop.guideBox.default</a>
   *
   * @implspec default?: SeriesColumnDataDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  SeriesColumnDataDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box default
   * state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.column.data.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/series.column.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highstock/series.column.data.dragDrop.guideBox.default">https://api.highcharts.com/highstock/series.column.data.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.column.data.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/series.column.data.dragDrop.guideBox.default</a>
   *
   * @implspec default?: SeriesColumnDataDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(SeriesColumnDataDragDropGuideBoxDefaultOptions value);
}
