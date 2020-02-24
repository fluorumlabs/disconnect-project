package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.point">https://api.highcharts.com/highstock/plotOptions.zigzag.point</a>
 *
 */
public interface PlotZigzagPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.point.events">https://api.highcharts.com/highstock/plotOptions.zigzag.point.events</a>
   *
   * @implspec events?: PlotZigzagPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotZigzagPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.point.events">https://api.highcharts.com/highstock/plotOptions.zigzag.point.events</a>
   *
   * @implspec events?: PlotZigzagPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotZigzagPointEventsOptions value);
}
