package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Contains two arrays of axes that are controlled by control line
 * of the axis.
 *
 * This feature requires the <code>drag-panes.js</code> module.
 *
 * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis</a>
 *
 */
public interface YAxisResizeControlledAxisOptions extends Any {
  /**
   * (Highstock) Array of axes that should move out of the way of resizing
   * being done for the current axis. If not set, the next axis will be used.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.next">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.next</a>
   *
   * @implspec next?: Array&lt;(string|number)&gt;;
   *
   */
  @JSProperty("next")
  @Nullable
  Array<Unknown> getNext();

  /**
   * (Highstock) Array of axes that should move out of the way of resizing
   * being done for the current axis. If not set, the next axis will be used.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.next">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.next</a>
   *
   * @implspec next?: Array&lt;(string|number)&gt;;
   *
   */
  @JSProperty("next")
  void setNext(Array<Unknown> value);

  /**
   * (Highstock) Array of axes that should move with the current axis while
   * resizing.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.prev">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.prev</a>
   *
   * @implspec prev?: Array&lt;(string|number)&gt;;
   *
   */
  @JSProperty("prev")
  @Nullable
  Array<Unknown> getPrev();

  /**
   * (Highstock) Array of axes that should move with the current axis while
   * resizing.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.prev">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis.prev</a>
   *
   * @implspec prev?: Array&lt;(string|number)&gt;;
   *
   */
  @JSProperty("prev")
  void setPrev(Array<Unknown> value);
}
