package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Text labels for the plot bands
 *
 * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label</a>
 *
 */
public interface NavigatorXAxisCurrentDateIndicatorLabelOptions extends Any {
  /**
   * (Gantt) Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot;
   * or &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.align">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Gantt) Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot;
   * or &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.align">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
   * horizontal plot lines and 90 for vertical lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.rotation">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
   * horizontal plot lines and 90 for vertical lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.rotation">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-line-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.style">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-line-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.style">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Gantt) The text itself. A subset of HTML is supported.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.text">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Gantt) The text itself. A subset of HTML is supported.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.text">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Gantt) The text alignment for the label. While <code>align</code> determines where
   * the texts anchor point is placed within the plot band, <code>textAlign</code>
   * determines how the text is aligned against its anchor point. Possible
   * values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the
   * <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.textAlign">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  @Nullable
  String getTextAlign();

  /**
   * (Gantt) The text alignment for the label. While <code>align</code> determines where
   * the texts anchor point is placed within the plot band, <code>textAlign</code>
   * determines how the text is aligned against its anchor point. Possible
   * values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the
   * <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.textAlign">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(String value);

  /**
   * (Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.useHTML">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.useHTML">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Gantt) Vertical alignment of the label relative to the plot line. Can be
   * one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.verticalAlign">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Gantt) Vertical alignment of the label relative to the plot line. Can be
   * one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.verticalAlign">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Gantt) Horizontal position relative the alignment. Default varies by
   * orientation.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.x">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Gantt) Horizontal position relative the alignment. Default varies by
   * orientation.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.x">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Gantt) Vertical position of the text baseline relative to the alignment.
   * Default varies by orientation.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.y">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Gantt) Vertical position of the text baseline relative to the alignment.
   * Default varies by orientation.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.y">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator.label.y</a>
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
