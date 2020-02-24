package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Set options on specific levels in a tree grid axis. Takes precedence
 * over labels options.
 *
 * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.labels.levels">https://api.highcharts.com/gantt/navigator.yAxis.labels.levels</a>
 *
 */
public interface NavigatorYAxisLabelsLevelsOptions extends Any {
  /**
   * (Gantt) Specify the level which the options within this object applies
   * to.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.labels.levels.level">https://api.highcharts.com/gantt/navigator.yAxis.labels.levels.level</a>
   *
   * @implspec level?: number;
   *
   */
  @JSProperty("level")
  double getLevel();

  /**
   * (Gantt) Specify the level which the options within this object applies
   * to.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.labels.levels.level">https://api.highcharts.com/gantt/navigator.yAxis.labels.levels.level</a>
   *
   * @implspec level?: number;
   *
   */
  @JSProperty("level")
  void setLevel(double value);

  /**
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
