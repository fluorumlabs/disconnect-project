package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( PlotGaugeDataLabelsOptions | Array < PlotGaugeDataLabelsOptions > ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( string | Array < string > ) */;
import js.lang.Unknown /* ( string | CursorValue ) */;
import js.lang.Unknown /* SeriesLinecapValue */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Gauges are circular plots displaying one or more values with a
 * dial pointing to values along the perimeter.
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
 * Options for all <code>gauge</code> series are defined in plotOptions.gauge.
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
public interface PlotGaugeOptions extends Any {
  /**
   * (Highcharts) Accessibility options for a series.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  SeriesAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts) Accessibility options for a series.
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
   * (Highcharts) Allow this series' points to be selected by clicking on the
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
   * (Highcharts) Allow this series' points to be selected by clicking on the
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
   * (Highcharts) Enable or disable the initial animation when a series is
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
   * (Highcharts) Enable or disable the initial animation when a series is
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
   * (Highcharts) Enable or disable the initial animation when a series is
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
   * (Highcharts) Sets the color blending in the boost module.
   *
   */
  @JSProperty("boostBlending")
  @Nullable
  BoostBlending getBoostBlending();

  /**
   * (Highcharts) Sets the color blending in the boost module.
   *
   */
  @JSProperty("boostBlending")
  void setBoostBlending(@Nullable BoostBlending value);

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
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
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
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts) Disable this option to allow series rendering in the whole
   * plotting area.
   *
   * <strong>Note:</strong> Clipping should be always enabled when chart.zoomType is set
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
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

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
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

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
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

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
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
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
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
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
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
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
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
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
   * (Highcharts) A reserved subspace to store options and values for
   * customized functionality. Here you can add additional data for your own
   * event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Highcharts) A reserved subspace to store options and values for
   * customized functionality. Here you can add additional data for your own
   * event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

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
   * (Highcharts) Data labels for the gauge. For gauges, the data labels are
   * enabled by default and shown in a bordered box below the point.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( PlotGaugeDataLabelsOptions | Array < PlotGaugeDataLabelsOptions > ) */ getDataLabels(
      );

  /**
   * (Highcharts) Data labels for the gauge. For gauges, the data labels are
   * enabled by default and shown in a bordered box below the point.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable PlotGaugeDataLabelsOptions value);

  /**
   * (Highcharts) Data labels for the gauge. For gauges, the data labels are
   * enabled by default and shown in a bordered box below the point.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotGaugeDataLabelsOptions... value);

  /**
   * (Highcharts) A description of the series to add to the screen reader
   * information about the series.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) A description of the series to add to the screen reader
   * information about the series.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts) Options for the dial or arrow pointer of the gauge.
   *
   * In styled mode, the dial is styled with the <code>.highcharts-gauge-series .highcharts-dial</code> rule.
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
   */
  @JSProperty("dial")
  void setDial(@Nullable PlotGaugeDialOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  @Nullable
  SeriesEventsOptionsObject getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable SeriesEventsOptionsObject value);

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
   * (Highcharts) When set to <code>false</code> will prevent the series data from being
   * included in any form of data export.
   *
   * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
   * <code>includeInCSVExport</code>.
   *
   */
  @JSProperty("includeInDataExport")
  boolean getIncludeInDataExport();

  /**
   * (Highcharts) When set to <code>false</code> will prevent the series data from being
   * included in any form of data export.
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
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
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
   * (Highcharts, Highstock) Pixel width of the graph line.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line.
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
   * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
   * dataLabels.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
   * dataLabels.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts) Allow the dial to overshoot the end of the perimeter axis by
   * this many degrees. Say if the gauge axis goes from 0 to 60, a value of
   * 100, or 1000, will show 5 degrees beyond the end of the axis when this
   * option is set to 5.
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
   */
  @JSProperty("overshoot")
  void setOvershoot(double value);

  /**
   * (Highcharts) Options for the pivot or the center point of the gauge.
   *
   * In styled mode, the pivot is styled with the <code>.highcharts-gauge-series .highcharts-pivot</code> rule.
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
   */
  @JSProperty("pivot")
  void setPivot(@Nullable PlotGaugePivotOptions value);

  /**
   * (Highcharts) Properties for each single point.
   *
   */
  @JSProperty("point")
  @Nullable
  PlotSeriesPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable PlotSeriesPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  JsFunction getPointDescriptionFormatter();

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
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
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Defaults to false for gauge series.
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Defaults to false for gauge series.
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
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
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
   * <strong>Note:</strong> The boost module will force this option because of technical
   * limitations.
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
   * <strong>Note:</strong> The boost module will force this option because of technical
   * limitations.
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   */
  @JSProperty("tooltip")
  @Nullable
  SeriesTooltipOptionsObject getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   */
  @JSProperty("tooltip")
  void setTooltip(@Nullable SeriesTooltipOptionsObject value);

  /**
   * (Highstock) The parameter allows setting line series type and use OHLC
   * indicators. Data in OHLC format is required.
   *
   */
  @JSProperty("useOhlcData")
  boolean getUseOhlcData();

  /**
   * (Highstock) The parameter allows setting line series type and use OHLC
   * indicators. Data in OHLC format is required.
   *
   */
  @JSProperty("useOhlcData")
  void setUseOhlcData(boolean value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts) When this option is <code>true</code>, the dial will wrap around the
   * axes. For instance, in a full-range gauge going from 0 to 360, a value of
   * 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
   *
   */
  @JSProperty("wrap")
  boolean getWrap();

  /**
   * (Highcharts) When this option is <code>true</code>, the dial will wrap around the
   * axes. For instance, in a full-range gauge going from 0 to 360, a value of
   * 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
   *
   */
  @JSProperty("wrap")
  void setWrap(boolean value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotGaugeOptions object = Any.empty();

    private Builder() {
    }

    public PlotGaugeOptions build() {
      return object;
    }

    /**
     * (Highcharts) Accessibility options for a series.
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
     * (Highcharts) Allow this series' points to be selected by clicking on the
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
     * (Highcharts) Enable or disable the initial animation when a series is
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
     * (Highcharts) Enable or disable the initial animation when a series is
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
     * (Highcharts) Sets the color blending in the boost module.
     *
     */
    public Builder boostBlending(@Nullable BoostBlending value) {
      object.setBoostBlending(value);
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
     * (Highcharts) An additional class name to apply to the series' graphical
     * elements. This option does not replace default class names of the
     * graphical element.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts) Disable this option to allow series rendering in the whole
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
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

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
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

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
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Styled mode only. A specific color index to use for the
     * series, so its graphic representations are given the class name
     * <code>highcharts-color-{n}</code>.
     *
     */
    public Builder colorIndex(double value) {
      object.setColorIndex(value);
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
     * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
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
     * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
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
     * (Highcharts) A reserved subspace to store options and values for
     * customized functionality. Here you can add additional data for your own
     * event callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
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
     * (Highcharts) Data labels for the gauge. For gauges, the data labels are
     * enabled by default and shown in a bordered box below the point.
     *
     */
    public Builder dataLabels(@Nullable PlotGaugeDataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Data labels for the gauge. For gauges, the data labels are
     * enabled by default and shown in a bordered box below the point.
     *
     */
    public Builder dataLabels(PlotGaugeDataLabelsOptions... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) A description of the series to add to the screen reader
     * information about the series.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts) Options for the dial or arrow pointer of the gauge.
     *
     * In styled mode, the dial is styled with the <code>.highcharts-gauge-series .highcharts-dial</code> rule.
     *
     */
    public Builder dial(@Nullable PlotGaugeDialOptions value) {
      object.setDial(value);
      return this;
    }

    /**
     * (Highcharts) Enable or disable the mouse tracking for a specific series.
     * This includes point tooltips and click events on graphs and points. For
     * large datasets it improves performance.
     *
     */
    public Builder enableMouseTracking(boolean value) {
      object.setEnableMouseTracking(value);
      return this;
    }

    /**
     * (Highcharts) General event handlers for the series items. These event
     * hooks can also be attached to the series at run time using the
     * <code>Highcharts.addEvent</code> function.
     *
     */
    public Builder events(@Nullable SeriesEventsOptionsObject value) {
      object.setEvents(value);
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
     * (Highcharts) When set to <code>false</code> will prevent the series data from being
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
     * (Highcharts) An array specifying which option maps to which key in the
     * data point array. This makes it convenient to work with unstructured data
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
     * (Highcharts, Highstock) Pixel width of the graph line.
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
     * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
     * dataLabels.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highcharts) Allow the dial to overshoot the end of the perimeter axis by
     * this many degrees. Say if the gauge axis goes from 0 to 60, a value of
     * 100, or 1000, will show 5 degrees beyond the end of the axis when this
     * option is set to 5.
     *
     */
    public Builder overshoot(double value) {
      object.setOvershoot(value);
      return this;
    }

    /**
     * (Highcharts) Options for the pivot or the center point of the gauge.
     *
     * In styled mode, the pivot is styled with the <code>.highcharts-gauge-series .highcharts-pivot</code> rule.
     *
     */
    public Builder pivot(@Nullable PlotGaugePivotOptions value) {
      object.setPivot(value);
      return this;
    }

    /**
     * (Highcharts) Properties for each single point.
     *
     */
    public Builder point(@Nullable PlotSeriesPointOptions value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
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
     * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
     * true, the checkbox next to the series name in the legend will be checked
     * for a selected series.
     *
     */
    public Builder selected(boolean value) {
      object.setSelected(value);
      return this;
    }

    /**
     * (Highcharts) If true, a checkbox is displayed next to the legend item to
     * allow selecting the series. The state of the checkbox is determined by
     * the <code>selected</code> option.
     *
     */
    public Builder showCheckbox(boolean value) {
      object.setShowCheckbox(value);
      return this;
    }

    /**
     * (Highcharts) Whether to display this particular series or series type in
     * the legend. Defaults to false for gauge series.
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
     * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
     * the points in this series for keyboard navigation.
     *
     */
    public Builder skipKeyboardNavigation(boolean value) {
      object.setSkipKeyboardNavigation(value);
      return this;
    }

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
     * <strong>Note:</strong> The boost module will force this option because of technical
     * limitations.
     *
     */
    public Builder stickyTracking(boolean value) {
      object.setStickyTracking(value);
      return this;
    }

    /**
     * (Highcharts) A configuration object for the tooltip rendering of each
     * single series. Properties are inherited from tooltip, but only the
     * following properties can be defined on a series level.
     *
     */
    public Builder tooltip(@Nullable SeriesTooltipOptionsObject value) {
      object.setTooltip(value);
      return this;
    }

    /**
     * (Highstock) The parameter allows setting line series type and use OHLC
     * indicators. Data in OHLC format is required.
     *
     */
    public Builder useOhlcData(boolean value) {
      object.setUseOhlcData(value);
      return this;
    }

    /**
     * (Highcharts) Set the initial visibility of the series.
     *
     */
    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }

    /**
     * (Highcharts) When this option is <code>true</code>, the dial will wrap around the
     * axes. For instance, in a full-range gauge going from 0 to 360, a value of
     * 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
     *
     */
    public Builder wrap(boolean value) {
      object.setWrap(value);
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
  }
}
