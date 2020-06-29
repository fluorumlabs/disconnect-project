package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( PlotXrangeDataLabelsOptions | Array < PlotXrangeDataLabelsOptions > ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* ( boolean | number | string ) */;
import js.lang.Unknown /* ( string | Array < string > ) */;
import js.lang.Unknown /* ( string | CursorValue ) */;
import js.lang.Unknown /* Array < ( ColorString | GradientColorObject | PatternObject ) > */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the X
 * axis, typically time intervals with a start and end date.
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
 * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
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
public interface PlotXrangeOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Accessibility options for a series.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  SeriesAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts, Highstock, Gantt) Accessibility options for a series.
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
   * (Highcharts, Highstock, Gantt) Allow this series' points to be selected
   * by clicking on the graphic (columns, point markers, pie slices, map areas
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
   * (Highcharts, Highstock, Gantt) Allow this series' points to be selected
   * by clicking on the graphic (columns, point markers, pie slices, map areas
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
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
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
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
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
   * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
   * when a series is displayed. The animation can also be set as a
   * configuration object. Please note that this option only applies to the
   * initial animation of the series itself. For other animations, see
   * chart.animation and the animation parameter under the API methods. The
   * following properties are supported:
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
   * (Highcharts, Highstock, Gantt) For some series, there is a limit that
   * shuts down initial animation by default when the total number of points
   * in the chart is too high. For example, for a column chart and its
   * derivatives, animation does not run if there is more than 250 points
   * totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   */
  @JSProperty("animationLimit")
  double getAnimationLimit();

  /**
   * (Highcharts, Highstock, Gantt) For some series, there is a limit that
   * shuts down initial animation by default when the total number of points
   * in the chart is too high. For example, for a column chart and its
   * derivatives, animation does not run if there is more than 250 points
   * totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
   *
   */
  @JSProperty("animationLimit")
  void setAnimationLimit(double value);

  /**
   * (Highcharts, Highstock, Gantt) Sets the color blending in the boost
   * module.
   *
   */
  @JSProperty("boostBlending")
  @Nullable
  BoostBlending getBoostBlending();

  /**
   * (Highcharts, Highstock, Gantt) Sets the color blending in the boost
   * module.
   *
   */
  @JSProperty("boostBlending")
  void setBoostBlending(@Nullable BoostBlending value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the border surrounding each
   * column or bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The corner radius of the border
   * surrounding each column or bar.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Gantt) The corner radius of the border
   * surrounding each column or bar.
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
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

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
   * (Highcharts, Highstock, Gantt) An additional class name to apply to the
   * series' graphical elements. This option does not replace default class
   * names of the graphical element.
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
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Disable this option to allow series
   * rendering in the whole plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
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
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

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
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

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
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

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
   * (Highcharts, Highstock, Gantt) In an X-range series, this option makes
   * all points of the same Y-axis category the same color.
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * (Highcharts, Highstock, Gantt) In an X-range series, this option makes
   * all points of the same Y-axis category the same color.
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Styled mode only. A specific color index
   * to use for the series, so its graphic representations are given the class
   * name <code>highcharts-color-{n}</code>.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Highstock, Gantt) Styled mode only. A specific color index
   * to use for the series, so its graphic representations are given the class
   * name <code>highcharts-color-{n}</code>.
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
   * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
   * have click events attached to the series, to signal to the user that the
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
   * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
   * have click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
   * have click events attached to the series, to signal to the user that the
   * points and lines can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable Cursor value);

  /**
   * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
   * values for customized functionality. Here you can add additional data for
   * your own event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
   * values for customized functionality. Here you can add additional data for
   * your own event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

  /**
   * (Highcharts, Highstock, Gantt) Name of the dash style to use for the
   * graph, or for some series types the outline of each shape.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under series.color.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock, Gantt) Name of the dash style to use for the
   * graph, or for some series types the outline of each shape.
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
  Unknown /* ( PlotXrangeDataLabelsOptions | Array < PlotXrangeDataLabelsOptions > ) */ getDataLabels(
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
  void setDataLabels(PlotXrangeDataLabelsOptions... value);

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
  void setDataLabels(@Nullable PlotXrangeDataLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) A description of the series to add to the
   * screen reader information about the series.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Gantt) A description of the series to add to the
   * screen reader information about the series.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The draggable-points module allows points
   * to be moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesDragDropOptionsObject getDragDrop();

  /**
   * (Highcharts, Highstock, Gantt) The draggable-points module allows points
   * to be moved around or modified in the chart. In addition to the options
   * mentioned under the <code>dragDrop</code> API structure, the module fires three
   * events, point.dragStart, point.drag and point.drop.
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(@Nullable SeriesDragDropOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable the mouse tracking for a
   * specific series. This includes point tooltips and click events on graphs
   * and points. For large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) General event handlers for the series
   * items. These event hooks can also be attached to the series at run time
   * using the <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesEventsOptionsObject getEvents();

  /**
   * (Highcharts, Highstock, Gantt) General event handlers for the series
   * items. These event hooks can also be attached to the series at run time
   * using the <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable SeriesEventsOptionsObject value);

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
   * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
   *
   */
  @JSProperty("groupZPadding")
  double getGroupZPadding();

  /**
   * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
   *
   */
  @JSProperty("groupZPadding")
  void setGroupZPadding(double value);

  /**
   * (Highcharts, Highstock, Gantt) When set to <code>false</code> will prevent the
   * series data from being included in any form of data export.
   *
   * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
   * <code>includeInCSVExport</code>.
   *
   */
  @JSProperty("includeInDataExport")
  boolean getIncludeInDataExport();

  /**
   * (Highcharts, Highstock, Gantt) When set to <code>false</code> will prevent the
   * series data from being included in any form of data export.
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
   * (Highcharts, Highstock, Gantt) An array specifying which option maps to
   * which key in the data point array. This makes it convenient to work with
   * unstructured data arrays from different sources.
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
   * (Highcharts, Highstock, Gantt) Opacity of a series parts: line, fill
   * (e.g. area) and dataLabels.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts, Highstock, Gantt) Opacity of a series parts: line, fill
   * (e.g. area) and dataLabels.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
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
   */
  @JSProperty("partialFill")
  void setPartialFill(@Nullable PlotXrangePartialFillOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Properties for each single point.
   *
   */
  @JSProperty("point")
  @Nullable
  PlotSeriesPointOptions getPoint();

  /**
   * (Highcharts, Highstock, Gantt) Properties for each single point.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable PlotSeriesPointOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Same as
   * accessibility.pointDescriptionFormatter, but for an individual series.
   * Overrides the chart wide configuration.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  JsFunction getPointDescriptionFormatter();

  /**
   * (Highcharts, Highstock, Gantt) Same as
   * accessibility.pointDescriptionFormatter, but for an individual series.
   * Overrides the chart wide configuration.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(@Nullable JsFunction value);

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

  @JSProperty("pointRange")
  double getPointRange();

  @JSProperty("pointRange")
  void setPointRange(double value);

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
   * (Highcharts, Highstock, Gantt) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock, Gantt) Whether to select the series initially. If
   * <code>showCheckbox</code> is true, the checkbox next to the series name in the
   * legend will be checked for a selected series.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
   * graph line. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
   * graph line. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
   * graph line. Since 2.3 the shadow can be an object configuration
   * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) If true, a checkbox is displayed next to
   * the legend item to allow selecting the series. The state of the checkbox
   * is determined by the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts, Highstock, Gantt) If true, a checkbox is displayed next to
   * the legend item to allow selecting the series. The state of the checkbox
   * is determined by the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to display this particular series
   * or series type in the legend. Standalone series are shown in legend by
   * default, and linked series are not. Since v7.2.0 it is possible to show
   * series that use colorAxis by setting this option to <code>true</code>.
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highstock, Gantt) Whether to display this particular series
   * or series type in the legend. Standalone series are shown in legend by
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
   * (Highcharts, Highstock, Gantt) If set to <code>true</code>, the accessibility module
   * will skip past the points in this series for keyboard navigation.
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts, Highstock, Gantt) If set to <code>true</code>, the accessibility module
   * will skip past the points in this series for keyboard navigation.
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  @JSProperty("states")
  @Nullable
  SeriesStatesOptionsObject getStates();

  @JSProperty("states")
  void setStates(@Nullable SeriesStatesOptionsObject value);

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
   * <strong>Note:</strong> The boost module will force this option because of technical
   * limitations.
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
   * <strong>Note:</strong> The boost module will force this option because of technical
   * limitations.
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) A configuration object for the tooltip
   * rendering of each single series. Properties are inherited from tooltip,
   * but only the following properties can be defined on a series level.
   *
   */
  @JSProperty("tooltip")
  @Nullable
  SeriesTooltipOptionsObject getTooltip();

  /**
   * (Highcharts, Highstock, Gantt) A configuration object for the tooltip
   * rendering of each single series. Properties are inherited from tooltip,
   * but only the following properties can be defined on a series level.
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
   * (Highcharts, Highstock, Gantt) Set the initial visibility of the series.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock, Gantt) Set the initial visibility of the series.
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
    private final PlotXrangeOptions object = Any.empty();

    private Builder() {
    }

    public PlotXrangeOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Accessibility options for a series.
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
     * (Highcharts, Highstock, Gantt) Allow this series' points to be selected
     * by clicking on the graphic (columns, point markers, pie slices, map areas
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
     * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
     * when a series is displayed. The animation can also be set as a
     * configuration object. Please note that this option only applies to the
     * initial animation of the series itself. For other animations, see
     * chart.animation and the animation parameter under the API methods. The
     * following properties are supported:
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
     * (Highcharts, Highstock, Gantt) Enable or disable the initial animation
     * when a series is displayed. The animation can also be set as a
     * configuration object. Please note that this option only applies to the
     * initial animation of the series itself. For other animations, see
     * chart.animation and the animation parameter under the API methods. The
     * following properties are supported:
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
     * (Highcharts, Highstock, Gantt) For some series, there is a limit that
     * shuts down initial animation by default when the total number of points
     * in the chart is too high. For example, for a column chart and its
     * derivatives, animation does not run if there is more than 250 points
     * totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
     *
     */
    public Builder animationLimit(double value) {
      object.setAnimationLimit(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Sets the color blending in the boost
     * module.
     *
     */
    public Builder boostBlending(@Nullable BoostBlending value) {
      object.setBoostBlending(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the border surrounding each
     * column or bar.
     *
     * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the border surrounding each
     * column or bar.
     *
     * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the border surrounding each
     * column or bar.
     *
     * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The corner radius of the border
     * surrounding each column or bar.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The width of the border surrounding each
     * column or bar. Defaults to <code>1</code> when there is room for a border, but to
     * <code>0</code> when the columns are so dense that a border would cover the next
     * column.
     *
     * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
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
     * (Highcharts, Highstock, Gantt) An additional class name to apply to the
     * series' graphical elements. This option does not replace default class
     * names of the graphical element.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Disable this option to allow series
     * rendering in the whole plotting area.
     *
     * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
     *
     */
    public Builder clip(boolean value) {
      object.setClip(value);
      return this;
    }

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
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

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
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

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
     * (Highcharts, Highstock, Gantt) In an X-range series, this option makes
     * all points of the same Y-axis category the same color.
     *
     */
    public Builder colorByPoint(boolean value) {
      object.setColorByPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Styled mode only. A specific color index
     * to use for the series, so its graphic representations are given the class
     * name <code>highcharts-color-{n}</code>.
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
     * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
     * have click events attached to the series, to signal to the user that the
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
     * (Highcharts, Highstock, Gantt) You can set the cursor to &quot;pointer&quot; if you
     * have click events attached to the series, to signal to the user that the
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
     * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
     * values for customized functionality. Here you can add additional data for
     * your own event callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Name of the dash style to use for the
     * graph, or for some series types the outline of each shape.
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
    public Builder dataLabels(PlotXrangeDataLabelsOptions... value) {
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
    public Builder dataLabels(@Nullable PlotXrangeDataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A description of the series to add to the
     * screen reader information about the series.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The draggable-points module allows points
     * to be moved around or modified in the chart. In addition to the options
     * mentioned under the <code>dragDrop</code> API structure, the module fires three
     * events, point.dragStart, point.drag and point.drop.
     *
     */
    public Builder dragDrop(@Nullable SeriesDragDropOptionsObject value) {
      object.setDragDrop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable or disable the mouse tracking for a
     * specific series. This includes point tooltips and click events on graphs
     * and points. For large datasets it improves performance.
     *
     */
    public Builder enableMouseTracking(boolean value) {
      object.setEnableMouseTracking(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) General event handlers for the series
     * items. These event hooks can also be attached to the series at run time
     * using the <code>Highcharts.addEvent</code> function.
     *
     */
    public Builder events(@Nullable SeriesEventsOptionsObject value) {
      object.setEvents(value);
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
     * (Highcharts) The spacing between columns on the Z Axis in a 3D chart.
     *
     */
    public Builder groupZPadding(double value) {
      object.setGroupZPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) When set to <code>false</code> will prevent the
     * series data from being included in any form of data export.
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
     * (Highcharts, Highstock, Gantt) An array specifying which option maps to
     * which key in the data point array. This makes it convenient to work with
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
     * (Highcharts, Highstock, Gantt) Opacity of a series parts: line, fill
     * (e.g. area) and dataLabels.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
     * used to visualize how much of a task is performed. The partial fill
     * object can be set either on series or point level.
     *
     */
    public Builder partialFill(@Nullable PlotXrangePartialFillOptions value) {
      object.setPartialFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Properties for each single point.
     *
     */
    public Builder point(@Nullable PlotSeriesPointOptions value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Same as
     * accessibility.pointDescriptionFormatter, but for an individual series.
     * Overrides the chart wide configuration.
     *
     */
    public Builder pointDescriptionFormatter(@Nullable JsFunction value) {
      object.setPointDescriptionFormatter(value);
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

    public Builder pointRange(double value) {
      object.setPointRange(value);
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
     * (Highcharts, Highstock, Gantt) Whether to select the series initially. If
     * <code>showCheckbox</code> is true, the checkbox next to the series name in the
     * legend will be checked for a selected series.
     *
     */
    public Builder selected(boolean value) {
      object.setSelected(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
     * graph line. Since 2.3 the shadow can be an object configuration
     * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to apply a drop shadow to the
     * graph line. Since 2.3 the shadow can be an object configuration
     * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) If true, a checkbox is displayed next to
     * the legend item to allow selecting the series. The state of the checkbox
     * is determined by the <code>selected</code> option.
     *
     */
    public Builder showCheckbox(boolean value) {
      object.setShowCheckbox(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to display this particular series
     * or series type in the legend. Standalone series are shown in legend by
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
     * (Highcharts, Highstock, Gantt) If set to <code>true</code>, the accessibility module
     * will skip past the points in this series for keyboard navigation.
     *
     */
    public Builder skipKeyboardNavigation(boolean value) {
      object.setSkipKeyboardNavigation(value);
      return this;
    }

    public Builder states(@Nullable SeriesStatesOptionsObject value) {
      object.setStates(value);
      return this;
    }

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
     * <strong>Note:</strong> The boost module will force this option because of technical
     * limitations.
     *
     */
    public Builder stickyTracking(boolean value) {
      object.setStickyTracking(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A configuration object for the tooltip
     * rendering of each single series. Properties are inherited from tooltip,
     * but only the following properties can be defined on a series level.
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
     * (Highcharts, Highstock, Gantt) Set the initial visibility of the series.
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
