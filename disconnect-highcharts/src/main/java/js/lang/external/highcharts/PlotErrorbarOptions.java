package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject ) */;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( DataSortingOptionsObject | PlotErrorbarDataSortingOptions ) */;
import js.lang.Unknown /* ( PlotErrorbarDataLabelsOptions | Array < PlotErrorbarDataLabelsOptions > ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* ( boolean | number | string ) */;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* ( string | Array < string > ) */;
import js.lang.Unknown /* ( string | CursorValue ) */;
import js.lang.Unknown /* Array < ( ColorString | GradientColorObject | PatternObject ) > */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Error bars are a graphical representation of the
 * variability of data and are used on graphs to indicate the error, or
 * uncertainty in a reported measurement.
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
 * Options for all <code>errorbar</code> series are defined in plotOptions.errorbar.
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
public interface PlotErrorbarOptions extends Any {
  /**
   * (Highcharts, Highstock) Accessibility options for a series.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  SeriesAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts, Highstock) Accessibility options for a series.
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
   * (Highcharts, Highstock) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
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
   * (Highcharts, Highstock) Allow this series' points to be selected by
   * clicking on the graphic (columns, point markers, pie slices, map areas
   * etc).
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
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
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
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
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
   * (Highcharts, Highstock) Enable or disable the initial animation when a
   * series is displayed. The animation can also be set as a configuration
   * object. Please note that this option only applies to the initial
   * animation of the series itself. For other animations, see chart.animation
   * and the animation parameter under the API methods. The following
   * properties are supported:
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
   * (Highcharts, Highstock) For some series, there is a limit that shuts down
   * initial animation by default when the total number of points in the chart
   * is too high. For example, for a column chart and its derivatives,
   * animation does not run if there is more than 250 points totally. To
   * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts, Highstock) For some series, there is a limit that shuts down
   * initial animation by default when the total number of points in the chart
   * is too high. For example, for a column chart and its derivatives,
   * animation does not run if there is more than 250 points totally. To
   * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts, Highstock) Sets the color blending in the boost module.
   *
   */
  @JSProperty("boostBlending")
  @Nullable
  BoostBlending getBoostBlending();

  /**
   * (Highcharts, Highstock) Sets the color blending in the boost module.
   *
   */
  @JSProperty("boostBlending")
  void setBoostBlending(@Nullable BoostBlending value);

  /**
   * (Highcharts, Highstock) Set the point threshold for when a series should
   * enter boost mode.
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
   * (Highcharts, Highstock) Set the point threshold for when a series should
   * enter boost mode.
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
   * (Highcharts) The dash style of the box.
   *
   */
  @JSProperty("boxDashStyle")
  @Nullable
  BoxDashStyle getBoxDashStyle();

  /**
   * (Highcharts) The dash style of the box.
   *
   */
  @JSProperty("boxDashStyle")
  void setBoxDashStyle(@Nullable BoxDashStyle value);

  /**
   * (Highcharts, Highstock, Gantt) When <code>true</code>, the columns will center in
   * the category, ignoring null or missing points. When <code>false</code>, space will
   * be reserved for null or missing points.
   *
   */
  @JSProperty("centerInCategory")
  boolean getCenterInCategory();

  /**
   * (Highcharts, Highstock, Gantt) When <code>true</code>, the columns will center in
   * the category, ignoring null or missing points. When <code>false</code>, space will
   * be reserved for null or missing points.
   *
   */
  @JSProperty("centerInCategory")
  void setCenterInCategory(boolean value);

  /**
   * (Highcharts, Highstock) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock) An additional class name to apply to the series'
   * graphical elements. This option does not replace default class names of
   * the graphical element.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   */
  @JSProperty("clip")
  boolean getClip();

  /**
   * (Highcharts, Highstock) Disable this option to allow series rendering in
   * the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
   *
   */
  @JSProperty("clip")
  void setClip(boolean value);

  /**
   * (Highcharts) The main color of the bars. This can be overridden by
   * stemColor and whiskerColor individually.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) The main color of the bars. This can be overridden by
   * stemColor and whiskerColor individually.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The main color of the bars. This can be overridden by
   * stemColor and whiskerColor individually.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) The main color of the bars. This can be overridden by
   * stemColor and whiskerColor individually.
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
   * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
   * from the global colors or series-specific plotOptions.column.colors
   * collections, this option determines whether the chart should receive one
   * color per series or one color per point.
   *
   * In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
   * and instead this option gives the points individual color class names on
   * the form <code>highcharts-color-{n}</code>.
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
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Highstock) Styled mode only. A specific color index to use
   * for the series, so its graphic representations are given the class name
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
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   */
  @JSProperty("colors")
  @Nullable
  Unknown /* Array < ( ColorString | GradientColorObject | PatternObject ) > */ getColors();

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   */
  @JSProperty("colors")
  void setColors(GradientColorObject... value);

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   */
  @JSProperty("colors")
  void setColors(PatternObject... value);

