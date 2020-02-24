package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import com.github.fluorumlabs.disconnect.types.DoubleKeyStringValue;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highstock) Options for the navigator Y axis. Default series options for the
 * navigator yAxis are:
 *
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis">https://api.highcharts.com/highstock/navigator.yAxis</a>
 *
 */
public interface NavigatorYAxisOptions extends Any {
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.alignTicks">https://api.highcharts.com/highcharts/navigator.yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.alignTicks">https://api.highcharts.com/highstock/navigator.yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.alignTicks">https://api.highcharts.com/gantt/navigator.yAxis.alignTicks</a>
   *
   * @implspec alignTicks?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.alignTicks">https://api.highcharts.com/highcharts/navigator.yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.alignTicks">https://api.highcharts.com/highstock/navigator.yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.alignTicks">https://api.highcharts.com/gantt/navigator.yAxis.alignTicks</a>
   *
   * @implspec alignTicks?: boolean;
   *
   */
  @JSProperty("alignTicks")
  void setAlignTicks(boolean value);

  /**
   * (Highstock) Whether to allow decimals in this axis' ticks. When counting
   * integers, like persons or hits on a web page, decimals should be avoided
   * in the labels.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.allowDecimals">https://api.highcharts.com/highstock/navigator.yAxis.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  boolean getAllowDecimals();

  /**
   * (Highstock) Whether to allow decimals in this axis' ticks. When counting
   * integers, like persons or hits on a web page, decimals should be avoided
   * in the labels.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.allowDecimals">https://api.highcharts.com/highstock/navigator.yAxis.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  void setAllowDecimals(boolean value);

  /**
   * (Highstock) When using an alternate grid color, a band is painted across
   * the plot area between every other grid line.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.alternateGridColor">https://api.highcharts.com/highstock/navigator.yAxis.alternateGridColor</a>
   *
   * @implspec alternateGridColor?: ColorString;
   *
   */
  @JSProperty("alternateGridColor")
  @Nullable
  String getAlternateGridColor();

  /**
   * (Highstock) When using an alternate grid color, a band is painted across
   * the plot area between every other grid line.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.alternateGridColor">https://api.highcharts.com/highstock/navigator.yAxis.alternateGridColor</a>
   *
   * @implspec alternateGridColor?: ColorString;
   *
   */
  @JSProperty("alternateGridColor")
  void setAlternateGridColor(String value);

  /**
   * (Highcharts) In a polar chart, this is the angle of the Y axis in
   * degrees, where 0 is up and 90 is right. The angle determines the position
   * of the axis line and the labels, though the coordinate system is
   * unaffected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.angle">https://api.highcharts.com/highcharts/navigator.yAxis.angle</a>
   *
   * @implspec angle?: number;
   *
   */
  @JSProperty("angle")
  double getAngle();

  /**
   * (Highcharts) In a polar chart, this is the angle of the Y axis in
   * degrees, where 0 is up and 90 is right. The angle determines the position
   * of the axis line and the labels, though the coordinate system is
   * unaffected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.angle">https://api.highcharts.com/highcharts/navigator.yAxis.angle</a>
   *
   * @implspec angle?: number;
   *
   */
  @JSProperty("angle")
  void setAngle(double value);

  /**
   * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
   * sections defined will be left out and all the points shifted closer to
   * each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.breaks">https://api.highcharts.com/highcharts/navigator.yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.breaks">https://api.highcharts.com/highstock/navigator.yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.breaks">https://api.highcharts.com/gantt/navigator.yAxis.breaks</a>
   *
   * @implspec breaks?: Array<NavigatorYAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  @Nullable
  Array<NavigatorYAxisBreaksOptions> getBreaks();

  /**
   * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
   * sections defined will be left out and all the points shifted closer to
   * each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.breaks">https://api.highcharts.com/highcharts/navigator.yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.breaks">https://api.highcharts.com/highstock/navigator.yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.breaks">https://api.highcharts.com/gantt/navigator.yAxis.breaks</a>
   *
   * @implspec breaks?: Array<NavigatorYAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  void setBreaks(Array<NavigatorYAxisBreaksOptions> value);

  /**
   * (Highcharts, Gantt) If categories are present for the xAxis, names are
   * used instead of numbers for that axis. Since Highcharts 3.0, categories
   * can also be extracted by giving each point a name and setting axis type
   * to <code>category</code>. However, if you have multiple series, best practice
   * remains defining the <code>categories</code> array.
   *
   * Example:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.categories">https://api.highcharts.com/highcharts/navigator.yAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.categories">https://api.highcharts.com/gantt/navigator.yAxis.categories</a>
   *
   * @implspec categories?: Array<string>;
   *
   */
  @JSProperty("categories")
  @Nullable
  String[] getCategories();

  /**
   * (Highcharts, Gantt) If categories are present for the xAxis, names are
   * used instead of numbers for that axis. Since Highcharts 3.0, categories
   * can also be extracted by giving each point a name and setting axis type
   * to <code>category</code>. However, if you have multiple series, best practice
   * remains defining the <code>categories</code> array.
   *
   * Example:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.categories">https://api.highcharts.com/highcharts/navigator.yAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.categories">https://api.highcharts.com/gantt/navigator.yAxis.categories</a>
   *
   * @implspec categories?: Array<string>;
   *
   */
  @JSProperty("categories")
  void setCategories(String[] value);

