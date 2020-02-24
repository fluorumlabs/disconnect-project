package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The hover state for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover</a>
 * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover</a>
 *
 */
public interface SeriesGanttDataMarkerStatesHoverOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Animation when hovering over the
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|SeriesGanttDataMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps) Animation when hovering over the
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|SeriesGanttDataMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(SeriesGanttDataMarkerStatesHoverAnimationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Animation when hovering over the
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|SeriesGanttDataMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Animation when hovering over the
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|SeriesGanttDataMarkerStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.enabled">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.enabled">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.enabled">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.enabled">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.enabled">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.enabled">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The fill color of the marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.fillColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the point marker's
   * outline. When <code>undefined</code>, the series' or point's lineColor for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineColor">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineColor">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineColor">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the point marker's
   * outline. When <code>undefined</code>, the series' or point's lineColor for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineColor">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineColor">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineColor">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the point marker's
   * outline. When <code>undefined</code>, the series' or point's lineWidth for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidth">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidth">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidth">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the point marker's
   * outline. When <code>undefined</code>, the series' or point's lineWidth for normal
   * state is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidth">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidth">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidth">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The additional line width for a hovered
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highcharts, Highstock, Highmaps) The additional line width for a hovered
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidthPlus">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the point marker. In
   * hover state, it defaults to the normal state's radius + 2 as per the
   * radiusPlus option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radius">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radius">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radius</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radius">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the point marker. In
   * hover state, it defaults to the normal state's radius + 2 as per the
   * radiusPlus option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radius">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radius</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radius">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radius</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radius">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radius</a>
   *
   * @implspec radius?: number;
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The number of pixels to increase the
   * radius of the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radiusPlus">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radiusPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radiusPlus">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radiusPlus</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radiusPlus">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radiusPlus</a>
   *
   * @implspec radiusPlus?: number;
   *
   */
  @JSProperty("radiusPlus")
  double getRadiusPlus();

  /**
   * (Highcharts, Highstock, Highmaps) The number of pixels to increase the
   * radius of the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radiusPlus">https://api.highcharts.com/highcharts/series.gantt.data.marker.states.hover.radiusPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radiusPlus">https://api.highcharts.com/highstock/series.gantt.data.marker.states.hover.radiusPlus</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radiusPlus">https://api.highcharts.com/highmaps/series.gantt.data.marker.states.hover.radiusPlus</a>
   *
   * @implspec radiusPlus?: number;
   *
   */
  @JSProperty("radiusPlus")
  void setRadiusPlus(double value);
}
