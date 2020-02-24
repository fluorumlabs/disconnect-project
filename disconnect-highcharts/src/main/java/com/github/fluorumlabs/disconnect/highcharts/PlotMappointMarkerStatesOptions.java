package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states</a>
 *
 */
public interface PlotMappointMarkerStatesOptions extends Any {
  /**
   * (Highmaps) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.hover</a>
   *
   * @implspec hover?: PlotMappointMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMappointMarkerStatesHoverOptions getHover();

  /**
   * (Highmaps) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.hover</a>
   *
   * @implspec hover?: PlotMappointMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMappointMarkerStatesHoverOptions value);

  /**
   * (Highmaps) The normal state of a single point marker. Currently only used
   * for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal</a>
   *
   * @implspec normal?: PlotMappointMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMappointMarkerStatesNormalOptions getNormal();

  /**
   * (Highmaps) The normal state of a single point marker. Currently only used
   * for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal</a>
   *
   * @implspec normal?: PlotMappointMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMappointMarkerStatesNormalOptions value);

  /**
   * (Highmaps) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.select</a>
   *
   * @implspec select?: PlotMappointMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMappointMarkerStatesSelectOptions getSelect();

  /**
   * (Highmaps) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.select</a>
   *
   * @implspec select?: PlotMappointMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMappointMarkerStatesSelectOptions value);
}
