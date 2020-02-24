package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Keyboard navigation for the legend.
 * Requires the Accessibility module.
 *
 * @see <a href="https://api.highcharts.com/highcharts/legend.keyboardNavigation">https://api.highcharts.com/highcharts/legend.keyboardNavigation</a>
 * @see <a href="https://api.highcharts.com/highstock/legend.keyboardNavigation">https://api.highcharts.com/highstock/legend.keyboardNavigation</a>
 * @see <a href="https://api.highcharts.com/highmaps/legend.keyboardNavigation">https://api.highcharts.com/highmaps/legend.keyboardNavigation</a>
 *
 */
public interface LegendKeyboardNavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Enable/disable keyboard navigation for
   * the legend. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.keyboardNavigation.enabled">https://api.highcharts.com/highcharts/legend.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.keyboardNavigation.enabled">https://api.highcharts.com/highstock/legend.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.keyboardNavigation.enabled">https://api.highcharts.com/highmaps/legend.keyboardNavigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable/disable keyboard navigation for
   * the legend. Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.keyboardNavigation.enabled">https://api.highcharts.com/highcharts/legend.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.keyboardNavigation.enabled">https://api.highcharts.com/highstock/legend.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.keyboardNavigation.enabled">https://api.highcharts.com/highmaps/legend.keyboardNavigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);
}
