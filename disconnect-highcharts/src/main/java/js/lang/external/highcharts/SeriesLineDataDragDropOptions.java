package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( SeriesAreaDataDragDropGuideBoxOptions | SeriesArearangeDataDragDropGuideBoxOptions | SeriesAreasplineDataDragDropGuideBoxOptions | SeriesAreasplinerangeDataDragDropGuideBoxOptions | SeriesBarDataDragDropGuideBoxOptions | SeriesBoxplotDataDragDropGuideBoxOptions | SeriesBubbleDataDragDropGuideBoxOptions | SeriesBulletDataDragDropGuideBoxOptions | SeriesCandlestickDataDragDropGuideBoxOptions | SeriesColumnDataDragDropGuideBoxOptions | SeriesColumnpyramidDataDragDropGuideBoxOptions | SeriesColumnrangeDataDragDropGuideBoxOptions | SeriesCylinderDataDragDropGuideBoxOptions | SeriesDumbbellDataDragDropGuideBoxOptions | SeriesErrorbarDataDragDropGuideBoxOptions | SeriesFlagsDataDragDropGuideBoxOptions | SeriesFunnel3dDataDragDropGuideBoxOptions | SeriesFunnelDataDragDropGuideBoxOptions | SeriesGanttDataDragDropGuideBoxOptions | SeriesGaugeDataDragDropGuideBoxOptions | SeriesHeatmapDataDragDropGuideBoxOptions | SeriesItemDataDragDropGuideBoxOptions | SeriesLineDataDragDropGuideBoxOptions | SeriesLollipopDataDragDropGuideBoxOptions | SeriesNetworkgraphDataDragDropGuideBoxOptions | SeriesOhlcDataDragDropGuideBoxOptions | SeriesPackedbubbleDataDragDropGuideBoxOptions | SeriesParetoDataDragDropGuideBoxOptions | SeriesPieDataDragDropGuideBoxOptions | SeriesPolygonDataDragDropGuideBoxOptions | SeriesPyramid3dDataDragDropGuideBoxOptions | SeriesPyramidDataDragDropGuideBoxOptions | SeriesScatter3dDataDragDropGuideBoxOptions | SeriesScatterDataDragDropGuideBoxOptions | SeriesSolidgaugeDataDragDropGuideBoxOptions | SeriesSplineDataDragDropGuideBoxOptions | SeriesStreamgraphDataDragDropGuideBoxOptions | SeriesSunburstDataDragDropGuideBoxOptions | SeriesTilemapDataDragDropGuideBoxOptions | SeriesTimelineDataDragDropGuideBoxOptions | SeriesTreemapDataDragDropGuideBoxOptions | SeriesVariablepieDataDragDropGuideBoxOptions | SeriesVariwideDataDragDropGuideBoxOptions | SeriesVectorDataDragDropGuideBoxOptions | SeriesVennDataDragDropGuideBoxOptions | SeriesWaterfallDataDragDropGuideBoxOptions | SeriesWindbarbDataDragDropGuideBoxOptions | SeriesWordcloudDataDragDropGuideBoxOptions | SeriesXrangeDataDragDropGuideBoxOptions | Dictionary < DragDropGuideBoxOptionsObject > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Point specific options for the
 * draggable-points module. Overrides options on <code>series.dragDrop</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesLineDataDragDropOptions extends Any {
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
  Unknown /* ( SeriesAreaDataDragDropGuideBoxOptions | SeriesArearangeDataDragDropGuideBoxOptions | SeriesAreasplineDataDragDropGuideBoxOptions | SeriesAreasplinerangeDataDragDropGuideBoxOptions | SeriesBarDataDragDropGuideBoxOptions | SeriesBoxplotDataDragDropGuideBoxOptions | SeriesBubbleDataDragDropGuideBoxOptions | SeriesBulletDataDragDropGuideBoxOptions | SeriesCandlestickDataDragDropGuideBoxOptions | SeriesColumnDataDragDropGuideBoxOptions | SeriesColumnpyramidDataDragDropGuideBoxOptions | SeriesColumnrangeDataDragDropGuideBoxOptions | SeriesCylinderDataDragDropGuideBoxOptions | SeriesDumbbellDataDragDropGuideBoxOptions | SeriesErrorbarDataDragDropGuideBoxOptions | SeriesFlagsDataDragDropGuideBoxOptions | SeriesFunnel3dDataDragDropGuideBoxOptions | SeriesFunnelDataDragDropGuideBoxOptions | SeriesGanttDataDragDropGuideBoxOptions | SeriesGaugeDataDragDropGuideBoxOptions | SeriesHeatmapDataDragDropGuideBoxOptions | SeriesItemDataDragDropGuideBoxOptions | SeriesLineDataDragDropGuideBoxOptions | SeriesLollipopDataDragDropGuideBoxOptions | SeriesNetworkgraphDataDragDropGuideBoxOptions | SeriesOhlcDataDragDropGuideBoxOptions | SeriesPackedbubbleDataDragDropGuideBoxOptions | SeriesParetoDataDragDropGuideBoxOptions | SeriesPieDataDragDropGuideBoxOptions | SeriesPolygonDataDragDropGuideBoxOptions | SeriesPyramid3dDataDragDropGuideBoxOptions | SeriesPyramidDataDragDropGuideBoxOptions | SeriesScatter3dDataDragDropGuideBoxOptions | SeriesScatterDataDragDropGuideBoxOptions | SeriesSolidgaugeDataDragDropGuideBoxOptions | SeriesSplineDataDragDropGuideBoxOptions | SeriesStreamgraphDataDragDropGuideBoxOptions | SeriesSunburstDataDragDropGuideBoxOptions | SeriesTilemapDataDragDropGuideBoxOptions | SeriesTimelineDataDragDropGuideBoxOptions | SeriesTreemapDataDragDropGuideBoxOptions | SeriesVariablepieDataDragDropGuideBoxOptions | SeriesVariwideDataDragDropGuideBoxOptions | SeriesVectorDataDragDropGuideBoxOptions | SeriesVennDataDragDropGuideBoxOptions | SeriesWaterfallDataDragDropGuideBoxOptions | SeriesWindbarbDataDragDropGuideBoxOptions | SeriesWordcloudDataDragDropGuideBoxOptions | SeriesXrangeDataDragDropGuideBoxOptions | Dictionary < DragDropGuideBoxOptionsObject > ) */ getGuideBox(
      );

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesBulletDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesStreamgraphDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesCandlestickDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesHeatmapDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesWaterfallDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesPackedbubbleDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesNetworkgraphDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesColumnrangeDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesScatter3dDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesTimelineDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesBarDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesVectorDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesPieDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesPyramid3dDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesBubbleDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesAreaDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesSunburstDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesGanttDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesParetoDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesPyramidDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesBoxplotDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesSplineDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesAreasplinerangeDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesCylinderDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesTilemapDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesFunnelDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesVennDataDragDropGuideBoxOptions value);

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
  void setGuideBox(@Nullable SeriesVariablepieDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesDumbbellDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesErrorbarDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesItemDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesOhlcDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesPolygonDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesAreasplineDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesLollipopDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesSolidgaugeDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesTreemapDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesArearangeDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesLineDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesFlagsDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesGaugeDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesColumnpyramidDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesScatterDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesWordcloudDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesWindbarbDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesVariwideDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesXrangeDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesColumnDataDragDropGuideBoxOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
   * box has one state by default, the <code>default</code> state.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable SeriesFunnel3dDataDragDropGuideBoxOptions value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesLineDataDragDropOptions object = Any.empty();

    private Builder() {
    }

    public SeriesLineDataDragDropOptions build() {
      return object;
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
    public Builder guideBox(@Nullable SeriesBulletDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesStreamgraphDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesCandlestickDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesHeatmapDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesWaterfallDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesPackedbubbleDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesNetworkgraphDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesColumnrangeDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesScatter3dDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesTimelineDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesBarDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesVectorDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesPieDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesPyramid3dDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesBubbleDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesAreaDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesSunburstDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesGanttDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesParetoDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesPyramidDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesBoxplotDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesSplineDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesAreasplinerangeDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesCylinderDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesTilemapDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesFunnelDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesVennDataDragDropGuideBoxOptions value) {
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
    public Builder guideBox(@Nullable SeriesVariablepieDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesDumbbellDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesErrorbarDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesItemDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesOhlcDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesPolygonDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesAreasplineDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesLollipopDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesSolidgaugeDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesTreemapDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesArearangeDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesLineDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesFlagsDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesGaugeDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesColumnpyramidDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesScatterDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesWordcloudDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesWindbarbDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesVariwideDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesXrangeDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesColumnDataDragDropGuideBoxOptions value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the <code>default</code> state.
     *
     */
    public Builder guideBox(@Nullable SeriesFunnel3dDataDragDropGuideBoxOptions value) {
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
