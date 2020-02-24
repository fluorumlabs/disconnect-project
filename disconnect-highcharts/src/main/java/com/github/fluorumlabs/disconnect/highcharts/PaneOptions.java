package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The pane serves as a container for axes and backgrounds for
 * circular gauges and polar charts.
 *
 * @see <a href="https://api.highcharts.com/highcharts/pane">https://api.highcharts.com/highcharts/pane</a>
 *
 */
public interface PaneOptions extends Any {
  /**
   * (Highcharts) An array of background items for the pane.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background">https://api.highcharts.com/highcharts/pane.background</a>
   *
   * @implspec background?: Array<PaneBackgroundOptions>;
   *
   */
  @JSProperty("background")
  @Nullable
  Array<PaneBackgroundOptions> getBackground();

  /**
   * (Highcharts) An array of background items for the pane.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background">https://api.highcharts.com/highcharts/pane.background</a>
   *
   * @implspec background?: Array<PaneBackgroundOptions>;
   *
   */
  @JSProperty("background")
  void setBackground(Array<PaneBackgroundOptions> value);

  /**
   * (Highcharts) The center of a polar chart or angular gauge, given as an
   * array of [x, y] positions. Positions can be given as integers that
   * transform to pixels, or as percentages of the plot area size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.center">https://api.highcharts.com/highcharts/pane.center</a>
   *
   * @implspec center?: Array&lt;(string|number)&gt;;
   *
   */
  @JSProperty("center")
  @Nullable
  Array<Unknown> getCenter();

  /**
   * (Highcharts) The center of a polar chart or angular gauge, given as an
   * array of [x, y] positions. Positions can be given as integers that
   * transform to pixels, or as percentages of the plot area size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.center">https://api.highcharts.com/highcharts/pane.center</a>
   *
   * @implspec center?: Array&lt;(string|number)&gt;;
   *
   */
  @JSProperty("center")
  void setCenter(Array<Unknown> value);

  /**
   * (Highcharts) The end angle of the polar X axis or gauge value axis, given
   * in degrees where 0 is north. Defaults to startAngle
   *
   * <ul>
   * <li>
   * <ol start="360">
   * <li></li>
   * </ol>
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/pane.endAngle">https://api.highcharts.com/highcharts/pane.endAngle</a>
   *
   * @implspec endAngle?: number;
   *
   */
  @JSProperty("endAngle")
  double getEndAngle();

  /**
   * (Highcharts) The end angle of the polar X axis or gauge value axis, given
   * in degrees where 0 is north. Defaults to startAngle
   *
   * <ul>
   * <li>
   * <ol start="360">
   * <li></li>
   * </ol>
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/pane.endAngle">https://api.highcharts.com/highcharts/pane.endAngle</a>
   *
   * @implspec endAngle?: number;
   *
   */
  @JSProperty("endAngle")
  void setEndAngle(double value);

  /**
   * (Highcharts) The size of the pane, either as a number defining pixels, or
   * a percentage defining a percentage of the plot are.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.size">https://api.highcharts.com/highcharts/pane.size</a>
   *
   * @implspec size?: (number|string);
   *
   */
  @JSProperty("size")
  @Nullable
  Unknown getSize();

  /**
   * (Highcharts) The size of the pane, either as a number defining pixels, or
   * a percentage defining a percentage of the plot are.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.size">https://api.highcharts.com/highcharts/pane.size</a>
   *
   * @implspec size?: (number|string);
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) The size of the pane, either as a number defining pixels, or
   * a percentage defining a percentage of the plot are.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.size">https://api.highcharts.com/highcharts/pane.size</a>
   *
   * @implspec size?: (number|string);
   *
   */
  @JSProperty("size")
  void setSize(String value);

  /**
   * (Highcharts) The start angle of the polar X axis or gauge axis, given in
   * degrees where 0 is north. Defaults to 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.startAngle">https://api.highcharts.com/highcharts/pane.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  double getStartAngle();

  /**
   * (Highcharts) The start angle of the polar X axis or gauge axis, given in
   * degrees where 0 is north. Defaults to 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.startAngle">https://api.highcharts.com/highcharts/pane.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  void setStartAngle(double value);
}
