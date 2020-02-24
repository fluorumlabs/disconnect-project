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
 * (Highstock) Pivot points indicator. This series requires the <code>linkedTo</code>
 * option to be set and should be loaded after <code>stock/indicators/indicators.js</code>
 * file.
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
 * Options for all <code>pivotpoints</code> series are defined in
 * plotOptions.pivotpoints.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints">https://api.highcharts.com/highstock/plotOptions.pivotpoints</a>
 *
 */
public interface PlotPivotpointsOptions extends Any {
  /**
   * (Highstock) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.pivotpoints.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highstock) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.pivotpoints.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highstock) Enable or disable the initial animation when a series is
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation">https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPivotpointsAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highstock) Enable or disable the initial animation when a series is
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation">https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPivotpointsAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highstock) Enable or disable the initial animation when a series is
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation">https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPivotpointsAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotPivotpointsAnimationOptions value);

  /**
   * (Highstock) Enable or disable the initial animation when a series is
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation">https://api.highcharts.com/highstock/plotOptions.pivotpoints.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPivotpointsAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highstock) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.animationLimit">https://api.highcharts.com/highstock/plotOptions.pivotpoints.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highstock) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.animationLimit">https://api.highcharts.com/highstock/plotOptions.pivotpoints.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highstock) Set the point threshold for when a series should enter boost
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.boostThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highstock) Set the point threshold for when a series should enter boost
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.boostThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.boostThreshold</a>
   *
   * @implspec boostThreshold?: number;
   *
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highmaps, Highcharts) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderColor">https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderColor">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderColor">https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderColor">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderWidth">https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderWidth">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderWidth">https://api.highcharts.com/highmaps/plotOptions.pivotpoints.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderWidth">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highstock) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.className">https://api.highcharts.com/highstock/plotOptions.pivotpoints.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highstock) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.className">https://api.highcharts.com/highstock/plotOptions.pivotpoints.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highstock) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.clip">https://api.highcharts.com/highstock/plotOptions.pivotpoints.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highstock) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.clip">https://api.highcharts.com/highstock/plotOptions.pivotpoints.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highstock) The main color of the series. In line type series it applies
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.color">https://api.highcharts.com/highstock/plotOptions.pivotpoints.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highstock) The main color of the series. In line type series it applies
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.color">https://api.highcharts.com/highstock/plotOptions.pivotpoints.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highstock) The main color of the series. In line type series it applies
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.color">https://api.highcharts.com/highstock/plotOptions.pivotpoints.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highstock) The main color of the series. In line type series it applies
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.color">https://api.highcharts.com/highstock/plotOptions.pivotpoints.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highstock) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.colorIndex">https://api.highcharts.com/highstock/plotOptions.pivotpoints.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highstock) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.colorIndex">https://api.highcharts.com/highstock/plotOptions.pivotpoints.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.compareStart">https://api.highcharts.com/highstock/plotOptions.pivotpoints.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.compareStart">https://api.highcharts.com/highstock/plotOptions.pivotpoints.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectEnds">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectEnds</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectEnds">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectEnds</a>
   *
   * @implspec connectEnds?: boolean;
   *
   */
  @JSProperty("connectEnds")
  void setConnectEnds(boolean value);

  /**
   * (Highcharts, Highstock) Whether to connect a graph line across null
   * points, or render a gap between the two points on either side of the
   * null.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectNulls">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectNulls</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.connectNulls">https://api.highcharts.com/highstock/plotOptions.pivotpoints.connectNulls</a>
   *
   * @implspec connectNulls?: boolean;
   *
   */
  @JSProperty("connectNulls")
  boolean getConnectNulls();

