package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states">https://api.highcharts.com/highcharts/plotOptions.tilemap.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states">https://api.highcharts.com/highmaps/plotOptions.tilemap.states</a>
 *
 */
public interface PlotTilemapStatesOptions extends Any {
  /**
   * (Highcharts, Highmaps) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states.hover">https://api.highcharts.com/highmaps/plotOptions.tilemap.states.hover</a>
   *
   * @implspec hover?: PlotTilemapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotTilemapStatesHoverOptions getHover();

  /**
   * (Highcharts, Highmaps) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states.hover">https://api.highcharts.com/highmaps/plotOptions.tilemap.states.hover</a>
   *
   * @implspec hover?: PlotTilemapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotTilemapStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states.normal">https://api.highcharts.com/highmaps/plotOptions.tilemap.states.normal</a>
   *
   * @implspec normal?: PlotTilemapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotTilemapStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states.normal">https://api.highcharts.com/highmaps/plotOptions.tilemap.states.normal</a>
   *
   * @implspec normal?: PlotTilemapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotTilemapStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states.select">https://api.highcharts.com/highmaps/plotOptions.tilemap.states.select</a>
   *
   * @implspec select?: PlotTilemapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotTilemapStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap.states.select">https://api.highcharts.com/highmaps/plotOptions.tilemap.states.select</a>
   *
   * @implspec select?: PlotTilemapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotTilemapStatesSelectOptions value);
}
