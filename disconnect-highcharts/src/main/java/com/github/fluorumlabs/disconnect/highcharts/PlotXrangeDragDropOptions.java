package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) The draggable-points module allows points to
 * be moved around or modified in the chart. In addition to the options
 * mentioned under the <code>dragDrop</code> API structure, the module fires three events,
 * point.dragStart, point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop</a>
 *
 */
public interface PlotXrangeDragDropOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX1">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX1</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX1">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX1</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX1">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX1</a>
   *
   * @implspec draggableX1?: boolean;
   *
   */
  @JSProperty("draggableX1")
  boolean getDraggableX1();

  /**
   * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX1">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX1</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX1">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX1</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX1">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX1</a>
   *
   * @implspec draggableX1?: boolean;
   *
   */
  @JSProperty("draggableX1")
  void setDraggableX1(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX2">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX2</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX2">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX2</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX2">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX2</a>
   *
   * @implspec draggableX2?: boolean;
   *
   */
  @JSProperty("draggableX2")
  boolean getDraggableX2();

  /**
   * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX2">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableX2</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX2">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableX2</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX2">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableX2</a>
   *
   * @implspec draggableX2?: boolean;
   *
   */
  @JSProperty("draggableX2")
  void setDraggableX2(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
   * that this is not supported for TreeGrid axes (the default axis type in
   * Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
   * that this is not supported for TreeGrid axes (the default axis type in
   * Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragHandle">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotXrangeDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotXrangeDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts, Highstock, Gantt) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragHandle">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotXrangeDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotXrangeDragDropDragHandleOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
   * moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionX">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionY">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
   * before it counts as a drag operation. This prevents drag/drop to fire
   * when just clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragSensitivity">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
   * before it counts as a drag operation. This prevents drag/drop to fire
   * when just clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragSensitivity">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts, Highstock, Gantt) Group the points by a property. Points
   * with the same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.groupBy">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts, Highstock, Gantt) Group the points by a property. Points
   * with the same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.groupBy">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotXrangeDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotXrangeDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotXrangeDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotXrangeDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
   * false, a guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.liveRedraw">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
   * false, a guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.liveRedraw">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
