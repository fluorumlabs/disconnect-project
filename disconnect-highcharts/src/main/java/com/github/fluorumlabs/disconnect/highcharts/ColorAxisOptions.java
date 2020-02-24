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
 * (Highcharts, Highmaps) A color axis for choropleth maps and heat maps.
 * Visually, the color axis will appear as a gradient or as separate items
 * inside the legend, depending on whether the axis is scalar or based on data
 * classes.
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
 * See the Axis object for programmatic access to the axis.
 *
 * @see <a href="https://api.highcharts.com/highcharts/colorAxis">https://api.highcharts.com/highcharts/colorAxis</a>
 * @see <a href="https://api.highcharts.com/highmaps/colorAxis">https://api.highcharts.com/highmaps/colorAxis</a>
 *
 */
public interface ColorAxisOptions extends Any {
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.alignTicks">https://api.highcharts.com/highcharts/colorAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.alignTicks">https://api.highcharts.com/highstock/colorAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.alignTicks">https://api.highcharts.com/gantt/colorAxis.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.alignTicks">https://api.highcharts.com/highcharts/colorAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.alignTicks">https://api.highcharts.com/highstock/colorAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.alignTicks">https://api.highcharts.com/gantt/colorAxis.alignTicks</a>
   *
   * @implspec alignTicks?: boolean;
   *
   */
  @JSProperty("alignTicks")
  void setAlignTicks(boolean value);

  /**
   * (Highcharts, Highmaps) Whether to allow decimals on the color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.allowDecimals">https://api.highcharts.com/highcharts/colorAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.allowDecimals">https://api.highcharts.com/highmaps/colorAxis.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  boolean getAllowDecimals();

  /**
   * (Highcharts, Highmaps) Whether to allow decimals on the color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.allowDecimals">https://api.highcharts.com/highcharts/colorAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.allowDecimals">https://api.highcharts.com/highmaps/colorAxis.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  void setAllowDecimals(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) The highest allowed value for
   * automatically computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.ceiling">https://api.highcharts.com/highcharts/colorAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.ceiling">https://api.highcharts.com/highstock/colorAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.ceiling">https://api.highcharts.com/gantt/colorAxis.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.ceiling">https://api.highcharts.com/highcharts/colorAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.ceiling">https://api.highcharts.com/highstock/colorAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.ceiling">https://api.highcharts.com/gantt/colorAxis.ceiling</a>
   *
   * @implspec ceiling?: number;
   *
   */
  @JSProperty("ceiling")
  void setCeiling(double value);

  /**
   * (Highcharts, Highmaps) A class name that opens for styling the axis by
   * CSS, especially in Highcharts styled mode. The class name is applied to
   * group elements for the grid, axis elements and labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.className">https://api.highcharts.com/highcharts/colorAxis.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.className">https://api.highcharts.com/highmaps/colorAxis.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highmaps) A class name that opens for styling the axis by
   * CSS, especially in Highcharts styled mode. The class name is applied to
   * group elements for the grid, axis elements and labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.className">https://api.highcharts.com/highcharts/colorAxis.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.className">https://api.highcharts.com/highmaps/colorAxis.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.currentDateIndicator">https://api.highcharts.com/gantt/colorAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|ColorAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  @Nullable
  Unknown getCurrentDateIndicator();

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.currentDateIndicator">https://api.highcharts.com/gantt/colorAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|ColorAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(boolean value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.currentDateIndicator">https://api.highcharts.com/gantt/colorAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|ColorAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(ColorAxisCurrentDateIndicatorOptions value);

  /**
   * (Highcharts, Highmaps) Determines how to set each data class' color if no
   * individual color is set. The default value, <code>tween</code>, computes
   * intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible
   * value, <code>category</code>, pulls colors from the global or chart specific colors
   * array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClassColor">https://api.highcharts.com/highcharts/colorAxis.dataClassColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClassColor">https://api.highcharts.com/highmaps/colorAxis.dataClassColor</a>
   *
   * @implspec dataClassColor?: (&quot;category&quot;|&quot;tween&quot;);
   *
   */
  @JSProperty("dataClassColor")
  @Nullable
  DataClassColor getDataClassColor();

  /**
   * (Highcharts, Highmaps) Determines how to set each data class' color if no
   * individual color is set. The default value, <code>tween</code>, computes
   * intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible
   * value, <code>category</code>, pulls colors from the global or chart specific colors
   * array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClassColor">https://api.highcharts.com/highcharts/colorAxis.dataClassColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClassColor">https://api.highcharts.com/highmaps/colorAxis.dataClassColor</a>
   *
   * @implspec dataClassColor?: (&quot;category&quot;|&quot;tween&quot;);
   *
   */
  @JSProperty("dataClassColor")
  void setDataClassColor(DataClassColor value);

  /**
   * (Highcharts, Highmaps) An array of data classes or ranges for the
   * choropleth map. If none given, the color axis is scalar and values are
   * distributed as a gradient between the minimum and maximum colors.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses">https://api.highcharts.com/highcharts/colorAxis.dataClasses</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses">https://api.highcharts.com/highmaps/colorAxis.dataClasses</a>
   *
   * @implspec dataClasses?: Array<ColorAxisDataClassesOptions>;
   *
   */
  @JSProperty("dataClasses")
  @Nullable
  Array<ColorAxisDataClassesOptions> getDataClasses();

