package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.point">https://api.highcharts.com/highcharts/plotOptions.vector.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.point">https://api.highcharts.com/highstock/plotOptions.vector.point</a>
 *
 */
public interface PlotVectorPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.point.events">https://api.highcharts.com/highcharts/plotOptions.vector.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.point.events">https://api.highcharts.com/highstock/plotOptions.vector.point.events</a>
   *
   * @implspec events?: PlotVectorPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotVectorPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.point.events">https://api.highcharts.com/highcharts/plotOptions.vector.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.point.events">https://api.highcharts.com/highstock/plotOptions.vector.point.events</a>
   *
   * @implspec events?: PlotVectorPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotVectorPointEventsOptions value);
}