  /**
   * (Highcharts, Highstock, Gantt) The highest allowed value for
   * automatically computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.ceiling">https://api.highcharts.com/highcharts/navigator.yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.ceiling">https://api.highcharts.com/highstock/navigator.yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.ceiling">https://api.highcharts.com/gantt/navigator.yAxis.ceiling</a>
   *
   * @implspec ceiling?: number;
   *
   */
  @JSProperty("ceiling")
  double getCeiling();

  /**
   * (Highcharts, Highstock, Gantt) The highest allowed value for
   * automatically computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.ceiling">https://api.highcharts.com/highcharts/navigator.yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.ceiling">https://api.highcharts.com/highstock/navigator.yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.ceiling">https://api.highcharts.com/gantt/navigator.yAxis.ceiling</a>
   *
   * @implspec ceiling?: number;
   *
   */
  @JSProperty("ceiling")
  void setCeiling(double value);

  /**
   * (Highstock) A class name that opens for styling the axis by CSS,
   * especially in Highcharts styled mode. The class name is applied to group
   * elements for the grid, axis elements and labels.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.className">https://api.highcharts.com/highstock/navigator.yAxis.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highstock) A class name that opens for styling the axis by CSS,
   * especially in Highcharts styled mode. The class name is applied to group
   * elements for the grid, axis elements and labels.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.className">https://api.highcharts.com/highstock/navigator.yAxis.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highstock) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair">https://api.highcharts.com/highstock/navigator.yAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|NavigatorYAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  @Nullable
  Unknown getCrosshair();

  /**
   * (Highstock) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair">https://api.highcharts.com/highstock/navigator.yAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|NavigatorYAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

  /**
   * (Highstock) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair">https://api.highcharts.com/highstock/navigator.yAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|NavigatorYAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(NavigatorYAxisCrosshairOptions value);

  /**
   * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
   * automatically adjust to the appropriate unit. This member gives the
   * default string representations used for each unit. For intermediate
   * values, different units may be used, for example the <code>day</code> unit can be
   * used on midnight and <code>hour</code> unit be used for intermediate values on the
   * same axis. For an overview of the replacement codes, see dateFormat.
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/navigator.yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/navigator.yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/navigator.yAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: NavigatorYAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  NavigatorYAxisDateTimeLabelFormatsOptions getDateTimeLabelFormats();

  /**
   * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
   * automatically adjust to the appropriate unit. This member gives the
   * default string representations used for each unit. For intermediate
   * values, different units may be used, for example the <code>day</code> unit can be
   * used on midnight and <code>hour</code> unit be used for intermediate values on the
   * same axis. For an overview of the replacement codes, see dateFormat.
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/navigator.yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/navigator.yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/navigator.yAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: NavigatorYAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(NavigatorYAxisDateTimeLabelFormatsOptions value);

  /**
   * (Highstock) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.description">https://api.highcharts.com/highstock/navigator.yAxis.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highstock) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.description">https://api.highcharts.com/highstock/navigator.yAxis.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highstock) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.endOnTick">https://api.highcharts.com/highstock/navigator.yAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highstock) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.endOnTick">https://api.highcharts.com/highstock/navigator.yAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highstock) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.events">https://api.highcharts.com/highstock/navigator.yAxis.events</a>
   *
   * @implspec events?: NavigatorYAxisEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  NavigatorYAxisEventsOptions getEvents();

  /**
   * (Highstock) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.events">https://api.highcharts.com/highstock/navigator.yAxis.events</a>
   *
   * @implspec events?: NavigatorYAxisEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(NavigatorYAxisEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.floor">https://api.highcharts.com/highcharts/navigator.yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.floor">https://api.highcharts.com/highstock/navigator.yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.floor">https://api.highcharts.com/gantt/navigator.yAxis.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  double getFloor();

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.floor">https://api.highcharts.com/highcharts/navigator.yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.floor">https://api.highcharts.com/highstock/navigator.yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.floor">https://api.highcharts.com/gantt/navigator.yAxis.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.grid">https://api.highcharts.com/gantt/navigator.yAxis.grid</a>
   *
   * @implspec grid?: NavigatorYAxisGridOptions;
   *
   */
  @JSProperty("grid")
  @Nullable
  NavigatorYAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.grid">https://api.highcharts.com/gantt/navigator.yAxis.grid</a>
   *
   * @implspec grid?: NavigatorYAxisGridOptions;
   *
   */
  @JSProperty("grid")
  void setGrid(NavigatorYAxisGridOptions value);

  /**
   * (Highstock) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridLineColor">https://api.highcharts.com/highstock/navigator.yAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: ColorString;
   *
   */
  @JSProperty("gridLineColor")
  @Nullable
  String getGridLineColor();

  /**
   * (Highstock) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridLineColor">https://api.highcharts.com/highstock/navigator.yAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: ColorString;
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(String value);

  /**
   * (Highstock) The dash or dot style of the grid lines. For possible values,
   * see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridLineDashStyle">https://api.highcharts.com/highstock/navigator.yAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  @Nullable
  GridLineDashStyle getGridLineDashStyle();

  /**
   * (Highstock) The dash or dot style of the grid lines. For possible values,
   * see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridLineDashStyle">https://api.highcharts.com/highstock/navigator.yAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  void setGridLineDashStyle(GridLineDashStyle value);

  /**
   * (Highcharts) Polar charts only. Whether the grid lines should draw as a
   * polygon with straight lines between categories, or as circles. Can be
   * either <code>circle</code> or <code>polygon</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.gridLineInterpolation">https://api.highcharts.com/highcharts/navigator.yAxis.gridLineInterpolation</a>
   *
   * @implspec gridLineInterpolation?: (&quot;circle&quot;|&quot;polygon&quot;);
   *
   */
  @JSProperty("gridLineInterpolation")
  @Nullable
  GridLineInterpolation getGridLineInterpolation();

