package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.point">https://api.highcharts.com/highcharts/plotOptions.histogram.point</a>
 *
 */
public interface PlotHistogramPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.point.events">https://api.highcharts.com/highcharts/plotOptions.histogram.point.events</a>
   *
   * @implspec events?: PlotHistogramPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotHistogramPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.point.events">https://api.highcharts.com/highcharts/plotOptions.histogram.point.events</a>
   *
   * @implspec events?: PlotHistogramPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotHistogramPointEventsOptions value);
}
