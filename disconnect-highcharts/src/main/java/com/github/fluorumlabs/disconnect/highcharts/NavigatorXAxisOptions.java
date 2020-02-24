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
 * (Highstock) Options for the navigator X axis. Default series options for the
 * navigator xAxis are:
 *
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis">https://api.highcharts.com/highstock/navigator.xAxis</a>
 *
 */
public interface NavigatorXAxisOptions extends Any {
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.alignTicks">https://api.highcharts.com/highcharts/navigator.xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.alignTicks">https://api.highcharts.com/highstock/navigator.xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.alignTicks">https://api.highcharts.com/gantt/navigator.xAxis.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.alignTicks">https://api.highcharts.com/highcharts/navigator.xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.alignTicks">https://api.highcharts.com/highstock/navigator.xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.alignTicks">https://api.highcharts.com/gantt/navigator.xAxis.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.allowDecimals">https://api.highcharts.com/highstock/navigator.xAxis.allowDecimals</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.allowDecimals">https://api.highcharts.com/highstock/navigator.xAxis.allowDecimals</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.alternateGridColor">https://api.highcharts.com/highstock/navigator.xAxis.alternateGridColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.alternateGridColor">https://api.highcharts.com/highstock/navigator.xAxis.alternateGridColor</a>
   *
   * @implspec alternateGridColor?: ColorString;
   *
   */
  @JSProperty("alternateGridColor")
  void setAlternateGridColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
   * sections defined will be left out and all the points shifted closer to
   * each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.breaks">https://api.highcharts.com/highcharts/navigator.xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.breaks">https://api.highcharts.com/highstock/navigator.xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.breaks">https://api.highcharts.com/gantt/navigator.xAxis.breaks</a>
   *
   * @implspec breaks?: Array<NavigatorXAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  @Nullable
  Array<NavigatorXAxisBreaksOptions> getBreaks();

  /**
   * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
   * sections defined will be left out and all the points shifted closer to
   * each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.breaks">https://api.highcharts.com/highcharts/navigator.xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.breaks">https://api.highcharts.com/highstock/navigator.xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.breaks">https://api.highcharts.com/gantt/navigator.xAxis.breaks</a>
   *
   * @implspec breaks?: Array<NavigatorXAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  void setBreaks(Array<NavigatorXAxisBreaksOptions> value);

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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.categories">https://api.highcharts.com/highcharts/navigator.xAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.categories">https://api.highcharts.com/gantt/navigator.xAxis.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.categories">https://api.highcharts.com/highcharts/navigator.xAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.categories">https://api.highcharts.com/gantt/navigator.xAxis.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.ceiling">https://api.highcharts.com/highcharts/navigator.xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.ceiling">https://api.highcharts.com/highstock/navigator.xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.ceiling">https://api.highcharts.com/gantt/navigator.xAxis.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.ceiling">https://api.highcharts.com/highcharts/navigator.xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.ceiling">https://api.highcharts.com/highstock/navigator.xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.ceiling">https://api.highcharts.com/gantt/navigator.xAxis.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.className">https://api.highcharts.com/highstock/navigator.xAxis.className</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.className">https://api.highcharts.com/highstock/navigator.xAxis.className</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.crosshair">https://api.highcharts.com/highstock/navigator.xAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|NavigatorXAxisCrosshairOptions);
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.crosshair">https://api.highcharts.com/highstock/navigator.xAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|NavigatorXAxisCrosshairOptions);
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.crosshair">https://api.highcharts.com/highstock/navigator.xAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|NavigatorXAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(NavigatorXAxisCrosshairOptions value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|NavigatorXAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  @Nullable
  Unknown getCurrentDateIndicator();

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|NavigatorXAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(boolean value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator">https://api.highcharts.com/gantt/navigator.xAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|NavigatorXAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(NavigatorXAxisCurrentDateIndicatorOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/navigator.xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/navigator.xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/navigator.xAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: NavigatorXAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  NavigatorXAxisDateTimeLabelFormatsOptions getDateTimeLabelFormats();

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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/navigator.xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/navigator.xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/navigator.xAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: NavigatorXAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(NavigatorXAxisDateTimeLabelFormatsOptions value);

  /**
   * (Highstock) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.description">https://api.highcharts.com/highstock/navigator.xAxis.description</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.description">https://api.highcharts.com/highstock/navigator.xAxis.description</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.endOnTick">https://api.highcharts.com/highstock/navigator.xAxis.endOnTick</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.endOnTick">https://api.highcharts.com/highstock/navigator.xAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highstock) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.events">https://api.highcharts.com/highstock/navigator.xAxis.events</a>
   *
   * @implspec events?: NavigatorXAxisEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  NavigatorXAxisEventsOptions getEvents();

  /**
   * (Highstock) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.events">https://api.highcharts.com/highstock/navigator.xAxis.events</a>
   *
   * @implspec events?: NavigatorXAxisEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(NavigatorXAxisEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.floor">https://api.highcharts.com/highcharts/navigator.xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.floor">https://api.highcharts.com/highstock/navigator.xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.floor">https://api.highcharts.com/gantt/navigator.xAxis.floor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.floor">https://api.highcharts.com/highcharts/navigator.xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.floor">https://api.highcharts.com/highstock/navigator.xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.floor">https://api.highcharts.com/gantt/navigator.xAxis.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.grid">https://api.highcharts.com/gantt/navigator.xAxis.grid</a>
   *
   * @implspec grid?: NavigatorXAxisGridOptions;
   *
   */
  @JSProperty("grid")
  @Nullable
  NavigatorXAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.grid">https://api.highcharts.com/gantt/navigator.xAxis.grid</a>
   *
   * @implspec grid?: NavigatorXAxisGridOptions;
   *
   */
  @JSProperty("grid")
  void setGrid(NavigatorXAxisGridOptions value);

