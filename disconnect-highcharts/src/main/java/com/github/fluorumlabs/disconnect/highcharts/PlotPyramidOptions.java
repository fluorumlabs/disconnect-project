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
 * (Highcharts) A pyramid series is a special type of funnel, without neck and
 * reversed by default. Requires the funnel module.
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
 * Options for all <code>pyramid</code> series are defined in plotOptions.pyramid.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid">https://api.highcharts.com/highcharts/plotOptions.pyramid</a>
 *
 */
public interface PlotPyramidOptions extends Any {
  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.allAreas">https://api.highcharts.com/highmaps/plotOptions.pyramid.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.allAreas">https://api.highcharts.com/highmaps/plotOptions.pyramid.allAreas</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.pyramid.allowPointSelect</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.pyramid.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts) Initial animation is by default disabled for the funnel
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.animation</a>
   *
   * @implspec animation?: (boolean|PlotPyramidAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Initial animation is by default disabled for the funnel
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.animation</a>
   *
   * @implspec animation?: (boolean|PlotPyramidAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Initial animation is by default disabled for the funnel
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.animation">https://api.highcharts.com/highcharts/plotOptions.pyramid.animation</a>
   *
   * @implspec animation?: (boolean|PlotPyramidAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotPyramidAnimationOptions value);

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.borderColor">https://api.highcharts.com/highcharts/plotOptions.pyramid.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.borderColor">https://api.highcharts.com/highcharts/plotOptions.pyramid.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.borderWidth">https://api.highcharts.com/highcharts/plotOptions.pyramid.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.borderWidth">https://api.highcharts.com/highcharts/plotOptions.pyramid.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The center of the series. By default, it is centered in the
   * middle of the plot area, so it fills the plot area height.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.center">https://api.highcharts.com/highcharts/plotOptions.pyramid.center</a>
   *
   * @implspec center?: Array&lt;(number|string)&gt;;
   *
   */
  @JSProperty("center")
  @Nullable
  Array<Unknown> getCenter();

  /**
   * (Highcharts) The center of the series. By default, it is centered in the
   * middle of the plot area, so it fills the plot area height.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.center">https://api.highcharts.com/highcharts/plotOptions.pyramid.center</a>
   *
   * @implspec center?: Array&lt;(number|string)&gt;;
   *
   */
  @JSProperty("center")
  void setCenter(Array<Unknown> value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.className">https://api.highcharts.com/highcharts/plotOptions.pyramid.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.className">https://api.highcharts.com/highcharts/plotOptions.pyramid.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.clip">https://api.highcharts.com/highcharts/plotOptions.pyramid.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.clip">https://api.highcharts.com/highcharts/plotOptions.pyramid.clip</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.color">https://api.highcharts.com/highcharts/plotOptions.pyramid.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.color">https://api.highcharts.com/highcharts/plotOptions.pyramid.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.color">https://api.highcharts.com/highcharts/plotOptions.pyramid.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.color">https://api.highcharts.com/highcharts/plotOptions.pyramid.color</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.colorAxis">https://api.highcharts.com/highmaps/plotOptions.pyramid.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.colorAxis">https://api.highcharts.com/highmaps/plotOptions.pyramid.colorAxis</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.colorIndex">https://api.highcharts.com/highcharts/plotOptions.pyramid.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.colorIndex">https://api.highcharts.com/highcharts/plotOptions.pyramid.colorIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.colors">https://api.highcharts.com/highcharts/plotOptions.pyramid.colors</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.colors">https://api.highcharts.com/highcharts/plotOptions.pyramid.colors</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.compare">https://api.highcharts.com/highstock/plotOptions.pyramid.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.compare">https://api.highcharts.com/highstock/plotOptions.pyramid.compare</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.compareBase">https://api.highcharts.com/highstock/plotOptions.pyramid.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.compareBase">https://api.highcharts.com/highstock/plotOptions.pyramid.compareBase</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.compareStart">https://api.highcharts.com/highstock/plotOptions.pyramid.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.compareStart">https://api.highcharts.com/highstock/plotOptions.pyramid.compareStart</a>
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
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pyramid.connectors">https://api.highcharts.com/gantt/plotOptions.pyramid.connectors</a>
   *
   * @implspec connectors?: PlotPyramidConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotPyramidConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pyramid.connectors">https://api.highcharts.com/gantt/plotOptions.pyramid.connectors</a>
   *
   * @implspec connectors?: PlotPyramidConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotPyramidConnectorsOptions value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.cursor">https://api.highcharts.com/highcharts/plotOptions.pyramid.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.cursor">https://api.highcharts.com/highcharts/plotOptions.pyramid.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.cursor">https://api.highcharts.com/highcharts/plotOptions.pyramid.cursor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.dataGrouping">https://api.highcharts.com/highstock/plotOptions.pyramid.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotPyramidDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  @Nullable
  PlotPyramidDataGroupingOptions getDataGrouping();

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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.dataGrouping">https://api.highcharts.com/highstock/plotOptions.pyramid.dataGrouping</a>
   *
   * @implspec dataGrouping?: PlotPyramidDataGroupingOptions;
   *
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(PlotPyramidDataGroupingOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels</a>
   *
   * @implspec dataLabels?: PlotPyramidDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotPyramidDataLabelsOptions getDataLabels();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels">https://api.highcharts.com/highcharts/plotOptions.pyramid.dataLabels</a>
   *
   * @implspec dataLabels?: PlotPyramidDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotPyramidDataLabelsOptions value);

  /**
   * (Highcharts) The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.depth">https://api.highcharts.com/highcharts/plotOptions.pyramid.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.depth">https://api.highcharts.com/highcharts/plotOptions.pyramid.depth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.description">https://api.highcharts.com/highcharts/plotOptions.pyramid.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.description">https://api.highcharts.com/highcharts/plotOptions.pyramid.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop">https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop</a>
   *
   * @implspec dragDrop?: PlotPyramidDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotPyramidDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop">https://api.highcharts.com/highcharts/plotOptions.pyramid.dragDrop</a>
   *
   * @implspec dragDrop?: PlotPyramidDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotPyramidDragDropOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.pyramid.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.pyramid.enableMouseTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.endAngle">https://api.highcharts.com/highcharts/plotOptions.pyramid.endAngle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.endAngle">https://api.highcharts.com/highcharts/plotOptions.pyramid.endAngle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.events">https://api.highcharts.com/highcharts/plotOptions.pyramid.events</a>
   *
   * @implspec events?: PlotPyramidEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPyramidEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.events">https://api.highcharts.com/highcharts/plotOptions.pyramid.events</a>
   *
   * @implspec events?: PlotPyramidEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPyramidEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.pyramid.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.pyramid.exposeElementToA11y</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.gapSize">https://api.highcharts.com/highstock/plotOptions.pyramid.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.gapSize">https://api.highcharts.com/highstock/plotOptions.pyramid.gapSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.gapUnit">https://api.highcharts.com/highstock/plotOptions.pyramid.gapUnit</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.gapUnit">https://api.highcharts.com/highstock/plotOptions.pyramid.gapUnit</a>
   *
   * @implspec gapUnit?: (&quot;relative&quot;|&quot;value&quot;);
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(GapUnit value);

  /**
   * (Highcharts) The height of the funnel or pyramid. If it is a number it
   * defines the pixel height, if it is a percentage string it is the
   * percentage of the plot area height.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.height">https://api.highcharts.com/highcharts/plotOptions.pyramid.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  @Nullable
  Unknown getHeight();

  /**
   * (Highcharts) The height of the funnel or pyramid. If it is a number it
   * defines the pixel height, if it is a percentage string it is the
   * percentage of the plot area height.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.height">https://api.highcharts.com/highcharts/plotOptions.pyramid.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts) The height of the funnel or pyramid. If it is a number it
   * defines the pixel height, if it is a percentage string it is the
   * percentage of the plot area height.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.height">https://api.highcharts.com/highcharts/plotOptions.pyramid.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  void setHeight(String value);

  /**
   * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
   * whether the series shall be redrawn as if the hidden point were <code>null</code>.
   *
   * The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.ignoreHiddenPoint">https://api.highcharts.com/highcharts/plotOptions.pyramid.ignoreHiddenPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.ignoreHiddenPoint">https://api.highcharts.com/highcharts/plotOptions.pyramid.ignoreHiddenPoint</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.innerSize">https://api.highcharts.com/highcharts/plotOptions.pyramid.innerSize</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.innerSize">https://api.highcharts.com/highcharts/plotOptions.pyramid.innerSize</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.innerSize">https://api.highcharts.com/highcharts/plotOptions.pyramid.innerSize</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.joinBy">https://api.highcharts.com/highmaps/plotOptions.pyramid.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.joinBy">https://api.highcharts.com/highmaps/plotOptions.pyramid.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.joinBy">https://api.highcharts.com/highmaps/plotOptions.pyramid.joinBy</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.keys">https://api.highcharts.com/highcharts/plotOptions.pyramid.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.keys">https://api.highcharts.com/highcharts/plotOptions.pyramid.keys</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.label">https://api.highcharts.com/highcharts/plotOptions.pyramid.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.label">https://api.highcharts.com/highstock/plotOptions.pyramid.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pyramid.label">https://api.highcharts.com/gantt/plotOptions.pyramid.label</a>
   *
   * @implspec label?: PlotPyramidLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotPyramidLabelOptions getLabel();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.label">https://api.highcharts.com/highcharts/plotOptions.pyramid.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.label">https://api.highcharts.com/highstock/plotOptions.pyramid.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pyramid.label">https://api.highcharts.com/gantt/plotOptions.pyramid.label</a>
   *
   * @implspec label?: PlotPyramidLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotPyramidLabelOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.linecap">https://api.highcharts.com/highcharts/plotOptions.pyramid.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.linecap">https://api.highcharts.com/highstock/plotOptions.pyramid.linecap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.linecap">https://api.highcharts.com/highcharts/plotOptions.pyramid.linecap</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.linecap">https://api.highcharts.com/highstock/plotOptions.pyramid.linecap</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.linkedTo">https://api.highcharts.com/highcharts/plotOptions.pyramid.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.linkedTo">https://api.highcharts.com/highstock/plotOptions.pyramid.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pyramid.linkedTo">https://api.highcharts.com/gantt/plotOptions.pyramid.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.linkedTo">https://api.highcharts.com/highcharts/plotOptions.pyramid.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.linkedTo">https://api.highcharts.com/highstock/plotOptions.pyramid.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.pyramid.linkedTo">https://api.highcharts.com/gantt/plotOptions.pyramid.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.minSize">https://api.highcharts.com/highcharts/plotOptions.pyramid.minSize</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.minSize">https://api.highcharts.com/highcharts/plotOptions.pyramid.minSize</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.pyramid.navigatorOptions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.navigatorOptions">https://api.highcharts.com/highstock/plotOptions.pyramid.navigatorOptions</a>
   *
   * @implspec navigatorOptions?: PlotSeriesOptions;
   *
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(PlotSeriesOptions value);

  /**
   * (Highcharts) The pyramid neck width is zero by default, as opposed to the
   * funnel, which shares the same layout logic.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.neckHeight">https://api.highcharts.com/highcharts/plotOptions.pyramid.neckHeight</a>
   *
   * @implspec neckHeight?: string;
   *
   */
  @JSProperty("neckHeight")
  @Nullable
  String getNeckHeight();

  /**
   * (Highcharts) The pyramid neck width is zero by default, as opposed to the
   * funnel, which shares the same layout logic.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.neckHeight">https://api.highcharts.com/highcharts/plotOptions.pyramid.neckHeight</a>
   *
   * @implspec neckHeight?: string;
   *
   */
  @JSProperty("neckHeight")
  void setNeckHeight(String value);

  /**
   * (Highcharts) The pyramid neck width is zero by default, as opposed to the
   * funnel, which shares the same layout logic.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.neckWidth">https://api.highcharts.com/highcharts/plotOptions.pyramid.neckWidth</a>
   *
   * @implspec neckWidth?: string;
   *
   */
  @JSProperty("neckWidth")
  @Nullable
  String getNeckWidth();

  /**
   * (Highcharts) The pyramid neck width is zero by default, as opposed to the
   * funnel, which shares the same layout logic.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.neckWidth">https://api.highcharts.com/highcharts/plotOptions.pyramid.neckWidth</a>
   *
   * @implspec neckWidth?: string;
   *
   */
  @JSProperty("neckWidth")
  void setNeckWidth(String value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.point">https://api.highcharts.com/highcharts/plotOptions.pyramid.point</a>
   *
   * @implspec point?: PlotPyramidPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotPyramidPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.point">https://api.highcharts.com/highcharts/plotOptions.pyramid.point</a>
   *
   * @implspec point?: PlotPyramidPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotPyramidPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.pyramid.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.pyramid.pointDescriptionFormatter</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.pointRange">https://api.highcharts.com/highstock/plotOptions.pyramid.pointRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.pointRange">https://api.highcharts.com/highstock/plotOptions.pyramid.pointRange</a>
   *
   * @implspec pointRange?: number;
   *
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts) The pyramid is reversed by default, as opposed to the
   * funnel, which shares the layout engine, and is not reversed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.reversed">https://api.highcharts.com/highcharts/plotOptions.pyramid.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts) The pyramid is reversed by default, as opposed to the
   * funnel, which shares the layout engine, and is not reversed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.reversed">https://api.highcharts.com/highcharts/plotOptions.pyramid.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.selected">https://api.highcharts.com/highcharts/plotOptions.pyramid.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.selected">https://api.highcharts.com/highcharts/plotOptions.pyramid.selected</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.shadow">https://api.highcharts.com/highcharts/plotOptions.pyramid.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.shadow">https://api.highcharts.com/highcharts/plotOptions.pyramid.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.shadow">https://api.highcharts.com/highcharts/plotOptions.pyramid.shadow</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.pyramid.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.pyramid.showCheckbox</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.showInLegend">https://api.highcharts.com/highcharts/plotOptions.pyramid.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.showInLegend">https://api.highcharts.com/highcharts/plotOptions.pyramid.showInLegend</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.showInNavigator">https://api.highcharts.com/highstock/plotOptions.pyramid.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pyramid.showInNavigator">https://api.highcharts.com/highstock/plotOptions.pyramid.showInNavigator</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.pyramid.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.pyramid.skipKeyboardNavigation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.slicedOffset">https://api.highcharts.com/highcharts/plotOptions.pyramid.slicedOffset</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.slicedOffset">https://api.highcharts.com/highcharts/plotOptions.pyramid.slicedOffset</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.startAngle">https://api.highcharts.com/highcharts/plotOptions.pyramid.startAngle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.startAngle">https://api.highcharts.com/highcharts/plotOptions.pyramid.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  void setStartAngle(double value);

  /**
   * (Highcharts) Options for the series states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states">https://api.highcharts.com/highcharts/plotOptions.pyramid.states</a>
   *
   * @implspec states?: PlotPyramidStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotPyramidStatesOptions getStates();

  /**
   * (Highcharts) Options for the series states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states">https://api.highcharts.com/highcharts/plotOptions.pyramid.states</a>
   *
   * @implspec states?: PlotPyramidStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotPyramidStatesOptions value);

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is
   * false and <code>tooltip.shared</code> is false, the tooltip will be hidden when
   * moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.pyramid.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.pyramid.stickyTracking</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.tooltip">https://api.highcharts.com/highcharts/plotOptions.pyramid.tooltip</a>
   *
   * @implspec tooltip?: PlotPyramidTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotPyramidTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.tooltip">https://api.highcharts.com/highcharts/plotOptions.pyramid.tooltip</a>
   *
   * @implspec tooltip?: PlotPyramidTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotPyramidTooltipOptions value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.visible">https://api.highcharts.com/highcharts/plotOptions.pyramid.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.visible">https://api.highcharts.com/highcharts/plotOptions.pyramid.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts) The width of the funnel compared to the width of the plot
   * area, or the pixel width if it is a number.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.width">https://api.highcharts.com/highcharts/plotOptions.pyramid.width</a>
   *
   * @implspec width?: (number|string);
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown getWidth();

  /**
   * (Highcharts) The width of the funnel compared to the width of the plot
   * area, or the pixel width if it is a number.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.width">https://api.highcharts.com/highcharts/plotOptions.pyramid.width</a>
   *
   * @implspec width?: (number|string);
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts) The width of the funnel compared to the width of the plot
   * area, or the pixel width if it is a number.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.width">https://api.highcharts.com/highcharts/plotOptions.pyramid.width</a>
   *
   * @implspec width?: (number|string);
   *
   */
  @JSProperty("width")
  void setWidth(String value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.zIndex">https://api.highcharts.com/highmaps/plotOptions.pyramid.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.zIndex">https://api.highcharts.com/highmaps/plotOptions.pyramid.zIndex</a>
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
