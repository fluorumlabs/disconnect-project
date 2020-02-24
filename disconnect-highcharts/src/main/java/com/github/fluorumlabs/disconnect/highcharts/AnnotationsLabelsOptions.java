package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) An array of labels for the annotation. For
 * options that apply to multiple labels, they can be added to the labelOptions.
 *
 * @see <a href="https://api.highcharts.com/highcharts/annotations.labels">https://api.highcharts.com/highcharts/annotations.labels</a>
 * @see <a href="https://api.highcharts.com/highstock/annotations.labels">https://api.highcharts.com/highstock/annotations.labels</a>
 * @see <a href="https://api.highcharts.com/highmaps/annotations.labels">https://api.highcharts.com/highmaps/annotations.labels</a>
 *
 */
public interface AnnotationsLabelsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The alignment of the annotation's
   * label. If right, the right side of the label should be touching the
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.align">https://api.highcharts.com/highcharts/annotations.labels.align</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.align">https://api.highcharts.com/highstock/annotations.labels.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.align">https://api.highcharts.com/highmaps/annotations.labels.align</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.align">https://api.highcharts.com/highcharts/annotations.labels.align</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.align">https://api.highcharts.com/highstock/annotations.labels.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.align">https://api.highcharts.com/highmaps/annotations.labels.align</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.allowOverlap">https://api.highcharts.com/highcharts/annotations.labels.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.allowOverlap">https://api.highcharts.com/highstock/annotations.labels.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.allowOverlap">https://api.highcharts.com/highmaps/annotations.labels.allowOverlap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.allowOverlap">https://api.highcharts.com/highcharts/annotations.labels.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.allowOverlap">https://api.highcharts.com/highstock/annotations.labels.allowOverlap</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.allowOverlap">https://api.highcharts.com/highmaps/annotations.labels.allowOverlap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.backgroundColor">https://api.highcharts.com/highcharts/annotations.labels.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.backgroundColor">https://api.highcharts.com/highstock/annotations.labels.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.backgroundColor">https://api.highcharts.com/highmaps/annotations.labels.backgroundColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.backgroundColor">https://api.highcharts.com/highcharts/annotations.labels.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.backgroundColor">https://api.highcharts.com/highstock/annotations.labels.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.backgroundColor">https://api.highcharts.com/highmaps/annotations.labels.backgroundColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.backgroundColor">https://api.highcharts.com/highcharts/annotations.labels.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.backgroundColor">https://api.highcharts.com/highstock/annotations.labels.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.backgroundColor">https://api.highcharts.com/highmaps/annotations.labels.backgroundColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.borderColor">https://api.highcharts.com/highcharts/annotations.labels.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.borderColor">https://api.highcharts.com/highstock/annotations.labels.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.borderColor">https://api.highcharts.com/highmaps/annotations.labels.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.borderColor">https://api.highcharts.com/highcharts/annotations.labels.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.borderColor">https://api.highcharts.com/highstock/annotations.labels.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.borderColor">https://api.highcharts.com/highmaps/annotations.labels.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.borderRadius">https://api.highcharts.com/highcharts/annotations.labels.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.borderRadius">https://api.highcharts.com/highstock/annotations.labels.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.borderRadius">https://api.highcharts.com/highmaps/annotations.labels.borderRadius</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.borderRadius">https://api.highcharts.com/highcharts/annotations.labels.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.borderRadius">https://api.highcharts.com/highstock/annotations.labels.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.borderRadius">https://api.highcharts.com/highmaps/annotations.labels.borderRadius</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.borderWidth">https://api.highcharts.com/highcharts/annotations.labels.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.borderWidth">https://api.highcharts.com/highstock/annotations.labels.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.borderWidth">https://api.highcharts.com/highmaps/annotations.labels.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.borderWidth">https://api.highcharts.com/highcharts/annotations.labels.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.borderWidth">https://api.highcharts.com/highstock/annotations.labels.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.borderWidth">https://api.highcharts.com/highmaps/annotations.labels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A class name for styling by CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.className">https://api.highcharts.com/highcharts/annotations.labels.className</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.className">https://api.highcharts.com/highstock/annotations.labels.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.className">https://api.highcharts.com/highmaps/annotations.labels.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.className">https://api.highcharts.com/highcharts/annotations.labels.className</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.className">https://api.highcharts.com/highstock/annotations.labels.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.className">https://api.highcharts.com/highmaps/annotations.labels.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.crop">https://api.highcharts.com/highcharts/annotations.labels.crop</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.crop">https://api.highcharts.com/highstock/annotations.labels.crop</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.crop">https://api.highcharts.com/highmaps/annotations.labels.crop</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.crop">https://api.highcharts.com/highcharts/annotations.labels.crop</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.crop">https://api.highcharts.com/highstock/annotations.labels.crop</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.crop">https://api.highcharts.com/highmaps/annotations.labels.crop</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.distance">https://api.highcharts.com/highcharts/annotations.labels.distance</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.distance">https://api.highcharts.com/highstock/annotations.labels.distance</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.distance">https://api.highcharts.com/highmaps/annotations.labels.distance</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.distance">https://api.highcharts.com/highcharts/annotations.labels.distance</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.distance">https://api.highcharts.com/highstock/annotations.labels.distance</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.distance">https://api.highcharts.com/highmaps/annotations.labels.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A format string for the data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.format">https://api.highcharts.com/highcharts/annotations.labels.format</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.format">https://api.highcharts.com/highstock/annotations.labels.format</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.format">https://api.highcharts.com/highmaps/annotations.labels.format</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.format">https://api.highcharts.com/highcharts/annotations.labels.format</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.format">https://api.highcharts.com/highstock/annotations.labels.format</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.format">https://api.highcharts.com/highmaps/annotations.labels.format</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.formatter">https://api.highcharts.com/highcharts/annotations.labels.formatter</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.formatter">https://api.highcharts.com/highstock/annotations.labels.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.formatter">https://api.highcharts.com/highmaps/annotations.labels.formatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.formatter">https://api.highcharts.com/highcharts/annotations.labels.formatter</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.formatter">https://api.highcharts.com/highstock/annotations.labels.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.formatter">https://api.highcharts.com/highmaps/annotations.labels.formatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.overflow">https://api.highcharts.com/highcharts/annotations.labels.overflow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.overflow">https://api.highcharts.com/highstock/annotations.labels.overflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.overflow">https://api.highcharts.com/highmaps/annotations.labels.overflow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.overflow">https://api.highcharts.com/highcharts/annotations.labels.overflow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.overflow">https://api.highcharts.com/highstock/annotations.labels.overflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.overflow">https://api.highcharts.com/highmaps/annotations.labels.overflow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.padding">https://api.highcharts.com/highcharts/annotations.labels.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.padding">https://api.highcharts.com/highstock/annotations.labels.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.padding">https://api.highcharts.com/highmaps/annotations.labels.padding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.padding">https://api.highcharts.com/highcharts/annotations.labels.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.padding">https://api.highcharts.com/highstock/annotations.labels.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.padding">https://api.highcharts.com/highmaps/annotations.labels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps) This option defines the point to which
   * the label will be connected. It can be either the point which exists in
   * the series - it is referenced by the point's id - or a new point with
   * defined x, y properies and optionally axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.point">https://api.highcharts.com/highcharts/annotations.labels.point</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.point">https://api.highcharts.com/highstock/annotations.labels.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.point">https://api.highcharts.com/highmaps/annotations.labels.point</a>
   *
   * @implspec point?: (string|AnnotationsLabelsPointOptions);
   *
   */
  @JSProperty("point")
  @Nullable
  Unknown getPoint();

  /**
   * (Highcharts, Highstock, Highmaps) This option defines the point to which
   * the label will be connected. It can be either the point which exists in
   * the series - it is referenced by the point's id - or a new point with
   * defined x, y properies and optionally axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.point">https://api.highcharts.com/highcharts/annotations.labels.point</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.point">https://api.highcharts.com/highstock/annotations.labels.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.point">https://api.highcharts.com/highmaps/annotations.labels.point</a>
   *
   * @implspec point?: (string|AnnotationsLabelsPointOptions);
   *
   */
  @JSProperty("point")
  void setPoint(String value);

  /**
   * (Highcharts, Highstock, Highmaps) This option defines the point to which
   * the label will be connected. It can be either the point which exists in
   * the series - it is referenced by the point's id - or a new point with
   * defined x, y properies and optionally axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.point">https://api.highcharts.com/highcharts/annotations.labels.point</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.point">https://api.highcharts.com/highstock/annotations.labels.point</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.point">https://api.highcharts.com/highmaps/annotations.labels.point</a>
   *
   * @implspec point?: (string|AnnotationsLabelsPointOptions);
   *
   */
  @JSProperty("point")
  void setPoint(AnnotationsLabelsPointOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The shadow of the box. The shadow can
   * be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.shadow">https://api.highcharts.com/highcharts/annotations.labels.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.shadow">https://api.highcharts.com/highstock/annotations.labels.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.shadow">https://api.highcharts.com/highmaps/annotations.labels.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.shadow">https://api.highcharts.com/highcharts/annotations.labels.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.shadow">https://api.highcharts.com/highstock/annotations.labels.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.shadow">https://api.highcharts.com/highmaps/annotations.labels.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.shadow">https://api.highcharts.com/highcharts/annotations.labels.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.shadow">https://api.highcharts.com/highstock/annotations.labels.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.shadow">https://api.highcharts.com/highmaps/annotations.labels.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.shape">https://api.highcharts.com/highcharts/annotations.labels.shape</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.shape">https://api.highcharts.com/highstock/annotations.labels.shape</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.shape">https://api.highcharts.com/highmaps/annotations.labels.shape</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.shape">https://api.highcharts.com/highcharts/annotations.labels.shape</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.shape">https://api.highcharts.com/highstock/annotations.labels.shape</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.shape">https://api.highcharts.com/highmaps/annotations.labels.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  void setShape(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Styles for the annotation's label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.style">https://api.highcharts.com/highcharts/annotations.labels.style</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.style">https://api.highcharts.com/highstock/annotations.labels.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.style">https://api.highcharts.com/highmaps/annotations.labels.style</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.style">https://api.highcharts.com/highcharts/annotations.labels.style</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.style">https://api.highcharts.com/highstock/annotations.labels.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.style">https://api.highcharts.com/highmaps/annotations.labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Alias for the format option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.text">https://api.highcharts.com/highcharts/annotations.labels.text</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.text">https://api.highcharts.com/highstock/annotations.labels.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.text">https://api.highcharts.com/highmaps/annotations.labels.text</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.text">https://api.highcharts.com/highcharts/annotations.labels.text</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.text">https://api.highcharts.com/highstock/annotations.labels.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.text">https://api.highcharts.com/highmaps/annotations.labels.text</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.useHTML">https://api.highcharts.com/highcharts/annotations.labels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.useHTML">https://api.highcharts.com/highstock/annotations.labels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.useHTML">https://api.highcharts.com/highmaps/annotations.labels.useHTML</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.useHTML">https://api.highcharts.com/highcharts/annotations.labels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.useHTML">https://api.highcharts.com/highstock/annotations.labels.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.useHTML">https://api.highcharts.com/highmaps/annotations.labels.useHTML</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.verticalAlign">https://api.highcharts.com/highcharts/annotations.labels.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.verticalAlign">https://api.highcharts.com/highstock/annotations.labels.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.verticalAlign">https://api.highcharts.com/highmaps/annotations.labels.verticalAlign</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.verticalAlign">https://api.highcharts.com/highcharts/annotations.labels.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.verticalAlign">https://api.highcharts.com/highstock/annotations.labels.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.verticalAlign">https://api.highcharts.com/highmaps/annotations.labels.verticalAlign</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.x">https://api.highcharts.com/highcharts/annotations.labels.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.x">https://api.highcharts.com/highstock/annotations.labels.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.x">https://api.highcharts.com/highmaps/annotations.labels.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.x">https://api.highcharts.com/highcharts/annotations.labels.x</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.x">https://api.highcharts.com/highstock/annotations.labels.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.x">https://api.highcharts.com/highmaps/annotations.labels.x</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.y">https://api.highcharts.com/highcharts/annotations.labels.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.y">https://api.highcharts.com/highstock/annotations.labels.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.y">https://api.highcharts.com/highmaps/annotations.labels.y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/annotations.labels.y">https://api.highcharts.com/highcharts/annotations.labels.y</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations.labels.y">https://api.highcharts.com/highstock/annotations.labels.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations.labels.y">https://api.highcharts.com/highmaps/annotations.labels.y</a>
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
