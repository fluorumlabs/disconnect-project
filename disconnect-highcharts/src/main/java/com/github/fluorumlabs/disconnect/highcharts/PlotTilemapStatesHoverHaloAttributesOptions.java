package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A collection of SVG attributes to override the
 * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.halo.attributes">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.halo.attributes</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.halo.attributes">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.halo.attributes</a>
 *
 */
public interface PlotTilemapStatesHoverHaloAttributesOptions extends Any {
  /**
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
