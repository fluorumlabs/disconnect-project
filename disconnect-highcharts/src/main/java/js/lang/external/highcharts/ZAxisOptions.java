package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AxisCurrentDateIndicatorOptions ) */;
import js.lang.Unknown /* ( number | string | null ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The Z axis or depth axis for 3D plots.
 *
 * See the Axis class for programmatic access to the axis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ZAxisOptions extends Any {
  /**
   * (Highcharts) Accessibility options for an axis. Requires the
   * accessibility module.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  AxisAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts) Accessibility options for an axis. Requires the
   * accessibility module.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable AxisAccessibilityOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
   * or more opposite axes will automatically be aligned by adding ticks to
   * the axis or axes with the least ticks, as if <code>tickAmount</code> were specified.
   *
   * This can be prevented by setting <code>alignTicks</code> to false. If the grid lines
   * look messy, it's a good idea to hide them for the secondary axis by
   * setting <code>gridLineWidth</code> to 0.
   *
   * If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false, then
   * the <code>alignTicks</code> will be disabled for the Axis.
   *
   * Disabled for logarithmic axes.
   *
   */
  @JSProperty("alignTicks")
  boolean getAlignTicks();

  /**
   * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
   * or more opposite axes will automatically be aligned by adding ticks to
   * the axis or axes with the least ticks, as if <code>tickAmount</code> were specified.
   *
   * This can be prevented by setting <code>alignTicks</code> to false. If the grid lines
   * look messy, it's a good idea to hide them for the secondary axis by
   * setting <code>gridLineWidth</code> to 0.
   *
   * If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false, then
   * the <code>alignTicks</code> will be disabled for the Axis.
   *
   * Disabled for logarithmic axes.
   *
   */
  @JSProperty("alignTicks")
  void setAlignTicks(boolean value);

  /**
   * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
   * integers, like persons or hits on a web page, decimals should be avoided
   * in the labels.
   *
   */
  @JSProperty("allowDecimals")
  boolean getAllowDecimals();

  /**
   * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
   * integers, like persons or hits on a web page, decimals should be avoided
   * in the labels.
   *
   */
  @JSProperty("allowDecimals")
  void setAllowDecimals(boolean value);

  /**
   * (Highcharts) When using an alternate grid color, a band is painted across
   * the plot area between every other grid line.
   *
   */
  @JSProperty("alternateGridColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getAlternateGridColor();

  /**
   * (Highcharts) When using an alternate grid color, a band is painted across
   * the plot area between every other grid line.
   *
   */
  @JSProperty("alternateGridColor")
  void setAlternateGridColor(@Nullable PatternObject value);

  /**
   * (Highcharts) When using an alternate grid color, a band is painted across
   * the plot area between every other grid line.
   *
   */
  @JSProperty("alternateGridColor")
  void setAlternateGridColor(@Nullable String value);

  /**
   * (Highcharts) When using an alternate grid color, a band is painted across
   * the plot area between every other grid line.
   *
   */
  @JSProperty("alternateGridColor")
  void setAlternateGridColor(@Nullable GradientColorObject value);

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
   * (Highcharts, Gantt) If categories are present for the xAxis, names are
   * used instead of numbers for that axis.
   *
   * Since Highcharts 3.0, categories can also be extracted by giving each
   * point a name and setting axis type to <code>category</code>. However, if you have
   * multiple series, best practice remains defining the <code>categories</code> array.
   *
   * Example: <code>categories: ['Apples', 'Bananas', 'Oranges']</code>
   *
   */
  @JSProperty("categories")
  @Nullable
  String[] getCategories();

  /**
   * (Highcharts, Gantt) If categories are present for the xAxis, names are
   * used instead of numbers for that axis.
   *
   * Since Highcharts 3.0, categories can also be extracted by giving each
   * point a name and setting axis type to <code>category</code>. However, if you have
   * multiple series, best practice remains defining the <code>categories</code> array.
   *
   * Example: <code>categories: ['Apples', 'Bananas', 'Oranges']</code>
   *
   */
  @JSProperty("categories")
  void setCategories(String[] value);

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
   * (Highcharts) A class name that opens for styling the axis by CSS,
   * especially in Highcharts styled mode. The class name is applied to group
   * elements for the grid, axis elements and labels.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) A class name that opens for styling the axis by CSS,
   * especially in Highcharts styled mode. The class name is applied to group
   * elements for the grid, axis elements and labels.
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
   * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
   * automatically adjust to the appropriate unit. This member gives the
   * default string representations used for each unit. For intermediate
   * values, different units may be used, for example the <code>day</code> unit can be
   * used on midnight and <code>hour</code> unit be used for intermediate values on the
   * same axis. For an overview of the replacement codes, see dateFormat.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  AxisDateTimeLabelFormatsOptions getDateTimeLabelFormats();

  /**
   * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
   * automatically adjust to the appropriate unit. This member gives the
   * default string representations used for each unit. For intermediate
   * values, different units may be used, for example the <code>day</code> unit can be
   * used on midnight and <code>hour</code> unit be used for intermediate values on the
   * same axis. For an overview of the replacement codes, see dateFormat.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(@Nullable AxisDateTimeLabelFormatsOptions value);

  /**
   * (Highcharts) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highcharts) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highcharts) Event handlers for the axis.
   *
   */
  @JSProperty("events")
  @Nullable
  ZAxisEventsOptions getEvents();

  /**
   * (Highcharts) Event handlers for the axis.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ZAxisEventsOptions value);

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
  ZAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   */
  @JSProperty("grid")
  void setGrid(@Nullable ZAxisGridOptions value);

  /**
   * (Highcharts) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   */
  @JSProperty("gridLineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getGridLineColor();

  /**
   * (Highcharts) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(@Nullable String value);

  /**
   * (Highcharts) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The dash or dot style of the grid lines. For possible
   * values, see this demonstration.
   *
   */
  @JSProperty("gridLineDashStyle")
  @Nullable
  GridLineDashStyle getGridLineDashStyle();

  /**
   * (Highcharts) The dash or dot style of the grid lines. For possible
   * values, see this demonstration.
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
   * (Highcharts) The width of the grid lines extending the ticks across the
   * plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   */
  @JSProperty("gridLineWidth")
  double getGridLineWidth();

  /**
   * (Highcharts) The width of the grid lines extending the ticks across the
   * plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
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
   * (Highcharts) An id for the axis. This can be used after render time to
   * get a pointer to the axis object through <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts) An id for the axis. This can be used after render time to
   * get a pointer to the axis object through <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts) The axis labels show the number or category for each tick.
   *
   * Since v8.0.0: Labels are animated in categorized x-axis with updating
   * data if <code>tickInterval</code> and <code>step</code> is set to 1.
   *
   */
  @JSProperty("labels")
  @Nullable
  ZAxisLabelsOptions getLabels();

  /**
   * (Highcharts) The axis labels show the number or category for each tick.
   *
   * Since v8.0.0: Labels are animated in categorized x-axis with updating
   * data if <code>tickInterval</code> and <code>step</code> is set to 1.
   *
   */
  @JSProperty("labels")
  void setLabels(@Nullable ZAxisLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
   * linked to. When an axis is linked to a master axis, it will take the same
   * extremes as the master, but as assigned by min or max or by setExtremes.
   * It can be used to show additional info, or to ease reading the chart by
   * duplicating the scales.
   *
   */
  @JSProperty("linkedTo")
  double getLinkedTo();

  /**
   * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
   * linked to. When an axis is linked to a master axis, it will take the same
   * extremes as the master, but as assigned by min or max or by setExtremes.
   * It can be used to show additional info, or to ease reading the chart by
   * duplicating the scales.
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(double value);

  /**
   * (Highcharts) If there are multiple axes on the same side of the chart,
   * the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on
   * horizontal axes.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts) If there are multiple axes on the same side of the chart,
   * the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on
   * horizontal axes.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts) The maximum value of the axis. If <code>null</code>, the max value is
   * automatically calculated.
   *
   * If the endOnTick option is true, the <code>max</code> value might be rounded up.
   *
   * If a tickAmount is set, the axis may be extended beyond the set max in
   * order to reach the given number of ticks. The same may happen in a chart
   * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
   * is applied internally.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * (Highcharts) The maximum value of the axis. If <code>null</code>, the max value is
   * automatically calculated.
   *
   * If the endOnTick option is true, the <code>max</code> value might be rounded up.
   *
   * If a tickAmount is set, the axis may be extended beyond the set max in
   * order to reach the given number of ticks. The same may happen in a chart
   * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
   * is applied internally.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highcharts) Padding of the max value relative to the length of the axis.
   * A padding of 0.05 will make a 100px axis 5px longer. This is useful when
   * you don't want the highest data value to appear on the edge of the plot
   * area. When the axis' <code>max</code> option is set or a max extreme is set using
   * <code>axis.setExtremes()</code>, the maxPadding will be ignored.
   *
   */
  @JSProperty("maxPadding")
  double getMaxPadding();

  /**
   * (Highcharts) Padding of the max value relative to the length of the axis.
   * A padding of 0.05 will make a 100px axis 5px longer. This is useful when
   * you don't want the highest data value to appear on the edge of the plot
   * area. When the axis' <code>max</code> option is set or a max extreme is set using
   * <code>axis.setExtremes()</code>, the maxPadding will be ignored.
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
   * (Highcharts) The minimum value of the axis. If <code>null</code> the min value is
   * automatically calculated.
   *
   * If the startOnTick option is true (default), the <code>min</code> value might be
   * rounded down.
   *
   * The automatically calculated minimum value is also affected by floor,
   * softMin, minPadding, minRange as well as series.threshold and
   * series.softThreshold.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * (Highcharts) The minimum value of the axis. If <code>null</code> the min value is
   * automatically calculated.
   *
   * If the startOnTick option is true (default), the <code>min</code> value might be
   * rounded down.
   *
   * The automatically calculated minimum value is also affected by floor,
   * softMin, minPadding, minRange as well as series.threshold and
   * series.softThreshold.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highcharts) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getMinorGridLineColor();

  /**
   * (Highcharts) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(@Nullable String value);

  /**
   * (Highcharts) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The dash or dot style of the minor grid lines. For possible
   * values, see this demonstration.
   *
   */
  @JSProperty("minorGridLineDashStyle")
  @Nullable
  MinorGridLineDashStyle getMinorGridLineDashStyle();

  /**
   * (Highcharts) The dash or dot style of the minor grid lines. For possible
   * values, see this demonstration.
   *
   */
  @JSProperty("minorGridLineDashStyle")
  void setMinorGridLineDashStyle(@Nullable MinorGridLineDashStyle value);

  /**
   * (Highcharts) Width of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   */
  @JSProperty("minorGridLineWidth")
  double getMinorGridLineWidth();

  /**
   * (Highcharts) Width of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getMinorTickColor();

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(@Nullable String value);

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) Specific tick interval in axis units for the minor ticks. On
   * a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a
   * fifth of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not
   * shown.
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
   * (Highcharts) Specific tick interval in axis units for the minor ticks. On
   * a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a
   * fifth of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not
   * shown.
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
   * (Highcharts) Specific tick interval in axis units for the minor ticks. On
   * a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a
   * fifth of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not
   * shown.
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
   * (Highcharts) The pixel length of the minor tick marks.
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highcharts) The pixel length of the minor tick marks.
   *
   */
  @JSProperty("minorTickLength")
  void setMinorTickLength(double value);

  /**
   * (Highcharts) The position of the minor tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("minorTickPosition")
  @Nullable
  MinorTickPosition getMinorTickPosition();

  /**
   * (Highcharts) The position of the minor tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("minorTickPosition")
  void setMinorTickPosition(@Nullable MinorTickPosition value);

  /**
   * (Highcharts) Enable or disable minor ticks. Unless minorTickInterval is
   * set, the tick interval is calculated as a fifth of the <code>tickInterval</code>.
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
   * (Highcharts) Enable or disable minor ticks. Unless minorTickInterval is
   * set, the tick interval is calculated as a fifth of the <code>tickInterval</code>.
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
   * (Highcharts) The pixel width of the minor tick mark.
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highcharts) The pixel width of the minor tick mark.
   *
   */
  @JSProperty("minorTickWidth")
  void setMinorTickWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the lowest data value to appear on the
   * edge of the plot area. When the axis' <code>min</code> option is set or a min
   * extreme is set using <code>axis.setExtremes()</code>, the minPadding will be
   * ignored.
   *
   */
  @JSProperty("minPadding")
  double getMinPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the lowest data value to appear on the
   * edge of the plot area. When the axis' <code>min</code> option is set or a min
   * extreme is set using <code>axis.setExtremes()</code>, the minPadding will be
   * ignored.
   *
   */
  @JSProperty("minPadding")
  void setMinPadding(double value);

  /**
   * (Highcharts) The minimum range to display on this axis. The entire axis
   * will not be allowed to span over a smaller interval than this. For
   * example, for a datetime axis the main unit is milliseconds. If minRange
   * is set to 3600000, you can't zoom in more than to one hour.
   *
   * The default minRange for the x axis is five times the smallest interval
   * between any of the data points.
   *
   * On a logarithmic axis, the unit for the minimum range is the power. So a
   * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
   * 1000-10000 etc.
   *
   * Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code>
   * settings also affect how the extremes of the axis are computed.
   *
   */
  @JSProperty("minRange")
  double getMinRange();

  /**
   * (Highcharts) The minimum range to display on this axis. The entire axis
   * will not be allowed to span over a smaller interval than this. For
   * example, for a datetime axis the main unit is milliseconds. If minRange
   * is set to 3600000, you can't zoom in more than to one hour.
   *
   * The default minRange for the x axis is five times the smallest interval
   * between any of the data points.
   *
   * On a logarithmic axis, the unit for the minimum range is the power. So a
   * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
   * 1000-10000 etc.
   *
   * Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code>
   * settings also affect how the extremes of the axis are computed.
   *
   */
  @JSProperty("minRange")
  void setMinRange(double value);

  /**
   * (Highcharts) The minimum tick interval allowed in axis values. For
   * example on zooming in on an axis with daily data, this can be used to
   * prevent the axis from showing hours. Defaults to the closest distance
   * between two points on the axis.
   *
   */
  @JSProperty("minTickInterval")
  double getMinTickInterval();

  /**
   * (Highcharts) The minimum tick interval allowed in axis values. For
   * example on zooming in on an axis with daily data, this can be used to
   * prevent the axis from showing hours. Defaults to the closest distance
   * between two points on the axis.
   *
   */
  @JSProperty("minTickInterval")
  void setMinTickInterval(double value);

  /**
   * (Highcharts) The distance in pixels from the plot area to the axis line.
   * A positive offset moves the axis with it's line, labels and ticks away
   * from the plot area. This is typically used when two or more axes are
   * displayed on the same side of the plot. With multiple axes the offset is
   * dynamically adjusted to avoid collision, this can be overridden by
   * setting offset explicitly.
   *
   */
  @JSProperty("offset")
  double getOffset();

  /**
   * (Highcharts) The distance in pixels from the plot area to the axis line.
   * A positive offset moves the axis with it's line, labels and ticks away
   * from the plot area. This is typically used when two or more axes are
   * displayed on the same side of the plot. With multiple axes the offset is
   * dynamically adjusted to avoid collision, this can be overridden by
   * setting offset explicitly.
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

  /**
   * (Highcharts) Whether to display the axis on the opposite side of the
   * normal. The normal is on the left side for vertical axes and bottom for
   * horizontal, so the opposite sides will be right and top respectively.
   * This is typically used with dual or multiple axes.
   *
   */
  @JSProperty("opposite")
  boolean getOpposite();

  /**
   * (Highcharts) Whether to display the axis on the opposite side of the
   * normal. The normal is on the left side for vertical axes and bottom for
   * horizontal, so the opposite sides will be right and top respectively.
   * This is typically used with dual or multiple axes.
   *
   */
  @JSProperty("opposite")
  void setOpposite(boolean value);

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
   * (Highcharts) Refers to the index in the panes array. Used for circular
   * gauges and polar charts. When the option is not set then first pane will
   * be used.
   *
   */
  @JSProperty("pane")
  double getPane();

  /**
   * (Highcharts) Refers to the index in the panes array. Used for circular
   * gauges and polar charts. When the option is not set then first pane will
   * be used.
   *
   */
  @JSProperty("pane")
  void setPane(double value);

  /**
   * (Highcharts, Highstock, Gantt) An array of colored bands stretching
   * across the plot area marking an interval on the axis.
   *
   * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
   * class in addition to the <code>className</code> option.
   *
   */
  @JSProperty("plotBands")
  @Nullable
  ZAxisPlotBandsOptions[] getPlotBands();

  /**
   * (Highcharts, Highstock, Gantt) An array of colored bands stretching
   * across the plot area marking an interval on the axis.
   *
   * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
   * class in addition to the <code>className</code> option.
   *
   */
  @JSProperty("plotBands")
  void setPlotBands(ZAxisPlotBandsOptions[] value);

  /**
   * (Highcharts, Highstock, Gantt) An array of lines stretching across the
   * plot area, marking a specific value on one of the axes.
   *
   * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
   * class in addition to the <code>className</code> option.
   *
   */
  @JSProperty("plotLines")
  @Nullable
  ZAxisPlotLinesOptions[] getPlotLines();

  /**
   * (Highcharts, Highstock, Gantt) An array of lines stretching across the
   * plot area, marking a specific value on one of the axes.
   *
   * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
   * class in addition to the <code>className</code> option.
   *
   */
  @JSProperty("plotLines")
  void setPlotLines(ZAxisPlotLinesOptions[] value);

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
   * (Highcharts) Whether to reverse the axis so that the highest number is
   * closest to the origin. If the chart is inverted, the x axis is reversed
   * by default.
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts) Whether to reverse the axis so that the highest number is
   * closest to the origin. If the chart is inverted, the x axis is reversed
   * by default.
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highcharts, Highstock) This option determines how stacks should be
   * ordered within a group. For example reversed xAxis also reverses stacks,
   * so first series comes last in a group. To keep order like for
   * non-reversed xAxis enable this option.
   *
   */
  @JSProperty("reversedStacks")
  boolean getReversedStacks();

  /**
   * (Highcharts, Highstock) This option determines how stacks should be
   * ordered within a group. For example reversed xAxis also reverses stacks,
   * so first series comes last in a group. To keep order like for
   * non-reversed xAxis enable this option.
   *
   */
  @JSProperty("reversedStacks")
  void setReversedStacks(boolean value);

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
  ZAxisScrollbarOptions getScrollbar();

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
  void setScrollbar(@Nullable ZAxisScrollbarOptions value);

  /**
   * (Highcharts) Whether to show the first tick label.
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highcharts) Whether to show the first tick label.
   *
   */
  @JSProperty("showFirstLabel")
  void setShowFirstLabel(boolean value);

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
   * (Highcharts) Whether to force the axis to start on a tick. Use this
   * option with the <code>minPadding</code> option to control the axis start.
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highcharts) Whether to force the axis to start on a tick. Use this
   * option with the <code>minPadding</code> option to control the axis start.
   *
   */
  @JSProperty("startOnTick")
  void setStartOnTick(boolean value);

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
   * (Highcharts) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getTickColor();

  /**
   * (Highcharts) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  void setTickColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  void setTickColor(@Nullable String value);

  /**
   * (Highcharts) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   */
  @JSProperty("tickColor")
  void setTickColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The interval of the tick marks in axis units. When
   * <code>undefined</code>, the tick interval is computed to approximately follow the
   * tickPixelInterval on linear and datetime axes. On categorized axes, a
   * <code>undefined</code> tickInterval will default to 1, one category. Note that
   * datetime axes are based on milliseconds, so for example an interval of
   * one day is expressed as <code>24 * 3600 * 1000</code>.
   *
   * On logarithmic axes, the tickInterval is based on powers, so a
   * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
   * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
   * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
   * etc.
   *
   * If the tickInterval is too dense for labels to be drawn, Highcharts may
   * remove ticks.
   *
   * If the chart has multiple axes, the alignTicks option may interfere with
   * the <code>tickInterval</code> setting.
   *
   */
  @JSProperty("tickInterval")
  double getTickInterval();

  /**
   * (Highcharts) The interval of the tick marks in axis units. When
   * <code>undefined</code>, the tick interval is computed to approximately follow the
   * tickPixelInterval on linear and datetime axes. On categorized axes, a
   * <code>undefined</code> tickInterval will default to 1, one category. Note that
   * datetime axes are based on milliseconds, so for example an interval of
   * one day is expressed as <code>24 * 3600 * 1000</code>.
   *
   * On logarithmic axes, the tickInterval is based on powers, so a
   * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
   * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
   * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
   * etc.
   *
   * If the tickInterval is too dense for labels to be drawn, Highcharts may
   * remove ticks.
   *
   * If the chart has multiple axes, the alignTicks option may interfere with
   * the <code>tickInterval</code> setting.
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highcharts) The pixel length of the main tick marks.
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highcharts) The pixel length of the main tick marks.
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
   * (Highcharts) If tickInterval is <code>null</code> this option sets the approximate
   * pixel interval of the tick marks. Not applicable to categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   */
  @JSProperty("tickPixelInterval")
  double getTickPixelInterval();

  /**
   * (Highcharts) If tickInterval is <code>null</code> this option sets the approximate
   * pixel interval of the tick marks. Not applicable to categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   */
  @JSProperty("tickPixelInterval")
  void setTickPixelInterval(double value);

  /**
   * (Highcharts) The position of the major tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("tickPosition")
  @Nullable
  TickPosition getTickPosition();

  /**
   * (Highcharts) The position of the major tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   */
  @JSProperty("tickPosition")
  void setTickPosition(@Nullable TickPosition value);

  /**
   * (Highcharts) A callback function returning array defining where the ticks
   * are laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   */
  @JSProperty("tickPositioner")
  @Nullable
  AxisTickPositionerCallbackFunction getTickPositioner();

  /**
   * (Highcharts) A callback function returning array defining where the ticks
   * are laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   */
  @JSProperty("tickPositioner")
  void setTickPositioner(@Nullable AxisTickPositionerCallbackFunction value);

  /**
   * (Highcharts) An array defining where the ticks are laid out on the axis.
   * This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   */
  @JSProperty("tickPositions")
  @Nullable
  double[] getTickPositions();

  /**
   * (Highcharts) An array defining where the ticks are laid out on the axis.
   * This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highcharts) The pixel width of the major tick marks. Defaults to 0 on
   * category axes, otherwise 1.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class, but in order for the element to be generated on category axes, the
   * option must be explicitly set to 1.
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts) The pixel width of the major tick marks. Defaults to 0 on
   * category axes, otherwise 1.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class, but in order for the element to be generated on category axes, the
   * option must be explicitly set to 1.
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highcharts) The axis title, showing next to the axis line.
   *
   */
  @JSProperty("title")
  @Nullable
  ZAxisTitleOptions getTitle();

  /**
   * (Highcharts) The axis title, showing next to the axis line.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable ZAxisTitleOptions value);

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
  void setUnits(Units2[] value);

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

  /**
   * (Highcharts) Whether to zoom axis. If <code>chart.zoomType</code> is set, the option
   * allows to disable zooming on an individual axis.
   *
   */
  @JSProperty("zoomEnabled")
  boolean getZoomEnabled();

  /**
   * (Highcharts) Whether to zoom axis. If <code>chart.zoomType</code> is set, the option
   * allows to disable zooming on an individual axis.
   *
   */
  @JSProperty("zoomEnabled")
  void setZoomEnabled(boolean value);

  class Builder {
    private final ZAxisOptions object = Any.empty();

    public ZAxisOptions build() {
      return object;
    }

    /**
     * (Highcharts) Accessibility options for an axis. Requires the
     * accessibility module.
     *
     */
    public Builder accessibility(@Nullable AxisAccessibilityOptionsObject value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
     * or more opposite axes will automatically be aligned by adding ticks to
     * the axis or axes with the least ticks, as if <code>tickAmount</code> were specified.
     *
     * This can be prevented by setting <code>alignTicks</code> to false. If the grid lines
     * look messy, it's a good idea to hide them for the secondary axis by
     * setting <code>gridLineWidth</code> to 0.
     *
     * If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false, then
     * the <code>alignTicks</code> will be disabled for the Axis.
     *
     * Disabled for logarithmic axes.
     *
     */
    public Builder alignTicks(boolean value) {
      object.setAlignTicks(value);
      return this;
    }

    /**
     * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
     * integers, like persons or hits on a web page, decimals should be avoided
     * in the labels.
     *
     */
    public Builder allowDecimals(boolean value) {
      object.setAllowDecimals(value);
      return this;
    }

    /**
     * (Highcharts) When using an alternate grid color, a band is painted across
     * the plot area between every other grid line.
     *
     */
    public Builder alternateGridColor(@Nullable PatternObject value) {
      object.setAlternateGridColor(value);
      return this;
    }

    /**
     * (Highcharts) When using an alternate grid color, a band is painted across
     * the plot area between every other grid line.
     *
     */
    public Builder alternateGridColor(@Nullable String value) {
      object.setAlternateGridColor(value);
      return this;
    }

    /**
     * (Highcharts) When using an alternate grid color, a band is painted across
     * the plot area between every other grid line.
     *
     */
    public Builder alternateGridColor(@Nullable GradientColorObject value) {
      object.setAlternateGridColor(value);
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
     * (Highcharts, Gantt) If categories are present for the xAxis, names are
     * used instead of numbers for that axis.
     *
     * Since Highcharts 3.0, categories can also be extracted by giving each
     * point a name and setting axis type to <code>category</code>. However, if you have
     * multiple series, best practice remains defining the <code>categories</code> array.
     *
     * Example: <code>categories: ['Apples', 'Bananas', 'Oranges']</code>
     *
     */
    public Builder categories(String[] value) {
      object.setCategories(value);
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
     * (Highcharts) A class name that opens for styling the axis by CSS,
     * especially in Highcharts styled mode. The class name is applied to group
     * elements for the grid, axis elements and labels.
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
     * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
     * automatically adjust to the appropriate unit. This member gives the
     * default string representations used for each unit. For intermediate
     * values, different units may be used, for example the <code>day</code> unit can be
     * used on midnight and <code>hour</code> unit be used for intermediate values on the
     * same axis. For an overview of the replacement codes, see dateFormat.
     *
     * Defaults to: (see online documentation for example)
     *
     */
    public Builder dateTimeLabelFormats(@Nullable AxisDateTimeLabelFormatsOptions value) {
      object.setDateTimeLabelFormats(value);
      return this;
    }

    /**
     * (Highcharts) Whether to force the axis to end on a tick. Use this option
     * with the <code>maxPadding</code> option to control the axis end.
     *
     */
    public Builder endOnTick(boolean value) {
      object.setEndOnTick(value);
      return this;
    }

    /**
     * (Highcharts) Event handlers for the axis.
     *
     */
    public Builder events(@Nullable ZAxisEventsOptions value) {
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
    public Builder grid(@Nullable ZAxisGridOptions value) {
      object.setGrid(value);
      return this;
    }

    /**
     * (Highcharts) Color of the grid lines extending the ticks across the plot
     * area.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
     *
     */
    public Builder gridLineColor(@Nullable PatternObject value) {
      object.setGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts) Color of the grid lines extending the ticks across the plot
     * area.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
     *
     */
    public Builder gridLineColor(@Nullable String value) {
      object.setGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts) Color of the grid lines extending the ticks across the plot
     * area.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
     *
     */
    public Builder gridLineColor(@Nullable GradientColorObject value) {
      object.setGridLineColor(value);
      return this;
    }

    /**
     * (Highcharts) The dash or dot style of the grid lines. For possible
     * values, see this demonstration.
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
     * (Highcharts) The width of the grid lines extending the ticks across the
     * plot area.
     *
     * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
     * class.
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
     * (Highcharts) An id for the axis. This can be used after render time to
     * get a pointer to the axis object through <code>chart.get()</code>.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts) The axis labels show the number or category for each tick.
     *
     * Since v8.0.0: Labels are animated in categorized x-axis with updating
     * data if <code>tickInterval</code> and <code>step</code> is set to 1.
     *
     */
    public Builder labels(@Nullable ZAxisLabelsOptions value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
     * linked to. When an axis is linked to a master axis, it will take the same
     * extremes as the master, but as assigned by min or max or by setExtremes.
     * It can be used to show additional info, or to ease reading the chart by
     * duplicating the scales.
     *
     */
    public Builder linkedTo(double value) {
      object.setLinkedTo(value);
      return this;
    }

    /**
     * (Highcharts) If there are multiple axes on the same side of the chart,
     * the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on
     * horizontal axes.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts) The maximum value of the axis. If <code>null</code>, the max value is
     * automatically calculated.
     *
     * If the endOnTick option is true, the <code>max</code> value might be rounded up.
     *
     * If a tickAmount is set, the axis may be extended beyond the set max in
     * order to reach the given number of ticks. The same may happen in a chart
     * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
     * is applied internally.
     *
     */
    public Builder max(double value) {
      object.setMax(value);
      return this;
    }

    /**
     * (Highcharts) Padding of the max value relative to the length of the axis.
     * A padding of 0.05 will make a 100px axis 5px longer. This is useful when
     * you don't want the highest data value to appear on the edge of the plot
     * area. When the axis' <code>max</code> option is set or a max extreme is set using
     * <code>axis.setExtremes()</code>, the maxPadding will be ignored.
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
     * (Highcharts) The minimum value of the axis. If <code>null</code> the min value is
     * automatically calculated.
     *
     * If the startOnTick option is true (default), the <code>min</code> value might be
     * rounded down.
     *
     * The automatically calculated minimum value is also affected by floor,
     * softMin, minPadding, minRange as well as series.threshold and
     * series.softThreshold.
     *
     */
    public Builder min(double value) {
      object.setMin(value);
      return this;
    }

    /**
     * (Highcharts) Color of the minor, secondary grid lines.
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
     * (Highcharts) Color of the minor, secondary grid lines.
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
     * (Highcharts) Color of the minor, secondary grid lines.
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
     * (Highcharts) The dash or dot style of the minor grid lines. For possible
     * values, see this demonstration.
     *
     */
    public Builder minorGridLineDashStyle(@Nullable MinorGridLineDashStyle value) {
      object.setMinorGridLineDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) Width of the minor, secondary grid lines.
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
     * (Highcharts) Color for the minor tick marks.
     *
     */
    public Builder minorTickColor(@Nullable PatternObject value) {
      object.setMinorTickColor(value);
      return this;
    }

    /**
     * (Highcharts) Color for the minor tick marks.
     *
     */
    public Builder minorTickColor(@Nullable String value) {
      object.setMinorTickColor(value);
      return this;
    }

    /**
     * (Highcharts) Color for the minor tick marks.
     *
     */
    public Builder minorTickColor(@Nullable GradientColorObject value) {
      object.setMinorTickColor(value);
      return this;
    }

    /**
     * (Highcharts) Specific tick interval in axis units for the minor ticks. On
     * a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a
     * fifth of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not
     * shown.
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
     * (Highcharts) Specific tick interval in axis units for the minor ticks. On
     * a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a
     * fifth of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not
     * shown.
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
     * (Highcharts) The pixel length of the minor tick marks.
     *
     */
    public Builder minorTickLength(double value) {
      object.setMinorTickLength(value);
      return this;
    }

    /**
     * (Highcharts) The position of the minor tick marks relative to the axis
     * line. Can be one of <code>inside</code> and <code>outside</code>.
     *
     */
    public Builder minorTickPosition(@Nullable MinorTickPosition value) {
      object.setMinorTickPosition(value);
      return this;
    }

    /**
     * (Highcharts) Enable or disable minor ticks. Unless minorTickInterval is
     * set, the tick interval is calculated as a fifth of the <code>tickInterval</code>.
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
     * (Highcharts) The pixel width of the minor tick mark.
     *
     */
    public Builder minorTickWidth(double value) {
      object.setMinorTickWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
     * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
     * This is useful when you don't want the lowest data value to appear on the
     * edge of the plot area. When the axis' <code>min</code> option is set or a min
     * extreme is set using <code>axis.setExtremes()</code>, the minPadding will be
     * ignored.
     *
     */
    public Builder minPadding(double value) {
      object.setMinPadding(value);
      return this;
    }

    /**
     * (Highcharts) The minimum range to display on this axis. The entire axis
     * will not be allowed to span over a smaller interval than this. For
     * example, for a datetime axis the main unit is milliseconds. If minRange
     * is set to 3600000, you can't zoom in more than to one hour.
     *
     * The default minRange for the x axis is five times the smallest interval
     * between any of the data points.
     *
     * On a logarithmic axis, the unit for the minimum range is the power. So a
     * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
     * 1000-10000 etc.
     *
     * Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code>
     * settings also affect how the extremes of the axis are computed.
     *
     */
    public Builder minRange(double value) {
      object.setMinRange(value);
      return this;
    }

    /**
     * (Highcharts) The minimum tick interval allowed in axis values. For
     * example on zooming in on an axis with daily data, this can be used to
     * prevent the axis from showing hours. Defaults to the closest distance
     * between two points on the axis.
     *
     */
    public Builder minTickInterval(double value) {
      object.setMinTickInterval(value);
      return this;
    }

    /**
     * (Highcharts) The distance in pixels from the plot area to the axis line.
     * A positive offset moves the axis with it's line, labels and ticks away
     * from the plot area. This is typically used when two or more axes are
     * displayed on the same side of the plot. With multiple axes the offset is
     * dynamically adjusted to avoid collision, this can be overridden by
     * setting offset explicitly.
     *
     */
    public Builder offset(double value) {
      object.setOffset(value);
      return this;
    }

    /**
     * (Highcharts) Whether to display the axis on the opposite side of the
     * normal. The normal is on the left side for vertical axes and bottom for
     * horizontal, so the opposite sides will be right and top respectively.
     * This is typically used with dual or multiple axes.
     *
     */
    public Builder opposite(boolean value) {
      object.setOpposite(value);
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
     * (Highcharts) Refers to the index in the panes array. Used for circular
     * gauges and polar charts. When the option is not set then first pane will
     * be used.
     *
     */
    public Builder pane(double value) {
      object.setPane(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An array of colored bands stretching
     * across the plot area marking an interval on the axis.
     *
     * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
     * class in addition to the <code>className</code> option.
     *
     */
    public Builder plotBands(ZAxisPlotBandsOptions[] value) {
      object.setPlotBands(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An array of lines stretching across the
     * plot area, marking a specific value on one of the axes.
     *
     * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
     * class in addition to the <code>className</code> option.
     *
     */
    public Builder plotLines(ZAxisPlotLinesOptions[] value) {
      object.setPlotLines(value);
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
     * (Highcharts) Whether to reverse the axis so that the highest number is
     * closest to the origin. If the chart is inverted, the x axis is reversed
     * by default.
     *
     */
    public Builder reversed(boolean value) {
      object.setReversed(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) This option determines how stacks should be
     * ordered within a group. For example reversed xAxis also reverses stacks,
     * so first series comes last in a group. To keep order like for
     * non-reversed xAxis enable this option.
     *
     */
    public Builder reversedStacks(boolean value) {
      object.setReversedStacks(value);
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
    public Builder scrollbar(@Nullable ZAxisScrollbarOptions value) {
      object.setScrollbar(value);
      return this;
    }

    /**
     * (Highcharts) Whether to show the first tick label.
     *
     */
    public Builder showFirstLabel(boolean value) {
      object.setShowFirstLabel(value);
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
     * (Highcharts) Whether to force the axis to start on a tick. Use this
     * option with the <code>minPadding</code> option to control the axis start.
     *
     */
    public Builder startOnTick(boolean value) {
      object.setStartOnTick(value);
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
     * (Highcharts) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
     *
     */
    public Builder tickColor(@Nullable PatternObject value) {
      object.setTickColor(value);
      return this;
    }

    /**
     * (Highcharts) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
     *
     */
    public Builder tickColor(@Nullable String value) {
      object.setTickColor(value);
      return this;
    }

    /**
     * (Highcharts) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
     *
     */
    public Builder tickColor(@Nullable GradientColorObject value) {
      object.setTickColor(value);
      return this;
    }

    /**
     * (Highcharts) The interval of the tick marks in axis units. When
     * <code>undefined</code>, the tick interval is computed to approximately follow the
     * tickPixelInterval on linear and datetime axes. On categorized axes, a
     * <code>undefined</code> tickInterval will default to 1, one category. Note that
     * datetime axes are based on milliseconds, so for example an interval of
     * one day is expressed as <code>24 * 3600 * 1000</code>.
     *
     * On logarithmic axes, the tickInterval is based on powers, so a
     * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
     * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
     * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
     * etc.
     *
     * If the tickInterval is too dense for labels to be drawn, Highcharts may
     * remove ticks.
     *
     * If the chart has multiple axes, the alignTicks option may interfere with
     * the <code>tickInterval</code> setting.
     *
     */
    public Builder tickInterval(double value) {
      object.setTickInterval(value);
      return this;
    }

    /**
     * (Highcharts) The pixel length of the main tick marks.
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
     * (Highcharts) If tickInterval is <code>null</code> this option sets the approximate
     * pixel interval of the tick marks. Not applicable to categorized axis.
     *
     * The tick interval is also influenced by the minTickInterval option, that,
     * by default prevents ticks from being denser than the data points.
     *
     */
    public Builder tickPixelInterval(double value) {
      object.setTickPixelInterval(value);
      return this;
    }

    /**
     * (Highcharts) The position of the major tick marks relative to the axis
     * line. Can be one of <code>inside</code> and <code>outside</code>.
     *
     */
    public Builder tickPosition(@Nullable TickPosition value) {
      object.setTickPosition(value);
      return this;
    }

    /**
     * (Highcharts) A callback function returning array defining where the ticks
     * are laid out on the axis. This overrides the default behaviour of
     * tickPixelInterval and tickInterval. The automatic tick positions are
     * accessible through <code>this.tickPositions</code> and can be modified by the
     * callback.
     *
     */
    public Builder tickPositioner(@Nullable AxisTickPositionerCallbackFunction value) {
      object.setTickPositioner(value);
      return this;
    }

    /**
     * (Highcharts) An array defining where the ticks are laid out on the axis.
     * This overrides the default behaviour of tickPixelInterval and
     * tickInterval.
     *
     */
    public Builder tickPositions(double[] value) {
      object.setTickPositions(value);
      return this;
    }

    /**
     * (Highcharts) The pixel width of the major tick marks. Defaults to 0 on
     * category axes, otherwise 1.
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
     * (Highcharts) The axis title, showing next to the axis line.
     *
     */
    public Builder title(@Nullable ZAxisTitleOptions value) {
      object.setTitle(value);
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
    public Builder units(Units2[] value) {
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

    /**
     * (Highcharts) Whether to zoom axis. If <code>chart.zoomType</code> is set, the option
     * allows to disable zooming on an individual axis.
     *
     */
    public Builder zoomEnabled(boolean value) {
      object.setZoomEnabled(value);
      return this;
    }
  }
}