  /**
   * (Highstock) Color of the grid lines extending the ticks across the plot
   * area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridLineColor">https://api.highcharts.com/highstock/navigator.xAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: string;
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridLineColor">https://api.highcharts.com/highstock/navigator.xAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: string;
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(String value);

  /**
   * (Highstock) The dash or dot style of the grid lines. For possible values,
   * see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridLineDashStyle">https://api.highcharts.com/highstock/navigator.xAxis.gridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridLineDashStyle">https://api.highcharts.com/highstock/navigator.xAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  void setGridLineDashStyle(GridLineDashStyle value);

  /**
   * (Highstock) The width of the grid lines extending the ticks across the
   * plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridLineWidth">https://api.highcharts.com/highstock/navigator.xAxis.gridLineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridLineWidth">https://api.highcharts.com/highstock/navigator.xAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  void setGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.gridZIndex">https://api.highcharts.com/highcharts/navigator.xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridZIndex">https://api.highcharts.com/highstock/navigator.xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.gridZIndex">https://api.highcharts.com/gantt/navigator.xAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.gridZIndex">https://api.highcharts.com/highcharts/navigator.xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.gridZIndex">https://api.highcharts.com/highstock/navigator.xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.gridZIndex">https://api.highcharts.com/gantt/navigator.xAxis.gridZIndex</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.id">https://api.highcharts.com/highstock/navigator.xAxis.id</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.id">https://api.highcharts.com/highstock/navigator.xAxis.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highstock) The axis labels show the number or category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.labels">https://api.highcharts.com/highstock/navigator.xAxis.labels</a>
   *
   * @implspec labels?: NavigatorXAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  NavigatorXAxisLabelsOptions getLabels();

  /**
   * (Highstock) The axis labels show the number or category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.labels">https://api.highcharts.com/highstock/navigator.xAxis.labels</a>
   *
   * @implspec labels?: NavigatorXAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(NavigatorXAxisLabelsOptions value);

  /**
   * (Highstock) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.lineColor">https://api.highcharts.com/highstock/navigator.xAxis.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.lineColor">https://api.highcharts.com/highstock/navigator.xAxis.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.lineWidth">https://api.highcharts.com/highstock/navigator.xAxis.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.lineWidth">https://api.highcharts.com/highstock/navigator.xAxis.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.max">https://api.highcharts.com/highstock/navigator.xAxis.max</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.max">https://api.highcharts.com/highstock/navigator.xAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highstock) Padding of the max value relative to the length of the axis.
   * A padding of 0.05 will make a 100px axis 5px longer. This is useful when
   * you don't want the highest data value to appear on the edge of the plot
   * area. When the axis' <code>max</code> option is set or a max extreme is set using
   * <code>axis.setExtremes()</code>, the maxPadding will be ignored.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.maxPadding">https://api.highcharts.com/highstock/navigator.xAxis.maxPadding</a>
   *
   * @implspec maxPadding?: number;
   *
   */
  @JSProperty("maxPadding")
  double getMaxPadding();

