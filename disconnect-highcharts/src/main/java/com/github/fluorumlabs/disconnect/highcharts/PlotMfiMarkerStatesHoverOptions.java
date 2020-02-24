package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The hover state for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover</a>
 *
 */
public interface PlotMfiMarkerStatesHoverOptions extends Any {
  /**
   * (Highstock) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMfiMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highstock) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMfiMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highstock) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMfiMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotMfiMarkerStatesHoverAnimationOptions value);

  /**
   * (Highstock) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMfiMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highstock) Enable or disable the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highstock) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's lineColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineColor">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) The color of the point marker's outline. When <code>undefined</code>,
   * the series' or point's lineColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineColor">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) The width of the point marker's outline. When <code>undefined</code>,
   * the series' or point's lineWidth for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The width of the point marker's outline. When <code>undefined</code>,
   * the series' or point's lineWidth for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) The additional line width for a hovered point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highstock) The additional line width for a hovered point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  /**
   * (Highstock) The radius of the point marker. In hover state, it defaults
   * to the normal state's radius + 2 as per the radiusPlus option.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radius">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highstock) The radius of the point marker. In hover state, it defaults
   * to the normal state's radius + 2 as per the radiusPlus option.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radius">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highstock) The number of pixels to increase the radius of the hovered
   * point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radiusPlus">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radiusPlus</a>
   *
   * @implspec radiusPlus?: number;
   *
   */
  @JSProperty("radiusPlus")
  double getRadiusPlus();

  /**
   * (Highstock) The number of pixels to increase the radius of the hovered
   * point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radiusPlus">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover.radiusPlus</a>
   *
   * @implspec radiusPlus?: number;
   *
   */
  @JSProperty("radiusPlus")
  void setRadiusPlus(double value);
}
