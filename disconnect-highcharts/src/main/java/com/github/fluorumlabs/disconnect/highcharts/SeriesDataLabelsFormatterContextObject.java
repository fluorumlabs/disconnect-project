package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface SeriesDataLabelsFormatterContextObject extends Any {
  /**
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * @implspec point: Point;
   *
   */
  @JSProperty("point")
  void setPoint(Point value);
}
