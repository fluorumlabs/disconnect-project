package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.point">https://api.highcharts.com/highmaps/plotOptions.mapline.point</a>
 *
 */
public interface PlotMaplinePointOptions extends Any {
  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.point.events">https://api.highcharts.com/highmaps/plotOptions.mapline.point.events</a>
   *
   * @implspec events?: PlotMaplinePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMaplinePointEventsOptions getEvents();

  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.point.events">https://api.highcharts.com/highmaps/plotOptions.mapline.point.events</a>
   *
   * @implspec events?: PlotMaplinePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMaplinePointEventsOptions value);
}
