package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.mappoint.dragDrop.guideBox</a>
 *
 */
public interface PlotMappointDragDropGuideBoxOptions extends Any {
  /**
   * (Highmaps) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.mappoint.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotMappointDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotMappointDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highmaps) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.mappoint.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotMappointDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotMappointDragDropGuideBoxDefaultOptions value);
}
