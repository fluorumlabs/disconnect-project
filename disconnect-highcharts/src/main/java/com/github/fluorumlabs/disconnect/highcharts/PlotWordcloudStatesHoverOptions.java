package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Options for the hovered point. These settings
 * override the normal state options when a point is moused over or touched.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover</a>
 *
 */
public interface PlotWordcloudStatesHoverOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWordcloudStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWordcloudStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWordcloudStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotWordcloudStatesHoverAnimationOptions value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotWordcloudStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Gantt) A specific border color for the hovered point.
   * Defaults to inherit the normal state border color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.borderColor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.borderColor">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.borderColor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.borderColor">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.hover.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.brightness">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.brightness">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.brightness</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.brightness">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.brightness</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.brightness">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Gantt) A specific color for the hovered point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
   * series to visualize that the user hovers either the series itself or the
   * legend. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.enabled">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.enabled">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
   * series to visualize that the user hovers either the series itself or the
   * legend. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.enabled">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.enabled">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover.enabled</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.enabled">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);
}
