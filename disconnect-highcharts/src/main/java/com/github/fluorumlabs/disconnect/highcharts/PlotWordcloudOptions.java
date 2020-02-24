package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A word cloud is a visualization of a set of words, where the
 * size and placement of a word is determined by how it is weighted.
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
 * Options for all <code>wordcloud</code> series are defined in plotOptions.wordcloud.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud">https://api.highcharts.com/highcharts/plotOptions.wordcloud</a>
 *
 */
public interface PlotWordcloudOptions extends Any {
  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.wordcloud.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.wordcloud.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.animation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.animation</a>
   *
   * @implspec animation?: PlotWordcloudAnimationOptions;
   *
   */
  @JSProperty("animation")
  @Nullable
  PlotWordcloudAnimationOptions getAnimation();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.animation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.animation</a>
   *
   * @implspec animation?: PlotWordcloudAnimationOptions;
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotWordcloudAnimationOptions value);

  /**
   * (Highcharts) For some series, there is a limit that shuts down initial
   * animation by default when the total number of points in the chart is too
   * high. For example, for a column chart and its derivatives, animation
   * doesn't run if there is more than 250 points totally. To disable this
   * cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.animationLimit">https://api.highcharts.com/highcharts/plotOptions.wordcloud.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.animationLimit">https://api.highcharts.com/highcharts/plotOptions.wordcloud.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderColor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.borderColor">https://api.highcharts.com/highstock/plotOptions.wordcloud.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.borderColor">https://api.highcharts.com/gantt/plotOptions.wordcloud.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderColor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.borderColor">https://api.highcharts.com/highstock/plotOptions.wordcloud.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.borderColor">https://api.highcharts.com/gantt/plotOptions.wordcloud.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderRadius">https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.borderRadius">https://api.highcharts.com/highstock/plotOptions.wordcloud.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.borderRadius">https://api.highcharts.com/gantt/plotOptions.wordcloud.borderRadius</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderRadius">https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.borderRadius">https://api.highcharts.com/highstock/plotOptions.wordcloud.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.borderRadius">https://api.highcharts.com/gantt/plotOptions.wordcloud.borderRadius</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderWidth">https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.borderWidth">https://api.highcharts.com/highstock/plotOptions.wordcloud.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.borderWidth">https://api.highcharts.com/gantt/plotOptions.wordcloud.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderWidth">https://api.highcharts.com/highcharts/plotOptions.wordcloud.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.borderWidth">https://api.highcharts.com/highstock/plotOptions.wordcloud.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.borderWidth">https://api.highcharts.com/gantt/plotOptions.wordcloud.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.className">https://api.highcharts.com/highcharts/plotOptions.wordcloud.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.className">https://api.highcharts.com/highcharts/plotOptions.wordcloud.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.color">https://api.highcharts.com/highcharts/plotOptions.wordcloud.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.colorByPoint">https://api.highcharts.com/highstock/plotOptions.wordcloud.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.colorByPoint">https://api.highcharts.com/gantt/plotOptions.wordcloud.colorByPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.colorByPoint">https://api.highcharts.com/highstock/plotOptions.wordcloud.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.colorByPoint">https://api.highcharts.com/gantt/plotOptions.wordcloud.colorByPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorIndex">https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorIndex">https://api.highcharts.com/highcharts/plotOptions.wordcloud.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.colors">https://api.highcharts.com/highcharts/plotOptions.wordcloud.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.colors">https://api.highcharts.com/highstock/plotOptions.wordcloud.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.colors">https://api.highcharts.com/gantt/plotOptions.wordcloud.colors</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.colors">https://api.highcharts.com/highcharts/plotOptions.wordcloud.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.colors">https://api.highcharts.com/highstock/plotOptions.wordcloud.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.colors">https://api.highcharts.com/gantt/plotOptions.wordcloud.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  void setColors(String[] value);

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.compareStart">https://api.highcharts.com/highstock/plotOptions.wordcloud.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.compareStart">https://api.highcharts.com/highstock/plotOptions.wordcloud.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.connectors">https://api.highcharts.com/gantt/plotOptions.wordcloud.connectors</a>
   *
   * @implspec connectors?: PlotWordcloudConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotWordcloudConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.connectors">https://api.highcharts.com/gantt/plotOptions.wordcloud.connectors</a>
   *
   * @implspec connectors?: PlotWordcloudConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotWordcloudConnectorsOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.wordcloud.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.cropThreshold">https://api.highcharts.com/highstock/plotOptions.wordcloud.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.cropThreshold">https://api.highcharts.com/gantt/plotOptions.wordcloud.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.cropThreshold">https://api.highcharts.com/highcharts/plotOptions.wordcloud.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.cropThreshold">https://api.highcharts.com/highstock/plotOptions.wordcloud.cropThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.cropThreshold">https://api.highcharts.com/gantt/plotOptions.wordcloud.cropThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.cursor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.cursor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.cursor">https://api.highcharts.com/highcharts/plotOptions.wordcloud.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.description">https://api.highcharts.com/highcharts/plotOptions.wordcloud.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.description">https://api.highcharts.com/highcharts/plotOptions.wordcloud.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.dragDrop">https://api.highcharts.com/highcharts/plotOptions.wordcloud.dragDrop</a>
   *
   * @implspec dragDrop?: PlotWordcloudDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotWordcloudDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.dragDrop">https://api.highcharts.com/highcharts/plotOptions.wordcloud.dragDrop</a>
   *
   * @implspec dragDrop?: PlotWordcloudDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotWordcloudDragDropOptions value);

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.wordcloud.edgeWidth</a>
   *
   * @implspec edgeWidth?: number;
   *
   */
  @JSProperty("edgeWidth")
  double getEdgeWidth();

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.edgeWidth">https://api.highcharts.com/highcharts/plotOptions.wordcloud.edgeWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.wordcloud.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.wordcloud.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.events">https://api.highcharts.com/highcharts/plotOptions.wordcloud.events</a>
   *
   * @implspec events?: PlotWordcloudEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotWordcloudEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.events">https://api.highcharts.com/highcharts/plotOptions.wordcloud.events</a>
   *
   * @implspec events?: PlotWordcloudEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotWordcloudEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.wordcloud.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.wordcloud.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.keys">https://api.highcharts.com/highcharts/plotOptions.wordcloud.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.keys">https://api.highcharts.com/highcharts/plotOptions.wordcloud.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.label">https://api.highcharts.com/highcharts/plotOptions.wordcloud.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.label">https://api.highcharts.com/highstock/plotOptions.wordcloud.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.label">https://api.highcharts.com/gantt/plotOptions.wordcloud.label</a>
   *
   * @implspec label?: PlotWordcloudLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotWordcloudLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.label">https://api.highcharts.com/highcharts/plotOptions.wordcloud.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.label">https://api.highcharts.com/highstock/plotOptions.wordcloud.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.label">https://api.highcharts.com/gantt/plotOptions.wordcloud.label</a>
   *
   * @implspec label?: PlotWordcloudLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotWordcloudLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.linkedTo">https://api.highcharts.com/highcharts/plotOptions.wordcloud.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.linkedTo">https://api.highcharts.com/highstock/plotOptions.wordcloud.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.linkedTo">https://api.highcharts.com/gantt/plotOptions.wordcloud.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.linkedTo">https://api.highcharts.com/highcharts/plotOptions.wordcloud.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.linkedTo">https://api.highcharts.com/highstock/plotOptions.wordcloud.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.linkedTo">https://api.highcharts.com/gantt/plotOptions.wordcloud.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts) The word with the largest weight will have a font size equal
   * to this value. The font size of a word is the ratio between its weight
   * and the largest occuring weight, multiplied with the value of
   * maxFontSize.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.maxFontSize">https://api.highcharts.com/highcharts/plotOptions.wordcloud.maxFontSize</a>
   *
   * @implspec maxFontSize?: number;
   *
   */
  @JSProperty("maxFontSize")
  double getMaxFontSize();

  /**
   * (Highcharts) The word with the largest weight will have a font size equal
   * to this value. The font size of a word is the ratio between its weight
   * and the largest occuring weight, multiplied with the value of
   * maxFontSize.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.maxFontSize">https://api.highcharts.com/highcharts/plotOptions.wordcloud.maxFontSize</a>
   *
   * @implspec maxFontSize?: number;
   *
   */
  @JSProperty("maxFontSize")
  void setMaxFontSize(double value);

  /**
   * (Highcharts) A threshold determining the minimum font size that can be
   * applied to a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.minFontSize">https://api.highcharts.com/highcharts/plotOptions.wordcloud.minFontSize</a>
   *
   * @implspec minFontSize?: number;
   *
   */
  @JSProperty("minFontSize")
  double getMinFontSize();

  /**
   * (Highcharts) A threshold determining the minimum font size that can be
   * applied to a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.minFontSize">https://api.highcharts.com/highcharts/plotOptions.wordcloud.minFontSize</a>
   *
   * @implspec minFontSize?: number;
   *
   */
  @JSProperty("minFontSize")
  void setMinFontSize(double value);

  /**
   * (Highcharts) This option decides which algorithm is used for placement,
   * and rotation of a word. The choice of algorith is therefore a crucial
   * part of the resulting layout of the wordcloud. It is possible for users
   * to add their own custom placement strategies for use in word cloud. Read
   * more about it in our documentation
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.placementStrategy">https://api.highcharts.com/highcharts/plotOptions.wordcloud.placementStrategy</a>
   *
   * @implspec placementStrategy?: string;
   *
   */
  @JSProperty("placementStrategy")
  @Nullable
  String getPlacementStrategy();

  /**
   * (Highcharts) This option decides which algorithm is used for placement,
   * and rotation of a word. The choice of algorith is therefore a crucial
   * part of the resulting layout of the wordcloud. It is possible for users
   * to add their own custom placement strategies for use in word cloud. Read
   * more about it in our documentation
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.placementStrategy">https://api.highcharts.com/highcharts/plotOptions.wordcloud.placementStrategy</a>
   *
   * @implspec placementStrategy?: string;
   *
   */
  @JSProperty("placementStrategy")
  void setPlacementStrategy(String value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.point">https://api.highcharts.com/highcharts/plotOptions.wordcloud.point</a>
   *
   * @implspec point?: PlotWordcloudPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotWordcloudPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.point">https://api.highcharts.com/highcharts/plotOptions.wordcloud.point</a>
   *
   * @implspec point?: PlotWordcloudPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotWordcloudPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.wordcloud.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.wordcloud.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts) Rotation options for the words in the wordcloud.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation</a>
   *
   * @implspec rotation?: PlotWordcloudRotationOptions;
   *
   */
  @JSProperty("rotation")
  @Nullable
  PlotWordcloudRotationOptions getRotation();

  /**
   * (Highcharts) Rotation options for the words in the wordcloud.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation</a>
   *
   * @implspec rotation?: PlotWordcloudRotationOptions;
   *
   */
  @JSProperty("rotation")
  void setRotation(PlotWordcloudRotationOptions value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.selected">https://api.highcharts.com/highcharts/plotOptions.wordcloud.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.selected">https://api.highcharts.com/highcharts/plotOptions.wordcloud.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. The default value is <code>true</code> for standalone series, <code>false</code>
   * for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.showInLegend">https://api.highcharts.com/highcharts/plotOptions.wordcloud.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.showInLegend">https://api.highcharts.com/highcharts/plotOptions.wordcloud.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts) Spiral used for placing a word after the initial position
   * experienced a collision with either another word or the borders. It is
   * possible for users to add their own custom spiralling algorithms for use
   * in word cloud. Read more about it in our documentation
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.spiral">https://api.highcharts.com/highcharts/plotOptions.wordcloud.spiral</a>
   *
   * @implspec spiral?: string;
   *
   */
  @JSProperty("spiral")
  @Nullable
  String getSpiral();

  /**
   * (Highcharts) Spiral used for placing a word after the initial position
   * experienced a collision with either another word or the borders. It is
   * possible for users to add their own custom spiralling algorithms for use
   * in word cloud. Read more about it in our documentation
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.spiral">https://api.highcharts.com/highcharts/plotOptions.wordcloud.spiral</a>
   *
   * @implspec spiral?: string;
   *
   */
  @JSProperty("spiral")
  void setSpiral(String value);

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states</a>
   *
   * @implspec states?: PlotWordcloudStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotWordcloudStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states</a>
   *
   * @implspec states?: PlotWordcloudStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotWordcloudStatesOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.wordcloud.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.wordcloud.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) CSS styles for the words.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.style">https://api.highcharts.com/highcharts/plotOptions.wordcloud.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts) CSS styles for the words.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.style">https://api.highcharts.com/highcharts/plotOptions.wordcloud.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.tooltip">https://api.highcharts.com/highcharts/plotOptions.wordcloud.tooltip</a>
   *
   * @implspec tooltip?: PlotWordcloudTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotWordcloudTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.tooltip">https://api.highcharts.com/highcharts/plotOptions.wordcloud.tooltip</a>
   *
   * @implspec tooltip?: PlotWordcloudTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotWordcloudTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.wordcloud.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.turboThreshold">https://api.highcharts.com/highstock/plotOptions.wordcloud.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.turboThreshold">https://api.highcharts.com/gantt/plotOptions.wordcloud.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.wordcloud.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.turboThreshold">https://api.highcharts.com/highstock/plotOptions.wordcloud.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.turboThreshold">https://api.highcharts.com/gantt/plotOptions.wordcloud.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.visible">https://api.highcharts.com/highcharts/plotOptions.wordcloud.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.visible">https://api.highcharts.com/highcharts/plotOptions.wordcloud.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wordcloud.zIndex">https://api.highcharts.com/highmaps/plotOptions.wordcloud.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wordcloud.zIndex">https://api.highcharts.com/highmaps/plotOptions.wordcloud.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }
}
