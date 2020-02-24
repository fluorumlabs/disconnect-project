package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph.states">https://api.highcharts.com/highcharts/plotOptions.streamgraph.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph.states">https://api.highcharts.com/highstock/plotOptions.streamgraph.states</a>
 *
 */
public interface PlotStreamgraphStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph.states.hover">https://api.highcharts.com/highcharts/plotOptions.streamgraph.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph.states.hover">https://api.highcharts.com/highstock/plotOptions.streamgraph.states.hover</a>
   *
   * @implspec hover?: PlotStreamgraphStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotStreamgraphStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph.states.hover">https://api.highcharts.com/highcharts/plotOptions.streamgraph.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph.states.hover">https://api.highcharts.com/highstock/plotOptions.streamgraph.states.hover</a>
   *
   * @implspec hover?: PlotStreamgraphStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotStreamgraphStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.normal">https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.normal</a>
   *
   * @implspec normal?: PlotStreamgraphStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotStreamgraphStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.normal">https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.normal</a>
   *
   * @implspec normal?: PlotStreamgraphStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotStreamgraphStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.select">https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.select</a>
   *
   * @implspec select?: PlotStreamgraphStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotStreamgraphStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.select">https://api.highcharts.com/highmaps/plotOptions.streamgraph.states.select</a>
   *
   * @implspec select?: PlotStreamgraphStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotStreamgraphStatesSelectOptions value);
}
