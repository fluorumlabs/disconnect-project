package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Events for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events">https://api.highcharts.com/highcharts/plotOptions.column.point.events</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events">https://api.highcharts.com/highstock/plotOptions.column.point.events</a>
 *
 */
public interface PlotColumnPointEventsOptions extends Any {
  /**
   * (Highcharts, Highstock) Fires when a point is clicked. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   *
   * If the <code>series.allowPointSelect</code> option is true, the default action for
   * the point's click event is to toggle the point's select state. Returning
   * <code>false</code> cancels this action.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.click">https://api.highcharts.com/highcharts/plotOptions.column.point.events.click</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.click">https://api.highcharts.com/highstock/plotOptions.column.point.events.click</a>
   *
   * @implspec click?: SeriesPointClickCallbackFunction;
   *
   */
  @JSProperty("click")
  @Nullable
  SeriesPointClickCallbackFunction getClick();

  /**
   * (Highcharts, Highstock) Fires when a point is clicked. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   *
   * If the <code>series.allowPointSelect</code> option is true, the default action for
   * the point's click event is to toggle the point's select state. Returning
   * <code>false</code> cancels this action.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.click">https://api.highcharts.com/highcharts/plotOptions.column.point.events.click</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.click">https://api.highcharts.com/highstock/plotOptions.column.point.events.click</a>
   *
   * @implspec click?: SeriesPointClickCallbackFunction;
   *
   */
  @JSProperty("click")
  void setClick(SeriesPointClickCallbackFunction value);

  /**
   * (Highcharts, Highstock) Callback that fires while dragging a point. The
   * mouse event is passed in as parameter. The original data can be accessed
   * from <code>e.origin</code>, and the new point values can be accessed from
   * <code>e.newPoints</code>. If there is only a single point being updated, it can be
   * accessed from <code>e.newPoint</code> for simplicity, and its ID can be accessed
   * from <code>e.newPointId</code>. The <code>this</code> context is the point being dragged. To
   * stop the default drag action, return false. See drag and drop options.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.drag">https://api.highcharts.com/highcharts/plotOptions.column.point.events.drag</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.drag">https://api.highcharts.com/highstock/plotOptions.column.point.events.drag</a>
   *
   * @implspec drag?: SeriesPointDragCallbackFunction;
   *
   */
  @JSProperty("drag")
  @Nullable
  SeriesPointDragCallbackFunction getDrag();

  /**
   * (Highcharts, Highstock) Callback that fires while dragging a point. The
   * mouse event is passed in as parameter. The original data can be accessed
   * from <code>e.origin</code>, and the new point values can be accessed from
   * <code>e.newPoints</code>. If there is only a single point being updated, it can be
   * accessed from <code>e.newPoint</code> for simplicity, and its ID can be accessed
   * from <code>e.newPointId</code>. The <code>this</code> context is the point being dragged. To
   * stop the default drag action, return false. See drag and drop options.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.drag">https://api.highcharts.com/highcharts/plotOptions.column.point.events.drag</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.drag">https://api.highcharts.com/highstock/plotOptions.column.point.events.drag</a>
   *
   * @implspec drag?: SeriesPointDragCallbackFunction;
   *
   */
  @JSProperty("drag")
  void setDrag(SeriesPointDragCallbackFunction value);

  /**
   * (Highcharts, Highstock) Callback that fires when starting to drag a
   * point. The mouse event object is passed in as an argument. If a drag
   * handle is used, <code>e.updateProp</code> is set to the data property being dragged.
   * The <code>this</code> context is the point. See drag and drop options.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.dragStart">https://api.highcharts.com/highcharts/plotOptions.column.point.events.dragStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.dragStart">https://api.highcharts.com/highstock/plotOptions.column.point.events.dragStart</a>
   *
   * @implspec dragStart?: SeriesPointDragStartCallbackFunction;
   *
   */
  @JSProperty("dragStart")
  @Nullable
  SeriesPointDragStartCallbackFunction getDragStart();

  /**
   * (Highcharts, Highstock) Callback that fires when starting to drag a
   * point. The mouse event object is passed in as an argument. If a drag
   * handle is used, <code>e.updateProp</code> is set to the data property being dragged.
   * The <code>this</code> context is the point. See drag and drop options.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.dragStart">https://api.highcharts.com/highcharts/plotOptions.column.point.events.dragStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.dragStart">https://api.highcharts.com/highstock/plotOptions.column.point.events.dragStart</a>
   *
   * @implspec dragStart?: SeriesPointDragStartCallbackFunction;
   *
   */
  @JSProperty("dragStart")
  void setDragStart(SeriesPointDragStartCallbackFunction value);

  /**
   * (Highcharts, Highstock) Callback that fires when the point is dropped.
   * The parameters passed are the same as for drag. To stop the default drop
   * action, return false. See drag and drop options.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.drop">https://api.highcharts.com/highcharts/plotOptions.column.point.events.drop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.drop">https://api.highcharts.com/highstock/plotOptions.column.point.events.drop</a>
   *
   * @implspec drop?: SeriesPointDropCallbackFunction;
   *
   */
  @JSProperty("drop")
  @Nullable
  SeriesPointDropCallbackFunction getDrop();

  /**
   * (Highcharts, Highstock) Callback that fires when the point is dropped.
   * The parameters passed are the same as for drag. To stop the default drop
   * action, return false. See drag and drop options.
   *
   * Requires the <code>draggable-points</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.drop">https://api.highcharts.com/highcharts/plotOptions.column.point.events.drop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.drop">https://api.highcharts.com/highstock/plotOptions.column.point.events.drop</a>
   *
   * @implspec drop?: SeriesPointDropCallbackFunction;
   *
   */
  @JSProperty("drop")
  void setDrop(SeriesPointDropCallbackFunction value);

