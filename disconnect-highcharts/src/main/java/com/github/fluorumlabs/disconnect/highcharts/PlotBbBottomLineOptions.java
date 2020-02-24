package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Bottom line options.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.bottomLine">https://api.highcharts.com/highstock/plotOptions.bb.bottomLine</a>
 *
 */
public interface PlotBbBottomLineOptions extends Any {
  /**
   * (Highstock) Styles for a bottom line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.bottomLine.styles">https://api.highcharts.com/highstock/plotOptions.bb.bottomLine.styles</a>
   *
   * @implspec styles?: PlotBbBottomLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotBbBottomLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a bottom line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.bottomLine.styles">https://api.highcharts.com/highstock/plotOptions.bb.bottomLine.styles</a>
   *
   * @implspec styles?: PlotBbBottomLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotBbBottomLineStylesOptions value);
}
