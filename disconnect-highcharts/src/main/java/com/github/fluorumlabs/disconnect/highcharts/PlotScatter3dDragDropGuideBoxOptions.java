package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.scatter3d.dragDrop.guideBox</a>
 *
 */
public interface PlotScatter3dDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.scatter3d.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotScatter3dDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotScatter3dDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highcharts) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.scatter3d.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotScatter3dDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotScatter3dDragDropGuideBoxDefaultOptions value);
}
