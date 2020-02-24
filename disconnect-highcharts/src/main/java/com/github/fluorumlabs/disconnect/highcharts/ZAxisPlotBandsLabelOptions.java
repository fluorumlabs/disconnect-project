package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Text labels for the plot bands
 *
 * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label">https://api.highcharts.com/highcharts/zAxis.plotBands.label</a>
 * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label">https://api.highcharts.com/highstock/zAxis.plotBands.label</a>
 * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label">https://api.highcharts.com/gantt/zAxis.plotBands.label</a>
 *
 */
public interface ZAxisPlotBandsLabelOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
   * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.align">https://api.highcharts.com/highcharts/zAxis.plotBands.label.align</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.align">https://api.highcharts.com/highstock/zAxis.plotBands.label.align</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.align">https://api.highcharts.com/gantt/zAxis.plotBands.label.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
   * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.align">https://api.highcharts.com/highcharts/zAxis.plotBands.label.align</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.align">https://api.highcharts.com/highstock/zAxis.plotBands.label.align</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.align">https://api.highcharts.com/gantt/zAxis.plotBands.label.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  void setAlign(String value);

  /**
   * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.rotation">https://api.highcharts.com/highcharts/zAxis.plotBands.label.rotation</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.rotation">https://api.highcharts.com/highstock/zAxis.plotBands.label.rotation</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.rotation">https://api.highcharts.com/gantt/zAxis.plotBands.label.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.rotation">https://api.highcharts.com/highcharts/zAxis.plotBands.label.rotation</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.rotation">https://api.highcharts.com/highstock/zAxis.plotBands.label.rotation</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.rotation">https://api.highcharts.com/gantt/zAxis.plotBands.label.rotation</a>
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
   * <code>.highcharts-plot-band-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.style">https://api.highcharts.com/highcharts/zAxis.plotBands.label.style</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.style">https://api.highcharts.com/highstock/zAxis.plotBands.label.style</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.style">https://api.highcharts.com/gantt/zAxis.plotBands.label.style</a>
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
   * <code>.highcharts-plot-band-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.style">https://api.highcharts.com/highcharts/zAxis.plotBands.label.style</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.style">https://api.highcharts.com/highstock/zAxis.plotBands.label.style</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.style">https://api.highcharts.com/gantt/zAxis.plotBands.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
   * is supported.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.text">https://api.highcharts.com/highcharts/zAxis.plotBands.label.text</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.text">https://api.highcharts.com/highstock/zAxis.plotBands.label.text</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.text">https://api.highcharts.com/gantt/zAxis.plotBands.label.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
   * is supported.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.text">https://api.highcharts.com/highcharts/zAxis.plotBands.label.text</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.text">https://api.highcharts.com/highstock/zAxis.plotBands.label.text</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.text">https://api.highcharts.com/gantt/zAxis.plotBands.label.text</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.textAlign">https://api.highcharts.com/highcharts/zAxis.plotBands.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.textAlign">https://api.highcharts.com/highstock/zAxis.plotBands.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.textAlign">https://api.highcharts.com/gantt/zAxis.plotBands.label.textAlign</a>
   *
   * @implspec textAlign?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Highcharts, Highstock, Gantt) The text alignment for the label. While
   * <code>align</code> determines where the texts anchor point is placed within the plot
   * band, <code>textAlign</code> determines how the text is aligned against its anchor
   * point. Possible values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the
   * same as the <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.textAlign">https://api.highcharts.com/highcharts/zAxis.plotBands.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.textAlign">https://api.highcharts.com/highstock/zAxis.plotBands.label.textAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.textAlign">https://api.highcharts.com/gantt/zAxis.plotBands.label.textAlign</a>
   *
   * @implspec textAlign?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(TextAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.useHTML">https://api.highcharts.com/highcharts/zAxis.plotBands.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.useHTML">https://api.highcharts.com/highstock/zAxis.plotBands.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.useHTML">https://api.highcharts.com/gantt/zAxis.plotBands.label.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.useHTML">https://api.highcharts.com/highcharts/zAxis.plotBands.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.useHTML">https://api.highcharts.com/highstock/zAxis.plotBands.label.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.useHTML">https://api.highcharts.com/gantt/zAxis.plotBands.label.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
   * to the plot band. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.verticalAlign">https://api.highcharts.com/highcharts/zAxis.plotBands.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.verticalAlign">https://api.highcharts.com/highstock/zAxis.plotBands.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.verticalAlign">https://api.highcharts.com/gantt/zAxis.plotBands.label.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
   * to the plot band. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.verticalAlign">https://api.highcharts.com/highcharts/zAxis.plotBands.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.verticalAlign">https://api.highcharts.com/highstock/zAxis.plotBands.label.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.verticalAlign">https://api.highcharts.com/gantt/zAxis.plotBands.label.verticalAlign</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.x">https://api.highcharts.com/highcharts/zAxis.plotBands.label.x</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.x">https://api.highcharts.com/highstock/zAxis.plotBands.label.x</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.x">https://api.highcharts.com/gantt/zAxis.plotBands.label.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.x">https://api.highcharts.com/highcharts/zAxis.plotBands.label.x</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.x">https://api.highcharts.com/highstock/zAxis.plotBands.label.x</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.x">https://api.highcharts.com/gantt/zAxis.plotBands.label.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.y">https://api.highcharts.com/highcharts/zAxis.plotBands.label.y</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.y">https://api.highcharts.com/highstock/zAxis.plotBands.label.y</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.y">https://api.highcharts.com/gantt/zAxis.plotBands.label.y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotBands.label.y">https://api.highcharts.com/highcharts/zAxis.plotBands.label.y</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotBands.label.y">https://api.highcharts.com/highstock/zAxis.plotBands.label.y</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotBands.label.y">https://api.highcharts.com/gantt/zAxis.plotBands.label.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

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
