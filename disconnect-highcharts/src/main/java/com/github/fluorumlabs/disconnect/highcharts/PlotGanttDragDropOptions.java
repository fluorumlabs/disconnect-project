package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) The draggable-points module allows points to be moved around or
 * modified in the chart. In addition to the options mentioned under the
 * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop</a>
 *
 */
public interface PlotGanttDragDropOptions extends Any {
  /**
   * (Gantt) Allow end value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableEnd">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableEnd</a>
   *
   * @implspec draggableEnd?: boolean;
   *
   */
  @JSProperty("draggableEnd")
  boolean getDraggableEnd();

  /**
   * (Gantt) Allow end value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableEnd">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableEnd</a>
   *
   * @implspec draggableEnd?: boolean;
   *
   */
  @JSProperty("draggableEnd")
  void setDraggableEnd(boolean value);

  /**
   * (Gantt) Allow start value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableStart">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableStart</a>
   *
   * @implspec draggableStart?: boolean;
   *
   */
  @JSProperty("draggableStart")
  boolean getDraggableStart();

  /**
   * (Gantt) Allow start value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableStart">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableStart</a>
   *
   * @implspec draggableStart?: boolean;
   *
   */
  @JSProperty("draggableStart")
  void setDraggableStart(boolean value);

  /**
   * (Gantt) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Gantt) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Gantt) Allow x value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX1">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX1</a>
   *
   * @implspec draggableX1?: boolean;
   *
   */
  @JSProperty("draggableX1")
  boolean getDraggableX1();

  /**
   * (Gantt) Allow x value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX1">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX1</a>
   *
   * @implspec draggableX1?: boolean;
   *
   */
  @JSProperty("draggableX1")
  void setDraggableX1(boolean value);

  /**
   * (Gantt) Allow x2 value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX2">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX2</a>
   *
   * @implspec draggableX2?: boolean;
   *
   */
  @JSProperty("draggableX2")
  boolean getDraggableX2();

  /**
   * (Gantt) Allow x2 value to be dragged individually. Requires
   * <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX2">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableX2</a>
   *
   * @implspec draggableX2?: boolean;
   *
   */
  @JSProperty("draggableX2")
  void setDraggableX2(boolean value);

  /**
   * (Gantt) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Gantt) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Gantt) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotGanttDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotGanttDragDropDragHandleOptions getDragHandle();

  /**
   * (Gantt) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotGanttDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotGanttDragDropDragHandleOptions value);

  /**
   * (Gantt) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Gantt) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Gantt) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Gantt) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Gantt) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Gantt) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Gantt) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Gantt) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Gantt) The X precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Gantt) The X precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionX">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Gantt) The Y precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Gantt) The Y precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionY">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Gantt) The amount of pixels to drag the pointer before it counts as a
   * drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragSensitivity">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Gantt) The amount of pixels to drag the pointer before it counts as a
   * drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragSensitivity">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Gantt) Group the points by a property. Points with the same property
   * value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.groupBy">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Gantt) Group the points by a property. Points with the same property
   * value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.groupBy">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Gantt) Style options for the guide box. The guide box has one state by
   * default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotGanttDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Gantt) Style options for the guide box. The guide box has one state by
   * default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotGanttDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotGanttDragDropGuideBoxOptions value);

  /**
   * (Gantt) Style options for the guide box. The guide box has one state by
   * default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotGanttDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Gantt) Update points as they are dragged. If false, a guide box is drawn
   * to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.liveRedraw">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Gantt) Update points as they are dragged. If false, a guide box is drawn
   * to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.liveRedraw">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
