package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A collection of options for buttons
 * appearing in the exporting module.
 *
 * In styled mode, the buttons are styled with the <code>.highcharts-contextbutton</code>
 * and <code>.highcharts-button-symbol</code> classes.
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions">https://api.highcharts.com/highcharts/navigation.buttonOptions</a>
 * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions">https://api.highcharts.com/highstock/navigation.buttonOptions</a>
 * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions">https://api.highcharts.com/highmaps/navigation.buttonOptions</a>
 *
 */
public interface NavigationButtonOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Alignment for the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.align">https://api.highcharts.com/highcharts/navigation.buttonOptions.align</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.align">https://api.highcharts.com/highstock/navigation.buttonOptions.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.align">https://api.highcharts.com/highmaps/navigation.buttonOptions.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) Alignment for the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.align">https://api.highcharts.com/highcharts/navigation.buttonOptions.align</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.align">https://api.highcharts.com/highstock/navigation.buttonOptions.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.align">https://api.highcharts.com/highmaps/navigation.buttonOptions.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel spacing between buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.buttonSpacing">https://api.highcharts.com/highcharts/navigation.buttonOptions.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.buttonSpacing">https://api.highcharts.com/highstock/navigation.buttonOptions.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.buttonSpacing">https://api.highcharts.com/highmaps/navigation.buttonOptions.buttonSpacing</a>
   *
   * @implspec buttonSpacing?: number;
   *
   */
  @JSProperty("buttonSpacing")
  double getButtonSpacing();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel spacing between buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.buttonSpacing">https://api.highcharts.com/highcharts/navigation.buttonOptions.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.buttonSpacing">https://api.highcharts.com/highstock/navigation.buttonOptions.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.buttonSpacing">https://api.highcharts.com/highmaps/navigation.buttonOptions.buttonSpacing</a>
   *
   * @implspec buttonSpacing?: number;
   *
   */
  @JSProperty("buttonSpacing")
  void setButtonSpacing(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.enabled">https://api.highcharts.com/highcharts/navigation.buttonOptions.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.enabled">https://api.highcharts.com/highstock/navigation.buttonOptions.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.enabled">https://api.highcharts.com/highmaps/navigation.buttonOptions.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.enabled">https://api.highcharts.com/highcharts/navigation.buttonOptions.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.enabled">https://api.highcharts.com/highstock/navigation.buttonOptions.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.enabled">https://api.highcharts.com/highmaps/navigation.buttonOptions.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Pixel height of the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.height">https://api.highcharts.com/highcharts/navigation.buttonOptions.height</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.height">https://api.highcharts.com/highstock/navigation.buttonOptions.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.height">https://api.highcharts.com/highmaps/navigation.buttonOptions.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps) Pixel height of the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.height">https://api.highcharts.com/highcharts/navigation.buttonOptions.height</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.height">https://api.highcharts.com/highstock/navigation.buttonOptions.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.height">https://api.highcharts.com/highmaps/navigation.buttonOptions.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Fill color for the symbol within the
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolFill">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolFill">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolFill">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolFill</a>
   *
   * @implspec symbolFill?: ColorString;
   *
   */
  @JSProperty("symbolFill")
  @Nullable
  String getSymbolFill();

  /**
   * (Highcharts, Highstock, Highmaps) Fill color for the symbol within the
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolFill">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolFill">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolFill">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolFill</a>
   *
   * @implspec symbolFill?: ColorString;
   *
   */
  @JSProperty("symbolFill")
  void setSymbolFill(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel size of the symbol on the
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolSize">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolSize">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolSize">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolSize</a>
   *
   * @implspec symbolSize?: number;
   *
   */
  @JSProperty("symbolSize")
  double getSymbolSize();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel size of the symbol on the
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolSize">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolSize">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolSize">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolSize</a>
   *
   * @implspec symbolSize?: number;
   *
   */
  @JSProperty("symbolSize")
  void setSymbolSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the symbol's stroke or
   * line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStroke">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStroke">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStroke">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStroke</a>
   *
   * @implspec symbolStroke?: ColorString;
   *
   */
  @JSProperty("symbolStroke")
  @Nullable
  String getSymbolStroke();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the symbol's stroke or
   * line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStroke">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStroke">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStroke">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStroke</a>
   *
   * @implspec symbolStroke?: ColorString;
   *
   */
  @JSProperty("symbolStroke")
  void setSymbolStroke(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the symbol on
   * the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStrokeWidth">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStrokeWidth">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStrokeWidth">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStrokeWidth</a>
   *
   * @implspec symbolStrokeWidth?: number;
   *
   */
  @JSProperty("symbolStrokeWidth")
  double getSymbolStrokeWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the symbol on
   * the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStrokeWidth">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStrokeWidth">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStrokeWidth">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolStrokeWidth</a>
   *
   * @implspec symbolStrokeWidth?: number;
   *
   */
  @JSProperty("symbolStrokeWidth")
  void setSymbolStrokeWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolX">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolX</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolX">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolX</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolX">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolX</a>
   *
   * @implspec symbolX?: number;
   *
   */
  @JSProperty("symbolX")
  double getSymbolX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolX">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolX</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolX">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolX</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolX">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolX</a>
   *
   * @implspec symbolX?: number;
   *
   */
  @JSProperty("symbolX")
  void setSymbolX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolY">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolY</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolY">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolY</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolY">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolY</a>
   *
   * @implspec symbolY?: number;
   *
   */
  @JSProperty("symbolY")
  double getSymbolY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolY">https://api.highcharts.com/highcharts/navigation.buttonOptions.symbolY</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.symbolY">https://api.highcharts.com/highstock/navigation.buttonOptions.symbolY</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolY">https://api.highcharts.com/highmaps/navigation.buttonOptions.symbolY</a>
   *
   * @implspec symbolY?: number;
   *
   */
  @JSProperty("symbolY")
  void setSymbolY(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A text string to add to the individual
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.text">https://api.highcharts.com/highcharts/navigation.buttonOptions.text</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.text">https://api.highcharts.com/highstock/navigation.buttonOptions.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.text">https://api.highcharts.com/highmaps/navigation.buttonOptions.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) A text string to add to the individual
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.text">https://api.highcharts.com/highcharts/navigation.buttonOptions.text</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.text">https://api.highcharts.com/highstock/navigation.buttonOptions.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.text">https://api.highcharts.com/highmaps/navigation.buttonOptions.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A configuration object for the button
   * theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code>
   * and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code>
   * and <code>states.select</code> objects.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.theme">https://api.highcharts.com/highcharts/navigation.buttonOptions.theme</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.theme">https://api.highcharts.com/highstock/navigation.buttonOptions.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.theme">https://api.highcharts.com/highmaps/navigation.buttonOptions.theme</a>
   *
   * @implspec theme?: NavigationButtonThemeOptions;
   *
   */
  @JSProperty("theme")
  @Nullable
  NavigationButtonThemeOptions getTheme();

  /**
   * (Highcharts, Highstock, Highmaps) A configuration object for the button
   * theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code>
   * and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code>
   * and <code>states.select</code> objects.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.theme">https://api.highcharts.com/highcharts/navigation.buttonOptions.theme</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.theme">https://api.highcharts.com/highstock/navigation.buttonOptions.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.theme">https://api.highcharts.com/highmaps/navigation.buttonOptions.theme</a>
   *
   * @implspec theme?: NavigationButtonThemeOptions;
   *
   */
  @JSProperty("theme")
  void setTheme(NavigationButtonThemeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the buttons.
   * Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.verticalAlign">https://api.highcharts.com/highcharts/navigation.buttonOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.verticalAlign">https://api.highcharts.com/highstock/navigation.buttonOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.verticalAlign">https://api.highcharts.com/highmaps/navigation.buttonOptions.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the buttons.
   * Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.verticalAlign">https://api.highcharts.com/highcharts/navigation.buttonOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.verticalAlign">https://api.highcharts.com/highstock/navigation.buttonOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.verticalAlign">https://api.highcharts.com/highmaps/navigation.buttonOptions.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.width">https://api.highcharts.com/highcharts/navigation.buttonOptions.width</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.width">https://api.highcharts.com/highstock/navigation.buttonOptions.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.width">https://api.highcharts.com/highmaps/navigation.buttonOptions.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.width">https://api.highcharts.com/highcharts/navigation.buttonOptions.width</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.width">https://api.highcharts.com/highstock/navigation.buttonOptions.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.width">https://api.highcharts.com/highmaps/navigation.buttonOptions.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the button's
   * position relative to its <code>verticalAlign</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.y">https://api.highcharts.com/highcharts/navigation.buttonOptions.y</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.y">https://api.highcharts.com/highstock/navigation.buttonOptions.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.y">https://api.highcharts.com/highmaps/navigation.buttonOptions.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the button's
   * position relative to its <code>verticalAlign</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.y">https://api.highcharts.com/highcharts/navigation.buttonOptions.y</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.y">https://api.highcharts.com/highstock/navigation.buttonOptions.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.y">https://api.highcharts.com/highmaps/navigation.buttonOptions.y</a>
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