  /**
   * (Highcharts, Highstock, Gantt) A series specific or series type specific
   * color set to apply instead of the global colors when colorByPoint is
   * true.
   *
   */
  @JSProperty("colors")
  void setColors(String... value);

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
   * (Highcharts, Highstock, Gantt) When the series contains less points than
   * the crop threshold, all points are drawn, event if the points fall
   * outside the visible plot area at the current zoom. The advantage of
   * drawing all points (including markers and columns), is that animation is
   * performed on updates. On the other hand, when the series contains more
   * points than the crop threshold, the series data is cropped to only
   * contain points that fall within the plot area. The advantage of cropping
   * away invisible points is to increase performance on large series.
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
   */
  @JSProperty("cropThreshold")
  void setCropThreshold(double value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown /* ( string | CursorValue ) */ getCursor();

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable String value);

  /**
   * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
   * click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable Cursor value);

  /**
   * (Highcharts, Highstock) A reserved subspace to store options and values
   * for customized functionality. Here you can add additional data for your
   * own event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Highcharts, Highstock) A reserved subspace to store options and values
   * for customized functionality. Here you can add additional data for your
   * own event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

  /**
   * (Highcharts, Highstock) Name of the dash style to use for the graph, or
   * for some series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock) Name of the dash style to use for the graph, or
   * for some series types the outline of each shape.
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
  Unknown /* ( PlotErrorbarDataLabelsOptions | Array < PlotErrorbarDataLabelsOptions > ) */ getDataLabels(
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
  void setDataLabels(@Nullable PlotErrorbarDataLabelsOptions value);

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
  void setDataLabels(PlotErrorbarDataLabelsOptions... value);

  /**
   * (Highcharts, Highstock) Options for the series data sorting.
   *
   */
  @JSProperty("dataSorting")
  @Nullable
  Unknown /* ( DataSortingOptionsObject | PlotErrorbarDataSortingOptions ) */ getDataSorting();

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
  void setDataSorting(@Nullable PlotErrorbarDataSortingOptions value);

  /**
   * (Highcharts) Depth of the columns in a 3D column chart.
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) Depth of the columns in a 3D column chart.
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

  /**
   * (Highcharts, Highstock) A description of the series to add to the screen
   * reader information about the series.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock) A description of the series to add to the screen
   * reader information about the series.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesDragDropOptionsObject getDragDrop();

  /**
   * (Highcharts, Highstock) The draggable-points module allows points to be
   * moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(@Nullable SeriesDragDropOptionsObject value);

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   */
  @JSProperty("edgeColor")
  @Nullable
  String getEdgeColor();

  /**
   * (Highcharts) 3D columns only. The color of the edges. Similar to
   * <code>borderColor</code>, except it defaults to the same color as the column.
   *
   */
  @JSProperty("edgeColor")
  void setEdgeColor(@Nullable String value);

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   */
  @JSProperty("edgeWidth")
  double getEdgeWidth();

  /**
   * (Highcharts) 3D columns only. The width of the colored edges.
   *
   */
  @JSProperty("edgeWidth")
  void setEdgeWidth(double value);

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts, Highstock) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesEventsOptionsObject getEvents();

  /**
   * (Highcharts, Highstock) General event handlers for the series items.
   * These event hooks can also be attached to the series at run time using
   * the <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable SeriesEventsOptionsObject value);

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts) The fill color of the box.
   *
   * In styled mode, the fill color can be set with the
   * <code>.highcharts-boxplot-box</code> class.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) Determines whether the series should look for the
   * nearest point in both dimensions or just the x-dimension when hovering
   * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
   * other series. If the data has duplicate x-values, it is recommended to
   * set this to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   */
  @JSProperty("findNearestPointBy")
  @Nullable
  FindNearestPointBy getFindNearestPointBy();

  /**
   * (Highcharts, Highstock) Determines whether the series should look for the
   * nearest point in both dimensions or just the x-dimension when hovering
   * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
   * other series. If the data has duplicate x-values, it is recommended to
   * set this to <code>'xy'</code> to allow hovering over all points.
   *
   * Applies only to series types using nearest neighbor search (not direct
   * hover) for tooltip.
   *
   */
  @JSProperty("findNearestPointBy")
  void setFindNearestPointBy(@Nullable FindNearestPointBy value);

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
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   */
  @JSProperty("grouping")
  boolean getGrouping();

