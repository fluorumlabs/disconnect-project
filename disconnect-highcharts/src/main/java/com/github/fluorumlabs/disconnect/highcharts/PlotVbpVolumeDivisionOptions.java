package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for bars when volume is divided into
 * positive/negative.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision</a>
 *
 */
public interface PlotVbpVolumeDivisionOptions extends Any {
  /**
   * (Highstock) Option to control if volume is divided.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.enabled">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Option to control if volume is divided.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.enabled">https://api.highcharts.com/highstock/plotOptions.vbp.volumeDivision.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * @implspec styles?: PlotVbpVolumeDivisionStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotVbpVolumeDivisionStylesOptions getStyles();

  /**
   * @implspec styles?: PlotVbpVolumeDivisionStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotVbpVolumeDivisionStylesOptions value);
}
