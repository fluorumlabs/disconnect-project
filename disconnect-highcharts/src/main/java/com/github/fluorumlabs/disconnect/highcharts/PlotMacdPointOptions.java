package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.point">https://api.highcharts.com/highstock/plotOptions.macd.point</a>
 *
 */
public interface PlotMacdPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.point.events">https://api.highcharts.com/highstock/plotOptions.macd.point.events</a>
   *
   * @implspec events?: PlotMacdPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMacdPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.point.events">https://api.highcharts.com/highstock/plotOptions.macd.point.events</a>
   *
   * @implspec events?: PlotMacdPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMacdPointEventsOptions value);
}
