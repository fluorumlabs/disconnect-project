package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Animation setting for hovering the graph in line-type series.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.states.select.animation</a>
 *
 */
public interface PlotTreemapStatesSelectAnimationOptions extends Any {
  /**
   * (Highcharts) The duration of the hover animation in milliseconds. By
   * default the hover state animates quickly in, and slowly back to normal.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.select.animation.duration">https://api.highcharts.com/highcharts/plotOptions.treemap.states.select.animation.duration</a>
   *
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * (Highcharts) The duration of the hover animation in milliseconds. By
   * default the hover state animates quickly in, and slowly back to normal.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.select.animation.duration">https://api.highcharts.com/highcharts/plotOptions.treemap.states.select.animation.duration</a>
   *
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  void setDuration(double value);
}
