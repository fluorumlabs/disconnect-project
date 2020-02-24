package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The stack labels show the total value for each bar in a stacked
 * column or bar chart. The label will be placed on top of positive columns and
 * below negative columns. In case of an inverted column chart or a bar chart
 * the label is placed to the right of positive bars and to the left of negative
 * bars.
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels</a>
 *
 */
public interface NavigatorYAxisStackLabelsOptions extends Any {
  /**
   * (Highcharts) Defines the horizontal alignment of the stack total label.
   * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.align">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts) Defines the horizontal alignment of the stack total label.
   * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.align">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts) Allow the stack labels to overlap.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.allowOverlap">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts) Allow the stack labels to overlap.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.allowOverlap">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts) Enable or disable the stack total labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.enabled">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Enable or disable the stack total labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.enabled">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) A format string for the data label. Available
   * variables are the same as for <code>formatter</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.format">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.format</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.format">https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock) A format string for the data label. Available
   * variables are the same as for <code>formatter</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.format">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.format</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.format">https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Highcharts) Callback JavaScript function to format the label. The value
   * is given by <code>this.total</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.formatter">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<any>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<Any> getFormatter();

  /**
   * (Highcharts) Callback JavaScript function to format the label. The value
   * is given by <code>this.total</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.formatter">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<any>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<Any> value);

  /**
   * (Highcharts) Rotation of the labels in degrees.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.rotation">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts) Rotation of the labels in degrees.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.rotation">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) CSS styles for the label.
   *
   * In styled mode, the styles are set in the <code>.highcharts-stack-label</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.style">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts) CSS styles for the label.
   *
   * In styled mode, the styles are set in the <code>.highcharts-stack-label</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.style">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts) The text alignment for the label. While <code>align</code> determines
   * where the texts anchor point is placed with regards to the stack,
   * <code>textAlign</code> determines how the text is aligned against its anchor point.
   * Possible values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value
   * is calculated at runtime and depends on orientation and whether the stack
   * is positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.textAlign">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.textAlign</a>
   *
   * @implspec textAlign?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Highcharts) The text alignment for the label. While <code>align</code> determines
   * where the texts anchor point is placed with regards to the stack,
   * <code>textAlign</code> determines how the text is aligned against its anchor point.
   * Possible values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value
   * is calculated at runtime and depends on orientation and whether the stack
   * is positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.textAlign">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.textAlign</a>
   *
   * @implspec textAlign?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(TextAlign value);

  /**
   * (Highcharts, Highstock) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.useHTML">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.useHTML">https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.useHTML">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.useHTML">https://api.highcharts.com/highstock/navigator.yAxis.stackLabels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts) Defines the vertical alignment of the stack total label. Can
   * be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.verticalAlign">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts) Defines the vertical alignment of the stack total label. Can
   * be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.verticalAlign">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts) The x position offset of the label relative to the left of
   * the stacked bar. The default value is calculated at runtime and depends
   * on orientation and whether the stack is positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.x">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts) The x position offset of the label relative to the left of
   * the stacked bar. The default value is calculated at runtime and depends
   * on orientation and whether the stack is positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.x">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts) The y position offset of the label relative to the tick
   * position on the axis. The default value is calculated at runtime and
   * depends on orientation and whether the stack is positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.y">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts) The y position offset of the label relative to the tick
   * position on the axis. The default value is calculated at runtime and
   * depends on orientation and whether the stack is positive or negative.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.y">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels.y</a>
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
  abstract class TextAlign extends JsEnum {
    public static final TextAlign CENTER = JsEnum.of("center");

    public static final TextAlign LEFT = JsEnum.of("left");

    public static final TextAlign RIGHT = JsEnum.of("right");
  }

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
