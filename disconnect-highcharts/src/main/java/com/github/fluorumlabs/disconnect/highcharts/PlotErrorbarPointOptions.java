package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.point">https://api.highcharts.com/highcharts/plotOptions.errorbar.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.point">https://api.highcharts.com/highstock/plotOptions.errorbar.point</a>
 *
 */
public interface PlotErrorbarPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.point.events">https://api.highcharts.com/highcharts/plotOptions.errorbar.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.point.events">https://api.highcharts.com/highstock/plotOptions.errorbar.point.events</a>
   *
   * @implspec events?: PlotErrorbarPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotErrorbarPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar.point.events">https://api.highcharts.com/highcharts/plotOptions.errorbar.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar.point.events">https://api.highcharts.com/highstock/plotOptions.errorbar.point.events</a>
   *
   * @implspec events?: PlotErrorbarPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotErrorbarPointEventsOptions value);
}
