package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( SeriesPieDataLabelsOptionsObject | Array < SeriesPieDataLabelsOptionsObject > ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* ( boolean | number | string ) */;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* ( string | Array < string > ) */;
import js.lang.Unknown /* ( string | CursorValue ) */;
import js.lang.Unknown /* Array < ( ColorString | GradientColorObject | PatternObject ) > */;
import js.lang.Unknown /* Array < ( number | string ) > */;
import js.lang.Unknown /* SeriesLinecapValue */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Funnel charts are a type of chart often used to visualize stages
 * in a sales project, where the top are the initial stages with the most
 * clients. It requires that the modules/funnel.js file is loaded.
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
 * Options for all <code>funnel</code> series are defined in plotOptions.funnel.
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
public interface PlotFunnelOptions extends Any {
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
   * (Highcharts) Initial animation is by default disabled for the funnel
   * chart.
   *
   */
  @JSProperty("animation")
  boolean getAnimation();

  /**
   * (Highcharts) Initial animation is by default disabled for the funnel
   * chart.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

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
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

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
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The center of the series. By default, it is centered in the
   * middle of the plot area, so it fills the plot area height.
   *
   */
  @JSProperty("center")
  @Nullable
  Unknown /* Array < ( number | string ) > */ getCenter();

  /**
   * (Highcharts) The center of the series. By default, it is centered in the
   * middle of the plot area, so it fills the plot area height.
   *
   */
  @JSProperty("center")
  void setCenter(double... value);

  /**
   * (Highcharts) The center of the series. By default, it is centered in the
   * middle of the plot area, so it fills the plot area height.
   *
   */
  @JSProperty("center")
  void setCenter(String... value);

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
   * (Highcharts) The color of the pie series. A pie series is represented as
   * an empty circle if the total sum of its values is 0. Use this property to
   * define the color of its border.
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
   * (Highcharts) The color of the pie series. A pie series is represented as
   * an empty circle if the total sum of its values is 0. Use this property to
   * define the color of its border.
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
   * (Highcharts) The color of the pie series. A pie series is represented as
   * an empty circle if the total sum of its values is 0. Use this property to
   * define the color of its border.
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
   * (Highcharts) The color of the pie series. A pie series is represented as
   * an empty circle if the total sum of its values is 0. Use this property to
   * define the color of its border.
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
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   */
  @JSProperty("colors")
  @Nullable
  Unknown /* Array < ( ColorString | GradientColorObject | PatternObject ) > */ getColors();

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   */
  @JSProperty("colors")
  void setColors(GradientColorObject... value);

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   */
  @JSProperty("colors")
  void setColors(PatternObject... value);

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
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
  Unknown /* ( SeriesPieDataLabelsOptionsObject | Array < SeriesPieDataLabelsOptionsObject > ) */ getDataLabels(
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
  void setDataLabels(SeriesPieDataLabelsOptionsObject... value);

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
  void setDataLabels(@Nullable SeriesPieDataLabelsOptionsObject value);

  /**
   * (Highcharts) The thickness of a 3D pie.
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) The thickness of a 3D pie.
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

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
   * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
   * right. Defaults to <code>startAngle</code> plus 360.
   *
   */
  @JSProperty("endAngle")
  double getEndAngle();

  /**
   * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
   * right. Defaults to <code>startAngle</code> plus 360.
   *
   */
  @JSProperty("endAngle")
  void setEndAngle(double value);

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
   * (Highcharts) If the total sum of the pie's values is 0, the series is
   * represented as an empty circle . The <code>fillColor</code> option defines the color
   * of that circle. Use pie.borderWidth to set the border thickness.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highcharts) If the total sum of the pie's values is 0, the series is
   * represented as an empty circle . The <code>fillColor</code> option defines the color
   * of that circle. Use pie.borderWidth to set the border thickness.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts) If the total sum of the pie's values is 0, the series is
   * represented as an empty circle . The <code>fillColor</code> option defines the color
   * of that circle. Use pie.borderWidth to set the border thickness.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts) If the total sum of the pie's values is 0, the series is
   * represented as an empty circle . The <code>fillColor</code> option defines the color
   * of that circle. Use pie.borderWidth to set the border thickness.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

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
   * (Highcharts) The height of the funnel or pyramid. If it is a number it
   * defines the pixel height, if it is a percentage string it is the
   * percentage of the plot area height.
   *
   */
  @JSProperty("height")
  @Nullable
  Unknown /* ( number | string ) */ getHeight();

  /**
   * (Highcharts) The height of the funnel or pyramid. If it is a number it
   * defines the pixel height, if it is a percentage string it is the
   * percentage of the plot area height.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts) The height of the funnel or pyramid. If it is a number it
   * defines the pixel height, if it is a percentage string it is the
   * percentage of the plot area height.
   *
   */
  @JSProperty("height")
  void setHeight(@Nullable String value);

  /**
   * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
   * whether the series shall be redrawn as if the hidden point were <code>null</code>.
   *
   * The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.
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
   */
  @JSProperty("ignoreHiddenPoint")
  void setIgnoreHiddenPoint(boolean value);

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
   * (Highcharts) The minimum size for a pie in response to auto margins. The
   * pie will try to shrink to make room for data labels in side the plot
   * area, but only to this size.
   *
   */
  @JSProperty("minSize")
  @Nullable
  Unknown /* ( number | string ) */ getMinSize();

  /**
   * (Highcharts) The minimum size for a pie in response to auto margins. The
   * pie will try to shrink to make room for data labels in side the plot
   * area, but only to this size.
   *
   */
  @JSProperty("minSize")
  void setMinSize(double value);

  /**
   * (Highcharts) The minimum size for a pie in response to auto margins. The
   * pie will try to shrink to make room for data labels in side the plot
   * area, but only to this size.
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
   * (Highcharts) The height of the neck, the lower part of the funnel. A
   * number defines pixel width, a percentage string defines a percentage of
   * the plot area height.
   *
   */
  @JSProperty("neckHeight")
  @Nullable
  Unknown /* ( number | string ) */ getNeckHeight();

  /**
   * (Highcharts) The height of the neck, the lower part of the funnel. A
   * number defines pixel width, a percentage string defines a percentage of
   * the plot area height.
   *
   */
  @JSProperty("neckHeight")
  void setNeckHeight(double value);

  /**
   * (Highcharts) The height of the neck, the lower part of the funnel. A
   * number defines pixel width, a percentage string defines a percentage of
   * the plot area height.
   *
   */
  @JSProperty("neckHeight")
  void setNeckHeight(@Nullable String value);

  /**
   * (Highcharts) The width of the neck, the lower part of the funnel. A
   * number defines pixel width, a percentage string defines a percentage of
   * the plot area width.
   *
   */
  @JSProperty("neckWidth")
  @Nullable
  Unknown /* ( number | string ) */ getNeckWidth();

  /**
   * (Highcharts) The width of the neck, the lower part of the funnel. A
   * number defines pixel width, a percentage string defines a percentage of
   * the plot area width.
   *
   */
  @JSProperty("neckWidth")
  void setNeckWidth(double value);

  /**
   * (Highcharts) The width of the neck, the lower part of the funnel. A
   * number defines pixel width, a percentage string defines a percentage of
   * the plot area width.
   *
   */
  @JSProperty("neckWidth")
  void setNeckWidth(@Nullable String value);

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
   * (Highcharts) A reversed funnel has the widest area down. A reversed
   * funnel with no neck width and neck height is a pyramid.
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts) A reversed funnel has the widest area down. A reversed
   * funnel with no neck width and neck height is a pyramid.
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

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
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

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
   * the legend. Since 2.1, pies are not shown in the legend by default.
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Since 2.1, pies are not shown in the legend by default.
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
   * (Highcharts) If a point is sliced, moved out from the center, how many
   * pixels should it be moved?.
   *
   */
  @JSProperty("slicedOffset")
  double getSlicedOffset();

  /**
   * (Highcharts) If a point is sliced, moved out from the center, how many
   * pixels should it be moved?.
   *
   */
  @JSProperty("slicedOffset")
  void setSlicedOffset(double value);

  /**
   * (Highcharts) The start angle of the pie slices in degrees where 0 is top
   * and 90 right.
   *
   */
  @JSProperty("startAngle")
  double getStartAngle();

  /**
   * (Highcharts) The start angle of the pie slices in degrees where 0 is top
   * and 90 right.
   *
   */
  @JSProperty("startAngle")
  void setStartAngle(double value);

  /**
   * (Highcharts) Options for the series states.
   *
   */
  @JSProperty("states")
  @Nullable
  SeriesStatesOptionsObject getStates();

  /**
   * (Highcharts) Options for the series states.
   *
   */
  @JSProperty("states")
  void setStates(@Nullable SeriesStatesOptionsObject value);

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is
   * false and <code>tooltip.shared</code> is false, the tooltip will be hidden when
   * moving the mouse between series.
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
   * (Highcharts) The width of the funnel compared to the width of the plot
   * area, or the pixel width if it is a number.
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown /* ( number | string ) */ getWidth();

  /**
   * (Highcharts) The width of the funnel compared to the width of the plot
   * area, or the pixel width if it is a number.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts) The width of the funnel compared to the width of the plot
   * area, or the pixel width if it is a number.
   *
   */
  @JSProperty("width")
  void setWidth(@Nullable String value);

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
    private final PlotFunnelOptions object = Any.empty();

    private Builder() {
    }

    public PlotFunnelOptions build() {
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
     * (Highcharts) Initial animation is by default disabled for the funnel
     * chart.
     *
     */
    public Builder animation(boolean value) {
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
     * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
     * the border takes the same color as the slice fill. This can be used
     * together with a <code>borderWidth</code> to fill drawing gaps created by
     * antialiazing artefacts in borderless pies.
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
     * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
     * the border takes the same color as the slice fill. This can be used
     * together with a <code>borderWidth</code> to fill drawing gaps created by
     * antialiazing artefacts in borderless pies.
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
     * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
     * the border takes the same color as the slice fill. This can be used
     * together with a <code>borderWidth</code> to fill drawing gaps created by
     * antialiazing artefacts in borderless pies.
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
     * (Highcharts) The width of the border surrounding each slice.
     *
     * When setting the border width to 0, there may be small gaps between the
     * slices due to SVG antialiasing artefacts. To work around this, keep the
     * border width at 0.5 or 1, but set the <code>borderColor</code> to <code>null</code> instead.
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
     * (Highcharts) The center of the series. By default, it is centered in the
     * middle of the plot area, so it fills the plot area height.
     *
     */
    public Builder center(double... value) {
      object.setCenter(value);
      return this;
    }

    /**
     * (Highcharts) The center of the series. By default, it is centered in the
     * middle of the plot area, so it fills the plot area height.
     *
     */
    public Builder center(String... value) {
      object.setCenter(value);
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
     * (Highcharts) The color of the pie series. A pie series is represented as
     * an empty circle if the total sum of its values is 0. Use this property to
     * define the color of its border.
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
     * (Highcharts) The color of the pie series. A pie series is represented as
     * an empty circle if the total sum of its values is 0. Use this property to
     * define the color of its border.
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
     * (Highcharts) The color of the pie series. A pie series is represented as
     * an empty circle if the total sum of its values is 0. Use this property to
     * define the color of its border.
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
     * (Highcharts) A series specific or series type specific color set to use
     * instead of the global colors.
     *
     */
    public Builder colors(GradientColorObject... value) {
      object.setColors(value);
      return this;
    }

    /**
     * (Highcharts) A series specific or series type specific color set to use
     * instead of the global colors.
     *
     */
    public Builder colors(PatternObject... value) {
      object.setColors(value);
      return this;
    }

    /**
     * (Highcharts) A series specific or series type specific color set to use
     * instead of the global colors.
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
    public Builder dataLabels(SeriesPieDataLabelsOptionsObject... value) {
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
    public Builder dataLabels(@Nullable SeriesPieDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) The thickness of a 3D pie.
     *
     */
    public Builder depth(double value) {
      object.setDepth(value);
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
     * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
     * right. Defaults to <code>startAngle</code> plus 360.
     *
     */
    public Builder endAngle(double value) {
      object.setEndAngle(value);
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
     * (Highcharts) If the total sum of the pie's values is 0, the series is
     * represented as an empty circle . The <code>fillColor</code> option defines the color
     * of that circle. Use pie.borderWidth to set the border thickness.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts) If the total sum of the pie's values is 0, the series is
     * represented as an empty circle . The <code>fillColor</code> option defines the color
     * of that circle. Use pie.borderWidth to set the border thickness.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts) If the total sum of the pie's values is 0, the series is
     * represented as an empty circle . The <code>fillColor</code> option defines the color
     * of that circle. Use pie.borderWidth to set the border thickness.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
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
     * (Highcharts) The height of the funnel or pyramid. If it is a number it
     * defines the pixel height, if it is a percentage string it is the
     * percentage of the plot area height.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts) The height of the funnel or pyramid. If it is a number it
     * defines the pixel height, if it is a percentage string it is the
     * percentage of the plot area height.
     *
     */
    public Builder height(@Nullable String value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
     * whether the series shall be redrawn as if the hidden point were <code>null</code>.
     *
     * The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.
     *
     */
    public Builder ignoreHiddenPoint(boolean value) {
      object.setIgnoreHiddenPoint(value);
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
     * (Highcharts) The minimum size for a pie in response to auto margins. The
     * pie will try to shrink to make room for data labels in side the plot
     * area, but only to this size.
     *
     */
    public Builder minSize(double value) {
      object.setMinSize(value);
      return this;
    }

    /**
     * (Highcharts) The minimum size for a pie in response to auto margins. The
     * pie will try to shrink to make room for data labels in side the plot
     * area, but only to this size.
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
     * (Highcharts) The height of the neck, the lower part of the funnel. A
     * number defines pixel width, a percentage string defines a percentage of
     * the plot area height.
     *
     */
    public Builder neckHeight(double value) {
      object.setNeckHeight(value);
      return this;
    }

    /**
     * (Highcharts) The height of the neck, the lower part of the funnel. A
     * number defines pixel width, a percentage string defines a percentage of
     * the plot area height.
     *
     */
    public Builder neckHeight(@Nullable String value) {
      object.setNeckHeight(value);
      return this;
    }

    /**
     * (Highcharts) The width of the neck, the lower part of the funnel. A
     * number defines pixel width, a percentage string defines a percentage of
     * the plot area width.
     *
     */
    public Builder neckWidth(double value) {
      object.setNeckWidth(value);
      return this;
    }

    /**
     * (Highcharts) The width of the neck, the lower part of the funnel. A
     * number defines pixel width, a percentage string defines a percentage of
     * the plot area width.
     *
     */
    public Builder neckWidth(@Nullable String value) {
      object.setNeckWidth(value);
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
     * (Highcharts) A reversed funnel has the widest area down. A reversed
     * funnel with no neck width and neck height is a pyramid.
     *
     */
    public Builder reversed(boolean value) {
      object.setReversed(value);
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
     * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
     * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
     * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
     * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
     * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
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
     * the legend. Since 2.1, pies are not shown in the legend by default.
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
     * (Highcharts) If a point is sliced, moved out from the center, how many
     * pixels should it be moved?.
     *
     */
    public Builder slicedOffset(double value) {
      object.setSlicedOffset(value);
      return this;
    }

    /**
     * (Highcharts) The start angle of the pie slices in degrees where 0 is top
     * and 90 right.
     *
     */
    public Builder startAngle(double value) {
      object.setStartAngle(value);
      return this;
    }

    /**
     * (Highcharts) Options for the series states.
     *
     */
    public Builder states(@Nullable SeriesStatesOptionsObject value) {
      object.setStates(value);
      return this;
    }

    /**
     * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
     * event on a series isn't triggered until the mouse moves over another
     * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
     * series is triggered when the mouse leaves the area around the series'
     * graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is
     * false and <code>tooltip.shared</code> is false, the tooltip will be hidden when
     * moving the mouse between series.
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
     * (Highcharts) The width of the funnel compared to the width of the plot
     * area, or the pixel width if it is a number.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts) The width of the funnel compared to the width of the plot
     * area, or the pixel width if it is a number.
     *
     */
    public Builder width(@Nullable String value) {
      object.setWidth(value);
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
