package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.point">https://api.highcharts.com/highcharts/plotOptions.areaspline.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.point">https://api.highcharts.com/highstock/plotOptions.areaspline.point</a>
 *
 */
public interface PlotAreasplinePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.point.events">https://api.highcharts.com/highcharts/plotOptions.areaspline.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.point.events">https://api.highcharts.com/highstock/plotOptions.areaspline.point.events</a>
   *
   * @implspec events?: PlotAreasplinePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotAreasplinePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.point.events">https://api.highcharts.com/highcharts/plotOptions.areaspline.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.point.events">https://api.highcharts.com/highstock/plotOptions.areaspline.point.events</a>
   *
   * @implspec events?: PlotAreasplinePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotAreasplinePointEventsOptions value);
}
