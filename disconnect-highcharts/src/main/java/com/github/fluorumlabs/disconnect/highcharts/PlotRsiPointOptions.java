package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.point">https://api.highcharts.com/highstock/plotOptions.rsi.point</a>
 *
 */
public interface PlotRsiPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.point.events">https://api.highcharts.com/highstock/plotOptions.rsi.point.events</a>
   *
   * @implspec events?: PlotRsiPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotRsiPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.point.events">https://api.highcharts.com/highstock/plotOptions.rsi.point.events</a>
   *
   * @implspec events?: PlotRsiPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotRsiPointEventsOptions value);
}
