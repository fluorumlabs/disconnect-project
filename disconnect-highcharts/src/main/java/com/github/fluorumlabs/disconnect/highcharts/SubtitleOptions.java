package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The chart's subtitle. This can be used both
 * to display a subtitle below the main title, and to display random text
 * anywhere in the chart. The subtitle can be updated after chart initialization
 * through the <code>Chart.setTitle</code> method.
 *
 * @see <a href="https://api.highcharts.com/highcharts/subtitle">https://api.highcharts.com/highcharts/subtitle</a>
 * @see <a href="https://api.highcharts.com/highstock/subtitle">https://api.highcharts.com/highstock/subtitle</a>
 * @see <a href="https://api.highcharts.com/highmaps/subtitle">https://api.highcharts.com/highmaps/subtitle</a>
 *
 */
public interface SubtitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the
   * subtitle. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.align">https://api.highcharts.com/highcharts/subtitle.align</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.align">https://api.highcharts.com/highstock/subtitle.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.align">https://api.highcharts.com/highmaps/subtitle.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the
   * subtitle. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.align">https://api.highcharts.com/highcharts/subtitle.align</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.align">https://api.highcharts.com/highstock/subtitle.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.align">https://api.highcharts.com/highmaps/subtitle.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) When the subtitle is floating, the plot
   * area will not move to make space for it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.floating">https://api.highcharts.com/highcharts/subtitle.floating</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.floating">https://api.highcharts.com/highstock/subtitle.floating</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.floating">https://api.highcharts.com/highmaps/subtitle.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps) When the subtitle is floating, the plot
   * area will not move to make space for it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.floating">https://api.highcharts.com/highcharts/subtitle.floating</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.floating">https://api.highcharts.com/highstock/subtitle.floating</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.floating">https://api.highcharts.com/highmaps/subtitle.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the title.
   *
   * In styled mode, the subtitle style is given in the <code>.highcharts-subtitle</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.style">https://api.highcharts.com/highcharts/subtitle.style</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.style">https://api.highcharts.com/highstock/subtitle.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.style">https://api.highcharts.com/highmaps/subtitle.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the title.
   *
   * In styled mode, the subtitle style is given in the <code>.highcharts-subtitle</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.style">https://api.highcharts.com/highcharts/subtitle.style</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.style">https://api.highcharts.com/highstock/subtitle.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.style">https://api.highcharts.com/highmaps/subtitle.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The subtitle of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.text">https://api.highcharts.com/highcharts/subtitle.text</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.text">https://api.highcharts.com/highstock/subtitle.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.text">https://api.highcharts.com/highmaps/subtitle.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) The subtitle of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.text">https://api.highcharts.com/highcharts/subtitle.text</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.text">https://api.highcharts.com/highstock/subtitle.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.text">https://api.highcharts.com/highmaps/subtitle.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.useHTML">https://api.highcharts.com/highcharts/subtitle.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.useHTML">https://api.highcharts.com/highstock/subtitle.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.useHTML">https://api.highcharts.com/highmaps/subtitle.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.useHTML">https://api.highcharts.com/highcharts/subtitle.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.useHTML">https://api.highcharts.com/highstock/subtitle.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.useHTML">https://api.highcharts.com/highmaps/subtitle.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the title.
   * Can be one of &quot;top&quot;, &quot;middle&quot; and &quot;bottom&quot;. When a value is given, the
   * title behaves as floating.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.verticalAlign">https://api.highcharts.com/highcharts/subtitle.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.verticalAlign">https://api.highcharts.com/highstock/subtitle.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.verticalAlign">https://api.highcharts.com/highmaps/subtitle.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the title.
   * Can be one of &quot;top&quot;, &quot;middle&quot; and &quot;bottom&quot;. When a value is given, the
   * title behaves as floating.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.verticalAlign">https://api.highcharts.com/highcharts/subtitle.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.verticalAlign">https://api.highcharts.com/highstock/subtitle.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.verticalAlign">https://api.highcharts.com/highmaps/subtitle.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) Adjustment made to the subtitle width,
   * normally to reserve space for the exporting burger menu.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.widthAdjust">https://api.highcharts.com/highcharts/subtitle.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.widthAdjust">https://api.highcharts.com/highstock/subtitle.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.widthAdjust">https://api.highcharts.com/highmaps/subtitle.widthAdjust</a>
   *
   * @implspec widthAdjust?: number;
   *
   */
  @JSProperty("widthAdjust")
  double getWidthAdjust();

  /**
   * (Highcharts, Highstock, Highmaps) Adjustment made to the subtitle width,
   * normally to reserve space for the exporting burger menu.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.widthAdjust">https://api.highcharts.com/highcharts/subtitle.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.widthAdjust">https://api.highcharts.com/highstock/subtitle.widthAdjust</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.widthAdjust">https://api.highcharts.com/highmaps/subtitle.widthAdjust</a>
   *
   * @implspec widthAdjust?: number;
   *
   */
  @JSProperty("widthAdjust")
  void setWidthAdjust(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the subtitle relative
   * to the alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.x">https://api.highcharts.com/highcharts/subtitle.x</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.x">https://api.highcharts.com/highstock/subtitle.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.x">https://api.highcharts.com/highmaps/subtitle.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the subtitle relative
   * to the alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.x">https://api.highcharts.com/highcharts/subtitle.x</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.x">https://api.highcharts.com/highstock/subtitle.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.x">https://api.highcharts.com/highmaps/subtitle.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the subtitle relative
   * to the alignment within <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>. By
   * default the subtitle is laid out below the title unless the title is
   * floating.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.y">https://api.highcharts.com/highcharts/subtitle.y</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.y">https://api.highcharts.com/highstock/subtitle.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.y">https://api.highcharts.com/highmaps/subtitle.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the subtitle relative
   * to the alignment within <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>. By
   * default the subtitle is laid out below the title unless the title is
   * floating.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle.y">https://api.highcharts.com/highcharts/subtitle.y</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle.y">https://api.highcharts.com/highstock/subtitle.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle.y">https://api.highcharts.com/highmaps/subtitle.y</a>
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
