package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) The hover state for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover</a>
 *
 */
public interface PlotMapbubbleMarkerStatesHoverOptions extends Any {
  /**
   * (Highmaps) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMapbubbleMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highmaps) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMapbubbleMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highmaps) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMapbubbleMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highmaps) Animation when hovering over the marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotMapbubbleMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotMapbubbleMarkerStatesHoverAnimationOptions value);

  /**
   * (Highmaps) Enable or disable the point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.enabled">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highmaps) Enable or disable the point marker.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.enabled">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highmaps) The fill color of the marker in hover state. When <code>undefined</code>,
   * the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highmaps) The fill color of the marker in hover state. When <code>undefined</code>,
   * the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highmaps) The fill color of the marker in hover state. When <code>undefined</code>,
   * the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highmaps) The fill color of the marker in hover state. When <code>undefined</code>,
   * the series' or point's fillColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highmaps) The color of the point marker's outline. When <code>undefined</code>, the
   * series' or point's lineColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highmaps) The color of the point marker's outline. When <code>undefined</code>, the
   * series' or point's lineColor for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineColor">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highmaps) The width of the point marker's outline. When <code>undefined</code>, the
   * series' or point's lineWidth for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidth">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highmaps) The width of the point marker's outline. When <code>undefined</code>, the
   * series' or point's lineWidth for normal state is used.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidth">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highmaps) The additional line width for a hovered point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highmaps) The additional line width for a hovered point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  /**
   * (Highmaps) The radius of the point marker. In hover state, it defaults to
   * the normal state's radius + 2 as per the radiusPlus option.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radius">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highmaps) The radius of the point marker. In hover state, it defaults to
   * the normal state's radius + 2 as per the radiusPlus option.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radius">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highmaps) The number of pixels to increase the radius of the hovered
   * point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radiusPlus">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radiusPlus</a>
   *
   * @implspec radiusPlus?: number;
   *
   */
  @JSProperty("radiusPlus")
  double getRadiusPlus();

  /**
   * (Highmaps) The number of pixels to increase the radius of the hovered
   * point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radiusPlus">https://api.highcharts.com/highmaps/plotOptions.mapbubble.marker.states.hover.radiusPlus</a>
   *
   * @implspec radiusPlus?: number;
   *
   */
  @JSProperty("radiusPlus")
  void setRadiusPlus(double value);
}
