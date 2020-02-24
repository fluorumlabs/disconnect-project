package com.github.fluorumlabs.disconnect.highcharts;

import com.github.fluorumlabs.disconnect.types.DoubleRecord;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Contains information about a dropped points new values.
 *
 */
public interface SeriesPointDropPointObject extends Any {
  /**
   * New values.
   *
   * @implspec newValues: Dictionary<number>;
   *
   */
  @JSProperty("newValues")
  DoubleRecord getNewValues();

  /**
   * New values.
   *
   * @implspec newValues: Dictionary<number>;
   *
   */
  @JSProperty("newValues")
  void setNewValues(DoubleRecord value);

  /**
   * Dragged point.
   *
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * Dragged point.
   *
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  void setPoint(Point value);
}
