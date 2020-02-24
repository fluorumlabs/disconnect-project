package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The back side of the frame around a 3D chart.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back">https://api.highcharts.com/highcharts/chart.options3d.frame.back</a>
 *
 */
public interface Chart3dFrameBackOptions extends Any {
  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.color">https://api.highcharts.com/highcharts/chart.options3d.frame.back.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.color">https://api.highcharts.com/highcharts/chart.options3d.frame.back.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.color">https://api.highcharts.com/highcharts/chart.options3d.frame.back.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The color of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.color">https://api.highcharts.com/highcharts/chart.options3d.frame.back.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) The thickness of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.size">https://api.highcharts.com/highcharts/chart.options3d.frame.back.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts) The thickness of the panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.size">https://api.highcharts.com/highcharts/chart.options3d.frame.back.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
   * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
   * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
   * ignoring the point of view.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.visible">https://api.highcharts.com/highcharts/chart.options3d.frame.back.visible</a>
   *
   * @implspec visible?: (&quot;auto&quot;|&quot;default&quot;|boolean);
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
   * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
   * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
   * ignoring the point of view.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame.back.visible">https://api.highcharts.com/highcharts/chart.options3d.frame.back.visible</a>
   *
   * @implspec visible?: (&quot;auto&quot;|&quot;default&quot;|boolean);
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);
}