  /**
   * (Highstock) Padding of the max value relative to the length of the axis.
   * A padding of 0.05 will make a 100px axis 5px longer. This is useful when
   * you don't want the highest data value to appear on the edge of the plot
   * area. When the axis' <code>max</code> option is set or a max extreme is set using
   * <code>axis.setExtremes()</code>, the maxPadding will be ignored.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.maxPadding">https://api.highcharts.com/highstock/navigator.xAxis.maxPadding</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.min">https://api.highcharts.com/highstock/navigator.xAxis.min</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.min">https://api.highcharts.com/highstock/navigator.xAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highstock) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineColor">https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineColor">https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineWidth">https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineWidth">https://api.highcharts.com/highstock/navigator.xAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highstock) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickColor">https://api.highcharts.com/highstock/navigator.xAxis.minorTickColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickColor">https://api.highcharts.com/highstock/navigator.xAxis.minorTickColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickInterval">https://api.highcharts.com/highstock/navigator.xAxis.minorTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickInterval">https://api.highcharts.com/highstock/navigator.xAxis.minorTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickInterval">https://api.highcharts.com/highstock/navigator.xAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(String value);

  /**
   * (Highstock) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickLength">https://api.highcharts.com/highstock/navigator.xAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highstock) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickLength">https://api.highcharts.com/highstock/navigator.xAxis.minorTickLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickPosition">https://api.highcharts.com/highstock/navigator.xAxis.minorTickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickPosition">https://api.highcharts.com/highstock/navigator.xAxis.minorTickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTicks">https://api.highcharts.com/highstock/navigator.xAxis.minorTicks</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTicks">https://api.highcharts.com/highstock/navigator.xAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highstock) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickWidth">https://api.highcharts.com/highstock/navigator.xAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highstock) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minorTickWidth">https://api.highcharts.com/highstock/navigator.xAxis.minorTickWidth</a>
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
   * edge of the plot area. When the axis' <code>min</code> option is set or a min
   * extreme is set using <code>axis.setExtremes()</code>, the minPadding will be
   * ignored.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.minPadding">https://api.highcharts.com/highcharts/navigator.xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minPadding">https://api.highcharts.com/highstock/navigator.xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.minPadding">https://api.highcharts.com/gantt/navigator.xAxis.minPadding</a>
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
   * edge of the plot area. When the axis' <code>min</code> option is set or a min
   * extreme is set using <code>axis.setExtremes()</code>, the minPadding will be
   * ignored.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.minPadding">https://api.highcharts.com/highcharts/navigator.xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minPadding">https://api.highcharts.com/highstock/navigator.xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.minPadding">https://api.highcharts.com/gantt/navigator.xAxis.minPadding</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minTickInterval">https://api.highcharts.com/highstock/navigator.xAxis.minTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.minTickInterval">https://api.highcharts.com/highstock/navigator.xAxis.minTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.offset">https://api.highcharts.com/highstock/navigator.xAxis.offset</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.offset">https://api.highcharts.com/highstock/navigator.xAxis.offset</a>
   *
   * @implspec offset?: number;
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.ordinal">https://api.highcharts.com/highstock/navigator.xAxis.ordinal</a>
   *
   * @implspec ordinal?: boolean;
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.ordinal">https://api.highcharts.com/highstock/navigator.xAxis.ordinal</a>
   *
   * @implspec ordinal?: boolean;
   *
   */
  @JSProperty("ordinal")
  void setOrdinal(boolean value);

