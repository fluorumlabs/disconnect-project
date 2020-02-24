package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.point">https://api.highcharts.com/highcharts/plotOptions.tilemap.point</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.point">https://api.highcharts.com/highmaps/plotOptions.tilemap.point</a>
 *
 */
public interface PlotTilemapPointOptions extends Any {
  /**
   * (Highcharts, Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.point.events">https://api.highcharts.com/highcharts/plotOptions.tilemap.point.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.point.events">https://api.highcharts.com/highmaps/plotOptions.tilemap.point.events</a>
   *
   * @implspec events?: PlotTilemapPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotTilemapPointEventsOptions getEvents();

  /**
   * (Highcharts, Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.point.events">https://api.highcharts.com/highcharts/plotOptions.tilemap.point.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.point.events">https://api.highcharts.com/highmaps/plotOptions.tilemap.point.events</a>
   *
   * @implspec events?: PlotTilemapPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotTilemapPointEventsOptions value);
}
