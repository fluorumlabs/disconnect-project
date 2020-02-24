package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.point">https://api.highcharts.com/highstock/plotOptions.ohlc.point</a>
 *
 */
public interface PlotOhlcPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.point.events">https://api.highcharts.com/highstock/plotOptions.ohlc.point.events</a>
   *
   * @implspec events?: PlotOhlcPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotOhlcPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.point.events">https://api.highcharts.com/highstock/plotOptions.ohlc.point.events</a>
   *
   * @implspec events?: PlotOhlcPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotOhlcPointEventsOptions value);
}
