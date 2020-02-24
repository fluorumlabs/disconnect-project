package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.point">https://api.highcharts.com/highcharts/plotOptions.bar.point</a>
 *
 */
public interface PlotBarPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.point.events">https://api.highcharts.com/highcharts/plotOptions.bar.point.events</a>
   *
   * @implspec events?: PlotBarPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBarPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.point.events">https://api.highcharts.com/highcharts/plotOptions.bar.point.events</a>
   *
   * @implspec events?: PlotBarPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBarPointEventsOptions value);
}
