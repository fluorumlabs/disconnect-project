package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Bottom line options.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine</a>
 *
 */
public interface PlotPriceenvelopesBottomLineOptions extends Any {
  /**
   * @implspec styles?: PlotPriceenvelopesBottomLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotPriceenvelopesBottomLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotPriceenvelopesBottomLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotPriceenvelopesBottomLineStylesOptions value);
}