  /**
   * (Highcharts, Highstock) Whether to connect a graph line across null
   * points, or render a gap between the two points on either side of the
   * null.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectNulls">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.connectNulls</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.connectNulls">https://api.highcharts.com/highstock/plotOptions.pivotpoints.connectNulls</a>
   *
   * @implspec connectNulls?: boolean;
   *
   */
  @JSProperty("connectNulls")
  void setConnectNulls(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.connectors">https://api.highcharts.com/gantt/plotOptions.pivotpoints.connectors</a>
   *
   * @implspec connectors?: PlotPivotpointsConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotPivotpointsConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.connectors">https://api.highcharts.com/gantt/plotOptions.pivotpoints.connectors</a>
   *
   * @implspec connectors?: PlotPivotpointsConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotPivotpointsConnectorsOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.cropThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.cropThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.cropThreshold</a>
   *
   * @implspec cropThreshold?: number;
   *
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highstock) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.cursor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highstock) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.cursor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highstock) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.cursor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highstock) A name for the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dashStyle">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highstock) A name for the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dashStyle">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataGrouping">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotPivotpointsDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotPivotpointsDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataGrouping">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotPivotpointsDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotPivotpointsDataGroupingOptions value);

  /**
   * (Highstock) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataLabels">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataLabels</a>
   *
   * @implspec dataLabels?: PlotPivotpointsDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotPivotpointsDataLabelsOptions getDataLabels();

  /**
   * (Highstock) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataLabels">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dataLabels</a>
   *
   * @implspec dataLabels?: PlotPivotpointsDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotPivotpointsDataLabelsOptions value);

  /**
   * (Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.description">https://api.highcharts.com/highstock/plotOptions.pivotpoints.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highstock) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.description">https://api.highcharts.com/highstock/plotOptions.pivotpoints.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highstock) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dragDrop">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dragDrop</a>
   *
   * @implspec dragDrop?: PlotPivotpointsDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotPivotpointsDragDropOptions getDragDrop();

  /**
   * (Highstock) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.dragDrop">https://api.highcharts.com/highstock/plotOptions.pivotpoints.dragDrop</a>
   *
   * @implspec dragDrop?: PlotPivotpointsDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotPivotpointsDragDropOptions value);

  /**
   * (Highstock) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.pivotpoints.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highstock) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.pivotpoints.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highstock) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.events">https://api.highcharts.com/highstock/plotOptions.pivotpoints.events</a>
   *
   * @implspec events?: PlotPivotpointsEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPivotpointsEventsOptions getEvents();

  /**
   * (Highstock) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.events">https://api.highcharts.com/highstock/plotOptions.pivotpoints.events</a>
   *
   * @implspec events?: PlotPivotpointsEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPivotpointsEventsOptions value);

  /**
   * (Highstock) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.pivotpoints.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highstock) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.pivotpoints.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highstock) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.pivotpoints.findNearestPointBy</a>
   *
   * @implspec findNearestPointBy?: (&quot;x&quot;|&quot;xy&quot;);
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highstock) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.findNearestPointBy">https://api.highcharts.com/highstock/plotOptions.pivotpoints.findNearestPointBy</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapSize">https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapSize">https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapUnit">https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapUnit">https://api.highcharts.com/highstock/plotOptions.pivotpoints.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.pivotpoints.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.pivotpoints.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.pivotpoints.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.pivotpoints.getExtremesFromAll</a>
   *
   * @implspec getExtremesFromAll?: boolean;
   *
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.label">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.label">https://api.highcharts.com/highstock/plotOptions.pivotpoints.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.label">https://api.highcharts.com/gantt/plotOptions.pivotpoints.label</a>
   *
   * @implspec label?: PlotPivotpointsLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotPivotpointsLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.label">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.label">https://api.highcharts.com/highstock/plotOptions.pivotpoints.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.label">https://api.highcharts.com/gantt/plotOptions.pivotpoints.label</a>
   *
   * @implspec label?: PlotPivotpointsLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotPivotpointsLabelOptions value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linecap">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.linecap">https://api.highcharts.com/highstock/plotOptions.pivotpoints.linecap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linecap">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.linecap">https://api.highcharts.com/highstock/plotOptions.pivotpoints.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  void setLinecap(Linecap value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.lineWidth">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.lineWidth">https://api.highcharts.com/highstock/plotOptions.pivotpoints.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.lineWidth">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.lineWidth">https://api.highcharts.com/highstock/plotOptions.pivotpoints.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The main series ID that indicator will be
   * based on. Required for this indicator.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linkedTo">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.linkedTo">https://api.highcharts.com/highstock/plotOptions.pivotpoints.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.linkedTo">https://api.highcharts.com/gantt/plotOptions.pivotpoints.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  @Nullable
  String getLinkedTo();

  /**
   * (Highcharts, Highstock, Gantt) The main series ID that indicator will be
   * based on. Required for this indicator.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linkedTo">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.linkedTo">https://api.highcharts.com/highstock/plotOptions.pivotpoints.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.linkedTo">https://api.highcharts.com/gantt/plotOptions.pivotpoints.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highstock) Options for the point markers of line-like series. Properties
   * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
   * appearance of the markers. Other series types, like column series, don't
   * have markers, but have visual options on the series level instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker</a>
   *
   * @implspec marker?: PlotPivotpointsMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  PlotPivotpointsMarkerOptions getMarker();

  /**
   * (Highstock) Options for the point markers of line-like series. Properties
   * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
   * appearance of the markers. Other series types, like column series, don't
   * have markers, but have visual options on the series level instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker</a>
   *
   * @implspec marker?: PlotPivotpointsMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(PlotPivotpointsMarkerOptions value);

  /**
   * (Highstock) The name of the series as shown in the legend, tooltip etc.
   * If not set, it will be based on a technical indicator type and default
   * params.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.name">https://api.highcharts.com/highstock/plotOptions.pivotpoints.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highstock) The name of the series as shown in the legend, tooltip etc.
   * If not set, it will be based on a technical indicator type and default
   * params.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.name">https://api.highcharts.com/highstock/plotOptions.pivotpoints.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highstock) The color for the parts of the graph or points that are below
   * the threshold.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highstock) The color for the parts of the graph or points that are below
   * the threshold.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highstock) The color for the parts of the graph or points that are below
   * the threshold.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highstock) The color for the parts of the graph or points that are below
   * the threshold.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor">https://api.highcharts.com/highstock/plotOptions.pivotpoints.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * @implspec params?: PlotPivotpointsParamsOptions;
   *
   */
  @JSProperty("params")
  @Nullable
  PlotPivotpointsParamsOptions getParams();

  /**
   * @implspec params?: PlotPivotpointsParamsOptions;
   *
   */
  @JSProperty("params")
  void setParams(PlotPivotpointsParamsOptions value);

  /**
   * (Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.point">https://api.highcharts.com/highstock/plotOptions.pivotpoints.point</a>
   *
   * @implspec point?: PlotPivotpointsPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotPivotpointsPointOptions getPoint();

  /**
   * (Highstock) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.point">https://api.highcharts.com/highstock/plotOptions.pivotpoints.point</a>
   *
   * @implspec point?: PlotPivotpointsPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotPivotpointsPointOptions value);

  /**
   * (Highstock) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.pivotpoints.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highstock) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.pivotpoints.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highstock) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.selected">https://api.highcharts.com/highstock/plotOptions.pivotpoints.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highstock) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.selected">https://api.highcharts.com/highstock/plotOptions.pivotpoints.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highstock) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.shadow">https://api.highcharts.com/highstock/plotOptions.pivotpoints.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highstock) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.shadow">https://api.highcharts.com/highstock/plotOptions.pivotpoints.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highstock) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.shadow">https://api.highcharts.com/highstock/plotOptions.pivotpoints.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highstock) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.showCheckbox">https://api.highcharts.com/highstock/plotOptions.pivotpoints.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highstock) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.showCheckbox">https://api.highcharts.com/highstock/plotOptions.pivotpoints.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highstock) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.showInLegend">https://api.highcharts.com/highstock/plotOptions.pivotpoints.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highstock) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.showInLegend">https://api.highcharts.com/highstock/plotOptions.pivotpoints.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highstock) If set to <code>true</code>, the accessibility module will skip past the
   * points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.pivotpoints.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highstock) If set to <code>true</code>, the accessibility module will skip past the
   * points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.pivotpoints.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.softThreshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.softThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.softThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.softThreshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.softThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.softThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.softThreshold</a>
   *
   * @implspec softThreshold?: boolean;
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highstock) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states</a>
   *
   * @implspec states?: PlotPivotpointsStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotPivotpointsStatesOptions getStates();

  /**
   * (Highstock) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states</a>
   *
   * @implspec states?: PlotPivotpointsStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotPivotpointsStatesOptions value);

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.step">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.step</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.step">https://api.highcharts.com/highstock/plotOptions.pivotpoints.step</a>
   *
   * @implspec step?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("step")
  @Nullable
  Step getStep();

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.step">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.step</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.step">https://api.highcharts.com/highstock/plotOptions.pivotpoints.step</a>
   *
   * @implspec step?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("step")
  void setStep(Step value);

  /**
   * (Highstock) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip when not shared. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series. Defaults to true for line
   * and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.stickyTracking">https://api.highcharts.com/highstock/plotOptions.pivotpoints.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highstock) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip when not shared. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series. Defaults to true for line
   * and area type series, but to false for columns, pies etc.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.stickyTracking">https://api.highcharts.com/highstock/plotOptions.pivotpoints.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.threshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.threshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.threshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.threshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.threshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.threshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.threshold</a>
   *
   * @implspec threshold?: number;
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highstock) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.tooltip">https://api.highcharts.com/highstock/plotOptions.pivotpoints.tooltip</a>
   *
   * @implspec tooltip?: PlotPivotpointsTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotPivotpointsTooltipOptions getTooltip();

  /**
   * (Highstock) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.tooltip">https://api.highcharts.com/highstock/plotOptions.pivotpoints.tooltip</a>
   *
   * @implspec tooltip?: PlotPivotpointsTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotPivotpointsTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.turboThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.turboThreshold">https://api.highcharts.com/gantt/plotOptions.pivotpoints.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.turboThreshold">https://api.highcharts.com/highstock/plotOptions.pivotpoints.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pivotpoints.turboThreshold">https://api.highcharts.com/gantt/plotOptions.pivotpoints.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.visible">https://api.highcharts.com/highstock/plotOptions.pivotpoints.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highstock) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.visible">https://api.highcharts.com/highstock/plotOptions.pivotpoints.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pivotpoints.zIndex">https://api.highcharts.com/highmaps/plotOptions.pivotpoints.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pivotpoints.zIndex">https://api.highcharts.com/highmaps/plotOptions.pivotpoints.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.zoneAxis">https://api.highcharts.com/highstock/plotOptions.pivotpoints.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.zoneAxis">https://api.highcharts.com/highstock/plotOptions.pivotpoints.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zones">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.zones">https://api.highcharts.com/highstock/plotOptions.pivotpoints.zones</a>
   *
   * @implspec zones?: Array<PlotPivotpointsZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotPivotpointsZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zones">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.zones">https://api.highcharts.com/highstock/plotOptions.pivotpoints.zones</a>
   *
   * @implspec zones?: Array<PlotPivotpointsZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotPivotpointsZonesOptions> value);

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

  /**
   */
  abstract class Step extends JsEnum {
    public static final Step CENTER = JsEnum.of("center");

    public static final Step LEFT = JsEnum.of("left");

    public static final Step RIGHT = JsEnum.of("right");
  }
}
