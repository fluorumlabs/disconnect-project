package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.point">https://api.highcharts.com/highstock/plotOptions.momentum.point</a>
 *
 */
public interface PlotMomentumPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.point.events">https://api.highcharts.com/highstock/plotOptions.momentum.point.events</a>
   *
   * @implspec events?: PlotMomentumPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMomentumPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.point.events">https://api.highcharts.com/highstock/plotOptions.momentum.point.events</a>
   *
   * @implspec events?: PlotMomentumPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMomentumPointEventsOptions value);
}