  /**
   * (Highcharts) Polar charts only. Whether the grid lines should draw as a
   * polygon with straight lines between categories, or as circles. Can be
   * either <code>circle</code> or <code>polygon</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.gridLineInterpolation">https://api.highcharts.com/highcharts/navigator.yAxis.gridLineInterpolation</a>
   *
   * @implspec gridLineInterpolation?: (&quot;circle&quot;|&quot;polygon&quot;);
   *
   */
  @JSProperty("gridLineInterpolation")
  void setGridLineInterpolation(GridLineInterpolation value);

  /**
   * (Highstock) The width of the grid lines extending the ticks across the
   * plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridLineWidth">https://api.highcharts.com/highstock/navigator.yAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  double getGridLineWidth();

  /**
   * (Highstock) The width of the grid lines extending the ticks across the
   * plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridLineWidth">https://api.highcharts.com/highstock/navigator.yAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  void setGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.gridZIndex">https://api.highcharts.com/highcharts/navigator.yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridZIndex">https://api.highcharts.com/highstock/navigator.yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.gridZIndex">https://api.highcharts.com/gantt/navigator.yAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.gridZIndex">https://api.highcharts.com/highcharts/navigator.yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.gridZIndex">https://api.highcharts.com/highstock/navigator.yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.gridZIndex">https://api.highcharts.com/gantt/navigator.yAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  void setGridZIndex(double value);

  /**
   * (Highstock) An id for the axis. This can be used after render time to get
   * a pointer to the axis object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.id">https://api.highcharts.com/highstock/navigator.yAxis.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highstock) An id for the axis. This can be used after render time to get
   * a pointer to the axis object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.id">https://api.highcharts.com/highstock/navigator.yAxis.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highstock) The axis labels show the number or category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.labels">https://api.highcharts.com/highstock/navigator.yAxis.labels</a>
   *
   * @implspec labels?: NavigatorYAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  NavigatorYAxisLabelsOptions getLabels();

  /**
   * (Highstock) The axis labels show the number or category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.labels">https://api.highcharts.com/highstock/navigator.yAxis.labels</a>
   *
   * @implspec labels?: NavigatorYAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(NavigatorYAxisLabelsOptions value);

  /**
   * (Highstock) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.lineColor">https://api.highcharts.com/highstock/navigator.yAxis.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.lineColor">https://api.highcharts.com/highstock/navigator.yAxis.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) The width of the line marking the axis itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.lineWidth">https://api.highcharts.com/highstock/navigator.yAxis.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The width of the line marking the axis itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.lineWidth">https://api.highcharts.com/highstock/navigator.yAxis.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) The maximum value of the axis. If <code>null</code>, the max value is
   * automatically calculated.
   *
   * If the endOnTick option is true, the <code>max</code> value might be rounded up.
   *
   * If a tickAmount is set, the axis may be extended beyond the set max in
   * order to reach the given number of ticks. The same may happen in a chart
   * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
   * is applied internally.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.max">https://api.highcharts.com/highstock/navigator.yAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * (Highstock) The maximum value of the axis. If <code>null</code>, the max value is
   * automatically calculated.
   *
   * If the endOnTick option is true, the <code>max</code> value might be rounded up.
   *
   * If a tickAmount is set, the axis may be extended beyond the set max in
   * order to reach the given number of ticks. The same may happen in a chart
   * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
   * is applied internally.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.max">https://api.highcharts.com/highstock/navigator.yAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highcharts) Solid gauge only. Unless stops are set, the color to
   * represent the maximum value of the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.maxColor">https://api.highcharts.com/highcharts/navigator.yAxis.maxColor</a>
   *
   * @implspec maxColor?: ColorString;
   *
   */
  @JSProperty("maxColor")
  @Nullable
  String getMaxColor();

  /**
   * (Highcharts) Solid gauge only. Unless stops are set, the color to
   * represent the maximum value of the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.maxColor">https://api.highcharts.com/highcharts/navigator.yAxis.maxColor</a>
   *
   * @implspec maxColor?: ColorString;
   *
   */
  @JSProperty("maxColor")
  void setMaxColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the highest data value to appear on
   * the edge of the plot area. When the axis' <code>max</code> option is set or a max
   * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
   * ignored.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.maxPadding">https://api.highcharts.com/highcharts/navigator.yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.maxPadding">https://api.highcharts.com/highstock/navigator.yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.maxPadding">https://api.highcharts.com/gantt/navigator.yAxis.maxPadding</a>
   *
   * @implspec maxPadding?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.maxPadding">https://api.highcharts.com/highcharts/navigator.yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.maxPadding">https://api.highcharts.com/highstock/navigator.yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.maxPadding">https://api.highcharts.com/gantt/navigator.yAxis.maxPadding</a>
   *
   * @implspec maxPadding?: number;
   *
   */
  @JSProperty("maxPadding")
  void setMaxPadding(double value);

