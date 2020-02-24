package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the pivot or the center point of the gauge.
 *
 * In styled mode, the pivot is styled with the <code>.highcharts-gauge-series .highcharts-pivot</code> rule.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot</a>
 *
 */
public interface PlotGaugePivotOptions extends Any {
  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts) The border or stroke color of the pivot. In able to change
   * this, the borderWidth must also be set to something other than the
   * default 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderColor">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The border or stroke color of the pivot. In able to change
   * this, the borderWidth must also be set to something other than the
   * default 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderColor">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) The border or stroke width of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The border or stroke width of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The pixel radius of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.radius">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts) The pixel radius of the pivot.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.radius">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);
}
