package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The position of the button.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position">https://api.highcharts.com/highcharts/chart.resetZoomButton.position</a>
 * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position">https://api.highcharts.com/highstock/chart.resetZoomButton.position</a>
 * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position">https://api.highcharts.com/highmaps/chart.resetZoomButton.position</a>
 *
 */
public interface ChartResetZoomButtonPositionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.align">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.align</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.align">https://api.highcharts.com/highstock/chart.resetZoomButton.position.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.align">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.align">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.align</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.align">https://api.highcharts.com/highstock/chart.resetZoomButton.position.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.align">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  void setAlign(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.verticalAlign">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.verticalAlign">https://api.highcharts.com/highstock/chart.resetZoomButton.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.verticalAlign">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.verticalAlign">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.verticalAlign">https://api.highcharts.com/highstock/chart.resetZoomButton.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.verticalAlign">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.x">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.x</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.x">https://api.highcharts.com/highstock/chart.resetZoomButton.position.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.x">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.x">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.x</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.x">https://api.highcharts.com/highstock/chart.resetZoomButton.position.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.x">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.y">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.y</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.y">https://api.highcharts.com/highstock/chart.resetZoomButton.position.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.y">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position.y">https://api.highcharts.com/highcharts/chart.resetZoomButton.position.y</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position.y">https://api.highcharts.com/highstock/chart.resetZoomButton.position.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position.y">https://api.highcharts.com/highmaps/chart.resetZoomButton.position.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
