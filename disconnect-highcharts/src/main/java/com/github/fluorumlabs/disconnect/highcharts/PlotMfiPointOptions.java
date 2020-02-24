package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.point">https://api.highcharts.com/highstock/plotOptions.mfi.point</a>
 *
 */
public interface PlotMfiPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.point.events">https://api.highcharts.com/highstock/plotOptions.mfi.point.events</a>
   *
   * @implspec events?: PlotMfiPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMfiPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.point.events">https://api.highcharts.com/highstock/plotOptions.mfi.point.events</a>
   *
   * @implspec events?: PlotMfiPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMfiPointEventsOptions value);
}
