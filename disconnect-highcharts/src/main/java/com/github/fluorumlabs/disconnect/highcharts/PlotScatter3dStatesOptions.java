package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states</a>
 *
 */
public interface PlotScatter3dStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatter3dStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatter3dStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.normal">https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatter3dStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.normal">https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatter3dStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.select">https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.select</a>
   *
   * @implspec select?: PlotScatter3dStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatter3dStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.select">https://api.highcharts.com/highmaps/plotOptions.scatter3d.states.select</a>
   *
   * @implspec select?: PlotScatter3dStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatter3dStatesSelectOptions value);
}
