package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Text labels for the plot bands
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label</a>
 * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label</a>
 * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label</a>
 *
 */
public interface NavigatorYAxisPlotLinesLabelOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
   * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.align">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.align</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.align">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.align</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.align">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
   * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.align">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.align</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.align">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.align</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.align">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees.
   * Defaults to 0 for horizontal plot lines and 90 for vertical lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.rotation">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.rotation</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.rotation">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.rotation</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.rotation">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees.
   * Defaults to 0 for horizontal plot lines and 90 for vertical lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.rotation">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.rotation</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.rotation">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.rotation</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.rotation">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-line-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.style">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.style</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.style">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.style</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.style">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-line-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.style">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.style</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.style">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.style</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.style">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Gantt) The text itself. A subset of HTML is
   * supported.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.text">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.text</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.text">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.text</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.text">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Gantt) The text itself. A subset of HTML is
   * supported.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.text">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.text</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.text">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.text</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.text">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Gantt) The text alignment for the label. While
   * <code>align</code> determines where the texts anchor point is placed within the plot
   * band, <code>textAlign</code> determines how the text is aligned against its anchor
   * point. Possible values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the
   * same as the <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.textAlign">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.textAlign">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.textAlign">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  @Nullable
  String getTextAlign();

  /**
   * (Highcharts, Highstock, Gantt) The text alignment for the label. While
   * <code>align</code> determines where the texts anchor point is placed within the plot
   * band, <code>textAlign</code> determines how the text is aligned against its anchor
   * point. Possible values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the
   * same as the <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.textAlign">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.textAlign">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.textAlign">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(String value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.useHTML">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.useHTML">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.useHTML">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.useHTML">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.useHTML">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.useHTML">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
   * to the plot line. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.verticalAlign">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.verticalAlign">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.verticalAlign">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
   * to the plot line. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.verticalAlign">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.verticalAlign">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.verticalAlign">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Horizontal position relative the
   * alignment. Default varies by orientation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.x">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.x</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.x">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.x</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.x">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal position relative the
   * alignment. Default varies by orientation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.x">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.x</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.x">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.x</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.x">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
   * relative to the alignment. Default varies by orientation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.y">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.y</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.y">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.y</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.y">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
   * relative to the alignment. Default varies by orientation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.y">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines.label.y</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.y">https://api.highcharts.com/highstock/navigator.yAxis.plotLines.label.y</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.y">https://api.highcharts.com/gantt/navigator.yAxis.plotLines.label.y</a>
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
