package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Data for a Gantt series.
 *
 * @see <a href="https://api.highcharts.com/gantt/series.gantt.data">https://api.highcharts.com/gantt/series.gantt.data</a>
 *
 */
public interface SeriesGanttDataOptions extends Any {
  /**
   * (Gantt) Whether the grid node belonging to this point should start as
   * collapsed. Used in axes of type treegrid.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.collapsed">https://api.highcharts.com/gantt/series.gantt.data.collapsed</a>
   *
   * @implspec collapsed?: boolean;
   *
   */
  @JSProperty("collapsed")
  boolean getCollapsed();

  /**
   * (Gantt) Whether the grid node belonging to this point should start as
   * collapsed. Used in axes of type treegrid.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.collapsed">https://api.highcharts.com/gantt/series.gantt.data.collapsed</a>
   *
   * @implspec collapsed?: boolean;
   *
   */
  @JSProperty("collapsed")
  void setCollapsed(boolean value);

  /**
   * (Gantt) Progress indicator, how much of the task completed. If it is a
   * number, the <code>fill</code> will be applied automatically.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed">https://api.highcharts.com/gantt/series.gantt.data.completed</a>
   *
   * @implspec completed?: (number|SeriesGanttDataCompletedOptions);
   *
   */
  @JSProperty("completed")
  @Nullable
  Unknown getCompleted();

  /**
   * (Gantt) Progress indicator, how much of the task completed. If it is a
   * number, the <code>fill</code> will be applied automatically.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed">https://api.highcharts.com/gantt/series.gantt.data.completed</a>
   *
   * @implspec completed?: (number|SeriesGanttDataCompletedOptions);
   *
   */
  @JSProperty("completed")
  void setCompleted(double value);

