package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.point">https://api.highcharts.com/highcharts/plotOptions.pie.point</a>
 *
 */
public interface PlotPiePointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.point.events">https://api.highcharts.com/highcharts/plotOptions.pie.point.events</a>
   *
   * @implspec events?: PlotPiePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPiePointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.point.events">https://api.highcharts.com/highcharts/plotOptions.pie.point.events</a>
   *
   * @implspec events?: PlotPiePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPiePointEventsOptions value);
}
