package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.dragDrop.guideBox">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.dragDrop.guideBox</a>
 *
 */
public interface PlotPriceenvelopesDragDropGuideBoxOptions extends Any {
  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotPriceenvelopesDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  @Nullable
  PlotPriceenvelopesDragDropGuideBoxDefaultOptions getDefault();

  /**
   * (Highstock) Style options for the guide box default state.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.dragDrop.guideBox.default">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.dragDrop.guideBox.default</a>
   *
   * @implspec default?: PlotPriceenvelopesDragDropGuideBoxDefaultOptions;
   *
   */
  @JSProperty("default")
  void setDefault(PlotPriceenvelopesDragDropGuideBoxDefaultOptions value);
}