  /**
   * (Highcharts, Highmaps) An array of data classes or ranges for the
   * choropleth map. If none given, the color axis is scalar and values are
   * distributed as a gradient between the minimum and maximum colors.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses">https://api.highcharts.com/highcharts/colorAxis.dataClasses</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses">https://api.highcharts.com/highmaps/colorAxis.dataClasses</a>
   *
   * @implspec dataClasses?: Array<ColorAxisDataClassesOptions>;
   *
   */
  @JSProperty("dataClasses")
  void setDataClasses(Array<ColorAxisDataClassesOptions> value);

  /**
   * (Highcharts, Highmaps) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.description">https://api.highcharts.com/highcharts/colorAxis.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.description">https://api.highcharts.com/highmaps/colorAxis.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highmaps) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.description">https://api.highcharts.com/highcharts/colorAxis.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.description">https://api.highcharts.com/highmaps/colorAxis.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highmaps) Whether to force the axis to end on a tick. Use
   * this option with the maxPadding option to control the axis end.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.endOnTick">https://api.highcharts.com/highcharts/colorAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.endOnTick">https://api.highcharts.com/highmaps/colorAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highcharts, Highmaps) Whether to force the axis to end on a tick. Use
   * this option with the maxPadding option to control the axis end.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.endOnTick">https://api.highcharts.com/highcharts/colorAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.endOnTick">https://api.highcharts.com/highmaps/colorAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highcharts, Highmaps) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.events">https://api.highcharts.com/highcharts/colorAxis.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.events">https://api.highcharts.com/highmaps/colorAxis.events</a>
   *
   * @implspec events?: ColorAxisEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  ColorAxisEventsOptions getEvents();

  /**
   * (Highcharts, Highmaps) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.events">https://api.highcharts.com/highcharts/colorAxis.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.events">https://api.highcharts.com/highmaps/colorAxis.events</a>
   *
   * @implspec events?: ColorAxisEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(ColorAxisEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.floor">https://api.highcharts.com/highcharts/colorAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.floor">https://api.highcharts.com/highstock/colorAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.floor">https://api.highcharts.com/gantt/colorAxis.floor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.floor">https://api.highcharts.com/highcharts/colorAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.floor">https://api.highcharts.com/highstock/colorAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.floor">https://api.highcharts.com/gantt/colorAxis.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid">https://api.highcharts.com/gantt/colorAxis.grid</a>
   *
   * @implspec grid?: ColorAxisGridOptions;
   *
   */
  @JSProperty("grid")
  @Nullable
  ColorAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid">https://api.highcharts.com/gantt/colorAxis.grid</a>
   *
   * @implspec grid?: ColorAxisGridOptions;
   *
   */
  @JSProperty("grid")
  void setGrid(ColorAxisGridOptions value);

  /**
   * (Highcharts, Highmaps) Color of the grid lines extending from the axis
   * across the gradient.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridLineColor">https://api.highcharts.com/highcharts/colorAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.gridLineColor">https://api.highcharts.com/highmaps/colorAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: ColorString;
   *
   */
  @JSProperty("gridLineColor")
  @Nullable
  String getGridLineColor();

