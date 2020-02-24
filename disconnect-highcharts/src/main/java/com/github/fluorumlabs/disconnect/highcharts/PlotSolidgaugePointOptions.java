package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.point">https://api.highcharts.com/highcharts/plotOptions.solidgauge.point</a>
 *
 */
public interface PlotSolidgaugePointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.point.events">https://api.highcharts.com/highcharts/plotOptions.solidgauge.point.events</a>
   *
   * @implspec events?: PlotSolidgaugePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSolidgaugePointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge.point.events">https://api.highcharts.com/highcharts/plotOptions.solidgauge.point.events</a>
   *
   * @implspec events?: PlotSolidgaugePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSolidgaugePointEventsOptions value);
}
