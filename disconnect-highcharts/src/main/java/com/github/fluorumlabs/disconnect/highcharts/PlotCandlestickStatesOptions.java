package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states">https://api.highcharts.com/highstock/plotOptions.candlestick.states</a>
 *
 */
public interface PlotCandlestickStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered point. These settings override the
   * normal state options when a point is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover</a>
   *
   * @implspec hover?: PlotCandlestickStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotCandlestickStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered point. These settings override the
   * normal state options when a point is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover</a>
   *
   * @implspec hover?: PlotCandlestickStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotCandlestickStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.candlestick.states.normal">https://api.highcharts.com/highmaps/plotOptions.candlestick.states.normal</a>
   *
   * @implspec normal?: PlotCandlestickStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotCandlestickStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.candlestick.states.normal">https://api.highcharts.com/highmaps/plotOptions.candlestick.states.normal</a>
   *
   * @implspec normal?: PlotCandlestickStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotCandlestickStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.select">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.select">https://api.highcharts.com/highstock/plotOptions.candlestick.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.select">https://api.highcharts.com/gantt/plotOptions.candlestick.states.select</a>
   *
   * @implspec select?: PlotCandlestickStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotCandlestickStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.select">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.select">https://api.highcharts.com/highstock/plotOptions.candlestick.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.select">https://api.highcharts.com/gantt/plotOptions.candlestick.states.select</a>
   *
   * @implspec select?: PlotCandlestickStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotCandlestickStatesSelectOptions value);
}
