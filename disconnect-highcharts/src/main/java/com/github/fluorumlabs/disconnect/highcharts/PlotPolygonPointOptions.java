package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.point">https://api.highcharts.com/highcharts/plotOptions.polygon.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.point">https://api.highcharts.com/highstock/plotOptions.polygon.point</a>
 *
 */
public interface PlotPolygonPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.point.events">https://api.highcharts.com/highcharts/plotOptions.polygon.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.point.events">https://api.highcharts.com/highstock/plotOptions.polygon.point.events</a>
   *
   * @implspec events?: PlotPolygonPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPolygonPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.point.events">https://api.highcharts.com/highcharts/plotOptions.polygon.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.point.events">https://api.highcharts.com/highstock/plotOptions.polygon.point.events</a>
   *
   * @implspec events?: PlotPolygonPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPolygonPointEventsOptions value);
}