  /**
   * (Highcharts, Highmaps) Color of the grid lines extending from the axis
   * across the gradient.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridLineColor">https://api.highcharts.com/highcharts/colorAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.gridLineColor">https://api.highcharts.com/highmaps/colorAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: ColorString;
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(String value);

  /**
   * (Highcharts, Highmaps) The dash or dot style of the grid lines. For
   * possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridLineDashStyle">https://api.highcharts.com/highcharts/colorAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.gridLineDashStyle">https://api.highcharts.com/highmaps/colorAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  @Nullable
  GridLineDashStyle getGridLineDashStyle();

  /**
   * (Highcharts, Highmaps) The dash or dot style of the grid lines. For
   * possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridLineDashStyle">https://api.highcharts.com/highcharts/colorAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.gridLineDashStyle">https://api.highcharts.com/highmaps/colorAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  void setGridLineDashStyle(GridLineDashStyle value);

  /**
   * (Highcharts, Highmaps) The width of the grid lines extending from the
   * axis across the gradient of a scalar color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridLineWidth">https://api.highcharts.com/highcharts/colorAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.gridLineWidth">https://api.highcharts.com/highmaps/colorAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  double getGridLineWidth();

  /**
   * (Highcharts, Highmaps) The width of the grid lines extending from the
   * axis across the gradient of a scalar color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridLineWidth">https://api.highcharts.com/highcharts/colorAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.gridLineWidth">https://api.highcharts.com/highmaps/colorAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  void setGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridZIndex">https://api.highcharts.com/highcharts/colorAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.gridZIndex">https://api.highcharts.com/highstock/colorAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.gridZIndex">https://api.highcharts.com/gantt/colorAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.gridZIndex">https://api.highcharts.com/highcharts/colorAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.gridZIndex">https://api.highcharts.com/highstock/colorAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.gridZIndex">https://api.highcharts.com/gantt/colorAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  void setGridZIndex(double value);

  /**
   * (Highcharts, Highmaps) An id for the axis. This can be used after render
   * time to get a pointer to the axis object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.id">https://api.highcharts.com/highcharts/colorAxis.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.id">https://api.highcharts.com/highmaps/colorAxis.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highmaps) An id for the axis. This can be used after render
   * time to get a pointer to the axis object through <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.id">https://api.highcharts.com/highcharts/colorAxis.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.id">https://api.highcharts.com/highmaps/colorAxis.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highmaps) The axis labels show the number for each tick.
   *
   * For more live examples on label options, see xAxis.labels in the
   * Highcharts API.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels">https://api.highcharts.com/highcharts/colorAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels">https://api.highcharts.com/highmaps/colorAxis.labels</a>
   *
   * @implspec labels?: ColorAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  ColorAxisLabelsOptions getLabels();

  /**
   * (Highcharts, Highmaps) The axis labels show the number for each tick.
   *
   * For more live examples on label options, see xAxis.labels in the
   * Highcharts API.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.labels">https://api.highcharts.com/highcharts/colorAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.labels">https://api.highcharts.com/highmaps/colorAxis.labels</a>
   *
   * @implspec labels?: ColorAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(ColorAxisLabelsOptions value);

  /**
   * (Highcharts, Highmaps) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.lineColor">https://api.highcharts.com/highcharts/colorAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.lineColor">https://api.highcharts.com/highmaps/colorAxis.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highmaps) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.lineColor">https://api.highcharts.com/highcharts/colorAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.lineColor">https://api.highcharts.com/highmaps/colorAxis.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highmaps) The triangular marker on a scalar color axis that
   * points to the value of the hovered area. To disable the marker, set
   * <code>marker: null</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker">https://api.highcharts.com/highcharts/colorAxis.marker</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker">https://api.highcharts.com/highmaps/colorAxis.marker</a>
   *
   * @implspec marker?: ColorAxisMarkerOptions;
   *
   */
  @JSProperty("marker")
  @Nullable
  ColorAxisMarkerOptions getMarker();

  /**
   * (Highcharts, Highmaps) The triangular marker on a scalar color axis that
   * points to the value of the hovered area. To disable the marker, set
   * <code>marker: null</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker">https://api.highcharts.com/highcharts/colorAxis.marker</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker">https://api.highcharts.com/highmaps/colorAxis.marker</a>
   *
   * @implspec marker?: ColorAxisMarkerOptions;
   *
   */
  @JSProperty("marker")
  void setMarker(ColorAxisMarkerOptions value);

  /**
   * (Highcharts, Highmaps) The maximum value of the axis in terms of map
   * point values. If <code>null</code>, the max value is automatically calculated. If
   * the <code>endOnTick</code> option is true, the max value might be rounded up.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.max">https://api.highcharts.com/highcharts/colorAxis.max</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.max">https://api.highcharts.com/highmaps/colorAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * (Highcharts, Highmaps) The maximum value of the axis in terms of map
   * point values. If <code>null</code>, the max value is automatically calculated. If
   * the <code>endOnTick</code> option is true, the max value might be rounded up.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.max">https://api.highcharts.com/highcharts/colorAxis.max</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.max">https://api.highcharts.com/highmaps/colorAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highcharts, Highmaps) The color to represent the maximum of the color
   * axis. Unless dataClasses or stops are set, the gradient ends at this
   * value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.maxColor">https://api.highcharts.com/highcharts/colorAxis.maxColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.maxColor">https://api.highcharts.com/highmaps/colorAxis.maxColor</a>
   *
   * @implspec maxColor?: ColorString;
   *
   */
  @JSProperty("maxColor")
  @Nullable
  String getMaxColor();

  /**
   * (Highcharts, Highmaps) The color to represent the maximum of the color
   * axis. Unless dataClasses or stops are set, the gradient ends at this
   * value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.maxColor">https://api.highcharts.com/highcharts/colorAxis.maxColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.maxColor">https://api.highcharts.com/highmaps/colorAxis.maxColor</a>
   *
   * @implspec maxColor?: ColorString;
   *
   */
  @JSProperty("maxColor")
  void setMaxColor(String value);

  /**
   * (Highcharts, Highmaps) Padding of the max value relative to the length of
   * the axis. A padding of 0.05 will make a 100px axis 5px longer.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.maxPadding">https://api.highcharts.com/highcharts/colorAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.maxPadding">https://api.highcharts.com/highmaps/colorAxis.maxPadding</a>
   *
   * @implspec maxPadding?: number;
   *
   */
  @JSProperty("maxPadding")
  double getMaxPadding();

