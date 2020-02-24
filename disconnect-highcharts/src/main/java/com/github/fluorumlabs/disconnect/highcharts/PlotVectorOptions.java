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
 * (Highcharts, Highstock) A vector plot is a type of cartesian chart where each
 * point has an X and Y position, a length and a direction. Vectors are drawn as
 * arrows.
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
 * Options for all <code>vector</code> series are defined in plotOptions.vector.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector">https://api.highcharts.com/highcharts/plotOptions.vector</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector">https://api.highcharts.com/highstock/plotOptions.vector</a>
 *
 */
public interface PlotVectorOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.allAreas">https://api.highcharts.com/highmaps/plotOptions.vector.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.allAreas">https://api.highcharts.com/highmaps/plotOptions.vector.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.vector.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.vector.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.vector.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.vector.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.animation">https://api.highcharts.com/highcharts/plotOptions.vector.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.animation">https://api.highcharts.com/highstock/plotOptions.vector.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotVectorAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.animation">https://api.highcharts.com/highcharts/plotOptions.vector.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.animation">https://api.highcharts.com/highstock/plotOptions.vector.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotVectorAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.animation">https://api.highcharts.com/highcharts/plotOptions.vector.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.animation">https://api.highcharts.com/highstock/plotOptions.vector.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotVectorAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotVectorAnimationOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.animation">https://api.highcharts.com/highcharts/plotOptions.vector.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.animation">https://api.highcharts.com/highstock/plotOptions.vector.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotVectorAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.animationLimit">https://api.highcharts.com/highcharts/plotOptions.vector.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.animationLimit">https://api.highcharts.com/highstock/plotOptions.vector.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.animationLimit">https://api.highcharts.com/highcharts/plotOptions.vector.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.animationLimit">https://api.highcharts.com/highstock/plotOptions.vector.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highmaps, Highcharts) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.borderColor">https://api.highcharts.com/highmaps/plotOptions.vector.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.borderColor">https://api.highcharts.com/highcharts/plotOptions.vector.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highmaps, Highcharts) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.borderColor">https://api.highcharts.com/highmaps/plotOptions.vector.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.borderColor">https://api.highcharts.com/highcharts/plotOptions.vector.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highmaps, Highcharts) The border width of each map area.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.borderWidth">https://api.highcharts.com/highmaps/plotOptions.vector.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.borderWidth">https://api.highcharts.com/highcharts/plotOptions.vector.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps, Highcharts) The border width of each map area.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.borderWidth">https://api.highcharts.com/highmaps/plotOptions.vector.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.borderWidth">https://api.highcharts.com/highcharts/plotOptions.vector.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.className">https://api.highcharts.com/highcharts/plotOptions.vector.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.className">https://api.highcharts.com/highstock/plotOptions.vector.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.className">https://api.highcharts.com/highcharts/plotOptions.vector.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.className">https://api.highcharts.com/highstock/plotOptions.vector.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.clip">https://api.highcharts.com/highcharts/plotOptions.vector.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.clip">https://api.highcharts.com/highstock/plotOptions.vector.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.clip">https://api.highcharts.com/highcharts/plotOptions.vector.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.clip">https://api.highcharts.com/highstock/plotOptions.vector.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.color">https://api.highcharts.com/highcharts/plotOptions.vector.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.color">https://api.highcharts.com/highstock/plotOptions.vector.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.color">https://api.highcharts.com/highcharts/plotOptions.vector.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.color">https://api.highcharts.com/highstock/plotOptions.vector.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.color">https://api.highcharts.com/highcharts/plotOptions.vector.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.color">https://api.highcharts.com/highstock/plotOptions.vector.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.color">https://api.highcharts.com/highcharts/plotOptions.vector.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.color">https://api.highcharts.com/highstock/plotOptions.vector.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.colorAxis">https://api.highcharts.com/highmaps/plotOptions.vector.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.colorAxis">https://api.highcharts.com/highmaps/plotOptions.vector.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.colorIndex">https://api.highcharts.com/highcharts/plotOptions.vector.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.colorIndex">https://api.highcharts.com/highstock/plotOptions.vector.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.colorIndex">https://api.highcharts.com/highcharts/plotOptions.vector.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.colorIndex">https://api.highcharts.com/highstock/plotOptions.vector.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.compare">https://api.highcharts.com/highstock/plotOptions.vector.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.compare">https://api.highcharts.com/highstock/plotOptions.vector.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.compareBase">https://api.highcharts.com/highstock/plotOptions.vector.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.compareBase">https://api.highcharts.com/highstock/plotOptions.vector.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.compareStart">https://api.highcharts.com/highstock/plotOptions.vector.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.compareStart">https://api.highcharts.com/highstock/plotOptions.vector.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.connectors">https://api.highcharts.com/gantt/plotOptions.vector.connectors</a>
   *
   * @implspec connectors?: PlotVectorConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotVectorConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.connectors">https://api.highcharts.com/gantt/plotOptions.vector.connectors</a>
   *
   * @implspec connectors?: PlotVectorConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotVectorConnectorsOptions value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.cursor">https://api.highcharts.com/highcharts/plotOptions.vector.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.cursor">https://api.highcharts.com/highstock/plotOptions.vector.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.cursor">https://api.highcharts.com/highcharts/plotOptions.vector.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.cursor">https://api.highcharts.com/highstock/plotOptions.vector.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.cursor">https://api.highcharts.com/highcharts/plotOptions.vector.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.cursor">https://api.highcharts.com/highstock/plotOptions.vector.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts, Highstock) Options for the series data labels, appearing
   * next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dataLabels">https://api.highcharts.com/highcharts/plotOptions.vector.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dataLabels">https://api.highcharts.com/highstock/plotOptions.vector.dataLabels</a>
   *
   * @implspec dataLabels?: PlotVectorDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotVectorDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highstock) Options for the series data labels, appearing
   * next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dataLabels">https://api.highcharts.com/highcharts/plotOptions.vector.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dataLabels">https://api.highcharts.com/highstock/plotOptions.vector.dataLabels</a>
   *
   * @implspec dataLabels?: PlotVectorDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotVectorDataLabelsOptions value);

  /**
   * (Highcharts, Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.description">https://api.highcharts.com/highcharts/plotOptions.vector.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.description">https://api.highcharts.com/highstock/plotOptions.vector.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.description">https://api.highcharts.com/highcharts/plotOptions.vector.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.description">https://api.highcharts.com/highstock/plotOptions.vector.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop">https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dragDrop">https://api.highcharts.com/highstock/plotOptions.vector.dragDrop</a>
   *
   * @implspec dragDrop?: PlotVectorDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotVectorDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop">https://api.highcharts.com/highcharts/plotOptions.vector.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.dragDrop">https://api.highcharts.com/highstock/plotOptions.vector.dragDrop</a>
   *
   * @implspec dragDrop?: PlotVectorDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotVectorDragDropOptions value);

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.vector.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.vector.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.vector.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.vector.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.events">https://api.highcharts.com/highcharts/plotOptions.vector.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.events">https://api.highcharts.com/highstock/plotOptions.vector.events</a>
   *
   * @implspec events?: PlotVectorEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotVectorEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.events">https://api.highcharts.com/highcharts/plotOptions.vector.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.events">https://api.highcharts.com/highstock/plotOptions.vector.events</a>
   *
   * @implspec events?: PlotVectorEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotVectorEventsOptions value);

  /**
   * (Highcharts, Highstock) By default, series are exposed to screen readers
   * as regions. By enabling this option, the series element itself will be
   * exposed in the same way as the data points. This is useful if the series
   * is not used as a grouping entity in the chart, but you still want to
   * attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.vector.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.vector.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.vector.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.vector.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.vector.findNearestPointBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.vector.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.vector.findNearestPointBy</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.vector.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.vector.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.vector.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.vector.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.vector.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.vector.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.vector.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.joinBy">https://api.highcharts.com/highmaps/plotOptions.vector.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.joinBy">https://api.highcharts.com/highmaps/plotOptions.vector.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.joinBy">https://api.highcharts.com/highmaps/plotOptions.vector.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.keys">https://api.highcharts.com/highcharts/plotOptions.vector.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.keys">https://api.highcharts.com/highstock/plotOptions.vector.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.keys">https://api.highcharts.com/highcharts/plotOptions.vector.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.keys">https://api.highcharts.com/highstock/plotOptions.vector.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.label">https://api.highcharts.com/highcharts/plotOptions.vector.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.label">https://api.highcharts.com/highstock/plotOptions.vector.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.label">https://api.highcharts.com/gantt/plotOptions.vector.label</a>
   *
   * @implspec label?: PlotVectorLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotVectorLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.label">https://api.highcharts.com/highcharts/plotOptions.vector.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.label">https://api.highcharts.com/highstock/plotOptions.vector.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.label">https://api.highcharts.com/gantt/plotOptions.vector.label</a>
   *
   * @implspec label?: PlotVectorLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotVectorLabelOptions value);

  /**
   * (Highcharts, Highstock) The line width for each vector arrow.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.lineWidth">https://api.highcharts.com/highcharts/plotOptions.vector.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.lineWidth">https://api.highcharts.com/highstock/plotOptions.vector.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The line width for each vector arrow.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.lineWidth">https://api.highcharts.com/highcharts/plotOptions.vector.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.lineWidth">https://api.highcharts.com/highstock/plotOptions.vector.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.linkedTo">https://api.highcharts.com/highcharts/plotOptions.vector.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.linkedTo">https://api.highcharts.com/highstock/plotOptions.vector.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.linkedTo">https://api.highcharts.com/gantt/plotOptions.vector.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.linkedTo">https://api.highcharts.com/highcharts/plotOptions.vector.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.linkedTo">https://api.highcharts.com/highstock/plotOptions.vector.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.linkedTo">https://api.highcharts.com/gantt/plotOptions.vector.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.vector.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.vector.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor">https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.negativeColor">https://api.highcharts.com/highstock/plotOptions.vector.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor">https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.negativeColor">https://api.highcharts.com/highstock/plotOptions.vector.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor">https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.negativeColor">https://api.highcharts.com/highstock/plotOptions.vector.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor">https://api.highcharts.com/highcharts/plotOptions.vector.negativeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.negativeColor">https://api.highcharts.com/highstock/plotOptions.vector.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.point">https://api.highcharts.com/highcharts/plotOptions.vector.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.point">https://api.highcharts.com/highstock/plotOptions.vector.point</a>
   *
   * @implspec point?: PlotVectorPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotVectorPointOptions getPoint();

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.point">https://api.highcharts.com/highcharts/plotOptions.vector.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.point">https://api.highcharts.com/highstock/plotOptions.vector.point</a>
   *
   * @implspec point?: PlotVectorPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotVectorPointOptions value);

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.vector.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.vector.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.vector.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.vector.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointInterval">https://api.highcharts.com/highcharts/plotOptions.vector.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointInterval">https://api.highcharts.com/highstock/plotOptions.vector.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.pointInterval">https://api.highcharts.com/gantt/plotOptions.vector.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointInterval">https://api.highcharts.com/highcharts/plotOptions.vector.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointInterval">https://api.highcharts.com/highstock/plotOptions.vector.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.pointInterval">https://api.highcharts.com/gantt/plotOptions.vector.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.vector.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.vector.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.vector.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.vector.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.vector.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.vector.pointIntervalUnit</a>
   *
   * @implspec pointIntervalUnit?: (&quot;day&quot;|&quot;month&quot;|&quot;year&quot;);
   *
   */
  @JSProperty("pointIntervalUnit")
  void setPointIntervalUnit(PointIntervalUnit value);

  /**
   * (Highstock) The width of each point on the x axis. For example in a
   * column chart with one value each day, the pointRange would be 1 day (= 24
   *
   * <ul>
   * <li>
   * 3600
   *
   * </li>
   * <li>
   * 1000 milliseconds). This is normally computed automatically, but this
   * option can be used to override the automatic value.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointRange">https://api.highcharts.com/highstock/plotOptions.vector.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

  /**
   * (Highstock) The width of each point on the x axis. For example in a
   * column chart with one value each day, the pointRange would be 1 day (= 24
   *
   * <ul>
   * <li>
   * 3600
   *
   * </li>
   * <li>
   * 1000 milliseconds). This is normally computed automatically, but this
   * option can be used to override the automatic value.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointRange">https://api.highcharts.com/highstock/plotOptions.vector.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointStart">https://api.highcharts.com/highcharts/plotOptions.vector.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointStart">https://api.highcharts.com/highstock/plotOptions.vector.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.pointStart">https://api.highcharts.com/gantt/plotOptions.vector.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.pointStart">https://api.highcharts.com/highcharts/plotOptions.vector.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.pointStart">https://api.highcharts.com/highstock/plotOptions.vector.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.pointStart">https://api.highcharts.com/gantt/plotOptions.vector.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highcharts, Highstock) What part of the vector it should be rotated
   * around. Can be one of <code>start</code>, <code>center</code> and <code>end</code>. When <code>start</code>, the
   * vectors will start from the given [x, y] position, and when <code>end</code> the
   * vectors will end in the [x, y] position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.rotationOrigin">https://api.highcharts.com/highcharts/plotOptions.vector.rotationOrigin</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.rotationOrigin">https://api.highcharts.com/highstock/plotOptions.vector.rotationOrigin</a>
   *
   * @implspec rotationOrigin?: (&quot;center&quot;|&quot;end&quot;|&quot;start&quot;);
   *
   */
  @JSProperty("rotationOrigin")
  @Nullable
  RotationOrigin getRotationOrigin();

  /**
   * (Highcharts, Highstock) What part of the vector it should be rotated
   * around. Can be one of <code>start</code>, <code>center</code> and <code>end</code>. When <code>start</code>, the
   * vectors will start from the given [x, y] position, and when <code>end</code> the
   * vectors will end in the [x, y] position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.rotationOrigin">https://api.highcharts.com/highcharts/plotOptions.vector.rotationOrigin</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.rotationOrigin">https://api.highcharts.com/highstock/plotOptions.vector.rotationOrigin</a>
   *
   * @implspec rotationOrigin?: (&quot;center&quot;|&quot;end&quot;|&quot;start&quot;);
   *
   */
  @JSProperty("rotationOrigin")
  void setRotationOrigin(RotationOrigin value);

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.selected">https://api.highcharts.com/highcharts/plotOptions.vector.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.selected">https://api.highcharts.com/highstock/plotOptions.vector.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.selected">https://api.highcharts.com/highcharts/plotOptions.vector.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.selected">https://api.highcharts.com/highstock/plotOptions.vector.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.vector.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.showCheckbox">https://api.highcharts.com/highstock/plotOptions.vector.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.vector.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.showCheckbox">https://api.highcharts.com/highstock/plotOptions.vector.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.showInLegend">https://api.highcharts.com/highcharts/plotOptions.vector.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.showInLegend">https://api.highcharts.com/highstock/plotOptions.vector.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.showInLegend">https://api.highcharts.com/highcharts/plotOptions.vector.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.showInLegend">https://api.highcharts.com/highstock/plotOptions.vector.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.showInNavigator">https://api.highcharts.com/highstock/plotOptions.vector.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.showInNavigator">https://api.highcharts.com/highstock/plotOptions.vector.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.vector.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.vector.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.vector.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.vector.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts, Highstock) When this is true, the series will not cause the
   * Y axis to cross the zero plane (or threshold option) unless the data
   * actually crosses the plane.
   *
   * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
   * make the Y axis show negative values according to the <code>minPadding</code>
   * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.softThreshold">https://api.highcharts.com/highcharts/plotOptions.vector.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.softThreshold">https://api.highcharts.com/highstock/plotOptions.vector.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  boolean getSoftThreshold();

  /**
   * (Highcharts, Highstock) When this is true, the series will not cause the
   * Y axis to cross the zero plane (or threshold option) unless the data
   * actually crosses the plane.
   *
   * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
   * make the Y axis show negative values according to the <code>minPadding</code>
   * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.softThreshold">https://api.highcharts.com/highcharts/plotOptions.vector.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.softThreshold">https://api.highcharts.com/highstock/plotOptions.vector.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts, Highstock) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states">https://api.highcharts.com/highcharts/plotOptions.vector.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states">https://api.highcharts.com/highstock/plotOptions.vector.states</a>
   *
   * @implspec states?: PlotVectorStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotVectorStatesOptions getStates();

  /**
   * (Highcharts, Highstock) A wrapper object for all the series options in
   * specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states">https://api.highcharts.com/highcharts/plotOptions.vector.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states">https://api.highcharts.com/highstock/plotOptions.vector.states</a>
   *
   * @implspec states?: PlotVectorStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotVectorStatesOptions value);

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.vector.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.stickyTracking">https://api.highcharts.com/highstock/plotOptions.vector.stickyTracking</a>
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
   * series' graph or markers. This also implies the tooltip. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.vector.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.stickyTracking">https://api.highcharts.com/highstock/plotOptions.vector.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) The threshold, also called zero level or base
   * level. For line type series this is only used in conjunction with
   * negativeColor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.threshold">https://api.highcharts.com/highcharts/plotOptions.vector.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.threshold">https://api.highcharts.com/highstock/plotOptions.vector.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highcharts, Highstock) The threshold, also called zero level or base
   * level. For line type series this is only used in conjunction with
   * negativeColor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.threshold">https://api.highcharts.com/highcharts/plotOptions.vector.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.threshold">https://api.highcharts.com/highstock/plotOptions.vector.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.tooltip">https://api.highcharts.com/highcharts/plotOptions.vector.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.tooltip">https://api.highcharts.com/highstock/plotOptions.vector.tooltip</a>
   *
   * @implspec tooltip?: PlotVectorTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotVectorTooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.tooltip">https://api.highcharts.com/highcharts/plotOptions.vector.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.tooltip">https://api.highcharts.com/highstock/plotOptions.vector.tooltip</a>
   *
   * @implspec tooltip?: PlotVectorTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotVectorTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.vector.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.turboThreshold">https://api.highcharts.com/highstock/plotOptions.vector.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.turboThreshold">https://api.highcharts.com/gantt/plotOptions.vector.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.vector.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.turboThreshold">https://api.highcharts.com/highstock/plotOptions.vector.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.vector.turboThreshold">https://api.highcharts.com/gantt/plotOptions.vector.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts, Highstock) Maximum length of the arrows in the vector plot.
   * The individual arrow length is computed between 0 and this value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.vectorLength">https://api.highcharts.com/highcharts/plotOptions.vector.vectorLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.vectorLength">https://api.highcharts.com/highstock/plotOptions.vector.vectorLength</a>
   *
   * @implspec vectorLength?: number;
   *
   */
  @JSProperty("vectorLength")
  double getVectorLength();

  /**
   * (Highcharts, Highstock) Maximum length of the arrows in the vector plot.
   * The individual arrow length is computed between 0 and this value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.vectorLength">https://api.highcharts.com/highcharts/plotOptions.vector.vectorLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.vectorLength">https://api.highcharts.com/highstock/plotOptions.vector.vectorLength</a>
   *
   * @implspec vectorLength?: number;
   *
   */
  @JSProperty("vectorLength")
  void setVectorLength(double value);

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.visible">https://api.highcharts.com/highcharts/plotOptions.vector.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.visible">https://api.highcharts.com/highstock/plotOptions.vector.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.visible">https://api.highcharts.com/highcharts/plotOptions.vector.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.visible">https://api.highcharts.com/highstock/plotOptions.vector.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.zIndex">https://api.highcharts.com/highmaps/plotOptions.vector.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.zIndex">https://api.highcharts.com/highmaps/plotOptions.vector.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.vector.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.zoneAxis">https://api.highcharts.com/highstock/plotOptions.vector.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.vector.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.zoneAxis">https://api.highcharts.com/highstock/plotOptions.vector.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.zones">https://api.highcharts.com/highcharts/plotOptions.vector.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.zones">https://api.highcharts.com/highstock/plotOptions.vector.zones</a>
   *
   * @implspec zones?: Array<PlotVectorZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotVectorZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.zones">https://api.highcharts.com/highcharts/plotOptions.vector.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.zones">https://api.highcharts.com/highstock/plotOptions.vector.zones</a>
   *
   * @implspec zones?: Array<PlotVectorZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotVectorZonesOptions> value);

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

  /**
   */
  abstract class RotationOrigin extends JsEnum {
    public static final RotationOrigin CENTER = JsEnum.of("center");

    public static final RotationOrigin END = JsEnum.of("end");

    public static final RotationOrigin START = JsEnum.of("start");
  }
}
