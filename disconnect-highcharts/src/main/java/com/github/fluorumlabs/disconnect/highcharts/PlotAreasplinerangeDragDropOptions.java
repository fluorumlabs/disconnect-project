package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The draggable-points module allows points to be moved
 * around or modified in the chart. In addition to the options mentioned under
 * the <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop</a>
 *
 */
public interface PlotAreasplinerangeDragDropOptions extends Any {
  /**
   * (Highcharts, Highstock) Allow high value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableHigh">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableHigh</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableHigh">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableHigh</a>
   *
   * @implspec draggableHigh?: boolean;
   *
   */
  @JSProperty("draggableHigh")
  boolean getDraggableHigh();

  /**
   * (Highcharts, Highstock) Allow high value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableHigh">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableHigh</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableHigh">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableHigh</a>
   *
   * @implspec draggableHigh?: boolean;
   *
   */
  @JSProperty("draggableHigh")
  void setDraggableHigh(boolean value);

  /**
   * (Highcharts, Highstock) Allow low value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableLow">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableLow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableLow">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableLow</a>
   *
   * @implspec draggableLow?: boolean;
   *
   */
  @JSProperty("draggableLow")
  boolean getDraggableLow();

  /**
   * (Highcharts, Highstock) Allow low value to be dragged individually.
   * Requires <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableLow">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableLow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableLow">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableLow</a>
   *
   * @implspec draggableLow?: boolean;
   *
   */
  @JSProperty("draggableLow")
  void setDraggableLow(boolean value);

  /**
   * (Highcharts, Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highstock) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts, Highstock) Enable dragging in the Y dimension. Note that
   * this is not supported for TreeGrid axes (the default axis type in Gantt
   * charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts, Highstock) Enable dragging in the Y dimension. Note that
   * this is not supported for TreeGrid axes (the default axis type in Gantt
   * charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotAreasplinerangeDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotAreasplinerangeDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts, Highstock) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragHandle">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragHandle">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotAreasplinerangeDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotAreasplinerangeDragDropDragHandleOptions value);

  /**
   * (Highcharts, Highstock) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts, Highstock) Set the maximum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts, Highstock) Set the maximum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts, Highstock) Set the maximum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts, Highstock) Set the minimum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts, Highstock) Set the minimum X value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts, Highstock) Set the minimum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts, Highstock) Set the minimum Y value the points can be moved
   * to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts, Highstock) The X precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts, Highstock) The X precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts, Highstock) The Y precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts, Highstock) The Y precision value to drag to for this series.
   * Set to 0 to disable. By default this is disabled, except for category
   * axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts, Highstock) The amount of pixels to drag the pointer before
   * it counts as a drag operation. This prevents drag/drop to fire when just
   * clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts, Highstock) The amount of pixels to drag the pointer before
   * it counts as a drag operation. This prevents drag/drop to fire when just
   * clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts, Highstock) Group the points by a property. Points with the
   * same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts, Highstock) Group the points by a property. Points with the
   * same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.groupBy">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.groupBy">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotAreasplinerangeDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotAreasplinerangeDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotAreasplinerangeDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock) Style options for the guide box. The guide box
   * has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.guideBox">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotAreasplinerangeDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts, Highstock) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts, Highstock) Update points as they are dragged. If false, a
   * guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.liveRedraw">https://api.highcharts.com/highstock/plotOptions.areasplinerange.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