  /**
   * (Highcharts, Highmaps) Padding of the max value relative to the length of
   * the axis. A padding of 0.05 will make a 100px axis 5px longer.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.maxPadding">https://api.highcharts.com/highcharts/colorAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.maxPadding">https://api.highcharts.com/highmaps/colorAxis.maxPadding</a>
   *
   * @implspec maxPadding?: number;
   *
   */
  @JSProperty("maxPadding")
  void setMaxPadding(double value);

  /**
   * (Highstock) Maximum range which can be set using the navigator's handles.
   * Opposite of xAxis.minRange.
   *
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.maxRange">https://api.highcharts.com/highstock/colorAxis.maxRange</a>
   *
   * @implspec maxRange?: number;
   *
   */
  @JSProperty("maxRange")
  double getMaxRange();

  /**
   * (Highstock) Maximum range which can be set using the navigator's handles.
   * Opposite of xAxis.minRange.
   *
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.maxRange">https://api.highcharts.com/highstock/colorAxis.maxRange</a>
   *
   * @implspec maxRange?: number;
   *
   */
  @JSProperty("maxRange")
  void setMaxRange(double value);

  /**
   * (Highcharts, Highmaps) The minimum value of the axis in terms of map
   * point values. If <code>null</code>, the min value is automatically calculated. If
   * the <code>startOnTick</code> option is true, the min value might be rounded down.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.min">https://api.highcharts.com/highcharts/colorAxis.min</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.min">https://api.highcharts.com/highmaps/colorAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * (Highcharts, Highmaps) The minimum value of the axis in terms of map
   * point values. If <code>null</code>, the min value is automatically calculated. If
   * the <code>startOnTick</code> option is true, the min value might be rounded down.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.min">https://api.highcharts.com/highcharts/colorAxis.min</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.min">https://api.highcharts.com/highmaps/colorAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highcharts, Highmaps) The color to represent the minimum of the color
   * axis. Unless dataClasses or stops are set, the gradient starts at this
   * value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minColor">https://api.highcharts.com/highcharts/colorAxis.minColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minColor">https://api.highcharts.com/highmaps/colorAxis.minColor</a>
   *
   * @implspec minColor?: ColorString;
   *
   */
  @JSProperty("minColor")
  @Nullable
  String getMinColor();

  /**
   * (Highcharts, Highmaps) The color to represent the minimum of the color
   * axis. Unless dataClasses or stops are set, the gradient starts at this
   * value.
   *
   * If dataClasses are set, the color is based on minColor and maxColor
   * unless a color is set for each data class, or the dataClassColor is set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minColor">https://api.highcharts.com/highcharts/colorAxis.minColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minColor">https://api.highcharts.com/highmaps/colorAxis.minColor</a>
   *
   * @implspec minColor?: ColorString;
   *
   */
  @JSProperty("minColor")
  void setMinColor(String value);

  /**
   * (Highcharts, Highmaps) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorGridLineColor">https://api.highcharts.com/highcharts/colorAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorGridLineColor">https://api.highcharts.com/highmaps/colorAxis.minorGridLineColor</a>
   *
   * @implspec minorGridLineColor?: ColorString;
   *
   */
  @JSProperty("minorGridLineColor")
  @Nullable
  String getMinorGridLineColor();

