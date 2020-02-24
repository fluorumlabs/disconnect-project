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
 * (Highcharts) A box plot is a convenient way of depicting groups of data
 * through their five-number summaries: the smallest observation (sample
 * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest
 * observation (sample maximum).
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
 * Options for all <code>boxplot</code> series are defined in plotOptions.boxplot.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot">https://api.highcharts.com/highcharts/plotOptions.boxplot</a>
 *
 */
public interface PlotBoxplotOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.allAreas">https://api.highcharts.com/highmaps/plotOptions.boxplot.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.allAreas">https://api.highcharts.com/highmaps/plotOptions.boxplot.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.boxplot.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.boxplot.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.animation">https://api.highcharts.com/highcharts/plotOptions.boxplot.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBoxplotAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.animation">https://api.highcharts.com/highcharts/plotOptions.boxplot.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBoxplotAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.animation">https://api.highcharts.com/highcharts/plotOptions.boxplot.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBoxplotAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.animation">https://api.highcharts.com/highcharts/plotOptions.boxplot.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotBoxplotAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotBoxplotAnimationOptions value);

  /**
   * (Highcharts) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.animationLimit">https://api.highcharts.com/highcharts/plotOptions.boxplot.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.animationLimit">https://api.highcharts.com/highcharts/plotOptions.boxplot.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts) Set the point threshold for when a series should enter boost
   * mode.
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highcharts) Set the point threshold for when a series should enter boost
   * mode.
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.boostThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.className">https://api.highcharts.com/highcharts/plotOptions.boxplot.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.className">https://api.highcharts.com/highcharts/plotOptions.boxplot.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.clip">https://api.highcharts.com/highcharts/plotOptions.boxplot.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.clip">https://api.highcharts.com/highcharts/plotOptions.boxplot.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.color">https://api.highcharts.com/highcharts/plotOptions.boxplot.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.color">https://api.highcharts.com/highcharts/plotOptions.boxplot.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.color">https://api.highcharts.com/highcharts/plotOptions.boxplot.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.color">https://api.highcharts.com/highcharts/plotOptions.boxplot.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.colorAxis">https://api.highcharts.com/highmaps/plotOptions.boxplot.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.colorAxis">https://api.highcharts.com/highmaps/plotOptions.boxplot.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.boxplot.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.colorByPoint">https://api.highcharts.com/highstock/plotOptions.boxplot.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.colorByPoint">https://api.highcharts.com/gantt/plotOptions.boxplot.colorByPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.boxplot.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.colorByPoint">https://api.highcharts.com/highstock/plotOptions.boxplot.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.colorByPoint">https://api.highcharts.com/gantt/plotOptions.boxplot.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.colorIndex">https://api.highcharts.com/highcharts/plotOptions.boxplot.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.colorIndex">https://api.highcharts.com/highcharts/plotOptions.boxplot.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.colors">https://api.highcharts.com/highcharts/plotOptions.boxplot.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.colors">https://api.highcharts.com/highstock/plotOptions.boxplot.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.colors">https://api.highcharts.com/gantt/plotOptions.boxplot.colors</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.colors">https://api.highcharts.com/highcharts/plotOptions.boxplot.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.colors">https://api.highcharts.com/highstock/plotOptions.boxplot.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.colors">https://api.highcharts.com/gantt/plotOptions.boxplot.colors</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.compare">https://api.highcharts.com/highstock/plotOptions.boxplot.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.compare">https://api.highcharts.com/highstock/plotOptions.boxplot.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.compareBase">https://api.highcharts.com/highstock/plotOptions.boxplot.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.compareBase">https://api.highcharts.com/highstock/plotOptions.boxplot.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.compareStart">https://api.highcharts.com/highstock/plotOptions.boxplot.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.compareStart">https://api.highcharts.com/highstock/plotOptions.boxplot.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.connectors">https://api.highcharts.com/gantt/plotOptions.boxplot.connectors</a>
   *
   * @implspec connectors?: PlotBoxplotConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotBoxplotConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.connectors">https://api.highcharts.com/gantt/plotOptions.boxplot.connectors</a>
   *
   * @implspec connectors?: PlotBoxplotConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotBoxplotConnectorsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When true, each column edge is rounded to
   * its nearest pixel in order to render sharp on screen. In some cases, when
   * there are a lot of densely packed columns, this leads to visible
   * difference in column widths or distance between columns. In these cases,
   * setting <code>crisp</code> to <code>false</code> may look better, even though each column is
   * rendered blurry.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.crisp">https://api.highcharts.com/highcharts/plotOptions.boxplot.crisp</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.crisp">https://api.highcharts.com/highstock/plotOptions.boxplot.crisp</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.crisp">https://api.highcharts.com/gantt/plotOptions.boxplot.crisp</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.crisp">https://api.highcharts.com/highcharts/plotOptions.boxplot.crisp</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.crisp">https://api.highcharts.com/highstock/plotOptions.boxplot.crisp</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.crisp">https://api.highcharts.com/gantt/plotOptions.boxplot.crisp</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.cropThreshold">https://api.highcharts.com/highstock/plotOptions.boxplot.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.cropThreshold">https://api.highcharts.com/gantt/plotOptions.boxplot.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.cropThreshold">https://api.highcharts.com/highstock/plotOptions.boxplot.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.cropThreshold">https://api.highcharts.com/gantt/plotOptions.boxplot.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.cursor">https://api.highcharts.com/highcharts/plotOptions.boxplot.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.cursor">https://api.highcharts.com/highcharts/plotOptions.boxplot.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.cursor">https://api.highcharts.com/highcharts/plotOptions.boxplot.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.dataGrouping">https://api.highcharts.com/highstock/plotOptions.boxplot.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotBoxplotDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotBoxplotDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.dataGrouping">https://api.highcharts.com/highstock/plotOptions.boxplot.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotBoxplotDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotBoxplotDataGroupingOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dataLabels">https://api.highcharts.com/highcharts/plotOptions.boxplot.dataLabels</a>
   *
   * @implspec dataLabels?: PlotBoxplotDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotBoxplotDataLabelsOptions getDataLabels();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dataLabels">https://api.highcharts.com/highcharts/plotOptions.boxplot.dataLabels</a>
   *
   * @implspec dataLabels?: PlotBoxplotDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotBoxplotDataLabelsOptions value);

  /**
   * (Highcharts) Depth of the columns in a 3D column chart. Requires
   * <code>highcharts-3d.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.depth">https://api.highcharts.com/highcharts/plotOptions.boxplot.depth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.depth">https://api.highcharts.com/highcharts/plotOptions.boxplot.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.description">https://api.highcharts.com/highcharts/plotOptions.boxplot.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.description">https://api.highcharts.com/highcharts/plotOptions.boxplot.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop</a>
   *
   * @implspec dragDrop?: PlotBoxplotDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotBoxplotDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop">https://api.highcharts.com/highcharts/plotOptions.boxplot.dragDrop</a>
   *
   * @implspec dragDrop?: PlotBoxplotDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotBoxplotDragDropOptions value);

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeColor</a>
   *
   * @implspec edgeColor?: ColorString;
   *
   */
  @JSProperty("edgeColor")
  void setEdgeColor(String value);

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  double getEdgeWidth();

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  void setEdgeWidth(double value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.boxplot.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.boxplot.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.events">https://api.highcharts.com/highcharts/plotOptions.boxplot.events</a>
   *
   * @implspec events?: PlotBoxplotEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBoxplotEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.events">https://api.highcharts.com/highcharts/plotOptions.boxplot.events</a>
   *
   * @implspec events?: PlotBoxplotEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBoxplotEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.boxplot.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.boxplot.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.fillColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.fillColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.fillColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.boxplot.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.findNearestPointBy">https://api.highcharts.com/highcharts/plotOptions.boxplot.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.boxplot.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.boxplot.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.boxplot.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.boxplot.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.boxplot.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.boxplot.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.grouping">https://api.highcharts.com/highcharts/plotOptions.boxplot.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.grouping">https://api.highcharts.com/highstock/plotOptions.boxplot.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.grouping">https://api.highcharts.com/gantt/plotOptions.boxplot.grouping</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.grouping">https://api.highcharts.com/highcharts/plotOptions.boxplot.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.grouping">https://api.highcharts.com/highstock/plotOptions.boxplot.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.grouping">https://api.highcharts.com/gantt/plotOptions.boxplot.grouping</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.groupPadding">https://api.highcharts.com/highcharts/plotOptions.boxplot.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.groupPadding">https://api.highcharts.com/highstock/plotOptions.boxplot.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.groupPadding">https://api.highcharts.com/gantt/plotOptions.boxplot.groupPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.groupPadding">https://api.highcharts.com/highcharts/plotOptions.boxplot.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.groupPadding">https://api.highcharts.com/highstock/plotOptions.boxplot.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.groupPadding">https://api.highcharts.com/gantt/plotOptions.boxplot.groupPadding</a>
   *
   * @implspec groupPadding?: number;
   *
   */
  @JSProperty("groupPadding")
  void setGroupPadding(double value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.joinBy">https://api.highcharts.com/highmaps/plotOptions.boxplot.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.joinBy">https://api.highcharts.com/highmaps/plotOptions.boxplot.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.joinBy">https://api.highcharts.com/highmaps/plotOptions.boxplot.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.keys">https://api.highcharts.com/highcharts/plotOptions.boxplot.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.keys">https://api.highcharts.com/highcharts/plotOptions.boxplot.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.label">https://api.highcharts.com/highcharts/plotOptions.boxplot.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.label">https://api.highcharts.com/highstock/plotOptions.boxplot.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.label">https://api.highcharts.com/gantt/plotOptions.boxplot.label</a>
   *
   * @implspec label?: PlotBoxplotLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotBoxplotLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.label">https://api.highcharts.com/highcharts/plotOptions.boxplot.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.label">https://api.highcharts.com/highstock/plotOptions.boxplot.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.label">https://api.highcharts.com/gantt/plotOptions.boxplot.label</a>
   *
   * @implspec label?: PlotBoxplotLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotBoxplotLabelOptions value);

  /**
   * (Highcharts) The width of the line surrounding the box. If any of
   * stemWidth, medianWidth or whiskerWidth are <code>null</code>, the lineWidth also
   * applies to these lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.lineWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts) The width of the line surrounding the box. If any of
   * stemWidth, medianWidth or whiskerWidth are <code>null</code>, the lineWidth also
   * applies to these lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.lineWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.linkedTo">https://api.highcharts.com/highcharts/plotOptions.boxplot.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.linkedTo">https://api.highcharts.com/highstock/plotOptions.boxplot.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.linkedTo">https://api.highcharts.com/gantt/plotOptions.boxplot.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.linkedTo">https://api.highcharts.com/highcharts/plotOptions.boxplot.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.linkedTo">https://api.highcharts.com/highstock/plotOptions.boxplot.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.linkedTo">https://api.highcharts.com/gantt/plotOptions.boxplot.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.boxplot.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.boxplot.maxPointWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.boxplot.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.boxplot.maxPointWidth</a>
   *
   * @implspec maxPointWidth?: number;
   *
   */
  @JSProperty("maxPointWidth")
  void setMaxPointWidth(double value);

  /**
   * (Highcharts) The color of the median line. If <code>undefined</code>, the general
   * series color applies.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.medianColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.medianColor</a>
   *
   * @implspec medianColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("medianColor")
  @Nullable
  Unknown getMedianColor();

  /**
   * (Highcharts) The color of the median line. If <code>undefined</code>, the general
   * series color applies.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.medianColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.medianColor</a>
   *
   * @implspec medianColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("medianColor")
  void setMedianColor(GradientColorObject value);

  /**
   * (Highcharts) The color of the median line. If <code>undefined</code>, the general
   * series color applies.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.medianColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.medianColor</a>
   *
   * @implspec medianColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("medianColor")
  void setMedianColor(String value);

  /**
   * (Highcharts) The pixel width of the median line. If <code>null</code>, the lineWidth
   * is used.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.medianWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.medianWidth</a>
   *
   * @implspec medianWidth?: number;
   *
   */
  @JSProperty("medianWidth")
  double getMedianWidth();

  /**
   * (Highcharts) The pixel width of the median line. If <code>null</code>, the lineWidth
   * is used.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.medianWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.medianWidth</a>
   *
   * @implspec medianWidth?: number;
   *
   */
  @JSProperty("medianWidth")
  void setMedianWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The minimal height for a column or width
   * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
   * to zero) point, set the minimal point length to a pixel value like 3. In
   * stacked column charts, minPointLength might not be respected for tightly
   * packed values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.minPointLength">https://api.highcharts.com/highcharts/plotOptions.boxplot.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.minPointLength">https://api.highcharts.com/highstock/plotOptions.boxplot.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.minPointLength">https://api.highcharts.com/gantt/plotOptions.boxplot.minPointLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.minPointLength">https://api.highcharts.com/highcharts/plotOptions.boxplot.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.minPointLength">https://api.highcharts.com/highstock/plotOptions.boxplot.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.minPointLength">https://api.highcharts.com/gantt/plotOptions.boxplot.minPointLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.boxplot.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.boxplot.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.point">https://api.highcharts.com/highcharts/plotOptions.boxplot.point</a>
   *
   * @implspec point?: PlotBoxplotPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotBoxplotPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.point">https://api.highcharts.com/highcharts/plotOptions.boxplot.point</a>
   *
   * @implspec point?: PlotBoxplotPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotBoxplotPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointInterval">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointInterval">https://api.highcharts.com/highstock/plotOptions.boxplot.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointInterval">https://api.highcharts.com/gantt/plotOptions.boxplot.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointInterval">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointInterval">https://api.highcharts.com/highstock/plotOptions.boxplot.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointInterval">https://api.highcharts.com/gantt/plotOptions.boxplot.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.boxplot.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.boxplot.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.boxplot.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.boxplot.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPadding">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointPadding">https://api.highcharts.com/highstock/plotOptions.boxplot.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointPadding">https://api.highcharts.com/gantt/plotOptions.boxplot.pointPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPadding">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointPadding">https://api.highcharts.com/highstock/plotOptions.boxplot.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointPadding">https://api.highcharts.com/gantt/plotOptions.boxplot.pointPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/highstock/plotOptions.boxplot.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/gantt/plotOptions.boxplot.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/highstock/plotOptions.boxplot.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/gantt/plotOptions.boxplot.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/highstock/plotOptions.boxplot.pointPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointPlacement">https://api.highcharts.com/gantt/plotOptions.boxplot.pointPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointRange">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointRange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointRange">https://api.highcharts.com/highstock/plotOptions.boxplot.pointRange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointRange">https://api.highcharts.com/gantt/plotOptions.boxplot.pointRange</a>
   *
   * @implspec pointRange?: (number|null);
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointRange">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointRange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointRange">https://api.highcharts.com/highstock/plotOptions.boxplot.pointRange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointRange">https://api.highcharts.com/gantt/plotOptions.boxplot.pointRange</a>
   *
   * @implspec pointRange?: (number|null);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointStart">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointStart">https://api.highcharts.com/highstock/plotOptions.boxplot.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointStart">https://api.highcharts.com/gantt/plotOptions.boxplot.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointStart">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointStart">https://api.highcharts.com/highstock/plotOptions.boxplot.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointStart">https://api.highcharts.com/gantt/plotOptions.boxplot.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointWidth">https://api.highcharts.com/highstock/plotOptions.boxplot.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointWidth">https://api.highcharts.com/gantt/plotOptions.boxplot.pointWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.pointWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.pointWidth">https://api.highcharts.com/highstock/plotOptions.boxplot.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.pointWidth">https://api.highcharts.com/gantt/plotOptions.boxplot.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.selected">https://api.highcharts.com/highcharts/plotOptions.boxplot.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.selected">https://api.highcharts.com/highcharts/plotOptions.boxplot.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.shadow">https://api.highcharts.com/highcharts/plotOptions.boxplot.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.shadow">https://api.highcharts.com/highcharts/plotOptions.boxplot.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.shadow">https://api.highcharts.com/highcharts/plotOptions.boxplot.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.boxplot.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.boxplot.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.showInLegend">https://api.highcharts.com/highcharts/plotOptions.boxplot.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.showInLegend">https://api.highcharts.com/highcharts/plotOptions.boxplot.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.showInNavigator">https://api.highcharts.com/highstock/plotOptions.boxplot.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.showInNavigator">https://api.highcharts.com/highstock/plotOptions.boxplot.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.boxplot.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.boxplot.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.softThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.softThreshold">https://api.highcharts.com/highstock/plotOptions.boxplot.softThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.softThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.softThreshold">https://api.highcharts.com/highstock/plotOptions.boxplot.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>. When stacking is enabled, data must be
   * sorted in ascending X order. A special stacking option is with the
   * streamgraph series type, where the stacking option is set to <code>&quot;stream&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stacking">https://api.highcharts.com/highcharts/plotOptions.boxplot.stacking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.stacking">https://api.highcharts.com/highstock/plotOptions.boxplot.stacking</a>
   *
   * @implspec stacking?: (&quot;normal&quot;|&quot;percent&quot;);
   *
   */
  @JSProperty("stacking")
  @Nullable
  Stacking getStacking();

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>. When stacking is enabled, data must be
   * sorted in ascending X order. A special stacking option is with the
   * streamgraph series type, where the stacking option is set to <code>&quot;stream&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stacking">https://api.highcharts.com/highcharts/plotOptions.boxplot.stacking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.stacking">https://api.highcharts.com/highstock/plotOptions.boxplot.stacking</a>
   *
   * @implspec stacking?: (&quot;normal&quot;|&quot;percent&quot;);
   *
   */
  @JSProperty("stacking")
  void setStacking(Stacking value);

  /**
   * (Highcharts) The color of the stem, the vertical line extending from the
   * box to the whiskers. If <code>undefined</code>, the series color is used.
   *
   * In styled mode, the stem stroke can be set with the
   * <code>.highcharts-boxplot-stem</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stemColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.stemColor</a>
   *
   * @implspec stemColor?: ColorString;
   *
   */
  @JSProperty("stemColor")
  @Nullable
  String getStemColor();

  /**
   * (Highcharts) The color of the stem, the vertical line extending from the
   * box to the whiskers. If <code>undefined</code>, the series color is used.
   *
   * In styled mode, the stem stroke can be set with the
   * <code>.highcharts-boxplot-stem</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stemColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.stemColor</a>
   *
   * @implspec stemColor?: ColorString;
   *
   */
  @JSProperty("stemColor")
  void setStemColor(String value);

  /**
   * (Highcharts) The dash style of the stem, the vertical line extending from
   * the box to the whiskers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stemDashStyle">https://api.highcharts.com/highcharts/plotOptions.boxplot.stemDashStyle</a>
   *
   * @implspec stemDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("stemDashStyle")
  @Nullable
  StemDashStyle getStemDashStyle();

  /**
   * (Highcharts) The dash style of the stem, the vertical line extending from
   * the box to the whiskers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stemDashStyle">https://api.highcharts.com/highcharts/plotOptions.boxplot.stemDashStyle</a>
   *
   * @implspec stemDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("stemDashStyle")
  void setStemDashStyle(StemDashStyle value);

  /**
   * (Highcharts) The width of the stem, the vertical line extending from the
   * box to the whiskers. If <code>undefined</code>, the width is inherited from the
   * lineWidth option.
   *
   * In styled mode, the stem stroke width can be set with the
   * <code>.highcharts-boxplot-stem</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stemWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.stemWidth</a>
   *
   * @implspec stemWidth?: number;
   *
   */
  @JSProperty("stemWidth")
  double getStemWidth();

  /**
   * (Highcharts) The width of the stem, the vertical line extending from the
   * box to the whiskers. If <code>undefined</code>, the width is inherited from the
   * lineWidth option.
   *
   * In styled mode, the stem stroke width can be set with the
   * <code>.highcharts-boxplot-stem</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stemWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.stemWidth</a>
   *
   * @implspec stemWidth?: number;
   *
   */
  @JSProperty("stemWidth")
  void setStemWidth(double value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.boxplot.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.boxplot.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) The Y axis value to serve as the base for the columns, for
   * distinguishing between values above and below a threshold. If <code>null</code>, the
   * columns extend from the padding Y axis minimum.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.threshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.threshold</a>
   *
   * @implspec threshold?: any;
   *
   */
  @JSProperty("threshold")
  @Nullable
  Any getThreshold();

  /**
   * (Highcharts) The Y axis value to serve as the base for the columns, for
   * distinguishing between values above and below a threshold. If <code>null</code>, the
   * columns extend from the padding Y axis minimum.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.threshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.threshold</a>
   *
   * @implspec threshold?: any;
   *
   */
  @JSProperty("threshold")
  void setThreshold(Any value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.tooltip">https://api.highcharts.com/highcharts/plotOptions.boxplot.tooltip</a>
   *
   * @implspec tooltip?: PlotBoxplotTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotBoxplotTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.tooltip">https://api.highcharts.com/highcharts/plotOptions.boxplot.tooltip</a>
   *
   * @implspec tooltip?: PlotBoxplotTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotBoxplotTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.turboThreshold">https://api.highcharts.com/highstock/plotOptions.boxplot.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.turboThreshold">https://api.highcharts.com/gantt/plotOptions.boxplot.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.boxplot.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.turboThreshold">https://api.highcharts.com/highstock/plotOptions.boxplot.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.boxplot.turboThreshold">https://api.highcharts.com/gantt/plotOptions.boxplot.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.visible">https://api.highcharts.com/highcharts/plotOptions.boxplot.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.visible">https://api.highcharts.com/highcharts/plotOptions.boxplot.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts) The color of the whiskers, the horizontal lines marking low
   * and high values. When <code>undefined</code>, the general series color is used.
   *
   * In styled mode, the whisker stroke can be set with the
   * <code>.highcharts-boxplot-whisker</code> class .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerColor</a>
   *
   * @implspec whiskerColor?: ColorString;
   *
   */
  @JSProperty("whiskerColor")
  @Nullable
  String getWhiskerColor();

  /**
   * (Highcharts) The color of the whiskers, the horizontal lines marking low
   * and high values. When <code>undefined</code>, the general series color is used.
   *
   * In styled mode, the whisker stroke can be set with the
   * <code>.highcharts-boxplot-whisker</code> class .
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerColor">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerColor</a>
   *
   * @implspec whiskerColor?: ColorString;
   *
   */
  @JSProperty("whiskerColor")
  void setWhiskerColor(String value);

  /**
   * (Highcharts) The length of the whiskers, the horizontal lines marking low
   * and high values. It can be a numerical pixel value, or a percentage value
   * of the box width. Set <code>0</code> to disable whiskers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerLength">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerLength</a>
   *
   * @implspec whiskerLength?: (number|string);
   *
   */
  @JSProperty("whiskerLength")
  @Nullable
  Unknown getWhiskerLength();

  /**
   * (Highcharts) The length of the whiskers, the horizontal lines marking low
   * and high values. It can be a numerical pixel value, or a percentage value
   * of the box width. Set <code>0</code> to disable whiskers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerLength">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerLength</a>
   *
   * @implspec whiskerLength?: (number|string);
   *
   */
  @JSProperty("whiskerLength")
  void setWhiskerLength(double value);

  /**
   * (Highcharts) The length of the whiskers, the horizontal lines marking low
   * and high values. It can be a numerical pixel value, or a percentage value
   * of the box width. Set <code>0</code> to disable whiskers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerLength">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerLength</a>
   *
   * @implspec whiskerLength?: (number|string);
   *
   */
  @JSProperty("whiskerLength")
  void setWhiskerLength(String value);

  /**
   * (Highcharts) The line width of the whiskers, the horizontal lines marking
   * low and high values. When <code>undefined</code>, the general lineWidth applies.
   *
   * In styled mode, the whisker stroke width can be set with the
   * <code>.highcharts-boxplot-whisker</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerWidth</a>
   *
   * @implspec whiskerWidth?: number;
   *
   */
  @JSProperty("whiskerWidth")
  double getWhiskerWidth();

  /**
   * (Highcharts) The line width of the whiskers, the horizontal lines marking
   * low and high values. When <code>undefined</code>, the general lineWidth applies.
   *
   * In styled mode, the whisker stroke width can be set with the
   * <code>.highcharts-boxplot-whisker</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerWidth">https://api.highcharts.com/highcharts/plotOptions.boxplot.whiskerWidth</a>
   *
   * @implspec whiskerWidth?: number;
   *
   */
  @JSProperty("whiskerWidth")
  void setWhiskerWidth(double value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.zIndex">https://api.highcharts.com/highmaps/plotOptions.boxplot.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.boxplot.zIndex">https://api.highcharts.com/highmaps/plotOptions.boxplot.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.boxplot.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.zoneAxis">https://api.highcharts.com/highstock/plotOptions.boxplot.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.boxplot.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.zoneAxis">https://api.highcharts.com/highstock/plotOptions.boxplot.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.zones">https://api.highcharts.com/highcharts/plotOptions.boxplot.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.zones">https://api.highcharts.com/highstock/plotOptions.boxplot.zones</a>
   *
   * @implspec zones?: Array<PlotBoxplotZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotBoxplotZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot.zones">https://api.highcharts.com/highcharts/plotOptions.boxplot.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.boxplot.zones">https://api.highcharts.com/highstock/plotOptions.boxplot.zones</a>
   *
   * @implspec zones?: Array<PlotBoxplotZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotBoxplotZonesOptions> value);

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
  abstract class Stacking extends JsEnum {
    public static final Stacking NORMAL = JsEnum.of("normal");

    public static final Stacking PERCENT = JsEnum.of("percent");
  }

  /**
   */
  abstract class StemDashStyle extends JsEnum {
    public static final StemDashStyle DASH = JsEnum.of("Dash");

    public static final StemDashStyle DASHDOT = JsEnum.of("DashDot");

    public static final StemDashStyle DOT = JsEnum.of("Dot");

    public static final StemDashStyle LONGDASH = JsEnum.of("LongDash");

    public static final StemDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final StemDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final StemDashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final StemDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final StemDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final StemDashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final StemDashStyle SOLID = JsEnum.of("Solid");
  }
}
