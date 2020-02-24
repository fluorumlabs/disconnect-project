package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A set of rules for responsive settings. The
 * rules are executed from the top down.
 *
 * @see <a href="https://api.highcharts.com/highcharts/responsive.rules">https://api.highcharts.com/highcharts/responsive.rules</a>
 * @see <a href="https://api.highcharts.com/highstock/responsive.rules">https://api.highcharts.com/highstock/responsive.rules</a>
 * @see <a href="https://api.highcharts.com/highmaps/responsive.rules">https://api.highcharts.com/highmaps/responsive.rules</a>
 *
 */
public interface ResponsiveRulesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) A full set of chart options to apply as
   * overrides to the general chart options. The chart options are applied
   * when the given rule is active.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the item of the same indexupdated. So for
   * example, setting <code>chartOptions</code> with two series items without an <code>id</code>,
   * will cause the existing chart's two series to be updated with respective
   * options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.chartOptions">https://api.highcharts.com/highcharts/responsive.rules.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.chartOptions">https://api.highcharts.com/highstock/responsive.rules.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.chartOptions">https://api.highcharts.com/highmaps/responsive.rules.chartOptions</a>
   *
   * @implspec chartOptions?: Options;
   *
   */
  @JSProperty("chartOptions")
  @Nullable
  Options getChartOptions();

  /**
   * (Highcharts, Highstock, Highmaps) A full set of chart options to apply as
   * overrides to the general chart options. The chart options are applied
   * when the given rule is active.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the item of the same indexupdated. So for
   * example, setting <code>chartOptions</code> with two series items without an <code>id</code>,
   * will cause the existing chart's two series to be updated with respective
   * options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.chartOptions">https://api.highcharts.com/highcharts/responsive.rules.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.chartOptions">https://api.highcharts.com/highstock/responsive.rules.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.chartOptions">https://api.highcharts.com/highmaps/responsive.rules.chartOptions</a>
   *
   * @implspec chartOptions?: Options;
   *
   */
  @JSProperty("chartOptions")
  void setChartOptions(Options value);

  /**
   * (Highcharts, Highstock, Highmaps) Under which conditions the rule
   * applies.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition">https://api.highcharts.com/highcharts/responsive.rules.condition</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition">https://api.highcharts.com/highstock/responsive.rules.condition</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition">https://api.highcharts.com/highmaps/responsive.rules.condition</a>
   *
   * @implspec condition?: ResponsiveRulesConditionOptions;
   *
   */
  @JSProperty("condition")
  @Nullable
  ResponsiveRulesConditionOptions getCondition();

  /**
   * (Highcharts, Highstock, Highmaps) Under which conditions the rule
   * applies.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition">https://api.highcharts.com/highcharts/responsive.rules.condition</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition">https://api.highcharts.com/highstock/responsive.rules.condition</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition">https://api.highcharts.com/highmaps/responsive.rules.condition</a>
   *
   * @implspec condition?: ResponsiveRulesConditionOptions;
   *
   */
  @JSProperty("condition")
  void setCondition(ResponsiveRulesConditionOptions value);
}
