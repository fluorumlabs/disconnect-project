package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the series states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel.states">https://api.highcharts.com/highcharts/plotOptions.funnel.states</a>
 *
 */
public interface PlotFunnelStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel.states.hover">https://api.highcharts.com/highcharts/plotOptions.funnel.states.hover</a>
   *
   * @implspec hover?: PlotFunnelStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotFunnelStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel.states.hover">https://api.highcharts.com/highcharts/plotOptions.funnel.states.hover</a>
   *
   * @implspec hover?: PlotFunnelStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotFunnelStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.funnel.states.normal">https://api.highcharts.com/highmaps/plotOptions.funnel.states.normal</a>
   *
   * @implspec normal?: PlotFunnelStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotFunnelStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.funnel.states.normal">https://api.highcharts.com/highmaps/plotOptions.funnel.states.normal</a>
   *
   * @implspec normal?: PlotFunnelStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotFunnelStatesNormalOptions value);

  /**
   * (Highmaps) Options for a selected funnel item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.funnel.states.select">https://api.highcharts.com/highmaps/plotOptions.funnel.states.select</a>
   *
   * @implspec select?: PlotFunnelStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotFunnelStatesSelectOptions getSelect();

  /**
   * (Highmaps) Options for a selected funnel item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.funnel.states.select">https://api.highcharts.com/highmaps/plotOptions.funnel.states.select</a>
   *
   * @implspec select?: PlotFunnelStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotFunnelStatesSelectOptions value);
}
