package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Point specific options for the
 * draggable-points module. Overrides options on <code>series.dragDrop</code>.
 *
 * Requires the <code>draggable-points</code> module.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop">https://api.highcharts.com/highstock/series.sankey.data.dragDrop</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop</a>
 *
 */
public interface SeriesSankeyDataDragDropOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highstock, Highmaps) Enable dragging in the X dimension.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableX</a>
   *
   * @implspec draggableX?: boolean;
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable dragging in the Y dimension.
   * Note that this is not supported for TreeGrid axes (the default axis type
   * in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts, Highstock, Highmaps) Enable dragging in the Y dimension.
   * Note that this is not supported for TreeGrid axes (the default axis type
   * in Gantt charts).
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.draggableY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.draggableY</a>
   *
   * @implspec draggableY?: boolean;
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragHandle">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragHandle">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragHandle">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: SeriesSankeyDataDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  SeriesSankeyDataDragDropDragHandleOptions getDragHandle();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragHandle">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragHandle">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragHandle</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragHandle">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragHandle</a>
   *
   * @implspec dragHandle?: SeriesSankeyDataDragDropDragHandleOptions;
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(SeriesSankeyDataDragDropDragHandleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the maximum X value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts, Highstock, Highmaps) Set the maximum X value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxX</a>
   *
   * @implspec dragMaxX?: number;
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the maximum Y value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts, Highstock, Highmaps) Set the maximum Y value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMaxY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMaxY</a>
   *
   * @implspec dragMaxY?: number;
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the minimum X value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts, Highstock, Highmaps) Set the minimum X value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinX</a>
   *
   * @implspec dragMinX?: number;
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the minimum Y value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts, Highstock, Highmaps) Set the minimum Y value the points can
   * be moved to.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragMinY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragMinY</a>
   *
   * @implspec dragMinY?: number;
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The X precision value to drag to for
   * this series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts, Highstock, Highmaps) The X precision value to drag to for
   * this series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionX">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionX">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionX</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionX">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionX</a>
   *
   * @implspec dragPrecisionX?: number;
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The Y precision value to drag to for
   * this series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts, Highstock, Highmaps) The Y precision value to drag to for
   * this series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionY">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionY">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragPrecisionY</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionY">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragPrecisionY</a>
   *
   * @implspec dragPrecisionY?: number;
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The amount of pixels to drag the
   * pointer before it counts as a drag operation. This prevents drag/drop to
   * fire when just clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragSensitivity">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts, Highstock, Highmaps) The amount of pixels to drag the
   * pointer before it counts as a drag operation. This prevents drag/drop to
   * fire when just clicking or selecting points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragSensitivity">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragSensitivity">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.dragSensitivity</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragSensitivity">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.dragSensitivity</a>
   *
   * @implspec dragSensitivity?: number;
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Group the points by a property. Points
   * with the same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.groupBy">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.groupBy">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.groupBy">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts, Highstock, Highmaps) Group the points by a property. Points
   * with the same property value will be grouped together when moving.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.groupBy">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.groupBy">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.groupBy</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.groupBy">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.groupBy</a>
   *
   * @implspec groupBy?: string;
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box. The
   * guide box has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (SeriesSankeyDataDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown getGuideBox();

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box. The
   * guide box has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (SeriesSankeyDataDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(SeriesSankeyDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the guide box. The
   * guide box has one state by default, the <code>default</code> state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.guideBox</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.guideBox">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.guideBox</a>
   *
   * @implspec guideBox?: (SeriesSankeyDataDragDropGuideBoxOptions|Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions>);
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(Dictionary<PlotSeriesDragDropGuideBoxDefaultOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) Update points as they are dragged. If
   * false, a guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.liveRedraw">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.liveRedraw">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts, Highstock, Highmaps) Update points as they are dragged. If
   * false, a guide box is drawn to illustrate the new point size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.liveRedraw">https://api.highcharts.com/highcharts/series.sankey.data.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highstock/series.sankey.data.dragDrop.liveRedraw">https://api.highcharts.com/highstock/series.sankey.data.dragDrop.liveRedraw</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.liveRedraw">https://api.highcharts.com/highmaps/series.sankey.data.dragDrop.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);
}
