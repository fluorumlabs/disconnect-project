package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.point">https://api.highcharts.com/highstock/plotOptions.wma.point</a>
 *
 */
public interface PlotWmaPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.point.events">https://api.highcharts.com/highstock/plotOptions.wma.point.events</a>
   *
   * @implspec events?: PlotWmaPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotWmaPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.point.events">https://api.highcharts.com/highstock/plotOptions.wma.point.events</a>
   *
   * @implspec events?: PlotWmaPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotWmaPointEventsOptions value);
}
