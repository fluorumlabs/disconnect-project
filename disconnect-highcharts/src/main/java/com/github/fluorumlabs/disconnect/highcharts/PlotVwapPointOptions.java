package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.point">https://api.highcharts.com/highstock/plotOptions.vwap.point</a>
 *
 */
public interface PlotVwapPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.point.events">https://api.highcharts.com/highstock/plotOptions.vwap.point.events</a>
   *
   * @implspec events?: PlotVwapPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotVwapPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.point.events">https://api.highcharts.com/highstock/plotOptions.vwap.point.events</a>
   *
   * @implspec events?: PlotVwapPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotVwapPointEventsOptions value);
}