  /**
   * (Highcharts, Highmaps) Color of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorGridLineColor">https://api.highcharts.com/highcharts/colorAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorGridLineColor">https://api.highcharts.com/highmaps/colorAxis.minorGridLineColor</a>
   *
   * @implspec minorGridLineColor?: ColorString;
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(String value);

  /**
   * (Highcharts, Highmaps) The dash or dot style of the minor grid lines. For
   * possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorGridLineDashStyle">https://api.highcharts.com/highcharts/colorAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorGridLineDashStyle">https://api.highcharts.com/highmaps/colorAxis.minorGridLineDashStyle</a>
   *
   * @implspec minorGridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("minorGridLineDashStyle")
  @Nullable
  MinorGridLineDashStyle getMinorGridLineDashStyle();

  /**
   * (Highcharts, Highmaps) The dash or dot style of the minor grid lines. For
   * possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorGridLineDashStyle">https://api.highcharts.com/highcharts/colorAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorGridLineDashStyle">https://api.highcharts.com/highmaps/colorAxis.minorGridLineDashStyle</a>
   *
   * @implspec minorGridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("minorGridLineDashStyle")
  void setMinorGridLineDashStyle(MinorGridLineDashStyle value);

  /**
   * (Highcharts, Highmaps) Width of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorGridLineWidth">https://api.highcharts.com/highcharts/colorAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorGridLineWidth">https://api.highcharts.com/highmaps/colorAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  double getMinorGridLineWidth();

  /**
   * (Highcharts, Highmaps) Width of the minor, secondary grid lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorGridLineWidth">https://api.highcharts.com/highcharts/colorAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorGridLineWidth">https://api.highcharts.com/highmaps/colorAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highcharts, Highmaps) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickColor">https://api.highcharts.com/highcharts/colorAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickColor">https://api.highcharts.com/highmaps/colorAxis.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  String getMinorTickColor();

  /**
   * (Highcharts, Highmaps) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickColor">https://api.highcharts.com/highcharts/colorAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickColor">https://api.highcharts.com/highmaps/colorAxis.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(String value);

  /**
   * (Highcharts, Highmaps) Specific tick interval in axis units for the minor
   * ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is
   * calculated as a fifth of the tickInterval. If <code>null</code> or <code>undefined</code>,
   * minor ticks are not shown.
   *
   * On logarithmic axes, the unit is the power of the value. For example,
   * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
   * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
   * and 10, 10 and 100 etc.
   *
   * If user settings dictate minor ticks to become too dense, they don't make
   * sense, and will be ignored to prevent performance problems.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickInterval">https://api.highcharts.com/highcharts/colorAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickInterval">https://api.highcharts.com/highmaps/colorAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  @Nullable
  Unknown getMinorTickInterval();

  /**
   * (Highcharts, Highmaps) Specific tick interval in axis units for the minor
   * ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is
   * calculated as a fifth of the tickInterval. If <code>null</code> or <code>undefined</code>,
   * minor ticks are not shown.
   *
   * On logarithmic axes, the unit is the power of the value. For example,
   * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
   * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
   * and 10, 10 and 100 etc.
   *
   * If user settings dictate minor ticks to become too dense, they don't make
   * sense, and will be ignored to prevent performance problems.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickInterval">https://api.highcharts.com/highcharts/colorAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickInterval">https://api.highcharts.com/highmaps/colorAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(double value);

  /**
   * (Highcharts, Highmaps) Specific tick interval in axis units for the minor
   * ticks. On a linear axis, if <code>&quot;auto&quot;</code>, the minor tick interval is
   * calculated as a fifth of the tickInterval. If <code>null</code> or <code>undefined</code>,
   * minor ticks are not shown.
   *
   * On logarithmic axes, the unit is the power of the value. For example,
   * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
   * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
   * and 10, 10 and 100 etc.
   *
   * If user settings dictate minor ticks to become too dense, they don't make
   * sense, and will be ignored to prevent performance problems.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickInterval">https://api.highcharts.com/highcharts/colorAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickInterval">https://api.highcharts.com/highmaps/colorAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(String value);

  /**
   * (Highcharts, Highmaps) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickLength">https://api.highcharts.com/highcharts/colorAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickLength">https://api.highcharts.com/highmaps/colorAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highcharts, Highmaps) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickLength">https://api.highcharts.com/highcharts/colorAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickLength">https://api.highcharts.com/highmaps/colorAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  void setMinorTickLength(double value);

  /**
   * (Highcharts, Highmaps) The position of the minor tick marks relative to
   * the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickPosition">https://api.highcharts.com/highcharts/colorAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickPosition">https://api.highcharts.com/highmaps/colorAxis.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  @Nullable
  MinorTickPosition getMinorTickPosition();

  /**
   * (Highcharts, Highmaps) The position of the minor tick marks relative to
   * the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickPosition">https://api.highcharts.com/highcharts/colorAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickPosition">https://api.highcharts.com/highmaps/colorAxis.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  void setMinorTickPosition(MinorTickPosition value);

  /**
   * (Highcharts, Highmaps) Enable or disable minor ticks. Unless
   * minorTickInterval is set, the tick interval is calculated as a fifth of
   * the <code>tickInterval</code>.
   *
   * On a logarithmic axis, minor ticks are laid out based on a best guess,
   * attempting to enter approximately 5 minor ticks between each major tick.
   *
   * Prior to v6.0.0, ticks were unabled in auto layout by setting
   * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTicks">https://api.highcharts.com/highcharts/colorAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTicks">https://api.highcharts.com/highmaps/colorAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  boolean getMinorTicks();

  /**
   * (Highcharts, Highmaps) Enable or disable minor ticks. Unless
   * minorTickInterval is set, the tick interval is calculated as a fifth of
   * the <code>tickInterval</code>.
   *
   * On a logarithmic axis, minor ticks are laid out based on a best guess,
   * attempting to enter approximately 5 minor ticks between each major tick.
   *
   * Prior to v6.0.0, ticks were unabled in auto layout by setting
   * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTicks">https://api.highcharts.com/highcharts/colorAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTicks">https://api.highcharts.com/highmaps/colorAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highcharts, Highmaps) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickWidth">https://api.highcharts.com/highcharts/colorAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickWidth">https://api.highcharts.com/highmaps/colorAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highcharts, Highmaps) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minorTickWidth">https://api.highcharts.com/highcharts/colorAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minorTickWidth">https://api.highcharts.com/highmaps/colorAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  void setMinorTickWidth(double value);

  /**
   * (Highcharts, Highmaps) Padding of the min value relative to the length of
   * the axis. A padding of 0.05 will make a 100px axis 5px longer.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minPadding">https://api.highcharts.com/highcharts/colorAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minPadding">https://api.highcharts.com/highmaps/colorAxis.minPadding</a>
   *
   * @implspec minPadding?: number;
   *
   */
  @JSProperty("minPadding")
  double getMinPadding();

