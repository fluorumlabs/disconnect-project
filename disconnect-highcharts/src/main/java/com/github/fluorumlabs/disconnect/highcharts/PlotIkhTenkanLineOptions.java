package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Tenkan line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.tenkanLine">https://api.highcharts.com/highstock/plotOptions.ikh.tenkanLine</a>
 *
 */
public interface PlotIkhTenkanLineOptions extends Any {
  /**
   * @implspec styles?: PlotIkhTenkanLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotIkhTenkanLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotIkhTenkanLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotIkhTenkanLineStylesOptions value);
}
