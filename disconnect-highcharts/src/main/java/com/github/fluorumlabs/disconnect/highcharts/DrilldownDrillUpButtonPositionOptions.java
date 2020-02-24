package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Positioning options for the button within the
 * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
 * <code>verticalAlign</code>.
 *
 * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position</a>
 * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position</a>
 *
 */
public interface DrilldownDrillUpButtonPositionOptions extends Any {
  /**
   * (Highcharts, Highmaps) Horizontal alignment.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.align">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.align">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highmaps) Horizontal alignment.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.align">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.align">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highmaps) Vertical alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.verticalAlign">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.verticalAlign">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highmaps) Vertical alignment of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.verticalAlign">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.verticalAlign">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highmaps) The X offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.x">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.x">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highmaps) The X offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.x">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.x">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highmaps) The Y offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.y">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.y">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highmaps) The Y offset of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.y">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.y">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position.y</a>
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