  /**
   * (Highcharts, Highstock) Fires when the mouse leaves the area close to the
   * point. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOut">https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOut</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOut">https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOut</a>
   *
   * @implspec mouseOut?: () =&gt; void;
   *
   */
  @JSProperty("mouseOut")
  @Nullable
  MouseOut getMouseOut();

  /**
   * (Highcharts, Highstock) Fires when the mouse leaves the area close to the
   * point. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOut">https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOut</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOut">https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOut</a>
   *
   * @implspec mouseOut?: () =&gt; void;
   *
   */
  @JSProperty("mouseOut")
  void setMouseOut(MouseOut value);

  /**
   * (Highcharts, Highstock) Fires when the mouse enters the area close to the
   * point. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOver">https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOver</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOver">https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOver</a>
   *
   * @implspec mouseOver?: () =&gt; void;
   *
   */
  @JSProperty("mouseOver")
  @Nullable
  MouseOver getMouseOver();

  /**
   * (Highcharts, Highstock) Fires when the mouse enters the area close to the
   * point. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOver">https://api.highcharts.com/highcharts/plotOptions.column.point.events.mouseOver</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOver">https://api.highcharts.com/highstock/plotOptions.column.point.events.mouseOver</a>
   *
   * @implspec mouseOver?: () =&gt; void;
   *
   */
  @JSProperty("mouseOver")
  void setMouseOver(MouseOver value);

  /**
   * (Highcharts, Highstock) Fires when the point is removed using the
   * <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.remove">https://api.highcharts.com/highcharts/plotOptions.column.point.events.remove</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.remove">https://api.highcharts.com/highstock/plotOptions.column.point.events.remove</a>
   *
   * @implspec remove?: () =&gt; void;
   *
   */
  @JSProperty("remove")
  @Nullable
  Remove getRemove();

  /**
   * (Highcharts, Highstock) Fires when the point is removed using the
   * <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function.
   * Returning <code>false</code> cancels the operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.remove">https://api.highcharts.com/highcharts/plotOptions.column.point.events.remove</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.remove">https://api.highcharts.com/highstock/plotOptions.column.point.events.remove</a>
   *
   * @implspec remove?: () =&gt; void;
   *
   */
  @JSProperty("remove")
  void setRemove(Remove value);

  /**
   * (Highcharts, Highstock) Fires when the point is selected either
   * programmatically or following a click on the point. One parameter,
   * <code>event</code>, is passed to the function. Returning <code>false</code> cancels the
   * operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.select">https://api.highcharts.com/highcharts/plotOptions.column.point.events.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.select">https://api.highcharts.com/highstock/plotOptions.column.point.events.select</a>
   *
   * @implspec select?: () =&gt; void;
   *
   */
  @JSProperty("select")
  @Nullable
  Select getSelect();

  /**
   * (Highcharts, Highstock) Fires when the point is selected either
   * programmatically or following a click on the point. One parameter,
   * <code>event</code>, is passed to the function. Returning <code>false</code> cancels the
   * operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.select">https://api.highcharts.com/highcharts/plotOptions.column.point.events.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.select">https://api.highcharts.com/highstock/plotOptions.column.point.events.select</a>
   *
   * @implspec select?: () =&gt; void;
   *
   */
  @JSProperty("select")
  void setSelect(Select value);

  /**
   * (Highcharts, Highstock) Fires when the point is unselected either
   * programmatically or following a click on the point. One parameter,
   * <code>event</code>, is passed to the function. Returning <code>false</code> cancels the
   * operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.unselect">https://api.highcharts.com/highcharts/plotOptions.column.point.events.unselect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.unselect">https://api.highcharts.com/highstock/plotOptions.column.point.events.unselect</a>
   *
   * @implspec unselect?: () =&gt; void;
   *
   */
  @JSProperty("unselect")
  @Nullable
  Unselect getUnselect();

  /**
   * (Highcharts, Highstock) Fires when the point is unselected either
   * programmatically or following a click on the point. One parameter,
   * <code>event</code>, is passed to the function. Returning <code>false</code> cancels the
   * operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.unselect">https://api.highcharts.com/highcharts/plotOptions.column.point.events.unselect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.unselect">https://api.highcharts.com/highstock/plotOptions.column.point.events.unselect</a>
   *
   * @implspec unselect?: () =&gt; void;
   *
   */
  @JSProperty("unselect")
  void setUnselect(Unselect value);

  /**
   * (Highcharts, Highstock) Fires when the point is updated programmatically
   * through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the
   * function. The new point options can be accessed through <code>event.options</code>.
   * Returning <code>false</code> cancels the operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.update">https://api.highcharts.com/highcharts/plotOptions.column.point.events.update</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.update">https://api.highcharts.com/highstock/plotOptions.column.point.events.update</a>
   *
   * @implspec update?: () =&gt; void;
   *
   */
  @JSProperty("update")
  @Nullable
  Update getUpdate();

  /**
   * (Highcharts, Highstock) Fires when the point is updated programmatically
   * through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the
   * function. The new point options can be accessed through <code>event.options</code>.
   * Returning <code>false</code> cancels the operation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events.update">https://api.highcharts.com/highcharts/plotOptions.column.point.events.update</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events.update">https://api.highcharts.com/highstock/plotOptions.column.point.events.update</a>
   *
   * @implspec update?: () =&gt; void;
   *
   */
  @JSProperty("update")
  void setUpdate(Update value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface MouseOut extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface MouseOver extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Remove extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Select extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Unselect extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Update extends Any {
    void apply();
  }
}
