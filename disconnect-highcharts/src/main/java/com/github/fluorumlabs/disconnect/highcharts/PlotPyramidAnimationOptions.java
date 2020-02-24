package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Initial animation is by default disabled for the funnel chart.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.animation</a>
 *
 */
public interface PlotPyramidAnimationOptions extends Any {
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
