package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The position of the button.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position</a>
 *
 */
public interface PlotTreemapDrillUpButtonPositionOptions extends Any {
  /**
   * (Highcharts) Horizontal alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.align">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts) Horizontal alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.align">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts) Vertical alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.verticalAlign">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts) Vertical alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.verticalAlign">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts) Horizontal offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.x">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts) Horizontal offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.x">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts) Vertical offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.y">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts) Vertical offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.y">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position.y</a>
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