  /**
   * (Highcharts, Highmaps) Padding of the min value relative to the length of
   * the axis. A padding of 0.05 will make a 100px axis 5px longer.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.minPadding">https://api.highcharts.com/highcharts/colorAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.minPadding">https://api.highcharts.com/highmaps/colorAxis.minPadding</a>
   *
   * @implspec minPadding?: number;
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
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.ordinal">https://api.highcharts.com/highstock/colorAxis.ordinal</a>
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
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.ordinal">https://api.highcharts.com/highstock/colorAxis.ordinal</a>
   *
   * @implspec ordinal?: boolean;
   *
   */
  @JSProperty("ordinal")
  void setOrdinal(boolean value);

  /**
   * (Highstock) Additional range on the right side of the xAxis. Works
   * similar to <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be
   * set for both main <code>xAxis</code> and the navigator's <code>xAxis</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.overscroll">https://api.highcharts.com/highstock/colorAxis.overscroll</a>
   *
   * @implspec overscroll?: number;
   *
   */
  @JSProperty("overscroll")
  double getOverscroll();

  /**
   * (Highstock) Additional range on the right side of the xAxis. Works
   * similar to <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be
   * set for both main <code>xAxis</code> and the navigator's <code>xAxis</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.overscroll">https://api.highcharts.com/highstock/colorAxis.overscroll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.pane">https://api.highcharts.com/highcharts/colorAxis.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.pane">https://api.highcharts.com/highcharts/colorAxis.pane</a>
   *
   * @implspec pane?: number;
   *
   */
  @JSProperty("pane")
  void setPane(double value);

  /**
   * (Highstock) The zoomed range to display when only defining one or none of
   * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
   * month can be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.range">https://api.highcharts.com/highstock/colorAxis.range</a>
   *
   * @implspec range?: number;
   *
   */
  @JSProperty("range")
  double getRange();

  /**
   * (Highstock) The zoomed range to display when only defining one or none of
   * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
   * month can be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.range">https://api.highcharts.com/highstock/colorAxis.range</a>
   *
   * @implspec range?: number;
   *
   */
  @JSProperty("range")
  void setRange(double value);

  /**
   * (Highcharts, Highmaps) Whether to reverse the axis so that the highest
   * number is closest to the origin. Defaults to <code>false</code> in a horizontal
   * legend and <code>true</code> in a vertical legend, where the smallest value starts
   * on top.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.reversed">https://api.highcharts.com/highcharts/colorAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.reversed">https://api.highcharts.com/highmaps/colorAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts, Highmaps) Whether to reverse the axis so that the highest
   * number is closest to the origin. Defaults to <code>false</code> in a horizontal
   * legend and <code>true</code> in a vertical legend, where the smallest value starts
   * on top.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.reversed">https://api.highcharts.com/highcharts/colorAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.reversed">https://api.highcharts.com/highmaps/colorAxis.reversed</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.reversedStacks">https://api.highcharts.com/highcharts/colorAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.reversedStacks">https://api.highcharts.com/highstock/colorAxis.reversedStacks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.reversedStacks">https://api.highcharts.com/highcharts/colorAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.reversedStacks">https://api.highcharts.com/highstock/colorAxis.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
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
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.scrollbar">https://api.highcharts.com/highstock/colorAxis.scrollbar</a>
   *
   * @implspec scrollbar?: ColorAxisScrollbarOptions;
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
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.scrollbar">https://api.highcharts.com/highstock/colorAxis.scrollbar</a>
   *
   * @implspec scrollbar?: ColorAxisScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  void setScrollbar(ColorAxisScrollbarOptions value);

  /**
   * (Highcharts, Highmaps) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.showFirstLabel">https://api.highcharts.com/highcharts/colorAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.showFirstLabel">https://api.highcharts.com/highmaps/colorAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highcharts, Highmaps) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.showFirstLabel">https://api.highcharts.com/highcharts/colorAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.showFirstLabel">https://api.highcharts.com/highmaps/colorAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  void setShowFirstLabel(boolean value);

  /**
   * (Highcharts, Highmaps) Whether to display the colorAxis in the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.showInLegend">https://api.highcharts.com/highcharts/colorAxis.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.showInLegend">https://api.highcharts.com/highmaps/colorAxis.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts, Highmaps) Whether to display the colorAxis in the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.showInLegend">https://api.highcharts.com/highcharts/colorAxis.showInLegend</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.showInLegend">https://api.highcharts.com/highmaps/colorAxis.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
   * Defaults to <code>true</code> on cartesian charts, and <code>false</code> on polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.showLastLabel">https://api.highcharts.com/highcharts/colorAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.showLastLabel">https://api.highcharts.com/highstock/colorAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.showLastLabel">https://api.highcharts.com/gantt/colorAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.showLastLabel">https://api.highcharts.com/highcharts/colorAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.showLastLabel">https://api.highcharts.com/highstock/colorAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.showLastLabel">https://api.highcharts.com/gantt/colorAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.softMax">https://api.highcharts.com/highcharts/colorAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.softMax">https://api.highcharts.com/highstock/colorAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.softMax">https://api.highcharts.com/gantt/colorAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.softMax">https://api.highcharts.com/highcharts/colorAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.softMax">https://api.highcharts.com/highstock/colorAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.softMax">https://api.highcharts.com/gantt/colorAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.softMin">https://api.highcharts.com/highcharts/colorAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.softMin">https://api.highcharts.com/highstock/colorAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.softMin">https://api.highcharts.com/gantt/colorAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.softMin">https://api.highcharts.com/highcharts/colorAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.softMin">https://api.highcharts.com/highstock/colorAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.softMin">https://api.highcharts.com/gantt/colorAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.startOfWeek">https://api.highcharts.com/highcharts/colorAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.startOfWeek">https://api.highcharts.com/highstock/colorAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.startOfWeek">https://api.highcharts.com/gantt/colorAxis.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.startOfWeek">https://api.highcharts.com/highcharts/colorAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.startOfWeek">https://api.highcharts.com/highstock/colorAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.startOfWeek">https://api.highcharts.com/gantt/colorAxis.startOfWeek</a>
   *
   * @implspec startOfWeek?: number;
   *
   */
  @JSProperty("startOfWeek")
  void setStartOfWeek(double value);

