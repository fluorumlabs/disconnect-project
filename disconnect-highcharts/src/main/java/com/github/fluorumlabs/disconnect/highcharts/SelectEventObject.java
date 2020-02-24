package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * Object for select events.
 *
 */
public interface SelectEventObject extends Any {
  /**
   * @implspec originalEvent: Event;
   *
   */
  @JSProperty("originalEvent")
  Event getOriginalEvent();

  /**
   * @implspec originalEvent: Event;
   *
   */
  @JSProperty("originalEvent")
  void setOriginalEvent(Event value);

  /**
   * @implspec xAxis: Array<SelectDataObject>;
   *
   */
  @JSProperty("xAxis")
  Array<SelectDataObject> getXAxis();

  /**
   * @implspec xAxis: Array<SelectDataObject>;
   *
   */
  @JSProperty("xAxis")
  void setXAxis(Array<SelectDataObject> value);

  /**
   * @implspec yAxis: Array<SelectDataObject>;
   *
   */
  @JSProperty("yAxis")
  Array<SelectDataObject> getYAxis();

  /**
   * @implspec yAxis: Array<SelectDataObject>;
   *
   */
  @JSProperty("yAxis")
  void setYAxis(Array<SelectDataObject> value);
}
