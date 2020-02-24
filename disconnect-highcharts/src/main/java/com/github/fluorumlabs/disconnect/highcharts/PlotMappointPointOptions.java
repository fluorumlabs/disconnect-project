package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.point">https://api.highcharts.com/highmaps/plotOptions.mappoint.point</a>
 *
 */
public interface PlotMappointPointOptions extends Any {
  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.point.events">https://api.highcharts.com/highmaps/plotOptions.mappoint.point.events</a>
   *
   * @implspec events?: PlotMappointPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMappointPointEventsOptions getEvents();

  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.point.events">https://api.highcharts.com/highmaps/plotOptions.mappoint.point.events</a>
   *
   * @implspec events?: PlotMappointPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMappointPointEventsOptions value);
}
