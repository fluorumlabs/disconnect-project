package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
 *
 * @see <a href="https://api.highcharts.com/highcharts/xAxis.events">https://api.highcharts.com/highcharts/xAxis.events</a>
 * @see <a href="https://api.highcharts.com/highstock/xAxis.events">https://api.highcharts.com/highstock/xAxis.events</a>
 * @see <a href="https://api.highcharts.com/highmaps/xAxis.events">https://api.highcharts.com/highmaps/xAxis.events</a>
 *
 */
public interface XAxisEventsOptions extends Any {
  /**
   * (Highcharts, Gantt) An event fired after the breaks have rendered.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.afterBreaks">https://api.highcharts.com/highcharts/xAxis.events.afterBreaks</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.events.afterBreaks">https://api.highcharts.com/gantt/xAxis.events.afterBreaks</a>
   *
   * @implspec afterBreaks?: () =&gt; void;
   *
   */
  @JSProperty("afterBreaks")
  @Nullable
  AfterBreaks getAfterBreaks();

  /**
   * (Highcharts, Gantt) An event fired after the breaks have rendered.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.afterBreaks">https://api.highcharts.com/highcharts/xAxis.events.afterBreaks</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.events.afterBreaks">https://api.highcharts.com/gantt/xAxis.events.afterBreaks</a>
   *
   * @implspec afterBreaks?: () =&gt; void;
   *
   */
  @JSProperty("afterBreaks")
  void setAfterBreaks(AfterBreaks value);

  /**
   * (Highcharts, Highstock, Highmaps) As opposed to the <code>setExtremes</code> event,
   * this event fires after the final min and max values are computed and
   * corrected for <code>minRange</code>.
   *
   * Fires when the minimum and maximum is set for the axis, either by calling
   * the <code>.setExtremes()</code> method or by selecting an area in the chart. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in axis
   * values. The actual data extremes are found in <code>event.dataMin</code> and
   * <code>event.dataMax</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.afterSetExtremes">https://api.highcharts.com/highcharts/xAxis.events.afterSetExtremes</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events.afterSetExtremes">https://api.highcharts.com/highstock/xAxis.events.afterSetExtremes</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.events.afterSetExtremes">https://api.highcharts.com/highmaps/xAxis.events.afterSetExtremes</a>
   *
   * @implspec afterSetExtremes?: () =&gt; void;
   *
   */
  @JSProperty("afterSetExtremes")
  @Nullable
  AfterSetExtremes getAfterSetExtremes();

  /**
   * (Highcharts, Highstock, Highmaps) As opposed to the <code>setExtremes</code> event,
   * this event fires after the final min and max values are computed and
   * corrected for <code>minRange</code>.
   *
   * Fires when the minimum and maximum is set for the axis, either by calling
   * the <code>.setExtremes()</code> method or by selecting an area in the chart. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in axis
   * values. The actual data extremes are found in <code>event.dataMin</code> and
   * <code>event.dataMax</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.afterSetExtremes">https://api.highcharts.com/highcharts/xAxis.events.afterSetExtremes</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events.afterSetExtremes">https://api.highcharts.com/highstock/xAxis.events.afterSetExtremes</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.events.afterSetExtremes">https://api.highcharts.com/highmaps/xAxis.events.afterSetExtremes</a>
   *
   * @implspec afterSetExtremes?: () =&gt; void;
   *
   */
  @JSProperty("afterSetExtremes")
  void setAfterSetExtremes(AfterSetExtremes value);

  /**
   * (Highcharts, Gantt) An event fired when a break from this axis occurs on
   * a point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.pointBreak">https://api.highcharts.com/highcharts/xAxis.events.pointBreak</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.events.pointBreak">https://api.highcharts.com/gantt/xAxis.events.pointBreak</a>
   *
   * @implspec pointBreak?: () =&gt; void;
   *
   */
  @JSProperty("pointBreak")
  @Nullable
  PointBreak getPointBreak();

  /**
   * (Highcharts, Gantt) An event fired when a break from this axis occurs on
   * a point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.pointBreak">https://api.highcharts.com/highcharts/xAxis.events.pointBreak</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.events.pointBreak">https://api.highcharts.com/gantt/xAxis.events.pointBreak</a>
   *
   * @implspec pointBreak?: () =&gt; void;
   *
   */
  @JSProperty("pointBreak")
  void setPointBreak(PointBreak value);

  /**
   * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
   * break from this axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.pointInBreak">https://api.highcharts.com/highcharts/xAxis.events.pointInBreak</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events.pointInBreak">https://api.highcharts.com/highstock/xAxis.events.pointInBreak</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.events.pointInBreak">https://api.highcharts.com/gantt/xAxis.events.pointInBreak</a>
   *
   * @implspec pointInBreak?: () =&gt; void;
   *
   */
  @JSProperty("pointInBreak")
  @Nullable
  PointInBreak getPointInBreak();

  /**
   * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
   * break from this axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.pointInBreak">https://api.highcharts.com/highcharts/xAxis.events.pointInBreak</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events.pointInBreak">https://api.highcharts.com/highstock/xAxis.events.pointInBreak</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.events.pointInBreak">https://api.highcharts.com/gantt/xAxis.events.pointInBreak</a>
   *
   * @implspec pointInBreak?: () =&gt; void;
   *
   */
  @JSProperty("pointInBreak")
  void setPointInBreak(PointInBreak value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
   * set for the axis, either by calling the <code>.setExtremes()</code> method or by
   * selecting an area in the chart. One parameter, <code>event</code>, is passed to the
   * function, containing common event information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in data
   * values. When an axis is zoomed all the way out from the &quot;Reset zoom&quot;
   * button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are
   * set based on <code>this.dataMin</code> and <code>this.dataMax</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.setExtremes">https://api.highcharts.com/highcharts/xAxis.events.setExtremes</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events.setExtremes">https://api.highcharts.com/highstock/xAxis.events.setExtremes</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.events.setExtremes">https://api.highcharts.com/highmaps/xAxis.events.setExtremes</a>
   *
   * @implspec setExtremes?: () =&gt; void;
   *
   */
  @JSProperty("setExtremes")
  @Nullable
  SetExtremes getSetExtremes();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
   * set for the axis, either by calling the <code>.setExtremes()</code> method or by
   * selecting an area in the chart. One parameter, <code>event</code>, is passed to the
   * function, containing common event information.
   *
   * The new user set minimum and maximum values can be found by <code>event.min</code>
   * and <code>event.max</code>. These reflect the axis minimum and maximum in data
   * values. When an axis is zoomed all the way out from the &quot;Reset zoom&quot;
   * button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are
   * set based on <code>this.dataMin</code> and <code>this.dataMax</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events.setExtremes">https://api.highcharts.com/highcharts/xAxis.events.setExtremes</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events.setExtremes">https://api.highcharts.com/highstock/xAxis.events.setExtremes</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.events.setExtremes">https://api.highcharts.com/highmaps/xAxis.events.setExtremes</a>
   *
   * @implspec setExtremes?: () =&gt; void;
   *
   */
  @JSProperty("setExtremes")
  void setSetExtremes(SetExtremes value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface AfterBreaks extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface AfterSetExtremes extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointBreak extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointInBreak extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface SetExtremes extends Any {
    void apply();
  }
}