  /**
   * (Highstock) The minimum value of the axis. If <code>null</code> the min value is
   * automatically calculated.
   *
   * If the startOnTick option is true (default), the <code>min</code> value might be
   * rounded down.
   *
   * The automatically calculated minimum value is also affected by floor,
   * softMin, minPadding, minRange as well as series.threshold and
   * series.softThreshold.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.min">https://api.highcharts.com/highstock/navigator.yAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * (Highstock) The minimum value of the axis. If <code>null</code> the min value is
   * automatically calculated.
   *
   * If the startOnTick option is true (default), the <code>min</code> value might be
   * rounded down.
   *
   * The automatically calculated minimum value is also affected by floor,
   * softMin, minPadding, minRange as well as series.threshold and
   * series.softThreshold.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.min">https://api.highcharts.com/highstock/navigator.yAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highcharts) Solid gauge only. Unless stops are set, the color to
   * represent the minimum value of the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.minColor">https://api.highcharts.com/highcharts/navigator.yAxis.minColor</a>
   *
   * @implspec minColor?: ColorString;
   *
   */
  @JSProperty("minColor")
  @Nullable
  String getMinColor();

  /**
   * (Highcharts) Solid gauge only. Unless stops are set, the color to
   * represent the minimum value of the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.minColor">https://api.highcharts.com/highcharts/navigator.yAxis.minColor</a>
   *
   * @implspec minColor?: ColorString;
   *
   */
  @JSProperty("minColor")
  void setMinColor(String value);

  /**
   * (Highstock) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineColor">https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineColor</a>
   *
   * @implspec minorGridLineColor?: ColorString;
   *
   */
  @JSProperty("minorGridLineColor")
  @Nullable
  String getMinorGridLineColor();

  /**
   * (Highstock) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineColor">https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineColor</a>
   *
   * @implspec minorGridLineColor?: ColorString;
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(String value);

  /**
   * (Highstock) The dash or dot style of the minor grid lines. For possible
   * values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineDashStyle</a>
   *
   * @implspec minorGridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("minorGridLineDashStyle")
  @Nullable
  MinorGridLineDashStyle getMinorGridLineDashStyle();

  /**
   * (Highstock) The dash or dot style of the minor grid lines. For possible
   * values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineDashStyle</a>
   *
   * @implspec minorGridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("minorGridLineDashStyle")
  void setMinorGridLineDashStyle(MinorGridLineDashStyle value);

  /**
   * (Highstock) Width of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineWidth">https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  double getMinorGridLineWidth();

  /**
   * (Highstock) Width of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineWidth">https://api.highcharts.com/highstock/navigator.yAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highstock) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickColor">https://api.highcharts.com/highstock/navigator.yAxis.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  String getMinorTickColor();

  /**
   * (Highstock) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickColor">https://api.highcharts.com/highstock/navigator.yAxis.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(String value);

  /**
   * (Highstock) Specific tick interval in axis units for the minor ticks. On
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickInterval">https://api.highcharts.com/highstock/navigator.yAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  @Nullable
  Unknown getMinorTickInterval();

  /**
   * (Highstock) Specific tick interval in axis units for the minor ticks. On
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickInterval">https://api.highcharts.com/highstock/navigator.yAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(double value);

  /**
   * (Highstock) Specific tick interval in axis units for the minor ticks. On
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickInterval">https://api.highcharts.com/highstock/navigator.yAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(String value);

  /**
   * (Highstock) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickLength">https://api.highcharts.com/highstock/navigator.yAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highstock) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickLength">https://api.highcharts.com/highstock/navigator.yAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  void setMinorTickLength(double value);

  /**
   * (Highstock) The position of the minor tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickPosition">https://api.highcharts.com/highstock/navigator.yAxis.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  @Nullable
  MinorTickPosition getMinorTickPosition();

  /**
   * (Highstock) The position of the minor tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickPosition">https://api.highcharts.com/highstock/navigator.yAxis.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  void setMinorTickPosition(MinorTickPosition value);

  /**
   * (Highstock) Enable or disable minor ticks. Unless minorTickInterval is
   * set, the tick interval is calculated as a fifth of the <code>tickInterval</code>.
   *
   * On a logarithmic axis, minor ticks are laid out based on a best guess,
   * attempting to enter approximately 5 minor ticks between each major tick.
   *
   * Prior to v6.0.0, ticks were unabled in auto layout by setting
   * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTicks">https://api.highcharts.com/highstock/navigator.yAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  boolean getMinorTicks();

  /**
   * (Highstock) Enable or disable minor ticks. Unless minorTickInterval is
   * set, the tick interval is calculated as a fifth of the <code>tickInterval</code>.
   *
   * On a logarithmic axis, minor ticks are laid out based on a best guess,
   * attempting to enter approximately 5 minor ticks between each major tick.
   *
   * Prior to v6.0.0, ticks were unabled in auto layout by setting
   * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTicks">https://api.highcharts.com/highstock/navigator.yAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highstock) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickWidth">https://api.highcharts.com/highstock/navigator.yAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highstock) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minorTickWidth">https://api.highcharts.com/highstock/navigator.yAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.minPadding">https://api.highcharts.com/highcharts/navigator.yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minPadding">https://api.highcharts.com/highstock/navigator.yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.minPadding">https://api.highcharts.com/gantt/navigator.yAxis.minPadding</a>
   *
   * @implspec minPadding?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.minPadding">https://api.highcharts.com/highcharts/navigator.yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minPadding">https://api.highcharts.com/highstock/navigator.yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.minPadding">https://api.highcharts.com/gantt/navigator.yAxis.minPadding</a>
   *
   * @implspec minPadding?: number;
   *
   */
  @JSProperty("minPadding")
  void setMinPadding(double value);

  /**
   * (Highstock) The minimum tick interval allowed in axis values. For example
   * on zooming in on an axis with daily data, this can be used to prevent the
   * axis from showing hours. Defaults to the closest distance between two
   * points on the axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minTickInterval">https://api.highcharts.com/highstock/navigator.yAxis.minTickInterval</a>
   *
   * @implspec minTickInterval?: number;
   *
   */
  @JSProperty("minTickInterval")
  double getMinTickInterval();

