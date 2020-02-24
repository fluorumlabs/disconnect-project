package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.point">https://api.highcharts.com/highstock/plotOptions.ikh.point</a>
 *
 */
public interface PlotIkhPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.point.events">https://api.highcharts.com/highstock/plotOptions.ikh.point.events</a>
   *
   * @implspec events?: PlotIkhPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotIkhPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.point.events">https://api.highcharts.com/highstock/plotOptions.ikh.point.events</a>
   *
   * @implspec events?: PlotIkhPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotIkhPointEventsOptions value);
}
