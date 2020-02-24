package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.point">https://api.highcharts.com/highstock/plotOptions.flags.point</a>
 *
 */
public interface PlotFlagsPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.point.events">https://api.highcharts.com/highstock/plotOptions.flags.point.events</a>
   *
   * @implspec events?: PlotFlagsPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotFlagsPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.point.events">https://api.highcharts.com/highstock/plotOptions.flags.point.events</a>
   *
   * @implspec events?: PlotFlagsPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotFlagsPointEventsOptions value);
}
