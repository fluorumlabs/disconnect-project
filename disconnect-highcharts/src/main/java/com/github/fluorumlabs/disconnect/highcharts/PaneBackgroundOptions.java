package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of background items for the pane.
 *
 * @see <a href="https://api.highcharts.com/highcharts/pane.background">https://api.highcharts.com/highcharts/pane.background</a>
 *
 */
public interface PaneBackgroundOptions extends Any {
  /**
   * (Highcharts) The background color or gradient for the pane.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.backgroundColor">https://api.highcharts.com/highcharts/pane.background.backgroundColor</a>
   *
   * @implspec backgroundColor?: GradientColorObject;
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  GradientColorObject getBackgroundColor();

  /**
   * (Highcharts) The background color or gradient for the pane.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.backgroundColor">https://api.highcharts.com/highcharts/pane.background.backgroundColor</a>
   *
   * @implspec backgroundColor?: GradientColorObject;
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts) The pane background border color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.borderColor">https://api.highcharts.com/highcharts/pane.background.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The pane background border color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.borderColor">https://api.highcharts.com/highcharts/pane.background.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) The pixel border width of the pane background.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.borderWidth">https://api.highcharts.com/highcharts/pane.background.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The pixel border width of the pane background.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.borderWidth">https://api.highcharts.com/highcharts/pane.background.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The class name for this background.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.className">https://api.highcharts.com/highcharts/pane.background.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) The class name for this background.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.className">https://api.highcharts.com/highcharts/pane.background.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) The inner radius of the pane background. Can be either
   * numeric (pixels) or a percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.innerRadius">https://api.highcharts.com/highcharts/pane.background.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  @Nullable
  Unknown getInnerRadius();

  /**
   * (Highcharts) The inner radius of the pane background. Can be either
   * numeric (pixels) or a percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.innerRadius">https://api.highcharts.com/highcharts/pane.background.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(double value);

  /**
   * (Highcharts) The inner radius of the pane background. Can be either
   * numeric (pixels) or a percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.innerRadius">https://api.highcharts.com/highcharts/pane.background.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(String value);

  /**
   * (Highcharts) The outer radius of the circular pane background. Can be
   * either numeric (pixels) or a percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.outerRadius">https://api.highcharts.com/highcharts/pane.background.outerRadius</a>
   *
   * @implspec outerRadius?: (number|string);
   *
   */
  @JSProperty("outerRadius")
  @Nullable
  Unknown getOuterRadius();

  /**
   * (Highcharts) The outer radius of the circular pane background. Can be
   * either numeric (pixels) or a percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.outerRadius">https://api.highcharts.com/highcharts/pane.background.outerRadius</a>
   *
   * @implspec outerRadius?: (number|string);
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(double value);

  /**
   * (Highcharts) The outer radius of the circular pane background. Can be
   * either numeric (pixels) or a percentage string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.outerRadius">https://api.highcharts.com/highcharts/pane.background.outerRadius</a>
   *
   * @implspec outerRadius?: (number|string);
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(String value);

  /**
   * (Highcharts) The shape of the pane background. When <code>solid</code>, the
   * background is circular. When <code>arc</code>, the background extends only from the
   * min to the max of the value axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.shape">https://api.highcharts.com/highcharts/pane.background.shape</a>
   *
   * @implspec shape?: (&quot;arc&quot;|&quot;circle&quot;|&quot;solid&quot;);
   *
   */
  @JSProperty("shape")
  @Nullable
  Shape getShape();

  /**
   * (Highcharts) The shape of the pane background. When <code>solid</code>, the
   * background is circular. When <code>arc</code>, the background extends only from the
   * min to the max of the value axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane.background.shape">https://api.highcharts.com/highcharts/pane.background.shape</a>
   *
   * @implspec shape?: (&quot;arc&quot;|&quot;circle&quot;|&quot;solid&quot;);
   *
   */
  @JSProperty("shape")
  void setShape(Shape value);

  /**
   */
  abstract class Shape extends JsEnum {
    public static final Shape ARC = JsEnum.of("arc");

    public static final Shape CIRCLE = JsEnum.of("circle");

    public static final Shape SOLID = JsEnum.of("solid");
  }
}
