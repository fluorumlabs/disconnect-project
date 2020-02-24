package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.point">https://api.highcharts.com/highcharts/plotOptions.columnrange.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.point">https://api.highcharts.com/highstock/plotOptions.columnrange.point</a>
 *
 */
public interface PlotColumnrangePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.point.events">https://api.highcharts.com/highcharts/plotOptions.columnrange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.point.events">https://api.highcharts.com/highstock/plotOptions.columnrange.point.events</a>
   *
   * @implspec events?: PlotColumnrangePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotColumnrangePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.point.events">https://api.highcharts.com/highcharts/plotOptions.columnrange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.point.events">https://api.highcharts.com/highstock/plotOptions.columnrange.point.events</a>
   *
   * @implspec events?: PlotColumnrangePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotColumnrangePointEventsOptions value);
}
