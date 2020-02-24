package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for the hovered point. These settings override the normal
 * state options when a point is moused over or touched.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover">https://api.highcharts.com/highstock/plotOptions.flags.states.hover</a>
 *
 */
public interface PlotFlagsStatesHoverOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotFlagsStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotFlagsStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotFlagsStatesHoverAnimationOptions value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotFlagsStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotFlagsStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Gantt) A specific border color for the hovered point.
   * Defaults to inherit the normal state border color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.borderColor">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.borderColor">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Gantt) A specific border color for the hovered point.
   * Defaults to inherit the normal state border color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.borderColor">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.borderColor">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.flags.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.flags.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.flags.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.flags.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) How much to brighten the point on
   * interaction. Requires the main color to be defined in hex or rgb(a)
   * format.
   *
   * In styled mode, the hover brightening is by default replaced with a
   * fill-opacity set in the <code>.highcharts-point:hover</code> rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.brightness">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.brightness">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  double getBrightness();

  /**
   * (Highcharts, Highstock, Gantt) How much to brighten the point on
   * interaction. Requires the main color to be defined in hex or rgb(a)
   * format.
   *
   * In styled mode, the hover brightening is by default replaced with a
   * fill-opacity set in the <code>.highcharts-point:hover</code> rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.brightness">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.brightness">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.flags.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color">https://api.highcharts.com/gantt/plotOptions.flags.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highstock) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The fill or background color of the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highstock) The fill or background color of the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highstock) The fill or background color of the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.fillColor">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highstock) The color of the line/border of the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.lineColor">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) The color of the line/border of the flag.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover.lineColor">https://api.highcharts.com/highstock/plotOptions.flags.states.hover.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);
}