  /**
   * (Highstock) The minimum tick interval allowed in axis values. For example
   * on zooming in on an axis with daily data, this can be used to prevent the
   * axis from showing hours. Defaults to the closest distance between two
   * points on the axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.minTickInterval">https://api.highcharts.com/highstock/navigator.yAxis.minTickInterval</a>
   *
   * @implspec minTickInterval?: number;
   *
   */
  @JSProperty("minTickInterval")
  void setMinTickInterval(double value);

  /**
   * (Highstock) The distance in pixels from the plot area to the axis line. A
   * positive offset moves the axis with it's line, labels and ticks away from
   * the plot area. This is typically used when two or more axes are displayed
   * on the same side of the plot. With multiple axes the offset is
   * dynamically adjusted to avoid collision, this can be overridden by
   * setting offset explicitly.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.offset">https://api.highcharts.com/highstock/navigator.yAxis.offset</a>
   *
   * @implspec offset?: number;
   *
   */
  @JSProperty("offset")
  double getOffset();

  /**
   * (Highstock) The distance in pixels from the plot area to the axis line. A
   * positive offset moves the axis with it's line, labels and ticks away from
   * the plot area. This is typically used when two or more axes are displayed
   * on the same side of the plot. With multiple axes the offset is
   * dynamically adjusted to avoid collision, this can be overridden by
   * setting offset explicitly.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.offset">https://api.highcharts.com/highstock/navigator.yAxis.offset</a>
   *
   * @implspec offset?: number;
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.opposite">https://api.highcharts.com/highstock/navigator.yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.opposite">https://api.highcharts.com/highcharts/navigator.yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.opposite">https://api.highcharts.com/gantt/navigator.yAxis.opposite</a>
   *
   * @implspec opposite?: boolean;
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.opposite">https://api.highcharts.com/highstock/navigator.yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.opposite">https://api.highcharts.com/highcharts/navigator.yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.opposite">https://api.highcharts.com/gantt/navigator.yAxis.opposite</a>
   *
   * @implspec opposite?: boolean;
   *
   */
  @JSProperty("opposite")
  void setOpposite(boolean value);

  /**
   * (Highcharts) Refers to the index in the panes array. Used for circular
   * gauges and polar charts. When the option is not set then first pane will
   * be used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.pane">https://api.highcharts.com/highcharts/navigator.yAxis.pane</a>
   *
   * @implspec pane?: number;
   *
   */
  @JSProperty("pane")
  double getPane();

  /**
   * (Highcharts) Refers to the index in the panes array. Used for circular
   * gauges and polar charts. When the option is not set then first pane will
   * be used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.pane">https://api.highcharts.com/highcharts/navigator.yAxis.pane</a>
   *
   * @implspec pane?: number;
   *
   */
  @JSProperty("pane")
  void setPane(double value);

  /**
   * (Highcharts, Highstock, Gantt) An array of objects defining plot bands on
   * the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands">https://api.highcharts.com/highstock/navigator.yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands">https://api.highcharts.com/gantt/navigator.yAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<NavigatorYAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  @Nullable
  Array<NavigatorYAxisPlotBandsOptions> getPlotBands();

  /**
   * (Highcharts, Highstock, Gantt) An array of objects defining plot bands on
   * the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands">https://api.highcharts.com/highstock/navigator.yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands">https://api.highcharts.com/gantt/navigator.yAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<NavigatorYAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  void setPlotBands(Array<NavigatorYAxisPlotBandsOptions> value);

  /**
   * (Highcharts, Highstock, Gantt) An array of objects representing plot
   * lines on the X axis
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines">https://api.highcharts.com/highstock/navigator.yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines">https://api.highcharts.com/gantt/navigator.yAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<NavigatorYAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  @Nullable
  Array<NavigatorYAxisPlotLinesOptions> getPlotLines();

  /**
   * (Highcharts, Highstock, Gantt) An array of objects representing plot
   * lines on the X axis
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotLines">https://api.highcharts.com/highcharts/navigator.yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotLines">https://api.highcharts.com/highstock/navigator.yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotLines">https://api.highcharts.com/gantt/navigator.yAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<NavigatorYAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  void setPlotLines(Array<NavigatorYAxisPlotLinesOptions> value);

  /**
   * (Highstock) Whether to reverse the axis so that the highest number is
   * closest to the origin.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.reversed">https://api.highcharts.com/highstock/navigator.yAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highstock) Whether to reverse the axis so that the highest number is
   * closest to the origin.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.reversed">https://api.highcharts.com/highstock/navigator.yAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highcharts, Highstock) If <code>true</code>, the first series in a stack will be
   * drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first
   * series is in the base of the stack.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.reversedStacks">https://api.highcharts.com/highcharts/navigator.yAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.reversedStacks">https://api.highcharts.com/highstock/navigator.yAxis.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
   *
   */
  @JSProperty("reversedStacks")
  boolean getReversedStacks();

  /**
   * (Highcharts, Highstock) If <code>true</code>, the first series in a stack will be
   * drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first
   * series is in the base of the stack.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.reversedStacks">https://api.highcharts.com/highcharts/navigator.yAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.reversedStacks">https://api.highcharts.com/highstock/navigator.yAxis.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
   *
   */
  @JSProperty("reversedStacks")
  void setReversedStacks(boolean value);

