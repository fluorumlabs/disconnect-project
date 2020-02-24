package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * A style object with camel case property names to define visual appearance of
 * a SVG element or HTML element. The properties can be whatever styles are
 * supported on the given SVG or HTML element.
 *
 */
public interface CSSObject extends Any {
  /**
   * @implspec [key: string]: (boolean|number|string|undefined);
   *
   */
  @JSIndexer
  Unknown get(String key);

  /**
   * @implspec [key: string]: (boolean|number|string|undefined);
   *
   */
  @JSIndexer
  void set(String key, boolean value);

  /**
   * @implspec [key: string]: (boolean|number|string|undefined);
   *
   */
  @JSIndexer
  void set(String key, double value);

  /**
   * @implspec [key: string]: (boolean|number|string|undefined);
   *
   */
  @JSIndexer
  void set(String key, String value);

  /**
   * Background style for the element.
   *
   * @implspec background?: string;
   *
   */
  @JSProperty("background")
  @Nullable
  String getBackground();

  /**
   * Background style for the element.
   *
   * @implspec background?: string;
   *
   */
  @JSProperty("background")
  void setBackground(String value);

  /**
   * Background color of the element.
   *
   * @implspec backgroundColor?: ColorString;
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  String getBackgroundColor();

  /**
   * Background color of the element.
   *
   * @implspec backgroundColor?: ColorString;
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * Border style for the element.
   *
   * @implspec border?: string;
   *
   */
  @JSProperty("border")
  @Nullable
  String getBorder();

  /**
   * Border style for the element.
   *
   * @implspec border?: string;
   *
   */
  @JSProperty("border")
  void setBorder(String value);

  /**
   * Radius of the element border.
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * Radius of the element border.
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * Color used in the element. The &quot;contrast&quot; option is a Highcharts custom
   * property that results in black or white, depending on the background of
   * the element.
   *
   * @implspec color?: (&quot;contrast&quot;|ColorString);
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * Color used in the element. The &quot;contrast&quot; option is a Highcharts custom
   * property that results in black or white, depending on the background of
   * the element.
   *
   * @implspec color?: (&quot;contrast&quot;|ColorString);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * Style of the mouse cursor when resting over the element.
   *
   * @implspec cursor?: CursorType;
   *
   */
  @JSProperty("cursor")
  @Nullable
  CursorType getCursor();

  /**
   * Style of the mouse cursor when resting over the element.
   *
   * @implspec cursor?: CursorType;
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * Font family of the element text. Multiple values have to be in decreasing
   * preference order and separated by comma.
   *
   * @implspec fontFamily?: string;
   *
   */
  @JSProperty("fontFamily")
  @Nullable
  String getFontFamily();

  /**
   * Font family of the element text. Multiple values have to be in decreasing
   * preference order and separated by comma.
   *
   * @implspec fontFamily?: string;
   *
   */
  @JSProperty("fontFamily")
  void setFontFamily(String value);

  /**
   * Font size of the element text.
   *
   * @implspec fontSize?: string;
   *
   */
  @JSProperty("fontSize")
  @Nullable
  String getFontSize();

  /**
   * Font size of the element text.
   *
   * @implspec fontSize?: string;
   *
   */
  @JSProperty("fontSize")
  void setFontSize(String value);

  /**
   * Font weight of the element text.
   *
   * @implspec fontWeight?: string;
   *
   */
  @JSProperty("fontWeight")
  @Nullable
  String getFontWeight();

  /**
   * Font weight of the element text.
   *
   * @implspec fontWeight?: string;
   *
   */
  @JSProperty("fontWeight")
  void setFontWeight(String value);

  /**
   * Height of the element.
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Height of the element.
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * Width of the element border.
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * Width of the element border.
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * Opacity of the element.
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * Opacity of the element.
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * Space around the element content.
   *
   * @implspec padding?: string;
   *
   */
  @JSProperty("padding")
  @Nullable
  String getPadding();

  /**
   * Space around the element content.
   *
   * @implspec padding?: string;
   *
   */
  @JSProperty("padding")
  void setPadding(String value);

  /**
   * Behaviour of the element when the mouse cursor rests over it.
   *
   * @implspec pointerEvents?: string;
   *
   */
  @JSProperty("pointerEvents")
  @Nullable
  String getPointerEvents();

  /**
   * Behaviour of the element when the mouse cursor rests over it.
   *
   * @implspec pointerEvents?: string;
   *
   */
  @JSProperty("pointerEvents")
  void setPointerEvents(String value);

  /**
   * Positioning of the element.
   *
   * @implspec position?: string;
   *
   */
  @JSProperty("position")
  @Nullable
  String getPosition();

  /**
   * Positioning of the element.
   *
   * @implspec position?: string;
   *
   */
  @JSProperty("position")
  void setPosition(String value);

  /**
   * Alignment of the element text.
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  @Nullable
  String getTextAlign();

  /**
   * Alignment of the element text.
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(String value);

  /**
   * Additional decoration of the element text.
   *
   * @implspec textDecoration?: string;
   *
   */
  @JSProperty("textDecoration")
  @Nullable
  String getTextDecoration();

  /**
   * Additional decoration of the element text.
   *
   * @implspec textDecoration?: string;
   *
   */
  @JSProperty("textDecoration")
  void setTextDecoration(String value);

  /**
   * Outline style of the element text.
   *
   * @implspec textOutline?: string;
   *
   */
  @JSProperty("textOutline")
  @Nullable
  String getTextOutline();

  /**
   * Outline style of the element text.
   *
   * @implspec textOutline?: string;
   *
   */
  @JSProperty("textOutline")
  void setTextOutline(String value);

  /**
   * Line break style of the element text. Highcharts SVG elements support
   * <code>ellipsis</code> when a <code>width</code> is set.
   *
   * @implspec textOverflow?: string;
   *
   */
  @JSProperty("textOverflow")
  @Nullable
  String getTextOverflow();

  /**
   * Line break style of the element text. Highcharts SVG elements support
   * <code>ellipsis</code> when a <code>width</code> is set.
   *
   * @implspec textOverflow?: string;
   *
   */
  @JSProperty("textOverflow")
  void setTextOverflow(String value);

  /**
   * Top spacing of the element relative to the parent element.
   *
   * @implspec top?: string;
   *
   */
  @JSProperty("top")
  @Nullable
  String getTop();

  /**
   * Top spacing of the element relative to the parent element.
   *
   * @implspec top?: string;
   *
   */
  @JSProperty("top")
  void setTop(String value);

  /**
   * Animated transition of selected element properties.
   *
   * @implspec transition?: string;
   *
   */
  @JSProperty("transition")
  @Nullable
  String getTransition();

  /**
   * Animated transition of selected element properties.
   *
   * @implspec transition?: string;
   *
   */
  @JSProperty("transition")
  void setTransition(String value);

  /**
   * Line break style of the element text.
   *
   * @implspec whiteSpace?: string;
   *
   */
  @JSProperty("whiteSpace")
  @Nullable
  String getWhiteSpace();

  /**
   * Line break style of the element text.
   *
   * @implspec whiteSpace?: string;
   *
   */
  @JSProperty("whiteSpace")
  void setWhiteSpace(String value);

  /**
   * Width of the element.
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the element.
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
