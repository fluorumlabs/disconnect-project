package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AxisCurrentDateIndicatorOptions ) */;
import js.lang.Unknown /* ( number | string | null ) */;
import js.lang.Unknown /* ColorType */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
 * color axis will appear as a gradient or as separate items inside the legend,
 * depending on whether the axis is scalar or based on data classes.
 *
 * For supported color formats, see the docs article about colors.
 *
 * A scalar color axis is represented by a gradient. The colors either range
 * between the minColor and the maxColor, or for more fine grained control the
 * colors can be defined in stops. Often times, the color axis needs to be
 * adjusted to get the right color spread for the data. In addition to stops,
 * consider using a logarithmic axis type, or setting min and max to avoid the
 * colors being determined by outliers.
 *
 * When dataClasses are used, the ranges are subdivided into separate classes
 * like categories based on their values. This can be used for ranges between
 * two values, but also for a true category. However, when your data is
 * categorized, it may be as convenient to add each category to a separate
 * series.
 *
 * Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
 * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series types.
 *
 * Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.
 *
 * See the Axis object for programmatic access to the axis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ColorAxisOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
   * Requires the accessibility module.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  AxisAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
   * Requires the accessibility module.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable AxisAccessibilityOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
   * axis.
   *
   */
  @JSProperty("allowDecimals")
  boolean getAllowDecimals();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
   * axis.
   *
   */
  @JSProperty("allowDecimals")
  void setAllowDecimals(boolean value);

  /**
   * (Highcharts) In a polar chart, this is the angle of the Y axis in
   * degrees, where 0 is up and 90 is right. The angle determines the position
   * of the axis line and the labels, though the coordinate system is
   * unaffected. Since v8.0.0 this option is also applicable for X axis
   * (inverted polar).
   *
   */
  @JSProperty("angle")
  double getAngle();

  /**
   * (Highcharts) In a polar chart, this is the angle of the Y axis in
   * degrees, where 0 is up and 90 is right. The angle determines the position
   * of the axis line and the labels, though the coordinate system is
   * unaffected. Since v8.0.0 this option is also applicable for X axis
   * (inverted polar).
   *
   */
  @JSProperty("angle")
  void setAngle(double value);

  /**
   * (Highcharts, Highstock, Gantt) The highest allowed value for
   * automatically computed axis extremes.
   *
   */
  @JSProperty("ceiling")
  double getCeiling();

  /**
   * (Highcharts, Highstock, Gantt) The highest allowed value for
   * automatically computed axis extremes.
   *
   */
  @JSProperty("ceiling")
  void setCeiling(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
   * axis by CSS, especially in Highcharts styled mode. The class name is
   * applied to group elements for the grid, axis elements and labels.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
   * axis by CSS, especially in Highcharts styled mode. The class name is
   * applied to group elements for the grid, axis elements and labels.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   */
  @JSProperty("currentDateIndicator")
  @Nullable
  Unknown /* ( boolean | AxisCurrentDateIndicatorOptions ) */ getCurrentDateIndicator();

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(boolean value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(@Nullable AxisCurrentDateIndicatorOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
   * color if no individual color is set. The default value, <code>tween</code>, computes
   * intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible
   * value, <code>category</code>, pulls colors from the global or chart specific colors
   * array.
   *
   */
  @JSProperty("dataClassColor")
  @Nullable
  DataClassColor getDataClassColor();

  /**
   * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
   * color if no individual color is set. The default value, <code>tween</code>, computes
   * intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible
   * value, <code>category</code>, pulls colors from the global or chart specific colors
   * array.
   *
   */
  @JSProperty("dataClassColor")
  void setDataClassColor(@Nullable DataClassColor value);

  /**
   * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
   * the choropleth map. If none given, the color axis is scalar and values
   * are distributed as a gradient between the minimum and maximum colors.
   *
   */
  @JSProperty("dataClasses")
  @Nullable
  ColorAxisDataClassesOptions[] getDataClasses();

  /**
   * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
   * the choropleth map. If none given, the color axis is scalar and values
   * are distributed as a gradient between the minimum and maximum colors.
   *
   */
  @JSProperty("dataClasses")
  void setDataClasses(ColorAxisDataClassesOptions... value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
   * tick. Use this option with the maxPadding option to control the axis end.
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
   * tick. Use this option with the maxPadding option to control the axis end.
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
   *
   */
  @JSProperty("events")
  @Nullable
  ColorAxisEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ColorAxisEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   */
  @JSProperty("floor")
  double getFloor();

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   */
  @JSProperty("grid")
  @Nullable
  ColorAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   */
  @JSProperty("grid")
  void setGrid(@Nullable ColorAxisGridOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
   * the axis across the gradient.
   *
   */
  @JSProperty("gridLineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getGridLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
   * the axis across the gradient.
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
   * the axis across the gradient.
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
   * the axis across the gradient.
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
   * lines. For possible values, see this demonstration.
   *
   */
  @JSProperty("gridLineDashStyle")
  @Nullable
  GridLineDashStyle getGridLineDashStyle();

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
   * lines. For possible values, see this demonstration.
   *
   */
  @JSProperty("gridLineDashStyle")
  void setGridLineDashStyle(@Nullable GridLineDashStyle value);

  /**
   * (Highcharts) Polar charts only. Whether the grid lines should draw as a
   * polygon with straight lines between categories, or as circles. Can be
   * either <code>circle</code> or <code>polygon</code>. Since v8.0.0 this option is also applicable
   * for X axis (inverted polar).
   *
   */
  @JSProperty("gridLineInterpolation")
  @Nullable
  GridLineInterpolation getGridLineInterpolation();

  /**
   * (Highcharts) Polar charts only. Whether the grid lines should draw as a
   * polygon with straight lines between categories, or as circles. Can be
   * either <code>circle</code> or <code>polygon</code>. Since v8.0.0 this option is also applicable
   * for X axis (inverted polar).
   *
   */
  @JSProperty("gridLineInterpolation")
  void setGridLineInterpolation(@Nullable GridLineInterpolation value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
   * from the axis across the gradient of a scalar color axis.
   *
   */
  @JSProperty("gridLineWidth")
  double getGridLineWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
   * from the axis across the gradient of a scalar color axis.
   *
   */
  @JSProperty("gridLineWidth")
  void setGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   */
  @JSProperty("gridZIndex")
  void setGridZIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
   * after render time to get a pointer to the axis object through
   * <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
   * after render time to get a pointer to the axis object through
   * <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The axis labels show the number for
   * each tick.
   *
   * For more live examples on label options, see xAxis.labels in the
   * Highcharts API.
   *
   */
  @JSProperty("labels")
  @Nullable
  ColorAxisLabelsOptions getLabels();

  /**
   * (Highcharts, Highstock, Highmaps) The axis labels show the number for
   * each tick.
   *
   * For more live examples on label options, see xAxis.labels in the
   * Highcharts API.
   *
   */
  @JSProperty("labels")
  void setLabels(@Nullable ColorAxisLabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
   * <code>'horizontal'</code> or <code>'vertical'</code>. If none given, the color axis has the
   * same layout as the legend.
   *
   */
  @JSProperty("layout")
  @Nullable
  String getLayout();

  /**
   * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
   * <code>'horizontal'</code> or <code>'vertical'</code>. If none given, the color axis has the
   * same layout as the legend.
   *
   */
  @JSProperty("layout")
  void setLayout(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Unknown /* ColorType */ getLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
   * side of the chart, the pixel margin between the axes. Defaults to 0 on
   * vertical axes, 15 on horizontal axes.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
   * side of the chart, the pixel margin between the axes. Defaults to 0 on
   * vertical axes, 15 on horizontal axes.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
   * axis that points to the value of the hovered area. To disable the marker,
   * set <code>marker: null</code>.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
   * axis that points to the value of the hovered area. To disable the marker,
   * set <code>marker: null</code>.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
   * of map point values. If <code>null</code>, the max value is automatically
   * calculated. If the <code>endOnTick</code> option is true, the max value might be
   * rounded up.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
   * of map point values. If <code>null</code>, the max value is automatically
   * calculated. If the <code>endOnTick</code> option is true, the max value might be
   * rounded up.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
   * the color axis. Unless dataClasses or stops are set, the gradient ends at
   * this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("maxColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getMaxColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
   * the color axis. Unless dataClasses or stops are set, the gradient ends at
   * this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("maxColor")
  void setMaxColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
   * the color axis. Unless dataClasses or stops are set, the gradient ends at
   * this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("maxColor")
  void setMaxColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
   * the color axis. Unless dataClasses or stops are set, the gradient ends at
   * this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("maxColor")
  void setMaxColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
   * the length of the axis. A padding of 0.05 will make a 100px axis 5px
   * longer.
   *
   */
  @JSProperty("maxPadding")
  double getMaxPadding();

  /**
   * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
   * the length of the axis. A padding of 0.05 will make a 100px axis 5px
   * longer.
   *
   */
  @JSProperty("maxPadding")
  void setMaxPadding(double value);

  /**
   * (Highstock, Gantt) Maximum range which can be set using the navigator's
   * handles. Opposite of xAxis.minRange.
   *
   */
  @JSProperty("maxRange")
  double getMaxRange();

  /**
   * (Highstock, Gantt) Maximum range which can be set using the navigator's
   * handles. Opposite of xAxis.minRange.
   *
   */
  @JSProperty("maxRange")
  void setMaxRange(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
   * of map point values. If <code>null</code>, the min value is automatically
   * calculated. If the <code>startOnTick</code> option is true, the min value might be
   * rounded down.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
   * of map point values. If <code>null</code>, the min value is automatically
   * calculated. If the <code>startOnTick</code> option is true, the min value might be
   * rounded down.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
   * the color axis. Unless dataClasses or stops are set, the gradient starts
   * at this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("minColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getMinColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
   * the color axis. Unless dataClasses or stops are set, the gradient starts
   * at this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("minColor")
  void setMinColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
   * the color axis. Unless dataClasses or stops are set, the gradient starts
   * at this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("minColor")
  void setMinColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
   * the color axis. Unless dataClasses or stops are set, the gradient starts
   * at this value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   */
  @JSProperty("minColor")
  void setMinColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  @Nullable
  Unknown /* ColorType */ getMinorGridLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
   * lines. For possible values, see this demonstration.
   *
   */
  @JSProperty("minorGridLineDashStyle")
  @Nullable
  MinorGridLineDashStyle getMinorGridLineDashStyle();

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
   * lines. For possible values, see this demonstration.
   *
   */
  @JSProperty("minorGridLineDashStyle")
  void setMinorGridLineDashStyle(@Nullable MinorGridLineDashStyle value);

  /**
   * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   */
  @JSProperty("minorGridLineWidth")
  double getMinorGridLineWidth();

  /**
   * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  Unknown /* ColorType */ getMinorTickColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
   * for the minor ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick
   * interval is calculated as a fifth of the tickInterval. If <code>null</code> or
   * <code>undefined</code>, minor ticks are not shown.
   *
   * On logarithmic axes, the unit is the power of the value. For example,
   * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
   * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
   * and 10, 10 and 100 etc.
   *
   * If user settings dictate minor ticks to become too dense, they don't make
   * sense, and will be ignored to prevent performance problems.
   *
   */
  @JSProperty("minorTickInterval")
  @Nullable
  Unknown /* ( number | string | null ) */ getMinorTickInterval();

  /**
   * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
   * for the minor ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick
   * interval is calculated as a fifth of the tickInterval. If <code>null</code> or
   * <code>undefined</code>, minor ticks are not shown.
   *
   * On logarithmic axes, the unit is the power of the value. For example,
   * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
   * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
   * and 10, 10 and 100 etc.
   *
   * If user settings dictate minor ticks to become too dense, they don't make
   * sense, and will be ignored to prevent performance problems.
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
   * for the minor ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick
   * interval is calculated as a fifth of the tickInterval. If <code>null</code> or
   * <code>undefined</code>, minor ticks are not shown.
   *
   * On logarithmic axes, the unit is the power of the value. For example,
   * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
   * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
   * and 10, 10 and 100 etc.
   *
   * If user settings dictate minor ticks to become too dense, they don't make
   * sense, and will be ignored to prevent performance problems.
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
   * marks.
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
   * marks.
   *
   */
  @JSProperty("minorTickLength")
  void setMinorTickLength(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("minorTickPosition")
  @Nullable
  MinorTickPosition getMinorTickPosition();

  /**
   * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("minorTickPosition")
  void setMinorTickPosition(@Nullable MinorTickPosition value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable minor ticks. Unless
   * minorTickInterval is set, the tick interval is calculated as a fifth of
   * the <code>tickInterval</code>.
   *
   * On a logarithmic axis, minor ticks are laid out based on a best guess,
   * attempting to enter approximately 5 minor ticks between each major tick.
   *
   * Prior to v6.0.0, ticks were unabled in auto layout by setting
   * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
   *
   */
  @JSProperty("minorTicks")
  boolean getMinorTicks();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable minor ticks. Unless
   * minorTickInterval is set, the tick interval is calculated as a fifth of
   * the <code>tickInterval</code>.
   *
   * On a logarithmic axis, minor ticks are laid out based on a best guess,
   * attempting to enter approximately 5 minor ticks between each major tick.
   *
   * Prior to v6.0.0, ticks were unabled in auto layout by setting
   * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
   *
   */
  @JSProperty("minorTickWidth")
  void setMinorTickWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
   * the length of the axis. A padding of 0.05 will make a 100px axis 5px
   * longer.
   *
   */
  @JSProperty("minPadding")
  double getMinPadding();

  /**
   * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
   * the length of the axis. A padding of 0.05 will make a 100px axis 5px
   * longer.
   *
   */
  @JSProperty("minPadding")
  void setMinPadding(double value);

  /**
   * (Highstock) In an ordinal axis, the points are equally spaced in the
   * chart regardless of the actual time or x distance between them. This
   * means that missing data periods (e.g. nights or weekends for a stock
   * chart) will not take up space in the chart. Having <code>ordinal: false</code> will
   * show any gaps created by the <code>gapSize</code> setting proportionate to their
   * duration.
   *
   * In stock charts the X axis is ordinal by default, unless the boost module
   * is used and at least one of the series' data length exceeds the
   * boostThreshold.
   *
   */
  @JSProperty("ordinal")
  boolean getOrdinal();

  /**
   * (Highstock) In an ordinal axis, the points are equally spaced in the
   * chart regardless of the actual time or x distance between them. This
   * means that missing data periods (e.g. nights or weekends for a stock
   * chart) will not take up space in the chart. Having <code>ordinal: false</code> will
   * show any gaps created by the <code>gapSize</code> setting proportionate to their
   * duration.
   *
   * In stock charts the X axis is ordinal by default, unless the boost module
   * is used and at least one of the series' data length exceeds the
   * boostThreshold.
   *
   */
  @JSProperty("ordinal")
  void setOrdinal(boolean value);

  /**
   * (Highstock) Additional range on the right side of the xAxis. Works
   * similar to <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be
   * set for both main <code>xAxis</code> and the navigator's <code>xAxis</code>.
   *
   */
  @JSProperty("overscroll")
  double getOverscroll();

  /**
   * (Highstock) Additional range on the right side of the xAxis. Works
   * similar to <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be
   * set for both main <code>xAxis</code> and the navigator's <code>xAxis</code>.
   *
   */
  @JSProperty("overscroll")
  void setOverscroll(double value);

  /**
   * (Highstock) The zoomed range to display when only defining one or none of
   * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
   * month can be set.
   *
   */
  @JSProperty("range")
  double getRange();

  /**
   * (Highstock) The zoomed range to display when only defining one or none of
   * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
   * month can be set.
   *
   */
  @JSProperty("range")
  void setRange(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
   * highest number is closest to the origin. Defaults to <code>false</code> in a
   * horizontal legend and <code>true</code> in a vertical legend, where the smallest
   * value starts on top.
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
   * highest number is closest to the origin. Defaults to <code>false</code> in a
   * horizontal legend and <code>true</code> in a vertical legend, where the smallest
   * value starts on top.
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highstock) An optional scrollbar to display on the X axis in response to
   * limiting the minimum and maximum of the axis values.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   */
  @JSProperty("scrollbar")
  @Nullable
  ColorAxisScrollbarOptions getScrollbar();

  /**
   * (Highstock) An optional scrollbar to display on the X axis in response to
   * limiting the minimum and maximum of the axis values.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   */
  @JSProperty("scrollbar")
  void setScrollbar(@Nullable ColorAxisScrollbarOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
   *
   */
  @JSProperty("showFirstLabel")
  void setShowFirstLabel(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
   * legend.
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
   * legend.
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
   * Defaults to <code>true</code> on cartesian charts, and <code>false</code> on polar charts.
   *
   */
  @JSProperty("showLastLabel")
  boolean getShowLastLabel();

  /**
   * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
   * Defaults to <code>true</code> on cartesian charts, and <code>false</code> on polar charts.
   *
   */
  @JSProperty("showLastLabel")
  void setShowLastLabel(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
   * data maximum is less than this, the axis will stay at this maximum, but
   * if the series data maximum is higher, the axis will flex to show all
   * data.
   *
   */
  @JSProperty("softMax")
  double getSoftMax();

  /**
   * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
   * data maximum is less than this, the axis will stay at this maximum, but
   * if the series data maximum is higher, the axis will flex to show all
   * data.
   *
   */
  @JSProperty("softMax")
  void setSoftMax(double value);

  /**
   * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
   * data minimum is greater than this, the axis will stay at this minimum,
   * but if the series data minimum is lower, the axis will flex to show all
   * data.
   *
   */
  @JSProperty("softMin")
  double getSoftMin();

  /**
   * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
   * data minimum is greater than this, the axis will stay at this minimum,
   * but if the series data minimum is lower, the axis will flex to show all
   * data.
   *
   */
  @JSProperty("softMin")
  void setSoftMin(double value);

  /**
   * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
   * put the tick between weeks. 0 = Sunday, 1 = Monday.
   *
   */
  @JSProperty("startOfWeek")
  double getStartOfWeek();

  /**
   * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
   * put the tick between weeks. 0 = Sunday, 1 = Monday.
   *
   */
  @JSProperty("startOfWeek")
  void setStartOfWeek(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * start.
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * start.
   *
   */
  @JSProperty("startOnTick")
  void setStartOnTick(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
   * scalar color axis. Use this in cases where a linear gradient between a
   * <code>minColor</code> and <code>maxColor</code> is not sufficient. The stops is an array of
   * tuples, where the first item is a float between 0 and 1 assigning the
   * relative position in the gradient, and the second item is the color.
   *
   */
  @JSProperty("stops")
  @Nullable
  Stops2[] getStops();

  /**
   * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
   * scalar color axis. Use this in cases where a linear gradient between a
   * <code>minColor</code> and <code>maxColor</code> is not sufficient. The stops is an array of
   * tuples, where the first item is a float between 0 and 1 assigning the
   * relative position in the gradient, and the second item is the color.
   *
   */
  @JSProperty("stops")
  void setStops(Stops2... value);

  /**
   * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
   * This opens up for aligning the ticks of multiple charts or panes within a
   * chart. This option overrides the <code>tickPixelInterval</code> option.
   *
   * This option only has an effect on linear axes. Datetime, logarithmic or
   * category axes are not affected.
   *
   */
  @JSProperty("tickAmount")
  double getTickAmount();

  /**
   * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
   * This opens up for aligning the ticks of multiple charts or panes within a
   * chart. This option overrides the <code>tickPixelInterval</code> option.
   *
   * This option only has an effect on linear axes. Datetime, logarithmic or
   * category axes are not affected.
   *
   */
  @JSProperty("tickAmount")
  void setTickAmount(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  @Nullable
  Unknown /* ColorType */ getTickColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  void setTickColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  void setTickColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  void setTickColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
   * units. When <code>null</code>, the tick interval is computed to approximately follow
   * the <code>tickPixelInterval</code>.
   *
   */
  @JSProperty("tickInterval")
  double getTickInterval();

  /**
   * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
   * units. When <code>null</code>, the tick interval is computed to approximately follow
   * the <code>tickPixelInterval</code>.
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
   * on the color axis.
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
   * on the color axis.
   *
   */
  @JSProperty("tickLength")
  void setTickLength(double value);

  /**
   * (Highcharts, Gantt) For categorized axes only. If <code>on</code> the tick mark is
   * placed in the center of the category, if <code>between</code> the tick mark is
   * placed between categories. The default is <code>between</code> if the <code>tickInterval</code>
   * is 1, else <code>on</code>.
   *
   */
  @JSProperty("tickmarkPlacement")
  @Nullable
  TickmarkPlacement getTickmarkPlacement();

  /**
   * (Highcharts, Gantt) For categorized axes only. If <code>on</code> the tick mark is
   * placed in the center of the category, if <code>between</code> the tick mark is
   * placed between categories. The default is <code>between</code> if the <code>tickInterval</code>
   * is 1, else <code>on</code>.
   *
   */
  @JSProperty("tickmarkPlacement")
  void setTickmarkPlacement(@Nullable TickmarkPlacement value);

  /**
   * (Highcharts, Highstock, Highmaps) If tickInterval is <code>null</code> this option
   * sets the approximate pixel interval of the tick marks.
   *
   */
  @JSProperty("tickPixelInterval")
  double getTickPixelInterval();

  /**
   * (Highcharts, Highstock, Highmaps) If tickInterval is <code>null</code> this option
   * sets the approximate pixel interval of the tick marks.
   *
   */
  @JSProperty("tickPixelInterval")
  void setTickPixelInterval(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The position of the major tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("tickPosition")
  @Nullable
  TickPosition getTickPosition();

  /**
   * (Highcharts, Highstock, Highmaps) The position of the major tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("tickPosition")
  void setTickPosition(@Nullable TickPosition value);

  /**
   * (Highcharts, Highstock, Highmaps) A callback function returning array
   * defining where the ticks are laid out on the axis. This overrides the
   * default behaviour of tickPixelInterval and tickInterval. The automatic
   * tick positions are accessible through <code>this.tickPositions</code> and can be
   * modified by the callback.
   *
   */
  @JSProperty("tickPositioner")
  @Nullable
  AxisTickPositionerCallbackFunction getTickPositioner();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function returning array
   * defining where the ticks are laid out on the axis. This overrides the
   * default behaviour of tickPixelInterval and tickInterval. The automatic
   * tick positions are accessible through <code>this.tickPositions</code> and can be
   * modified by the callback.
   *
   */
  @JSProperty("tickPositioner")
  void setTickPositioner(@Nullable AxisTickPositionerCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
   * laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval.
   *
   */
  @JSProperty("tickPositions")
  @Nullable
  double[] getTickPositions();

  /**
   * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
   * laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval.
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double... value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
   * marks. Defaults to 0 on category axes, otherwise 1.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class, but in order for the element to be generated on category axes, the
   * option must be explicitly set to 1.
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
   * marks. Defaults to 0 on category axes, otherwise 1.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class, but in order for the element to be generated on category axes, the
   * option must be explicitly set to 1.
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
   * the color axis. Can be <code>linear</code> or <code>logarithmic</code>.
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
   * the color axis. Can be <code>linear</code> or <code>logarithmic</code>.
   *
   */
  @JSProperty("type")
  void setType(@Nullable Type value);

  /**
   * (Highcharts, Gantt) Applies only when the axis <code>type</code> is <code>category</code>. When
   * <code>uniqueNames</code> is true, points are placed on the X axis according to their
   * names. If the same point name is repeated in the same or another series,
   * the point is placed on the same X position as other points of the same
   * name. When <code>uniqueNames</code> is false, the points are laid out in increasing
   * X positions regardless of their names, and the X axis category will take
   * the name of the last point in each position.
   *
   */
  @JSProperty("uniqueNames")
  boolean getUniqueNames();

  /**
   * (Highcharts, Gantt) Applies only when the axis <code>type</code> is <code>category</code>. When
   * <code>uniqueNames</code> is true, points are placed on the X axis according to their
   * names. If the same point name is repeated in the same or another series,
   * the point is placed on the same X position as other points of the same
   * name. When <code>uniqueNames</code> is false, the points are laid out in increasing
   * X positions regardless of their names, and the X axis category will take
   * the name of the last point in each position.
   *
   */
  @JSProperty("uniqueNames")
  void setUniqueNames(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
   * what time intervals the ticks are allowed to fall on. Each array item is
   * an array where the first value is the time unit and the second value
   * another array of allowed multiples.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("units")
  @Nullable
  Units2[] getUnits();

  /**
   * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
   * what time intervals the ticks are allowed to fall on. Each array item is
   * an array where the first value is the time unit and the second value
   * another array of allowed multiples.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("units")
  void setUnits(Units2... value);

  /**
   * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
   * ticks and labels, should be visible.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
   * ticks and labels, should be visible.
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  static Builder builder() {
    return new Builder();
  }

  abstract class DataClassColor extends JsEnum {
    public static final DataClassColor CATEGORY = JsEnum.of("category");

    public static final DataClassColor TWEEN = JsEnum.of("tween");
  }

  interface Stops2 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    double getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(double value);

    @JSBody(
        script = "return this[1]"
    )
    String getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(String value);

    static Stops2.Builder builder() {
      return new Stops2.Builder();
    }

    final class Builder {
      private final Stops2 object = Any.empty();

      private Builder() {
      }

      public Stops2 build() {
        return object;
      }

      public Stops2.Builder value0(double value) {
        object.setValue0(value);
        return this;
      }

      public Stops2.Builder value1(String value) {
        object.setValue1(value);
        return this;
      }
    }
  }

  abstract class Type extends JsEnum {
    public static final Type LINEAR = JsEnum.of("linear");

    public static final Type LOGARITHMIC = JsEnum.of("logarithmic");
  }

  final class Builder {
    private final ColorAxisOptions object = Any.empty();

    private Builder() {
    }

    public ColorAxisOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
     * Requires the accessibility module.
     *
     */
    public Builder accessibility(@Nullable AxisAccessibilityOptionsObject value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
     * axis.
     *
     */
    public Builder allowDecimals(boolean value) {
      object.setAllowDecimals(value);
      return this;
    }

    /**
     * (Highcharts) In a polar chart, this is the angle of the Y axis in
     * degrees, where 0 is up and 90 is right. The angle determines the position
     * of the axis line and the labels, though the coordinate system is
     * unaffected. Since v8.0.0 this option is also applicable for X axis
     * (inverted polar).
     *
     */
    public Builder angle(double value) {
      object.setAngle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The highest allowed value for
     * automatically computed axis extremes.
     *
     */
    public Builder ceiling(double value) {
      object.setCeiling(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
     * axis by CSS, especially in Highcharts styled mode. The class name is
     * applied to group elements for the grid, axis elements and labels.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Gantt) Show an indicator on the axis for the current date and time. Can
     * be a boolean or a configuration object similar to xAxis.plotLines.
     *
     */
    public Builder currentDateIndicator(boolean value) {
      object.setCurrentDateIndicator(value);
      return this;
    }

    /**
     * (Gantt) Show an indicator on the axis for the current date and time. Can
     * be a boolean or a configuration object similar to xAxis.plotLines.
     *
     */
    public Builder currentDateIndicator(@Nullable AxisCurrentDateIndicatorOptions value) {
      object.setCurrentDateIndicator(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
     * color if no individual color is set. The default value, <code>tween</code>, computes
     * intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible
     * value, <code>category</code>, pulls colors from the global or chart specific colors
     * array.
     *
     */
    public Builder dataClassColor(@Nullable DataClassColor value) {
      object.setDataClassColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
     * the choropleth map. If none given, the color axis is scalar and values
     * are distributed as a gradient between the minimum and maximum colors.
     *
     */
    public Builder dataClasses(ColorAxisDataClassesOptions... value) {
      object.setDataClasses(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
     * tick. Use this option with the maxPadding option to control the axis end.
     *
     */
    public Builder endOnTick(boolean value) {
      object.setEndOnTick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
     *
     */
    public Builder events(@Nullable ColorAxisEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
     * computed axis extremes.
     *
     */
    public Builder floor(double value) {
      object.setFloor(value);
      return this;
    }

    /**
     * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
     *
     */
    public Builder grid(@Nullable ColorAxisGridOptions value) {
      object.setGrid(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
     * the axis across the gradient.
     *
     */
    public Builder gridLineColor(@Nullable PatternObject value) {
      object.setGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
     * the axis across the gradient.
     *
     */
    public Builder gridLineColor(@Nullable String value) {
      object.setGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
     * the axis across the gradient.
     *
     */
    public Builder gridLineColor(@Nullable GradientColorObject value) {
      object.setGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
     * lines. For possible values, see this demonstration.
     *
     */
    public Builder gridLineDashStyle(@Nullable GridLineDashStyle value) {
      object.setGridLineDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) Polar charts only. Whether the grid lines should draw as a
     * polygon with straight lines between categories, or as circles. Can be
     * either <code>circle</code> or <code>polygon</code>. Since v8.0.0 this option is also applicable
     * for X axis (inverted polar).
     *
     */
    public Builder gridLineInterpolation(@Nullable GridLineInterpolation value) {
      object.setGridLineInterpolation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
     * from the axis across the gradient of a scalar color axis.
     *
     */
    public Builder gridLineWidth(double value) {
      object.setGridLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
     *
     */
    public Builder gridZIndex(double value) {
      object.setGridZIndex(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
     * after render time to get a pointer to the axis object through
     * <code>chart.get()</code>.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The axis labels show the number for
     * each tick.
     *
     * For more live examples on label options, see xAxis.labels in the
     * Highcharts API.
     *
     */
    public Builder labels(@Nullable ColorAxisLabelsOptions value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
     * <code>'horizontal'</code> or <code>'vertical'</code>. If none given, the color axis has the
     * same layout as the legend.
     *
     */
    public Builder layout(@Nullable String value) {
      object.setLayout(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
     * itself.
     *
     * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
     * or <code>.highcharts-xaxis-line</code> class.
     *
     */
    public Builder lineColor(@Nullable PatternObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
     * itself.
     *
     * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
     * or <code>.highcharts-xaxis-line</code> class.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
     * itself.
     *
     * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
     * or <code>.highcharts-xaxis-line</code> class.
     *
     */
    public Builder lineColor(@Nullable GradientColorObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
     * side of the chart, the pixel margin between the axes. Defaults to 0 on
     * vertical axes, 15 on horizontal axes.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
     * axis that points to the value of the hovered area. To disable the marker,
     * set <code>marker: null</code>.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
     * of map point values. If <code>null</code>, the max value is automatically
     * calculated. If the <code>endOnTick</code> option is true, the max value might be
     * rounded up.
     *
     */
    public Builder max(double value) {
      object.setMax(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
     * the color axis. Unless dataClasses or stops are set, the gradient ends at
     * this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     *
     */
    public Builder maxColor(@Nullable PatternObject value) {
      object.setMaxColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
     * the color axis. Unless dataClasses or stops are set, the gradient ends at
     * this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     *
     */
    public Builder maxColor(@Nullable String value) {
      object.setMaxColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
     * the color axis. Unless dataClasses or stops are set, the gradient ends at
     * this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     *
     */
    public Builder maxColor(@Nullable GradientColorObject value) {
      object.setMaxColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
     * the length of the axis. A padding of 0.05 will make a 100px axis 5px
     * longer.
     *
     */
    public Builder maxPadding(double value) {
      object.setMaxPadding(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Maximum range which can be set using the navigator's
     * handles. Opposite of xAxis.minRange.
     *
     */
    public Builder maxRange(double value) {
      object.setMaxRange(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
     * of map point values. If <code>null</code>, the min value is automatically
     * calculated. If the <code>startOnTick</code> option is true, the min value might be
     * rounded down.
     *
     */
    public Builder min(double value) {
      object.setMin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
     * the color axis. Unless dataClasses or stops are set, the gradient starts
     * at this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     *
     */
    public Builder minColor(@Nullable PatternObject value) {
      object.setMinColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
     * the color axis. Unless dataClasses or stops are set, the gradient starts
     * at this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     *
     */
    public Builder minColor(@Nullable String value) {
      object.setMinColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
     * the color axis. Unless dataClasses or stops are set, the gradient starts
     * at this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     *
     */
    public Builder minColor(@Nullable GradientColorObject value) {
      object.setMinColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
     * lines.
     *
     * In styled mode, the stroke width is given in the
     * <code>.highcharts-minor-grid-line</code> class.
     *
     */
    public Builder minorGridLineColor(@Nullable PatternObject value) {
      object.setMinorGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
     * lines.
     *
     * In styled mode, the stroke width is given in the
     * <code>.highcharts-minor-grid-line</code> class.
     *
     */
    public Builder minorGridLineColor(@Nullable String value) {
      object.setMinorGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
     * lines.
     *
     * In styled mode, the stroke width is given in the
     * <code>.highcharts-minor-grid-line</code> class.
     *
     */
    public Builder minorGridLineColor(@Nullable GradientColorObject value) {
      object.setMinorGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
     * lines. For possible values, see this demonstration.
     *
     */
    public Builder minorGridLineDashStyle(@Nullable MinorGridLineDashStyle value) {
      object.setMinorGridLineDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
     * lines.
     *
     * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
     * class.
     *
     */
    public Builder minorGridLineWidth(double value) {
      object.setMinorGridLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
     *
     */
    public Builder minorTickColor(@Nullable PatternObject value) {
      object.setMinorTickColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
     *
     */
    public Builder minorTickColor(@Nullable String value) {
      object.setMinorTickColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
     *
     */
    public Builder minorTickColor(@Nullable GradientColorObject value) {
      object.setMinorTickColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
     * for the minor ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick
     * interval is calculated as a fifth of the tickInterval. If <code>null</code> or
     * <code>undefined</code>, minor ticks are not shown.
     *
     * On logarithmic axes, the unit is the power of the value. For example,
     * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
     * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
     * and 10, 10 and 100 etc.
     *
     * If user settings dictate minor ticks to become too dense, they don't make
     * sense, and will be ignored to prevent performance problems.
     *
     */
    public Builder minorTickInterval(double value) {
      object.setMinorTickInterval(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
     * for the minor ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick
     * interval is calculated as a fifth of the tickInterval. If <code>null</code> or
     * <code>undefined</code>, minor ticks are not shown.
     *
     * On logarithmic axes, the unit is the power of the value. For example,
     * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
     * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
     * and 10, 10 and 100 etc.
     *
     * If user settings dictate minor ticks to become too dense, they don't make
     * sense, and will be ignored to prevent performance problems.
     *
     */
    public Builder minorTickInterval(@Nullable String value) {
      object.setMinorTickInterval(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
     * marks.
     *
     */
    public Builder minorTickLength(double value) {
      object.setMinorTickLength(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
     * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     *
     */
    public Builder minorTickPosition(@Nullable MinorTickPosition value) {
      object.setMinorTickPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Enable or disable minor ticks. Unless
     * minorTickInterval is set, the tick interval is calculated as a fifth of
     * the <code>tickInterval</code>.
     *
     * On a logarithmic axis, minor ticks are laid out based on a best guess,
     * attempting to enter approximately 5 minor ticks between each major tick.
     *
     * Prior to v6.0.0, ticks were unabled in auto layout by setting
     * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
     *
     */
    public Builder minorTicks(boolean value) {
      object.setMinorTicks(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
     *
     */
    public Builder minorTickWidth(double value) {
      object.setMinorTickWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
     * the length of the axis. A padding of 0.05 will make a 100px axis 5px
     * longer.
     *
     */
    public Builder minPadding(double value) {
      object.setMinPadding(value);
      return this;
    }

    /**
     * (Highstock) In an ordinal axis, the points are equally spaced in the
     * chart regardless of the actual time or x distance between them. This
     * means that missing data periods (e.g. nights or weekends for a stock
     * chart) will not take up space in the chart. Having <code>ordinal: false</code> will
     * show any gaps created by the <code>gapSize</code> setting proportionate to their
     * duration.
     *
     * In stock charts the X axis is ordinal by default, unless the boost module
     * is used and at least one of the series' data length exceeds the
     * boostThreshold.
     *
     */
    public Builder ordinal(boolean value) {
      object.setOrdinal(value);
      return this;
    }

    /**
     * (Highstock) Additional range on the right side of the xAxis. Works
     * similar to <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be
     * set for both main <code>xAxis</code> and the navigator's <code>xAxis</code>.
     *
     */
    public Builder overscroll(double value) {
      object.setOverscroll(value);
      return this;
    }

    /**
     * (Highstock) The zoomed range to display when only defining one or none of
     * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
     * month can be set.
     *
     */
    public Builder range(double value) {
      object.setRange(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
     * highest number is closest to the origin. Defaults to <code>false</code> in a
     * horizontal legend and <code>true</code> in a vertical legend, where the smallest
     * value starts on top.
     *
     */
    public Builder reversed(boolean value) {
      object.setReversed(value);
      return this;
    }

    /**
     * (Highstock) An optional scrollbar to display on the X axis in response to
     * limiting the minimum and maximum of the axis values.
     *
     * In styled mode, all the presentational options for the scrollbar are
     * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
     * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
     * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
     *
     */
    public Builder scrollbar(@Nullable ColorAxisScrollbarOptions value) {
      object.setScrollbar(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
     *
     */
    public Builder showFirstLabel(boolean value) {
      object.setShowFirstLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
     * legend.
     *
     */
    public Builder showInLegend(boolean value) {
      object.setShowInLegend(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
     * Defaults to <code>true</code> on cartesian charts, and <code>false</code> on polar charts.
     *
     */
    public Builder showLastLabel(boolean value) {
      object.setShowLastLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
     * data maximum is less than this, the axis will stay at this maximum, but
     * if the series data maximum is higher, the axis will flex to show all
     * data.
     *
     */
    public Builder softMax(double value) {
      object.setSoftMax(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
     * data minimum is greater than this, the axis will stay at this minimum,
     * but if the series data minimum is lower, the axis will flex to show all
     * data.
     *
     */
    public Builder softMin(double value) {
      object.setSoftMin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
     * put the tick between weeks. 0 = Sunday, 1 = Monday.
     *
     */
    public Builder startOfWeek(double value) {
      object.setStartOfWeek(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
     * tick. Use this option with the <code>maxPadding</code> option to control the axis
     * start.
     *
     */
    public Builder startOnTick(boolean value) {
      object.setStartOnTick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
     * scalar color axis. Use this in cases where a linear gradient between a
     * <code>minColor</code> and <code>maxColor</code> is not sufficient. The stops is an array of
     * tuples, where the first item is a float between 0 and 1 assigning the
     * relative position in the gradient, and the second item is the color.
     *
     */
    public Builder stops(Stops2... value) {
      object.setStops(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
     * This opens up for aligning the ticks of multiple charts or panes within a
     * chart. This option overrides the <code>tickPixelInterval</code> option.
     *
     * This option only has an effect on linear axes. Datetime, logarithmic or
     * category axes are not affected.
     *
     */
    public Builder tickAmount(double value) {
      object.setTickAmount(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
     *
     */
    public Builder tickColor(@Nullable PatternObject value) {
      object.setTickColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
     *
     */
    public Builder tickColor(@Nullable String value) {
      object.setTickColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
     *
     */
    public Builder tickColor(@Nullable GradientColorObject value) {
      object.setTickColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
     * units. When <code>null</code>, the tick interval is computed to approximately follow
     * the <code>tickPixelInterval</code>.
     *
     */
    public Builder tickInterval(double value) {
      object.setTickInterval(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
     * on the color axis.
     *
     */
    public Builder tickLength(double value) {
      object.setTickLength(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) For categorized axes only. If <code>on</code> the tick mark is
     * placed in the center of the category, if <code>between</code> the tick mark is
     * placed between categories. The default is <code>between</code> if the <code>tickInterval</code>
     * is 1, else <code>on</code>.
     *
     */
    public Builder tickmarkPlacement(@Nullable TickmarkPlacement value) {
      object.setTickmarkPlacement(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) If tickInterval is <code>null</code> this option
     * sets the approximate pixel interval of the tick marks.
     *
     */
    public Builder tickPixelInterval(double value) {
      object.setTickPixelInterval(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The position of the major tick marks
     * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     *
     */
    public Builder tickPosition(@Nullable TickPosition value) {
      object.setTickPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) A callback function returning array
     * defining where the ticks are laid out on the axis. This overrides the
     * default behaviour of tickPixelInterval and tickInterval. The automatic
     * tick positions are accessible through <code>this.tickPositions</code> and can be
     * modified by the callback.
     *
     */
    public Builder tickPositioner(@Nullable AxisTickPositionerCallbackFunction value) {
      object.setTickPositioner(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
     * laid out on the axis. This overrides the default behaviour of
     * tickPixelInterval and tickInterval.
     *
     */
    public Builder tickPositions(double... value) {
      object.setTickPositions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
     * marks. Defaults to 0 on category axes, otherwise 1.
     *
     * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
     * class, but in order for the element to be generated on category axes, the
     * option must be explicitly set to 1.
     *
     */
    public Builder tickWidth(double value) {
      object.setTickWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
     * the color axis. Can be <code>linear</code> or <code>logarithmic</code>.
     *
     */
    public Builder type(@Nullable Type value) {
      object.setType(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) Applies only when the axis <code>type</code> is <code>category</code>. When
     * <code>uniqueNames</code> is true, points are placed on the X axis according to their
     * names. If the same point name is repeated in the same or another series,
     * the point is placed on the same X position as other points of the same
     * name. When <code>uniqueNames</code> is false, the points are laid out in increasing
     * X positions regardless of their names, and the X axis category will take
     * the name of the last point in each position.
     *
     */
    public Builder uniqueNames(boolean value) {
      object.setUniqueNames(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
     * what time intervals the ticks are allowed to fall on. Each array item is
     * an array where the first value is the time unit and the second value
     * another array of allowed multiples.
     *
     * Defaults to: (see online documentation for example)
     *
     */
    public Builder units(Units2... value) {
      object.setUnits(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
     * ticks and labels, should be visible.
     *
     */
    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }
  }
}
