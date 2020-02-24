package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.point">https://api.highcharts.com/highcharts/plotOptions.area.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.point">https://api.highcharts.com/highstock/plotOptions.area.point</a>
 *
 */
public interface PlotAreaPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.point.events">https://api.highcharts.com/highcharts/plotOptions.area.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.point.events">https://api.highcharts.com/highstock/plotOptions.area.point.events</a>
   *
   * @implspec events?: PlotAreaPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotAreaPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.point.events">https://api.highcharts.com/highcharts/plotOptions.area.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.point.events">https://api.highcharts.com/highstock/plotOptions.area.point.events</a>
   *
   * @implspec events?: PlotAreaPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotAreaPointEventsOptions value);
}
