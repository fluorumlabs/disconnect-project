package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) The position of the no-data label, relative to
 * the plot area.
 *
 * @see <a href="https://api.highcharts.com/highcharts/noData.position">https://api.highcharts.com/highcharts/noData.position</a>
 * @see <a href="https://api.highcharts.com/highstock/noData.position">https://api.highcharts.com/highstock/noData.position</a>
 * @see <a href="https://api.highcharts.com/gantt/noData.position">https://api.highcharts.com/gantt/noData.position</a>
 *
 */
public interface NoDataPositionOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.align">https://api.highcharts.com/highcharts/noData.position.align</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.align">https://api.highcharts.com/highstock/noData.position.align</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.align">https://api.highcharts.com/gantt/noData.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.align">https://api.highcharts.com/highcharts/noData.position.align</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.align">https://api.highcharts.com/highstock/noData.position.align</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.align">https://api.highcharts.com/gantt/noData.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.verticalAlign">https://api.highcharts.com/highcharts/noData.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.verticalAlign">https://api.highcharts.com/highstock/noData.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.verticalAlign">https://api.highcharts.com/gantt/noData.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.verticalAlign">https://api.highcharts.com/highcharts/noData.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.verticalAlign">https://api.highcharts.com/highstock/noData.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.verticalAlign">https://api.highcharts.com/gantt/noData.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.x">https://api.highcharts.com/highcharts/noData.position.x</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.x">https://api.highcharts.com/highstock/noData.position.x</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.x">https://api.highcharts.com/gantt/noData.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.x">https://api.highcharts.com/highcharts/noData.position.x</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.x">https://api.highcharts.com/highstock/noData.position.x</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.x">https://api.highcharts.com/gantt/noData.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.y">https://api.highcharts.com/highcharts/noData.position.y</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.y">https://api.highcharts.com/highstock/noData.position.y</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.y">https://api.highcharts.com/gantt/noData.position.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position.y">https://api.highcharts.com/highcharts/noData.position.y</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position.y">https://api.highcharts.com/highstock/noData.position.y</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position.y">https://api.highcharts.com/gantt/noData.position.y</a>
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
