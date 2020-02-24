package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A sankey diagram is a type of flow diagram, in which the width
 * of the link between two nodes is shown proportionally to the flow quantity.
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
 * Options for all <code>sankey</code> series are defined in plotOptions.sankey.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey">https://api.highcharts.com/highcharts/plotOptions.sankey</a>
 *
 */
public interface PlotSankeyOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.allAreas">https://api.highcharts.com/highmaps/plotOptions.sankey.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.allAreas">https://api.highcharts.com/highmaps/plotOptions.sankey.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.sankey.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.sankey.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.animation">https://api.highcharts.com/highcharts/plotOptions.sankey.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSankeyAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.animation">https://api.highcharts.com/highcharts/plotOptions.sankey.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSankeyAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.animation">https://api.highcharts.com/highcharts/plotOptions.sankey.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSankeyAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotSankeyAnimationOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.animation">https://api.highcharts.com/highcharts/plotOptions.sankey.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSankeyAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.className">https://api.highcharts.com/highcharts/plotOptions.sankey.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.className">https://api.highcharts.com/highcharts/plotOptions.sankey.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.clip">https://api.highcharts.com/highcharts/plotOptions.sankey.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.clip">https://api.highcharts.com/highcharts/plotOptions.sankey.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.color">https://api.highcharts.com/highcharts/plotOptions.sankey.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.color">https://api.highcharts.com/highcharts/plotOptions.sankey.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.color">https://api.highcharts.com/highcharts/plotOptions.sankey.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.color">https://api.highcharts.com/highcharts/plotOptions.sankey.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.colorAxis">https://api.highcharts.com/highmaps/plotOptions.sankey.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.colorAxis">https://api.highcharts.com/highmaps/plotOptions.sankey.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.sankey.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.colorByPoint">https://api.highcharts.com/highstock/plotOptions.sankey.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.colorByPoint">https://api.highcharts.com/gantt/plotOptions.sankey.colorByPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.colorByPoint">https://api.highcharts.com/highcharts/plotOptions.sankey.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.colorByPoint">https://api.highcharts.com/highstock/plotOptions.sankey.colorByPoint</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.colorByPoint">https://api.highcharts.com/gantt/plotOptions.sankey.colorByPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.colorIndex">https://api.highcharts.com/highcharts/plotOptions.sankey.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.colorIndex">https://api.highcharts.com/highcharts/plotOptions.sankey.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.colors">https://api.highcharts.com/highcharts/plotOptions.sankey.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.colors">https://api.highcharts.com/highstock/plotOptions.sankey.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.colors">https://api.highcharts.com/gantt/plotOptions.sankey.colors</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.colors">https://api.highcharts.com/highcharts/plotOptions.sankey.colors</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.colors">https://api.highcharts.com/highstock/plotOptions.sankey.colors</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.colors">https://api.highcharts.com/gantt/plotOptions.sankey.colors</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.compare">https://api.highcharts.com/highstock/plotOptions.sankey.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.compare">https://api.highcharts.com/highstock/plotOptions.sankey.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.compareBase">https://api.highcharts.com/highstock/plotOptions.sankey.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.compareBase">https://api.highcharts.com/highstock/plotOptions.sankey.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.compareStart">https://api.highcharts.com/highstock/plotOptions.sankey.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.compareStart">https://api.highcharts.com/highstock/plotOptions.sankey.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.connectors">https://api.highcharts.com/gantt/plotOptions.sankey.connectors</a>
   *
   * @implspec connectors?: PlotSankeyConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotSankeyConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.connectors">https://api.highcharts.com/gantt/plotOptions.sankey.connectors</a>
   *
   * @implspec connectors?: PlotSankeyConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotSankeyConnectorsOptions value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.cursor">https://api.highcharts.com/highcharts/plotOptions.sankey.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.cursor">https://api.highcharts.com/highcharts/plotOptions.sankey.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.cursor">https://api.highcharts.com/highcharts/plotOptions.sankey.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts) Higher numbers makes the links in a sankey diagram render
   * more curved. A <code>curveFactor</code> of 0 makes the lines straight.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.curveFactor">https://api.highcharts.com/highcharts/plotOptions.sankey.curveFactor</a>
   *
   * @implspec curveFactor?: number;
   *
   */
  @JSProperty("curveFactor")
  double getCurveFactor();

  /**
   * (Highcharts) Higher numbers makes the links in a sankey diagram render
   * more curved. A <code>curveFactor</code> of 0 makes the lines straight.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.curveFactor">https://api.highcharts.com/highcharts/plotOptions.sankey.curveFactor</a>
   *
   * @implspec curveFactor?: number;
   *
   */
  @JSProperty("curveFactor")
  void setCurveFactor(double value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.dataGrouping">https://api.highcharts.com/highstock/plotOptions.sankey.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotSankeyDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotSankeyDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.dataGrouping">https://api.highcharts.com/highstock/plotOptions.sankey.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotSankeyDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotSankeyDataGroupingOptions value);

  /**
   * (Highcharts) Options for the data labels appearing on top of the nodes
   * and links. For sankey charts, data labels are visible for the nodes by
   * default, but hidden for links. This is controlled by modifying the
   * <code>nodeFormat</code>, and the <code>format</code> that applies to links and is an empty
   * string by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.dataLabels">https://api.highcharts.com/highcharts/plotOptions.sankey.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSankeyDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotSankeyDataLabelsOptions getDataLabels();

  /**
   * (Highcharts) Options for the data labels appearing on top of the nodes
   * and links. For sankey charts, data labels are visible for the nodes by
   * default, but hidden for links. This is controlled by modifying the
   * <code>nodeFormat</code>, and the <code>format</code> that applies to links and is an empty
   * string by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.dataLabels">https://api.highcharts.com/highcharts/plotOptions.sankey.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSankeyDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSankeyDataLabelsOptions value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.description">https://api.highcharts.com/highcharts/plotOptions.sankey.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.description">https://api.highcharts.com/highcharts/plotOptions.sankey.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.dragDrop">https://api.highcharts.com/highcharts/plotOptions.sankey.dragDrop</a>
   *
   * @implspec dragDrop?: PlotSankeyDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotSankeyDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.dragDrop">https://api.highcharts.com/highcharts/plotOptions.sankey.dragDrop</a>
   *
   * @implspec dragDrop?: PlotSankeyDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotSankeyDragDropOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.sankey.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.sankey.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.events">https://api.highcharts.com/highcharts/plotOptions.sankey.events</a>
   *
   * @implspec events?: PlotSankeyEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSankeyEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.events">https://api.highcharts.com/highcharts/plotOptions.sankey.events</a>
   *
   * @implspec events?: PlotSankeyEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSankeyEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.sankey.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.sankey.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.sankey.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.sankey.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.sankey.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.getExtremesFromAll">https://api.highcharts.com/highcharts/plotOptions.sankey.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.getExtremesFromAll">https://api.highcharts.com/highstock/plotOptions.sankey.getExtremesFromAll</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.getExtremesFromAll">https://api.highcharts.com/gantt/plotOptions.sankey.getExtremesFromAll</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.joinBy">https://api.highcharts.com/highmaps/plotOptions.sankey.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.joinBy">https://api.highcharts.com/highmaps/plotOptions.sankey.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.joinBy">https://api.highcharts.com/highmaps/plotOptions.sankey.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.keys">https://api.highcharts.com/highcharts/plotOptions.sankey.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.keys">https://api.highcharts.com/highcharts/plotOptions.sankey.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.label">https://api.highcharts.com/highcharts/plotOptions.sankey.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.label">https://api.highcharts.com/highstock/plotOptions.sankey.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.label">https://api.highcharts.com/gantt/plotOptions.sankey.label</a>
   *
   * @implspec label?: PlotSankeyLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotSankeyLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.label">https://api.highcharts.com/highcharts/plotOptions.sankey.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.label">https://api.highcharts.com/highstock/plotOptions.sankey.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.label">https://api.highcharts.com/gantt/plotOptions.sankey.label</a>
   *
   * @implspec label?: PlotSankeyLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotSankeyLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.linkedTo">https://api.highcharts.com/highcharts/plotOptions.sankey.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.linkedTo">https://api.highcharts.com/highstock/plotOptions.sankey.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.linkedTo">https://api.highcharts.com/gantt/plotOptions.sankey.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.linkedTo">https://api.highcharts.com/highcharts/plotOptions.sankey.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.linkedTo">https://api.highcharts.com/highstock/plotOptions.sankey.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.linkedTo">https://api.highcharts.com/gantt/plotOptions.sankey.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts) Opacity for the links between nodes in the sankey diagram.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.linkOpacity">https://api.highcharts.com/highcharts/plotOptions.sankey.linkOpacity</a>
   *
   * @implspec linkOpacity?: number;
   *
   */
  @JSProperty("linkOpacity")
  double getLinkOpacity();

  /**
   * (Highcharts) Opacity for the links between nodes in the sankey diagram.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.linkOpacity">https://api.highcharts.com/highcharts/plotOptions.sankey.linkOpacity</a>
   *
   * @implspec linkOpacity?: number;
   *
   */
  @JSProperty("linkOpacity")
  void setLinkOpacity(double value);

  /**
   * (Highcharts, Highstock, Gantt) The minimal height for a column or width
   * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
   * to zero) point, set the minimal point length to a pixel value like 3. In
   * stacked column charts, minPointLength might not be respected for tightly
   * packed values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.minPointLength">https://api.highcharts.com/highcharts/plotOptions.sankey.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.minPointLength">https://api.highcharts.com/highstock/plotOptions.sankey.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.minPointLength">https://api.highcharts.com/gantt/plotOptions.sankey.minPointLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.minPointLength">https://api.highcharts.com/highcharts/plotOptions.sankey.minPointLength</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.minPointLength">https://api.highcharts.com/highstock/plotOptions.sankey.minPointLength</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.minPointLength">https://api.highcharts.com/gantt/plotOptions.sankey.minPointLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.sankey.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.sankey.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts) The padding between nodes in a sankey diagram, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.nodePadding">https://api.highcharts.com/highcharts/plotOptions.sankey.nodePadding</a>
   *
   * @implspec nodePadding?: number;
   *
   */
  @JSProperty("nodePadding")
  double getNodePadding();

  /**
   * (Highcharts) The padding between nodes in a sankey diagram, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.nodePadding">https://api.highcharts.com/highcharts/plotOptions.sankey.nodePadding</a>
   *
   * @implspec nodePadding?: number;
   *
   */
  @JSProperty("nodePadding")
  void setNodePadding(double value);

  /**
   * (Highcharts) The pixel width of each node in a sankey diagram, or the
   * height in case the chart is inverted.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.nodeWidth">https://api.highcharts.com/highcharts/plotOptions.sankey.nodeWidth</a>
   *
   * @implspec nodeWidth?: number;
   *
   */
  @JSProperty("nodeWidth")
  double getNodeWidth();

  /**
   * (Highcharts) The pixel width of each node in a sankey diagram, or the
   * height in case the chart is inverted.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.nodeWidth">https://api.highcharts.com/highcharts/plotOptions.sankey.nodeWidth</a>
   *
   * @implspec nodeWidth?: number;
   *
   */
  @JSProperty("nodeWidth")
  void setNodeWidth(double value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.point">https://api.highcharts.com/highcharts/plotOptions.sankey.point</a>
   *
   * @implspec point?: PlotSankeyPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotSankeyPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.point">https://api.highcharts.com/highcharts/plotOptions.sankey.point</a>
   *
   * @implspec point?: PlotSankeyPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotSankeyPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.sankey.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.sankey.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.selected">https://api.highcharts.com/highcharts/plotOptions.sankey.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.selected">https://api.highcharts.com/highcharts/plotOptions.sankey.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.sankey.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.sankey.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.showInLegend">https://api.highcharts.com/highcharts/plotOptions.sankey.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.showInLegend">https://api.highcharts.com/highcharts/plotOptions.sankey.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.showInNavigator">https://api.highcharts.com/highstock/plotOptions.sankey.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.showInNavigator">https://api.highcharts.com/highstock/plotOptions.sankey.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.sankey.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.sankey.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states">https://api.highcharts.com/highcharts/plotOptions.sankey.states</a>
   *
   * @implspec states?: PlotSankeyStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotSankeyStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states">https://api.highcharts.com/highcharts/plotOptions.sankey.states</a>
   *
   * @implspec states?: PlotSankeyStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotSankeyStatesOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.sankey.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.sankey.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.tooltip">https://api.highcharts.com/highcharts/plotOptions.sankey.tooltip</a>
   *
   * @implspec tooltip?: PlotSankeyTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotSankeyTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.tooltip">https://api.highcharts.com/highcharts/plotOptions.sankey.tooltip</a>
   *
   * @implspec tooltip?: PlotSankeyTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotSankeyTooltipOptions value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.sankey.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.turboThreshold">https://api.highcharts.com/highstock/plotOptions.sankey.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.turboThreshold">https://api.highcharts.com/gantt/plotOptions.sankey.turboThreshold</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.turboThreshold">https://api.highcharts.com/highcharts/plotOptions.sankey.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.turboThreshold">https://api.highcharts.com/highstock/plotOptions.sankey.turboThreshold</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.turboThreshold">https://api.highcharts.com/gantt/plotOptions.sankey.turboThreshold</a>
   *
   * @implspec turboThreshold?: number;
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.visible">https://api.highcharts.com/highcharts/plotOptions.sankey.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.visible">https://api.highcharts.com/highcharts/plotOptions.sankey.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.zIndex">https://api.highcharts.com/highmaps/plotOptions.sankey.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.zIndex">https://api.highcharts.com/highmaps/plotOptions.sankey.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

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
