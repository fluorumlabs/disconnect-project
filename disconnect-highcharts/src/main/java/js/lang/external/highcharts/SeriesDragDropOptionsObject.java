package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary < DragDropGuideBoxOptionsObject > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) The draggable-points module allows points to
 * be moved around or modified in the chart. In addition to the options
 * mentioned under the <code>dragDrop</code> API structure, the module fires three events,
 * point.dragStart, point.drag and point.drop.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesDragDropOptionsObject extends Any {
  /**
   * (Highstock) Allow close value to be dragged individually.
   *
   */
  @JSProperty("draggableClose")
  boolean getDraggableClose();

  /**
   * (Highstock) Allow close value to be dragged individually.
   *
   */
  @JSProperty("draggableClose")
  void setDraggableClose(boolean value);

  /**
   * (Gantt) Allow end value to be dragged individually.
   *
   */
  @JSProperty("draggableEnd")
  boolean getDraggableEnd();

  /**
   * (Gantt) Allow end value to be dragged individually.
   *
   */
  @JSProperty("draggableEnd")
  void setDraggableEnd(boolean value);

  /**
   * (Highstock) Allow high value to be dragged individually.
   *
   */
  @JSProperty("draggableHigh")
  boolean getDraggableHigh();

  /**
   * (Highstock) Allow high value to be dragged individually.
   *
   */
  @JSProperty("draggableHigh")
  void setDraggableHigh(boolean value);

  /**
   * (Highstock) Allow low value to be dragged individually.
   *
   */
  @JSProperty("draggableLow")
  boolean getDraggableLow();

  /**
   * (Highstock) Allow low value to be dragged individually.
   *
   */
  @JSProperty("draggableLow")
  void setDraggableLow(boolean value);

  /**
   * (Highstock) Allow open value to be dragged individually.
   *
   */
  @JSProperty("draggableOpen")
  boolean getDraggableOpen();

  /**
   * (Highstock) Allow open value to be dragged individually.
   *
   */
  @JSProperty("draggableOpen")
  void setDraggableOpen(boolean value);

  /**
   * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
   *
   */
  @JSProperty("draggableQ1")
  boolean getDraggableQ1();

  /**
   * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
   *
   */
  @JSProperty("draggableQ1")
  void setDraggableQ1(boolean value);

  /**
   * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
   *
   */
  @JSProperty("draggableQ3")
  boolean getDraggableQ3();

  /**
   * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
   *
   */
  @JSProperty("draggableQ3")
  void setDraggableQ3(boolean value);

  /**
   * (Gantt) Allow start value to be dragged individually.
   *
   */
  @JSProperty("draggableStart")
  boolean getDraggableStart();

  /**
   * (Gantt) Allow start value to be dragged individually.
   *
   */
  @JSProperty("draggableStart")
  void setDraggableStart(boolean value);

  /**
   * (Highcharts) Allow target value to be dragged individually.
   *
   */
  @JSProperty("draggableTarget")
  boolean getDraggableTarget();

  /**
   * (Highcharts) Allow target value to be dragged individually.
   *
   */
  @JSProperty("draggableTarget")
  void setDraggableTarget(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
   *
   */
  @JSProperty("draggableX")
  boolean getDraggableX();

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
   *
   */
  @JSProperty("draggableX")
  void setDraggableX(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
   *
   */
  @JSProperty("draggableX1")
  boolean getDraggableX1();

  /**
   * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
   *
   */
  @JSProperty("draggableX1")
  void setDraggableX1(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
   *
   */
  @JSProperty("draggableX2")
  boolean getDraggableX2();

  /**
   * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
   *
   */
  @JSProperty("draggableX2")
  void setDraggableX2(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
   * that this is not supported for TreeGrid axes (the default axis type in
   * Gantt charts).
   *
   */
  @JSProperty("draggableY")
  boolean getDraggableY();

  /**
   * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
   * that this is not supported for TreeGrid axes (the default axis type in
   * Gantt charts).
   *
   */
  @JSProperty("draggableY")
  void setDraggableY(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the drag handles.
   *
   */
  @JSProperty("dragHandle")
  @Nullable
  DragDropHandleOptionsObject getDragHandle();

  /**
   * (Highcharts, Highstock, Gantt) Options for the drag handles.
   *
   */
  @JSProperty("dragHandle")
  void setDragHandle(@Nullable DragDropHandleOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMaxX")
  double getDragMaxX();

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMaxX")
  void setDragMaxX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMaxY")
  double getDragMaxY();

  /**
   * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMaxY")
  void setDragMaxY(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMinX")
  double getDragMinX();

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMinX")
  void setDragMinX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMinY")
  double getDragMinY();

  /**
   * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
   * moved to.
   *
   */
  @JSProperty("dragMinY")
  void setDragMinY(double value);

  /**
   * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   */
  @JSProperty("dragPrecisionX")
  double getDragPrecisionX();

  /**
   * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   */
  @JSProperty("dragPrecisionX")
  void setDragPrecisionX(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   */
  @JSProperty("dragPrecisionY")
  double getDragPrecisionY();

  /**
   * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
   * series. Set to 0 to disable. By default this is disabled, except for
   * category axes, where the default is 1.
   *
   */
  @JSProperty("dragPrecisionY")
  void setDragPrecisionY(double value);

  /**
   * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
   * before it counts as a drag operation. This prevents drag/drop to fire
   * when just clicking or selecting points.
   *
   */
  @JSProperty("dragSensitivity")
  double getDragSensitivity();

  /**
   * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
   * before it counts as a drag operation. This prevents drag/drop to fire
   * when just clicking or selecting points.
   *
   */
  @JSProperty("dragSensitivity")
  void setDragSensitivity(double value);

  /**
   * (Highcharts, Highstock, Gantt) Group the points by a property. Points
   * with the same property value will be grouped together when moving.
   *
   */
  @JSProperty("groupBy")
  @Nullable
  String getGroupBy();

  /**
   * (Highcharts, Highstock, Gantt) Group the points by a property. Points
   * with the same property value will be grouped together when moving.
   *
   */
  @JSProperty("groupBy")
  void setGroupBy(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  @Nullable
  Unknown /* ( PlotAreaDragDropGuideBoxOptions | PlotArearangeDragDropGuideBoxOptions | PlotAreasplineDragDropGuideBoxOptions | PlotAreasplinerangeDragDropGuideBoxOptions | PlotBarDragDropGuideBoxOptions | PlotBoxplotDragDropGuideBoxOptions | PlotBubbleDragDropGuideBoxOptions | PlotBulletDragDropGuideBoxOptions | PlotCandlestickDragDropGuideBoxOptions | PlotColumnDragDropGuideBoxOptions | PlotColumnpyramidDragDropGuideBoxOptions | PlotColumnrangeDragDropGuideBoxOptions | PlotDumbbellDragDropGuideBoxOptions | PlotErrorbarDragDropGuideBoxOptions | PlotFlagsDragDropGuideBoxOptions | PlotFunnel3dDragDropGuideBoxOptions | PlotGanttDragDropGuideBoxOptions | PlotHeatmapDragDropGuideBoxOptions | PlotLineDragDropGuideBoxOptions | PlotLollipopDragDropGuideBoxOptions | PlotMapbubbleDragDropGuideBoxOptions | PlotMapDragDropGuideBoxOptions | PlotMaplineDragDropGuideBoxOptions | PlotMappointDragDropGuideBoxOptions | PlotOhlcDragDropGuideBoxOptions | PlotPolygonDragDropGuideBoxOptions | PlotPyramid3dDragDropGuideBoxOptions | PlotScatterDragDropGuideBoxOptions | PlotSeriesDragDropGuideBoxOptions | PlotSplineDragDropGuideBoxOptions | PlotStreamgraphDragDropGuideBoxOptions | PlotTilemapDragDropGuideBoxOptions | PlotTimelineDragDropGuideBoxOptions | PlotVariwideDragDropGuideBoxOptions | PlotWaterfallDragDropGuideBoxOptions | PlotXrangeDragDropGuideBoxOptions | Dictionary < DragDropGuideBoxOptionsObject > ) */ getGuideBox(
      );

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotBulletDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotErrorbarDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotMaplineDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotWaterfallDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotAreasplineDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotCandlestickDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotPyramid3dDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotSplineDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotTimelineDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotColumnrangeDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotHeatmapDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable Dictionary<DragDropGuideBoxOptionsObject> value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotVariwideDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotMappointDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotOhlcDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotMapDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotBoxplotDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotAreaDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotGanttDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotBarDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotStreamgraphDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotFunnel3dDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotTilemapDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotLineDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotScatterDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotColumnDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotLollipopDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotXrangeDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotMapbubbleDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotArearangeDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotSeriesDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotPolygonDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotDumbbellDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotColumnpyramidDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotAreasplinerangeDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotBubbleDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable PlotFlagsDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
   * false, a guide box is drawn to illustrate the new point size.
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
   * false, a guide box is drawn to illustrate the new point size.
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);

  class Builder {
    private final SeriesDragDropOptionsObject object = Any.empty();

    public SeriesDragDropOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) Allow close value to be dragged individually.
     *
     */
    public Builder draggableClose(boolean value) {
      object.setDraggableClose(value);
      return this;
    }

    /**
     * (Gantt) Allow end value to be dragged individually.
     *
     */
    public Builder draggableEnd(boolean value) {
      object.setDraggableEnd(value);
      return this;
    }

    /**
     * (Highstock) Allow high value to be dragged individually.
     *
     */
    public Builder draggableHigh(boolean value) {
      object.setDraggableHigh(value);
      return this;
    }

    /**
     * (Highstock) Allow low value to be dragged individually.
     *
     */
    public Builder draggableLow(boolean value) {
      object.setDraggableLow(value);
      return this;
    }

    /**
     * (Highstock) Allow open value to be dragged individually.
     *
     */
    public Builder draggableOpen(boolean value) {
      object.setDraggableOpen(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
     *
     */
    public Builder draggableQ1(boolean value) {
      object.setDraggableQ1(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
     *
     */
    public Builder draggableQ3(boolean value) {
      object.setDraggableQ3(value);
      return this;
    }

    /**
     * (Gantt) Allow start value to be dragged individually.
     *
     */
    public Builder draggableStart(boolean value) {
      object.setDraggableStart(value);
      return this;
    }

    /**
     * (Highcharts) Allow target value to be dragged individually.
     *
     */
    public Builder draggableTarget(boolean value) {
      object.setDraggableTarget(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
     *
     */
    public Builder draggableX(boolean value) {
      object.setDraggableX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
     *
     */
    public Builder draggableX1(boolean value) {
      object.setDraggableX1(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
     *
     */
    public Builder draggableX2(boolean value) {
      object.setDraggableX2(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
     * that this is not supported for TreeGrid axes (the default axis type in
     * Gantt charts).
     *
     */
    public Builder draggableY(boolean value) {
      object.setDraggableY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Options for the drag handles.
     *
     */
    public Builder dragHandle(@Nullable DragDropHandleOptionsObject value) {
      object.setDragHandle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
     * moved to.
     *
     */
    public Builder dragMaxX(double value) {
      object.setDragMaxX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
     * moved to.
     *
     */
    public Builder dragMaxY(double value) {
      object.setDragMaxY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
     * moved to.
     *
     */
    public Builder dragMinX(double value) {
      object.setDragMinX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
     * moved to.
     *
     */
    public Builder dragMinY(double value) {
      object.setDragMinY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
     * series. Set to 0 to disable. By default this is disabled, except for
     * category axes, where the default is 1.
     *
     */
    public Builder dragPrecisionX(double value) {
      object.setDragPrecisionX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
     * series. Set to 0 to disable. By default this is disabled, except for
     * category axes, where the default is 1.
     *
     */
    public Builder dragPrecisionY(double value) {
      object.setDragPrecisionY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
     * before it counts as a drag operation. This prevents drag/drop to fire
     * when just clicking or selecting points.
     *
     */
    public Builder dragSensitivity(double value) {
      object.setDragSensitivity(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Group the points by a property. Points
     * with the same property value will be grouped together when moving.
     *
     */
    public Builder groupBy(@Nullable String value) {
      object.setGroupBy(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotBulletDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotErrorbarDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotMaplineDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotWaterfallDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotAreasplineDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotCandlestickDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotPyramid3dDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotSplineDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotTimelineDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotColumnrangeDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotHeatmapDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable Dictionary<DragDropGuideBoxOptionsObject> value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotVariwideDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotMappointDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotOhlcDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotMapDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotBoxplotDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotAreaDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotGanttDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotBarDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotStreamgraphDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotFunnel3dDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotTilemapDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotLineDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotScatterDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotColumnDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotLollipopDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotXrangeDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotMapbubbleDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotArearangeDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotSeriesDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotPolygonDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotDumbbellDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotColumnpyramidDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotAreasplinerangeDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotBubbleDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable PlotFlagsDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
     * false, a guide box is drawn to illustrate the new point size.
     *
     */
    public Builder liveRedraw(boolean value) {
      object.setLiveRedraw(value);
      return this;
    }
  }
}