  /**
   * (Highstock) Additional range on the right side of the xAxis. Works
   * similar to xAxis.maxPadding, but value is set in milliseconds. Can be set
   * for both, main xAxis and navigator's xAxis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.overscroll">https://api.highcharts.com/highstock/navigator.xAxis.overscroll</a>
   *
   * @implspec overscroll?: number;
   *
   */
  @JSProperty("overscroll")
  double getOverscroll();

  /**
   * (Highstock) Additional range on the right side of the xAxis. Works
   * similar to xAxis.maxPadding, but value is set in milliseconds. Can be set
   * for both, main xAxis and navigator's xAxis.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.overscroll">https://api.highcharts.com/highstock/navigator.xAxis.overscroll</a>
   *
   * @implspec overscroll?: number;
   *
   */
  @JSProperty("overscroll")
  void setOverscroll(double value);

  /**
   * (Highcharts) Refers to the index in the panes array. Used for circular
   * gauges and polar charts. When the option is not set then first pane will
   * be used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.pane">https://api.highcharts.com/highcharts/navigator.xAxis.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.pane">https://api.highcharts.com/highcharts/navigator.xAxis.pane</a>
   *
   * @implspec pane?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands">https://api.highcharts.com/highstock/navigator.xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands">https://api.highcharts.com/gantt/navigator.xAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<NavigatorXAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  @Nullable
  Array<NavigatorXAxisPlotBandsOptions> getPlotBands();

  /**
   * (Highcharts, Highstock, Gantt) An array of colored bands stretching
   * across the plot area marking an interval on the axis.
   *
   * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
   * class in addition to the <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands">https://api.highcharts.com/highstock/navigator.xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands">https://api.highcharts.com/gantt/navigator.xAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<NavigatorXAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  void setPlotBands(Array<NavigatorXAxisPlotBandsOptions> value);

  /**
   * (Highcharts, Highstock, Gantt) An array of lines stretching across the
   * plot area, marking a specific value on one of the axes.
   *
   * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
   * class in addition to the <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotLines">https://api.highcharts.com/highcharts/navigator.xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotLines">https://api.highcharts.com/highstock/navigator.xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotLines">https://api.highcharts.com/gantt/navigator.xAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<NavigatorXAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  @Nullable
  Array<NavigatorXAxisPlotLinesOptions> getPlotLines();

  /**
   * (Highcharts, Highstock, Gantt) An array of lines stretching across the
   * plot area, marking a specific value on one of the axes.
   *
   * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
   * class in addition to the <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotLines">https://api.highcharts.com/highcharts/navigator.xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotLines">https://api.highcharts.com/highstock/navigator.xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotLines">https://api.highcharts.com/gantt/navigator.xAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<NavigatorXAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  void setPlotLines(Array<NavigatorXAxisPlotLinesOptions> value);

  /**
   * (Highstock) Whether to reverse the axis so that the highest number is
   * closest to the origin. If the chart is inverted, the x axis is reversed
   * by default.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.reversed">https://api.highcharts.com/highstock/navigator.xAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highstock) Whether to reverse the axis so that the highest number is
   * closest to the origin. If the chart is inverted, the x axis is reversed
   * by default.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.reversed">https://api.highcharts.com/highstock/navigator.xAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.reversedStacks">https://api.highcharts.com/highcharts/navigator.xAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.reversedStacks">https://api.highcharts.com/highstock/navigator.xAxis.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.reversedStacks">https://api.highcharts.com/highcharts/navigator.xAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.reversedStacks">https://api.highcharts.com/highstock/navigator.xAxis.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
   *
   */
  @JSProperty("reversedStacks")
  void setReversedStacks(boolean value);

