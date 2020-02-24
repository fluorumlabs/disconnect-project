package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) The symbol for the collapse and expand icon in a treegrid.
 *
 * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.labels.symbol">https://api.highcharts.com/gantt/navigator.yAxis.labels.symbol</a>
 *
 */
public interface NavigatorYAxisLabelsSymbolOptions extends Any {
  /**
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Gantt) The symbol type. Points to a definition function in the
   * <code>Highcharts.Renderer.symbols</code> collection.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.labels.symbol.type">https://api.highcharts.com/gantt/navigator.yAxis.labels.symbol.type</a>
   *
   * @implspec type?: (&quot;arc&quot;|&quot;circle&quot;|&quot;diamond&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;);
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Gantt) The symbol type. Points to a definition function in the
   * <code>Highcharts.Renderer.symbols</code> collection.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.labels.symbol.type">https://api.highcharts.com/gantt/navigator.yAxis.labels.symbol.type</a>
   *
   * @implspec type?: (&quot;arc&quot;|&quot;circle&quot;|&quot;diamond&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;);
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type ARC = JsEnum.of("arc");

    public static final Type CIRCLE = JsEnum.of("circle");

    public static final Type DIAMOND = JsEnum.of("diamond");

    public static final Type SQUARE = JsEnum.of("square");

    public static final Type TRIANGLE = JsEnum.of("triangle");

    public static final Type TRIANGLE_DOWN = JsEnum.of("triangle-down");
  }
}
