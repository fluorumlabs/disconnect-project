package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.point">https://api.highcharts.com/highcharts/plotOptions.spline.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.point">https://api.highcharts.com/highstock/plotOptions.spline.point</a>
 *
 */
public interface PlotSplinePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.point.events">https://api.highcharts.com/highcharts/plotOptions.spline.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.point.events">https://api.highcharts.com/highstock/plotOptions.spline.point.events</a>
   *
   * @implspec events?: PlotSplinePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSplinePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.point.events">https://api.highcharts.com/highcharts/plotOptions.spline.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.point.events">https://api.highcharts.com/highstock/plotOptions.spline.point.events</a>
   *
   * @implspec events?: PlotSplinePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSplinePointEventsOptions value);
}
