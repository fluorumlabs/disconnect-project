package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.point">https://api.highcharts.com/highstock/plotOptions.cci.point</a>
 *
 */
public interface PlotCciPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.point.events">https://api.highcharts.com/highstock/plotOptions.cci.point.events</a>
   *
   * @implspec events?: PlotCciPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotCciPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.point.events">https://api.highcharts.com/highstock/plotOptions.cci.point.events</a>
   *
   * @implspec events?: PlotCciPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotCciPointEventsOptions value);
}
