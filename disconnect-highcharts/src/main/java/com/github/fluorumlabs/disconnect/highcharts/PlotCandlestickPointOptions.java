package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.point">https://api.highcharts.com/highstock/plotOptions.candlestick.point</a>
 *
 */
public interface PlotCandlestickPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.point.events">https://api.highcharts.com/highstock/plotOptions.candlestick.point.events</a>
   *
   * @implspec events?: PlotCandlestickPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotCandlestickPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.point.events">https://api.highcharts.com/highstock/plotOptions.candlestick.point.events</a>
   *
   * @implspec events?: PlotCandlestickPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotCandlestickPointEventsOptions value);
}
