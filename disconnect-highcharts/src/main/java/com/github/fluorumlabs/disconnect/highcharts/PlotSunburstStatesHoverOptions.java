package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the hovered series. These settings override the
 * normal state options when a series is moused over or touched.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover</a>
 *
 */
public interface PlotSunburstStatesHoverOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotSunburstStatesHoverAnimationOptions value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highmaps) The border color of the point in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderColor">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps) The border color of the point in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderColor">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) How much to brighten the point on interaction. Requires the
   * main color to be defined in hex or rgb(a) format.
   *
   * In styled mode, the hover brightness is by default replaced by a
   * fill-opacity given in the <code>.highcharts-point-hover</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  double getBrightness();

  /**
   * (Highcharts) How much to brighten the point on interaction. Requires the
   * main color to be defined in hex or rgb(a) format.
   *
   * In styled mode, the hover brightness is by default replaced by a
   * fill-opacity given in the <code>.highcharts-point-hover</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.brightness">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.enabled">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.enabled">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) Options for the halo appearing around the hovered
   * point in line- type series as well as outside the hovered slice in pie
   * charts. By default the halo is filled by the current point or series
   * color with an opacity of 0.25. The halo can be disabled by setting the
   * <code>halo</code> option to <code>false</code>.
   *
   * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
   * with colors inherited from <code>.highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.sunburst.states.hover.halo</a>
   *
   * @implspec halo?: PlotSunburstStatesHoverHaloOptions;
   *
   */
  @JSProperty("halo")
  @Nullable
  PlotSunburstStatesHoverHaloOptions getHalo();

  /**
   * (Highcharts, Highstock) Options for the halo appearing around the hovered
   * point in line- type series as well as outside the hovered slice in pie
   * charts. By default the halo is filled by the current point or series
   * color with an opacity of 0.25. The halo can be disabled by setting the
   * <code>halo</code> option to <code>false</code>.
   *
   * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
   * with colors inherited from <code>.highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.sunburst.states.hover.halo</a>
   *
   * @implspec halo?: PlotSunburstStatesHoverHaloOptions;
   *
   */
  @JSProperty("halo")
  void setHalo(PlotSunburstStatesHoverHaloOptions value);
}
