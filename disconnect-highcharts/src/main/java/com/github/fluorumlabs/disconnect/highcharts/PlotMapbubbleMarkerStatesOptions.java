package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states</a>
 *
 */
public interface PlotMapbubbleMarkerStatesOptions extends Any {
  /**
   * (Highmaps) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover</a>
   *
   * @implspec hover?: PlotMapbubbleMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMapbubbleMarkerStatesHoverOptions getHover();

  /**
   * (Highmaps) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover</a>
   *
   * @implspec hover?: PlotMapbubbleMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMapbubbleMarkerStatesHoverOptions value);

  /**
   * (Highmaps) The normal state of a single point marker. Currently only used
   * for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.normal</a>
   *
   * @implspec normal?: PlotMapbubbleMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMapbubbleMarkerStatesNormalOptions getNormal();

  /**
   * (Highmaps) The normal state of a single point marker. Currently only used
   * for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.normal</a>
   *
   * @implspec normal?: PlotMapbubbleMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMapbubbleMarkerStatesNormalOptions value);

  /**
   * (Highmaps) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select</a>
   *
   * @implspec select?: PlotMapbubbleMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMapbubbleMarkerStatesSelectOptions getSelect();

  /**
   * (Highmaps) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.select</a>
   *
   * @implspec select?: PlotMapbubbleMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMapbubbleMarkerStatesSelectOptions value);
}
