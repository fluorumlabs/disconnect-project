package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) The draggable-points module allows points to be moved around or
 * modified in the chart. In addition to the options mentioned under the
 * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
 * point.drag and point.drop.
 *
 * It requires the <code>modules/draggable-points.js</code> file to be loaded.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop</a>
 *
 */
public interface PlotMapbubbleDragDropOptions extends Any {
  /**
   * (Highmaps) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highmaps) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highmaps) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highmaps) Enable dragging in the Y dimension. Note that this is not
   * supported for TreeGrid axes (the default axis type in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highmaps) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragHandle">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotMapbubbleDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  PlotMapbubbleDragDropDragHandleOptions getDragHandle();

  /**
   * (Highmaps) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragHandle">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: PlotMapbubbleDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(PlotMapbubbleDragDropDragHandleOptions value);

  /**
   * (Highmaps) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highmaps) Set the maximum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highmaps) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highmaps) Set the maximum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highmaps) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highmaps) Set the minimum X value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highmaps) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highmaps) Set the minimum Y value the points can be moved to.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highmaps) The X precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highmaps) The X precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionX">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highmaps) The Y precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highmaps) The Y precision value to drag to for this series. Set to 0 to
   * disable. By default this is disabled, except for category axes, where the
   * default is 1.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionY">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highmaps) The amount of pixels to drag the pointer before it counts as a
   * drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragSensitivity">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highmaps) The amount of pixels to drag the pointer before it counts as a
   * drag operation. This prevents drag/drop to fire when just clicking or
   * selecting points.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragSensitivity">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highmaps) Group the points by a property. Points with the same property
   * value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.groupBy">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highmaps) Group the points by a property. Points with the same property
   * value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.groupBy">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highmaps) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotMapbubbleDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highmaps) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotMapbubbleDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(PlotMapbubbleDragDropGuideBoxOptions value);

  /**
   * (Highmaps) Style options for the guide box. The guide box has one state
   * by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.guideBox">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (PlotMapbubbleDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highmaps) Update points as they are dragged. If false, a guide box is
   * drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.liveRedraw">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highmaps) Update points as they are dragged. If false, a guide box is
   * drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.liveRedraw">https://api.highcharts.com/highmaps/plotOptions.mapbubble.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
