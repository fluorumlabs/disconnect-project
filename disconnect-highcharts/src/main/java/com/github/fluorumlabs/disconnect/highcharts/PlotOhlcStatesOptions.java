package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.states">https://api.highcharts.com/highstock/plotOptions.ohlc.states</a>
 *
 */
public interface PlotOhlcStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered point. These settings override the
   * normal state options when a point is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.states.hover">https://api.highcharts.com/highstock/plotOptions.ohlc.states.hover</a>
   *
   * @implspec hover?: PlotOhlcStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotOhlcStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered point. These settings override the
   * normal state options when a point is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.states.hover">https://api.highcharts.com/highstock/plotOptions.ohlc.states.hover</a>
   *
   * @implspec hover?: PlotOhlcStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotOhlcStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ohlc.states.normal">https://api.highcharts.com/highmaps/plotOptions.ohlc.states.normal</a>
   *
   * @implspec normal?: PlotOhlcStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotOhlcStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ohlc.states.normal">https://api.highcharts.com/highmaps/plotOptions.ohlc.states.normal</a>
   *
   * @implspec normal?: PlotOhlcStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotOhlcStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ohlc.states.select">https://api.highcharts.com/highcharts/plotOptions.ohlc.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.states.select">https://api.highcharts.com/highstock/plotOptions.ohlc.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.ohlc.states.select">https://api.highcharts.com/gantt/plotOptions.ohlc.states.select</a>
   *
   * @implspec select?: PlotOhlcStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotOhlcStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ohlc.states.select">https://api.highcharts.com/highcharts/plotOptions.ohlc.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc.states.select">https://api.highcharts.com/highstock/plotOptions.ohlc.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.ohlc.states.select">https://api.highcharts.com/gantt/plotOptions.ohlc.states.select</a>
   *
   * @implspec select?: PlotOhlcStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotOhlcStatesSelectOptions value);
}
