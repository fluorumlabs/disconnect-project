package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.point">https://api.highcharts.com/highcharts/plotOptions.line.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.point">https://api.highcharts.com/highstock/plotOptions.line.point</a>
 *
 */
public interface PlotLinePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.point.events">https://api.highcharts.com/highcharts/plotOptions.line.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.point.events">https://api.highcharts.com/highstock/plotOptions.line.point.events</a>
   *
   * @implspec events?: PlotLinePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotLinePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.point.events">https://api.highcharts.com/highcharts/plotOptions.line.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.point.events">https://api.highcharts.com/highstock/plotOptions.line.point.events</a>
   *
   * @implspec events?: PlotLinePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotLinePointEventsOptions value);
}
