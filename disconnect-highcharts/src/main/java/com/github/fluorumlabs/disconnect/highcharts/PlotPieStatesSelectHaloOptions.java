package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the halo appearing around the hovered
 * point in line- type series as well as outside the hovered slice in pie
 * charts. By default the halo is filled by the current point or series color
 * with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code>
 * option to <code>false</code>.
 *
 * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class, with
 * colors inherited from <code>.highcharts-color-{n}</code>.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo</a>
 *
 */
public interface PlotPieStatesSelectHaloOptions extends Any {
  /**
   * (Highcharts, Highstock) A collection of SVG attributes to override the
   * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.attributes">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.attributes</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.attributes">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.attributes</a>
   *
   * @implspec attributes?: SVGAttributes;
   *
   */
  @JSProperty("attributes")
  @Nullable
  SVGAttributes getAttributes();

  /**
   * (Highcharts, Highstock) A collection of SVG attributes to override the
   * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.attributes">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.attributes</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.attributes">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.attributes</a>
   *
   * @implspec attributes?: SVGAttributes;
   *
   */
  @JSProperty("attributes")
  void setAttributes(SVGAttributes value);

  /**
   * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
   * overridden using the <code>attributes</code> setting. Note that Highcharts is only
   * able to apply opacity to colors of hex or rgb(a) formats.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.opacity">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.opacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.opacity">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.opacity</a>
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
   * overridden using the <code>attributes</code> setting. Note that Highcharts is only
   * able to apply opacity to colors of hex or rgb(a) formats.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.opacity">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.opacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.opacity">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.opacity</a>
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts, Highstock) The pixel size of the halo. For point markers
   * this is the radius of the halo. For pie slices it is the width of the
   * halo outside the slice. For bubbles it defaults to 5 and is the width of
   * the halo outside the bubble.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.size">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.size</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.size">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts, Highstock) The pixel size of the halo. For point markers
   * this is the radius of the halo. For pie slices it is the width of the
   * halo outside the slice. For bubbles it defaults to 5 and is the width of
   * the halo outside the bubble.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.size">https://api.highcharts.com/highcharts/plotOptions.pie.states.select.halo.size</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.size">https://api.highcharts.com/highstock/plotOptions.pie.states.select.halo.size</a>
   *
   * @implspec size?: number;
   *
   */
  @JSProperty("size")
  void setSize(double value);
}