  /**
   * (Highstock) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.showFirstLabel">https://api.highcharts.com/highstock/navigator.xAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highstock) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.showFirstLabel">https://api.highcharts.com/highstock/navigator.xAxis.showFirstLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.showLastLabel">https://api.highcharts.com/highcharts/navigator.xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.showLastLabel">https://api.highcharts.com/highstock/navigator.xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.showLastLabel">https://api.highcharts.com/gantt/navigator.xAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.showLastLabel">https://api.highcharts.com/highcharts/navigator.xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.showLastLabel">https://api.highcharts.com/highstock/navigator.xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.showLastLabel">https://api.highcharts.com/gantt/navigator.xAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.softMax">https://api.highcharts.com/highcharts/navigator.xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.softMax">https://api.highcharts.com/highstock/navigator.xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.softMax">https://api.highcharts.com/gantt/navigator.xAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.softMax">https://api.highcharts.com/highcharts/navigator.xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.softMax">https://api.highcharts.com/highstock/navigator.xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.softMax">https://api.highcharts.com/gantt/navigator.xAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.softMin">https://api.highcharts.com/highcharts/navigator.xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.softMin">https://api.highcharts.com/highstock/navigator.xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.softMin">https://api.highcharts.com/gantt/navigator.xAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.softMin">https://api.highcharts.com/highcharts/navigator.xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.softMin">https://api.highcharts.com/highstock/navigator.xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.softMin">https://api.highcharts.com/gantt/navigator.xAxis.softMin</a>
   *
   * @implspec softMin?: number;
   *
   */
  @JSProperty("softMin")
  void setSoftMin(double value);

  /**
   * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
   * put the tick between weeks. 0 = Sunday, 1 = Monday.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.startOfWeek">https://api.highcharts.com/highcharts/navigator.xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.startOfWeek">https://api.highcharts.com/highstock/navigator.xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.startOfWeek">https://api.highcharts.com/gantt/navigator.xAxis.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.startOfWeek">https://api.highcharts.com/highcharts/navigator.xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.startOfWeek">https://api.highcharts.com/highstock/navigator.xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.startOfWeek">https://api.highcharts.com/gantt/navigator.xAxis.startOfWeek</a>
   *
   * @implspec startOfWeek?: number;
   *
   */
  @JSProperty("startOfWeek")
  void setStartOfWeek(double value);

  /**
   * (Highstock) Whether to force the axis to start on a tick. Use this option
   * with the <code>minPadding</code> option to control the axis start.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.startOnTick">https://api.highcharts.com/highstock/navigator.xAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highstock) Whether to force the axis to start on a tick. Use this option
   * with the <code>minPadding</code> option to control the axis start.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.startOnTick">https://api.highcharts.com/highstock/navigator.xAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.tickAmount">https://api.highcharts.com/highcharts/navigator.xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickAmount">https://api.highcharts.com/highstock/navigator.xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.tickAmount">https://api.highcharts.com/gantt/navigator.xAxis.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.tickAmount">https://api.highcharts.com/highcharts/navigator.xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickAmount">https://api.highcharts.com/highstock/navigator.xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.tickAmount">https://api.highcharts.com/gantt/navigator.xAxis.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickColor">https://api.highcharts.com/highstock/navigator.xAxis.tickColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickColor">https://api.highcharts.com/highstock/navigator.xAxis.tickColor</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickInterval">https://api.highcharts.com/highstock/navigator.xAxis.tickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickInterval">https://api.highcharts.com/highstock/navigator.xAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highstock) The pixel length of the main tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickLength">https://api.highcharts.com/highstock/navigator.xAxis.tickLength</a>
   *
   * @implspec tickLength?: number;
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highstock) The pixel length of the main tick marks.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickLength">https://api.highcharts.com/highstock/navigator.xAxis.tickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/navigator.xAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.tickmarkPlacement">https://api.highcharts.com/gantt/navigator.xAxis.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/navigator.xAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.tickmarkPlacement">https://api.highcharts.com/gantt/navigator.xAxis.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPixelInterval">https://api.highcharts.com/highstock/navigator.xAxis.tickPixelInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPixelInterval">https://api.highcharts.com/highstock/navigator.xAxis.tickPixelInterval</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPosition">https://api.highcharts.com/highstock/navigator.xAxis.tickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPosition">https://api.highcharts.com/highstock/navigator.xAxis.tickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPositioner">https://api.highcharts.com/highstock/navigator.xAxis.tickPositioner</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPositioner">https://api.highcharts.com/highstock/navigator.xAxis.tickPositioner</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPositions">https://api.highcharts.com/highstock/navigator.xAxis.tickPositions</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickPositions">https://api.highcharts.com/highstock/navigator.xAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highstock) The pixel width of the major tick marks.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickWidth">https://api.highcharts.com/highstock/navigator.xAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highstock) The pixel width of the major tick marks.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.tickWidth">https://api.highcharts.com/highstock/navigator.xAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highstock) The axis title, showing next to the axis line.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.title">https://api.highcharts.com/highstock/navigator.xAxis.title</a>
   *
   * @implspec title?: NavigatorXAxisTitleOptions;
   *
   */
  @JSProperty("title")
  @Nullable
  NavigatorXAxisTitleOptions getTitle();

