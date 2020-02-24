package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.point">https://api.highcharts.com/highcharts/plotOptions.arearange.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.point">https://api.highcharts.com/highstock/plotOptions.arearange.point</a>
 *
 */
public interface PlotArearangePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.point.events">https://api.highcharts.com/highcharts/plotOptions.arearange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.point.events">https://api.highcharts.com/highstock/plotOptions.arearange.point.events</a>
   *
   * @implspec events?: PlotArearangePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotArearangePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.point.events">https://api.highcharts.com/highcharts/plotOptions.arearange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.point.events">https://api.highcharts.com/highstock/plotOptions.arearange.point.events</a>
   *
   * @implspec events?: PlotArearangePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotArearangePointEventsOptions value);
}
