package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point">https://api.highcharts.com/highcharts/plotOptions.column.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point">https://api.highcharts.com/highstock/plotOptions.column.point</a>
 *
 */
public interface PlotColumnPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events">https://api.highcharts.com/highcharts/plotOptions.column.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events">https://api.highcharts.com/highstock/plotOptions.column.point.events</a>
   *
   * @implspec events?: PlotColumnPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotColumnPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.point.events">https://api.highcharts.com/highcharts/plotOptions.column.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.point.events">https://api.highcharts.com/highstock/plotOptions.column.point.events</a>
   *
   * @implspec events?: PlotColumnPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotColumnPointEventsOptions value);
}
