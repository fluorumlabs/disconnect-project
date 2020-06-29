package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AxisCrosshairOptions ) */;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* ( number | string | null ) */;
import js.lang.Unknown /* ColorType */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Common options for all yAxes rendered in a parallel coordinates
 * plot. This feature requires <code>modules/parallel-coordinates.js</code>.
 *
 * The default options are: (see online documentation for example)
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartParallelAxesOptions extends Any {
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
  void setCategories(String... value);

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
   * (Highcharts) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   */
  @JSProperty("crosshair")
  @Nullable
  Unknown /* ( boolean | AxisCrosshairOptions ) */ getCrosshair();

  /**
   * (Highcharts) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

  /**
   * (Highcharts) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(@Nullable AxisCrosshairOptions value);

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
   * This option is always disabled, when panning type is either <code>y</code> or <code>xy</code>.
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highcharts) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   * This option is always disabled, when panning type is either <code>y</code> or <code>xy</code>.
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
  ChartParallelAxesEventsOptions getEvents();

  /**
   * (Highcharts) Event handlers for the axis.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ChartParallelAxesEventsOptions value);

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
  ChartParallelAxesGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   */
  @JSProperty("grid")
  void setGrid(@Nullable ChartParallelAxesGridOptions value);

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
   * (Highcharts, Highstock) The height of the Y axis. If it's a number, it is
   * interpreted as pixels.
   *
   * Since Highcharts 2: If it's a percentage string, it is interpreted as
   * percentages of the total plot height.
   *
   */
  @JSProperty("height")
  @Nullable
  Unknown /* ( number | string ) */ getHeight();

  /**
   * (Highcharts, Highstock) The height of the Y axis. If it's a number, it is
   * interpreted as pixels.
   *
   * Since Highcharts 2: If it's a percentage string, it is interpreted as
   * percentages of the total plot height.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock) The height of the Y axis. If it's a number, it is
   * interpreted as pixels.
   *
   * Since Highcharts 2: If it's a percentage string, it is interpreted as
   * percentages of the total plot height.
   *
   */
  @JSProperty("height")
  void setHeight(@Nullable String value);

  /**
   * (Highcharts) The axis labels show the number or category for each tick.
   *
   * Since v8.0.0: Labels are animated in categorized x-axis with updating
   * data if <code>tickInterval</code> and <code>step</code> is set to 1.
   *
   */
  @JSProperty("labels")
  @Nullable
  ChartParallelAxesLabelsOptions getLabels();

  /**
   * (Highcharts) The axis labels show the number or category for each tick.
   *
   * Since v8.0.0: Labels are animated in categorized x-axis with updating
   * data if <code>tickInterval</code> and <code>step</code> is set to 1.
   *
   */
  @JSProperty("labels")
  void setLabels(@Nullable ChartParallelAxesLabelsOptions value);

  /**
   * (Highcharts, Highstock) The left position as the horizontal axis. If it's
   * a number, it is interpreted as pixel position relative to the chart.
   *
   * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
   * as percentages of the plot width, offset from plot area left.
   *
   */
  @JSProperty("left")
  @Nullable
  Unknown /* ( number | string ) */ getLeft();

  /**
   * (Highcharts, Highstock) The left position as the horizontal axis. If it's
   * a number, it is interpreted as pixel position relative to the chart.
   *
   * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
   * as percentages of the plot width, offset from plot area left.
   *
   */
  @JSProperty("left")
  void setLeft(double value);

  /**
   * (Highcharts, Highstock) The left position as the horizontal axis. If it's
   * a number, it is interpreted as pixel position relative to the chart.
   *
   * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
   * as percentages of the plot width, offset from plot area left.
   *
   */
  @JSProperty("left")
  void setLeft(@Nullable String value);

  /**
   * (Highcharts) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Unknown /* ColorType */ getLineColor();

  /**
   * (Highcharts) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highcharts) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The width of the line marking the axis itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts) The width of the line marking the axis itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

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
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   */
  @JSProperty("maxLength")
  @Nullable
  Unknown /* ( number | string ) */ getMaxLength();

  /**
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   */
  @JSProperty("maxLength")
  void setMaxLength(double value);

  /**
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   */
  @JSProperty("maxLength")
  void setMaxLength(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the highest data value to appear on
   * the edge of the plot area. When the axis' <code>max</code> option is set or a max
   * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
   * ignored.
   *
   * Also the <code>softThreshold</code> option takes precedence over <code>maxPadding</code>, so if
   * the data is tangent to the threshold, <code>maxPadding</code> may not apply unless
   * <code>softThreshold</code> is set to false.
   *
   */
  @JSProperty("maxPadding")
  double getMaxPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the highest data value to appear on
   * the edge of the plot area. When the axis' <code>max</code> option is set or a max
   * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
   * ignored.
   *
   * Also the <code>softThreshold</code> option takes precedence over <code>maxPadding</code>, so if
   * the data is tangent to the threshold, <code>maxPadding</code> may not apply unless
   * <code>softThreshold</code> is set to false.
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
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   */
  @JSProperty("minLength")
  @Nullable
  Unknown /* ( number | string ) */ getMinLength();

  /**
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   */
  @JSProperty("minLength")
  void setMinLength(double value);

  /**
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   */
  @JSProperty("minLength")
  void setMinLength(@Nullable String value);

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  Unknown /* ColorType */ getMinorTickColor();

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
   * edge of the plot area. When the axis' <code>min</code> option is set or a max
   * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
   * ignored.
   *
   * Also the <code>softThreshold</code> option takes precedence over <code>minPadding</code>, so if
   * the data is tangent to the threshold, <code>minPadding</code> may not apply unless
   * <code>softThreshold</code> is set to false.
   *
   */
  @JSProperty("minPadding")
  double getMinPadding();

  /**
   * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the lowest data value to appear on the
   * edge of the plot area. When the axis' <code>min</code> option is set or a max
   * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
   * ignored.
   *
   * Also the <code>softThreshold</code> option takes precedence over <code>minPadding</code>, so if
   * the data is tangent to the threshold, <code>minPadding</code> may not apply unless
   * <code>softThreshold</code> is set to false.
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
   * <strong>Note</strong>: The <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code>
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
   * <strong>Note</strong>: The <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code>
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
   * (Highstock, Highcharts, Gantt) Whether to display the axis on the
   * opposite side of the normal. The normal is on the left side for vertical
   * axes and bottom for horizontal, so the opposite sides will be right and
   * top respectively. This is typically used with dual or multiple axes.
   *
   */
  @JSProperty("opposite")
  boolean getOpposite();

  /**
   * (Highstock, Highcharts, Gantt) Whether to display the axis on the
   * opposite side of the normal. The normal is on the left side for vertical
   * axes and bottom for horizontal, so the opposite sides will be right and
   * top respectively. This is typically used with dual or multiple axes.
   *
   */
  @JSProperty("opposite")
  void setOpposite(boolean value);

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
   * (Highstock) Options for axis resizing. It adds a thick line between panes
   * which the user can drag in order to resize the panes.
   *
   */
  @JSProperty("resize")
  @Nullable
  ChartParallelAxesResizeOptions getResize();

  /**
   * (Highstock) Options for axis resizing. It adds a thick line between panes
   * which the user can drag in order to resize the panes.
   *
   */
  @JSProperty("resize")
  void setResize(@Nullable ChartParallelAxesResizeOptions value);

  /**
   * (Highcharts) Whether to reverse the axis so that the highest number is
   * closest to the origin.
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts) Whether to reverse the axis so that the highest number is
   * closest to the origin.
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highcharts, Highstock) If <code>true</code>, the first series in a stack will be
   * drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first
   * series is in the base of the stack.
   *
   */
  @JSProperty("reversedStacks")
  boolean getReversedStacks();

  /**
   * (Highcharts, Highstock) If <code>true</code>, the first series in a stack will be
   * drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first
   * series is in the base of the stack.
   *
   */
  @JSProperty("reversedStacks")
  void setReversedStacks(boolean value);

  /**
   * (Highcharts) Whether to show the axis line and title when the axis has no
   * data.
   *
   */
  @JSProperty("showEmpty")
  boolean getShowEmpty();

  /**
   * (Highcharts) Whether to show the axis line and title when the axis has no
   * data.
   *
   */
  @JSProperty("showEmpty")
  void setShowEmpty(boolean value);

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
   * <strong>Note</strong>: The series.softThreshold option takes precedence over this
   * option.
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
   * <strong>Note</strong>: The series.softThreshold option takes precedence over this
   * option.
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
   * <strong>Note</strong>: The series.softThreshold option takes precedence over this
   * option.
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
   * <strong>Note</strong>: The series.softThreshold option takes precedence over this
   * option.
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
   * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * start.
   *
   * This option is always disabled, when panning type is either <code>y</code> or <code>xy</code>.
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * start.
   *
   * This option is always disabled, when panning type is either <code>y</code> or <code>xy</code>.
   *
   */
  @JSProperty("startOnTick")
  void setStartOnTick(boolean value);

  /**
   * (Gantt) For vertical axes only. Setting the static scale ensures that
   * each tick unit is translated into a fixed pixel height. For example,
   * setting the static scale to 24 results in each Y axis category taking up
   * 24 pixels, and the height of the chart adjusts. Adding or removing items
   * will make the chart resize.
   *
   */
  @JSProperty("staticScale")
  double getStaticScale();

  /**
   * (Gantt) For vertical axes only. Setting the static scale ensures that
   * each tick unit is translated into a fixed pixel height. For example,
   * setting the static scale to 24 results in each Y axis category taking up
   * 24 pixels, and the height of the chart adjusts. Adding or removing items
   * will make the chart resize.
   *
   */
  @JSProperty("staticScale")
  void setStaticScale(double value);

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
  Unknown /* ColorType */ getTickColor();

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
  void setTickPositions(double... value);

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highcharts) Titles for yAxes are taken from xAxis.categories. All
   * options for <code>xAxis.labels</code> applies to parallel coordinates titles. For
   * example, to style categories, use xAxis.labels.style.
   *
   */
  @JSProperty("title")
  @Nullable
  ChartParallelAxesTitleOptions getTitle();

  /**
   * (Highcharts) Titles for yAxes are taken from xAxis.categories. All
   * options for <code>xAxis.labels</code> applies to parallel coordinates titles. For
   * example, to style categories, use xAxis.labels.style.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable ChartParallelAxesTitleOptions value);

  /**
   * (Highcharts) Parallel coordinates only. Format that will be used for
   * point.y and available in tooltip.pointFormat as <code>{point.formattedValue}</code>.
   * If not set, <code>{point.formattedValue}</code> will use other options, in this
   * order:
   *
   * <ol>
   * <li>
   * yAxis.labels.format will be used if set
   *
   * </li>
   * <li>
   * If yAxis is a category, then category name will be displayed
   *
   * </li>
   * <li>
   * If yAxis is a datetime, then value will use the same format as yAxis
   * labels
   *
   * </li>
   * <li>
   * If yAxis is linear/logarithmic type, then simple value will be used
   *
   * </li>
   * </ol>
   */
  @JSProperty("tooltipValueFormat")
  @Nullable
  String getTooltipValueFormat();

  /**
   * (Highcharts) Parallel coordinates only. Format that will be used for
   * point.y and available in tooltip.pointFormat as <code>{point.formattedValue}</code>.
   * If not set, <code>{point.formattedValue}</code> will use other options, in this
   * order:
   *
   * <ol>
   * <li>
   * yAxis.labels.format will be used if set
   *
   * </li>
   * <li>
   * If yAxis is a category, then category name will be displayed
   *
   * </li>
   * <li>
   * If yAxis is a datetime, then value will use the same format as yAxis
   * labels
   *
   * </li>
   * <li>
   * If yAxis is linear/logarithmic type, then simple value will be used
   *
   * </li>
   * </ol>
   */
  @JSProperty("tooltipValueFormat")
  void setTooltipValueFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock) The top position of the Y axis. If it's a number,
   * it is interpreted as pixel position relative to the chart.
   *
   * Since Highcharts 2: If it's a percentage string, it is interpreted as
   * percentages of the plot height, offset from plot area top.
   *
   */
  @JSProperty("top")
  @Nullable
  Unknown /* ( number | string ) */ getTop();

  /**
   * (Highcharts, Highstock) The top position of the Y axis. If it's a number,
   * it is interpreted as pixel position relative to the chart.
   *
   * Since Highcharts 2: If it's a percentage string, it is interpreted as
   * percentages of the plot height, offset from plot area top.
   *
   */
  @JSProperty("top")
  void setTop(double value);

  /**
   * (Highcharts, Highstock) The top position of the Y axis. If it's a number,
   * it is interpreted as pixel position relative to the chart.
   *
   * Since Highcharts 2: If it's a percentage string, it is interpreted as
   * percentages of the plot height, offset from plot area top.
   *
   */
  @JSProperty("top")
  void setTop(@Nullable String value);

  /**
   * (Highcharts, Gantt) The type of axis. Can be one of <code>linear</code>,
   * <code>logarithmic</code>, <code>datetime</code>, <code>category</code> or <code>treegrid</code>. Defaults to
   * <code>treegrid</code> for Gantt charts, <code>linear</code> for other chart types.
   *
   * In a datetime axis, the numbers are given in milliseconds, and tick marks
   * are placed on appropriate values, like full hours or days. In a category
   * or treegrid axis, the point names of the chart's series are used for
   * categories, if a categories array is not defined.
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Gantt) The type of axis. Can be one of <code>linear</code>,
   * <code>logarithmic</code>, <code>datetime</code>, <code>category</code> or <code>treegrid</code>. Defaults to
   * <code>treegrid</code> for Gantt charts, <code>linear</code> for other chart types.
   *
   * In a datetime axis, the numbers are given in milliseconds, and tick marks
   * are placed on appropriate values, like full hours or days. In a category
   * or treegrid axis, the point names of the chart's series are used for
   * categories, if a categories array is not defined.
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

  /**
   * (Highcharts, Highstock) The width as the horizontal axis. If it's a
   * number, it is interpreted as pixels.
   *
   * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
   * as percentages of the total plot width.
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown /* ( number | string ) */ getWidth();

  /**
   * (Highcharts, Highstock) The width as the horizontal axis. If it's a
   * number, it is interpreted as pixels.
   *
   * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
   * as percentages of the total plot width.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock) The width as the horizontal axis. If it's a
   * number, it is interpreted as pixels.
   *
   * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
   * as percentages of the total plot width.
   *
   */
  @JSProperty("width")
  void setWidth(@Nullable String value);

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

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type CATEGORY = JsEnum.of("category");

    public static final Type DATETIME = JsEnum.of("datetime");

    public static final Type LINEAR = JsEnum.of("linear");

    public static final Type LOGARITHMIC = JsEnum.of("logarithmic");

    public static final Type TREEGRID = JsEnum.of("treegrid");
  }

  final class Builder {
    private final ChartParallelAxesOptions object = Any.empty();

    private Builder() {
    }

    public ChartParallelAxesOptions build() {
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
    public Builder categories(String... value) {
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
     * (Highcharts) Configure a crosshair that follows either the mouse pointer
     * or the hovered point.
     *
     * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
     * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
     *
     */
    public Builder crosshair(boolean value) {
      object.setCrosshair(value);
      return this;
    }

    /**
     * (Highcharts) Configure a crosshair that follows either the mouse pointer
     * or the hovered point.
     *
     * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
     * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
     *
     */
    public Builder crosshair(@Nullable AxisCrosshairOptions value) {
      object.setCrosshair(value);
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
     * This option is always disabled, when panning type is either <code>y</code> or <code>xy</code>.
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
    public Builder events(@Nullable ChartParallelAxesEventsOptions value) {
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
    public Builder grid(@Nullable ChartParallelAxesGridOptions value) {
      object.setGrid(value);
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
     * (Highcharts, Highstock) The height of the Y axis. If it's a number, it is
     * interpreted as pixels.
     *
     * Since Highcharts 2: If it's a percentage string, it is interpreted as
     * percentages of the total plot height.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The height of the Y axis. If it's a number, it is
     * interpreted as pixels.
     *
     * Since Highcharts 2: If it's a percentage string, it is interpreted as
     * percentages of the total plot height.
     *
     */
    public Builder height(@Nullable String value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts) The axis labels show the number or category for each tick.
     *
     * Since v8.0.0: Labels are animated in categorized x-axis with updating
     * data if <code>tickInterval</code> and <code>step</code> is set to 1.
     *
     */
    public Builder labels(@Nullable ChartParallelAxesLabelsOptions value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The left position as the horizontal axis. If it's
     * a number, it is interpreted as pixel position relative to the chart.
     *
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the plot width, offset from plot area left.
     *
     */
    public Builder left(double value) {
      object.setLeft(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The left position as the horizontal axis. If it's
     * a number, it is interpreted as pixel position relative to the chart.
     *
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the plot width, offset from plot area left.
     *
     */
    public Builder left(@Nullable String value) {
      object.setLeft(value);
      return this;
    }

    /**
     * (Highcharts) The color of the line marking the axis itself.
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
     * (Highcharts) The color of the line marking the axis itself.
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
     * (Highcharts) The color of the line marking the axis itself.
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
     * (Highcharts) The width of the line marking the axis itself.
     *
     * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
     * or <code>.highcharts-xaxis-line</code> class.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
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
     * (Highstock) Maximal size of a resizable axis. Could be set as a percent
     * of plot area or pixel size.
     *
     */
    public Builder maxLength(double value) {
      object.setMaxLength(value);
      return this;
    }

    /**
     * (Highstock) Maximal size of a resizable axis. Could be set as a percent
     * of plot area or pixel size.
     *
     */
    public Builder maxLength(@Nullable String value) {
      object.setMaxLength(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
     * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
     * This is useful when you don't want the highest data value to appear on
     * the edge of the plot area. When the axis' <code>max</code> option is set or a max
     * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
     * ignored.
     *
     * Also the <code>softThreshold</code> option takes precedence over <code>maxPadding</code>, so if
     * the data is tangent to the threshold, <code>maxPadding</code> may not apply unless
     * <code>softThreshold</code> is set to false.
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
     * (Highstock) Minimal size of a resizable axis. Could be set as a percent
     * of plot area or pixel size.
     *
     */
    public Builder minLength(double value) {
      object.setMinLength(value);
      return this;
    }

    /**
     * (Highstock) Minimal size of a resizable axis. Could be set as a percent
     * of plot area or pixel size.
     *
     */
    public Builder minLength(@Nullable String value) {
      object.setMinLength(value);
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
     * edge of the plot area. When the axis' <code>min</code> option is set or a max
     * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
     * ignored.
     *
     * Also the <code>softThreshold</code> option takes precedence over <code>minPadding</code>, so if
     * the data is tangent to the threshold, <code>minPadding</code> may not apply unless
     * <code>softThreshold</code> is set to false.
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
     * <strong>Note</strong>: The <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code>
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
     * (Highstock, Highcharts, Gantt) Whether to display the axis on the
     * opposite side of the normal. The normal is on the left side for vertical
     * axes and bottom for horizontal, so the opposite sides will be right and
     * top respectively. This is typically used with dual or multiple axes.
     *
     */
    public Builder opposite(boolean value) {
      object.setOpposite(value);
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
     * (Highstock) Options for axis resizing. It adds a thick line between panes
     * which the user can drag in order to resize the panes.
     *
     */
    public Builder resize(@Nullable ChartParallelAxesResizeOptions value) {
      object.setResize(value);
      return this;
    }

    /**
     * (Highcharts) Whether to reverse the axis so that the highest number is
     * closest to the origin.
     *
     */
    public Builder reversed(boolean value) {
      object.setReversed(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) If <code>true</code>, the first series in a stack will be
     * drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first
     * series is in the base of the stack.
     *
     */
    public Builder reversedStacks(boolean value) {
      object.setReversedStacks(value);
      return this;
    }

    /**
     * (Highcharts) Whether to show the axis line and title when the axis has no
     * data.
     *
     */
    public Builder showEmpty(boolean value) {
      object.setShowEmpty(value);
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
     * <strong>Note</strong>: The series.softThreshold option takes precedence over this
     * option.
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
     * <strong>Note</strong>: The series.softThreshold option takes precedence over this
     * option.
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
     * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
     * tick. Use this option with the <code>maxPadding</code> option to control the axis
     * start.
     *
     * This option is always disabled, when panning type is either <code>y</code> or <code>xy</code>.
     *
     */
    public Builder startOnTick(boolean value) {
      object.setStartOnTick(value);
      return this;
    }

    /**
     * (Gantt) For vertical axes only. Setting the static scale ensures that
     * each tick unit is translated into a fixed pixel height. For example,
     * setting the static scale to 24 results in each Y axis category taking up
     * 24 pixels, and the height of the chart adjusts. Adding or removing items
     * will make the chart resize.
     *
     */
    public Builder staticScale(double value) {
      object.setStaticScale(value);
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
    public Builder tickPositions(double... value) {
      object.setTickPositions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
     *
     */
    public Builder tickWidth(double value) {
      object.setTickWidth(value);
      return this;
    }

    /**
     * (Highcharts) Titles for yAxes are taken from xAxis.categories. All
     * options for <code>xAxis.labels</code> applies to parallel coordinates titles. For
     * example, to style categories, use xAxis.labels.style.
     *
     */
    public Builder title(@Nullable ChartParallelAxesTitleOptions value) {
      object.setTitle(value);
      return this;
    }

    /**
     * (Highcharts) Parallel coordinates only. Format that will be used for
     * point.y and available in tooltip.pointFormat as <code>{point.formattedValue}</code>.
     * If not set, <code>{point.formattedValue}</code> will use other options, in this
     * order:
     *
     * <ol>
     * <li>
     * yAxis.labels.format will be used if set
     *
     * </li>
     * <li>
     * If yAxis is a category, then category name will be displayed
     *
     * </li>
     * <li>
     * If yAxis is a datetime, then value will use the same format as yAxis
     * labels
     *
     * </li>
     * <li>
     * If yAxis is linear/logarithmic type, then simple value will be used
     *
     * </li>
     * </ol>
     */
    public Builder tooltipValueFormat(@Nullable String value) {
      object.setTooltipValueFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The top position of the Y axis. If it's a number,
     * it is interpreted as pixel position relative to the chart.
     *
     * Since Highcharts 2: If it's a percentage string, it is interpreted as
     * percentages of the plot height, offset from plot area top.
     *
     */
    public Builder top(double value) {
      object.setTop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The top position of the Y axis. If it's a number,
     * it is interpreted as pixel position relative to the chart.
     *
     * Since Highcharts 2: If it's a percentage string, it is interpreted as
     * percentages of the plot height, offset from plot area top.
     *
     */
    public Builder top(@Nullable String value) {
      object.setTop(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) The type of axis. Can be one of <code>linear</code>,
     * <code>logarithmic</code>, <code>datetime</code>, <code>category</code> or <code>treegrid</code>. Defaults to
     * <code>treegrid</code> for Gantt charts, <code>linear</code> for other chart types.
     *
     * In a datetime axis, the numbers are given in milliseconds, and tick marks
     * are placed on appropriate values, like full hours or days. In a category
     * or treegrid axis, the point names of the chart's series are used for
     * categories, if a categories array is not defined.
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

    /**
     * (Highcharts, Highstock) The width as the horizontal axis. If it's a
     * number, it is interpreted as pixels.
     *
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the total plot width.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The width as the horizontal axis. If it's a
     * number, it is interpreted as pixels.
     *
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the total plot width.
     *
     */
    public Builder width(@Nullable String value) {
      object.setWidth(value);
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
