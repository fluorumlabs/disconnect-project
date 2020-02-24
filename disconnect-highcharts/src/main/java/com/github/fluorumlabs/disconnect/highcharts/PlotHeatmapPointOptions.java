package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.point">https://api.highcharts.com/highcharts/plotOptions.heatmap.point</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.point">https://api.highcharts.com/highmaps/plotOptions.heatmap.point</a>
 *
 */
public interface PlotHeatmapPointOptions extends Any {
  /**
   * (Highcharts, Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.point.events">https://api.highcharts.com/highcharts/plotOptions.heatmap.point.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.point.events">https://api.highcharts.com/highmaps/plotOptions.heatmap.point.events</a>
   *
   * @implspec events?: PlotHeatmapPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotHeatmapPointEventsOptions getEvents();

  /**
   * (Highcharts, Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.point.events">https://api.highcharts.com/highcharts/plotOptions.heatmap.point.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.point.events">https://api.highcharts.com/highmaps/plotOptions.heatmap.point.events</a>
   *
   * @implspec events?: PlotHeatmapPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotHeatmapPointEventsOptions value);
}
