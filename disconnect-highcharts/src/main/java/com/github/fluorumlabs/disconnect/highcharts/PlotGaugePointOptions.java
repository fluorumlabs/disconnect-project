package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.point">https://api.highcharts.com/highcharts/plotOptions.gauge.point</a>
 *
 */
public interface PlotGaugePointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.point.events">https://api.highcharts.com/highcharts/plotOptions.gauge.point.events</a>
   *
   * @implspec events?: PlotGaugePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotGaugePointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.point.events">https://api.highcharts.com/highcharts/plotOptions.gauge.point.events</a>
   *
   * @implspec events?: PlotGaugePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotGaugePointEventsOptions value);
}
