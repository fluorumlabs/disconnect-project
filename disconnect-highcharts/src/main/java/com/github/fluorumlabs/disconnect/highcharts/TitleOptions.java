package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The chart's main title.
 *
 * @see <a href="https://api.highcharts.com/highcharts/title">https://api.highcharts.com/highcharts/title</a>
 * @see <a href="https://api.highcharts.com/highstock/title">https://api.highcharts.com/highstock/title</a>
 * @see <a href="https://api.highcharts.com/highmaps/title">https://api.highcharts.com/highmaps/title</a>
 *
 */
public interface TitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the title.
   * Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.align">https://api.highcharts.com/highcharts/title.align</a>
   * @see <a href="https://api.highcharts.com/highstock/title.align">https://api.highcharts.com/highstock/title.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.align">https://api.highcharts.com/highmaps/title.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the title.
   * Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.align">https://api.highcharts.com/highcharts/title.align</a>
   * @see <a href="https://api.highcharts.com/highstock/title.align">https://api.highcharts.com/highstock/title.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.align">https://api.highcharts.com/highmaps/title.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) When the title is floating, the plot
   * area will not move to make space for it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.floating">https://api.highcharts.com/highcharts/title.floating</a>
   * @see <a href="https://api.highcharts.com/highstock/title.floating">https://api.highcharts.com/highstock/title.floating</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.floating">https://api.highcharts.com/highmaps/title.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps) When the title is floating, the plot
   * area will not move to make space for it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.floating">https://api.highcharts.com/highcharts/title.floating</a>
   * @see <a href="https://api.highcharts.com/highstock/title.floating">https://api.highcharts.com/highstock/title.floating</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.floating">https://api.highcharts.com/highmaps/title.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the title and the
   * plot area, or if a subtitle is present, the margin between the subtitle
   * and the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.margin">https://api.highcharts.com/highcharts/title.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/title.margin">https://api.highcharts.com/highstock/title.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.margin">https://api.highcharts.com/highmaps/title.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the title and the
   * plot area, or if a subtitle is present, the margin between the subtitle
   * and the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.margin">https://api.highcharts.com/highcharts/title.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/title.margin">https://api.highcharts.com/highstock/title.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.margin">https://api.highcharts.com/highmaps/title.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the title. Use this for
   * font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
   *
   * In styled mode, the title style is given in the <code>.highcharts-title</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.style">https://api.highcharts.com/highcharts/title.style</a>
   * @see <a href="https://api.highcharts.com/highstock/title.style">https://api.highcharts.com/highstock/title.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.style">https://api.highcharts.com/highmaps/title.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the title. Use this for
   * font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
   *
   * In styled mode, the title style is given in the <code>.highcharts-title</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.style">https://api.highcharts.com/highcharts/title.style</a>
   * @see <a href="https://api.highcharts.com/highstock/title.style">https://api.highcharts.com/highstock/title.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.style">https://api.highcharts.com/highmaps/title.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The title of the chart. To disable the
   * title, set the <code>text</code> to <code>undefined</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.text">https://api.highcharts.com/highcharts/title.text</a>
   * @see <a href="https://api.highcharts.com/highstock/title.text">https://api.highcharts.com/highstock/title.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.text">https://api.highcharts.com/highmaps/title.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) The title of the chart. To disable the
   * title, set the <code>text</code> to <code>undefined</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.text">https://api.highcharts.com/highcharts/title.text</a>
   * @see <a href="https://api.highcharts.com/highstock/title.text">https://api.highcharts.com/highstock/title.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.text">https://api.highcharts.com/highmaps/title.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.useHTML">https://api.highcharts.com/highcharts/title.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/title.useHTML">https://api.highcharts.com/highstock/title.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.useHTML">https://api.highcharts.com/highmaps/title.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.useHTML">https://api.highcharts.com/highcharts/title.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/title.useHTML">https://api.highcharts.com/highstock/title.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.useHTML">https://api.highcharts.com/highmaps/title.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the title.
   * Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is given,
   * the title behaves as if floating were <code>true</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.verticalAlign">https://api.highcharts.com/highcharts/title.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/title.verticalAlign">https://api.highcharts.com/highstock/title.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.verticalAlign">https://api.highcharts.com/highmaps/title.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the title.
   * Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is given,
   * the title behaves as if floating were <code>true</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.verticalAlign">https://api.highcharts.com/highcharts/title.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/title.verticalAlign">https://api.highcharts.com/highstock/title.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.verticalAlign">https://api.highcharts.com/highmaps/title.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) Adjustment made to the title width,
   * normally to reserve space for the exporting burger menu.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.widthAdjust">https://api.highcharts.com/highcharts/title.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highstock/title.widthAdjust">https://api.highcharts.com/highstock/title.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.widthAdjust">https://api.highcharts.com/highmaps/title.widthAdjust</a>
   *
   * @implspec widthAdjust?: number;
   *
   */
  @JSProperty("widthAdjust")
  double getWidthAdjust();

  /**
   * (Highcharts, Highstock, Highmaps) Adjustment made to the title width,
   * normally to reserve space for the exporting burger menu.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.widthAdjust">https://api.highcharts.com/highcharts/title.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highstock/title.widthAdjust">https://api.highcharts.com/highstock/title.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.widthAdjust">https://api.highcharts.com/highmaps/title.widthAdjust</a>
   *
   * @implspec widthAdjust?: number;
   *
   */
  @JSProperty("widthAdjust")
  void setWidthAdjust(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the title relative to
   * the alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.x">https://api.highcharts.com/highcharts/title.x</a>
   * @see <a href="https://api.highcharts.com/highstock/title.x">https://api.highcharts.com/highstock/title.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.x">https://api.highcharts.com/highmaps/title.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the title relative to
   * the alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.x">https://api.highcharts.com/highcharts/title.x</a>
   * @see <a href="https://api.highcharts.com/highstock/title.x">https://api.highcharts.com/highstock/title.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.x">https://api.highcharts.com/highmaps/title.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the title relative to
   * the alignment within chart.spacingTop and chart.spacingBottom. By default
   * it depends on the font size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.y">https://api.highcharts.com/highcharts/title.y</a>
   * @see <a href="https://api.highcharts.com/highstock/title.y">https://api.highcharts.com/highstock/title.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.y">https://api.highcharts.com/highmaps/title.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the title relative to
   * the alignment within chart.spacingTop and chart.spacingBottom. By default
   * it depends on the font size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title.y">https://api.highcharts.com/highcharts/title.y</a>
   * @see <a href="https://api.highcharts.com/highstock/title.y">https://api.highcharts.com/highstock/title.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/title.y">https://api.highcharts.com/highmaps/title.y</a>
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
