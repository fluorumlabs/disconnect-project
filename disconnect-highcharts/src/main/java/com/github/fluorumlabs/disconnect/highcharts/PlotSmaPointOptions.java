package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.point">https://api.highcharts.com/highstock/plotOptions.sma.point</a>
 *
 */
public interface PlotSmaPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.point.events">https://api.highcharts.com/highstock/plotOptions.sma.point.events</a>
   *
   * @implspec events?: PlotSmaPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSmaPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.point.events">https://api.highcharts.com/highstock/plotOptions.sma.point.events</a>
   *
   * @implspec events?: PlotSmaPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSmaPointEventsOptions value);
}
