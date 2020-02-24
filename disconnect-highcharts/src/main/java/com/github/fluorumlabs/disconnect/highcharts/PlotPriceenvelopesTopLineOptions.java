package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Top line options.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.topLine">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.topLine</a>
 *
 */
public interface PlotPriceenvelopesTopLineOptions extends Any {
  /**
   * @implspec styles?: PlotPriceenvelopesTopLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotPriceenvelopesTopLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotPriceenvelopesTopLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotPriceenvelopesTopLineStylesOptions value);
}
