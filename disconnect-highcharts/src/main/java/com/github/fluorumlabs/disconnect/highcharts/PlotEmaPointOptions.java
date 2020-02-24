package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.point">https://api.highcharts.com/highstock/plotOptions.ema.point</a>
 *
 */
public interface PlotEmaPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.point.events">https://api.highcharts.com/highstock/plotOptions.ema.point.events</a>
   *
   * @implspec events?: PlotEmaPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotEmaPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.point.events">https://api.highcharts.com/highstock/plotOptions.ema.point.events</a>
   *
   * @implspec events?: PlotEmaPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotEmaPointEventsOptions value);
}
