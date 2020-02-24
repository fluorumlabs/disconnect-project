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
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover</a>
 *
 */
public interface PlotCandlestickStatesHoverOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotCandlestickStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotCandlestickStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotCandlestickStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotCandlestickStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotCandlestickStatesHoverAnimationOptions value);

  /**
   * (Highcharts, Gantt) A specific border color for the hovered point.
   * Defaults to inherit the normal state border color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.borderColor">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.borderColor">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.borderColor">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.borderColor">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.candlestick.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.candlestick.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.candlestick.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.candlestick.states.hover.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.brightness">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.brightness">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.brightness</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.brightness">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.brightness">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.candlestick.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color">https://api.highcharts.com/gantt/plotOptions.candlestick.states.hover.color</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.enabled</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The pixel width of the line/border around the candlestick.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The pixel width of the line/border around the candlestick.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.candlestick.states.hover.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);
}
