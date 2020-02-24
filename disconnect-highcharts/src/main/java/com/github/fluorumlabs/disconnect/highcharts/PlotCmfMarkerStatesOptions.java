package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states</a>
 *
 */
public interface PlotCmfMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.hover</a>
   *
   * @implspec hover?: PlotCmfMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotCmfMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.hover</a>
   *
   * @implspec hover?: PlotCmfMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotCmfMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.normal</a>
   *
   * @implspec normal?: PlotCmfMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotCmfMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.normal</a>
   *
   * @implspec normal?: PlotCmfMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotCmfMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.select">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.select</a>
   *
   * @implspec select?: PlotCmfMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotCmfMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.select">https://api.highcharts.com/highstock/plotOptions.cmf.marker.states.select</a>
   *
   * @implspec select?: PlotCmfMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotCmfMarkerStatesSelectOptions value);
}
