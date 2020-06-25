package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) The individual point events.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointEventsOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Fires when a point is clicked. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * If the <code>series.allowPointSelect</code> option is true, the default action for
   * the point's click event is to toggle the point's select state. Returning
   * <code>false</code> cancels this action.
   *
   */
  @JSProperty("click")
  @Nullable
  PointClickCallbackFunction getClick();

  /**
   * (Highcharts, Highstock, Gantt) Fires when a point is clicked. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * If the <code>series.allowPointSelect</code> option is true, the default action for
   * the point's click event is to toggle the point's select state. Returning
   * <code>false</code> cancels this action.
   *
   */
  @JSProperty("click")
  void setClick(@Nullable PointClickCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
   * point. The mouse event is passed in as parameter. The original data can
   * be accessed from <code>e.origin</code>, and the new point values can be accessed
   * from <code>e.newPoints</code>. If there is only a single point being updated, it can
   * be accessed from <code>e.newPoint</code> for simplicity, and its ID can be accessed
   * from <code>e.newPointId</code>. The <code>this</code> context is the point being dragged. To
   * stop the default drag action, return false. See drag and drop options.
   *
   */
  @JSProperty("drag")
  @Nullable
  PointDragCallbackFunction getDrag();

  /**
   * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
   * point. The mouse event is passed in as parameter. The original data can
   * be accessed from <code>e.origin</code>, and the new point values can be accessed
   * from <code>e.newPoints</code>. If there is only a single point being updated, it can
   * be accessed from <code>e.newPoint</code> for simplicity, and its ID can be accessed
   * from <code>e.newPointId</code>. The <code>this</code> context is the point being dragged. To
   * stop the default drag action, return false. See drag and drop options.
   *
   */
  @JSProperty("drag")
  void setDrag(@Nullable PointDragCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
   * a point. The mouse event object is passed in as an argument. If a drag
   * handle is used, <code>e.updateProp</code> is set to the data property being dragged.
   * The <code>this</code> context is the point. See drag and drop options.
   *
   */
  @JSProperty("dragStart")
  @Nullable
  PointDragStartCallbackFunction getDragStart();

  /**
   * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
   * a point. The mouse event object is passed in as an argument. If a drag
   * handle is used, <code>e.updateProp</code> is set to the data property being dragged.
   * The <code>this</code> context is the point. See drag and drop options.
   *
   */
  @JSProperty("dragStart")
  void setDragStart(@Nullable PointDragStartCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Callback that fires when the point is
   * dropped. The parameters passed are the same as for drag. To stop the
   * default drop action, return false. See drag and drop options.
   *
   */
  @JSProperty("drop")
  @Nullable
  PointDropCallbackFunction getDrop();

  /**
   * (Highcharts, Highstock, Gantt) Callback that fires when the point is
   * dropped. The parameters passed are the same as for drag. To stop the
   * default drop action, return false. See drag and drop options.
   *
   */
  @JSProperty("drop")
  void setDrop(@Nullable PointDropCallbackFunction value);

  /**
   * (Highcharts) Fires when the legend item belonging to the pie point
   * (slice) is clicked. The <code>this</code> keyword refers to the point itself. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information. The default action is to toggle the visibility of the point.
   * This can be prevented by calling <code>event.preventDefault()</code>.
   *
   */
  @JSProperty("legendItemClick")
  @Nullable
  PointLegendItemClickCallbackFunction getLegendItemClick();

  /**
   * (Highcharts) Fires when the legend item belonging to the pie point
   * (slice) is clicked. The <code>this</code> keyword refers to the point itself. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information. The default action is to toggle the visibility of the point.
   * This can be prevented by calling <code>event.preventDefault()</code>.
   *
   */
  @JSProperty("legendItemClick")
  void setLegendItemClick(@Nullable PointLegendItemClickCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
   * to the point. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   */
  @JSProperty("mouseOut")
  @Nullable
  PointMouseOutCallbackFunction getMouseOut();

  /**
   * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
   * to the point. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   */
  @JSProperty("mouseOut")
  void setMouseOut(@Nullable PointMouseOutCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
   * to the point. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   */
  @JSProperty("mouseOver")
  @Nullable
  PointMouseOverCallbackFunction getMouseOver();

  /**
   * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
   * to the point. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   */
  @JSProperty("mouseOver")
  void setMouseOver(@Nullable PointMouseOverCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
   * <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("remove")
  @Nullable
  PointRemoveCallbackFunction getRemove();

  /**
   * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
   * <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("remove")
  void setRemove(@Nullable PointRemoveCallbackFunction value);

  /**
   * Fires when the point is selected either programmatically or following a
   * click on the point. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("select")
  @Nullable
  PointSelectCallbackFunction getSelect();

  /**
   * Fires when the point is selected either programmatically or following a
   * click on the point. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("select")
  void setSelect(@Nullable PointSelectCallbackFunction value);

  /**
   * Fires when the point is unselected either programmatically or following a
   * click on the point. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("unselect")
  @Nullable
  PointUnselectCallbackFunction getUnselect();

  /**
   * Fires when the point is unselected either programmatically or following a
   * click on the point. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("unselect")
  void setUnselect(@Nullable PointUnselectCallbackFunction value);

  /**
   * (Highcharts, Highstock, Gantt) Fires when the point is updated
   * programmatically through the <code>.update()</code> method. One parameter, <code>event</code>,
   * is passed to the function. The new point options can be accessed through
   * <code>event.options</code>. Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("update")
  @Nullable
  PointUpdateCallbackFunction getUpdate();

  /**
   * (Highcharts, Highstock, Gantt) Fires when the point is updated
   * programmatically through the <code>.update()</code> method. One parameter, <code>event</code>,
   * is passed to the function. The new point options can be accessed through
   * <code>event.options</code>. Returning <code>false</code> cancels the operation.
   *
   */
  @JSProperty("update")
  void setUpdate(@Nullable PointUpdateCallbackFunction value);

  class Builder {
    private final PointEventsOptionsObject object = Any.empty();

    public PointEventsOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Fires when a point is clicked. One
     * parameter, <code>event</code>, is passed to the function, containing common event
     * information.
     *
     * If the <code>series.allowPointSelect</code> option is true, the default action for
     * the point's click event is to toggle the point's select state. Returning
     * <code>false</code> cancels this action.
     *
     */
    public Builder click(@Nullable PointClickCallbackFunction value) {
      object.setClick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
     * point. The mouse event is passed in as parameter. The original data can
     * be accessed from <code>e.origin</code>, and the new point values can be accessed
     * from <code>e.newPoints</code>. If there is only a single point being updated, it can
     * be accessed from <code>e.newPoint</code> for simplicity, and its ID can be accessed
     * from <code>e.newPointId</code>. The <code>this</code> context is the point being dragged. To
     * stop the default drag action, return false. See drag and drop options.
     *
     */
    public Builder drag(@Nullable PointDragCallbackFunction value) {
      object.setDrag(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
     * a point. The mouse event object is passed in as an argument. If a drag
     * handle is used, <code>e.updateProp</code> is set to the data property being dragged.
     * The <code>this</code> context is the point. See drag and drop options.
     *
     */
    public Builder dragStart(@Nullable PointDragStartCallbackFunction value) {
      object.setDragStart(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Callback that fires when the point is
     * dropped. The parameters passed are the same as for drag. To stop the
     * default drop action, return false. See drag and drop options.
     *
     */
    public Builder drop(@Nullable PointDropCallbackFunction value) {
      object.setDrop(value);
      return this;
    }

    /**
     * (Highcharts) Fires when the legend item belonging to the pie point
     * (slice) is clicked. The <code>this</code> keyword refers to the point itself. One
     * parameter, <code>event</code>, is passed to the function, containing common event
     * information. The default action is to toggle the visibility of the point.
     * This can be prevented by calling <code>event.preventDefault()</code>.
     *
     */
    public Builder legendItemClick(@Nullable PointLegendItemClickCallbackFunction value) {
      object.setLegendItemClick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
     * to the point. One parameter, <code>event</code>, is passed to the function,
     * containing common event information.
     *
     */
    public Builder mouseOut(@Nullable PointMouseOutCallbackFunction value) {
      object.setMouseOut(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
     * to the point. One parameter, <code>event</code>, is passed to the function,
     * containing common event information.
     *
     */
    public Builder mouseOver(@Nullable PointMouseOverCallbackFunction value) {
      object.setMouseOver(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
     * <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function.
     * Returning <code>false</code> cancels the operation.
     *
     */
    public Builder remove(@Nullable PointRemoveCallbackFunction value) {
      object.setRemove(value);
      return this;
    }

    /**
     * Fires when the point is selected either programmatically or following a
     * click on the point. One parameter, <code>event</code>, is passed to the function.
     * Returning <code>false</code> cancels the operation.
     *
     */
    public Builder select(@Nullable PointSelectCallbackFunction value) {
      object.setSelect(value);
      return this;
    }

    /**
     * Fires when the point is unselected either programmatically or following a
     * click on the point. One parameter, <code>event</code>, is passed to the function.
     * Returning <code>false</code> cancels the operation.
     *
     */
    public Builder unselect(@Nullable PointUnselectCallbackFunction value) {
      object.setUnselect(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Fires when the point is updated
     * programmatically through the <code>.update()</code> method. One parameter, <code>event</code>,
     * is passed to the function. The new point options can be accessed through
     * <code>event.options</code>. Returning <code>false</code> cancels the operation.
     *
     */
    public Builder update(@Nullable PointUpdateCallbackFunction value) {
      object.setUpdate(value);
      return this;
    }
  }
}
