package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.point">https://api.highcharts.com/highmaps/plotOptions.mapbubble.point</a>
 *
 */
public interface PlotMapbubblePointOptions extends Any {
  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.point.events">https://api.highcharts.com/highmaps/plotOptions.mapbubble.point.events</a>
   *
   * @implspec events?: PlotMapbubblePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotMapbubblePointEventsOptions getEvents();

  /**
   * (Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.point.events">https://api.highcharts.com/highmaps/plotOptions.mapbubble.point.events</a>
   *
   * @implspec events?: PlotMapbubblePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotMapbubblePointEventsOptions value);
}
