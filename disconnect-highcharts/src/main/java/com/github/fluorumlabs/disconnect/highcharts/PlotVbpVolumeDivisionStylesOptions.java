package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

public interface PlotVbpVolumeDivisionStylesOptions extends Any {
  /**
   * (Highstock) Color of negative volume bars.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highstock) Color of negative volume bars.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highstock) Color of negative volume bars.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highstock) Color of negative volume bars.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highstock) Color of positive volume bars.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.positiveColor">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.positiveColor</a>
   *
   * @implspec positiveColor?: ColorString;
   *
   */
  @JSProperty("positiveColor")
  @Nullable
  String getPositiveColor();

  /**
   * (Highstock) Color of positive volume bars.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.positiveColor">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.styles.positiveColor</a>
   *
   * @implspec positiveColor?: ColorString;
   *
   */
  @JSProperty("positiveColor")
  void setPositiveColor(String value);
}