  /**
   * (Gantt) Progress indicator, how much of the task completed. If it is a
   * number, the <code>fill</code> will be applied automatically.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.completed">https://api.highcharts.com/gantt/series.gantt.data.completed</a>
   *
   * @implspec completed?: (number|SeriesGanttDataCompletedOptions);
   *
   */
  @JSProperty("completed")
  void setCompleted(SeriesGanttDataCompletedOptions value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.dependency">https://api.highcharts.com/gantt/series.gantt.data.dependency</a>
   *
   * @implspec dependency?: (string|SeriesGanttDataDependencyOptions|Array&lt;(string|SeriesGanttDataDependencyOptions)&gt;);
   *
   */
  @JSProperty("dependency")
  @Nullable
  Unknown getDependency();

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.dependency">https://api.highcharts.com/gantt/series.gantt.data.dependency</a>
   *
   * @implspec dependency?: (string|SeriesGanttDataDependencyOptions|Array&lt;(string|SeriesGanttDataDependencyOptions)&gt;);
   *
   */
  @JSProperty("dependency")
  void setDependency(SeriesGanttDataDependencyOptions value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.dependency">https://api.highcharts.com/gantt/series.gantt.data.dependency</a>
   *
   * @implspec dependency?: (string|SeriesGanttDataDependencyOptions|Array&lt;(string|SeriesGanttDataDependencyOptions)&gt;);
   *
   */
  @JSProperty("dependency")
  void setDependency(String value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.dependency">https://api.highcharts.com/gantt/series.gantt.data.dependency</a>
   *
   * @implspec dependency?: (string|SeriesGanttDataDependencyOptions|Array&lt;(string|SeriesGanttDataDependencyOptions)&gt;);
   *
   */
  @JSProperty("dependency")
  void setDependency(Array<Unknown> value);

  /**
   * (Gantt) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.description">https://api.highcharts.com/gantt/series.gantt.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Gantt) A description of the point to add to the screen reader
   * information about the point. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.description">https://api.highcharts.com/gantt/series.gantt.data.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.dragDrop">https://api.highcharts.com/highcharts/series.gantt.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.dragDrop">https://api.highcharts.com/highstock/series.gantt.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.dragDrop">https://api.highcharts.com/highmaps/series.gantt.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesGanttDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesGanttDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Highmaps) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.dragDrop">https://api.highcharts.com/highcharts/series.gantt.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.dragDrop">https://api.highcharts.com/highstock/series.gantt.data.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.dragDrop">https://api.highcharts.com/highmaps/series.gantt.data.dragDrop</a>
   *
   * @implspec dragDrop?: SeriesGanttDataDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(SeriesGanttDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.drilldown">https://api.highcharts.com/highcharts/series.gantt.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.drilldown">https://api.highcharts.com/highcharts/series.gantt.data.drilldown</a>
   *
   * @implspec drilldown?: string;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(String value);

  /**
   * (Gantt) The end time of a task.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.end">https://api.highcharts.com/gantt/series.gantt.data.end</a>
   *
   * @implspec end?: number;
   *
   */
  @JSProperty("end")
  double getEnd();

  /**
   * (Gantt) The end time of a task.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.end">https://api.highcharts.com/gantt/series.gantt.data.end</a>
   *
   * @implspec end?: number;
   *
   */
  @JSProperty("end")
  void setEnd(double value);

  /**
   * (Gantt) The rank for this point's data label in case of collision. If two
   * data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.labelrank">https://api.highcharts.com/gantt/series.gantt.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Gantt) The rank for this point's data label in case of collision. If two
   * data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.labelrank">https://api.highcharts.com/gantt/series.gantt.data.labelrank</a>
   *
   * @implspec labelrank?: number;
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define
   * the visual appearance of the markers. Other series types, like column
   * series, don't have markers, but have visual options on the series level
   * instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker">https://api.highcharts.com/highcharts/series.gantt.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker">https://api.highcharts.com/highstock/series.gantt.data.marker</a>
   *
   * @implspec marker?: SeriesGanttDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  SeriesGanttDataMarkerOptions getMarker();

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define
   * the visual appearance of the markers. Other series types, like column
   * series, don't have markers, but have visual options on the series level
   * instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker">https://api.highcharts.com/highcharts/series.gantt.data.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker">https://api.highcharts.com/highstock/series.gantt.data.marker</a>
   *
   * @implspec marker?: SeriesGanttDataMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(SeriesGanttDataMarkerOptions value);

  /**
   * (Gantt) Whether this point is a milestone. If so, only the <code>start</code> option
   * is handled, while <code>end</code> is ignored.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.milestone">https://api.highcharts.com/gantt/series.gantt.data.milestone</a>
   *
   * @implspec milestone?: boolean;
   *
   */
  @JSProperty("milestone")
  boolean getMilestone();

  /**
   * (Gantt) Whether this point is a milestone. If so, only the <code>start</code> option
   * is handled, while <code>end</code> is ignored.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.milestone">https://api.highcharts.com/gantt/series.gantt.data.milestone</a>
   *
   * @implspec milestone?: boolean;
   *
   */
  @JSProperty("milestone")
  void setMilestone(boolean value);

  /**
   * (Gantt) The name of a task. If a <code>treegrid</code> y-axis is used (default in
   * Gantt charts), this will be picked up automatically, and used to
   * calculate the y-value.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.name">https://api.highcharts.com/gantt/series.gantt.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Gantt) The name of a task. If a <code>treegrid</code> y-axis is used (default in
   * Gantt charts), this will be picked up automatically, and used to
   * calculate the y-value.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.name">https://api.highcharts.com/gantt/series.gantt.data.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.parent">https://api.highcharts.com/gantt/series.gantt.data.parent</a>
   *
   * @implspec parent?: string;
   *
   */
  @JSProperty("parent")
  @Nullable
  String getParent();

  /**
   * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.parent">https://api.highcharts.com/gantt/series.gantt.data.parent</a>
   *
   * @implspec parent?: string;
   *
   */
  @JSProperty("parent")
  void setParent(String value);

  /**
   * (Gantt) The start time of a task.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.start">https://api.highcharts.com/gantt/series.gantt.data.start</a>
   *
   * @implspec start?: number;
   *
   */
  @JSProperty("start")
  double getStart();

  /**
   * (Gantt) The start time of a task.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.start">https://api.highcharts.com/gantt/series.gantt.data.start</a>
   *
   * @implspec start?: number;
   *
   */
  @JSProperty("start")
  void setStart(double value);

  /**
   * (Gantt) The Y value of a task.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.y">https://api.highcharts.com/gantt/series.gantt.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Gantt) The Y value of a task.
   *
   * @see <a href="https://api.highcharts.com/gantt/series.gantt.data.y">https://api.highcharts.com/gantt/series.gantt.data.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
