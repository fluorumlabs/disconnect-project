package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.point">https://api.highcharts.com/highcharts/plotOptions.scatter.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.point">https://api.highcharts.com/highstock/plotOptions.scatter.point</a>
 *
 */
public interface PlotScatterPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.point.events">https://api.highcharts.com/highcharts/plotOptions.scatter.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.point.events">https://api.highcharts.com/highstock/plotOptions.scatter.point.events</a>
   *
   * @implspec events?: PlotScatterPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotScatterPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.point.events">https://api.highcharts.com/highcharts/plotOptions.scatter.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.point.events">https://api.highcharts.com/highstock/plotOptions.scatter.point.events</a>
   *
   * @implspec events?: PlotScatterPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotScatterPointEventsOptions value);
}
