package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Time ticks.
 *
 */
public interface TimeTicksObject extends Any {
  @JSBody(script = "return this")
  double[] asArray();

  /**
   * @implspec info: TimeTicksInfoObject;
   *
   */
  @JSProperty("info")
  TimeTicksInfoObject getInfo();

  /**
   * @implspec info: TimeTicksInfoObject;
   *
   */
  @JSProperty("info")
  void setInfo(TimeTicksInfoObject value);
}
