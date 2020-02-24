package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.point">https://api.highcharts.com/highmaps/plotOptions.map.point</a>
 *
 */
public interface PlotMapPointOptions extends Any {
  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.point.events">https://api.highcharts.com/highmaps/plotOptions.map.point.events</a>
   *
   * @implspec events?: PlotMapPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMapPointEventsOptions getEvents();

  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.point.events">https://api.highcharts.com/highmaps/plotOptions.map.point.events</a>
   *
   * @implspec events?: PlotMapPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMapPointEventsOptions value);
}
