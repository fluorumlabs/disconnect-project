package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( DataSortingOptionsObject | PlotMapbubbleDataSortingOptions ) */;
import js.lang.Unknown /* ( PlotMapbubbleDataLabelsOptions | Array < PlotMapbubbleDataLabelsOptions > ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( boolean | number | string ) */;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* ( string | Array < string > ) */;
import js.lang.Unknown /* ( string | CursorValue ) */;
import js.lang.Unknown /* SeriesLinecapValue */;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A map bubble series is a bubble series laid out on top of a map
 * series, where each bubble is tied to a specific map area.
 *
 * In TypeScript the type option must always be set.
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
 * Options for all <code>mapbubble</code> series are defined in plotOptions.mapbubble.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotMapbubbleOptions extends Any {
  /**
   * (Highmaps) Accessibility options for a series.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  SeriesAccessibilityOptionsObject getAccessibility();

  /**
   * (Highmaps) Accessibility options for a series.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable SeriesAccessibilityOptionsObject value);

  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   */
  @JSProperty("allAreas")
  boolean getAllAreas();

  /**
   * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
   * rendered. If <code>true</code>, areas which don't correspond to a data point, are
   * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
   *
   */
  @JSProperty("allAreas")
  void setAllAreas(boolean value);

  /**
   * (Highmaps) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * The selected points can be handled by point select and unselect events,
   * or collectively by the getSelectedPoints function.
   *
   * And alternative way of selecting points is through dragging.
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highmaps) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * The selected points can be handled by point select and unselect events,
   * or collectively by the getSelectedPoints function.
   *
   * And alternative way of selecting points is through dragging.
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highmaps) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <code>duration</code>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <code>easing</code>: Can be a string reference to an easing function set on the
   * <code>Math</code> object or a function. See the <em>Custom easing function</em> demo below.
   *
   * </li>
   * </ul>
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highmaps) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <code>duration</code>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <code>easing</code>: Can be a string reference to an easing function set on the
   * <code>Math</code> object or a function. See the <em>Custom easing function</em> demo below.
   *
   * </li>
   * </ul>
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highmaps) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <code>duration</code>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <code>easing</code>: Can be a string reference to an easing function set on the
   * <code>Math</code> object or a function. See the <em>Custom easing function</em> demo below.
   *
   * </li>
   * </ul>
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highmaps) If there are more points in the series than the
   * <code>animationLimit</code>, the animation won't run. Animation affects overall
   * performance and doesn't work well with heavy data series.
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highmaps) If there are more points in the series than the
   * <code>animationLimit</code>, the animation won't run. Animation affects overall
   * performance and doesn't work well with heavy data series.
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highmaps) Sets the color blending in the boost module.
   *
   */
  @JSProperty("boostBlending")
  @Nullable
  BoostBlending getBoostBlending();

  /**
   * (Highmaps) Sets the color blending in the boost module.
   *
   */
  @JSProperty("boostBlending")
  void setBoostBlending(@Nullable BoostBlending value);

  /**
   * (Highmaps) Set the point threshold for when a series should enter boost
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
   */
  @JSProperty("boostThreshold")
  double getBoostThreshold();

  /**
   * (Highmaps) Set the point threshold for when a series should enter boost
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
   */
  @JSProperty("boostThreshold")
  void setBoostThreshold(double value);

  /**
   * (Highmaps) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highmaps) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highmaps) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highmaps) The border color of the map areas.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highmaps) The border width of each map area.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of each map area.
   *
   * In styled mode, the border stroke width is given in the
   * <code>.highcharts-point</code> class.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highmaps) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highmaps) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highmaps) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highmaps) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highmaps) The main color of the series. This color affects both the fill
   * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highmaps) The main color of the series. This color affects both the fill
   * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highmaps) The main color of the series. This color affects both the fill
   * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highmaps) The main color of the series. This color affects both the fill
   * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
   * this number defines which colorAxis the particular series is connected
   * to. It refers to either the axis id or the index of the axis in the
   * colorAxis array, with 0 being the first. Set this option to false to
   * prevent a series from connecting to the default color axis.
   *
   * Since v7.2.0 the option can also be an axis id or an axis index instead
   * of a boolean flag.
   *
   */
  @JSProperty("colorAxis")
  @Nullable
  Unknown /* ( boolean | number | string ) */ getColorAxis();

  /**
   * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
   * this number defines which colorAxis the particular series is connected
   * to. It refers to either the axis id or the index of the axis in the
   * colorAxis array, with 0 being the first. Set this option to false to
   * prevent a series from connecting to the default color axis.
   *
   * Since v7.2.0 the option can also be an axis id or an axis index instead
   * of a boolean flag.
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
   * this number defines which colorAxis the particular series is connected
   * to. It refers to either the axis id or the index of the axis in the
   * colorAxis array, with 0 being the first. Set this option to false to
   * prevent a series from connecting to the default color axis.
   *
   * Since v7.2.0 the option can also be an axis id or an axis index instead
   * of a boolean flag.
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(double value);

  /**
   * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
   * this number defines which colorAxis the particular series is connected
   * to. It refers to either the axis id or the index of the axis in the
   * colorAxis array, with 0 being the first. Set this option to false to
   * prevent a series from connecting to the default color axis.
   *
   * Since v7.2.0 the option can also be an axis id or an axis index instead
   * of a boolean flag.
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(@Nullable String value);

  /**
   * (Highmaps) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highmaps) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Determines what data value should be
   * used to calculate point color if <code>colorAxis</code> is used. Requires to set
   * <code>min</code> and <code>max</code> if some custom point property is used or if approximation
   * for data grouping is set to <code>'sum'</code>.
   *
   */
  @JSProperty("colorKey")
  @Nullable
  String getColorKey();

  /**
   * (Highcharts, Highstock, Highmaps) Determines what data value should be
   * used to calculate point color if <code>colorAxis</code> is used. Requires to set
   * <code>min</code> and <code>max</code> if some custom point property is used or if approximation
   * for data grouping is set to <code>'sum'</code>.
   *
   */
  @JSProperty("colorKey")
  void setColorKey(@Nullable String value);

  /**
   * (Highstock) Compare the values of the series against the first non-null,
   * non- zero value in the visible range. The y axis will show percentage or
   * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
   * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
   * the development of the series against each other. Adds a <code>change</code> field
   * to every point object.
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
   */
  @JSProperty("compare")
  void setCompare(@Nullable String value);

  /**
   * (Highstock) When compare is <code>percent</code>, this option dictates whether to
   * use 0 or 100 as the base of comparison.
   *
   */
  @JSProperty("compareBase")
  @Nullable
  CompareBase getCompareBase();

  /**
   * (Highstock) When compare is <code>percent</code>, this option dictates whether to
   * use 0 or 100 as the base of comparison.
   *
   */
  @JSProperty("compareBase")
  void setCompareBase(@Nullable CompareBase value);

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point <strong>before</strong>
   * the range.
   *
   * In other words, this flag determines if first point within the visible
   * range will have 0% (<code>compareStart=true</code>) or should have been already
   * calculated according to the previous point (<code>compareStart=false</code>).
   *
   */
  @JSProperty("compareStart")
  boolean getCompareStart();

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point <strong>before</strong>
   * the range.
   *
   * In other words, this flag determines if first point within the visible
   * range will have 0% (<code>compareStart=true</code>) or should have been already
   * calculated according to the previous point (<code>compareStart=false</code>).
   *
   */
  @JSProperty("compareStart")
  void setCompareStart(boolean value);

  /**
   * (Highcharts) Polar charts only. Whether to connect the ends of a line
   * series plot across the extremes.
   *
   */
  @JSProperty("connectEnds")
  boolean getConnectEnds();

  /**
   * (Highcharts) Polar charts only. Whether to connect the ends of a line
   * series plot across the extremes.
   *
   */
  @JSProperty("connectEnds")
  void setConnectEnds(boolean value);

  /**
   * (Highcharts, Highstock) Whether to connect a graph line across null
   * points, or render a gap between the two points on either side of the
   * null.
   *
   */
  @JSProperty("connectNulls")
  boolean getConnectNulls();

  /**
   * (Highcharts, Highstock) Whether to connect a graph line across null
   * points, or render a gap between the two points on either side of the
   * null.
   *
   */
  @JSProperty("connectNulls")
  void setConnectNulls(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   */
  @JSProperty("connectors")
  @Nullable
  SeriesConnectorsOptionsObject getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   */
  @JSProperty("connectors")
  void setConnectors(@Nullable SeriesConnectorsOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) When true, each point or column edge is
   * rounded to its nearest pixel in order to render sharp on screen. In some
   * cases, when there are a lot of densely packed columns, this leads to
   * visible difference in column widths or distance between columns. In these
   * cases, setting <code>crisp</code> to <code>false</code> may look better, even though each
   * column is rendered blurry.
   *
   */
  @JSProperty("crisp")
  boolean getCrisp();

  /**
   * (Highcharts, Highstock, Gantt) When true, each point or column edge is
   * rounded to its nearest pixel in order to render sharp on screen. In some
   * cases, when there are a lot of densely packed columns, this leads to
   * visible difference in column widths or distance between columns. In these
   * cases, setting <code>crisp</code> to <code>false</code> may look better, even though each
   * column is rendered blurry.
   *
   */
  @JSProperty("crisp")
  void setCrisp(boolean value);

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
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highmaps) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown /* ( string | CursorValue ) */ getCursor();

  /**
   * (Highmaps) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable String value);

  /**
   * (Highmaps) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable Cursor value);

  /**
   * (Highmaps) A reserved subspace to store options and values for customized
   * functionality. Here you can add additional data for your own event
   * callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Highmaps) A reserved subspace to store options and values for customized
   * functionality. Here you can add additional data for your own event
   * callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

  /**
   * (Highmaps) Name of the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highmaps) Name of the dash style to use for the graph, or for some
   * series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

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
   */
  @JSProperty("dataGrouping")
  @Nullable
  DataGroupingOptionsObject getDataGrouping();

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
   */
  @JSProperty("dataGrouping")
  void setDataGrouping(@Nullable DataGroupingOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
   * labels, appearing next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( PlotMapbubbleDataLabelsOptions | Array < PlotMapbubbleDataLabelsOptions > ) */ getDataLabels(
      );

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
   * labels, appearing next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable PlotMapbubbleDataLabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
   * labels, appearing next to each data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotMapbubbleDataLabelsOptions... value);

  /**
   * (Highcharts, Highstock) Options for the series data sorting.
   *
   */
  @JSProperty("dataSorting")
  @Nullable
  Unknown /* ( DataSortingOptionsObject | PlotMapbubbleDataSortingOptions ) */ getDataSorting();

  /**
   * (Highcharts, Highstock) Options for the series data sorting.
   *
   */
  @JSProperty("dataSorting")
  void setDataSorting(@Nullable DataSortingOptionsObject value);

  /**
   * (Highcharts, Highstock) Options for the series data sorting.
   *
   */
  @JSProperty("dataSorting")
  void setDataSorting(@Nullable PlotMapbubbleDataSortingOptions value);

  /**
   * (Highmaps) A description of the series to add to the screen reader
   * information about the series.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highmaps) A description of the series to add to the screen reader
   * information about the series.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highmaps) Whether to display negative sized bubbles. The threshold is
   * given by the zThreshold option, and negative bubbles can be visualized by
   * setting negativeColor.
   *
   */
  @JSProperty("displayNegative")
  boolean getDisplayNegative();

  /**
   * (Highmaps) Whether to display negative sized bubbles. The threshold is
   * given by the zThreshold option, and negative bubbles can be visualized by
   * setting negativeColor.
   *
   */
  @JSProperty("displayNegative")
  void setDisplayNegative(boolean value);

  /**
   * (Highmaps) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesDragDropOptionsObject getDragDrop();

  /**
   * (Highmaps) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(@Nullable SeriesDragDropOptionsObject value);

  /**
   * (Highmaps) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highmaps) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highmaps) General event handlers for the series items. These event hooks
   * can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesEventsOptionsObject getEvents();

  /**
   * (Highmaps) General event handlers for the series items. These event hooks
   * can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable SeriesEventsOptionsObject value);

  /**
   * (Highmaps) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highmaps) Determines whether the series should look for the nearest
   * point in both dimensions or just the x-dimension when hovering the
   * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
   * series. If the data has duplicate x-values, it is recommended to set this
   * to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   */
  @JSProperty("findNearestPointBy")
  void setFindNearestPointBy(@Nullable FindNearestPointBy value);

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
   */
  @JSProperty("gapSize")
  void setGapSize(double value);

  /**
   * (Highstock) Together with gapSize, this option defines where to draw gaps
   * in the graph.
   *
   * When the <code>gapUnit</code> is <code>&quot;relative&quot;</code> (default), a gap size of 5 means that
   * if the distance between two points is greater than 5 times that of the
   * two closest points, the graph will be broken.
   *
   * When the <code>gapUnit</code> is <code>&quot;value&quot;</code>, the gap is based on absolute axis
   * values, which on a datetime axis is milliseconds. This also applies to
   * the navigator series that inherits gap options from the base series.
   *
   */
  @JSProperty("gapUnit")
  @Nullable
  GapUnit getGapUnit();

  /**
   * (Highstock) Together with gapSize, this option defines where to draw gaps
   * in the graph.
   *
   * When the <code>gapUnit</code> is <code>&quot;relative&quot;</code> (default), a gap size of 5 means that
   * if the distance between two points is greater than 5 times that of the
   * two closest points, the graph will be broken.
   *
   * When the <code>gapUnit</code> is <code>&quot;value&quot;</code>, the gap is based on absolute axis
   * values, which on a datetime axis is milliseconds. This also applies to
   * the navigator series that inherits gap options from the base series.
   *
   */
  @JSProperty("gapUnit")
  void setGapUnit(@Nullable GapUnit value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
   * chart width or only the zoomed area when zooming in on parts of the X
   * axis. By default, the Y axis adjusts to the min and max of the visible
   * data. Cartesian series only.
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
   */
  @JSProperty("getExtremesFromAll")
  void setGetExtremesFromAll(boolean value);

  /**
   * (Highmaps) When set to <code>false</code> will prevent the series data from being
   * included in any form of data export.
   *
   * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
   * <code>includeInCSVExport</code>.
   *
   */
  @JSProperty("includeInDataExport")
  boolean getIncludeInDataExport();

  /**
   * (Highmaps) When set to <code>false</code> will prevent the series data from being
   * included in any form of data export.
   *
   * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
   * <code>includeInCSVExport</code>.
   *
   */
  @JSProperty("includeInDataExport")
  void setIncludeInDataExport(boolean value);

  /**
   * (Highcharts, Highstock) Apply a jitter effect for the rendered markers.
   * When plotting discrete values, a little random noise may help telling the
   * points apart. The jitter setting applies a random displacement of up to
   * <code>n</code> axis units in either direction. So for example on a horizontal X
   * axis, setting the <code>jitter.x</code> to 0.24 will render the point in a random
   * position between 0.24 units to the left and 0.24 units to the right of
   * the true axis position. On a category axis, setting it to 0.5 will fill
   * up the bin and make the data appear continuous.
   *
   * When rendered on top of a box plot or a column series, a jitter value of
   * 0.24 will correspond to the underlying series' default groupPadding and
   * pointPadding settings.
   *
   */
  @JSProperty("jitter")
  @Nullable
  PlotMapbubbleJitterOptions getJitter();

  /**
   * (Highcharts, Highstock) Apply a jitter effect for the rendered markers.
   * When plotting discrete values, a little random noise may help telling the
   * points apart. The jitter setting applies a random displacement of up to
   * <code>n</code> axis units in either direction. So for example on a horizontal X
   * axis, setting the <code>jitter.x</code> to 0.24 will render the point in a random
   * position between 0.24 units to the left and 0.24 units to the right of
   * the true axis position. On a category axis, setting it to 0.5 will fill
   * up the bin and make the data appear continuous.
   *
   * When rendered on top of a box plot or a column series, a jitter value of
   * 0.24 will correspond to the underlying series' default groupPadding and
   * pointPadding settings.
   *
   */
  @JSProperty("jitter")
  void setJitter(@Nullable PlotMapbubbleJitterOptions value);

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
   */
  @JSProperty("joinBy")
  @Nullable
  Unknown /* ( string | Array < string > ) */ getJoinBy();

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
   */
  @JSProperty("joinBy")
  void setJoinBy(@Nullable String value);

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
   */
  @JSProperty("joinBy")
  void setJoinBy(String... value);

  /**
   * (Highmaps) An array specifying which option maps to which key in the data
   * point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highmaps) An array specifying which option maps to which key in the data
   * point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   */
  @JSProperty("keys")
  void setKeys(String... value);

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   */
  @JSProperty("label")
  @Nullable
  SeriesLabelOptionsObject getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable SeriesLabelOptionsObject value);

  /**
   * (Highstock) The line marks the last price from all points.
   *
   */
  @JSProperty("lastPrice")
  @Nullable
  SeriesLastPriceOptionsObject getLastPrice();

  /**
   * (Highstock) The line marks the last price from all points.
   *
   */
  @JSProperty("lastPrice")
  void setLastPrice(@Nullable SeriesLastPriceOptionsObject value);

  /**
   * (Highstock) The line marks the last price from visible range of points.
   *
   */
  @JSProperty("lastVisiblePrice")
  @Nullable
  SeriesLastVisiblePriceOptionsObject getLastVisiblePrice();

  /**
   * (Highstock) The line marks the last price from visible range of points.
   *
   */
  @JSProperty("lastVisiblePrice")
  void setLastVisiblePrice(@Nullable SeriesLastVisiblePriceOptionsObject value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   */
  @JSProperty("linecap")
  @Nullable
  Unknown /* SeriesLinecapValue */ getLinecap();

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   */
  @JSProperty("linecap")
  void setLinecap(@Nullable String value);

  /**
   * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
   * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
   * the ends and bends.
   *
   */
  @JSProperty("linecap")
  void setLinecap(@Nullable Linecap value);

  /**
   * (Highcharts, Highstock) The width of the line connecting the data points.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the line connecting the data points.
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
   * If master series uses data sorting and linked series does not have its
   * own sorting definition, the linked series will be sorted in the same
   * order as the master one.
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
   * If master series uses data sorting and linked series does not have its
   * own sorting definition, the linked series will be sorted in the same
   * order as the master one.
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(@Nullable String value);

  /**
   * (Highmaps) Options for the point markers of line-like series. Properties
   * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
   * appearance of the markers. Other series types, like column series, don't
   * have markers, but have visual options on the series level instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highmaps) Options for the point markers of line-like series. Properties
   * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
   * appearance of the markers. Other series types, like column series, don't
   * have markers, but have visual options on the series level instead.
   *
   * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
   * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Highcharts, Highstock) Maximum bubble size. Bubbles will automatically
   * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
   * bubble. Can be either pixels (when no unit is given), or a percentage of
   * the smallest one of the plot width and height.
   *
   */
  @JSProperty("maxSize")
  @Nullable
  Unknown /* ( number | string ) */ getMaxSize();

  /**
   * (Highcharts, Highstock) Maximum bubble size. Bubbles will automatically
   * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
   * bubble. Can be either pixels (when no unit is given), or a percentage of
   * the smallest one of the plot width and height.
   *
   */
  @JSProperty("maxSize")
  void setMaxSize(double value);

  /**
   * (Highcharts, Highstock) Maximum bubble size. Bubbles will automatically
   * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
   * bubble. Can be either pixels (when no unit is given), or a percentage of
   * the smallest one of the plot width and height.
   *
   */
  @JSProperty("maxSize")
  void setMaxSize(@Nullable String value);

  /**
   * (Highcharts, Highstock) Minimum bubble size. Bubbles will automatically
   * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
   * bubble. Can be either pixels (when no unit is given), or a percentage of
   * the smallest one of the plot width and height.
   *
   */
  @JSProperty("minSize")
  @Nullable
  Unknown /* ( number | string ) */ getMinSize();

  /**
   * (Highcharts, Highstock) Minimum bubble size. Bubbles will automatically
   * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
   * bubble. Can be either pixels (when no unit is given), or a percentage of
   * the smallest one of the plot width and height.
   *
   */
  @JSProperty("minSize")
  void setMinSize(double value);

  /**
   * (Highcharts, Highstock) Minimum bubble size. Bubbles will automatically
   * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
   * bubble. Can be either pixels (when no unit is given), or a percentage of
   * the smallest one of the plot width and height.
   *
   */
  @JSProperty("minSize")
  void setMinSize(@Nullable String value);

  /**
   * (Highstock) Options for the corresponding navigator series if
   * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
   * same as any series, documented at plotOptions and series.
   *
   * These options are merged with options in navigator.series, and will take
   * precedence if the same option is defined both places.
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
   */
  @JSProperty("navigatorOptions")
  void setNavigatorOptions(@Nullable PlotSeriesOptions value);

  /**
   * (Highcharts) When a point's Z value is below the zThreshold setting, this
   * color is used.
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getNegativeColor();

  /**
   * (Highcharts) When a point's Z value is below the zThreshold setting, this
   * color is used.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable PatternObject value);

  /**
   * (Highcharts) When a point's Z value is below the zThreshold setting, this
   * color is used.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable String value);

  /**
   * (Highcharts) When a point's Z value is below the zThreshold setting, this
   * color is used.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable GradientColorObject value);

  /**
   * (Highmaps) Opacity of a series parts: line, fill (e.g. area) and
   * dataLabels.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highmaps) Opacity of a series parts: line, fill (e.g. area) and
   * dataLabels.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highmaps) Properties for each single point.
   *
   */
  @JSProperty("point")
  @Nullable
  PlotSeriesPointOptions getPoint();

  /**
   * (Highmaps) Properties for each single point.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable PlotSeriesPointOptions value);

  /**
   * (Highmaps) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  JsFunction getPointDescriptionFormatter();

  /**
   * (Highmaps) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(@Nullable JsFunction value);

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
   */
  @JSProperty("pointIntervalUnit")
  void setPointIntervalUnit(@Nullable PointIntervalUnit value);

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
   */
  @JSProperty("pointRange")
  void setPointRange(double value);

  /**
   * (Highcharts, Highstock, Gantt) If no x values are given for the points in
   * a series, pointStart defines on what value to start. For example, if a
   * series contains one yearly value starting from 1945, set pointStart to
   * 1945.
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
   */
  @JSProperty("pointStart")
  void setPointStart(double value);

  /**
   * (Highmaps) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highmaps) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highmaps) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highmaps) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highmaps) Whether to display this particular series or series type in
   * the legend. Standalone series are shown in legend by default, and linked
   * series are not. Since v7.2.0 it is possible to show series that use
   * colorAxis by setting this option to <code>true</code>.
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highmaps) Whether to display this particular series or series type in
   * the legend. Standalone series are shown in legend by default, and linked
   * series are not. Since v7.2.0 it is possible to show series that use
   * colorAxis by setting this option to <code>true</code>.
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   */
  @JSProperty("showInNavigator")
  boolean getShowInNavigator();

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highmaps) Whether the bubble's value should be represented by the area
   * or the width of the bubble. The default, <code>area</code>, corresponds best to the
   * human perception of the size of each bubble.
   *
   */
  @JSProperty("sizeBy")
  @Nullable
  SizeBy getSizeBy();

  /**
   * (Highmaps) Whether the bubble's value should be represented by the area
   * or the width of the bubble. The default, <code>area</code>, corresponds best to the
   * human perception of the size of each bubble.
   *
   */
  @JSProperty("sizeBy")
  void setSizeBy(@Nullable SizeBy value);

  /**
   * (Highcharts) When this is true, the absolute value of z determines the
   * size of the bubble. This means that with the default <code>zThreshold</code> of 0, a
   * bubble of value -1 will have the same size as a bubble of value 1, while
   * a bubble of value 0 will have a smaller size according to <code>minSize</code>.
   *
   */
  @JSProperty("sizeByAbsoluteValue")
  boolean getSizeByAbsoluteValue();

  /**
   * (Highcharts) When this is true, the absolute value of z determines the
   * size of the bubble. This means that with the default <code>zThreshold</code> of 0, a
   * bubble of value -1 will have the same size as a bubble of value 1, while
   * a bubble of value 0 will have a smaller size according to <code>minSize</code>.
   *
   */
  @JSProperty("sizeByAbsoluteValue")
  void setSizeByAbsoluteValue(boolean value);

  /**
   * (Highmaps) If set to <code>true</code>, the accessibility module will skip past the
   * points in this series for keyboard navigation.
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highmaps) If set to <code>true</code>, the accessibility module will skip past the
   * points in this series for keyboard navigation.
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts) When this is true, the series will not cause the Y axis to
   * cross the zero plane (or threshold option) unless the data actually
   * crosses the plane.
   *
   * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
   * make the Y axis show negative values according to the <code>minPadding</code>
   * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
   *
   */
  @JSProperty("softThreshold")
  boolean getSoftThreshold();

  /**
   * (Highcharts) When this is true, the series will not cause the Y axis to
   * cross the zero plane (or threshold option) unless the data actually
   * crosses the plane.
   *
   * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
   * make the Y axis show negative values according to the <code>minPadding</code>
   * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
   *
   */
  @JSProperty("softThreshold")
  void setSoftThreshold(boolean value);

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>.
   *
   * When stacking is enabled, data must be sorted in ascending X order.
   *
   * Some stacking options are related to specific series types. In the
   * streamgraph series type, the stacking option is set to <code>&quot;stream&quot;</code>. The
   * second one is <code>&quot;overlap&quot;</code>, which only applies to waterfall series.
   *
   */
  @JSProperty("stacking")
  @Nullable
  Stacking getStacking();

  /**
   * (Highcharts, Highstock) Whether to stack the values of each series on top
   * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
   * stack by value or <code>&quot;percent&quot;</code>.
   *
   * When stacking is enabled, data must be sorted in ascending X order.
   *
   * Some stacking options are related to specific series types. In the
   * streamgraph series type, the stacking option is set to <code>&quot;stream&quot;</code>. The
   * second one is <code>&quot;overlap&quot;</code>, which only applies to waterfall series.
   *
   */
  @JSProperty("stacking")
  void setStacking(@Nullable Stacking value);

  @JSProperty("states")
  @Nullable
  SeriesStatesOptionsObject getStates();

  @JSProperty("states")
  void setStates(@Nullable SeriesStatesOptionsObject value);

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   */
  @JSProperty("step")
  @Nullable
  Step getStep();

  /**
   * (Highcharts, Highstock) Whether to apply steps to the line. Possible
   * values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   */
  @JSProperty("step")
  void setStep(@Nullable Step value);

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip. When
   * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
   * be hidden when moving the mouse between series.
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
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock) The threshold, also called zero level or base
   * level. For line type series this is only used in conjunction with
   * negativeColor.
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highcharts, Highstock) The threshold, also called zero level or base
   * level. For line type series this is only used in conjunction with
   * negativeColor.
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
   */
  @JSProperty("tooltip")
  @Nullable
  SeriesTooltipOptionsObject getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip. Overridable
   * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
   * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
   * series.name by default shows in the headerFormat and point.x and point.y
   * in the pointFormat.
   *
   */
  @JSProperty("tooltip")
  void setTooltip(@Nullable SeriesTooltipOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) When a series contains a data array that
   * is longer than this, only one dimensional arrays of numbers, or two
   * dimensional arrays with x and y values are allowed. Also, only the first
   * point is tested, and the rest are assumed to be the same format. This
   * saves expensive data checking and indexing in long series. Set it to <code>0</code>
   * disable.
   *
   * Note: In boost mode turbo threshold is forced. Only array of numbers or
   * two dimensional arrays are allowed.
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
   * Note: In boost mode turbo threshold is forced. Only array of numbers or
   * two dimensional arrays are allowed.
   *
   */
  @JSProperty("turboThreshold")
  void setTurboThreshold(double value);

  /**
   * (Highmaps) Set the initial visibility of the series.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highmaps) Set the initial visibility of the series.
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts) The minimum for the Z value range. Defaults to the highest Z
   * value in the data.
   *
   */
  @JSProperty("zMax")
  double getZMax();

  /**
   * (Highcharts) The minimum for the Z value range. Defaults to the highest Z
   * value in the data.
   *
   */
  @JSProperty("zMax")
  void setZMax(double value);

  /**
   * (Highcharts) The minimum for the Z value range. Defaults to the lowest Z
   * value in the data.
   *
   */
  @JSProperty("zMin")
  double getZMin();

  /**
   * (Highcharts) The minimum for the Z value range. Defaults to the lowest Z
   * value in the data.
   *
   */
  @JSProperty("zMin")
  void setZMin(double value);

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   */
  @JSProperty("zoneAxis")
  @Nullable
  String getZoneAxis();

  /**
   * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
   *
   */
  @JSProperty("zoneAxis")
  void setZoneAxis(@Nullable String value);

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
   */
  @JSProperty("zones")
  @Nullable
  SeriesZonesOptionsObject[] getZones();

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
   */
  @JSProperty("zones")
  void setZones(SeriesZonesOptionsObject... value);

  /**
   * (Highcharts) When displayNegative is <code>false</code>, bubbles with lower Z values
   * are skipped. When <code>displayNegative</code> is <code>true</code> and a negativeColor is
   * given, points with lower Z is colored.
   *
   */
  @JSProperty("zThreshold")
  double getZThreshold();

  /**
   * (Highcharts) When displayNegative is <code>false</code>, bubbles with lower Z values
   * are skipped. When <code>displayNegative</code> is <code>true</code> and a negativeColor is
   * given, points with lower Z is colored.
   *
   */
  @JSProperty("zThreshold")
  void setZThreshold(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotMapbubbleOptions object = Any.empty();

    private Builder() {
    }

    public PlotMapbubbleOptions build() {
      return object;
    }

    /**
     * (Highmaps) Accessibility options for a series.
     *
     */
    public Builder accessibility(@Nullable SeriesAccessibilityOptionsObject value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highmaps) Whether all areas of the map defined in <code>mapData</code> should be
     * rendered. If <code>true</code>, areas which don't correspond to a data point, are
     * rendered as <code>null</code> points. If <code>false</code>, those areas are skipped.
     *
     */
    public Builder allAreas(boolean value) {
      object.setAllAreas(value);
      return this;
    }

    /**
     * (Highmaps) Allow this series' points to be selected by clicking on the
     * graphic (columns, point markers, pie slices, map areas etc).
     *
     * The selected points can be handled by point select and unselect events,
     * or collectively by the getSelectedPoints function.
     *
     * And alternative way of selecting points is through dragging.
     *
     */
    public Builder allowPointSelect(boolean value) {
      object.setAllowPointSelect(value);
      return this;
    }

    /**
     * (Highmaps) Enable or disable the initial animation when a series is
     * displayed. The animation can also be set as a configuration object.
     * Please note that this option only applies to the initial animation of the
     * series itself. For other animations, see chart.animation and the
     * animation parameter under the API methods. The following properties are
     * supported:
     *
     * <ul>
     * <li>
     * <code>duration</code>: The duration of the animation in milliseconds.
     *
     * </li>
     * <li>
     * <code>easing</code>: Can be a string reference to an easing function set on the
     * <code>Math</code> object or a function. See the <em>Custom easing function</em> demo below.
     *
     * </li>
     * </ul>
     * Due to poor performance, animation is disabled in old IE browsers for
     * several chart types.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highmaps) Enable or disable the initial animation when a series is
     * displayed. The animation can also be set as a configuration object.
     * Please note that this option only applies to the initial animation of the
     * series itself. For other animations, see chart.animation and the
     * animation parameter under the API methods. The following properties are
     * supported:
     *
     * <ul>
     * <li>
     * <code>duration</code>: The duration of the animation in milliseconds.
     *
     * </li>
     * <li>
     * <code>easing</code>: Can be a string reference to an easing function set on the
     * <code>Math</code> object or a function. See the <em>Custom easing function</em> demo below.
     *
     * </li>
     * </ul>
     * Due to poor performance, animation is disabled in old IE browsers for
     * several chart types.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highmaps) If there are more points in the series than the
     * <code>animationLimit</code>, the animation won't run. Animation affects overall
     * performance and doesn't work well with heavy data series.
     *
     */
    public Builder animationLimit(double value) {
      object.setAnimationLimit(value);
      return this;
    }

    /**
     * (Highmaps) Sets the color blending in the boost module.
     *
     */
    public Builder boostBlending(@Nullable BoostBlending value) {
      object.setBoostBlending(value);
      return this;
    }

    /**
     * (Highmaps) Set the point threshold for when a series should enter boost
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
     */
    public Builder boostThreshold(double value) {
      object.setBoostThreshold(value);
      return this;
    }

    /**
     * (Highmaps) The border color of the map areas.
     *
     * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
     * class.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highmaps) The border color of the map areas.
     *
     * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
     * class.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highmaps) The border color of the map areas.
     *
     * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
     * class.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highmaps) The border width of each map area.
     *
     * In styled mode, the border stroke width is given in the
     * <code>.highcharts-point</code> class.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highmaps) An additional class name to apply to the series' graphical
     * elements. This option does not replace default class names of the
     * graphical element.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highmaps) Disable this option to allow series rendering in the whole
     * plotting area.
     *
     * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
     *
     */
    public Builder clip(boolean value) {
      object.setClip(value);
      return this;
    }

    /**
     * (Highmaps) The main color of the series. This color affects both the fill
     * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) The main color of the series. This color affects both the fill
     * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) The main color of the series. This color affects both the fill
     * and the stroke of the bubble. For enhanced control, use <code>marker</code> options.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
     * this number defines which colorAxis the particular series is connected
     * to. It refers to either the axis id or the index of the axis in the
     * colorAxis array, with 0 being the first. Set this option to false to
     * prevent a series from connecting to the default color axis.
     *
     * Since v7.2.0 the option can also be an axis id or an axis index instead
     * of a boolean flag.
     *
     */
    public Builder colorAxis(boolean value) {
      object.setColorAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
     * this number defines which colorAxis the particular series is connected
     * to. It refers to either the axis id or the index of the axis in the
     * colorAxis array, with 0 being the first. Set this option to false to
     * prevent a series from connecting to the default color axis.
     *
     * Since v7.2.0 the option can also be an axis id or an axis index instead
     * of a boolean flag.
     *
     */
    public Builder colorAxis(double value) {
      object.setColorAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
     * this number defines which colorAxis the particular series is connected
     * to. It refers to either the axis id or the index of the axis in the
     * colorAxis array, with 0 being the first. Set this option to false to
     * prevent a series from connecting to the default color axis.
     *
     * Since v7.2.0 the option can also be an axis id or an axis index instead
     * of a boolean flag.
     *
     */
    public Builder colorAxis(@Nullable String value) {
      object.setColorAxis(value);
      return this;
    }

    /**
     * (Highmaps) Styled mode only. A specific color index to use for the
     * series, so its graphic representations are given the class name
     * <code>highcharts-color-{n}</code>.
     *
     */
    public Builder colorIndex(double value) {
      object.setColorIndex(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Determines what data value should be
     * used to calculate point color if <code>colorAxis</code> is used. Requires to set
     * <code>min</code> and <code>max</code> if some custom point property is used or if approximation
     * for data grouping is set to <code>'sum'</code>.
     *
     */
    public Builder colorKey(@Nullable String value) {
      object.setColorKey(value);
      return this;
    }

    /**
     * (Highstock) Compare the values of the series against the first non-null,
     * non- zero value in the visible range. The y axis will show percentage or
     * absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code> or
     * <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows comparing
     * the development of the series against each other. Adds a <code>change</code> field
     * to every point object.
     *
     */
    public Builder compare(@Nullable String value) {
      object.setCompare(value);
      return this;
    }

    /**
     * (Highstock) When compare is <code>percent</code>, this option dictates whether to
     * use 0 or 100 as the base of comparison.
     *
     */
    public Builder compareBase(@Nullable CompareBase value) {
      object.setCompareBase(value);
      return this;
    }

    /**
     * (Highstock) Defines if comparison should start from the first point
     * within the visible range or should start from the first point <strong>before</strong>
     * the range.
     *
     * In other words, this flag determines if first point within the visible
     * range will have 0% (<code>compareStart=true</code>) or should have been already
     * calculated according to the previous point (<code>compareStart=false</code>).
     *
     */
    public Builder compareStart(boolean value) {
      object.setCompareStart(value);
      return this;
    }

    /**
     * (Highcharts) Polar charts only. Whether to connect the ends of a line
     * series plot across the extremes.
     *
     */
    public Builder connectEnds(boolean value) {
      object.setConnectEnds(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to connect a graph line across null
     * points, or render a gap between the two points on either side of the
     * null.
     *
     */
    public Builder connectNulls(boolean value) {
      object.setConnectNulls(value);
      return this;
    }

    /**
     * (Gantt) Override Pathfinder connector options for a series. Requires
     * Highcharts Gantt to be loaded.
     *
     */
    public Builder connectors(@Nullable SeriesConnectorsOptionsObject value) {
      object.setConnectors(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) When true, each point or column edge is
     * rounded to its nearest pixel in order to render sharp on screen. In some
     * cases, when there are a lot of densely packed columns, this leads to
     * visible difference in column widths or distance between columns. In these
     * cases, setting <code>crisp</code> to <code>false</code> may look better, even though each
     * column is rendered blurry.
     *
     */
    public Builder crisp(boolean value) {
      object.setCrisp(value);
      return this;
    }

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
     */
    public Builder cropThreshold(double value) {
      object.setCropThreshold(value);
      return this;
    }

    /**
     * (Highmaps) You can set the cursor to &quot;pointer&quot; if you have click events
     * attached to the series, to signal to the user that the points and lines
     * can be clicked.
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     *
     */
    public Builder cursor(@Nullable String value) {
      object.setCursor(value);
      return this;
    }

    /**
     * (Highmaps) You can set the cursor to &quot;pointer&quot; if you have click events
     * attached to the series, to signal to the user that the points and lines
     * can be clicked.
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     *
     */
    public Builder cursor(@Nullable Cursor value) {
      object.setCursor(value);
      return this;
    }

    /**
     * (Highmaps) A reserved subspace to store options and values for customized
     * functionality. Here you can add additional data for your own event
     * callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
      return this;
    }

    /**
     * (Highmaps) Name of the dash style to use for the graph, or for some
     * series types the outline of each shape.
     *
     * In styled mode, the stroke dash-array can be set with the same classes as
     * listed under series.color.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

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
     */
    public Builder dataGrouping(@Nullable DataGroupingOptionsObject value) {
      object.setDataGrouping(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
     * labels, appearing next to each data point.
     *
     * Since v6.2.0, multiple data labels can be applied to each single point by
     * defining them as an array of configs.
     *
     * In styled mode, the data labels can be styled with the
     * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
     * (see example).
     *
     */
    public Builder dataLabels(@Nullable PlotMapbubbleDataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
     * labels, appearing next to each data point.
     *
     * Since v6.2.0, multiple data labels can be applied to each single point by
     * defining them as an array of configs.
     *
     * In styled mode, the data labels can be styled with the
     * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
     * (see example).
     *
     */
    public Builder dataLabels(PlotMapbubbleDataLabelsOptions... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Options for the series data sorting.
     *
     */
    public Builder dataSorting(@Nullable DataSortingOptionsObject value) {
      object.setDataSorting(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Options for the series data sorting.
     *
     */
    public Builder dataSorting(@Nullable PlotMapbubbleDataSortingOptions value) {
      object.setDataSorting(value);
      return this;
    }

    /**
     * (Highmaps) A description of the series to add to the screen reader
     * information about the series.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highmaps) Whether to display negative sized bubbles. The threshold is
     * given by the zThreshold option, and negative bubbles can be visualized by
     * setting negativeColor.
     *
     */
    public Builder displayNegative(boolean value) {
      object.setDisplayNegative(value);
      return this;
    }

    /**
     * (Highmaps) The draggable-points module allows points to be moved around
     * or modified in the chart. In addition to the options mentioned under the
     * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
     * point.drag and point.drop.
     *
     */
    public Builder dragDrop(@Nullable SeriesDragDropOptionsObject value) {
      object.setDragDrop(value);
      return this;
    }

    /**
     * (Highmaps) Enable or disable the mouse tracking for a specific series.
     * This includes point tooltips and click events on graphs and points. For
     * large datasets it improves performance.
     *
     */
    public Builder enableMouseTracking(boolean value) {
      object.setEnableMouseTracking(value);
      return this;
    }

    /**
     * (Highmaps) General event handlers for the series items. These event hooks
     * can also be attached to the series at run time using the
     * <code>Highcharts.addEvent</code> function.
     *
     */
    public Builder events(@Nullable SeriesEventsOptionsObject value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highmaps) Determines whether the series should look for the nearest
     * point in both dimensions or just the x-dimension when hovering the
     * series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other
     * series. If the data has duplicate x-values, it is recommended to set this
     * to <code>'xy'</code> to allow hovering over all points.
     *
     * Applies only to series types using nearest neighbor search (not direct
     * hover) for tooltip.
     *
     */
    public Builder findNearestPointBy(@Nullable FindNearestPointBy value) {
      object.setFindNearestPointBy(value);
      return this;
    }

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
     */
    public Builder gapSize(double value) {
      object.setGapSize(value);
      return this;
    }

    /**
     * (Highstock) Together with gapSize, this option defines where to draw gaps
     * in the graph.
     *
     * When the <code>gapUnit</code> is <code>&quot;relative&quot;</code> (default), a gap size of 5 means that
     * if the distance between two points is greater than 5 times that of the
     * two closest points, the graph will be broken.
     *
     * When the <code>gapUnit</code> is <code>&quot;value&quot;</code>, the gap is based on absolute axis
     * values, which on a datetime axis is milliseconds. This also applies to
     * the navigator series that inherits gap options from the base series.
     *
     */
    public Builder gapUnit(@Nullable GapUnit value) {
      object.setGapUnit(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
     * chart width or only the zoomed area when zooming in on parts of the X
     * axis. By default, the Y axis adjusts to the min and max of the visible
     * data. Cartesian series only.
     *
     */
    public Builder getExtremesFromAll(boolean value) {
      object.setGetExtremesFromAll(value);
      return this;
    }

    /**
     * (Highmaps) When set to <code>false</code> will prevent the series data from being
     * included in any form of data export.
     *
     * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
     * <code>includeInCSVExport</code>.
     *
     */
    public Builder includeInDataExport(boolean value) {
      object.setIncludeInDataExport(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Apply a jitter effect for the rendered markers.
     * When plotting discrete values, a little random noise may help telling the
     * points apart. The jitter setting applies a random displacement of up to
     * <code>n</code> axis units in either direction. So for example on a horizontal X
     * axis, setting the <code>jitter.x</code> to 0.24 will render the point in a random
     * position between 0.24 units to the left and 0.24 units to the right of
     * the true axis position. On a category axis, setting it to 0.5 will fill
     * up the bin and make the data appear continuous.
     *
     * When rendered on top of a box plot or a column series, a jitter value of
     * 0.24 will correspond to the underlying series' default groupPadding and
     * pointPadding settings.
     *
     */
    public Builder jitter(@Nullable PlotMapbubbleJitterOptions value) {
      object.setJitter(value);
      return this;
    }

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
     */
    public Builder joinBy(@Nullable String value) {
      object.setJoinBy(value);
      return this;
    }

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
     */
    public Builder joinBy(String... value) {
      object.setJoinBy(value);
      return this;
    }

    /**
     * (Highmaps) An array specifying which option maps to which key in the data
     * point array. This makes it convenient to work with unstructured data
     * arrays from different sources.
     *
     */
    public Builder keys(String... value) {
      object.setKeys(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
     * series as possible in a natural way, seeking to avoid other series. The
     * goal of this feature is to make the chart more easily readable, like if a
     * human designer placed the labels in the optimal position.
     *
     * The series labels currently work with series types having a <code>graph</code> or an
     * <code>area</code>.
     *
     */
    public Builder label(@Nullable SeriesLabelOptionsObject value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highstock) The line marks the last price from all points.
     *
     */
    public Builder lastPrice(@Nullable SeriesLastPriceOptionsObject value) {
      object.setLastPrice(value);
      return this;
    }

    /**
     * (Highstock) The line marks the last price from visible range of points.
     *
     */
    public Builder lastVisiblePrice(@Nullable SeriesLastVisiblePriceOptionsObject value) {
      object.setLastVisiblePrice(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
     * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
     * the ends and bends.
     *
     */
    public Builder linecap(@Nullable String value) {
      object.setLinecap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The SVG value used for the <code>stroke-linecap</code> and
     * <code>stroke-linejoin</code> of a line graph. Round means that lines are rounded in
     * the ends and bends.
     *
     */
    public Builder linecap(@Nullable Linecap value) {
      object.setLinecap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The width of the line connecting the data points.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The id of another series to link to.
     * Additionally, the value can be &quot;:previous&quot; to link to the previous
     * series. When two series are linked, only the first one appears in the
     * legend. Toggling the visibility of this also toggles the linked series.
     *
     * If master series uses data sorting and linked series does not have its
     * own sorting definition, the linked series will be sorted in the same
     * order as the master one.
     *
     */
    public Builder linkedTo(@Nullable String value) {
      object.setLinkedTo(value);
      return this;
    }

    /**
     * (Highmaps) Options for the point markers of line-like series. Properties
     * like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual
     * appearance of the markers. Other series types, like column series, don't
     * have markers, but have visual options on the series level instead.
     *
     * In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
     * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Maximum bubble size. Bubbles will automatically
     * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
     * bubble. Can be either pixels (when no unit is given), or a percentage of
     * the smallest one of the plot width and height.
     *
     */
    public Builder maxSize(double value) {
      object.setMaxSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Maximum bubble size. Bubbles will automatically
     * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
     * bubble. Can be either pixels (when no unit is given), or a percentage of
     * the smallest one of the plot width and height.
     *
     */
    public Builder maxSize(@Nullable String value) {
      object.setMaxSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Minimum bubble size. Bubbles will automatically
     * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
     * bubble. Can be either pixels (when no unit is given), or a percentage of
     * the smallest one of the plot width and height.
     *
     */
    public Builder minSize(double value) {
      object.setMinSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Minimum bubble size. Bubbles will automatically
     * size between the <code>minSize</code> and <code>maxSize</code> to reflect the <code>z</code> value of each
     * bubble. Can be either pixels (when no unit is given), or a percentage of
     * the smallest one of the plot width and height.
     *
     */
    public Builder minSize(@Nullable String value) {
      object.setMinSize(value);
      return this;
    }

    /**
     * (Highstock) Options for the corresponding navigator series if
     * <code>showInNavigator</code> is <code>true</code> for this series. Available options are the
     * same as any series, documented at plotOptions and series.
     *
     * These options are merged with options in navigator.series, and will take
     * precedence if the same option is defined both places.
     *
     */
    public Builder navigatorOptions(@Nullable PlotSeriesOptions value) {
      object.setNavigatorOptions(value);
      return this;
    }

    /**
     * (Highcharts) When a point's Z value is below the zThreshold setting, this
     * color is used.
     *
     */
    public Builder negativeColor(@Nullable PatternObject value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highcharts) When a point's Z value is below the zThreshold setting, this
     * color is used.
     *
     */
    public Builder negativeColor(@Nullable String value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highcharts) When a point's Z value is below the zThreshold setting, this
     * color is used.
     *
     */
    public Builder negativeColor(@Nullable GradientColorObject value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highmaps) Opacity of a series parts: line, fill (e.g. area) and
     * dataLabels.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highmaps) Properties for each single point.
     *
     */
    public Builder point(@Nullable PlotSeriesPointOptions value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highmaps) Same as accessibility.pointDescriptionFormatter, but for an
     * individual series. Overrides the chart wide configuration.
     *
     */
    public Builder pointDescriptionFormatter(@Nullable JsFunction value) {
      object.setPointDescriptionFormatter(value);
      return this;
    }

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
     */
    public Builder pointInterval(double value) {
      object.setPointInterval(value);
      return this;
    }

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
     */
    public Builder pointIntervalUnit(@Nullable PointIntervalUnit value) {
      object.setPointIntervalUnit(value);
      return this;
    }

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
     */
    public Builder pointRange(double value) {
      object.setPointRange(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) If no x values are given for the points in
     * a series, pointStart defines on what value to start. For example, if a
     * series contains one yearly value starting from 1945, set pointStart to
     * 1945.
     *
     */
    public Builder pointStart(double value) {
      object.setPointStart(value);
      return this;
    }

    /**
     * (Highmaps) Whether to select the series initially. If <code>showCheckbox</code> is
     * true, the checkbox next to the series name in the legend will be checked
     * for a selected series.
     *
     */
    public Builder selected(boolean value) {
      object.setSelected(value);
      return this;
    }

    /**
     * (Highmaps) If true, a checkbox is displayed next to the legend item to
     * allow selecting the series. The state of the checkbox is determined by
     * the <code>selected</code> option.
     *
     */
    public Builder showCheckbox(boolean value) {
      object.setShowCheckbox(value);
      return this;
    }

    /**
     * (Highmaps) Whether to display this particular series or series type in
     * the legend. Standalone series are shown in legend by default, and linked
     * series are not. Since v7.2.0 it is possible to show series that use
     * colorAxis by setting this option to <code>true</code>.
     *
     */
    public Builder showInLegend(boolean value) {
      object.setShowInLegend(value);
      return this;
    }

    /**
     * (Highstock) Whether or not to show the series in the navigator. Takes
     * precedence over navigator.baseSeries if defined.
     *
     */
    public Builder showInNavigator(boolean value) {
      object.setShowInNavigator(value);
      return this;
    }

    /**
     * (Highmaps) Whether the bubble's value should be represented by the area
     * or the width of the bubble. The default, <code>area</code>, corresponds best to the
     * human perception of the size of each bubble.
     *
     */
    public Builder sizeBy(@Nullable SizeBy value) {
      object.setSizeBy(value);
      return this;
    }

    /**
     * (Highcharts) When this is true, the absolute value of z determines the
     * size of the bubble. This means that with the default <code>zThreshold</code> of 0, a
     * bubble of value -1 will have the same size as a bubble of value 1, while
     * a bubble of value 0 will have a smaller size according to <code>minSize</code>.
     *
     */
    public Builder sizeByAbsoluteValue(boolean value) {
      object.setSizeByAbsoluteValue(value);
      return this;
    }

    /**
     * (Highmaps) If set to <code>true</code>, the accessibility module will skip past the
     * points in this series for keyboard navigation.
     *
     */
    public Builder skipKeyboardNavigation(boolean value) {
      object.setSkipKeyboardNavigation(value);
      return this;
    }

    /**
     * (Highcharts) When this is true, the series will not cause the Y axis to
     * cross the zero plane (or threshold option) unless the data actually
     * crosses the plane.
     *
     * For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2, 3 will
     * make the Y axis show negative values according to the <code>minPadding</code>
     * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.
     *
     */
    public Builder softThreshold(boolean value) {
      object.setSoftThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to stack the values of each series on top
     * of each other. Possible values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to
     * stack by value or <code>&quot;percent&quot;</code>.
     *
     * When stacking is enabled, data must be sorted in ascending X order.
     *
     * Some stacking options are related to specific series types. In the
     * streamgraph series type, the stacking option is set to <code>&quot;stream&quot;</code>. The
     * second one is <code>&quot;overlap&quot;</code>, which only applies to waterfall series.
     *
     */
    public Builder stacking(@Nullable Stacking value) {
      object.setStacking(value);
      return this;
    }

    public Builder states(@Nullable SeriesStatesOptionsObject value) {
      object.setStates(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to apply steps to the line. Possible
     * values are <code>left</code>, <code>center</code> and <code>right</code>.
     *
     */
    public Builder step(@Nullable Step value) {
      object.setStep(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
     * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
     * another series, or out of the plot area. When false, the <code>mouseOut</code> event
     * on a series is triggered when the mouse leaves the area around the
     * series' graph or markers. This also implies the tooltip. When
     * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
     * be hidden when moving the mouse between series.
     *
     */
    public Builder stickyTracking(boolean value) {
      object.setStickyTracking(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The threshold, also called zero level or base
     * level. For line type series this is only used in conjunction with
     * negativeColor.
     *
     */
    public Builder threshold(double value) {
      object.setThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A configuration object for the tooltip rendering
     * of each single series. Properties are inherited from tooltip. Overridable
     * properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>,
     * <code>yPrefix</code> and <code>ySuffix</code>. Unlike other series, in a scatter plot the
     * series.name by default shows in the headerFormat and point.x and point.y
     * in the pointFormat.
     *
     */
    public Builder tooltip(@Nullable SeriesTooltipOptionsObject value) {
      object.setTooltip(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) When a series contains a data array that
     * is longer than this, only one dimensional arrays of numbers, or two
     * dimensional arrays with x and y values are allowed. Also, only the first
     * point is tested, and the rest are assumed to be the same format. This
     * saves expensive data checking and indexing in long series. Set it to <code>0</code>
     * disable.
     *
     * Note: In boost mode turbo threshold is forced. Only array of numbers or
     * two dimensional arrays are allowed.
     *
     */
    public Builder turboThreshold(double value) {
      object.setTurboThreshold(value);
      return this;
    }

    /**
     * (Highmaps) Set the initial visibility of the series.
     *
     */
    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }

    /**
     * (Highmaps) Define the z index of the series.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }

    /**
     * (Highcharts) The minimum for the Z value range. Defaults to the highest Z
     * value in the data.
     *
     */
    public Builder zMax(double value) {
      object.setZMax(value);
      return this;
    }

    /**
     * (Highcharts) The minimum for the Z value range. Defaults to the lowest Z
     * value in the data.
     *
     */
    public Builder zMin(double value) {
      object.setZMin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
     *
     */
    public Builder zoneAxis(@Nullable String value) {
      object.setZoneAxis(value);
      return this;
    }

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
     */
    public Builder zones(SeriesZonesOptionsObject... value) {
      object.setZones(value);
      return this;
    }

    /**
     * (Highcharts) When displayNegative is <code>false</code>, bubbles with lower Z values
     * are skipped. When <code>displayNegative</code> is <code>true</code> and a negativeColor is
     * given, points with lower Z is colored.
     *
     */
    public Builder zThreshold(double value) {
      object.setZThreshold(value);
      return this;
    }
  }
}
