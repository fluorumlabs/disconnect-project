package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | XrangePointPartialFillOptionsObject ) */;
import js.lang.Unknown /* ( string | XrangePointConnectorsOptionsObject | Array < ( string | XrangePointConnectorsOptionsObject ) > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Data for a Gantt series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface GanttPointOptionsObject extends Any {
  /**
   * (Gantt) Accessibility options for a data point.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  PointAccessibilityOptionsObject getAccessibility();

  /**
   * (Gantt) Accessibility options for a data point.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable PointAccessibilityOptionsObject value);

  /**
   * (Gantt) Whether the grid node belonging to this point should start as
   * collapsed. Used in axes of type treegrid.
   *
   */
  @JSProperty("collapsed")
  boolean getCollapsed();

  /**
   * (Gantt) Whether the grid node belonging to this point should start as
   * collapsed. Used in axes of type treegrid.
   *
   */
  @JSProperty("collapsed")
  void setCollapsed(boolean value);

  /**
   * (Gantt) Progress indicator, how much of the task completed. If it is a
   * number, the <code>fill</code> will be applied automatically.
   *
   */
  @JSProperty("completed")
  @Nullable
  Unknown /* ( number | XrangePointPartialFillOptionsObject ) */ getCompleted();

  /**
   * (Gantt) Progress indicator, how much of the task completed. If it is a
   * number, the <code>fill</code> will be applied automatically.
   *
   */
  @JSProperty("completed")
  void setCompleted(@Nullable XrangePointPartialFillOptionsObject value);

  /**
   * (Gantt) Progress indicator, how much of the task completed. If it is a
   * number, the <code>fill</code> will be applied automatically.
   *
   */
  @JSProperty("completed")
  void setCompleted(double value);

  /**
   * (Gantt) A reserved subspace to store options and values for customized
   * functionality. Here you can add additional data for your own event
   * callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Gantt) A reserved subspace to store options and values for customized
   * functionality. Here you can add additional data for your own event
   * callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   */
  @JSProperty("dependency")
  @Nullable
  Unknown /* ( string | XrangePointConnectorsOptionsObject | Array < ( string | XrangePointConnectorsOptionsObject ) > ) */ getDependency(
      );

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   */
  @JSProperty("dependency")
  void setDependency(@Nullable XrangePointConnectorsOptionsObject value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   */
  @JSProperty("dependency")
  void setDependency(XrangePointConnectorsOptionsObject[] value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   */
  @JSProperty("dependency")
  void setDependency(@Nullable String value);

  /**
   * (Gantt) The ID of the point (task) that this point depends on in Gantt
   * charts. Aliases connect. Can also be an object, specifying further
   * connecting options between the points. Multiple connections can be
   * specified by providing an array.
   *
   */
  @JSProperty("dependency")
  void setDependency(String[] value);

  /**
   * (Gantt) A description of the point to add to the screen reader
   * information about the point.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Gantt) A description of the point to add to the screen reader
   * information about the point.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Gantt) Point specific options for the draggable-points module. Overrides
   * options on <code>series.dragDrop</code>.
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesLineDataDragDropOptions getDragDrop();

  /**
   * (Gantt) Point specific options for the draggable-points module. Overrides
   * options on <code>series.dragDrop</code>.
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(@Nullable SeriesLineDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(@Nullable String value);

  /**
   * (Gantt) The end time of a task.
   *
   */
  @JSProperty("end")
  double getEnd();

  /**
   * (Gantt) The end time of a task.
   *
   */
  @JSProperty("end")
  void setEnd(double value);

  /**
   * (Gantt) The rank for this point's data label in case of collision. If two
   * data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Gantt) The rank for this point's data label in case of collision. If two
   * data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Gantt) Whether this point is a milestone. If so, only the <code>start</code> option
   * is handled, while <code>end</code> is ignored.
   *
   */
  @JSProperty("milestone")
  boolean getMilestone();

  /**
   * (Gantt) Whether this point is a milestone. If so, only the <code>start</code> option
   * is handled, while <code>end</code> is ignored.
   *
   */
  @JSProperty("milestone")
  void setMilestone(boolean value);

  /**
   * (Gantt) The name of a task. If a <code>treegrid</code> y-axis is used (default in
   * Gantt charts), this will be picked up automatically, and used to
   * calculate the y-value.
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
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
   *
   */
  @JSProperty("parent")
  @Nullable
  String getParent();

  /**
   * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
   *
   */
  @JSProperty("parent")
  void setParent(@Nullable String value);

  /**
   * (Gantt) The start time of a task.
   *
   */
  @JSProperty("start")
  double getStart();

  /**
   * (Gantt) The start time of a task.
   *
   */
  @JSProperty("start")
  void setStart(double value);

  /**
   * (Gantt) The Y value of a task.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Gantt) The Y value of a task.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * The ending X value of the range point.
   *
   */
  @JSProperty("x2")
  double getX2();

  /**
   * The ending X value of the range point.
   *
   */
  @JSProperty("x2")
  void setX2(double value);

  class Builder {
    private final GanttPointOptionsObject object = Any.empty();

    public GanttPointOptionsObject build() {
      return object;
    }

    /**
     * (Gantt) Accessibility options for a data point.
     *
     */
    public Builder accessibility(@Nullable PointAccessibilityOptionsObject value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Gantt) Whether the grid node belonging to this point should start as
     * collapsed. Used in axes of type treegrid.
     *
     */
    public Builder collapsed(boolean value) {
      object.setCollapsed(value);
      return this;
    }

    /**
     * (Gantt) Progress indicator, how much of the task completed. If it is a
     * number, the <code>fill</code> will be applied automatically.
     *
     */
    public Builder completed(@Nullable XrangePointPartialFillOptionsObject value) {
      object.setCompleted(value);
      return this;
    }

    /**
     * (Gantt) Progress indicator, how much of the task completed. If it is a
     * number, the <code>fill</code> will be applied automatically.
     *
     */
    public Builder completed(double value) {
      object.setCompleted(value);
      return this;
    }

    /**
     * (Gantt) A reserved subspace to store options and values for customized
     * functionality. Here you can add additional data for your own event
     * callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
      return this;
    }

    /**
     * (Gantt) The ID of the point (task) that this point depends on in Gantt
     * charts. Aliases connect. Can also be an object, specifying further
     * connecting options between the points. Multiple connections can be
     * specified by providing an array.
     *
     */
    public Builder dependency(@Nullable XrangePointConnectorsOptionsObject value) {
      object.setDependency(value);
      return this;
    }

    /**
     * (Gantt) The ID of the point (task) that this point depends on in Gantt
     * charts. Aliases connect. Can also be an object, specifying further
     * connecting options between the points. Multiple connections can be
     * specified by providing an array.
     *
     */
    public Builder dependency(XrangePointConnectorsOptionsObject[] value) {
      object.setDependency(value);
      return this;
    }

    /**
     * (Gantt) The ID of the point (task) that this point depends on in Gantt
     * charts. Aliases connect. Can also be an object, specifying further
     * connecting options between the points. Multiple connections can be
     * specified by providing an array.
     *
     */
    public Builder dependency(@Nullable String value) {
      object.setDependency(value);
      return this;
    }

    /**
     * (Gantt) The ID of the point (task) that this point depends on in Gantt
     * charts. Aliases connect. Can also be an object, specifying further
     * connecting options between the points. Multiple connections can be
     * specified by providing an array.
     *
     */
    public Builder dependency(String[] value) {
      object.setDependency(value);
      return this;
    }

    /**
     * (Gantt) A description of the point to add to the screen reader
     * information about the point.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Gantt) Point specific options for the draggable-points module. Overrides
     * options on <code>series.dragDrop</code>.
     *
     */
    public Builder dragDrop(@Nullable SeriesLineDataDragDropOptions value) {
      object.setDragDrop(value);
      return this;
    }

    /**
     * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
     * for a drilldown for this point.
     *
     */
    public Builder drilldown(@Nullable String value) {
      object.setDrilldown(value);
      return this;
    }

    /**
     * (Gantt) The end time of a task.
     *
     */
    public Builder end(double value) {
      object.setEnd(value);
      return this;
    }

    /**
     * (Gantt) The rank for this point's data label in case of collision. If two
     * data labels are about to overlap, only the one with the highest
     * <code>labelrank</code> will be drawn.
     *
     */
    public Builder labelrank(double value) {
      object.setLabelrank(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Options for the point markers of line-like
     * series.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Gantt) Whether this point is a milestone. If so, only the <code>start</code> option
     * is handled, while <code>end</code> is ignored.
     *
     */
    public Builder milestone(boolean value) {
      object.setMilestone(value);
      return this;
    }

    /**
     * (Gantt) The name of a task. If a <code>treegrid</code> y-axis is used (default in
     * Gantt charts), this will be picked up automatically, and used to
     * calculate the y-value.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
     *
     */
    public Builder parent(@Nullable String value) {
      object.setParent(value);
      return this;
    }

    /**
     * (Gantt) The start time of a task.
     *
     */
    public Builder start(double value) {
      object.setStart(value);
      return this;
    }

    /**
     * (Gantt) The Y value of a task.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }

    /**
     * The ending X value of the range point.
     *
     */
    public Builder x2(double value) {
      object.setX2(value);
      return this;
    }
  }
}
