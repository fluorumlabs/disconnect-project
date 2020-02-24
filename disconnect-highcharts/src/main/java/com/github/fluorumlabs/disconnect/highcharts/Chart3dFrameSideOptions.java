package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be
 * used instead.
 *
 * The side for the frame around a 3D chart.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side">https://api.highcharts.com/highcharts/chart.options3d.frame.side</a>
 *
 */
public interface Chart3dFrameSideOptions extends Any {
  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side.color">https://api.highcharts.com/highcharts/chart.options3d.frame.side.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side.color">https://api.highcharts.com/highcharts/chart.options3d.frame.side.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side.color">https://api.highcharts.com/highcharts/chart.options3d.frame.side.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side.color">https://api.highcharts.com/highcharts/chart.options3d.frame.side.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) The thickness of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side.size">https://api.highcharts.com/highcharts/chart.options3d.frame.side.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts) The thickness of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.side.size">https://api.highcharts.com/highcharts/chart.options3d.frame.side.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  void setSize(double value);
}
