package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Positioning for the input boxes. Allowed properties are <code>align</code>,
 * <code>x</code> and <code>y</code>.
 *
 * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition">https://api.highcharts.com/highstock/rangeSelector.inputPosition</a>
 *
 */
public interface RangeSelectorInputPositionOptions extends Any {
  /**
   * (Highstock) The alignment of the input box. Allowed properties are
   * <code>left</code>, <code>center</code>, <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition.align">https://api.highcharts.com/highstock/rangeSelector.inputPosition.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highstock) The alignment of the input box. Allowed properties are
   * <code>left</code>, <code>center</code>, <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition.align">https://api.highcharts.com/highstock/rangeSelector.inputPosition.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highstock) X offset of the input row.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition.x">https://api.highcharts.com/highstock/rangeSelector.inputPosition.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock) X offset of the input row.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition.x">https://api.highcharts.com/highstock/rangeSelector.inputPosition.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock) Y offset of the input row.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition.y">https://api.highcharts.com/highstock/rangeSelector.inputPosition.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock) Y offset of the input row.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition.y">https://api.highcharts.com/highstock/rangeSelector.inputPosition.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align CENTER = JsEnum.of("center");

    public static final Align LEFT = JsEnum.of("left");

    public static final Align RIGHT = JsEnum.of("right");
  }
}