  /**
   * (Highstock) The axis title, showing next to the axis line.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.title">https://api.highcharts.com/highstock/navigator.xAxis.title</a>
   *
   * @implspec title?: NavigatorXAxisTitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(NavigatorXAxisTitleOptions value);

  /**
   * (Highcharts, Gantt) The type of axis. Can be one of <code>linear</code>,
   * <code>logarithmic</code>, <code>datetime</code> or <code>category</code>. In a datetime axis, the numbers
   * are given in milliseconds, and tick marks are placed on appropriate
   * values like full hours or days. In a category axis, the point names of
   * the chart's series are used for categories, if not a categories array is
   * defined.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.type">https://api.highcharts.com/highcharts/navigator.xAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.type">https://api.highcharts.com/gantt/navigator.xAxis.type</a>
   *
   * @implspec type?: (&quot;category&quot;|&quot;datetime&quot;|&quot;linear&quot;|&quot;logarithmic&quot;);
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Gantt) The type of axis. Can be one of <code>linear</code>,
   * <code>logarithmic</code>, <code>datetime</code> or <code>category</code>. In a datetime axis, the numbers
   * are given in milliseconds, and tick marks are placed on appropriate
   * values like full hours or days. In a category axis, the point names of
   * the chart's series are used for categories, if not a categories array is
   * defined.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.type">https://api.highcharts.com/highcharts/navigator.xAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.type">https://api.highcharts.com/gantt/navigator.xAxis.type</a>
   *
   * @implspec type?: (&quot;category&quot;|&quot;datetime&quot;|&quot;linear&quot;|&quot;logarithmic&quot;);
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.uniqueNames">https://api.highcharts.com/highcharts/navigator.xAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.uniqueNames">https://api.highcharts.com/gantt/navigator.xAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.uniqueNames">https://api.highcharts.com/highcharts/navigator.xAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.uniqueNames">https://api.highcharts.com/gantt/navigator.xAxis.uniqueNames</a>
   *
   * @implspec uniqueNames?: boolean;
   *
   */
  @JSProperty("uniqueNames")
  void setUniqueNames(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
   * what time intervals the ticks are allowed to fall on. Each array item is
   * an array where the first value is the time unit and the second value
   * another array of allowed multiples. Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.units">https://api.highcharts.com/highcharts/navigator.xAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.units">https://api.highcharts.com/highstock/navigator.xAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.units">https://api.highcharts.com/gantt/navigator.xAxis.units</a>
   *
   * @implspec units?: Array&lt;Array&lt;(string|Array<number>)&gt;&gt;;
   *
   */
  @JSProperty("units")
  @Nullable
  Array<Array<Unknown>> getUnits();

  /**
   * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
   * what time intervals the ticks are allowed to fall on. Each array item is
   * an array where the first value is the time unit and the second value
   * another array of allowed multiples. Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.units">https://api.highcharts.com/highcharts/navigator.xAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.units">https://api.highcharts.com/highstock/navigator.xAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.units">https://api.highcharts.com/gantt/navigator.xAxis.units</a>
   *
   * @implspec units?: Array&lt;Array&lt;(string|Array<number>)&gt;&gt;;
   *
   */
  @JSProperty("units")
  void setUnits(Array<Array<Unknown>> value);

  /**
   * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
   * ticks and labels, should be visible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.visible">https://api.highcharts.com/highcharts/navigator.xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.visible">https://api.highcharts.com/highstock/navigator.xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.visible">https://api.highcharts.com/gantt/navigator.xAxis.visible</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.visible">https://api.highcharts.com/highcharts/navigator.xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.visible">https://api.highcharts.com/highstock/navigator.xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.visible">https://api.highcharts.com/gantt/navigator.xAxis.visible</a>
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
  }
}
