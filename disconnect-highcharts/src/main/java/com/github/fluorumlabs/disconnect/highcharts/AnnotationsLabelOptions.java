package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for annotation's labels. Each label
 * inherits options from the labelOptions object. An option from the
 * labelOptions can be overwritten by config for a specific label.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions">https://api.highcharts.com/highcharts/annotations.labelOptions</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions">https://api.highcharts.com/highstock/annotations.labelOptions</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions">https://api.highcharts.com/highmaps/annotations.labelOptions</a>
 *
 */
public interface AnnotationsLabelOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The alignment of the annotation's
   * label. If right, the right side of the label should be touching the
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.align">https://api.highcharts.com/highcharts/annotations.labelOptions.align</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.align">https://api.highcharts.com/highstock/annotations.labelOptions.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.align">https://api.highcharts.com/highmaps/annotations.labelOptions.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The alignment of the annotation's
   * label. If right, the right side of the label should be touching the
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.align">https://api.highcharts.com/highcharts/annotations.labelOptions.align</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.align">https://api.highcharts.com/highstock/annotations.labelOptions.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.align">https://api.highcharts.com/highmaps/annotations.labelOptions.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow the annotation's
   * labels to overlap. To make the labels less sensitive for overlapping, the
   * can be set to 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.allowOverlap">https://api.highcharts.com/highcharts/annotations.labelOptions.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.allowOverlap">https://api.highcharts.com/highstock/annotations.labelOptions.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.allowOverlap">https://api.highcharts.com/highmaps/annotations.labelOptions.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow the annotation's
   * labels to overlap. To make the labels less sensitive for overlapping, the
   * can be set to 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.allowOverlap">https://api.highcharts.com/highcharts/annotations.labelOptions.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.allowOverlap">https://api.highcharts.com/highstock/annotations.labelOptions.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.allowOverlap">https://api.highcharts.com/highmaps/annotations.labelOptions.allowOverlap</a>
   *
   * @implspec allowOverlap?: boolean;
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highcharts/annotations.labelOptions.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highstock/annotations.labelOptions.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highmaps/annotations.labelOptions.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highcharts/annotations.labelOptions.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highstock/annotations.labelOptions.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highmaps/annotations.labelOptions.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highcharts/annotations.labelOptions.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highstock/annotations.labelOptions.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.backgroundColor">https://api.highcharts.com/highmaps/annotations.labelOptions.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The border color for the annotation's
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.borderColor">https://api.highcharts.com/highcharts/annotations.labelOptions.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.borderColor">https://api.highcharts.com/highstock/annotations.labelOptions.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.borderColor">https://api.highcharts.com/highmaps/annotations.labelOptions.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The border color for the annotation's
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.borderColor">https://api.highcharts.com/highcharts/annotations.labelOptions.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.borderColor">https://api.highcharts.com/highstock/annotations.labelOptions.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.borderColor">https://api.highcharts.com/highmaps/annotations.labelOptions.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The border radius in pixels for the
   * annotaiton's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.borderRadius">https://api.highcharts.com/highcharts/annotations.labelOptions.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.borderRadius">https://api.highcharts.com/highstock/annotations.labelOptions.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.borderRadius">https://api.highcharts.com/highmaps/annotations.labelOptions.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The border radius in pixels for the
   * annotaiton's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.borderRadius">https://api.highcharts.com/highcharts/annotations.labelOptions.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.borderRadius">https://api.highcharts.com/highstock/annotations.labelOptions.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.borderRadius">https://api.highcharts.com/highmaps/annotations.labelOptions.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The border width in pixels for the
   * annotation's label
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.borderWidth">https://api.highcharts.com/highcharts/annotations.labelOptions.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.borderWidth">https://api.highcharts.com/highstock/annotations.labelOptions.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.borderWidth">https://api.highcharts.com/highmaps/annotations.labelOptions.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The border width in pixels for the
   * annotation's label
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.borderWidth">https://api.highcharts.com/highcharts/annotations.labelOptions.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.borderWidth">https://api.highcharts.com/highstock/annotations.labelOptions.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.borderWidth">https://api.highcharts.com/highmaps/annotations.labelOptions.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A class name for styling by CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.className">https://api.highcharts.com/highcharts/annotations.labelOptions.className</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.className">https://api.highcharts.com/highstock/annotations.labelOptions.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.className">https://api.highcharts.com/highmaps/annotations.labelOptions.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps) A class name for styling by CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.className">https://api.highcharts.com/highcharts/annotations.labelOptions.className</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.className">https://api.highcharts.com/highstock/annotations.labelOptions.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.className">https://api.highcharts.com/highmaps/annotations.labelOptions.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to hide the annotation's label
   * that is outside the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.crop">https://api.highcharts.com/highcharts/annotations.labelOptions.crop</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.crop">https://api.highcharts.com/highstock/annotations.labelOptions.crop</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.crop">https://api.highcharts.com/highmaps/annotations.labelOptions.crop</a>
   *
   * @implspec crop?: boolean;
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to hide the annotation's label
   * that is outside the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.crop">https://api.highcharts.com/highcharts/annotations.labelOptions.crop</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.crop">https://api.highcharts.com/highstock/annotations.labelOptions.crop</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.crop">https://api.highcharts.com/highmaps/annotations.labelOptions.crop</a>
   *
   * @implspec crop?: boolean;
   *
   */
  @JSProperty("crop")
  void setCrop(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The label's pixel distance from the
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.distance">https://api.highcharts.com/highcharts/annotations.labelOptions.distance</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.distance">https://api.highcharts.com/highstock/annotations.labelOptions.distance</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.distance">https://api.highcharts.com/highmaps/annotations.labelOptions.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highcharts, Highstock, Highmaps) The label's pixel distance from the
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.distance">https://api.highcharts.com/highcharts/annotations.labelOptions.distance</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.distance">https://api.highcharts.com/highstock/annotations.labelOptions.distance</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.distance">https://api.highcharts.com/highmaps/annotations.labelOptions.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A format string for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.format">https://api.highcharts.com/highcharts/annotations.labelOptions.format</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.format">https://api.highcharts.com/highstock/annotations.labelOptions.format</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.format">https://api.highcharts.com/highmaps/annotations.labelOptions.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock, Highmaps) A format string for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.format">https://api.highcharts.com/highcharts/annotations.labelOptions.format</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.format">https://api.highcharts.com/highstock/annotations.labelOptions.format</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.format">https://api.highcharts.com/highmaps/annotations.labelOptions.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Callback JavaScript function to format
   * the annotation's label. Note that if a <code>format</code> or <code>text</code> are defined,
   * the format or text take precedence and the formatter is ignored. <code>This</code>
   * refers to a point object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.formatter">https://api.highcharts.com/highcharts/annotations.labelOptions.formatter</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.formatter">https://api.highcharts.com/highstock/annotations.labelOptions.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.formatter">https://api.highcharts.com/highmaps/annotations.labelOptions.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<Point>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<Point> getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Callback JavaScript function to format
   * the annotation's label. Note that if a <code>format</code> or <code>text</code> are defined,
   * the format or text take precedence and the formatter is ignored. <code>This</code>
   * refers to a point object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.formatter">https://api.highcharts.com/highcharts/annotations.labelOptions.formatter</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.formatter">https://api.highcharts.com/highstock/annotations.labelOptions.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.formatter">https://api.highcharts.com/highmaps/annotations.labelOptions.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<Point>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<Point> value);

  /**
   * (Highcharts, Highstock, Highmaps) How to handle the annotation's label
   * that flow outside the plot area. The justify option aligns the label
   * inside the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.overflow">https://api.highcharts.com/highcharts/annotations.labelOptions.overflow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.overflow">https://api.highcharts.com/highstock/annotations.labelOptions.overflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.overflow">https://api.highcharts.com/highmaps/annotations.labelOptions.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts, Highstock, Highmaps) How to handle the annotation's label
   * that flow outside the plot area. The justify option aligns the label
   * inside the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.overflow">https://api.highcharts.com/highcharts/annotations.labelOptions.overflow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.overflow">https://api.highcharts.com/highstock/annotations.labelOptions.overflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.overflow">https://api.highcharts.com/highmaps/annotations.labelOptions.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  void setOverflow(Overflow value);

  /**
   * (Highcharts, Highstock, Highmaps) When either the borderWidth or the
   * backgroundColor is set, this is the padding within the box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.padding">https://api.highcharts.com/highcharts/annotations.labelOptions.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.padding">https://api.highcharts.com/highstock/annotations.labelOptions.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.padding">https://api.highcharts.com/highmaps/annotations.labelOptions.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps) When either the borderWidth or the
   * backgroundColor is set, this is the padding within the box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.padding">https://api.highcharts.com/highcharts/annotations.labelOptions.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.padding">https://api.highcharts.com/highstock/annotations.labelOptions.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.padding">https://api.highcharts.com/highmaps/annotations.labelOptions.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The shadow of the box. The shadow can
   * be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.shadow">https://api.highcharts.com/highcharts/annotations.labelOptions.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.shadow">https://api.highcharts.com/highstock/annotations.labelOptions.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.shadow">https://api.highcharts.com/highmaps/annotations.labelOptions.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts, Highstock, Highmaps) The shadow of the box. The shadow can
   * be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.shadow">https://api.highcharts.com/highcharts/annotations.labelOptions.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.shadow">https://api.highcharts.com/highstock/annotations.labelOptions.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.shadow">https://api.highcharts.com/highmaps/annotations.labelOptions.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The shadow of the box. The shadow can
   * be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.shadow">https://api.highcharts.com/highcharts/annotations.labelOptions.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.shadow">https://api.highcharts.com/highstock/annotations.labelOptions.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.shadow">https://api.highcharts.com/highmaps/annotations.labelOptions.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The name of a symbol to use for the
   * border around the label. Symbols are predefined functions on the Renderer
   * object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.shape">https://api.highcharts.com/highcharts/annotations.labelOptions.shape</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.shape">https://api.highcharts.com/highstock/annotations.labelOptions.shape</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.shape">https://api.highcharts.com/highmaps/annotations.labelOptions.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highcharts, Highstock, Highmaps) The name of a symbol to use for the
   * border around the label. Symbols are predefined functions on the Renderer
   * object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.shape">https://api.highcharts.com/highcharts/annotations.labelOptions.shape</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.shape">https://api.highcharts.com/highstock/annotations.labelOptions.shape</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.shape">https://api.highcharts.com/highmaps/annotations.labelOptions.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  void setShape(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Styles for the annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.style">https://api.highcharts.com/highcharts/annotations.labelOptions.style</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.style">https://api.highcharts.com/highstock/annotations.labelOptions.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.style">https://api.highcharts.com/highmaps/annotations.labelOptions.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Styles for the annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.style">https://api.highcharts.com/highcharts/annotations.labelOptions.style</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.style">https://api.highcharts.com/highstock/annotations.labelOptions.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.style">https://api.highcharts.com/highmaps/annotations.labelOptions.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Alias for the format option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.text">https://api.highcharts.com/highcharts/annotations.labelOptions.text</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.text">https://api.highcharts.com/highstock/annotations.labelOptions.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.text">https://api.highcharts.com/highmaps/annotations.labelOptions.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) Alias for the format option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.text">https://api.highcharts.com/highcharts/annotations.labelOptions.text</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.text">https://api.highcharts.com/highstock/annotations.labelOptions.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.text">https://api.highcharts.com/highmaps/annotations.labelOptions.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the
   * annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.useHTML">https://api.highcharts.com/highcharts/annotations.labelOptions.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.useHTML">https://api.highcharts.com/highstock/annotations.labelOptions.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.useHTML">https://api.highcharts.com/highmaps/annotations.labelOptions.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the
   * annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.useHTML">https://api.highcharts.com/highcharts/annotations.labelOptions.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.useHTML">https://api.highcharts.com/highstock/annotations.labelOptions.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.useHTML">https://api.highcharts.com/highmaps/annotations.labelOptions.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the
   * annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.verticalAlign">https://api.highcharts.com/highcharts/annotations.labelOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.verticalAlign">https://api.highcharts.com/highstock/annotations.labelOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.verticalAlign">https://api.highcharts.com/highmaps/annotations.labelOptions.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the
   * annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.verticalAlign">https://api.highcharts.com/highcharts/annotations.labelOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.verticalAlign">https://api.highcharts.com/highstock/annotations.labelOptions.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.verticalAlign">https://api.highcharts.com/highmaps/annotations.labelOptions.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) The x position offset of the label
   * relative to the point. Note that if a <code>distance</code> is defined, the distance
   * takes precedence over <code>x</code> and <code>y</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.x">https://api.highcharts.com/highcharts/annotations.labelOptions.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.x">https://api.highcharts.com/highstock/annotations.labelOptions.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.x">https://api.highcharts.com/highmaps/annotations.labelOptions.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position offset of the label
   * relative to the point. Note that if a <code>distance</code> is defined, the distance
   * takes precedence over <code>x</code> and <code>y</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.x">https://api.highcharts.com/highcharts/annotations.labelOptions.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.x">https://api.highcharts.com/highstock/annotations.labelOptions.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.x">https://api.highcharts.com/highmaps/annotations.labelOptions.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position offset of the label
   * relative to the point. Note that if a <code>distance</code> is defined, the distance
   * takes precedence over <code>x</code> and <code>y</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.y">https://api.highcharts.com/highcharts/annotations.labelOptions.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.y">https://api.highcharts.com/highstock/annotations.labelOptions.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.y">https://api.highcharts.com/highmaps/annotations.labelOptions.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position offset of the label
   * relative to the point. Note that if a <code>distance</code> is defined, the distance
   * takes precedence over <code>x</code> and <code>y</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labelOptions.y">https://api.highcharts.com/highcharts/annotations.labelOptions.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labelOptions.y">https://api.highcharts.com/highstock/annotations.labelOptions.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labelOptions.y">https://api.highcharts.com/highmaps/annotations.labelOptions.y</a>
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
  abstract class Overflow extends JsEnum {
    public static final Overflow ALLOW = JsEnum.of("allow");

    public static final Overflow JUSTIFY = JsEnum.of("justify");
  }

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