  /**
   * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
   * let them render independent of each other. Non-grouped columns will be
   * laid out individually and overlap each other.
   *
   */
  @JSProperty("grouping")
  void setGrouping(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
   * axis units.
   *
   */
  @JSProperty("groupPadding")
  double getGroupPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
   * axis units.
   *
   */
  @JSProperty("groupPadding")
  void setGroupPadding(double value);

  /**
   * (Highcharts, Highstock) When set to <code>false</code> will prevent the series data
   * from being included in any form of data export.
   *
   * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
   * <code>includeInCSVExport</code>.
   *
   */
  @JSProperty("includeInDataExport")
  boolean getIncludeInDataExport();

  /**
   * (Highcharts, Highstock) When set to <code>false</code> will prevent the series data
   * from being included in any form of data export.
   *
   * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
   * <code>includeInCSVExport</code>.
   *
   */
  @JSProperty("includeInDataExport")
  void setIncludeInDataExport(boolean value);

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
   * (Highcharts, Highstock) An array specifying which option maps to which
   * key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
   *
   */
  @JSProperty("keys")
  @Nullable
  String[] getKeys();

  /**
   * (Highcharts, Highstock) An array specifying which option maps to which
   * key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
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
   * (Highcharts) The width of the line surrounding the box. If any of
   * stemWidth, medianWidth or whiskerWidth are <code>null</code>, the lineWidth also
   * applies to these lines.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts) The width of the line surrounding the box. If any of
   * stemWidth, medianWidth or whiskerWidth are <code>null</code>, the lineWidth also
   * applies to these lines.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts) The parent series of the error bar. The default value links
   * it to the previous series. Otherwise, use the id of the parent series.
   *
   */
  @JSProperty("linkedTo")
  @Nullable
  String getLinkedTo();

  /**
   * (Highcharts) The parent series of the error bar. The default value links
   * it to the previous series. Otherwise, use the id of the parent series.
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
   * column, translated to the height of a bar in a bar chart. This prevents
   * the columns from becoming too wide when there is a small number of points
   * in the chart.
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
   */
  @JSProperty("medianColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject ) */ getMedianColor();

  /**
   * (Highcharts) The color of the median line. If <code>undefined</code>, the general
   * series color applies.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   */
  @JSProperty("medianColor")
  void setMedianColor(@Nullable String value);

  /**
   * (Highcharts) The color of the median line. If <code>undefined</code>, the general
   * series color applies.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
   *
   */
  @JSProperty("medianColor")
  void setMedianColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The dash style of the median.
   *
   */
  @JSProperty("medianDashStyle")
  @Nullable
  MedianDashStyle getMedianDashStyle();

  /**
   * (Highcharts) The dash style of the median.
   *
   */
  @JSProperty("medianDashStyle")
  void setMedianDashStyle(@Nullable MedianDashStyle value);

  /**
   * (Highcharts) The pixel width of the median line. If <code>null</code>, the lineWidth
   * is used.
   *
   * In styled mode, the median stroke width can be set with the
   * <code>.highcharts-boxplot-median</code> class.
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
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold. Note that <code>zones</code> takes precedence over the
   * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
   * with value of 0.
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getNegativeColor();

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold. Note that <code>zones</code> takes precedence over the
   * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
   * with value of 0.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold. Note that <code>zones</code> takes precedence over the
   * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
   * with value of 0.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The color for the parts of the graph or points
   * that are below the threshold. Note that <code>zones</code> takes precedence over the
   * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
   * with value of 0.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) Opacity of a series parts: line, fill (e.g. area)
   * and dataLabels.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts, Highstock) Opacity of a series parts: line, fill (e.g. area)
   * and dataLabels.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   */
  @JSProperty("point")
  @Nullable
  PlotSeriesPointOptions getPoint();

  /**
   * (Highcharts, Highstock) Properties for each single point.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable PlotSeriesPointOptions value);

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  JsFunction getPointDescriptionFormatter();

  /**
   * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
   * but for an individual series. Overrides the chart wide configuration.
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
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
   * axis units.
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
   */
  @JSProperty("pointPlacement")
  @Nullable
  Unknown /* ( number | string ) */ getPointPlacement();

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
   */
  @JSProperty("pointPlacement")
  void setPointPlacement(@Nullable String value);

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
   * This option is set by default to 1 if data sorting is enabled.
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
   * This option is set by default to 1 if data sorting is enabled.
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
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   */
  @JSProperty("pointWidth")
  double getPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * each column or bar. When <code>null</code>, the width is calculated from the
   * <code>pointPadding</code> and <code>groupPadding</code>.
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
   * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
   * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
   * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts, Highstock) If true, a checkbox is displayed next to the
   * legend item to allow selecting the series. The state of the checkbox is
   * determined by the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts, Highstock) Whether to display this particular series or
   * series type in the legend. Standalone series are shown in legend by
   * default, and linked series are not. Since v7.2.0 it is possible to show
   * series that use colorAxis by setting this option to <code>true</code>.
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highstock) Whether to display this particular series or
   * series type in the legend. Standalone series are shown in legend by
   * default, and linked series are not. Since v7.2.0 it is possible to show
   * series that use colorAxis by setting this option to <code>true</code>.
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
   * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
   * skip past the points in this series for keyboard navigation.
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

  /**
   * (Highcharts) The dash style of the stem, the vertical line extending from
   * the box to the whiskers.
   *
   */
  @JSProperty("stemDashStyle")
  @Nullable
  StemDashStyle getStemDashStyle();

  /**
   * (Highcharts) The dash style of the stem, the vertical line extending from
   * the box to the whiskers.
   *
   */
  @JSProperty("stemDashStyle")
  void setStemDashStyle(@Nullable StemDashStyle value);

  /**
   * (Highcharts) The width of the stem, the vertical line extending from the
   * box to the whiskers. If <code>undefined</code>, the width is inherited from the
   * lineWidth option.
   *
   * In styled mode, the stem stroke width can be set with the
   * <code>.highcharts-boxplot-stem</code> class.
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
   */
  @JSProperty("stemWidth")
  void setStemWidth(double value);

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip when not shared.
   * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
   * will be hidden when moving the mouse between series. Defaults to true for
   * line and area type series, but to false for columns, pies etc.
   *
   * <strong>Note:</strong> The boost module will force this option because of technical
   * limitations.
   *
   */
  @JSProperty("stickyTracking")
  boolean getStickyTracking();

  /**
   * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
   * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
   * another series, or out of the plot area. When false, the <code>mouseOut</code> event
   * on a series is triggered when the mouse leaves the area around the
   * series' graph or markers. This also implies the tooltip when not shared.
   * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
   * will be hidden when moving the mouse between series. Defaults to true for
   * line and area type series, but to false for columns, pies etc.
   *
   * <strong>Note:</strong> The boost module will force this option because of technical
   * limitations.
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) The Y axis value to serve as the base for the columns, for
   * distinguishing between values above and below a threshold. If <code>null</code>, the
   * columns extend from the padding Y axis minimum.
   *
   */
  @JSProperty("threshold")
  double getThreshold();

  /**
   * (Highcharts) The Y axis value to serve as the base for the columns, for
   * distinguishing between values above and below a threshold. If <code>null</code>, the
   * columns extend from the padding Y axis minimum.
   *
   */
  @JSProperty("threshold")
  void setThreshold(double value);

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip, but only
   * the following properties can be defined on a series level.
   *
   */
  @JSProperty("tooltip")
  @Nullable
  SeriesTooltipOptionsObject getTooltip();

  /**
   * (Highcharts, Highstock) A configuration object for the tooltip rendering
   * of each single series. Properties are inherited from tooltip, but only
   * the following properties can be defined on a series level.
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
   * (Highcharts, Highstock) Set the initial visibility of the series.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock) Set the initial visibility of the series.
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
   */
  @JSProperty("whiskerColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getWhiskerColor();

  /**
   * (Highcharts) The color of the whiskers, the horizontal lines marking low
   * and high values. When <code>undefined</code>, the general series color is used.
   *
   * In styled mode, the whisker stroke can be set with the
   * <code>.highcharts-boxplot-whisker</code> class .
   *
   */
  @JSProperty("whiskerColor")
  void setWhiskerColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the whiskers, the horizontal lines marking low
   * and high values. When <code>undefined</code>, the general series color is used.
   *
   * In styled mode, the whisker stroke can be set with the
   * <code>.highcharts-boxplot-whisker</code> class .
   *
   */
  @JSProperty("whiskerColor")
  void setWhiskerColor(@Nullable String value);

  /**
   * (Highcharts) The color of the whiskers, the horizontal lines marking low
   * and high values. When <code>undefined</code>, the general series color is used.
   *
   * In styled mode, the whisker stroke can be set with the
   * <code>.highcharts-boxplot-whisker</code> class .
   *
   */
  @JSProperty("whiskerColor")
  void setWhiskerColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The dash style of the whiskers.
   *
   */
  @JSProperty("whiskerDashStyle")
  @Nullable
  WhiskerDashStyle getWhiskerDashStyle();

  /**
   * (Highcharts) The dash style of the whiskers.
   *
   */
  @JSProperty("whiskerDashStyle")
  void setWhiskerDashStyle(@Nullable WhiskerDashStyle value);

  /**
   * (Highcharts) The length of the whiskers, the horizontal lines marking low
   * and high values. It can be a numerical pixel value, or a percentage value
   * of the box width. Set <code>0</code> to disable whiskers.
   *
   */
  @JSProperty("whiskerLength")
  @Nullable
  Unknown /* ( number | string ) */ getWhiskerLength();

  /**
   * (Highcharts) The length of the whiskers, the horizontal lines marking low
   * and high values. It can be a numerical pixel value, or a percentage value
   * of the box width. Set <code>0</code> to disable whiskers.
   *
   */
  @JSProperty("whiskerLength")
  void setWhiskerLength(double value);

  /**
   * (Highcharts) The length of the whiskers, the horizontal lines marking low
   * and high values. It can be a numerical pixel value, or a percentage value
   * of the box width. Set <code>0</code> to disable whiskers.
   *
   */
  @JSProperty("whiskerLength")
  void setWhiskerLength(@Nullable String value);

  /**
   * (Highcharts) The line width of the whiskers, the horizontal lines marking
   * low and high values. When <code>null</code>, the general lineWidth applies.
   *
   */
  @JSProperty("whiskerWidth")
  double getWhiskerWidth();

  /**
   * (Highcharts) The line width of the whiskers, the horizontal lines marking
   * low and high values. When <code>null</code>, the general lineWidth applies.
   *
   */
  @JSProperty("whiskerWidth")
  void setWhiskerWidth(double value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotErrorbarOptions object = Any.empty();

    private Builder() {
    }

    public PlotErrorbarOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Accessibility options for a series.
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
     * (Highcharts, Highstock) Allow this series' points to be selected by
     * clicking on the graphic (columns, point markers, pie slices, map areas
     * etc).
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
     * (Highcharts, Highstock) Enable or disable the initial animation when a
     * series is displayed. The animation can also be set as a configuration
     * object. Please note that this option only applies to the initial
     * animation of the series itself. For other animations, see chart.animation
     * and the animation parameter under the API methods. The following
     * properties are supported:
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
     * (Highcharts, Highstock) Enable or disable the initial animation when a
     * series is displayed. The animation can also be set as a configuration
     * object. Please note that this option only applies to the initial
     * animation of the series itself. For other animations, see chart.animation
     * and the animation parameter under the API methods. The following
     * properties are supported:
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
     * (Highcharts, Highstock) For some series, there is a limit that shuts down
     * initial animation by default when the total number of points in the chart
     * is too high. For example, for a column chart and its derivatives,
     * animation does not run if there is more than 250 points totally. To
     * disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
     *
     */
    public Builder animationLimit(double value) {
      object.setAnimationLimit(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Sets the color blending in the boost module.
     *
     */
    public Builder boostBlending(@Nullable BoostBlending value) {
      object.setBoostBlending(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Set the point threshold for when a series should
     * enter boost mode.
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
     * (Highcharts) The dash style of the box.
     *
     */
    public Builder boxDashStyle(@Nullable BoxDashStyle value) {
      object.setBoxDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) When <code>true</code>, the columns will center in
     * the category, ignoring null or missing points. When <code>false</code>, space will
     * be reserved for null or missing points.
     *
     */
    public Builder centerInCategory(boolean value) {
      object.setCenterInCategory(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) An additional class name to apply to the series'
     * graphical elements. This option does not replace default class names of
     * the graphical element.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Disable this option to allow series rendering in
     * the whole plotting area.
     *
     * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
     *
     */
    public Builder clip(boolean value) {
      object.setClip(value);
      return this;
    }

    /**
     * (Highcharts) The main color of the bars. This can be overridden by
     * stemColor and whiskerColor individually.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The main color of the bars. This can be overridden by
     * stemColor and whiskerColor individually.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The main color of the bars. This can be overridden by
     * stemColor and whiskerColor individually.
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
     * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
     * from the global colors or series-specific plotOptions.column.colors
     * collections, this option determines whether the chart should receive one
     * color per series or one color per point.
     *
     * In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
     * and instead this option gives the points individual color class names on
     * the form <code>highcharts-color-{n}</code>.
     *
     */
    public Builder colorByPoint(boolean value) {
      object.setColorByPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Styled mode only. A specific color index to use
     * for the series, so its graphic representations are given the class name
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
     * (Highcharts, Highstock, Gantt) A series specific or series type specific
     * color set to apply instead of the global colors when colorByPoint is
     * true.
     *
     */
    public Builder colors(GradientColorObject... value) {
      object.setColors(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A series specific or series type specific
     * color set to apply instead of the global colors when colorByPoint is
     * true.
     *
     */
    public Builder colors(PatternObject... value) {
      object.setColors(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A series specific or series type specific
     * color set to apply instead of the global colors when colorByPoint is
     * true.
     *
     */
    public Builder colors(String... value) {
      object.setColors(value);
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
     * (Highcharts, Highstock, Gantt) When the series contains less points than
     * the crop threshold, all points are drawn, event if the points fall
     * outside the visible plot area at the current zoom. The advantage of
     * drawing all points (including markers and columns), is that animation is
     * performed on updates. On the other hand, when the series contains more
     * points than the crop threshold, the series data is cropped to only
     * contain points that fall within the plot area. The advantage of cropping
     * away invisible points is to increase performance on large series.
     *
     */
    public Builder cropThreshold(double value) {
      object.setCropThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
     * click events attached to the series, to signal to the user that the
     * points and lines can be clicked.
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
     * (Highcharts, Highstock) You can set the cursor to &quot;pointer&quot; if you have
     * click events attached to the series, to signal to the user that the
     * points and lines can be clicked.
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
     * (Highcharts, Highstock) A reserved subspace to store options and values
     * for customized functionality. Here you can add additional data for your
     * own event callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Name of the dash style to use for the graph, or
     * for some series types the outline of each shape.
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
    public Builder dataLabels(@Nullable PlotErrorbarDataLabelsOptions value) {
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
    public Builder dataLabels(PlotErrorbarDataLabelsOptions... value) {
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
    public Builder dataSorting(@Nullable PlotErrorbarDataSortingOptions value) {
      object.setDataSorting(value);
      return this;
    }

    /**
     * (Highcharts) Depth of the columns in a 3D column chart.
     *
     */
    public Builder depth(double value) {
      object.setDepth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A description of the series to add to the screen
     * reader information about the series.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The draggable-points module allows points to be
     * moved around or modified in the chart. In addition to the options
     * mentioned under the <code>dragDrop</code> API structure, the module fires three
     * events, point.dragStart, point.drag and point.drop.
     *
     */
    public Builder dragDrop(@Nullable SeriesDragDropOptionsObject value) {
      object.setDragDrop(value);
      return this;
    }

    /**
     * (Highcharts) 3D columns only. The color of the edges. Similar to
     * <code>borderColor</code>, except it defaults to the same color as the column.
     *
     */
    public Builder edgeColor(@Nullable String value) {
      object.setEdgeColor(value);
      return this;
    }

    /**
     * (Highcharts) 3D columns only. The width of the colored edges.
     *
     */
    public Builder edgeWidth(double value) {
      object.setEdgeWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Enable or disable the mouse tracking for a
     * specific series. This includes point tooltips and click events on graphs
     * and points. For large datasets it improves performance.
     *
     */
    public Builder enableMouseTracking(boolean value) {
      object.setEnableMouseTracking(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) General event handlers for the series items.
     * These event hooks can also be attached to the series at run time using
     * the <code>Highcharts.addEvent</code> function.
     *
     */
    public Builder events(@Nullable SeriesEventsOptionsObject value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts) The fill color of the box.
     *
     * In styled mode, the fill color can be set with the
     * <code>.highcharts-boxplot-box</code> class.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts) The fill color of the box.
     *
     * In styled mode, the fill color can be set with the
     * <code>.highcharts-boxplot-box</code> class.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts) The fill color of the box.
     *
     * In styled mode, the fill color can be set with the
     * <code>.highcharts-boxplot-box</code> class.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Determines whether the series should look for the
     * nearest point in both dimensions or just the x-dimension when hovering
     * the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most
     * other series. If the data has duplicate x-values, it is recommended to
     * set this to <code>'xy'</code> to allow hovering over all points.
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
     * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
     * let them render independent of each other. Non-grouped columns will be
     * laid out individually and overlap each other.
     *
     */
    public Builder grouping(boolean value) {
      object.setGrouping(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
     * axis units.
     *
     */
    public Builder groupPadding(double value) {
      object.setGroupPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When set to <code>false</code> will prevent the series data
     * from being included in any form of data export.
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
     * (Highcharts, Highstock) An array specifying which option maps to which
     * key in the data point array. This makes it convenient to work with
     * unstructured data arrays from different sources.
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
     * (Highcharts) The width of the line surrounding the box. If any of
     * stemWidth, medianWidth or whiskerWidth are <code>null</code>, the lineWidth also
     * applies to these lines.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts) The parent series of the error bar. The default value links
     * it to the previous series. Otherwise, use the id of the parent series.
     *
     */
    public Builder linkedTo(@Nullable String value) {
      object.setLinkedTo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
     * column, translated to the height of a bar in a bar chart. This prevents
     * the columns from becoming too wide when there is a small number of points
     * in the chart.
     *
     */
    public Builder maxPointWidth(double value) {
      object.setMaxPointWidth(value);
      return this;
    }

    /**
     * (Highcharts) The color of the median line. If <code>undefined</code>, the general
     * series color applies.
     *
     * In styled mode, the median stroke width can be set with the
     * <code>.highcharts-boxplot-median</code> class.
     *
     */
    public Builder medianColor(@Nullable String value) {
      object.setMedianColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the median line. If <code>undefined</code>, the general
     * series color applies.
     *
     * In styled mode, the median stroke width can be set with the
     * <code>.highcharts-boxplot-median</code> class.
     *
     */
    public Builder medianColor(@Nullable GradientColorObject value) {
      object.setMedianColor(value);
      return this;
    }

    /**
     * (Highcharts) The dash style of the median.
     *
     */
    public Builder medianDashStyle(@Nullable MedianDashStyle value) {
      object.setMedianDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) The pixel width of the median line. If <code>null</code>, the lineWidth
     * is used.
     *
     * In styled mode, the median stroke width can be set with the
     * <code>.highcharts-boxplot-median</code> class.
     *
     */
    public Builder medianWidth(double value) {
      object.setMedianWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The minimal height for a column or width
     * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
     * to zero) point, set the minimal point length to a pixel value like 3. In
     * stacked column charts, minPointLength might not be respected for tightly
     * packed values.
     *
     */
    public Builder minPointLength(double value) {
      object.setMinPointLength(value);
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
     * (Highcharts, Highstock) The color for the parts of the graph or points
     * that are below the threshold. Note that <code>zones</code> takes precedence over the
     * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
     * with value of 0.
     *
     */
    public Builder negativeColor(@Nullable PatternObject value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color for the parts of the graph or points
     * that are below the threshold. Note that <code>zones</code> takes precedence over the
     * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
     * with value of 0.
     *
     */
    public Builder negativeColor(@Nullable String value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color for the parts of the graph or points
     * that are below the threshold. Note that <code>zones</code> takes precedence over the
     * negative color. Using <code>negativeColor</code> is equivalent to applying a zone
     * with value of 0.
     *
     */
    public Builder negativeColor(@Nullable GradientColorObject value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Opacity of a series parts: line, fill (e.g. area)
     * and dataLabels.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Properties for each single point.
     *
     */
    public Builder point(@Nullable PlotSeriesPointOptions value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
     * but for an individual series. Overrides the chart wide configuration.
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
     * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
     * axis units.
     *
     */
    public Builder pointPadding(double value) {
      object.setPointPadding(value);
      return this;
    }

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
     */
    public Builder pointPlacement(double value) {
      object.setPointPlacement(value);
      return this;
    }

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
     */
    public Builder pointPlacement(@Nullable String value) {
      object.setPointPlacement(value);
      return this;
    }

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
     * This option is set by default to 1 if data sorting is enabled.
     *
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
     * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
     * each column or bar. When <code>null</code>, the width is calculated from the
     * <code>pointPadding</code> and <code>groupPadding</code>.
     *
     */
    public Builder pointWidth(double value) {
      object.setPointWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to select the series initially. If
     * <code>showCheckbox</code> is true, the checkbox next to the series name in the
     * legend will be checked for a selected series.
     *
     */
    public Builder selected(boolean value) {
      object.setSelected(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
     * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
     * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
     * Since 2.3 the shadow can be an object configuration containing <code>color</code>,
     * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) If true, a checkbox is displayed next to the
     * legend item to allow selecting the series. The state of the checkbox is
     * determined by the <code>selected</code> option.
     *
     */
    public Builder showCheckbox(boolean value) {
      object.setShowCheckbox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to display this particular series or
     * series type in the legend. Standalone series are shown in legend by
     * default, and linked series are not. Since v7.2.0 it is possible to show
     * series that use colorAxis by setting this option to <code>true</code>.
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
     * (Highcharts, Highstock) If set to <code>true</code>, the accessibility module will
     * skip past the points in this series for keyboard navigation.
     *
     */
    public Builder skipKeyboardNavigation(boolean value) {
      object.setSkipKeyboardNavigation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When this is true, the series will not cause the
     * Y axis to cross the zero plane (or threshold option) unless the data
     * actually crosses the plane.
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

    /**
     * (Highcharts) The dash style of the stem, the vertical line extending from
     * the box to the whiskers.
     *
     */
    public Builder stemDashStyle(@Nullable StemDashStyle value) {
      object.setStemDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) The width of the stem, the vertical line extending from the
     * box to the whiskers. If <code>undefined</code>, the width is inherited from the
     * lineWidth option.
     *
     * In styled mode, the stem stroke width can be set with the
     * <code>.highcharts-boxplot-stem</code> class.
     *
     */
    public Builder stemWidth(double value) {
      object.setStemWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
     * <code>mouseOut</code> event on a series isn't triggered until the mouse moves over
     * another series, or out of the plot area. When false, the <code>mouseOut</code> event
     * on a series is triggered when the mouse leaves the area around the
     * series' graph or markers. This also implies the tooltip when not shared.
     * When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
     * will be hidden when moving the mouse between series. Defaults to true for
     * line and area type series, but to false for columns, pies etc.
     *
     * <strong>Note:</strong> The boost module will force this option because of technical
     * limitations.
     *
     */
    public Builder stickyTracking(boolean value) {
      object.setStickyTracking(value);
      return this;
    }

    /**
     * (Highcharts) The Y axis value to serve as the base for the columns, for
     * distinguishing between values above and below a threshold. If <code>null</code>, the
     * columns extend from the padding Y axis minimum.
     *
     */
    public Builder threshold(double value) {
      object.setThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A configuration object for the tooltip rendering
     * of each single series. Properties are inherited from tooltip, but only
     * the following properties can be defined on a series level.
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
     * (Highcharts, Highstock) Set the initial visibility of the series.
     *
     */
    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }

    /**
     * (Highcharts) The color of the whiskers, the horizontal lines marking low
     * and high values. When <code>undefined</code>, the general series color is used.
     *
     * In styled mode, the whisker stroke can be set with the
     * <code>.highcharts-boxplot-whisker</code> class .
     *
     */
    public Builder whiskerColor(@Nullable PatternObject value) {
      object.setWhiskerColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the whiskers, the horizontal lines marking low
     * and high values. When <code>undefined</code>, the general series color is used.
     *
     * In styled mode, the whisker stroke can be set with the
     * <code>.highcharts-boxplot-whisker</code> class .
     *
     */
    public Builder whiskerColor(@Nullable String value) {
      object.setWhiskerColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the whiskers, the horizontal lines marking low
     * and high values. When <code>undefined</code>, the general series color is used.
     *
     * In styled mode, the whisker stroke can be set with the
     * <code>.highcharts-boxplot-whisker</code> class .
     *
     */
    public Builder whiskerColor(@Nullable GradientColorObject value) {
      object.setWhiskerColor(value);
      return this;
    }

    /**
     * (Highcharts) The dash style of the whiskers.
     *
     */
    public Builder whiskerDashStyle(@Nullable WhiskerDashStyle value) {
      object.setWhiskerDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) The length of the whiskers, the horizontal lines marking low
     * and high values. It can be a numerical pixel value, or a percentage value
     * of the box width. Set <code>0</code> to disable whiskers.
     *
     */
    public Builder whiskerLength(double value) {
      object.setWhiskerLength(value);
      return this;
    }

    /**
     * (Highcharts) The length of the whiskers, the horizontal lines marking low
     * and high values. It can be a numerical pixel value, or a percentage value
     * of the box width. Set <code>0</code> to disable whiskers.
     *
     */
    public Builder whiskerLength(@Nullable String value) {
      object.setWhiskerLength(value);
      return this;
    }

    /**
     * (Highcharts) The line width of the whiskers, the horizontal lines marking
     * low and high values. When <code>null</code>, the general lineWidth applies.
     *
     */
    public Builder whiskerWidth(double value) {
      object.setWhiskerWidth(value);
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
  }
}
