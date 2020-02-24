package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Under which conditions the rule applies.
 *
 * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition">https://api.highcharts.com/highcharts/responsive.rules.condition</a>
 * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition">https://api.highcharts.com/highstock/responsive.rules.condition</a>
 * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition">https://api.highcharts.com/highmaps/responsive.rules.condition</a>
 *
 */
public interface ResponsiveRulesConditionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) A callback function to gain complete
   * control on when the responsive rule applies. Return <code>true</code> if it applies.
   * This opens for checking against other metrics than the chart size, or
   * example the document size or other elements.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.callback">https://api.highcharts.com/highcharts/responsive.rules.condition.callback</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.callback">https://api.highcharts.com/highstock/responsive.rules.condition.callback</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.callback">https://api.highcharts.com/highmaps/responsive.rules.condition.callback</a>
   *
   * @implspec callback?: ResponsiveCallbackFunction;
   *
   */
  @JSProperty("callback")
  @Nullable
  ResponsiveCallbackFunction getCallback();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to gain complete
   * control on when the responsive rule applies. Return <code>true</code> if it applies.
   * This opens for checking against other metrics than the chart size, or
   * example the document size or other elements.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.callback">https://api.highcharts.com/highcharts/responsive.rules.condition.callback</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.callback">https://api.highcharts.com/highstock/responsive.rules.condition.callback</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.callback">https://api.highcharts.com/highmaps/responsive.rules.condition.callback</a>
   *
   * @implspec callback?: ResponsiveCallbackFunction;
   *
   */
  @JSProperty("callback")
  void setCallback(ResponsiveCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart height is less than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.maxHeight">https://api.highcharts.com/highcharts/responsive.rules.condition.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.maxHeight">https://api.highcharts.com/highstock/responsive.rules.condition.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.maxHeight">https://api.highcharts.com/highmaps/responsive.rules.condition.maxHeight</a>
   *
   * @implspec maxHeight?: number;
   *
   */
  @JSProperty("maxHeight")
  double getMaxHeight();

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart height is less than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.maxHeight">https://api.highcharts.com/highcharts/responsive.rules.condition.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.maxHeight">https://api.highcharts.com/highstock/responsive.rules.condition.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.maxHeight">https://api.highcharts.com/highmaps/responsive.rules.condition.maxHeight</a>
   *
   * @implspec maxHeight?: number;
   *
   */
  @JSProperty("maxHeight")
  void setMaxHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart width is less than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.maxWidth">https://api.highcharts.com/highcharts/responsive.rules.condition.maxWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.maxWidth">https://api.highcharts.com/highstock/responsive.rules.condition.maxWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.maxWidth">https://api.highcharts.com/highmaps/responsive.rules.condition.maxWidth</a>
   *
   * @implspec maxWidth?: number;
   *
   */
  @JSProperty("maxWidth")
  double getMaxWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart width is less than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.maxWidth">https://api.highcharts.com/highcharts/responsive.rules.condition.maxWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.maxWidth">https://api.highcharts.com/highstock/responsive.rules.condition.maxWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.maxWidth">https://api.highcharts.com/highmaps/responsive.rules.condition.maxWidth</a>
   *
   * @implspec maxWidth?: number;
   *
   */
  @JSProperty("maxWidth")
  void setMaxWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart height is greater than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.minHeight">https://api.highcharts.com/highcharts/responsive.rules.condition.minHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.minHeight">https://api.highcharts.com/highstock/responsive.rules.condition.minHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.minHeight">https://api.highcharts.com/highmaps/responsive.rules.condition.minHeight</a>
   *
   * @implspec minHeight?: number;
   *
   */
  @JSProperty("minHeight")
  double getMinHeight();

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart height is greater than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.minHeight">https://api.highcharts.com/highcharts/responsive.rules.condition.minHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.minHeight">https://api.highcharts.com/highstock/responsive.rules.condition.minHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.minHeight">https://api.highcharts.com/highmaps/responsive.rules.condition.minHeight</a>
   *
   * @implspec minHeight?: number;
   *
   */
  @JSProperty("minHeight")
  void setMinHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart width is greater than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.minWidth">https://api.highcharts.com/highcharts/responsive.rules.condition.minWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.minWidth">https://api.highcharts.com/highstock/responsive.rules.condition.minWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.minWidth">https://api.highcharts.com/highmaps/responsive.rules.condition.minWidth</a>
   *
   * @implspec minWidth?: number;
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The responsive rule applies if the
   * chart width is greater than this.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive.rules.condition.minWidth">https://api.highcharts.com/highcharts/responsive.rules.condition.minWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive.rules.condition.minWidth">https://api.highcharts.com/highstock/responsive.rules.condition.minWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive.rules.condition.minWidth">https://api.highcharts.com/highmaps/responsive.rules.condition.minWidth</a>
   *
   * @implspec minWidth?: number;
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);
}
