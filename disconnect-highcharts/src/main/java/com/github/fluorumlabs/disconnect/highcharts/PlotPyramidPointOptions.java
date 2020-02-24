package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.point">https://api.highcharts.com/highcharts/plotOptions.pyramid.point</a>
 *
 */
public interface PlotPyramidPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.point.events">https://api.highcharts.com/highcharts/plotOptions.pyramid.point.events</a>
   *
   * @implspec events?: PlotPyramidPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPyramidPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.point.events">https://api.highcharts.com/highcharts/plotOptions.pyramid.point.events</a>
   *
   * @implspec events?: PlotPyramidPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPyramidPointEventsOptions value);
}
