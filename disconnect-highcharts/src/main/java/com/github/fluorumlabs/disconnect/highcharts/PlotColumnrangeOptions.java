package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The column range is a cartesian series type with
 * higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To
 * display horizontal bars, set chart.inverted to <code>true</code>.
 *
 * Configuration options for the series are given in three levels:
 *
 * <ol>
 * <li>
 * Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * </li>
 * <li>
 * Options for all <code>columnrange</code> series are defined in
 * plotOptions.columnrange.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange">https://api.highcharts.com/highcharts/plotOptions.columnrange</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange">https://api.highcharts.com/highstock/plotOptions.columnrange</a>
 *
 */
public interface PlotColumnrangeOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.allAreas">https://api.highcharts.com/highmaps/plotOptions.columnrange.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  boolean getAllAreas();

  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.allAreas">https://api.highcharts.com/highmaps/plotOptions.columnrange.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts, Highstock) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.columnrange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.columnrange.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts, Highstock) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.columnrange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.columnrange.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.animation">https://api.highcharts.com/highcharts/plotOptions.columnrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.animation">https://api.highcharts.com/highstock/plotOptions.columnrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotColumnrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.animation">https://api.highcharts.com/highcharts/plotOptions.columnrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.animation">https://api.highcharts.com/highstock/plotOptions.columnrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotColumnrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.animation">https://api.highcharts.com/highcharts/plotOptions.columnrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.animation">https://api.highcharts.com/highstock/plotOptions.columnrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotColumnrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotColumnrangeAnimationOptions value);

  /**
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.animation">https://api.highcharts.com/highcharts/plotOptions.columnrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.animation">https://api.highcharts.com/highstock/plotOptions.columnrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotColumnrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock) For some series, there is a limit that shuts down
   * initial animation by default when the total number of points in the chart
   * is too high. For example, for a column chart and its derivatives,
   * animation doesn't run if there is more than 250 points totally. To
   * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.animationLimit">https://api.highcharts.com/highcharts/plotOptions.columnrange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.animationLimit">https://api.highcharts.com/highstock/plotOptions.columnrange.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts, Highstock) For some series, there is a limit that shuts down
   * initial animation by default when the total number of points in the chart
   * is too high. For example, for a column chart and its derivatives,
   * animation doesn't run if there is more than 250 points totally. To
   * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.animationLimit">https://api.highcharts.com/highcharts/plotOptions.columnrange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.animationLimit">https://api.highcharts.com/highstock/plotOptions.columnrange.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts, Highstock) Set the point threshold for when a series should
   * enter boost mode.
   *
   * Setting it to e.g. 2000 will cause the series to enter boost mode when
   * there are 2000 or more points in the series.
   *
   * To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting
   * it to 1 will force boosting.
   *
   * Note that the cropThreshold also affects this setting. When zooming in on
   * a series that has fewer points than the <code>cropThreshold</code>, all points are
   * rendered although outside the visible plot area, and the <code>boostThreshold</code>
   * won't take effect.
   *
   * Requires <code>modules/boost.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.columnrange.boostThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.boostThreshold">https://api.highcharts.com/highstock/plotOptions.columnrange.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highcharts, Highstock) Set the point threshold for when a series should
   * enter boost mode.
   *
   * Setting it to e.g. 2000 will cause the series to enter boost mode when
   * there are 2000 or more points in the series.
   *
   * To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting
   * it to 1 will force boosting.
   *
   * Note that the cropThreshold also affects this setting. When zooming in on
   * a series that has fewer points than the <code>cropThreshold</code>, all points are
   * rendered although outside the visible plot area, and the <code>boostThreshold</code>
   * won't take effect.
   *
   * Requires <code>modules/boost.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.columnrange.boostThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.boostThreshold">https://api.highcharts.com/highstock/plotOptions.columnrange.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.borderColor">https://api.highcharts.com/highcharts/plotOptions.columnrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.borderColor">https://api.highcharts.com/highstock/plotOptions.columnrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.borderColor">https://api.highcharts.com/gantt/plotOptions.columnrange.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.borderColor">https://api.highcharts.com/highcharts/plotOptions.columnrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.borderColor">https://api.highcharts.com/highstock/plotOptions.columnrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.borderColor">https://api.highcharts.com/gantt/plotOptions.columnrange.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The corner radius of the border
   * surrounding each column or bar.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.borderRadius">https://api.highcharts.com/highcharts/plotOptions.columnrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.borderRadius">https://api.highcharts.com/highstock/plotOptions.columnrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.borderRadius">https://api.highcharts.com/gantt/plotOptions.columnrange.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Gantt) The corner radius of the border
   * surrounding each column or bar.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.borderRadius">https://api.highcharts.com/highcharts/plotOptions.columnrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.borderRadius">https://api.highcharts.com/highstock/plotOptions.columnrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.borderRadius">https://api.highcharts.com/gantt/plotOptions.columnrange.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Gantt) The width of the border surrounding each
   * column or bar. Defaults to <code>1</code> when there is room for a border, but to
   * <code>0</code> when the columns are so dense that a border would cover the next
   * column.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.borderWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.borderWidth">https://api.highcharts.com/highstock/plotOptions.columnrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.borderWidth">https://api.highcharts.com/gantt/plotOptions.columnrange.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Gantt) The width of the border surrounding each
   * column or bar. Defaults to <code>1</code> when there is room for a border, but to
   * <code>0</code> when the columns are so dense that a border would cover the next
   * column.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.borderWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.borderWidth">https://api.highcharts.com/highstock/plotOptions.columnrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.borderWidth">https://api.highcharts.com/gantt/plotOptions.columnrange.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.className">https://api.highcharts.com/highcharts/plotOptions.columnrange.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.className">https://api.highcharts.com/highstock/plotOptions.columnrange.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.className">https://api.highcharts.com/highcharts/plotOptions.columnrange.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.className">https://api.highcharts.com/highstock/plotOptions.columnrange.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.clip">https://api.highcharts.com/highcharts/plotOptions.columnrange.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.clip">https://api.highcharts.com/highstock/plotOptions.columnrange.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts, Highstock) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.clip">https://api.highcharts.com/highcharts/plotOptions.columnrange.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.clip">https://api.highcharts.com/highstock/plotOptions.columnrange.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.color">https://api.highcharts.com/highcharts/plotOptions.columnrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.color">https://api.highcharts.com/highstock/plotOptions.columnrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.color">https://api.highcharts.com/highcharts/plotOptions.columnrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.color">https://api.highcharts.com/highstock/plotOptions.columnrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.color">https://api.highcharts.com/highcharts/plotOptions.columnrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.color">https://api.highcharts.com/highstock/plotOptions.columnrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock) The main color of the series. In line type series
   * it applies to the line and the point markers unless otherwise specified.
   * In bar type series it applies to the bars unless a color is specified per
   * point. The default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.color">https://api.highcharts.com/highcharts/plotOptions.columnrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.color">https://api.highcharts.com/highstock/plotOptions.columnrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highmaps) Set this option to <code>false</code> to prevent a series from connecting
   * to the global color axis. This will cause the series to have its own
   * legend item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.colorAxis">https://api.highcharts.com/highmaps/plotOptions.columnrange.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  boolean getColorAxis();

  /**
   * (Highmaps) Set this option to <code>false</code> to prevent a series from connecting
   * to the global color axis. This will cause the series to have its own
   * legend item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.colorAxis">https://api.highcharts.com/highmaps/plotOptions.columnrange.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
   * from the global colors or series-specific plotOptions.column.colors
   * collections, this option determines whether the chart should receive one
   * color per series or one color per point.
   *
   * In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
   * and instead this option gives the points individual color class names on
   * the form <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.columnrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.colorByPoint">https://api.highcharts.com/highstock/plotOptions.columnrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.colorByPoint">https://api.highcharts.com/gantt/plotOptions.columnrange.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
   * from the global colors or series-specific plotOptions.column.colors
   * collections, this option determines whether the chart should receive one
   * color per series or one color per point.
   *
   * In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
   * and instead this option gives the points individual color class names on
   * the form <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.columnrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.colorByPoint">https://api.highcharts.com/highstock/plotOptions.columnrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.colorByPoint">https://api.highcharts.com/gantt/plotOptions.columnrange.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.colorIndex">https://api.highcharts.com/highcharts/plotOptions.columnrange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.colorIndex">https://api.highcharts.com/highstock/plotOptions.columnrange.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.colorIndex">https://api.highcharts.com/highcharts/plotOptions.columnrange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.colorIndex">https://api.highcharts.com/highstock/plotOptions.columnrange.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.colors">https://api.highcharts.com/highcharts/plotOptions.columnrange.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.colors">https://api.highcharts.com/highstock/plotOptions.columnrange.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.colors">https://api.highcharts.com/gantt/plotOptions.columnrange.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.colors">https://api.highcharts.com/highcharts/plotOptions.columnrange.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.colors">https://api.highcharts.com/highstock/plotOptions.columnrange.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.colors">https://api.highcharts.com/gantt/plotOptions.columnrange.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  void setColors(String[] value);

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.compare">https://api.highcharts.com/highstock/plotOptions.columnrange.compare</a>
   *
   * @implspec compare?: string;
   *
   */
  @JSProperty("compare")
  @Nullable
  String getCompare();

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.compare">https://api.highcharts.com/highstock/plotOptions.columnrange.compare</a>
   *
   * @implspec compare?: string;
   *
   */
  @JSProperty("compare")
  void setCompare(String value);

  /**
   * (Highstock) When compare is <code>percent</code>, this option dictates whether to
   * use 0 or 100 as the base of comparison.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.compareBase">https://api.highcharts.com/highstock/plotOptions.columnrange.compareBase</a>
   *
   * @implspec compareBase?: (0|100);
   *
   */
  @JSProperty("compareBase")
  @Nullable
  CompareBase getCompareBase();

  /**
   * (Highstock) When compare is <code>percent</code>, this option dictates whether to
   * use 0 or 100 as the base of comparison.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.compareBase">https://api.highcharts.com/highstock/plotOptions.columnrange.compareBase</a>
   *
   * @implspec compareBase?: (0|100);
   *
   */
  @JSProperty("compareBase")
  void setCompareBase(CompareBase value);

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.compareStart">https://api.highcharts.com/highstock/plotOptions.columnrange.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  boolean getCompareStart();

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.compareStart">https://api.highcharts.com/highstock/plotOptions.columnrange.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  void setCompareStart(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.connectors">https://api.highcharts.com/gantt/plotOptions.columnrange.connectors</a>
   *
   * @implspec connectors?: PlotColumnrangeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotColumnrangeConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.connectors">https://api.highcharts.com/gantt/plotOptions.columnrange.connectors</a>
   *
   * @implspec connectors?: PlotColumnrangeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotColumnrangeConnectorsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When true, each column edge is rounded to
   * its nearest pixel in order to render sharp on screen. In some cases, when
   * there are a lot of densely packed columns, this leads to visible
   * difference in column widths or distance between columns. In these cases,
   * setting <code>crisp</code> to <code>false</code> may look better, even though each column is
   * rendered blurry.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.crisp">https://api.highcharts.com/highcharts/plotOptions.columnrange.crisp</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.crisp">https://api.highcharts.com/highstock/plotOptions.columnrange.crisp</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.crisp">https://api.highcharts.com/gantt/plotOptions.columnrange.crisp</a>
   *
   * @implspec crisp?: boolean;
   *
   */
  @JSProperty("crisp")
  boolean getCrisp();

  /**
   * (Highcharts, Highstock, Gantt) When true, each column edge is rounded to
   * its nearest pixel in order to render sharp on screen. In some cases, when
   * there are a lot of densely packed columns, this leads to visible
   * difference in column widths or distance between columns. In these cases,
   * setting <code>crisp</code> to <code>false</code> may look better, even though each column is
   * rendered blurry.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.crisp">https://api.highcharts.com/highcharts/plotOptions.columnrange.crisp</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.crisp">https://api.highcharts.com/highstock/plotOptions.columnrange.crisp</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.crisp">https://api.highcharts.com/gantt/plotOptions.columnrange.crisp</a>
   *
   * @implspec crisp?: boolean;
   *
   */
  @JSProperty("crisp")
  void setCrisp(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) When the series contains less points than
   * the crop threshold, all points are drawn, event if the points fall
   * outside the visible plot area at the current zoom. The advantage of
   * drawing all points (including markers and columns), is that animation is
   * performed on updates. On the other hand, when the series contains more
   * points than the crop threshold, the series data is cropped to only
   * contain points that fall within the plot area. The advantage of cropping
   * away invisible points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.columnrange.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.cropThreshold">https://api.highcharts.com/highstock/plotOptions.columnrange.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.cropThreshold">https://api.highcharts.com/gantt/plotOptions.columnrange.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  double getCropThreshold();

  /**
   * (Highcharts, Highstock, Gantt) When the series contains less points than
   * the crop threshold, all points are drawn, event if the points fall
   * outside the visible plot area at the current zoom. The advantage of
   * drawing all points (including markers and columns), is that animation is
   * performed on updates. On the other hand, when the series contains more
   * points than the crop threshold, the series data is cropped to only
   * contain points that fall within the plot area. The advantage of cropping
   * away invisible points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.columnrange.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.cropThreshold">https://api.highcharts.com/highstock/plotOptions.columnrange.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.cropThreshold">https://api.highcharts.com/gantt/plotOptions.columnrange.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.cursor">https://api.highcharts.com/highcharts/plotOptions.columnrange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.cursor">https://api.highcharts.com/highstock/plotOptions.columnrange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.cursor">https://api.highcharts.com/highcharts/plotOptions.columnrange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.cursor">https://api.highcharts.com/highstock/plotOptions.columnrange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.cursor">https://api.highcharts.com/highcharts/plotOptions.columnrange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.cursor">https://api.highcharts.com/highstock/plotOptions.columnrange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highstock) Data grouping is the concept of sampling the data values into
   * larger blocks in order to ease readability and increase performance of
   * the JavaScript charts. Highstock by default applies data grouping when
   * the points become closer than a certain pixel value, determined by the
   * <code>groupPixelWidth</code> option.
   *
   * If data grouping is applied, the grouping information of grouped points
   * can be read from the Point.dataGroup. If point options other than the
   * data itself are set, for example <code>name</code> or <code>color</code> or custom properties,
   * the grouping logic doesn't know how to group it. In this case the options
   * of the first point instance are copied over to the group point. This can
   * be altered through a custom <code>approximation</code> callback function.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.dataGrouping">https://api.highcharts.com/highstock/plotOptions.columnrange.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotColumnrangeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotColumnrangeDataGroupingOptions getDataGrouping();

  /**
   * (Highstock) Data grouping is the concept of sampling the data values into
   * larger blocks in order to ease readability and increase performance of
   * the JavaScript charts. Highstock by default applies data grouping when
   * the points become closer than a certain pixel value, determined by the
   * <code>groupPixelWidth</code> option.
   *
   * If data grouping is applied, the grouping information of grouped points
   * can be read from the Point.dataGroup. If point options other than the
   * data itself are set, for example <code>name</code> or <code>color</code> or custom properties,
   * the grouping logic doesn't know how to group it. In this case the options
   * of the first point instance are copied over to the group point. This can
   * be altered through a custom <code>approximation</code> callback function.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.dataGrouping">https://api.highcharts.com/highstock/plotOptions.columnrange.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotColumnrangeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotColumnrangeDataGroupingOptions value);

  /**
   * (Highcharts, Highstock) Extended data labels for range series types.
   * Range series data labels have no <code>x</code> and <code>y</code> options. Instead, they have
   * <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower
   * data label sets individually.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.dataLabels">https://api.highcharts.com/highcharts/plotOptions.columnrange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.dataLabels">https://api.highcharts.com/highstock/plotOptions.columnrange.dataLabels</a>
   *
   * @implspec dataLabels?: PlotColumnrangeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotColumnrangeDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highstock) Extended data labels for range series types.
   * Range series data labels have no <code>x</code> and <code>y</code> options. Instead, they have
   * <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower
   * data label sets individually.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.dataLabels">https://api.highcharts.com/highcharts/plotOptions.columnrange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.dataLabels">https://api.highcharts.com/highstock/plotOptions.columnrange.dataLabels</a>
   *
   * @implspec dataLabels?: PlotColumnrangeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotColumnrangeDataLabelsOptions value);

  /**
   * (Highcharts) Depth of the columns in a 3D column chart. Requires
   * <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.depth">https://api.highcharts.com/highcharts/plotOptions.columnrange.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) Depth of the columns in a 3D column chart. Requires
   * <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.depth">https://api.highcharts.com/highcharts/plotOptions.columnrange.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

  /**
   * (Highcharts, Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.description">https://api.highcharts.com/highcharts/plotOptions.columnrange.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.description">https://api.highcharts.com/highstock/plotOptions.columnrange.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.description">https://api.highcharts.com/highcharts/plotOptions.columnrange.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.description">https://api.highcharts.com/highstock/plotOptions.columnrange.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.columnrange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.dragDrop">https://api.highcharts.com/highstock/plotOptions.columnrange.dragDrop</a>
   *
   * @implspec dragDrop?: PlotColumnrangeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotColumnrangeDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.columnrange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.dragDrop">https://api.highcharts.com/highstock/plotOptions.columnrange.dragDrop</a>
   *
   * @implspec dragDrop?: PlotColumnrangeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotColumnrangeDragDropOptions value);

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeColor">https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeColor</a>
   *
   * @implspec edgeColor?: ColorString;
   *
   */
  @JSProperty("edgeColor")
  @Nullable
  String getEdgeColor();

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeColor">https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeColor</a>
   *
   * @implspec edgeColor?: ColorString;
   *
   */
  @JSProperty("edgeColor")
  void setEdgeColor(String value);

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  double getEdgeWidth();

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  void setEdgeWidth(double value);

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.columnrange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.columnrange.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.columnrange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.columnrange.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.events">https://api.highcharts.com/highcharts/plotOptions.columnrange.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.events">https://api.highcharts.com/highstock/plotOptions.columnrange.events</a>
   *
   * @implspec events?: PlotColumnrangeEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotColumnrangeEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.events">https://api.highcharts.com/highcharts/plotOptions.columnrange.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.events">https://api.highcharts.com/highstock/plotOptions.columnrange.events</a>
   *
   * @implspec events?: PlotColumnrangeEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotColumnrangeEventsOptions value);

  /**
   * (Highcharts, Highstock) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.columnrange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.columnrange.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts, Highstock) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.columnrange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.columnrange.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts, Highstock) Determines whether the series should look for the
   * nearest point in both dimensions or just the x-dimension when hovering
   * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
   * other series. If the data has duplicate x-values, it is recommended to
   * set this to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.columnrange.findNearestPointBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.columnrange.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highcharts, Highstock) Determines whether the series should look for the
   * nearest point in both dimensions or just the x-dimension when hovering
   * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
   * other series. If the data has duplicate x-values, it is recommended to
   * set this to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.columnrange.findNearestPointBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.columnrange.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  void setFindNearestPointBy(FindNearestPointBy value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.columnrange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.columnrange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.columnrange.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  boolean getGetExtremesFromAll();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.columnrange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.columnrange.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.columnrange.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.grouping">https://api.highcharts.com/highcharts/plotOptions.columnrange.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.grouping">https://api.highcharts.com/highstock/plotOptions.columnrange.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.grouping">https://api.highcharts.com/gantt/plotOptions.columnrange.grouping</a>
   *
   * @implspec grouping?: boolean;
   *
   */
  @JSProperty("grouping")
  boolean getGrouping();

  /**
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.grouping">https://api.highcharts.com/highcharts/plotOptions.columnrange.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.grouping">https://api.highcharts.com/highstock/plotOptions.columnrange.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.grouping">https://api.highcharts.com/gantt/plotOptions.columnrange.grouping</a>
   *
   * @implspec grouping?: boolean;
   *
   */
  @JSProperty("grouping")
  void setGrouping(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.groupPadding">https://api.highcharts.com/highcharts/plotOptions.columnrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.groupPadding">https://api.highcharts.com/highstock/plotOptions.columnrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.groupPadding">https://api.highcharts.com/gantt/plotOptions.columnrange.groupPadding</a>
   *
   * @implspec groupPadding?: number;
   *
   */
  @JSProperty("groupPadding")
  double getGroupPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.groupPadding">https://api.highcharts.com/highcharts/plotOptions.columnrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.groupPadding">https://api.highcharts.com/highstock/plotOptions.columnrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.groupPadding">https://api.highcharts.com/gantt/plotOptions.columnrange.groupPadding</a>
   *
   * @implspec groupPadding?: number;
   *
   */
  @JSProperty("groupPadding")
  void setGroupPadding(double value);

  /**
   * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
   * Requires <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.groupZPadding">https://api.highcharts.com/highcharts/plotOptions.columnrange.groupZPadding</a>
   *
   * @implspec groupZPadding?: number;
   *
   */
  @JSProperty("groupZPadding")
  double getGroupZPadding();

  /**
   * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
   * Requires <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.groupZPadding">https://api.highcharts.com/highcharts/plotOptions.columnrange.groupZPadding</a>
   *
   * @implspec groupZPadding?: number;
   *
   */
  @JSProperty("groupZPadding")
  void setGroupZPadding(double value);

  /**
   * (Highmaps) What property to join the <code>mapData</code> to the value data. For
   * example, if joinBy is &quot;code&quot;, the mapData items with a specific code is
   * merged into the data with the same code. For maps loaded from GeoJSON,
   * the keys may be held in each point's <code>properties</code> object.
   *
   * The joinBy option can also be an array of two values, where the first
   * points to a key in the <code>mapData</code>, and the second points to another key in
   * the <code>data</code>.
   *
   * When joinBy is <code>null</code>, the map items are joined by their position in the
   * array, which performs much better in maps with many data points. This is
   * the recommended option if you are printing more than a thousand data
   * points and have a backend that can preprocess the data into a parallel
   * array of the mapData.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.joinBy">https://api.highcharts.com/highmaps/plotOptions.columnrange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  @Nullable
  Unknown getJoinBy();

  /**
   * (Highmaps) What property to join the <code>mapData</code> to the value data. For
   * example, if joinBy is &quot;code&quot;, the mapData items with a specific code is
   * merged into the data with the same code. For maps loaded from GeoJSON,
   * the keys may be held in each point's <code>properties</code> object.
   *
   * The joinBy option can also be an array of two values, where the first
   * points to a key in the <code>mapData</code>, and the second points to another key in
   * the <code>data</code>.
   *
   * When joinBy is <code>null</code>, the map items are joined by their position in the
   * array, which performs much better in maps with many data points. This is
   * the recommended option if you are printing more than a thousand data
   * points and have a backend that can preprocess the data into a parallel
   * array of the mapData.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.joinBy">https://api.highcharts.com/highmaps/plotOptions.columnrange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String value);

  /**
   * (Highmaps) What property to join the <code>mapData</code> to the value data. For
   * example, if joinBy is &quot;code&quot;, the mapData items with a specific code is
   * merged into the data with the same code. For maps loaded from GeoJSON,
   * the keys may be held in each point's <code>properties</code> object.
   *
   * The joinBy option can also be an array of two values, where the first
   * points to a key in the <code>mapData</code>, and the second points to another key in
   * the <code>data</code>.
   *
   * When joinBy is <code>null</code>, the map items are joined by their position in the
   * array, which performs much better in maps with many data points. This is
   * the recommended option if you are printing more than a thousand data
   * points and have a backend that can preprocess the data into a parallel
   * array of the mapData.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.joinBy">https://api.highcharts.com/highmaps/plotOptions.columnrange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String[] value);

  /**
   * (Highcharts, Highstock) An array specifying which option maps to which
   * key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.keys">https://api.highcharts.com/highcharts/plotOptions.columnrange.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.keys">https://api.highcharts.com/highstock/plotOptions.columnrange.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts, Highstock) An array specifying which option maps to which
   * key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.keys">https://api.highcharts.com/highcharts/plotOptions.columnrange.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.keys">https://api.highcharts.com/highstock/plotOptions.columnrange.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  void setKeys(String[] value);

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   * Requires the <code>series-label.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.label">https://api.highcharts.com/highcharts/plotOptions.columnrange.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.label">https://api.highcharts.com/highstock/plotOptions.columnrange.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.label">https://api.highcharts.com/gantt/plotOptions.columnrange.label</a>
   *
   * @implspec label?: PlotColumnrangeLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotColumnrangeLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   * Requires the <code>series-label.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.label">https://api.highcharts.com/highcharts/plotOptions.columnrange.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.label">https://api.highcharts.com/highstock/plotOptions.columnrange.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.label">https://api.highcharts.com/gantt/plotOptions.columnrange.label</a>
   *
   * @implspec label?: PlotColumnrangeLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotColumnrangeLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.linkedTo">https://api.highcharts.com/highcharts/plotOptions.columnrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.linkedTo">https://api.highcharts.com/highstock/plotOptions.columnrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.linkedTo">https://api.highcharts.com/gantt/plotOptions.columnrange.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  @Nullable
  String getLinkedTo();

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.linkedTo">https://api.highcharts.com/highcharts/plotOptions.columnrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.linkedTo">https://api.highcharts.com/highstock/plotOptions.columnrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.linkedTo">https://api.highcharts.com/gantt/plotOptions.columnrange.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
   * column, translated to the height of a bar in a bar chart. This prevents
   * the columns from becoming too wide when there is a small number of points
   * in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.columnrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.columnrange.maxPointWidth</a>
   *
   * @implspec maxPointWidth?: number;
   *
   */
  @JSProperty("maxPointWidth")
  double getMaxPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
   * column, translated to the height of a bar in a bar chart. This prevents
   * the columns from becoming too wide when there is a small number of points
   * in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.columnrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.columnrange.maxPointWidth</a>
   *
   * @implspec maxPointWidth?: number;
   *
   */
  @JSProperty("maxPointWidth")
  void setMaxPointWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The minimal height for a column or width
   * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
   * to zero) point, set the minimal point length to a pixel value like 3. In
   * stacked column charts, minPointLength might not be respected for tightly
   * packed values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.minPointLength">https://api.highcharts.com/highcharts/plotOptions.columnrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.minPointLength">https://api.highcharts.com/highstock/plotOptions.columnrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.minPointLength">https://api.highcharts.com/gantt/plotOptions.columnrange.minPointLength</a>
   *
   * @implspec minPointLength?: number;
   *
   */
  @JSProperty("minPointLength")
  double getMinPointLength();

  /**
   * (Highcharts, Highstock, Gantt) The minimal height for a column or width
   * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
   * to zero) point, set the minimal point length to a pixel value like 3. In
   * stacked column charts, minPointLength might not be respected for tightly
   * packed values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.minPointLength">https://api.highcharts.com/highcharts/plotOptions.columnrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.minPointLength">https://api.highcharts.com/highstock/plotOptions.columnrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.minPointLength">https://api.highcharts.com/gantt/plotOptions.columnrange.minPointLength</a>
   *
   * @implspec minPointLength?: number;
   *
   */
  @JSProperty("minPointLength")
  void setMinPointLength(double value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.columnrange.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  @Nullable
  PlotSeriesOptions getNavigatorOptions();

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.columnrange.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.point">https://api.highcharts.com/highcharts/plotOptions.columnrange.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.point">https://api.highcharts.com/highstock/plotOptions.columnrange.point</a>
   *
   * @implspec point?: PlotColumnrangePointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotColumnrangePointOptions getPoint();

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.point">https://api.highcharts.com/highcharts/plotOptions.columnrange.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.point">https://api.highcharts.com/highstock/plotOptions.columnrange.point</a>
   *
   * @implspec point?: PlotColumnrangePointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotColumnrangePointOptions value);

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.columnrange.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.columnrange.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, <code>pointInterval</code> defines the interval of the x values. For
   * example, if a series contains one value every decade starting from year
   * 0, set <code>pointInterval</code> to <code>10</code>. In true <code>datetime</code> axes, the
   * <code>pointInterval</code> is set in milliseconds.
   *
   * It can be also be combined with <code>pointIntervalUnit</code> to draw irregular
   * time intervals.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointInterval">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointInterval">https://api.highcharts.com/highstock/plotOptions.columnrange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointInterval">https://api.highcharts.com/gantt/plotOptions.columnrange.pointInterval</a>
   *
   * @implspec pointInterval?: number;
   *
   */
  @JSProperty("pointInterval")
  double getPointInterval();

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, <code>pointInterval</code> defines the interval of the x values. For
   * example, if a series contains one value every decade starting from year
   * 0, set <code>pointInterval</code> to <code>10</code>. In true <code>datetime</code> axes, the
   * <code>pointInterval</code> is set in milliseconds.
   *
   * It can be also be combined with <code>pointIntervalUnit</code> to draw irregular
   * time intervals.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointInterval">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointInterval">https://api.highcharts.com/highstock/plotOptions.columnrange.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointInterval">https://api.highcharts.com/gantt/plotOptions.columnrange.pointInterval</a>
   *
   * @implspec pointInterval?: number;
   *
   */
  @JSProperty("pointInterval")
  void setPointInterval(double value);

  /**
   * (Highcharts, Highstock, Gantt) On datetime series, this allows for
   * setting the pointInterval to irregular time units, <code>day</code>, <code>month</code> and
   * <code>year</code>. A day is usually the same as 24 hours, but <code>pointIntervalUnit</code>
   * also takes the DST crossover into consideration when dealing with local
   * time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6
   * months, 10 years etc.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.columnrange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.columnrange.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  @Nullable
  PointIntervalUnit getPointIntervalUnit();

  /**
   * (Highcharts, Highstock, Gantt) On datetime series, this allows for
   * setting the pointInterval to irregular time units, <code>day</code>, <code>month</code> and
   * <code>year</code>. A day is usually the same as 24 hours, but <code>pointIntervalUnit</code>
   * also takes the DST crossover into consideration when dealing with local
   * time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6
   * months, 10 years etc.
   *
   * Please note that this options applies to the <em>series data</em>, not the
   * interval of the axis ticks, which is independent.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.columnrange.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.columnrange.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  void setPointIntervalUnit(PointIntervalUnit value);

  /**
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPadding">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointPadding">https://api.highcharts.com/highstock/plotOptions.columnrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointPadding">https://api.highcharts.com/gantt/plotOptions.columnrange.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPadding">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointPadding">https://api.highcharts.com/highstock/plotOptions.columnrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointPadding">https://api.highcharts.com/gantt/plotOptions.columnrange.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * (Highcharts, Highstock, Gantt) Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>,
   * <code>number</code>.
   *
   * In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
   * create any padding of the X axis. In a polar column chart this means that
   * the first column points directly north. If the pointPlacement is
   * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is useful
   * for example for visualising an amount between two points in time or in a
   * certain sector of a polar chart.
   *
   * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
   * is on the axis value, -0.5 is between this value and the previous, and
   * 0.5 is between this value and the next. Unlike the textual options,
   * numeric point placement options won't affect axis padding.
   *
   * Note that pointPlacement needs a pointRange to work. For column series
   * this is computed, but for line-type series it needs to be set.
   *
   * For the <code>xrange</code> series type and gantt charts, if the Y axis is a
   * category axis, the <code>pointPlacement</code> applies to the Y axis rather than the
   * (typically datetime) X axis.
   *
   * Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/highstock/plotOptions.columnrange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/gantt/plotOptions.columnrange.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  @Nullable
  Unknown getPointPlacement();

  /**
   * (Highcharts, Highstock, Gantt) Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>,
   * <code>number</code>.
   *
   * In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
   * create any padding of the X axis. In a polar column chart this means that
   * the first column points directly north. If the pointPlacement is
   * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is useful
   * for example for visualising an amount between two points in time or in a
   * certain sector of a polar chart.
   *
   * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
   * is on the axis value, -0.5 is between this value and the previous, and
   * 0.5 is between this value and the next. Unlike the textual options,
   * numeric point placement options won't affect axis padding.
   *
   * Note that pointPlacement needs a pointRange to work. For column series
   * this is computed, but for line-type series it needs to be set.
   *
   * For the <code>xrange</code> series type and gantt charts, if the Y axis is a
   * category axis, the <code>pointPlacement</code> applies to the Y axis rather than the
   * (typically datetime) X axis.
   *
   * Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/highstock/plotOptions.columnrange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/gantt/plotOptions.columnrange.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(double value);

  /**
   * (Highcharts, Highstock, Gantt) Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>,
   * <code>number</code>.
   *
   * In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
   * create any padding of the X axis. In a polar column chart this means that
   * the first column points directly north. If the pointPlacement is
   * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is useful
   * for example for visualising an amount between two points in time or in a
   * certain sector of a polar chart.
   *
   * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
   * is on the axis value, -0.5 is between this value and the previous, and
   * 0.5 is between this value and the next. Unlike the textual options,
   * numeric point placement options won't affect axis padding.
   *
   * Note that pointPlacement needs a pointRange to work. For column series
   * this is computed, but for line-type series it needs to be set.
   *
   * For the <code>xrange</code> series type and gantt charts, if the Y axis is a
   * category axis, the <code>pointPlacement</code> applies to the Y axis rather than the
   * (typically datetime) X axis.
   *
   * Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/highstock/plotOptions.columnrange.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointPlacement">https://api.highcharts.com/gantt/plotOptions.columnrange.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(String value);

  /**
   * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
   * for. This determines the width of the column. On a categorized axis, the
   * range will be 1 by default (one category unit). On linear and datetime
   * axes, the range will be computed as the distance between the two closest
   * data points.
   *
   * The default <code>null</code> means it is computed automatically, but this option
   * can be used to override the automatic value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointRange">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointRange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointRange">https://api.highcharts.com/highstock/plotOptions.columnrange.pointRange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointRange">https://api.highcharts.com/gantt/plotOptions.columnrange.pointRange</a>
   *
   * @implspec pointRange?: any;
   *
   */
  @JSProperty("pointRange")
  @Nullable
  Any getPointRange();

  /**
   * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
   * for. This determines the width of the column. On a categorized axis, the
   * range will be 1 by default (one category unit). On linear and datetime
   * axes, the range will be computed as the distance between the two closest
   * data points.
   *
   * The default <code>null</code> means it is computed automatically, but this option
   * can be used to override the automatic value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointRange">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointRange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointRange">https://api.highcharts.com/highstock/plotOptions.columnrange.pointRange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointRange">https://api.highcharts.com/gantt/plotOptions.columnrange.pointRange</a>
   *
   * @implspec pointRange?: any;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(Any value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointStart">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointStart">https://api.highcharts.com/highstock/plotOptions.columnrange.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointStart">https://api.highcharts.com/gantt/plotOptions.columnrange.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  double getPointStart();

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointStart">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointStart">https://api.highcharts.com/highstock/plotOptions.columnrange.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointStart">https://api.highcharts.com/gantt/plotOptions.columnrange.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointWidth">https://api.highcharts.com/highstock/plotOptions.columnrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointWidth">https://api.highcharts.com/gantt/plotOptions.columnrange.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  double getPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.pointWidth">https://api.highcharts.com/highcharts/plotOptions.columnrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.pointWidth">https://api.highcharts.com/highstock/plotOptions.columnrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.pointWidth">https://api.highcharts.com/gantt/plotOptions.columnrange.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.selected">https://api.highcharts.com/highcharts/plotOptions.columnrange.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.selected">https://api.highcharts.com/highstock/plotOptions.columnrange.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.selected">https://api.highcharts.com/highcharts/plotOptions.columnrange.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.selected">https://api.highcharts.com/highstock/plotOptions.columnrange.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
   * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.shadow">https://api.highcharts.com/highcharts/plotOptions.columnrange.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.shadow">https://api.highcharts.com/highstock/plotOptions.columnrange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
   * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.shadow">https://api.highcharts.com/highcharts/plotOptions.columnrange.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.shadow">https://api.highcharts.com/highstock/plotOptions.columnrange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
   * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.shadow">https://api.highcharts.com/highcharts/plotOptions.columnrange.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.shadow">https://api.highcharts.com/highstock/plotOptions.columnrange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.columnrange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.showCheckbox">https://api.highcharts.com/highstock/plotOptions.columnrange.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.columnrange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.showCheckbox">https://api.highcharts.com/highstock/plotOptions.columnrange.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts, Highstock) Whether to display this particular series or
   * series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.showInLegend">https://api.highcharts.com/highcharts/plotOptions.columnrange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.showInLegend">https://api.highcharts.com/highstock/plotOptions.columnrange.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highstock) Whether to display this particular series or
   * series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.showInLegend">https://api.highcharts.com/highcharts/plotOptions.columnrange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.showInLegend">https://api.highcharts.com/highstock/plotOptions.columnrange.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.showInNavigator">https://api.highcharts.com/highstock/plotOptions.columnrange.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  boolean getShowInNavigator();

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.showInNavigator">https://api.highcharts.com/highstock/plotOptions.columnrange.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.columnrange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.columnrange.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.columnrange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.columnrange.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts, Highstock) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states">https://api.highcharts.com/highcharts/plotOptions.columnrange.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states">https://api.highcharts.com/highstock/plotOptions.columnrange.states</a>
   *
   * @implspec states?: PlotColumnrangeStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotColumnrangeStatesOptions getStates();

  /**
   * (Highcharts, Highstock) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states">https://api.highcharts.com/highcharts/plotOptions.columnrange.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states">https://api.highcharts.com/highstock/plotOptions.columnrange.states</a>
   *
   * @implspec states?: PlotColumnrangeStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotColumnrangeStatesOptions value);

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip when not shared.
   * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
   * will be hidden when moving the mouse between series. Defaults to true for
   * line and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.columnrange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.stickyTracking">https://api.highcharts.com/highstock/plotOptions.columnrange.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip when not shared.
   * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
   * will be hidden when moving the mouse between series. Defaults to true for
   * line and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.columnrange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.stickyTracking">https://api.highcharts.com/highstock/plotOptions.columnrange.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip, but only
   * the following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.tooltip">https://api.highcharts.com/highcharts/plotOptions.columnrange.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.tooltip">https://api.highcharts.com/highstock/plotOptions.columnrange.tooltip</a>
   *
   * @implspec tooltip?: PlotColumnrangeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotColumnrangeTooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip, but only
   * the following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.tooltip">https://api.highcharts.com/highcharts/plotOptions.columnrange.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.tooltip">https://api.highcharts.com/highstock/plotOptions.columnrange.tooltip</a>
   *
   * @implspec tooltip?: PlotColumnrangeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotColumnrangeTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.columnrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.turboThreshold">https://api.highcharts.com/highstock/plotOptions.columnrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.turboThreshold">https://api.highcharts.com/gantt/plotOptions.columnrange.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  double getTurboThreshold();

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.columnrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.turboThreshold">https://api.highcharts.com/highstock/plotOptions.columnrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.turboThreshold">https://api.highcharts.com/gantt/plotOptions.columnrange.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.visible">https://api.highcharts.com/highcharts/plotOptions.columnrange.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.visible">https://api.highcharts.com/highstock/plotOptions.columnrange.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.visible">https://api.highcharts.com/highcharts/plotOptions.columnrange.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.visible">https://api.highcharts.com/highstock/plotOptions.columnrange.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.zIndex">https://api.highcharts.com/highmaps/plotOptions.columnrange.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.zIndex">https://api.highcharts.com/highmaps/plotOptions.columnrange.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.columnrange.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.zoneAxis">https://api.highcharts.com/highstock/plotOptions.columnrange.zoneAxis</a>
   *
   * @implspec zoneAxis?: string;
   *
   */
  @JSProperty("zoneAxis")
  @Nullable
  String getZoneAxis();

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.columnrange.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.zoneAxis">https://api.highcharts.com/highstock/plotOptions.columnrange.zoneAxis</a>
   *
   * @implspec zoneAxis?: string;
   *
   */
  @JSProperty("zoneAxis")
  void setZoneAxis(String value);

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.zones">https://api.highcharts.com/highcharts/plotOptions.columnrange.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.zones">https://api.highcharts.com/highstock/plotOptions.columnrange.zones</a>
   *
   * @implspec zones?: Array<PlotColumnrangeZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotColumnrangeZonesOptions> getZones();

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.zones">https://api.highcharts.com/highcharts/plotOptions.columnrange.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.zones">https://api.highcharts.com/highstock/plotOptions.columnrange.zones</a>
   *
   * @implspec zones?: Array<PlotColumnrangeZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotColumnrangeZonesOptions> value);

  /**
   */
  abstract class CompareBase extends JsEnum {
    public static final CompareBase VALUE_0 = JsEnum.of(0);

    public static final CompareBase VALUE_100 = JsEnum.of(100);
  }

  /**
   */
  abstract class FindNearestPointBy extends JsEnum {
    public static final FindNearestPointBy X = JsEnum.of("x");

    public static final FindNearestPointBy XY = JsEnum.of("xy");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }

  /**
   */
  abstract class PointIntervalUnit extends JsEnum {
    public static final PointIntervalUnit DAY = JsEnum.of("day");

    public static final PointIntervalUnit MONTH = JsEnum.of("month");

    public static final PointIntervalUnit YEAR = JsEnum.of("year");
  }
}
