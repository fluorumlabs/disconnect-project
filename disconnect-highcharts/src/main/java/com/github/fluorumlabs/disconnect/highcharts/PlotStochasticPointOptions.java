package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.point">https://api.highcharts.com/highstock/plotOptions.stochastic.point</a>
 *
 */
public interface PlotStochasticPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.point.events">https://api.highcharts.com/highstock/plotOptions.stochastic.point.events</a>
   *
   * @implspec events?: PlotStochasticPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotStochasticPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.point.events">https://api.highcharts.com/highstock/plotOptions.stochastic.point.events</a>
   *
   * @implspec events?: PlotStochasticPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotStochasticPointEventsOptions value);
}
