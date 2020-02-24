package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A collection of attributes for the button.
 * The object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>,
 * the border radius. The theme also supports <code>style</code>, a collection of CSS
 * properties for the text. Equivalent attributes for the hover state are given
 * in <code>theme.states.hover</code>.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.theme">https://api.highcharts.com/highcharts/chart.resetZoomButton.theme</a>
 * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.theme">https://api.highcharts.com/highstock/chart.resetZoomButton.theme</a>
 * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.theme">https://api.highcharts.com/highmaps/chart.resetZoomButton.theme</a>
 *
 */
public interface ChartResetZoomButtonThemeOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The Z index for the reset zoom button.
   * The default value places it below the tooltip that has Z index 7.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.theme.zIndex">https://api.highcharts.com/highcharts/chart.resetZoomButton.theme.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.theme.zIndex">https://api.highcharts.com/highstock/chart.resetZoomButton.theme.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.theme.zIndex">https://api.highcharts.com/highmaps/chart.resetZoomButton.theme.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Highmaps) The Z index for the reset zoom button.
   * The default value places it below the tooltip that has Z index 7.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.theme.zIndex">https://api.highcharts.com/highcharts/chart.resetZoomButton.theme.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.theme.zIndex">https://api.highcharts.com/highstock/chart.resetZoomButton.theme.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.theme.zIndex">https://api.highcharts.com/highmaps/chart.resetZoomButton.theme.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
