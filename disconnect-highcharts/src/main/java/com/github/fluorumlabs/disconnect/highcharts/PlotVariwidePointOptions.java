package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.point">https://api.highcharts.com/highcharts/plotOptions.variwide.point</a>
 *
 */
public interface PlotVariwidePointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.point.events">https://api.highcharts.com/highcharts/plotOptions.variwide.point.events</a>
   *
   * @implspec events?: PlotVariwidePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotVariwidePointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.point.events">https://api.highcharts.com/highcharts/plotOptions.variwide.point.events</a>
   *
   * @implspec events?: PlotVariwidePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotVariwidePointEventsOptions value);
}
