package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Position configuration for the credits
 * label.
 *
 * @see <a href="https://api.highcharts.com/highcharts/credits.position">https://api.highcharts.com/highcharts/credits.position</a>
 * @see <a href="https://api.highcharts.com/highstock/credits.position">https://api.highcharts.com/highstock/credits.position</a>
 * @see <a href="https://api.highcharts.com/highmaps/credits.position">https://api.highcharts.com/highmaps/credits.position</a>
 *
 */
public interface CreditsPositionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Horizontal alignment of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.align">https://api.highcharts.com/highcharts/credits.position.align</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.align">https://api.highcharts.com/highstock/credits.position.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.align">https://api.highcharts.com/highmaps/credits.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) Horizontal alignment of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.align">https://api.highcharts.com/highcharts/credits.position.align</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.align">https://api.highcharts.com/highstock/credits.position.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.align">https://api.highcharts.com/highmaps/credits.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) Vertical alignment of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.verticalAlign">https://api.highcharts.com/highcharts/credits.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.verticalAlign">https://api.highcharts.com/highstock/credits.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.verticalAlign">https://api.highcharts.com/highmaps/credits.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) Vertical alignment of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.verticalAlign">https://api.highcharts.com/highcharts/credits.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.verticalAlign">https://api.highcharts.com/highstock/credits.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.verticalAlign">https://api.highcharts.com/highmaps/credits.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) Horizontal pixel offset of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.x">https://api.highcharts.com/highcharts/credits.position.x</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.x">https://api.highcharts.com/highstock/credits.position.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.x">https://api.highcharts.com/highmaps/credits.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) Horizontal pixel offset of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.x">https://api.highcharts.com/highcharts/credits.position.x</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.x">https://api.highcharts.com/highstock/credits.position.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.x">https://api.highcharts.com/highmaps/credits.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Vertical pixel offset of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.y">https://api.highcharts.com/highcharts/credits.position.y</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.y">https://api.highcharts.com/highstock/credits.position.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.y">https://api.highcharts.com/highmaps/credits.position.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) Vertical pixel offset of the credits.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position.y">https://api.highcharts.com/highcharts/credits.position.y</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position.y">https://api.highcharts.com/highstock/credits.position.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position.y">https://api.highcharts.com/highmaps/credits.position.y</a>
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

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
