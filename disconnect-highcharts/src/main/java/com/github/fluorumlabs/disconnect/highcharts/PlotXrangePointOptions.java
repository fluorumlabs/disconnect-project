package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.point">https://api.highcharts.com/highcharts/plotOptions.xrange.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.point">https://api.highcharts.com/highstock/plotOptions.xrange.point</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.point">https://api.highcharts.com/gantt/plotOptions.xrange.point</a>
 *
 */
public interface PlotXrangePointOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.point.events">https://api.highcharts.com/highcharts/plotOptions.xrange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.point.events">https://api.highcharts.com/highstock/plotOptions.xrange.point.events</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.point.events">https://api.highcharts.com/gantt/plotOptions.xrange.point.events</a>
   *
   * @implspec events?: PlotXrangePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotXrangePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.point.events">https://api.highcharts.com/highcharts/plotOptions.xrange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.point.events">https://api.highcharts.com/highstock/plotOptions.xrange.point.events</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.point.events">https://api.highcharts.com/gantt/plotOptions.xrange.point.events</a>
   *
   * @implspec events?: PlotXrangePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotXrangePointEventsOptions value);
}
