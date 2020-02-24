package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.point">https://api.highcharts.com/highcharts/plotOptions.boxplot.point</a>
 *
 */
public interface PlotBoxplotPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.point.events">https://api.highcharts.com/highcharts/plotOptions.boxplot.point.events</a>
   *
   * @implspec events?: PlotBoxplotPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBoxplotPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.point.events">https://api.highcharts.com/highcharts/plotOptions.boxplot.point.events</a>
   *
   * @implspec events?: PlotBoxplotPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBoxplotPointEventsOptions value);
}
