package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.point">https://api.highcharts.com/highcharts/plotOptions.treemap.point</a>
 *
 */
public interface PlotTreemapPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.point.events">https://api.highcharts.com/highcharts/plotOptions.treemap.point.events</a>
   *
   * @implspec events?: PlotTreemapPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotTreemapPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.point.events">https://api.highcharts.com/highcharts/plotOptions.treemap.point.events</a>
   *
   * @implspec events?: PlotTreemapPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotTreemapPointEventsOptions value);
}