  /**
   * (Highstock) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.showFirstLabel">https://api.highcharts.com/highstock/navigator.yAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highstock) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.showFirstLabel">https://api.highcharts.com/highstock/navigator.yAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  void setShowFirstLabel(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
   * Defaults to <code>true</code> on cartesian charts, and <code>false</code> on polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.showLastLabel">https://api.highcharts.com/highcharts/navigator.yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.showLastLabel">https://api.highcharts.com/highstock/navigator.yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.showLastLabel">https://api.highcharts.com/gantt/navigator.yAxis.showLastLabel</a>
   *
   * @implspec showLastLabel?: boolean;
   *
   */
  @JSProperty("showLastLabel")
  boolean getShowLastLabel();

  /**
   * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
   * Defaults to <code>true</code> on cartesian charts, and <code>false</code> on polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.showLastLabel">https://api.highcharts.com/highcharts/navigator.yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.showLastLabel">https://api.highcharts.com/highstock/navigator.yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.showLastLabel">https://api.highcharts.com/gantt/navigator.yAxis.showLastLabel</a>
   *
   * @implspec showLastLabel?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.softMax">https://api.highcharts.com/highcharts/navigator.yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.softMax">https://api.highcharts.com/highstock/navigator.yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.softMax">https://api.highcharts.com/gantt/navigator.yAxis.softMax</a>
   *
   * @implspec softMax?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.softMax">https://api.highcharts.com/highcharts/navigator.yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.softMax">https://api.highcharts.com/highstock/navigator.yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.softMax">https://api.highcharts.com/gantt/navigator.yAxis.softMax</a>
   *
   * @implspec softMax?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.softMin">https://api.highcharts.com/highcharts/navigator.yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.softMin">https://api.highcharts.com/highstock/navigator.yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.softMin">https://api.highcharts.com/gantt/navigator.yAxis.softMin</a>
   *
   * @implspec softMin?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.softMin">https://api.highcharts.com/highcharts/navigator.yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.softMin">https://api.highcharts.com/highstock/navigator.yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.softMin">https://api.highcharts.com/gantt/navigator.yAxis.softMin</a>
   *
   * @implspec softMin?: number;
   *
   */
  @JSProperty("softMin")
  void setSoftMin(double value);

  /**
   * (Highcharts) The stack labels show the total value for each bar in a
   * stacked column or bar chart. The label will be placed on top of positive
   * columns and below negative columns. In case of an inverted column chart
   * or a bar chart the label is placed to the right of positive bars and to
   * the left of negative bars.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels</a>
   *
   * @implspec stackLabels?: NavigatorYAxisStackLabelsOptions;
   *
   */
  @JSProperty("stackLabels")
  @Nullable
  NavigatorYAxisStackLabelsOptions getStackLabels();

