package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Animation is disabled by default on the heatmap
 * series.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.animation">https://api.highcharts.com/highcharts/plotOptions.heatmap.animation</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.animation">https://api.highcharts.com/highmaps/plotOptions.heatmap.animation</a>
 *
 */
public interface PlotHeatmapAnimationOptions extends Any {
  /**
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  void setDuration(double value);
}
