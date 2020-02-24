package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Options for the zoom in button. Properties for the zoom in and
 * zoom out buttons are inherited from mapNavigation.buttonOptions, while
 * individual options can be overridden. By default, the <code>onclick</code>, <code>text</code> and
 * <code>y</code> options are individual.
 *
 * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn</a>
 *
 */
public interface MapNavigationButtonsZoomInOptions extends Any {
  /**
   * (Highmaps) The alignment of the navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.align">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highmaps) The alignment of the navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.align">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highmaps) What box to align the buttons to. Possible values are
   * <code>plotBox</code> and <code>spacingBox</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.alignTo">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.alignTo</a>
   *
   * @implspec alignTo?: (&quot;plotBox&quot;|&quot;spacingBox&quot;);
   *
   */
  @JSProperty("alignTo")
  @Nullable
  AlignTo getAlignTo();

  /**
   * (Highmaps) What box to align the buttons to. Possible values are
   * <code>plotBox</code> and <code>spacingBox</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.alignTo">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.alignTo</a>
   *
   * @implspec alignTo?: (&quot;plotBox&quot;|&quot;spacingBox&quot;);
   *
   */
  @JSProperty("alignTo")
  void setAlignTo(AlignTo value);

  /**
   * (Highmaps) The pixel height of the map navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.height">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highmaps) The pixel height of the map navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.height">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highmaps) Click handler for the button.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.onclick">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.onclick</a>
   *
   * @implspec onclick?: () =&gt; void;
   *
   */
  @JSProperty("onclick")
  @Nullable
  Onclick getOnclick();

  /**
   * (Highmaps) Click handler for the button.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.onclick">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.onclick</a>
   *
   * @implspec onclick?: () =&gt; void;
   *
   */
  @JSProperty("onclick")
  void setOnclick(Onclick value);

  /**
   * (Highmaps) Padding for the navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.padding">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highmaps) Padding for the navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.padding">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highmaps) Text styles for the map navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.style">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highmaps) Text styles for the map navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.style">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highmaps) The text for the button. The tooltip (title) is a language
   * option given by lang.zoomIn.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.text">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highmaps) The text for the button. The tooltip (title) is a language
   * option given by lang.zoomIn.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.text">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highmaps) A configuration object for the button theme. The object
   * accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>.
   * Tri-state button styles are supported by the <code>states.hover</code> and
   * <code>states.select</code> objects.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.theme">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.theme</a>
   *
   * @implspec theme?: SVGAttributes;
   *
   */
  @JSProperty("theme")
  @Nullable
  SVGAttributes getTheme();

  /**
   * (Highmaps) A configuration object for the button theme. The object
   * accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>.
   * Tri-state button styles are supported by the <code>states.hover</code> and
   * <code>states.select</code> objects.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.theme">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.theme</a>
   *
   * @implspec theme?: SVGAttributes;
   *
   */
  @JSProperty("theme")
  void setTheme(SVGAttributes value);

  /**
   * (Highmaps) The vertical alignment of the buttons. Individual alignment
   * can be adjusted by each button's <code>y</code> offset.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.verticalAlign">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highmaps) The vertical alignment of the buttons. Individual alignment
   * can be adjusted by each button's <code>y</code> offset.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.verticalAlign">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highmaps) The width of the map navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.width">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highmaps) The width of the map navigation buttons.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.width">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highmaps) The X offset of the buttons relative to its <code>align</code> setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.x">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highmaps) The X offset of the buttons relative to its <code>align</code> setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.x">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highmaps) The position of the zoomIn button relative to the vertical
   * alignment.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.y">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highmaps) The position of the zoomIn button relative to the vertical
   * alignment.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.y">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn.y</a>
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
  abstract class AlignTo extends JsEnum {
    public static final AlignTo PLOTBOX = JsEnum.of("plotBox");

    public static final AlignTo SPACINGBOX = JsEnum.of("spacingBox");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Onclick extends Any {
    void apply();
  }

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
