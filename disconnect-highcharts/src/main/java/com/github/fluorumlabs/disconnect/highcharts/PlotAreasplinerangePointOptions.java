package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.point">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.point">https://api.highcharts.com/highstock/plotOptions.areasplinerange.point</a>
 *
 */
public interface PlotAreasplinerangePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.point.events">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.point.events">https://api.highcharts.com/highstock/plotOptions.areasplinerange.point.events</a>
   *
   * @implspec events?: PlotAreasplinerangePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotAreasplinerangePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.point.events">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.point.events">https://api.highcharts.com/highstock/plotOptions.areasplinerange.point.events</a>
   *
   * @implspec events?: PlotAreasplinerangePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotAreasplinerangePointEventsOptions value);
}
