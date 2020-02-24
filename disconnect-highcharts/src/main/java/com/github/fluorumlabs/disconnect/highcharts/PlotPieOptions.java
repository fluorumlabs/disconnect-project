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
 * (Highcharts) A pie chart is a circular graphic which is divided into slices
 * to illustrate numerical proportion.
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
 * Options for all <code>pie</code> series are defined in plotOptions.pie.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie">https://api.highcharts.com/highcharts/plotOptions.pie</a>
 *
 */
public interface PlotPieOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.allAreas">https://api.highcharts.com/highmaps/plotOptions.pie.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.allAreas">https://api.highcharts.com/highmaps/plotOptions.pie.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.pie.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.pie.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.animation">https://api.highcharts.com/highcharts/plotOptions.pie.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPieAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.animation">https://api.highcharts.com/highcharts/plotOptions.pie.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPieAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.animation">https://api.highcharts.com/highcharts/plotOptions.pie.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPieAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.animation">https://api.highcharts.com/highcharts/plotOptions.pie.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotPieAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotPieAnimationOptions value);

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.borderColor">https://api.highcharts.com/highcharts/plotOptions.pie.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.borderColor">https://api.highcharts.com/highcharts/plotOptions.pie.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) The width of the border surrounding each slice.
   *
   * When setting the border width to 0, there may be small gaps between the
   * slices due to SVG antialiasing artefacts. To work around this, keep the
   * border width at 0.5 or 1, but set the <code>borderColor</code> to <code>null</code> instead.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.borderWidth">https://api.highcharts.com/highcharts/plotOptions.pie.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The width of the border surrounding each slice.
   *
   * When setting the border width to 0, there may be small gaps between the
   * slices due to SVG antialiasing artefacts. To work around this, keep the
   * border width at 0.5 or 1, but set the <code>borderColor</code> to <code>null</code> instead.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.borderWidth">https://api.highcharts.com/highcharts/plotOptions.pie.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The center of the pie chart relative to the plot area. Can
   * be percentages or pixel values. The default behaviour (as of 3.0) is to
   * center the pie so that all slices and data labels are within the plot
   * area. As a consequence, the pie may actually jump around in a chart with
   * dynamic values, as the data labels move. In that case, the center should
   * be explicitly set, for example to <code>[&quot;50%&quot;, &quot;50%&quot;]</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.center">https://api.highcharts.com/highcharts/plotOptions.pie.center</a>
   *
   * @implspec center?: Array&lt;(number|string|null)&gt;;
   *
   */
  @JSProperty("center")
  @Nullable
  Array<Unknown> getCenter();

  /**
   * (Highcharts) The center of the pie chart relative to the plot area. Can
   * be percentages or pixel values. The default behaviour (as of 3.0) is to
   * center the pie so that all slices and data labels are within the plot
   * area. As a consequence, the pie may actually jump around in a chart with
   * dynamic values, as the data labels move. In that case, the center should
   * be explicitly set, for example to <code>[&quot;50%&quot;, &quot;50%&quot;]</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.center">https://api.highcharts.com/highcharts/plotOptions.pie.center</a>
   *
   * @implspec center?: Array&lt;(number|string|null)&gt;;
   *
   */
  @JSProperty("center")
  void setCenter(Array<Unknown> value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.className">https://api.highcharts.com/highcharts/plotOptions.pie.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.className">https://api.highcharts.com/highcharts/plotOptions.pie.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.clip">https://api.highcharts.com/highcharts/plotOptions.pie.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.clip">https://api.highcharts.com/highcharts/plotOptions.pie.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.color">https://api.highcharts.com/highcharts/plotOptions.pie.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.color">https://api.highcharts.com/highcharts/plotOptions.pie.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.color">https://api.highcharts.com/highcharts/plotOptions.pie.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.color">https://api.highcharts.com/highcharts/plotOptions.pie.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.colorAxis">https://api.highcharts.com/highmaps/plotOptions.pie.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.colorAxis">https://api.highcharts.com/highmaps/plotOptions.pie.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.colorIndex">https://api.highcharts.com/highcharts/plotOptions.pie.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.colorIndex">https://api.highcharts.com/highcharts/plotOptions.pie.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.colors">https://api.highcharts.com/highcharts/plotOptions.pie.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.colors">https://api.highcharts.com/highcharts/plotOptions.pie.colors</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.compare">https://api.highcharts.com/highstock/plotOptions.pie.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.compare">https://api.highcharts.com/highstock/plotOptions.pie.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.compareBase">https://api.highcharts.com/highstock/plotOptions.pie.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.compareBase">https://api.highcharts.com/highstock/plotOptions.pie.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.compareStart">https://api.highcharts.com/highstock/plotOptions.pie.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.compareStart">https://api.highcharts.com/highstock/plotOptions.pie.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pie.connectors">https://api.highcharts.com/gantt/plotOptions.pie.connectors</a>
   *
   * @implspec connectors?: PlotPieConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotPieConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pie.connectors">https://api.highcharts.com/gantt/plotOptions.pie.connectors</a>
   *
   * @implspec connectors?: PlotPieConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotPieConnectorsOptions value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.cursor">https://api.highcharts.com/highcharts/plotOptions.pie.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.cursor">https://api.highcharts.com/highcharts/plotOptions.pie.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.cursor">https://api.highcharts.com/highcharts/plotOptions.pie.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.dataGrouping">https://api.highcharts.com/highstock/plotOptions.pie.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotPieDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotPieDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.dataGrouping">https://api.highcharts.com/highstock/plotOptions.pie.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotPieDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotPieDataGroupingOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.dataLabels">https://api.highcharts.com/highcharts/plotOptions.pie.dataLabels</a>
   *
   * @implspec dataLabels?: PlotPieDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotPieDataLabelsOptions getDataLabels();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.dataLabels">https://api.highcharts.com/highcharts/plotOptions.pie.dataLabels</a>
   *
   * @implspec dataLabels?: PlotPieDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotPieDataLabelsOptions value);

  /**
   * (Highcharts) The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.depth">https://api.highcharts.com/highcharts/plotOptions.pie.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.depth">https://api.highcharts.com/highcharts/plotOptions.pie.depth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.description">https://api.highcharts.com/highcharts/plotOptions.pie.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.description">https://api.highcharts.com/highcharts/plotOptions.pie.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.dragDrop">https://api.highcharts.com/highcharts/plotOptions.pie.dragDrop</a>
   *
   * @implspec dragDrop?: PlotPieDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotPieDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.dragDrop">https://api.highcharts.com/highcharts/plotOptions.pie.dragDrop</a>
   *
   * @implspec dragDrop?: PlotPieDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotPieDragDropOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.pie.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.pie.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
   * right. Defaults to <code>startAngle</code> plus 360.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.endAngle">https://api.highcharts.com/highcharts/plotOptions.pie.endAngle</a>
   *
   * @implspec endAngle?: number;
   *
   */
  @JSProperty("endAngle")
  double getEndAngle();

  /**
   * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
   * right. Defaults to <code>startAngle</code> plus 360.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.endAngle">https://api.highcharts.com/highcharts/plotOptions.pie.endAngle</a>
   *
   * @implspec endAngle?: number;
   *
   */
  @JSProperty("endAngle")
  void setEndAngle(double value);

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.events">https://api.highcharts.com/highcharts/plotOptions.pie.events</a>
   *
   * @implspec events?: PlotPieEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPieEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.events">https://api.highcharts.com/highcharts/plotOptions.pie.events</a>
   *
   * @implspec events?: PlotPieEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPieEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.pie.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.pie.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.gapSize">https://api.highcharts.com/highstock/plotOptions.pie.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.gapSize">https://api.highcharts.com/highstock/plotOptions.pie.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.gapUnit">https://api.highcharts.com/highstock/plotOptions.pie.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.gapUnit">https://api.highcharts.com/highstock/plotOptions.pie.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(GapUnit value);

  /**
   * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
   * whether the series shall be redrawn as if the hidden point were <code>null</code>.
   *
   * The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.ignoreHiddenPoint">https://api.highcharts.com/highcharts/plotOptions.pie.ignoreHiddenPoint</a>
   *
   * @implspec ignoreHiddenPoint?: boolean;
   *
   */
  @JSProperty("ignoreHiddenPoint")
  boolean getIgnoreHiddenPoint();

  /**
   * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
   * whether the series shall be redrawn as if the hidden point were <code>null</code>.
   *
   * The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.ignoreHiddenPoint">https://api.highcharts.com/highcharts/plotOptions.pie.ignoreHiddenPoint</a>
   *
   * @implspec ignoreHiddenPoint?: boolean;
   *
   */
  @JSProperty("ignoreHiddenPoint")
  void setIgnoreHiddenPoint(boolean value);

  /**
   * (Highcharts) The size of the inner diameter for the pie. A size greater
   * than 0 renders a donut chart. Can be a percentage or pixel value.
   * Percentages are relative to the pie size. Pixel values are given as
   * integers.
   *
   * Note: in Highcharts &lt; 4.1.2, the percentage was relative to the plot
   * area, not the pie size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.innerSize">https://api.highcharts.com/highcharts/plotOptions.pie.innerSize</a>
   *
   * @implspec innerSize?: (number|string);
   *
   */
  @JSProperty("innerSize")
  @Nullable
  Unknown getInnerSize();

  /**
   * (Highcharts) The size of the inner diameter for the pie. A size greater
   * than 0 renders a donut chart. Can be a percentage or pixel value.
   * Percentages are relative to the pie size. Pixel values are given as
   * integers.
   *
   * Note: in Highcharts &lt; 4.1.2, the percentage was relative to the plot
   * area, not the pie size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.innerSize">https://api.highcharts.com/highcharts/plotOptions.pie.innerSize</a>
   *
   * @implspec innerSize?: (number|string);
   *
   */
  @JSProperty("innerSize")
  void setInnerSize(double value);

  /**
   * (Highcharts) The size of the inner diameter for the pie. A size greater
   * than 0 renders a donut chart. Can be a percentage or pixel value.
   * Percentages are relative to the pie size. Pixel values are given as
   * integers.
   *
   * Note: in Highcharts &lt; 4.1.2, the percentage was relative to the plot
   * area, not the pie size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.innerSize">https://api.highcharts.com/highcharts/plotOptions.pie.innerSize</a>
   *
   * @implspec innerSize?: (number|string);
   *
   */
  @JSProperty("innerSize")
  void setInnerSize(String value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.joinBy">https://api.highcharts.com/highmaps/plotOptions.pie.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.joinBy">https://api.highcharts.com/highmaps/plotOptions.pie.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.joinBy">https://api.highcharts.com/highmaps/plotOptions.pie.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.keys">https://api.highcharts.com/highcharts/plotOptions.pie.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.keys">https://api.highcharts.com/highcharts/plotOptions.pie.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.label">https://api.highcharts.com/highcharts/plotOptions.pie.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.label">https://api.highcharts.com/highstock/plotOptions.pie.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pie.label">https://api.highcharts.com/gantt/plotOptions.pie.label</a>
   *
   * @implspec label?: PlotPieLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotPieLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.label">https://api.highcharts.com/highcharts/plotOptions.pie.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.label">https://api.highcharts.com/highstock/plotOptions.pie.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pie.label">https://api.highcharts.com/gantt/plotOptions.pie.label</a>
   *
   * @implspec label?: PlotPieLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotPieLabelOptions value);

  /**
   * @implspec legendType?: string;
   *
   */
  @JSProperty("legendType")
  @Nullable
  String getLegendType();

  /**
   * @implspec legendType?: string;
   *
   */
  @JSProperty("legendType")
  void setLegendType(String value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.linecap">https://api.highcharts.com/highcharts/plotOptions.pie.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.linecap">https://api.highcharts.com/highstock/plotOptions.pie.linecap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.linecap">https://api.highcharts.com/highcharts/plotOptions.pie.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.linecap">https://api.highcharts.com/highstock/plotOptions.pie.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  void setLinecap(Linecap value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.linkedTo">https://api.highcharts.com/highcharts/plotOptions.pie.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.linkedTo">https://api.highcharts.com/highstock/plotOptions.pie.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pie.linkedTo">https://api.highcharts.com/gantt/plotOptions.pie.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.linkedTo">https://api.highcharts.com/highcharts/plotOptions.pie.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.linkedTo">https://api.highcharts.com/highstock/plotOptions.pie.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pie.linkedTo">https://api.highcharts.com/gantt/plotOptions.pie.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts) The minimum size for a pie in response to auto margins. The
   * pie will try to shrink to make room for data labels in side the plot
   * area, but only to this size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.minSize">https://api.highcharts.com/highcharts/plotOptions.pie.minSize</a>
   *
   * @implspec minSize?: number;
   *
   */
  @JSProperty("minSize")
  double getMinSize();

  /**
   * (Highcharts) The minimum size for a pie in response to auto margins. The
   * pie will try to shrink to make room for data labels in side the plot
   * area, but only to this size.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.minSize">https://api.highcharts.com/highcharts/plotOptions.pie.minSize</a>
   *
   * @implspec minSize?: number;
   *
   */
  @JSProperty("minSize")
  void setMinSize(double value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.pie.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.pie.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.point">https://api.highcharts.com/highcharts/plotOptions.pie.point</a>
   *
   * @implspec point?: PlotPiePointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotPiePointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.point">https://api.highcharts.com/highcharts/plotOptions.pie.point</a>
   *
   * @implspec point?: PlotPiePointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotPiePointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.pie.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.pie.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.pointRange">https://api.highcharts.com/highstock/plotOptions.pie.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.pointRange">https://api.highcharts.com/highstock/plotOptions.pie.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.selected">https://api.highcharts.com/highcharts/plotOptions.pie.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.selected">https://api.highcharts.com/highcharts/plotOptions.pie.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.shadow">https://api.highcharts.com/highcharts/plotOptions.pie.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.shadow">https://api.highcharts.com/highcharts/plotOptions.pie.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.shadow">https://api.highcharts.com/highcharts/plotOptions.pie.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.pie.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.pie.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Since 2.1, pies are not shown in the legend by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.showInLegend">https://api.highcharts.com/highcharts/plotOptions.pie.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Since 2.1, pies are not shown in the legend by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.showInLegend">https://api.highcharts.com/highcharts/plotOptions.pie.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.showInNavigator">https://api.highcharts.com/highstock/plotOptions.pie.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pie.showInNavigator">https://api.highcharts.com/highstock/plotOptions.pie.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts) The diameter of the pie relative to the plot area. Can be a
   * percentage or pixel value. Pixel values are given as integers. The
   * default behaviour (as of 3.0) is to scale to the plot area and give room
   * for data labels within the plot area. slicedOffset is also included in
   * the default size calculation. As a consequence, the size of the pie may
   * vary when points are updated and data labels more around. In that case it
   * is best to set a fixed value, for example <code>&quot;75%&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.size">https://api.highcharts.com/highcharts/plotOptions.pie.size</a>
   *
   * @implspec size?: (number|string|null);
   *
   */
  @JSProperty("size")
  @Nullable
  Unknown getSize();

  /**
   * (Highcharts) The diameter of the pie relative to the plot area. Can be a
   * percentage or pixel value. Pixel values are given as integers. The
   * default behaviour (as of 3.0) is to scale to the plot area and give room
   * for data labels within the plot area. slicedOffset is also included in
   * the default size calculation. As a consequence, the size of the pie may
   * vary when points are updated and data labels more around. In that case it
   * is best to set a fixed value, for example <code>&quot;75%&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.size">https://api.highcharts.com/highcharts/plotOptions.pie.size</a>
   *
   * @implspec size?: (number|string|null);
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) The diameter of the pie relative to the plot area. Can be a
   * percentage or pixel value. Pixel values are given as integers. The
   * default behaviour (as of 3.0) is to scale to the plot area and give room
   * for data labels within the plot area. slicedOffset is also included in
   * the default size calculation. As a consequence, the size of the pie may
   * vary when points are updated and data labels more around. In that case it
   * is best to set a fixed value, for example <code>&quot;75%&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.size">https://api.highcharts.com/highcharts/plotOptions.pie.size</a>
   *
   * @implspec size?: (number|string|null);
   *
   */
  @JSProperty("size")
  void setSize(String value);

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.pie.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.pie.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts) If a point is sliced, moved out from the center, how many
   * pixels should it be moved?.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.slicedOffset">https://api.highcharts.com/highcharts/plotOptions.pie.slicedOffset</a>
   *
   * @implspec slicedOffset?: number;
   *
   */
  @JSProperty("slicedOffset")
  double getSlicedOffset();

  /**
   * (Highcharts) If a point is sliced, moved out from the center, how many
   * pixels should it be moved?.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.slicedOffset">https://api.highcharts.com/highcharts/plotOptions.pie.slicedOffset</a>
   *
   * @implspec slicedOffset?: number;
   *
   */
  @JSProperty("slicedOffset")
  void setSlicedOffset(double value);

  /**
   * (Highcharts) The start angle of the pie slices in degrees where 0 is top
   * and 90 right.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.startAngle">https://api.highcharts.com/highcharts/plotOptions.pie.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  double getStartAngle();

  /**
   * (Highcharts) The start angle of the pie slices in degrees where 0 is top
   * and 90 right.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.startAngle">https://api.highcharts.com/highcharts/plotOptions.pie.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  void setStartAngle(double value);

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states">https://api.highcharts.com/highcharts/plotOptions.pie.states</a>
   *
   * @implspec states?: PlotPieStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotPieStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states">https://api.highcharts.com/highcharts/plotOptions.pie.states</a>
   *
   * @implspec states?: PlotPieStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotPieStatesOptions value);

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is
   * false and <code>tooltip.shared</code> is false, the tooltip will be hidden when
   * moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.pie.stickyTracking</a>
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
   * graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is
   * false and <code>tooltip.shared</code> is false, the tooltip will be hidden when
   * moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.pie.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.tooltip">https://api.highcharts.com/highcharts/plotOptions.pie.tooltip</a>
   *
   * @implspec tooltip?: PlotPieTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotPieTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.tooltip">https://api.highcharts.com/highcharts/plotOptions.pie.tooltip</a>
   *
   * @implspec tooltip?: PlotPieTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotPieTooltipOptions value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.visible">https://api.highcharts.com/highcharts/plotOptions.pie.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.visible">https://api.highcharts.com/highcharts/plotOptions.pie.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.zIndex">https://api.highcharts.com/highmaps/plotOptions.pie.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.zIndex">https://api.highcharts.com/highmaps/plotOptions.pie.zIndex</a>
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