  /**
   * (Highcharts, Highmaps) Whether to force the axis to start on a tick. Use
   * this option with the <code>maxPadding</code> option to control the axis start.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.startOnTick">https://api.highcharts.com/highcharts/colorAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.startOnTick">https://api.highcharts.com/highmaps/colorAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highcharts, Highmaps) Whether to force the axis to start on a tick. Use
   * this option with the <code>maxPadding</code> option to control the axis start.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.startOnTick">https://api.highcharts.com/highcharts/colorAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.startOnTick">https://api.highcharts.com/highmaps/colorAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
   *
   */
  @JSProperty("startOnTick")
  void setStartOnTick(boolean value);

  /**
   * (Highcharts, Highmaps) Color stops for the gradient of a scalar color
   * axis. Use this in cases where a linear gradient between a <code>minColor</code> and
   * <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the
   * first item is a float between 0 and 1 assigning the relative position in
   * the gradient, and the second item is the color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.stops">https://api.highcharts.com/highcharts/colorAxis.stops</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.stops">https://api.highcharts.com/highmaps/colorAxis.stops</a>
   *
   * @implspec stops?: Array&lt;[number, ColorString]&gt;;
   *
   */
  @JSProperty("stops")
  @Nullable
  Array<DoubleKeyStringValue> getStops();

  /**
   * (Highcharts, Highmaps) Color stops for the gradient of a scalar color
   * axis. Use this in cases where a linear gradient between a <code>minColor</code> and
   * <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the
   * first item is a float between 0 and 1 assigning the relative position in
   * the gradient, and the second item is the color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.stops">https://api.highcharts.com/highcharts/colorAxis.stops</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.stops">https://api.highcharts.com/highmaps/colorAxis.stops</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickAmount">https://api.highcharts.com/highcharts/colorAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.tickAmount">https://api.highcharts.com/highstock/colorAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.tickAmount">https://api.highcharts.com/gantt/colorAxis.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickAmount">https://api.highcharts.com/highcharts/colorAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.tickAmount">https://api.highcharts.com/highstock/colorAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.tickAmount">https://api.highcharts.com/gantt/colorAxis.tickAmount</a>
   *
   * @implspec tickAmount?: number;
   *
   */
  @JSProperty("tickAmount")
  void setTickAmount(double value);

  /**
   * (Highcharts, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickColor">https://api.highcharts.com/highcharts/colorAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickColor">https://api.highcharts.com/highmaps/colorAxis.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  @Nullable
  String getTickColor();

  /**
   * (Highcharts, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickColor">https://api.highcharts.com/highcharts/colorAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickColor">https://api.highcharts.com/highmaps/colorAxis.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  void setTickColor(String value);

  /**
   * (Highcharts, Highmaps) The interval of the tick marks in axis units. When
   * <code>null</code>, the tick interval is computed to approximately follow the
   * <code>tickPixelInterval</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickInterval">https://api.highcharts.com/highcharts/colorAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickInterval">https://api.highcharts.com/highmaps/colorAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  double getTickInterval();

  /**
   * (Highcharts, Highmaps) The interval of the tick marks in axis units. When
   * <code>null</code>, the tick interval is computed to approximately follow the
   * <code>tickPixelInterval</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickInterval">https://api.highcharts.com/highcharts/colorAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickInterval">https://api.highcharts.com/highmaps/colorAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highcharts, Highmaps) The pixel length of the main tick marks on the
   * color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickLength">https://api.highcharts.com/highcharts/colorAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickLength">https://api.highcharts.com/highmaps/colorAxis.tickLength</a>
   *
   * @implspec tickLength?: number;
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highcharts, Highmaps) The pixel length of the main tick marks on the
   * color axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickLength">https://api.highcharts.com/highcharts/colorAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickLength">https://api.highcharts.com/highmaps/colorAxis.tickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/colorAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.tickmarkPlacement">https://api.highcharts.com/gantt/colorAxis.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/colorAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.tickmarkPlacement">https://api.highcharts.com/gantt/colorAxis.tickmarkPlacement</a>
   *
   * @implspec tickmarkPlacement?: (&quot;between&quot;|&quot;on&quot;|undefined);
   *
   */
  @JSProperty("tickmarkPlacement")
  void setTickmarkPlacement(TickmarkPlacement value);

