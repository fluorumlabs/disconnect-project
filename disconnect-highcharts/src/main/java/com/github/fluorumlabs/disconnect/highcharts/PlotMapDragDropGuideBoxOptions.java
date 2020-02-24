package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.guideBox</a>
 *
 */
public interface PlotMapDragDropGuideBoxOptions extends Any {
  /**
   * (Highmaps) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotMapDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotMapDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highmaps) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotMapDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotMapDragDropGuideBoxDefaultOptions value);
}
