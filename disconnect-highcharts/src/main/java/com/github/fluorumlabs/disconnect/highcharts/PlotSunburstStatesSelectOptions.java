package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Specific options for point in selected states, after being
 * selected by allowPointSelect or programmatically.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select</a>
 *
 */
public interface PlotSunburstStatesSelectOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotSunburstStatesSelectAnimationOptions value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstStatesSelectAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highmaps) The border color of the point in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderColor">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderColor">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderWidth">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderWidth">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highmaps) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend. .
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.enabled">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.enabled</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.enabled">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select.enabled</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.halo">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.halo">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.halo</a>
   *
   * @implspec halo?: PlotSunburstStatesSelectHaloOptions;
   *
   */
  @JSProperty("halo")
  @Nullable
  PlotSunburstStatesSelectHaloOptions getHalo();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.halo">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.halo">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.halo</a>
   *
   * @implspec halo?: PlotSunburstStatesSelectHaloOptions;
   *
   */
  @JSProperty("halo")
  void setHalo(PlotSunburstStatesSelectHaloOptions value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidth">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidth">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidth">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidth">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The additional line width for the graph of a
   * hovered series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidthPlus">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highcharts, Highstock) The additional line width for the graph of a
   * hovered series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidthPlus">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.lineWidthPlus</a>
   *
   * @implspec lineWidthPlus?: number;
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  /**
   * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
   * belonging to the hovered series. For settings on the hover state of the
   * individual point, see marker.states.hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.marker">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.marker">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.marker</a>
   *
   * @implspec marker?: PlotSunburstStatesSelectMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotSunburstStatesSelectMarkerOptions getMarker();

  /**
   * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
   * belonging to the hovered series. For settings on the hover state of the
   * individual point, see marker.states.hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.marker">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.select.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.marker">https://api.highcharts.com/highstock/plotOptions.sunburst.states.select.marker</a>
   *
   * @implspec marker?: PlotSunburstStatesSelectMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotSunburstStatesSelectMarkerOptions value);
}
