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
 * (Highcharts) Gauges are circular plots displaying one or more values with a
 * dial pointing to values along the perimeter.
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
 * Options for all <code>gauge</code> series are defined in plotOptions.gauge.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge">https://api.highcharts.com/highcharts/plotOptions.gauge</a>
 *
 */
public interface PlotGaugeOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.allAreas">https://api.highcharts.com/highmaps/plotOptions.gauge.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.allAreas">https://api.highcharts.com/highmaps/plotOptions.gauge.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.gauge.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.gauge.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.animation">https://api.highcharts.com/highcharts/plotOptions.gauge.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotGaugeAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.animation">https://api.highcharts.com/highcharts/plotOptions.gauge.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotGaugeAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.animation">https://api.highcharts.com/highcharts/plotOptions.gauge.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotGaugeAnimationOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.animation">https://api.highcharts.com/highcharts/plotOptions.gauge.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotGaugeAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotGaugeAnimationOptions value);

  /**
   * (Highmaps, Highcharts) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.borderColor">https://api.highcharts.com/highmaps/plotOptions.gauge.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.borderColor">https://api.highcharts.com/highcharts/plotOptions.gauge.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.borderColor">https://api.highcharts.com/highmaps/plotOptions.gauge.borderColor</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.borderColor">https://api.highcharts.com/highcharts/plotOptions.gauge.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.borderWidth">https://api.highcharts.com/highmaps/plotOptions.gauge.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.borderWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.borderWidth">https://api.highcharts.com/highmaps/plotOptions.gauge.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.borderWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.className">https://api.highcharts.com/highcharts/plotOptions.gauge.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.className">https://api.highcharts.com/highcharts/plotOptions.gauge.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.clip">https://api.highcharts.com/highcharts/plotOptions.gauge.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.clip">https://api.highcharts.com/highcharts/plotOptions.gauge.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.color">https://api.highcharts.com/highcharts/plotOptions.gauge.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.color">https://api.highcharts.com/highcharts/plotOptions.gauge.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.color">https://api.highcharts.com/highcharts/plotOptions.gauge.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.color">https://api.highcharts.com/highcharts/plotOptions.gauge.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.colorAxis">https://api.highcharts.com/highmaps/plotOptions.gauge.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.colorAxis">https://api.highcharts.com/highmaps/plotOptions.gauge.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.colorIndex">https://api.highcharts.com/highcharts/plotOptions.gauge.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.colorIndex">https://api.highcharts.com/highcharts/plotOptions.gauge.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.compare">https://api.highcharts.com/highstock/plotOptions.gauge.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.compare">https://api.highcharts.com/highstock/plotOptions.gauge.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.compareBase">https://api.highcharts.com/highstock/plotOptions.gauge.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.compareBase">https://api.highcharts.com/highstock/plotOptions.gauge.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.compareStart">https://api.highcharts.com/highstock/plotOptions.gauge.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.compareStart">https://api.highcharts.com/highstock/plotOptions.gauge.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.connectors">https://api.highcharts.com/gantt/plotOptions.gauge.connectors</a>
   *
   * @implspec connectors?: PlotGaugeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotGaugeConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.connectors">https://api.highcharts.com/gantt/plotOptions.gauge.connectors</a>
   *
   * @implspec connectors?: PlotGaugeConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotGaugeConnectorsOptions value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.cursor">https://api.highcharts.com/highcharts/plotOptions.gauge.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.cursor">https://api.highcharts.com/highcharts/plotOptions.gauge.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.cursor">https://api.highcharts.com/highcharts/plotOptions.gauge.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotGaugeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotGaugeDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotGaugeDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotGaugeDataGroupingOptions value);

  /**
   * (Highcharts) Data labels for the gauge. For gauges, the data labels are
   * enabled by default and shown in a bordered box below the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dataLabels">https://api.highcharts.com/highcharts/plotOptions.gauge.dataLabels</a>
   *
   * @implspec dataLabels?: PlotGaugeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotGaugeDataLabelsOptions getDataLabels();

  /**
   * (Highcharts) Data labels for the gauge. For gauges, the data labels are
   * enabled by default and shown in a bordered box below the point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dataLabels">https://api.highcharts.com/highcharts/plotOptions.gauge.dataLabels</a>
   *
   * @implspec dataLabels?: PlotGaugeDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotGaugeDataLabelsOptions value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.description">https://api.highcharts.com/highcharts/plotOptions.gauge.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.description">https://api.highcharts.com/highcharts/plotOptions.gauge.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts) Options for the dial or arrow pointer of the gauge.
   *
   * In styled mode, the dial is styled with the <code>.highcharts-gauge-series .highcharts-dial</code> rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial">https://api.highcharts.com/highcharts/plotOptions.gauge.dial</a>
   *
   * @implspec dial?: PlotGaugeDialOptions;
   *
   */
  @JSProperty("dial")
  @Nullable
  PlotGaugeDialOptions getDial();

  /**
   * (Highcharts) Options for the dial or arrow pointer of the gauge.
   *
   * In styled mode, the dial is styled with the <code>.highcharts-gauge-series .highcharts-dial</code> rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial">https://api.highcharts.com/highcharts/plotOptions.gauge.dial</a>
   *
   * @implspec dial?: PlotGaugeDialOptions;
   *
   */
  @JSProperty("dial")
  void setDial(PlotGaugeDialOptions value);

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dragDrop">https://api.highcharts.com/highcharts/plotOptions.gauge.dragDrop</a>
   *
   * @implspec dragDrop?: PlotGaugeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotGaugeDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dragDrop">https://api.highcharts.com/highcharts/plotOptions.gauge.dragDrop</a>
   *
   * @implspec dragDrop?: PlotGaugeDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotGaugeDragDropOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.gauge.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.gauge.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.events">https://api.highcharts.com/highcharts/plotOptions.gauge.events</a>
   *
   * @implspec events?: PlotGaugeEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotGaugeEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.events">https://api.highcharts.com/highcharts/plotOptions.gauge.events</a>
   *
   * @implspec events?: PlotGaugeEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotGaugeEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.gauge.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.gauge.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.gapSize">https://api.highcharts.com/highstock/plotOptions.gauge.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.gapSize">https://api.highcharts.com/highstock/plotOptions.gauge.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.gapUnit">https://api.highcharts.com/highstock/plotOptions.gauge.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.gapUnit">https://api.highcharts.com/highstock/plotOptions.gauge.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(GapUnit value);

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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.joinBy">https://api.highcharts.com/highmaps/plotOptions.gauge.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.joinBy">https://api.highcharts.com/highmaps/plotOptions.gauge.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.joinBy">https://api.highcharts.com/highmaps/plotOptions.gauge.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.keys">https://api.highcharts.com/highcharts/plotOptions.gauge.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.keys">https://api.highcharts.com/highcharts/plotOptions.gauge.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.label">https://api.highcharts.com/highcharts/plotOptions.gauge.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.label">https://api.highcharts.com/highstock/plotOptions.gauge.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.label">https://api.highcharts.com/gantt/plotOptions.gauge.label</a>
   *
   * @implspec label?: PlotGaugeLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotGaugeLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.label">https://api.highcharts.com/highcharts/plotOptions.gauge.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.label">https://api.highcharts.com/highstock/plotOptions.gauge.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.label">https://api.highcharts.com/gantt/plotOptions.gauge.label</a>
   *
   * @implspec label?: PlotGaugeLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotGaugeLabelOptions value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.linecap">https://api.highcharts.com/highcharts/plotOptions.gauge.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.linecap">https://api.highcharts.com/highstock/plotOptions.gauge.linecap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.linecap">https://api.highcharts.com/highcharts/plotOptions.gauge.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.linecap">https://api.highcharts.com/highstock/plotOptions.gauge.linecap</a>
   *
   * @implspec linecap?: (&quot;butt&quot;|&quot;round&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("linecap")
  void setLinecap(Linecap value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.lineWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.lineWidth">https://api.highcharts.com/highstock/plotOptions.gauge.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.lineWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.lineWidth">https://api.highcharts.com/highstock/plotOptions.gauge.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.linkedTo">https://api.highcharts.com/highcharts/plotOptions.gauge.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.linkedTo">https://api.highcharts.com/highstock/plotOptions.gauge.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.linkedTo">https://api.highcharts.com/gantt/plotOptions.gauge.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.linkedTo">https://api.highcharts.com/highcharts/plotOptions.gauge.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.linkedTo">https://api.highcharts.com/highstock/plotOptions.gauge.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.linkedTo">https://api.highcharts.com/gantt/plotOptions.gauge.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.gauge.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.gauge.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts) Allow the dial to overshoot the end of the perimeter axis by
   * this many degrees. Say if the gauge axis goes from 0 to 60, a value of
   * 100, or 1000, will show 5 degrees beyond the end of the axis when this
   * option is set to 5.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.overshoot">https://api.highcharts.com/highcharts/plotOptions.gauge.overshoot</a>
   *
   * @implspec overshoot?: number;
   *
   */
  @JSProperty("overshoot")
  double getOvershoot();

  /**
   * (Highcharts) Allow the dial to overshoot the end of the perimeter axis by
   * this many degrees. Say if the gauge axis goes from 0 to 60, a value of
   * 100, or 1000, will show 5 degrees beyond the end of the axis when this
   * option is set to 5.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.overshoot">https://api.highcharts.com/highcharts/plotOptions.gauge.overshoot</a>
   *
   * @implspec overshoot?: number;
   *
   */
  @JSProperty("overshoot")
  void setOvershoot(double value);

  /**
   * (Highcharts) Options for the pivot or the center point of the gauge.
   *
   * In styled mode, the pivot is styled with the <code>.highcharts-gauge-series .highcharts-pivot</code> rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot</a>
   *
   * @implspec pivot?: PlotGaugePivotOptions;
   *
   */
  @JSProperty("pivot")
  @Nullable
  PlotGaugePivotOptions getPivot();

  /**
   * (Highcharts) Options for the pivot or the center point of the gauge.
   *
   * In styled mode, the pivot is styled with the <code>.highcharts-gauge-series .highcharts-pivot</code> rule.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pivot">https://api.highcharts.com/highcharts/plotOptions.gauge.pivot</a>
   *
   * @implspec pivot?: PlotGaugePivotOptions;
   *
   */
  @JSProperty("pivot")
  void setPivot(PlotGaugePivotOptions value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.point">https://api.highcharts.com/highcharts/plotOptions.gauge.point</a>
   *
   * @implspec point?: PlotGaugePointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotGaugePointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.point">https://api.highcharts.com/highcharts/plotOptions.gauge.point</a>
   *
   * @implspec point?: PlotGaugePointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotGaugePointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.gauge.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.gauge.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointInterval">https://api.highcharts.com/highcharts/plotOptions.gauge.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointInterval">https://api.highcharts.com/highstock/plotOptions.gauge.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.pointInterval">https://api.highcharts.com/gantt/plotOptions.gauge.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointInterval">https://api.highcharts.com/highcharts/plotOptions.gauge.pointInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointInterval">https://api.highcharts.com/highstock/plotOptions.gauge.pointInterval</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.pointInterval">https://api.highcharts.com/gantt/plotOptions.gauge.pointInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.gauge.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.gauge.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.gauge.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointIntervalUnit">https://api.highcharts.com/highcharts/plotOptions.gauge.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointIntervalUnit">https://api.highcharts.com/highstock/plotOptions.gauge.pointIntervalUnit</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.pointIntervalUnit">https://api.highcharts.com/gantt/plotOptions.gauge.pointIntervalUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointRange">https://api.highcharts.com/highstock/plotOptions.gauge.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointRange">https://api.highcharts.com/highstock/plotOptions.gauge.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointStart">https://api.highcharts.com/highcharts/plotOptions.gauge.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointStart">https://api.highcharts.com/highstock/plotOptions.gauge.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.pointStart">https://api.highcharts.com/gantt/plotOptions.gauge.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.pointStart">https://api.highcharts.com/highcharts/plotOptions.gauge.pointStart</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.pointStart">https://api.highcharts.com/highstock/plotOptions.gauge.pointStart</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gauge.pointStart">https://api.highcharts.com/gantt/plotOptions.gauge.pointStart</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.selected">https://api.highcharts.com/highcharts/plotOptions.gauge.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.selected">https://api.highcharts.com/highcharts/plotOptions.gauge.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.gauge.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.gauge.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Defaults to false for gauge series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.showInLegend">https://api.highcharts.com/highcharts/plotOptions.gauge.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Defaults to false for gauge series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.showInLegend">https://api.highcharts.com/highcharts/plotOptions.gauge.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.showInNavigator">https://api.highcharts.com/highstock/plotOptions.gauge.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.showInNavigator">https://api.highcharts.com/highstock/plotOptions.gauge.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.gauge.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.gauge.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.gauge.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.gauge.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.tooltip">https://api.highcharts.com/highcharts/plotOptions.gauge.tooltip</a>
   *
   * @implspec tooltip?: PlotGaugeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotGaugeTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.tooltip">https://api.highcharts.com/highcharts/plotOptions.gauge.tooltip</a>
   *
   * @implspec tooltip?: PlotGaugeTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotGaugeTooltipOptions value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.visible">https://api.highcharts.com/highcharts/plotOptions.gauge.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.visible">https://api.highcharts.com/highcharts/plotOptions.gauge.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts) When this option is <code>true</code>, the dial will wrap around the
   * axes. For instance, in a full-range gauge going from 0 to 360, a value of
   * 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.wrap">https://api.highcharts.com/highcharts/plotOptions.gauge.wrap</a>
   *
   * @implspec wrap?: boolean;
   *
   */
  @JSProperty("wrap")
  boolean getWrap();

  /**
   * (Highcharts) When this option is <code>true</code>, the dial will wrap around the
   * axes. For instance, in a full-range gauge going from 0 to 360, a value of
   * 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.wrap">https://api.highcharts.com/highcharts/plotOptions.gauge.wrap</a>
   *
   * @implspec wrap?: boolean;
   *
   */
  @JSProperty("wrap")
  void setWrap(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.zIndex">https://api.highcharts.com/highmaps/plotOptions.gauge.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gauge.zIndex">https://api.highcharts.com/highmaps/plotOptions.gauge.zIndex</a>
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

  /**
   */
  abstract class PointIntervalUnit extends JsEnum {
    public static final PointIntervalUnit DAY = JsEnum.of("day");

    public static final PointIntervalUnit MONTH = JsEnum.of("month");

    public static final PointIntervalUnit YEAR = JsEnum.of("year");
  }
}