  /**
   * (Highcharts) The stack labels show the total value for each bar in a
   * stacked column or bar chart. The label will be placed on top of positive
   * columns and below negative columns. In case of an inverted column chart
   * or a bar chart the label is placed to the right of positive bars and to
   * the left of negative bars.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels">https://api.highcharts.com/highcharts/navigator.yAxis.stackLabels</a>
   *
   * @implspec stackLabels?: NavigatorYAxisStackLabelsOptions;
   *
   */
  @JSProperty("stackLabels")
  void setStackLabels(NavigatorYAxisStackLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
   * put the tick between weeks. 0 = Sunday, 1 = Monday.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.startOfWeek">https://api.highcharts.com/highcharts/navigator.yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.startOfWeek">https://api.highcharts.com/highstock/navigator.yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.startOfWeek">https://api.highcharts.com/gantt/navigator.yAxis.startOfWeek</a>
   *
   * @implspec startOfWeek?: number;
   *
   */
  @JSProperty("startOfWeek")
  double getStartOfWeek();

  /**
   * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
   * put the tick between weeks. 0 = Sunday, 1 = Monday.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.startOfWeek">https://api.highcharts.com/highcharts/navigator.yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.startOfWeek">https://api.highcharts.com/highstock/navigator.yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.startOfWeek">https://api.highcharts.com/gantt/navigator.yAxis.startOfWeek</a>
   *
   * @implspec startOfWeek?: number;
   *
   */
  @JSProperty("startOfWeek")
  void setStartOfWeek(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * start.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.startOnTick">https://api.highcharts.com/highcharts/navigator.yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.startOnTick">https://api.highcharts.com/highstock/navigator.yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.startOnTick">https://api.highcharts.com/gantt/navigator.yAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * start.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.startOnTick">https://api.highcharts.com/highcharts/navigator.yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.startOnTick">https://api.highcharts.com/highstock/navigator.yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.startOnTick">https://api.highcharts.com/gantt/navigator.yAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
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
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.staticScale">https://api.highcharts.com/gantt/navigator.yAxis.staticScale</a>
   *
   * @implspec staticScale?: number;
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
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.staticScale">https://api.highcharts.com/gantt/navigator.yAxis.staticScale</a>
   *
   * @implspec staticScale?: number;
   *
   */
  @JSProperty("staticScale")
  void setStaticScale(double value);

  /**
   * (Highcharts) Solid gauge series only. Color stops for the solid gauge.
   * Use this in cases where a linear gradient between a <code>minColor</code> and
   * <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the
   * first item is a float between 0 and 1 assigning the relative position in
   * the gradient, and the second item is the color.
   *
   * For solid gauges, the Y axis also inherits the concept of data classes
   * from the Highmaps color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stops">https://api.highcharts.com/highcharts/navigator.yAxis.stops</a>
   *
   * @implspec stops?: Array&lt;[number, ColorString]&gt;;
   *
   */
  @JSProperty("stops")
  @Nullable
  Array<DoubleKeyStringValue> getStops();

  /**
   * (Highcharts) Solid gauge series only. Color stops for the solid gauge.
   * Use this in cases where a linear gradient between a <code>minColor</code> and
   * <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the
   * first item is a float between 0 and 1 assigning the relative position in
   * the gradient, and the second item is the color.
   *
   * For solid gauges, the Y axis also inherits the concept of data classes
   * from the Highmaps color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.stops">https://api.highcharts.com/highcharts/navigator.yAxis.stops</a>
   *
   * @implspec stops?: Array&lt;[number, ColorString]&gt;;
   *
   */
  @JSProperty("stops")
  void setStops(Array<DoubleKeyStringValue> value);

  /**
   * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
   * This opens up for aligning the ticks of multiple charts or panes within a
   * chart. This option overrides the <code>tickPixelInterval</code> option.
   *
   * This option only has an effect on linear axes. Datetime, logarithmic or
   * category axes are not affected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tickAmount">https://api.highcharts.com/highcharts/navigator.yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickAmount">https://api.highcharts.com/highstock/navigator.yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.tickAmount">https://api.highcharts.com/gantt/navigator.yAxis.tickAmount</a>
   *
   * @implspec tickAmount?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tickAmount">https://api.highcharts.com/highcharts/navigator.yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickAmount">https://api.highcharts.com/highstock/navigator.yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.tickAmount">https://api.highcharts.com/gantt/navigator.yAxis.tickAmount</a>
   *
   * @implspec tickAmount?: number;
   *
   */
  @JSProperty("tickAmount")
  void setTickAmount(double value);

  /**
   * (Highstock) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickColor">https://api.highcharts.com/highstock/navigator.yAxis.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  @Nullable
  String getTickColor();

  /**
   * (Highstock) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickColor">https://api.highcharts.com/highstock/navigator.yAxis.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  void setTickColor(String value);

  /**
   * (Highstock) The interval of the tick marks in axis units. When
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickInterval">https://api.highcharts.com/highstock/navigator.yAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  double getTickInterval();

  /**
   * (Highstock) The interval of the tick marks in axis units. When
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickInterval">https://api.highcharts.com/highstock/navigator.yAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highstock) The pixel length of the main tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickLength">https://api.highcharts.com/highstock/navigator.yAxis.tickLength</a>
   *
   * @implspec tickLength?: number;
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highstock) The pixel length of the main tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickLength">https://api.highcharts.com/highstock/navigator.yAxis.tickLength</a>
   *
   * @implspec tickLength?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/navigator.yAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.tickmarkPlacement">https://api.highcharts.com/gantt/navigator.yAxis.tickmarkPlacement</a>
   *
   * @implspec tickmarkPlacement?: (&quot;between&quot;|&quot;on&quot;|undefined);
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/navigator.yAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.tickmarkPlacement">https://api.highcharts.com/gantt/navigator.yAxis.tickmarkPlacement</a>
   *
   * @implspec tickmarkPlacement?: (&quot;between&quot;|&quot;on&quot;|undefined);
   *
   */
  @JSProperty("tickmarkPlacement")
  void setTickmarkPlacement(TickmarkPlacement value);

  /**
   * (Highstock) If tickInterval is <code>null</code> this option sets the approximate
   * pixel interval of the tick marks. Not applicable to categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPixelInterval">https://api.highcharts.com/highstock/navigator.yAxis.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  double getTickPixelInterval();

  /**
   * (Highstock) If tickInterval is <code>null</code> this option sets the approximate
   * pixel interval of the tick marks. Not applicable to categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPixelInterval">https://api.highcharts.com/highstock/navigator.yAxis.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  void setTickPixelInterval(double value);

  /**
   * (Highstock) The position of the major tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPosition">https://api.highcharts.com/highstock/navigator.yAxis.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  @Nullable
  TickPosition getTickPosition();

  /**
   * (Highstock) The position of the major tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPosition">https://api.highcharts.com/highstock/navigator.yAxis.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  void setTickPosition(TickPosition value);

  /**
   * (Highstock) A callback function returning array defining where the ticks
   * are laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPositioner">https://api.highcharts.com/highstock/navigator.yAxis.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  @Nullable
  TickPositioner getTickPositioner();

  /**
   * (Highstock) A callback function returning array defining where the ticks
   * are laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPositioner">https://api.highcharts.com/highstock/navigator.yAxis.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  void setTickPositioner(TickPositioner value);

  /**
   * (Highstock) An array defining where the ticks are laid out on the axis.
   * This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPositions">https://api.highcharts.com/highstock/navigator.yAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  @Nullable
  double[] getTickPositions();

  /**
   * (Highstock) An array defining where the ticks are laid out on the axis.
   * This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickPositions">https://api.highcharts.com/highstock/navigator.yAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tickWidth">https://api.highcharts.com/highcharts/navigator.yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickWidth">https://api.highcharts.com/highstock/navigator.yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.tickWidth">https://api.highcharts.com/gantt/navigator.yAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tickWidth">https://api.highcharts.com/highcharts/navigator.yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.tickWidth">https://api.highcharts.com/highstock/navigator.yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.tickWidth">https://api.highcharts.com/gantt/navigator.yAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highstock) The axis title, showing next to the axis line.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.title">https://api.highcharts.com/highstock/navigator.yAxis.title</a>
   *
   * @implspec title?: NavigatorYAxisTitleOptions;
   *
   */
  @JSProperty("title")
  @Nullable
  NavigatorYAxisTitleOptions getTitle();

  /**
   * (Highstock) The axis title, showing next to the axis line.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.title">https://api.highcharts.com/highstock/navigator.yAxis.title</a>
   *
   * @implspec title?: NavigatorYAxisTitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(NavigatorYAxisTitleOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tooltipValueFormat">https://api.highcharts.com/highcharts/navigator.yAxis.tooltipValueFormat</a>
   *
   * @implspec tooltipValueFormat?: string;
   *
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.tooltipValueFormat">https://api.highcharts.com/highcharts/navigator.yAxis.tooltipValueFormat</a>
   *
   * @implspec tooltipValueFormat?: string;
   *
   */
  @JSProperty("tooltipValueFormat")
  void setTooltipValueFormat(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.type">https://api.highcharts.com/highcharts/navigator.yAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.type">https://api.highcharts.com/gantt/navigator.yAxis.type</a>
   *
   * @implspec type?: (&quot;category&quot;|&quot;datetime&quot;|&quot;linear&quot;|&quot;logarithmic&quot;|&quot;treegrid&quot;);
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.type">https://api.highcharts.com/highcharts/navigator.yAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.type">https://api.highcharts.com/gantt/navigator.yAxis.type</a>
   *
   * @implspec type?: (&quot;category&quot;|&quot;datetime&quot;|&quot;linear&quot;|&quot;logarithmic&quot;|&quot;treegrid&quot;);
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   * (Highcharts, Gantt) Applies only when the axis <code>type</code> is <code>category</code>. When
   * <code>uniqueNames</code> is true, points are placed on the X axis according to their
   * names. If the same point name is repeated in the same or another series,
   * the point is placed on the same X position as other points of the same
   * name. When <code>uniqueNames</code> is false, the points are laid out in increasing
   * X positions regardless of their names, and the X axis category will take
   * the name of the last point in each position.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.uniqueNames">https://api.highcharts.com/highcharts/navigator.yAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.uniqueNames">https://api.highcharts.com/gantt/navigator.yAxis.uniqueNames</a>
   *
   * @implspec uniqueNames?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.uniqueNames">https://api.highcharts.com/highcharts/navigator.yAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.uniqueNames">https://api.highcharts.com/gantt/navigator.yAxis.uniqueNames</a>
   *
   * @implspec uniqueNames?: boolean;
   *
   */
  @JSProperty("uniqueNames")
  void setUniqueNames(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
   * ticks and labels, should be visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.visible">https://api.highcharts.com/highcharts/navigator.yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.visible">https://api.highcharts.com/highstock/navigator.yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.visible">https://api.highcharts.com/gantt/navigator.yAxis.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
   * ticks and labels, should be visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.visible">https://api.highcharts.com/highcharts/navigator.yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.visible">https://api.highcharts.com/highstock/navigator.yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.visible">https://api.highcharts.com/gantt/navigator.yAxis.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   */
  abstract class GridLineDashStyle extends JsEnum {
    public static final GridLineDashStyle DASH = JsEnum.of("Dash");

    public static final GridLineDashStyle DASHDOT = JsEnum.of("DashDot");

    public static final GridLineDashStyle DOT = JsEnum.of("Dot");

    public static final GridLineDashStyle LONGDASH = JsEnum.of("LongDash");

    public static final GridLineDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final GridLineDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final GridLineDashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final GridLineDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final GridLineDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final GridLineDashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final GridLineDashStyle SOLID = JsEnum.of("Solid");
  }

  /**
   */
  abstract class GridLineInterpolation extends JsEnum {
    public static final GridLineInterpolation CIRCLE = JsEnum.of("circle");

    public static final GridLineInterpolation POLYGON = JsEnum.of("polygon");
  }

  /**
   */
  abstract class MinorGridLineDashStyle extends JsEnum {
    public static final MinorGridLineDashStyle DASH = JsEnum.of("Dash");

    public static final MinorGridLineDashStyle DASHDOT = JsEnum.of("DashDot");

    public static final MinorGridLineDashStyle DOT = JsEnum.of("Dot");

    public static final MinorGridLineDashStyle LONGDASH = JsEnum.of("LongDash");

    public static final MinorGridLineDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final MinorGridLineDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final MinorGridLineDashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final MinorGridLineDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final MinorGridLineDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final MinorGridLineDashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final MinorGridLineDashStyle SOLID = JsEnum.of("Solid");
  }

  /**
   */
  abstract class MinorTickPosition extends JsEnum {
    public static final MinorTickPosition INSIDE = JsEnum.of("inside");

    public static final MinorTickPosition OUTSIDE = JsEnum.of("outside");
  }

  /**
   */
  abstract class TickmarkPlacement extends JsEnum {
    public static final TickmarkPlacement BETWEEN = JsEnum.of("between");

    public static final TickmarkPlacement ON = JsEnum.of("on");
  }

  /**
   */
  abstract class TickPosition extends JsEnum {
    public static final TickPosition INSIDE = JsEnum.of("inside");

    public static final TickPosition OUTSIDE = JsEnum.of("outside");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface TickPositioner extends Any {
    void apply();
  }

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type CATEGORY = JsEnum.of("category");

    public static final Type DATETIME = JsEnum.of("datetime");

    public static final Type LINEAR = JsEnum.of("linear");

    public static final Type LOGARITHMIC = JsEnum.of("logarithmic");

    public static final Type TREEGRID = JsEnum.of("treegrid");
  }
}
