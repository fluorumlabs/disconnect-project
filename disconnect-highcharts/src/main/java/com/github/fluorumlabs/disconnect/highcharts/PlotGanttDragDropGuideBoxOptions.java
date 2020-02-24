package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox</a>
 *
 */
public interface PlotGanttDragDropGuideBoxOptions extends Any {
  /**
   * (Gantt) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotGanttDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotGanttDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Gantt) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotGanttDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotGanttDragDropGuideBoxDefaultOptions value);
}
