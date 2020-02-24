package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.point">https://api.highcharts.com/highcharts/plotOptions.windbarb.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.point">https://api.highcharts.com/highstock/plotOptions.windbarb.point</a>
 *
 */
public interface PlotWindbarbPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.point.events">https://api.highcharts.com/highcharts/plotOptions.windbarb.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.point.events">https://api.highcharts.com/highstock/plotOptions.windbarb.point.events</a>
   *
   * @implspec events?: PlotWindbarbPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotWindbarbPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.point.events">https://api.highcharts.com/highcharts/plotOptions.windbarb.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.point.events">https://api.highcharts.com/highstock/plotOptions.windbarb.point.events</a>
   *
   * @implspec events?: PlotWindbarbPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotWindbarbPointEventsOptions value);
}
