package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Common information for a click event on a series.
 *
 */
public interface SeriesClickEventObject extends Any {
  /**
   * Nearest point on the graph.
   *
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * Nearest point on the graph.
   *
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  void setPoint(Point value);
}
