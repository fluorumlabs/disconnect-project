package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.point">https://api.highcharts.com/highstock/plotOptions.psar.point</a>
 *
 */
public interface PlotPsarPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.point.events">https://api.highcharts.com/highstock/plotOptions.psar.point.events</a>
   *
   * @implspec events?: PlotPsarPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPsarPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.point.events">https://api.highcharts.com/highstock/plotOptions.psar.point.events</a>
   *
   * @implspec events?: PlotPsarPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPsarPointEventsOptions value);
}
