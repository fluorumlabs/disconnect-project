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
 * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the X
 * axis, typically time intervals with a start and end date.
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
 * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange">https://api.highcharts.com/highcharts/plotOptions.xrange</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange">https://api.highcharts.com/highstock/plotOptions.xrange</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange">https://api.highcharts.com/gantt/plotOptions.xrange</a>
 *
 */
public interface PlotXrangeOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.allAreas">https://api.highcharts.com/highmaps/plotOptions.xrange.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.allAreas">https://api.highcharts.com/highmaps/plotOptions.xrange.allAreas</a>
   *
   * @implspec allAreas?: boolean;
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Allow this series' points to be selected
   * by clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.xrange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.xrange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.allowPointSelect">https://api.highcharts.com/gantt/plotOptions.xrange.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts, Highstock, Gantt) Allow this series' points to be selected
   * by clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.xrange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.allowPointSelect">https://api.highcharts.com/highstock/plotOptions.xrange.allowPointSelect</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.allowPointSelect">https://api.highcharts.com/gantt/plotOptions.xrange.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.animation">https://api.highcharts.com/highcharts/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.animation">https://api.highcharts.com/highstock/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.animation">https://api.highcharts.com/gantt/plotOptions.xrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotXrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.animation">https://api.highcharts.com/highcharts/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.animation">https://api.highcharts.com/highstock/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.animation">https://api.highcharts.com/gantt/plotOptions.xrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotXrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.animation">https://api.highcharts.com/highcharts/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.animation">https://api.highcharts.com/highstock/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.animation">https://api.highcharts.com/gantt/plotOptions.xrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotXrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotXrangeAnimationOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.animation">https://api.highcharts.com/highcharts/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.animation">https://api.highcharts.com/highstock/plotOptions.xrange.animation</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.animation">https://api.highcharts.com/gantt/plotOptions.xrange.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotXrangeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) For some series, there is a limit that
   * shuts down initial animation by default when the total number of points
   * in the chart is too high. For example, for a column chart and its
   * derivatives, animation doesn't run if there is more than 250 points
   * totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.animationLimit">https://api.highcharts.com/highcharts/plotOptions.xrange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.animationLimit">https://api.highcharts.com/highstock/plotOptions.xrange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.animationLimit">https://api.highcharts.com/gantt/plotOptions.xrange.animationLimit</a>
   *
   * @implspec animationLimit?: number;
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts, Highstock, Gantt) For some series, there is a limit that
   * shuts down initial animation by default when the total number of points
   * in the chart is too high. For example, for a column chart and its
   * derivatives, animation doesn't run if there is more than 250 points
   * totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.animationLimit">https://api.highcharts.com/highcharts/plotOptions.xrange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.animationLimit">https://api.highcharts.com/highstock/plotOptions.xrange.animationLimit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.animationLimit">https://api.highcharts.com/gantt/plotOptions.xrange.animationLimit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.borderColor">https://api.highcharts.com/highcharts/plotOptions.xrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.borderColor">https://api.highcharts.com/highstock/plotOptions.xrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.borderColor">https://api.highcharts.com/gantt/plotOptions.xrange.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.borderColor">https://api.highcharts.com/highcharts/plotOptions.xrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.borderColor">https://api.highcharts.com/highstock/plotOptions.xrange.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.borderColor">https://api.highcharts.com/gantt/plotOptions.xrange.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.borderRadius">https://api.highcharts.com/highcharts/plotOptions.xrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.borderRadius">https://api.highcharts.com/highstock/plotOptions.xrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.borderRadius">https://api.highcharts.com/gantt/plotOptions.xrange.borderRadius</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.borderRadius">https://api.highcharts.com/highcharts/plotOptions.xrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.borderRadius">https://api.highcharts.com/highstock/plotOptions.xrange.borderRadius</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.borderRadius">https://api.highcharts.com/gantt/plotOptions.xrange.borderRadius</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.borderWidth">https://api.highcharts.com/highcharts/plotOptions.xrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.borderWidth">https://api.highcharts.com/highstock/plotOptions.xrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.borderWidth">https://api.highcharts.com/gantt/plotOptions.xrange.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.borderWidth">https://api.highcharts.com/highcharts/plotOptions.xrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.borderWidth">https://api.highcharts.com/highstock/plotOptions.xrange.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.borderWidth">https://api.highcharts.com/gantt/plotOptions.xrange.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) An additional class name to apply to the
   * series' graphical elements. This option does not replace default class
   * names of the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.className">https://api.highcharts.com/highcharts/plotOptions.xrange.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.className">https://api.highcharts.com/highstock/plotOptions.xrange.className</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.className">https://api.highcharts.com/gantt/plotOptions.xrange.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Gantt) An additional class name to apply to the
   * series' graphical elements. This option does not replace default class
   * names of the graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.className">https://api.highcharts.com/highcharts/plotOptions.xrange.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.className">https://api.highcharts.com/highstock/plotOptions.xrange.className</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.className">https://api.highcharts.com/gantt/plotOptions.xrange.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) Disable this option to allow series
   * rendering in the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.clip">https://api.highcharts.com/highcharts/plotOptions.xrange.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.clip">https://api.highcharts.com/highstock/plotOptions.xrange.clip</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.clip">https://api.highcharts.com/gantt/plotOptions.xrange.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts, Highstock, Gantt) Disable this option to allow series
   * rendering in the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.clip">https://api.highcharts.com/highcharts/plotOptions.xrange.clip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.clip">https://api.highcharts.com/highstock/plotOptions.xrange.clip</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.clip">https://api.highcharts.com/gantt/plotOptions.xrange.clip</a>
   *
   * @implspec clip?: boolean;
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) The main color of the series. In line type
   * series it applies to the line and the point markers unless otherwise
   * specified. In bar type series it applies to the bars unless a color is
   * specified per point. The default value is pulled from the
   * <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.color">https://api.highcharts.com/highcharts/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.color">https://api.highcharts.com/highstock/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.color">https://api.highcharts.com/gantt/plotOptions.xrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock, Gantt) The main color of the series. In line type
   * series it applies to the line and the point markers unless otherwise
   * specified. In bar type series it applies to the bars unless a color is
   * specified per point. The default value is pulled from the
   * <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.color">https://api.highcharts.com/highcharts/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.color">https://api.highcharts.com/highstock/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.color">https://api.highcharts.com/gantt/plotOptions.xrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The main color of the series. In line type
   * series it applies to the line and the point markers unless otherwise
   * specified. In bar type series it applies to the bars unless a color is
   * specified per point. The default value is pulled from the
   * <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.color">https://api.highcharts.com/highcharts/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.color">https://api.highcharts.com/highstock/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.color">https://api.highcharts.com/gantt/plotOptions.xrange.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The main color of the series. In line type
   * series it applies to the line and the point markers unless otherwise
   * specified. In bar type series it applies to the bars unless a color is
   * specified per point. The default value is pulled from the
   * <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.color">https://api.highcharts.com/highcharts/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.color">https://api.highcharts.com/highstock/plotOptions.xrange.color</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.color">https://api.highcharts.com/gantt/plotOptions.xrange.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.colorAxis">https://api.highcharts.com/highmaps/plotOptions.xrange.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.colorAxis">https://api.highcharts.com/highmaps/plotOptions.xrange.colorAxis</a>
   *
   * @implspec colorAxis?: boolean;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) In an X-range series, this option makes
   * all points of the same Y-axis category the same color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.xrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.colorByPoint">https://api.highcharts.com/highstock/plotOptions.xrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.colorByPoint">https://api.highcharts.com/gantt/plotOptions.xrange.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * (Highcharts, Highstock, Gantt) In an X-range series, this option makes
   * all points of the same Y-axis category the same color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.xrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.colorByPoint">https://api.highcharts.com/highstock/plotOptions.xrange.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.colorByPoint">https://api.highcharts.com/gantt/plotOptions.xrange.colorByPoint</a>
   *
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Styled mode only. A specific color index
   * to use for the series, so its graphic representations are given the class
   * name <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.colorIndex">https://api.highcharts.com/highcharts/plotOptions.xrange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.colorIndex">https://api.highcharts.com/highstock/plotOptions.xrange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.colorIndex">https://api.highcharts.com/gantt/plotOptions.xrange.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Highstock, Gantt) Styled mode only. A specific color index
   * to use for the series, so its graphic representations are given the class
   * name <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.colorIndex">https://api.highcharts.com/highcharts/plotOptions.xrange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.colorIndex">https://api.highcharts.com/highstock/plotOptions.xrange.colorIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.colorIndex">https://api.highcharts.com/gantt/plotOptions.xrange.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.colors">https://api.highcharts.com/highcharts/plotOptions.xrange.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.colors">https://api.highcharts.com/highstock/plotOptions.xrange.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.colors">https://api.highcharts.com/gantt/plotOptions.xrange.colors</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.colors">https://api.highcharts.com/highcharts/plotOptions.xrange.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.colors">https://api.highcharts.com/highstock/plotOptions.xrange.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.colors">https://api.highcharts.com/gantt/plotOptions.xrange.colors</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.compare">https://api.highcharts.com/highstock/plotOptions.xrange.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.compare">https://api.highcharts.com/highstock/plotOptions.xrange.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.compareBase">https://api.highcharts.com/highstock/plotOptions.xrange.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.compareBase">https://api.highcharts.com/highstock/plotOptions.xrange.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.compareStart">https://api.highcharts.com/highstock/plotOptions.xrange.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.compareStart">https://api.highcharts.com/highstock/plotOptions.xrange.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.connectors">https://api.highcharts.com/gantt/plotOptions.xrange.connectors</a>
   *
   * @implspec connectors?: PlotXrangeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotXrangeConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.connectors">https://api.highcharts.com/gantt/plotOptions.xrange.connectors</a>
   *
   * @implspec connectors?: PlotXrangeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotXrangeConnectorsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
   * have click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.cursor">https://api.highcharts.com/highcharts/plotOptions.xrange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.cursor">https://api.highcharts.com/highstock/plotOptions.xrange.cursor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.cursor">https://api.highcharts.com/gantt/plotOptions.xrange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
   * have click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.cursor">https://api.highcharts.com/highcharts/plotOptions.xrange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.cursor">https://api.highcharts.com/highstock/plotOptions.xrange.cursor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.cursor">https://api.highcharts.com/gantt/plotOptions.xrange.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
   * have click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.cursor">https://api.highcharts.com/highcharts/plotOptions.xrange.cursor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.cursor">https://api.highcharts.com/highstock/plotOptions.xrange.cursor</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.cursor">https://api.highcharts.com/gantt/plotOptions.xrange.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dataGrouping">https://api.highcharts.com/highstock/plotOptions.xrange.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotXrangeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotXrangeDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dataGrouping">https://api.highcharts.com/highstock/plotOptions.xrange.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotXrangeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotXrangeDataGroupingOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the series data labels,
   * appearing next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dataLabels">https://api.highcharts.com/highcharts/plotOptions.xrange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dataLabels">https://api.highcharts.com/highstock/plotOptions.xrange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dataLabels">https://api.highcharts.com/gantt/plotOptions.xrange.dataLabels</a>
   *
   * @implspec dataLabels?: PlotXrangeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotXrangeDataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highstock, Gantt) Options for the series data labels,
   * appearing next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dataLabels">https://api.highcharts.com/highcharts/plotOptions.xrange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dataLabels">https://api.highcharts.com/highstock/plotOptions.xrange.dataLabels</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dataLabels">https://api.highcharts.com/gantt/plotOptions.xrange.dataLabels</a>
   *
   * @implspec dataLabels?: PlotXrangeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotXrangeDataLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.description">https://api.highcharts.com/highcharts/plotOptions.xrange.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.description">https://api.highcharts.com/highstock/plotOptions.xrange.description</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.description">https://api.highcharts.com/gantt/plotOptions.xrange.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Gantt) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.description">https://api.highcharts.com/highcharts/plotOptions.xrange.description</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.description">https://api.highcharts.com/highstock/plotOptions.xrange.description</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.description">https://api.highcharts.com/gantt/plotOptions.xrange.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock, Gantt) The draggable-points module allows points
   * to be moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop</a>
   *
   * @implspec dragDrop?: PlotXrangeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotXrangeDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Gantt) The draggable-points module allows points
   * to be moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop">https://api.highcharts.com/highcharts/plotOptions.xrange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop">https://api.highcharts.com/highstock/plotOptions.xrange.dragDrop</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop">https://api.highcharts.com/gantt/plotOptions.xrange.dragDrop</a>
   *
   * @implspec dragDrop?: PlotXrangeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotXrangeDragDropOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.xrange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.xrange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.enableMouseTracking">https://api.highcharts.com/gantt/plotOptions.xrange.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.xrange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.enableMouseTracking">https://api.highcharts.com/highstock/plotOptions.xrange.enableMouseTracking</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.enableMouseTracking">https://api.highcharts.com/gantt/plotOptions.xrange.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) General event handlers for the series
   * items. These event hooks can also be attached to the series at run time
   * using the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.events">https://api.highcharts.com/highcharts/plotOptions.xrange.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.events">https://api.highcharts.com/highstock/plotOptions.xrange.events</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.events">https://api.highcharts.com/gantt/plotOptions.xrange.events</a>
   *
   * @implspec events?: PlotXrangeEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotXrangeEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) General event handlers for the series
   * items. These event hooks can also be attached to the series at run time
   * using the <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.events">https://api.highcharts.com/highcharts/plotOptions.xrange.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.events">https://api.highcharts.com/highstock/plotOptions.xrange.events</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.events">https://api.highcharts.com/gantt/plotOptions.xrange.events</a>
   *
   * @implspec events?: PlotXrangeEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotXrangeEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) By default, series are exposed to screen
   * readers as regions. By enabling this option, the series element itself
   * will be exposed in the same way as the data points. This is useful if the
   * series is not used as a grouping entity in the chart, but you still want
   * to attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.xrange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.xrange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.exposeElementToA11y">https://api.highcharts.com/gantt/plotOptions.xrange.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts, Highstock, Gantt) By default, series are exposed to screen
   * readers as regions. By enabling this option, the series element itself
   * will be exposed in the same way as the data points. This is useful if the
   * series is not used as a grouping entity in the chart, but you still want
   * to attach a description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.xrange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.exposeElementToA11y">https://api.highcharts.com/highstock/plotOptions.xrange.exposeElementToA11y</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.exposeElementToA11y">https://api.highcharts.com/gantt/plotOptions.xrange.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.grouping">https://api.highcharts.com/highcharts/plotOptions.xrange.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.grouping">https://api.highcharts.com/highstock/plotOptions.xrange.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.grouping">https://api.highcharts.com/gantt/plotOptions.xrange.grouping</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.grouping">https://api.highcharts.com/highcharts/plotOptions.xrange.grouping</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.grouping">https://api.highcharts.com/highstock/plotOptions.xrange.grouping</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.grouping">https://api.highcharts.com/gantt/plotOptions.xrange.grouping</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.groupPadding">https://api.highcharts.com/highcharts/plotOptions.xrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.groupPadding">https://api.highcharts.com/highstock/plotOptions.xrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.groupPadding">https://api.highcharts.com/gantt/plotOptions.xrange.groupPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.groupPadding">https://api.highcharts.com/highcharts/plotOptions.xrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.groupPadding">https://api.highcharts.com/highstock/plotOptions.xrange.groupPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.groupPadding">https://api.highcharts.com/gantt/plotOptions.xrange.groupPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.groupZPadding">https://api.highcharts.com/highcharts/plotOptions.xrange.groupZPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.groupZPadding">https://api.highcharts.com/highcharts/plotOptions.xrange.groupZPadding</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.joinBy">https://api.highcharts.com/highmaps/plotOptions.xrange.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.joinBy">https://api.highcharts.com/highmaps/plotOptions.xrange.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.joinBy">https://api.highcharts.com/highmaps/plotOptions.xrange.joinBy</a>
   *
   * @implspec joinBy?: (string|Array<string>);
   *
   */
  @JSProperty("joinBy")
  void setJoinBy(String[] value);

  /**
   * (Highcharts, Highstock, Gantt) An array specifying which option maps to
   * which key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.keys">https://api.highcharts.com/highcharts/plotOptions.xrange.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.keys">https://api.highcharts.com/highstock/plotOptions.xrange.keys</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.keys">https://api.highcharts.com/gantt/plotOptions.xrange.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts, Highstock, Gantt) An array specifying which option maps to
   * which key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.keys">https://api.highcharts.com/highcharts/plotOptions.xrange.keys</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.keys">https://api.highcharts.com/highstock/plotOptions.xrange.keys</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.keys">https://api.highcharts.com/gantt/plotOptions.xrange.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.label">https://api.highcharts.com/highcharts/plotOptions.xrange.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.label">https://api.highcharts.com/highstock/plotOptions.xrange.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.label">https://api.highcharts.com/gantt/plotOptions.xrange.label</a>
   *
   * @implspec label?: PlotXrangeLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotXrangeLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.label">https://api.highcharts.com/highcharts/plotOptions.xrange.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.label">https://api.highcharts.com/highstock/plotOptions.xrange.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.label">https://api.highcharts.com/gantt/plotOptions.xrange.label</a>
   *
   * @implspec label?: PlotXrangeLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotXrangeLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.linkedTo">https://api.highcharts.com/highcharts/plotOptions.xrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.linkedTo">https://api.highcharts.com/highstock/plotOptions.xrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.linkedTo">https://api.highcharts.com/gantt/plotOptions.xrange.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.linkedTo">https://api.highcharts.com/highcharts/plotOptions.xrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.linkedTo">https://api.highcharts.com/highstock/plotOptions.xrange.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.linkedTo">https://api.highcharts.com/gantt/plotOptions.xrange.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.xrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.xrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.xrange.maxPointWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.maxPointWidth">https://api.highcharts.com/highcharts/plotOptions.xrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.maxPointWidth">https://api.highcharts.com/highstock/plotOptions.xrange.maxPointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.maxPointWidth">https://api.highcharts.com/gantt/plotOptions.xrange.maxPointWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.minPointLength">https://api.highcharts.com/highcharts/plotOptions.xrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.minPointLength">https://api.highcharts.com/highstock/plotOptions.xrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.minPointLength">https://api.highcharts.com/gantt/plotOptions.xrange.minPointLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.minPointLength">https://api.highcharts.com/highcharts/plotOptions.xrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.minPointLength">https://api.highcharts.com/highstock/plotOptions.xrange.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.minPointLength">https://api.highcharts.com/gantt/plotOptions.xrange.minPointLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.xrange.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.xrange.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill">https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.partialFill">https://api.highcharts.com/highstock/plotOptions.xrange.partialFill</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.partialFill">https://api.highcharts.com/gantt/plotOptions.xrange.partialFill</a>
   *
   * @implspec partialFill?: PlotXrangePartialFillOptions;
   *
   */
  @JSProperty("partialFill")
  @Nullable
  PlotXrangePartialFillOptions getPartialFill();

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill">https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.partialFill">https://api.highcharts.com/highstock/plotOptions.xrange.partialFill</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.partialFill">https://api.highcharts.com/gantt/plotOptions.xrange.partialFill</a>
   *
   * @implspec partialFill?: PlotXrangePartialFillOptions;
   *
   */
  @JSProperty("partialFill")
  void setPartialFill(PlotXrangePartialFillOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.point">https://api.highcharts.com/highcharts/plotOptions.xrange.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.point">https://api.highcharts.com/highstock/plotOptions.xrange.point</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.point">https://api.highcharts.com/gantt/plotOptions.xrange.point</a>
   *
   * @implspec point?: PlotXrangePointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotXrangePointOptions getPoint();

  /**
   * (Highcharts, Highstock, Gantt) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.point">https://api.highcharts.com/highcharts/plotOptions.xrange.point</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.point">https://api.highcharts.com/highstock/plotOptions.xrange.point</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.point">https://api.highcharts.com/gantt/plotOptions.xrange.point</a>
   *
   * @implspec point?: PlotXrangePointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotXrangePointOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Same as
   * accessibility.pointDescriptionFormatter, but for an individual series.
   * Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.xrange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.xrange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.pointDescriptionFormatter">https://api.highcharts.com/gantt/plotOptions.xrange.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts, Highstock, Gantt) Same as
   * accessibility.pointDescriptionFormatter, but for an individual series.
   * Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.xrange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.pointDescriptionFormatter">https://api.highcharts.com/highstock/plotOptions.xrange.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.pointDescriptionFormatter">https://api.highcharts.com/gantt/plotOptions.xrange.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.pointPadding">https://api.highcharts.com/highcharts/plotOptions.xrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.pointPadding">https://api.highcharts.com/highstock/plotOptions.xrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.pointPadding">https://api.highcharts.com/gantt/plotOptions.xrange.pointPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.pointPadding">https://api.highcharts.com/highcharts/plotOptions.xrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.pointPadding">https://api.highcharts.com/highstock/plotOptions.xrange.pointPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.pointPadding">https://api.highcharts.com/gantt/plotOptions.xrange.pointPadding</a>
   *
   * @implspec pointPadding?: number;
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  double getPointRange();

  /**
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.pointWidth">https://api.highcharts.com/highcharts/plotOptions.xrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.pointWidth">https://api.highcharts.com/highstock/plotOptions.xrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.pointWidth">https://api.highcharts.com/gantt/plotOptions.xrange.pointWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.pointWidth">https://api.highcharts.com/highcharts/plotOptions.xrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.pointWidth">https://api.highcharts.com/highstock/plotOptions.xrange.pointWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.pointWidth">https://api.highcharts.com/gantt/plotOptions.xrange.pointWidth</a>
   *
   * @implspec pointWidth?: number;
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.selected">https://api.highcharts.com/highcharts/plotOptions.xrange.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.selected">https://api.highcharts.com/highstock/plotOptions.xrange.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.selected">https://api.highcharts.com/gantt/plotOptions.xrange.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock, Gantt) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.selected">https://api.highcharts.com/highcharts/plotOptions.xrange.selected</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.selected">https://api.highcharts.com/highstock/plotOptions.xrange.selected</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.selected">https://api.highcharts.com/gantt/plotOptions.xrange.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
   * graph line. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.shadow">https://api.highcharts.com/highcharts/plotOptions.xrange.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.shadow">https://api.highcharts.com/highstock/plotOptions.xrange.shadow</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.shadow">https://api.highcharts.com/gantt/plotOptions.xrange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
   * graph line. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.shadow">https://api.highcharts.com/highcharts/plotOptions.xrange.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.shadow">https://api.highcharts.com/highstock/plotOptions.xrange.shadow</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.shadow">https://api.highcharts.com/gantt/plotOptions.xrange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
   * graph line. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.shadow">https://api.highcharts.com/highcharts/plotOptions.xrange.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.shadow">https://api.highcharts.com/highstock/plotOptions.xrange.shadow</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.shadow">https://api.highcharts.com/gantt/plotOptions.xrange.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) If true, a checkbox is displayed next to
   * the legend item to allow selecting the series. The state of the checkbox
   * is determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.xrange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.showCheckbox">https://api.highcharts.com/highstock/plotOptions.xrange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.showCheckbox">https://api.highcharts.com/gantt/plotOptions.xrange.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts, Highstock, Gantt) If true, a checkbox is displayed next to
   * the legend item to allow selecting the series. The state of the checkbox
   * is determined by the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.xrange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.showCheckbox">https://api.highcharts.com/highstock/plotOptions.xrange.showCheckbox</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.showCheckbox">https://api.highcharts.com/gantt/plotOptions.xrange.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to display this particular series
   * or series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.showInLegend">https://api.highcharts.com/highcharts/plotOptions.xrange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.showInLegend">https://api.highcharts.com/highstock/plotOptions.xrange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.showInLegend">https://api.highcharts.com/gantt/plotOptions.xrange.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highstock, Gantt) Whether to display this particular series
   * or series type in the legend. The default value is <code>true</code> for standalone
   * series, <code>false</code> for linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.showInLegend">https://api.highcharts.com/highcharts/plotOptions.xrange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.showInLegend">https://api.highcharts.com/highstock/plotOptions.xrange.showInLegend</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.showInLegend">https://api.highcharts.com/gantt/plotOptions.xrange.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.showInNavigator">https://api.highcharts.com/highstock/plotOptions.xrange.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.showInNavigator">https://api.highcharts.com/highstock/plotOptions.xrange.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) If set to <code>true</code>, the accessibility module
   * will skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.xrange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.xrange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.skipKeyboardNavigation">https://api.highcharts.com/gantt/plotOptions.xrange.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts, Highstock, Gantt) If set to <code>true</code>, the accessibility module
   * will skip past the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.xrange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.skipKeyboardNavigation">https://api.highcharts.com/highstock/plotOptions.xrange.skipKeyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.skipKeyboardNavigation">https://api.highcharts.com/gantt/plotOptions.xrange.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) A wrapper object for all the series
   * options in specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states">https://api.highcharts.com/highcharts/plotOptions.xrange.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states">https://api.highcharts.com/highstock/plotOptions.xrange.states</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states">https://api.highcharts.com/gantt/plotOptions.xrange.states</a>
   *
   * @implspec states?: PlotXrangeStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotXrangeStatesOptions getStates();

  /**
   * (Highcharts, Highstock, Gantt) A wrapper object for all the series
   * options in specific states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states">https://api.highcharts.com/highcharts/plotOptions.xrange.states</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states">https://api.highcharts.com/highstock/plotOptions.xrange.states</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states">https://api.highcharts.com/gantt/plotOptions.xrange.states</a>
   *
   * @implspec states?: PlotXrangeStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotXrangeStatesOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Sticky tracking of mouse events. When
   * true, the <code>mouseOut</code> event on a series isn't triggered until the mouse
   * moves over another series, or out of the plot area. When false, the
   * <code>mouseOut</code> event on a series is triggered when the mouse leaves the area
   * around the series' graph or markers. This also implies the tooltip when
   * not shared. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false,
   * the tooltip will be hidden when moving the mouse between series. Defaults
   * to true for line and area type series, but to false for columns, pies
   * etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.xrange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.stickyTracking">https://api.highcharts.com/highstock/plotOptions.xrange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.stickyTracking">https://api.highcharts.com/gantt/plotOptions.xrange.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highcharts, Highstock, Gantt) Sticky tracking of mouse events. When
   * true, the <code>mouseOut</code> event on a series isn't triggered until the mouse
   * moves over another series, or out of the plot area. When false, the
   * <code>mouseOut</code> event on a series is triggered when the mouse leaves the area
   * around the series' graph or markers. This also implies the tooltip when
   * not shared. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false,
   * the tooltip will be hidden when moving the mouse between series. Defaults
   * to true for line and area type series, but to false for columns, pies
   * etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.xrange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.stickyTracking">https://api.highcharts.com/highstock/plotOptions.xrange.stickyTracking</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.stickyTracking">https://api.highcharts.com/gantt/plotOptions.xrange.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) A configuration object for the tooltip
   * rendering of each single series. Properties are inherited from tooltip,
   * but only the following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.tooltip">https://api.highcharts.com/highcharts/plotOptions.xrange.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.tooltip">https://api.highcharts.com/highstock/plotOptions.xrange.tooltip</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.tooltip">https://api.highcharts.com/gantt/plotOptions.xrange.tooltip</a>
   *
   * @implspec tooltip?: PlotXrangeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotXrangeTooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock, Gantt) A configuration object for the tooltip
   * rendering of each single series. Properties are inherited from tooltip,
   * but only the following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.tooltip">https://api.highcharts.com/highcharts/plotOptions.xrange.tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.tooltip">https://api.highcharts.com/highstock/plotOptions.xrange.tooltip</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.tooltip">https://api.highcharts.com/gantt/plotOptions.xrange.tooltip</a>
   *
   * @implspec tooltip?: PlotXrangeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotXrangeTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.xrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.turboThreshold">https://api.highcharts.com/highstock/plotOptions.xrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.turboThreshold">https://api.highcharts.com/gantt/plotOptions.xrange.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.xrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.turboThreshold">https://api.highcharts.com/highstock/plotOptions.xrange.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.turboThreshold">https://api.highcharts.com/gantt/plotOptions.xrange.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts, Highstock, Gantt) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.visible">https://api.highcharts.com/highcharts/plotOptions.xrange.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.visible">https://api.highcharts.com/highstock/plotOptions.xrange.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.visible">https://api.highcharts.com/gantt/plotOptions.xrange.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock, Gantt) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.visible">https://api.highcharts.com/highcharts/plotOptions.xrange.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.visible">https://api.highcharts.com/highstock/plotOptions.xrange.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.visible">https://api.highcharts.com/gantt/plotOptions.xrange.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.zIndex">https://api.highcharts.com/highmaps/plotOptions.xrange.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.zIndex">https://api.highcharts.com/highmaps/plotOptions.xrange.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.xrange.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.zoneAxis">https://api.highcharts.com/highstock/plotOptions.xrange.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.zoneAxis">https://api.highcharts.com/highcharts/plotOptions.xrange.zoneAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.zoneAxis">https://api.highcharts.com/highstock/plotOptions.xrange.zoneAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.zones">https://api.highcharts.com/highcharts/plotOptions.xrange.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.zones">https://api.highcharts.com/highstock/plotOptions.xrange.zones</a>
   *
   * @implspec zones?: Array<PlotXrangeZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotXrangeZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.zones">https://api.highcharts.com/highcharts/plotOptions.xrange.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.zones">https://api.highcharts.com/highstock/plotOptions.xrange.zones</a>
   *
   * @implspec zones?: Array<PlotXrangeZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotXrangeZonesOptions> value);

  /**
   */
  abstract class CompareBase extends JsEnum {
    public static final CompareBase VALUE_0 = JsEnum.of(0);

    public static final CompareBase VALUE_100 = JsEnum.of(100);
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }
}
