package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Allows setting a set of rules to apply for
 * different screen or chart sizes. Each rule specifies additional chart
 * options.
 *
 * @see <a href="https://api.highcharts.com/highcharts/responsive">https://api.highcharts.com/highcharts/responsive</a>
 * @see <a href="https://api.highcharts.com/highstock/responsive">https://api.highcharts.com/highstock/responsive</a>
 * @see <a href="https://api.highcharts.com/highmaps/responsive">https://api.highcharts.com/highmaps/responsive</a>
 *
 */
public interface ResponsiveOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) A set of rules for responsive settings.
   * The rules are executed from the top down.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules">https://api.highcharts.com/highcharts/responsive.rules</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules">https://api.highcharts.com/highstock/responsive.rules</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules">https://api.highcharts.com/highmaps/responsive.rules</a>
   *
   * @implspec rules?: Array<ResponsiveRulesOptions>;
   *
   */
  @JSProperty("rules")
  @Nullable
  Array<ResponsiveRulesOptions> getRules();

  /**
   * (Highcharts, Highstock, Highmaps) A set of rules for responsive settings.
   * The rules are executed from the top down.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules">https://api.highcharts.com/highcharts/responsive.rules</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules">https://api.highcharts.com/highstock/responsive.rules</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules">https://api.highcharts.com/highmaps/responsive.rules</a>
   *
   * @implspec rules?: Array<ResponsiveRulesOptions>;
   *
   */
  @JSProperty("rules")
  void setRules(Array<ResponsiveRulesOptions> value);
}
