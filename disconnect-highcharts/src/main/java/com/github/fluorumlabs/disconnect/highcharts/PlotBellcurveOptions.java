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
 * (Highcharts) A bell curve is an areaspline series which represents the
 * probability density function of the normal distribution. It calculates mean
 * and standard deviation of the base series data and plots the curve according
 * to the calculated parameters.
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
 * Options for all <code>bellcurve</code> series are defined in plotOptions.bellcurve.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve">https://api.highcharts.com/highcharts/plotOptions.bellcurve</a>
 *
 */
public interface PlotBellcurveOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.allAreas">https://api.highcharts.com/highmaps/plotOptions.bellcurve.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.allAreas">https://api.highcharts.com/highmaps/plotOptions.bellcurve.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.bellcurve.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.bellcurve.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation">https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBellcurveAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation">https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBellcurveAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation">https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBellcurveAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotBellcurveAnimationOptions value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation">https://api.highcharts.com/highcharts/plotOptions.bellcurve.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBellcurveAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.animationLimit">https://api.highcharts.com/highcharts/plotOptions.bellcurve.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.animationLimit">https://api.highcharts.com/highcharts/plotOptions.bellcurve.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderColor">https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderColor">https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderWidth">https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderWidth">https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderWidth">https://api.highcharts.com/highmaps/plotOptions.bellcurve.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderWidth">https://api.highcharts.com/highcharts/plotOptions.bellcurve.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.className">https://api.highcharts.com/highcharts/plotOptions.bellcurve.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.className">https://api.highcharts.com/highcharts/plotOptions.bellcurve.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.clip">https://api.highcharts.com/highcharts/plotOptions.bellcurve.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.clip">https://api.highcharts.com/highcharts/plotOptions.bellcurve.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.color">https://api.highcharts.com/highcharts/plotOptions.bellcurve.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.color">https://api.highcharts.com/highcharts/plotOptions.bellcurve.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.color">https://api.highcharts.com/highcharts/plotOptions.bellcurve.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.color">https://api.highcharts.com/highcharts/plotOptions.bellcurve.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.colorAxis">https://api.highcharts.com/highmaps/plotOptions.bellcurve.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.colorAxis">https://api.highcharts.com/highmaps/plotOptions.bellcurve.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.colorIndex">https://api.highcharts.com/highcharts/plotOptions.bellcurve.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.colorIndex">https://api.highcharts.com/highcharts/plotOptions.bellcurve.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.compare">https://api.highcharts.com/highstock/plotOptions.bellcurve.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.compare">https://api.highcharts.com/highstock/plotOptions.bellcurve.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.compareBase">https://api.highcharts.com/highstock/plotOptions.bellcurve.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.compareBase">https://api.highcharts.com/highstock/plotOptions.bellcurve.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.compareStart">https://api.highcharts.com/highstock/plotOptions.bellcurve.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.compareStart">https://api.highcharts.com/highstock/plotOptions.bellcurve.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  void setCompareStart(boolean value);

  /**
   * (Highcharts) Polar charts only. Whether to connect the ends of a line
   * series plot across the extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.connectEnds">https://api.highcharts.com/highcharts/plotOptions.bellcurve.connectEnds</a>
   *
   * @implspec connectEnds?: boolean;
   *
   */
  @JSProperty("connectEnds")
  boolean getConnectEnds();

  /**
   * (Highcharts) Polar charts only. Whether to connect the ends of a line
   * series plot across the extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.connectEnds">https://api.highcharts.com/highcharts/plotOptions.bellcurve.connectEnds</a>
   *
   * @implspec connectEnds?: boolean;
   *
   */
  @JSProperty("connectEnds")
  void setConnectEnds(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.connectors">https://api.highcharts.com/gantt/plotOptions.bellcurve.connectors</a>
   *
   * @implspec connectors?: PlotBellcurveConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotBellcurveConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.connectors">https://api.highcharts.com/gantt/plotOptions.bellcurve.connectors</a>
   *
   * @implspec connectors?: PlotBellcurveConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotBellcurveConnectorsOptions value);

  /**
   * (Highcharts, Highstock) When the series contains less points than the
   * crop threshold, all points are drawn, even if the points fall outside the
   * visible plot area at the current zoom. The advantage of drawing all
   * points (including markers and columns), is that animation is performed on
   * updates. On the other hand, when the series contains more points than the
   * crop threshold, the series data is cropped to only contain points that
   * fall within the plot area. The advantage of cropping away invisible
   * points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.cropThreshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  double getCropThreshold();

  /**
   * (Highcharts, Highstock) When the series contains less points than the
   * crop threshold, all points are drawn, even if the points fall outside the
   * visible plot area at the current zoom. The advantage of drawing all
   * points (including markers and columns), is that animation is performed on
   * updates. On the other hand, when the series contains more points than the
   * crop threshold, the series data is cropped to only contain points that
   * fall within the plot area. The advantage of cropping away invisible
   * points is to increase performance on large series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.cropThreshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.cursor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.cursor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.cursor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts) A name for the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.dashStyle">https://api.highcharts.com/highcharts/plotOptions.bellcurve.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts) A name for the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.dashStyle">https://api.highcharts.com/highcharts/plotOptions.bellcurve.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(DashStyle value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.dataGrouping">https://api.highcharts.com/highstock/plotOptions.bellcurve.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotBellcurveDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotBellcurveDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.dataGrouping">https://api.highcharts.com/highstock/plotOptions.bellcurve.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotBellcurveDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotBellcurveDataGroupingOptions value);

  /**
   * (Highcharts) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.dataLabels">https://api.highcharts.com/highcharts/plotOptions.bellcurve.dataLabels</a>
   *
   * @implspec dataLabels?: PlotBellcurveDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotBellcurveDataLabelsOptions getDataLabels();

  /**
   * (Highcharts) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.dataLabels">https://api.highcharts.com/highcharts/plotOptions.bellcurve.dataLabels</a>
   *
   * @implspec dataLabels?: PlotBellcurveDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotBellcurveDataLabelsOptions value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.description">https://api.highcharts.com/highcharts/plotOptions.bellcurve.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.description">https://api.highcharts.com/highcharts/plotOptions.bellcurve.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.dragDrop">https://api.highcharts.com/highcharts/plotOptions.bellcurve.dragDrop</a>
   *
   * @implspec dragDrop?: PlotBellcurveDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotBellcurveDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.dragDrop">https://api.highcharts.com/highcharts/plotOptions.bellcurve.dragDrop</a>
   *
   * @implspec dragDrop?: PlotBellcurveDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotBellcurveDragDropOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.bellcurve.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.bellcurve.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.events">https://api.highcharts.com/highcharts/plotOptions.bellcurve.events</a>
   *
   * @implspec events?: PlotBellcurveEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBellcurveEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.events">https://api.highcharts.com/highcharts/plotOptions.bellcurve.events</a>
   *
   * @implspec events?: PlotBellcurveEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBellcurveEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.bellcurve.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.bellcurve.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock) Fill color or gradient for the area. When <code>null</code>,
   * the series' <code>color</code> is used with the series' <code>fillOpacity</code>.
   *
   * In styled mode, the fill color can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor">https://api.highcharts.com/highstock/plotOptions.bellcurve.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock) Fill opacity for the area. When you set an
   * explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you
   * should define the opacity in the <code>fillColor</code> with an rgba color
   * definition. The <code>fillOpacity</code> setting, also the default setting,
   * overrides the alpha component of the <code>color</code> setting.
   *
   * In styled mode, the fill opacity can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillOpacity">https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillOpacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.fillOpacity">https://api.highcharts.com/highstock/plotOptions.bellcurve.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highcharts, Highstock) Fill opacity for the area. When you set an
   * explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you
   * should define the opacity in the <code>fillColor</code> with an rgba color
   * definition. The <code>fillOpacity</code> setting, also the default setting,
   * overrides the alpha component of the <code>color</code> setting.
   *
   * In styled mode, the fill opacity can be set with the <code>.highcharts-area</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillOpacity">https://api.highcharts.com/highcharts/plotOptions.bellcurve.fillOpacity</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.fillOpacity">https://api.highcharts.com/highstock/plotOptions.bellcurve.fillOpacity</a>
   *
   * @implspec fillOpacity?: number;
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  /**
   * (Highcharts) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.bellcurve.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highcharts) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.bellcurve.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  void setFindNearestPointBy(FindNearestPointBy value);

  /**
   * (Highstock) Defines when to display a gap in the graph, together with the
   * gapUnit option.
   *
   * In case when <code>dataGrouping</code> is enabled, points can be grouped into a
   * larger time span. This can make the grouped points to have a greater
   * distance than the absolute value of <code>gapSize</code> property, which will result
   * in disappearing graph completely. To prevent this situation the mentioned
   * distance between grouped points is used instead of previously defined
   * <code>gapSize</code>.
   *
   * In practice, this option is most often used to visualize gaps in time
   * series. In a stock chart, intraday data is available for daytime hours,
   * while gaps will appear in nights and weekends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.gapSize">https://api.highcharts.com/highstock/plotOptions.bellcurve.gapSize</a>
   *
   * @implspec gapSize?: number;
   *
   */
  @JSProperty("gapSize")
  double getGapSize();

  /**
   * (Highstock) Defines when to display a gap in the graph, together with the
   * gapUnit option.
   *
   * In case when <code>dataGrouping</code> is enabled, points can be grouped into a
   * larger time span. This can make the grouped points to have a greater
   * distance than the absolute value of <code>gapSize</code> property, which will result
   * in disappearing graph completely. To prevent this situation the mentioned
   * distance between grouped points is used instead of previously defined
   * <code>gapSize</code>.
   *
   * In practice, this option is most often used to visualize gaps in time
   * series. In a stock chart, intraday data is available for daytime hours,
   * while gaps will appear in nights and weekends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.gapSize">https://api.highcharts.com/highstock/plotOptions.bellcurve.gapSize</a>
   *
   * @implspec gapSize?: number;
   *
   */
  @JSProperty("gapSize")
  void setGapSize(double value);

  /**
   * (Highstock) Together with gapSize, this option defines where to draw gaps
   * in the graph.
   *
   * When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means that if
   * the distance between two points is greater than five times that of the
   * two closest points, the graph will be broken.
   *
   * When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,
   * which on a datetime axis is milliseconds. This also applies to the
   * navigator series that inherits gap options from the base series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.gapUnit">https://api.highcharts.com/highstock/plotOptions.bellcurve.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  @Nullable
  GapUnit getGapUnit();

  /**
   * (Highstock) Together with gapSize, this option defines where to draw gaps
   * in the graph.
   *
   * When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means that if
   * the distance between two points is greater than five times that of the
   * two closest points, the graph will be broken.
   *
   * When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,
   * which on a datetime axis is milliseconds. This also applies to the
   * navigator series that inherits gap options from the base series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.gapUnit">https://api.highcharts.com/highstock/plotOptions.bellcurve.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(GapUnit value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.bellcurve.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.bellcurve.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.bellcurve.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.bellcurve.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.bellcurve.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.bellcurve.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

  /**
   * (Highcharts) This option allows to define the length of the bell curve. A
   * unit of the length of the bell curve is standard deviation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.intervals">https://api.highcharts.com/highcharts/plotOptions.bellcurve.intervals</a>
   *
   * @implspec intervals?: number;
   *
   */
  @JSProperty("intervals")
  double getIntervals();

  /**
   * (Highcharts) This option allows to define the length of the bell curve. A
   * unit of the length of the bell curve is standard deviation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.intervals">https://api.highcharts.com/highcharts/plotOptions.bellcurve.intervals</a>
   *
   * @implspec intervals?: number;
   *
   */
  @JSProperty("intervals")
  void setIntervals(double value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.joinBy">https://api.highcharts.com/highmaps/plotOptions.bellcurve.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.joinBy">https://api.highcharts.com/highmaps/plotOptions.bellcurve.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.joinBy">https://api.highcharts.com/highmaps/plotOptions.bellcurve.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String[] value);

  /**
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.keys">https://api.highcharts.com/highcharts/plotOptions.bellcurve.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.keys">https://api.highcharts.com/highcharts/plotOptions.bellcurve.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.label">https://api.highcharts.com/highcharts/plotOptions.bellcurve.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.label">https://api.highcharts.com/highstock/plotOptions.bellcurve.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.label">https://api.highcharts.com/gantt/plotOptions.bellcurve.label</a>
   *
   * @implspec label?: PlotBellcurveLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotBellcurveLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.label">https://api.highcharts.com/highcharts/plotOptions.bellcurve.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.label">https://api.highcharts.com/highstock/plotOptions.bellcurve.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.label">https://api.highcharts.com/gantt/plotOptions.bellcurve.label</a>
   *
   * @implspec label?: PlotBellcurveLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotBellcurveLabelOptions value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.linecap">https://api.highcharts.com/highcharts/plotOptions.bellcurve.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.linecap">https://api.highcharts.com/highstock/plotOptions.bellcurve.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  @Nullable
  Linecap getLinecap();

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.linecap">https://api.highcharts.com/highcharts/plotOptions.bellcurve.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.linecap">https://api.highcharts.com/highstock/plotOptions.bellcurve.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  void setLinecap(Linecap value);

  /**
   * (Highcharts, Highstock) A separate color for the graph line. By default
   * the line takes the <code>color</code> of the series, but the lineColor setting
   * allows setting a separate color for the line without altering the
   * <code>fillColor</code>.
   *
   * In styled mode, the line stroke can be set with the <code>.highcharts-graph</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.lineColor">https://api.highcharts.com/highstock/plotOptions.bellcurve.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock) A separate color for the graph line. By default
   * the line takes the <code>color</code> of the series, but the lineColor setting
   * allows setting a separate color for the line without altering the
   * <code>fillColor</code>.
   *
   * In styled mode, the line stroke can be set with the <code>.highcharts-graph</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.lineColor">https://api.highcharts.com/highstock/plotOptions.bellcurve.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineWidth">https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.lineWidth">https://api.highcharts.com/highstock/plotOptions.bellcurve.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineWidth">https://api.highcharts.com/highcharts/plotOptions.bellcurve.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.lineWidth">https://api.highcharts.com/highstock/plotOptions.bellcurve.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.linkedTo">https://api.highcharts.com/highcharts/plotOptions.bellcurve.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.linkedTo">https://api.highcharts.com/highstock/plotOptions.bellcurve.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.linkedTo">https://api.highcharts.com/gantt/plotOptions.bellcurve.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.linkedTo">https://api.highcharts.com/highcharts/plotOptions.bellcurve.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.linkedTo">https://api.highcharts.com/highstock/plotOptions.bellcurve.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.linkedTo">https://api.highcharts.com/gantt/plotOptions.bellcurve.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts) Options for the point markers of line-like series.
   * Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the
   * visual appearance of the markers. Other series types, like column series,
   * don't have markers, but have visual options on the series level instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker</a>
   *
   * @implspec marker?: PlotBellcurveMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotBellcurveMarkerOptions getMarker();

  /**
   * (Highcharts) Options for the point markers of line-like series.
   * Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the
   * visual appearance of the markers. Other series types, like column series,
   * don't have markers, but have visual options on the series level instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker</a>
   *
   * @implspec marker?: PlotBellcurveMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotBellcurveMarkerOptions value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.bellcurve.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.bellcurve.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highcharts) The color for the parts of the graph or points that are
   * below the threshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  @Nullable
  Unknown getNegativefillColor();

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  void setNegativefillColor(GradientColorObject value);

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  void setNegativefillColor(String value);

  /**
   * (Highcharts) A separate color for the negative part of the area.
   *
   * In styled mode, a negative color is set with the <code>.highcharts-negative</code>
   * class name.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor">https://api.highcharts.com/highcharts/plotOptions.bellcurve.negativeFillColor</a>
   *
   * @implspec negativefillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativefillColor")
  void setNegativefillColor(Any value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.point">https://api.highcharts.com/highcharts/plotOptions.bellcurve.point</a>
   *
   * @implspec point?: PlotBellcurvePointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotBellcurvePointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.point">https://api.highcharts.com/highcharts/plotOptions.bellcurve.point</a>
   *
   * @implspec point?: PlotBellcurvePointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotBellcurvePointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/gantt/plotOptions.bellcurve.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/gantt/plotOptions.bellcurve.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.pointPlacement">https://api.highcharts.com/gantt/plotOptions.bellcurve.pointPlacement</a>
   *
   * @implspec pointPlacement?: (number|string);
   *
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(String value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointRange">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointRange">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts) Defines how many points should be plotted within 1 interval.
   * See <code>plotOptions.bellcurve.intervals</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointsInInterval">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointsInInterval</a>
   *
   * @implspec pointsInInterval?: number;
   *
   */
  @JSProperty("pointsInInterval")
  double getPointsInInterval();

  /**
   * (Highcharts) Defines how many points should be plotted within 1 interval.
   * See <code>plotOptions.bellcurve.intervals</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointsInInterval">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointsInInterval</a>
   *
   * @implspec pointsInInterval?: number;
   *
   */
  @JSProperty("pointsInInterval")
  void setPointsInInterval(double value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointStart">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointStart">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.pointStart">https://api.highcharts.com/gantt/plotOptions.bellcurve.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointStart">https://api.highcharts.com/highcharts/plotOptions.bellcurve.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.pointStart">https://api.highcharts.com/highstock/plotOptions.bellcurve.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.pointStart">https://api.highcharts.com/gantt/plotOptions.bellcurve.pointStart</a>
   *
   * @implspec pointStart?: number;
   *
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.selected">https://api.highcharts.com/highcharts/plotOptions.bellcurve.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.selected">https://api.highcharts.com/highcharts/plotOptions.bellcurve.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.shadow">https://api.highcharts.com/highcharts/plotOptions.bellcurve.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.shadow">https://api.highcharts.com/highcharts/plotOptions.bellcurve.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.shadow">https://api.highcharts.com/highcharts/plotOptions.bellcurve.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.bellcurve.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.bellcurve.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.showInLegend">https://api.highcharts.com/highcharts/plotOptions.bellcurve.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.showInLegend">https://api.highcharts.com/highcharts/plotOptions.bellcurve.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.showInNavigator">https://api.highcharts.com/highstock/plotOptions.bellcurve.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.showInNavigator">https://api.highcharts.com/highstock/plotOptions.bellcurve.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.bellcurve.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.bellcurve.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.softThreshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.softThreshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.softThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.softThreshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.softThreshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states</a>
   *
   * @implspec states?: PlotBellcurveStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotBellcurveStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states</a>
   *
   * @implspec states?: PlotBellcurveStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotBellcurveStatesOptions value);

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip when not shared. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series. Defaults to true for line
   * and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.bellcurve.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip when not shared. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series. Defaults to true for line
   * and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.bellcurve.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) The Y axis value to serve as the base for the
   * area, for distinguishing between values above and below a threshold. The
   * area between the graph and the threshold is filled.
   *
   * <ul>
   * <li>
   * If a number is given, the Y axis will scale to the threshold.
   *
   * </li>
   * <li>
   * If <code>null</code>, the scaling behaves like a line series with fill between the
   * graph and the Y axis minimum.
   *
   * </li>
   * <li>
   * If <code>Infinity</code> or <code>-Infinity</code>, the area between the graph and the
   * corresponing Y axis extreme is filled (since v6.1.0).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.threshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.threshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highcharts, Highstock) The Y axis value to serve as the base for the
   * area, for distinguishing between values above and below a threshold. The
   * area between the graph and the threshold is filled.
   *
   * <ul>
   * <li>
   * If a number is given, the Y axis will scale to the threshold.
   *
   * </li>
   * <li>
   * If <code>null</code>, the scaling behaves like a line series with fill between the
   * graph and the Y axis minimum.
   *
   * </li>
   * <li>
   * If <code>Infinity</code> or <code>-Infinity</code>, the area between the graph and the
   * corresponing Y axis extreme is filled (since v6.1.0).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.threshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.threshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip</a>
   *
   * @implspec tooltip?: PlotBellcurveTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotBellcurveTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip">https://api.highcharts.com/highcharts/plotOptions.bellcurve.tooltip</a>
   *
   * @implspec tooltip?: PlotBellcurveTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotBellcurveTooltipOptions value);

  /**
   * (Highcharts, Highstock) Whether the whole area or just the line should
   * respond to mouseover tooltips and other mouse or touch events.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.trackByArea">https://api.highcharts.com/highcharts/plotOptions.bellcurve.trackByArea</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.trackByArea">https://api.highcharts.com/highstock/plotOptions.bellcurve.trackByArea</a>
   *
   * @implspec trackByArea?: boolean;
   *
   */
  @JSProperty("trackByArea")
  boolean getTrackByArea();

  /**
   * (Highcharts, Highstock) Whether the whole area or just the line should
   * respond to mouseover tooltips and other mouse or touch events.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.trackByArea">https://api.highcharts.com/highcharts/plotOptions.bellcurve.trackByArea</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.trackByArea">https://api.highcharts.com/highstock/plotOptions.bellcurve.trackByArea</a>
   *
   * @implspec trackByArea?: boolean;
   *
   */
  @JSProperty("trackByArea")
  void setTrackByArea(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.turboThreshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.turboThreshold">https://api.highcharts.com/gantt/plotOptions.bellcurve.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.bellcurve.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.turboThreshold">https://api.highcharts.com/highstock/plotOptions.bellcurve.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bellcurve.turboThreshold">https://api.highcharts.com/gantt/plotOptions.bellcurve.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.visible">https://api.highcharts.com/highcharts/plotOptions.bellcurve.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.visible">https://api.highcharts.com/highcharts/plotOptions.bellcurve.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.zIndex">https://api.highcharts.com/highmaps/plotOptions.bellcurve.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.zIndex">https://api.highcharts.com/highmaps/plotOptions.bellcurve.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.bellcurve.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.zoneAxis">https://api.highcharts.com/highstock/plotOptions.bellcurve.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.bellcurve.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.zoneAxis">https://api.highcharts.com/highstock/plotOptions.bellcurve.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.zones">https://api.highcharts.com/highcharts/plotOptions.bellcurve.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.zones">https://api.highcharts.com/highstock/plotOptions.bellcurve.zones</a>
   *
   * @implspec zones?: Array<PlotBellcurveZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotBellcurveZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.zones">https://api.highcharts.com/highcharts/plotOptions.bellcurve.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.zones">https://api.highcharts.com/highstock/plotOptions.bellcurve.zones</a>
   *
   * @implspec zones?: Array<PlotBellcurveZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotBellcurveZonesOptions> value);

  /**
   */
  abstract class CompareBase extends JsEnum {
    public static final CompareBase VALUE_0 = JsEnum.of(0);

    public static final CompareBase VALUE_100 = JsEnum.of(100);
  }

  /**
   */
  abstract class DashStyle extends JsEnum {
    public static final DashStyle DASH = JsEnum.of("Dash");

    public static final DashStyle DASHDOT = JsEnum.of("DashDot");

    public static final DashStyle DOT = JsEnum.of("Dot");

    public static final DashStyle LONGDASH = JsEnum.of("LongDash");

    public static final DashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final DashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final DashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final DashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final DashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final DashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final DashStyle SOLID = JsEnum.of("Solid");
  }

  /**
   */
  abstract class FindNearestPointBy extends JsEnum {
    public static final FindNearestPointBy X = JsEnum.of("x");

    public static final FindNearestPointBy XY = JsEnum.of("xy");
  }

  /**
   */
  abstract class GapUnit extends JsEnum {
    public static final GapUnit RELATIVE = JsEnum.of("relative");

    public static final GapUnit VALUE = JsEnum.of("value");
  }

  /**
   */
  abstract class Linecap extends JsEnum {
    public static final Linecap BUTT = JsEnum.of("butt");

    public static final Linecap ROUND = JsEnum.of("round");

    public static final Linecap SQUARE = JsEnum.of("square");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }
}