  /**
   * (Highcharts, Highmaps) If tickInterval is <code>null</code> this option sets the
   * approximate pixel interval of the tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPixelInterval">https://api.highcharts.com/highcharts/colorAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPixelInterval">https://api.highcharts.com/highmaps/colorAxis.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  double getTickPixelInterval();

  /**
   * (Highcharts, Highmaps) If tickInterval is <code>null</code> this option sets the
   * approximate pixel interval of the tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPixelInterval">https://api.highcharts.com/highcharts/colorAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPixelInterval">https://api.highcharts.com/highmaps/colorAxis.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  void setTickPixelInterval(double value);

  /**
   * (Highcharts, Highmaps) The position of the major tick marks relative to
   * the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPosition">https://api.highcharts.com/highcharts/colorAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPosition">https://api.highcharts.com/highmaps/colorAxis.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  @Nullable
  TickPosition getTickPosition();

  /**
   * (Highcharts, Highmaps) The position of the major tick marks relative to
   * the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPosition">https://api.highcharts.com/highcharts/colorAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPosition">https://api.highcharts.com/highmaps/colorAxis.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  void setTickPosition(TickPosition value);

  /**
   * (Highcharts, Highmaps) A callback function returning array defining where
   * the ticks are laid out on the axis. This overrides the default behaviour
   * of tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPositioner">https://api.highcharts.com/highcharts/colorAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPositioner">https://api.highcharts.com/highmaps/colorAxis.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  @Nullable
  TickPositioner getTickPositioner();

  /**
   * (Highcharts, Highmaps) A callback function returning array defining where
   * the ticks are laid out on the axis. This overrides the default behaviour
   * of tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPositioner">https://api.highcharts.com/highcharts/colorAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPositioner">https://api.highcharts.com/highmaps/colorAxis.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  void setTickPositioner(TickPositioner value);

  /**
   * (Highcharts, Highmaps) An array defining where the ticks are laid out on
   * the axis. This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPositions">https://api.highcharts.com/highcharts/colorAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPositions">https://api.highcharts.com/highmaps/colorAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  @Nullable
  double[] getTickPositions();

  /**
   * (Highcharts, Highmaps) An array defining where the ticks are laid out on
   * the axis. This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickPositions">https://api.highcharts.com/highcharts/colorAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickPositions">https://api.highcharts.com/highmaps/colorAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highcharts, Highmaps) The pixel width of the major tick marks.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickWidth">https://api.highcharts.com/highcharts/colorAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickWidth">https://api.highcharts.com/highmaps/colorAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highmaps) The pixel width of the major tick marks.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.tickWidth">https://api.highcharts.com/highcharts/colorAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.tickWidth">https://api.highcharts.com/highmaps/colorAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highcharts, Highmaps) The type of interpolation to use for the color
   * axis. Can be <code>linear</code> or <code>logarithmic</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.type">https://api.highcharts.com/highcharts/colorAxis.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.type">https://api.highcharts.com/highmaps/colorAxis.type</a>
   *
   * @implspec type?: (&quot;linear&quot;|&quot;logarithmic&quot;);
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Highmaps) The type of interpolation to use for the color
   * axis. Can be <code>linear</code> or <code>logarithmic</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.type">https://api.highcharts.com/highcharts/colorAxis.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.type">https://api.highcharts.com/highmaps/colorAxis.type</a>
   *
   * @implspec type?: (&quot;linear&quot;|&quot;logarithmic&quot;);
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.uniqueNames">https://api.highcharts.com/highcharts/colorAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.uniqueNames">https://api.highcharts.com/gantt/colorAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.uniqueNames">https://api.highcharts.com/highcharts/colorAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.uniqueNames">https://api.highcharts.com/gantt/colorAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.units">https://api.highcharts.com/highcharts/colorAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.units">https://api.highcharts.com/highstock/colorAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.units">https://api.highcharts.com/gantt/colorAxis.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.units">https://api.highcharts.com/highcharts/colorAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.units">https://api.highcharts.com/highstock/colorAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.units">https://api.highcharts.com/gantt/colorAxis.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.visible">https://api.highcharts.com/highcharts/colorAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.visible">https://api.highcharts.com/highstock/colorAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.visible">https://api.highcharts.com/gantt/colorAxis.visible</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.visible">https://api.highcharts.com/highcharts/colorAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/colorAxis.visible">https://api.highcharts.com/highstock/colorAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.visible">https://api.highcharts.com/gantt/colorAxis.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   */
  abstract class DataClassColor extends JsEnum {
    public static final DataClassColor CATEGORY = JsEnum.of("category");

    public static final DataClassColor TWEEN = JsEnum.of("tween");
  }

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
    public static final Type LINEAR = JsEnum.of("linear");

    public static final Type LOGARITHMIC = JsEnum.of("logarithmic");
  }
}
