package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the hovered series
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover</a>
 *
 */
public interface PlotTreemapStatesHoverOptions extends Any {
  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotTreemapStatesHoverAnimationOptions value);

  /**
   * (Highcharts) Animation setting for hovering the graph in line-type
   * series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotTreemapStatesHoverAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highmaps) The border color for the hovered state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderColor">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderColor</a>
   *
   * @implspec borderColor?: string;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps) The border color for the hovered state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderColor">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderColor</a>
   *
   * @implspec borderColor?: string;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderWidth">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highmaps) Brightness for the hovered point. Defaults to 0 if the heatmap
   * series is loaded first, otherwise 0.1.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.brightness">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  double getBrightness();

  /**
   * (Highmaps) Brightness for the hovered point. Defaults to 0 if the heatmap
   * series is loaded first, otherwise 0.1.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.brightness">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.brightness</a>
   *
   * @implspec brightness?: number;
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color">https://api.highcharts.com/highmaps/plotOptions.treemap.states.hover.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.enabled">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.enabled</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.enabled">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.enabled</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.halo</a>
   *
   * @implspec halo?: (boolean|PlotTreemapStatesHoverHaloOptions);
   *
   */
  @JSProperty("halo")
  @Nullable
  Unknown getHalo();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.halo</a>
   *
   * @implspec halo?: (boolean|PlotTreemapStatesHoverHaloOptions);
   *
   */
  @JSProperty("halo")
  void setHalo(boolean value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.halo">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.halo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.halo">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.halo</a>
   *
   * @implspec halo?: (boolean|PlotTreemapStatesHoverHaloOptions);
   *
   */
  @JSProperty("halo")
  void setHalo(PlotTreemapStatesHoverHaloOptions value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidth">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidthPlus">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidthPlus</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidthPlus">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.lineWidthPlus</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidthPlus">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.lineWidthPlus</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker</a>
   *
   * @implspec marker?: PlotTreemapStatesHoverMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotTreemapStatesHoverMarkerOptions getMarker();

  /**
   * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
   * belonging to the hovered series. For settings on the hover state of the
   * individual point, see marker.states.hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.marker</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker">https://api.highcharts.com/highstock/plotOptions.treemap.states.hover.marker</a>
   *
   * @implspec marker?: PlotTreemapStatesHoverMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotTreemapStatesHoverMarkerOptions value);

  /**
   * (Highcharts) The opacity of a point in treemap. When a point has
   * children, the visibility of the children is determined by the opacity.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.opacity">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.opacity</a>
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts) The opacity of a point in treemap. When a point has
   * children, the visibility of the children is determined by the opacity.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.opacity">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.opacity</a>
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts) The shadow option for hovered state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.shadow">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.shadow</a>
   *
   * @implspec shadow?: boolean;
   *
   */
  @JSProperty("shadow")
  boolean getShadow();

  /**
   * (Highcharts) The shadow option for hovered state.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.shadow">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover.shadow</a>
   *
   * @implspec shadow?: boolean;
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);
}
