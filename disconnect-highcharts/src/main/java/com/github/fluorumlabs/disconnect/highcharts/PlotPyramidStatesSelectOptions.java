package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Options for a selected funnel item.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select</a>
 *
 */
public interface PlotPyramidStatesSelectOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPyramidStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPyramidStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotPyramidStatesSelectAnimationOptions value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPyramidStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPyramidStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highmaps) A specific border color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderColor">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps) A specific border color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderColor">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderWidth">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderWidth">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highmaps) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.color">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highmaps) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.color">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) A specific color for the selected point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.color">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.enabled">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highmaps) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.enabled">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);
}
