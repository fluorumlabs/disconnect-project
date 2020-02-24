package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.point">https://api.highcharts.com/highstock/plotOptions.ad.point</a>
 *
 */
public interface PlotAdPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.point.events">https://api.highcharts.com/highstock/plotOptions.ad.point.events</a>
   *
   * @implspec events?: PlotAdPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotAdPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.point.events">https://api.highcharts.com/highstock/plotOptions.ad.point.events</a>
   *
   * @implspec events?: PlotAdPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotAdPointEventsOptions value);
}
