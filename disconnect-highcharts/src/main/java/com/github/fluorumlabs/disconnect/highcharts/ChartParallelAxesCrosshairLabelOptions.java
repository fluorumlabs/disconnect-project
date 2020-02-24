package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A label on the axis next to the crosshair.
 *
 * In styled mode, the label is styled with the <code>.highcharts-crosshair-label</code>
 * class.
 *
 * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label</a>
 *
 */
public interface ChartParallelAxesCrosshairLabelOptions extends Any {
  /**
   * (Highstock) Alignment of the label compared to the axis. Defaults to
   * <code>left</code> for right-side axes, <code>right</code> for left-side axes and <code>center</code> for
   * horizontal axes.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.align">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * (Highstock) Alignment of the label compared to the axis. Defaults to
   * <code>left</code> for right-side axes, <code>right</code> for left-side axes and <code>center</code> for
   * horizontal axes.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.align">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.align</a>
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  void setAlign(String value);

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Highstock) The border color for the crosshair label
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderColor">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highstock) The border color for the crosshair label
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderColor">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highstock) The border corner radius of the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderRadius">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highstock) The border corner radius of the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderRadius">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highstock) The border width for the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderWidth">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highstock) The border width for the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderWidth">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highstock) A format string for the crosshair label. Defaults to
   * <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.format">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highstock) A format string for the crosshair label. Defaults to
   * <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.format">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Highstock) Formatter function for the label text.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.formatter">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<any>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<Any> getFormatter();

  /**
   * (Highstock) Formatter function for the label text.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.formatter">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<any>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<Any> value);

  /**
   * (Highstock) Padding inside the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.padding">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highstock) Padding inside the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.padding">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highstock) The shape to use for the label box.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.shape">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highstock) The shape to use for the label box.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.shape">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.shape</a>
   *
   * @implspec shape?: string;
   *
   */
  @JSProperty("shape")
  void setShape(String value);

  /**
   * (Highstock) Text styles for the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.style">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highstock) Text styles for the crosshair label.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.style">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
