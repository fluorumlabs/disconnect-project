package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie.point">https://api.highcharts.com/highcharts/plotOptions.variablepie.point</a>
 *
 */
public interface PlotVariablepiePointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie.point.events">https://api.highcharts.com/highcharts/plotOptions.variablepie.point.events</a>
   *
   * @implspec events?: PlotVariablepiePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotVariablepiePointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie.point.events">https://api.highcharts.com/highcharts/plotOptions.variablepie.point.events</a>
   *
   * @implspec events?: PlotVariablepiePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotVariablepiePointEventsOptions value);
}
