package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Style options for the guide box. The guide box has one
 * state by default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox</a>
 *
 */
public interface PlotTilemapDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highmaps) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotTilemapDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotTilemapDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts, Highmaps) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.tilemap.dragDrop.guideBox.default</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.tilemap.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotTilemapDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotTilemapDragDropGuideBoxDefaultOptions value);
}
