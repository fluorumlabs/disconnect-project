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
 * (Highcharts, Highstock, Highmaps) The X axis or category axis. Normally this
 * is the horizontal axis, though if the chart is inverted this is the vertical
 * axis. In case of multiple axes, the xAxis node is an array of configuration
 * objects.
 *
 * See the Axis class for programmatic access to the axis.
 *
 * @see <a href="https://api.highcharts.com/highcharts/xAxis">https://api.highcharts.com/highcharts/xAxis</a>
 * @see <a href="https://api.highcharts.com/highstock/xAxis">https://api.highcharts.com/highstock/xAxis</a>
 * @see <a href="https://api.highcharts.com/highmaps/xAxis">https://api.highcharts.com/highmaps/xAxis</a>
 *
 */
public interface XAxisOptions extends Any {
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.alignTicks">https://api.highcharts.com/highcharts/xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.alignTicks">https://api.highcharts.com/highstock/xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.alignTicks">https://api.highcharts.com/gantt/xAxis.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.alignTicks">https://api.highcharts.com/highcharts/xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.alignTicks">https://api.highcharts.com/highstock/xAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.alignTicks">https://api.highcharts.com/gantt/xAxis.alignTicks</a>
   *
   * @implspec alignTicks?: boolean;
   *
   */
  @JSProperty("alignTicks")
  void setAlignTicks(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow decimals in this axis'
   * ticks. When counting integers, like persons or hits on a web page,
   * decimals should be avoided in the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.allowDecimals">https://api.highcharts.com/highcharts/xAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.allowDecimals">https://api.highcharts.com/highstock/xAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.allowDecimals">https://api.highcharts.com/highmaps/xAxis.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  boolean getAllowDecimals();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow decimals in this axis'
   * ticks. When counting integers, like persons or hits on a web page,
   * decimals should be avoided in the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.allowDecimals">https://api.highcharts.com/highcharts/xAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.allowDecimals">https://api.highcharts.com/highstock/xAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.allowDecimals">https://api.highcharts.com/highmaps/xAxis.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  void setAllowDecimals(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) When using an alternate grid color, a
   * band is painted across the plot area between every other grid line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.alternateGridColor">https://api.highcharts.com/highcharts/xAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.alternateGridColor">https://api.highcharts.com/highstock/xAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.alternateGridColor">https://api.highcharts.com/highmaps/xAxis.alternateGridColor</a>
   *
   * @implspec alternateGridColor?: ColorString;
   *
   */
  @JSProperty("alternateGridColor")
  @Nullable
  String getAlternateGridColor();

  /**
   * (Highcharts, Highstock, Highmaps) When using an alternate grid color, a
   * band is painted across the plot area between every other grid line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.alternateGridColor">https://api.highcharts.com/highcharts/xAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.alternateGridColor">https://api.highcharts.com/highstock/xAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.alternateGridColor">https://api.highcharts.com/highmaps/xAxis.alternateGridColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks">https://api.highcharts.com/highcharts/xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks">https://api.highcharts.com/highstock/xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks">https://api.highcharts.com/gantt/xAxis.breaks</a>
   *
   * @implspec breaks?: Array<XAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  @Nullable
  Array<XAxisBreaksOptions> getBreaks();

  /**
   * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
   * sections defined will be left out and all the points shifted closer to
   * each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks">https://api.highcharts.com/highcharts/xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks">https://api.highcharts.com/highstock/xAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks">https://api.highcharts.com/gantt/xAxis.breaks</a>
   *
   * @implspec breaks?: Array<XAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  void setBreaks(Array<XAxisBreaksOptions> value);

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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.categories">https://api.highcharts.com/highcharts/xAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.categories">https://api.highcharts.com/gantt/xAxis.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.categories">https://api.highcharts.com/highcharts/xAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.categories">https://api.highcharts.com/gantt/xAxis.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.ceiling">https://api.highcharts.com/highcharts/xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.ceiling">https://api.highcharts.com/highstock/xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.ceiling">https://api.highcharts.com/gantt/xAxis.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.ceiling">https://api.highcharts.com/highcharts/xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.ceiling">https://api.highcharts.com/highstock/xAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.ceiling">https://api.highcharts.com/gantt/xAxis.ceiling</a>
   *
   * @implspec ceiling?: number;
   *
   */
  @JSProperty("ceiling")
  void setCeiling(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
   * axis by CSS, especially in Highcharts styled mode. The class name is
   * applied to group elements for the grid, axis elements and labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.className">https://api.highcharts.com/highcharts/xAxis.className</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.className">https://api.highcharts.com/highstock/xAxis.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.className">https://api.highcharts.com/highmaps/xAxis.className</a>
   *
   * @implspec className?: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.className">https://api.highcharts.com/highcharts/xAxis.className</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.className">https://api.highcharts.com/highstock/xAxis.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.className">https://api.highcharts.com/highmaps/xAxis.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Configure a crosshair that follows
   * either the mouse pointer or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.crosshair">https://api.highcharts.com/highcharts/xAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.crosshair">https://api.highcharts.com/highstock/xAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.crosshair">https://api.highcharts.com/highmaps/xAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|XAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  @Nullable
  Unknown getCrosshair();

  /**
   * (Highcharts, Highstock, Highmaps) Configure a crosshair that follows
   * either the mouse pointer or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.crosshair">https://api.highcharts.com/highcharts/xAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.crosshair">https://api.highcharts.com/highstock/xAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.crosshair">https://api.highcharts.com/highmaps/xAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|XAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(XAxisCrosshairOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Configure a crosshair that follows
   * either the mouse pointer or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.crosshair">https://api.highcharts.com/highcharts/xAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.crosshair">https://api.highcharts.com/highstock/xAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.crosshair">https://api.highcharts.com/highmaps/xAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|XAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator">https://api.highcharts.com/gantt/xAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|XAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  @Nullable
  Unknown getCurrentDateIndicator();

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator">https://api.highcharts.com/gantt/xAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|XAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(boolean value);

  /**
   * (Gantt) Show an indicator on the axis for the current date and time. Can
   * be a boolean or a configuration object similar to xAxis.plotLines.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator">https://api.highcharts.com/gantt/xAxis.currentDateIndicator</a>
   *
   * @implspec currentDateIndicator?: (boolean|XAxisCurrentDateIndicatorOptions);
   *
   */
  @JSProperty("currentDateIndicator")
  void setCurrentDateIndicator(XAxisCurrentDateIndicatorOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/xAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: XAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  XAxisDateTimeLabelFormatsOptions getDateTimeLabelFormats();

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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/xAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/xAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: XAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(XAxisDateTimeLabelFormatsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.description">https://api.highcharts.com/highcharts/xAxis.description</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.description">https://api.highcharts.com/highstock/xAxis.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.description">https://api.highcharts.com/highmaps/xAxis.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Highmaps) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.description">https://api.highcharts.com/highcharts/xAxis.description</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.description">https://api.highcharts.com/highstock/xAxis.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.description">https://api.highcharts.com/highmaps/xAxis.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * end.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.endOnTick">https://api.highcharts.com/highcharts/xAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.endOnTick">https://api.highcharts.com/highstock/xAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.endOnTick">https://api.highcharts.com/highmaps/xAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
   * tick. Use this option with the <code>maxPadding</code> option to control the axis
   * end.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.endOnTick">https://api.highcharts.com/highcharts/xAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.endOnTick">https://api.highcharts.com/highstock/xAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.endOnTick">https://api.highcharts.com/highmaps/xAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events">https://api.highcharts.com/highcharts/xAxis.events</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events">https://api.highcharts.com/highstock/xAxis.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.events">https://api.highcharts.com/highmaps/xAxis.events</a>
   *
   * @implspec events?: XAxisEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  XAxisEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.events">https://api.highcharts.com/highcharts/xAxis.events</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.events">https://api.highcharts.com/highstock/xAxis.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.events">https://api.highcharts.com/highmaps/xAxis.events</a>
   *
   * @implspec events?: XAxisEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(XAxisEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.floor">https://api.highcharts.com/highcharts/xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.floor">https://api.highcharts.com/highstock/xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.floor">https://api.highcharts.com/gantt/xAxis.floor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.floor">https://api.highcharts.com/highcharts/xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.floor">https://api.highcharts.com/highstock/xAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.floor">https://api.highcharts.com/gantt/xAxis.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.grid">https://api.highcharts.com/gantt/xAxis.grid</a>
   *
   * @implspec grid?: XAxisGridOptions;
   *
   */
  @JSProperty("grid")
  @Nullable
  XAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.grid">https://api.highcharts.com/gantt/xAxis.grid</a>
   *
   * @implspec grid?: XAxisGridOptions;
   *
   */
  @JSProperty("grid")
  void setGrid(XAxisGridOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending the
   * ticks across the plot area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridLineColor">https://api.highcharts.com/highcharts/xAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridLineColor">https://api.highcharts.com/highstock/xAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.gridLineColor">https://api.highcharts.com/highmaps/xAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: ColorString;
   *
   */
  @JSProperty("gridLineColor")
  @Nullable
  String getGridLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending the
   * ticks across the plot area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridLineColor">https://api.highcharts.com/highcharts/xAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridLineColor">https://api.highcharts.com/highstock/xAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.gridLineColor">https://api.highcharts.com/highmaps/xAxis.gridLineColor</a>
   *
   * @implspec gridLineColor?: ColorString;
   *
   */
  @JSProperty("gridLineColor")
  void setGridLineColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
   * lines. For possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridLineDashStyle">https://api.highcharts.com/highcharts/xAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridLineDashStyle">https://api.highcharts.com/highstock/xAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.gridLineDashStyle">https://api.highcharts.com/highmaps/xAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  @Nullable
  GridLineDashStyle getGridLineDashStyle();

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
   * lines. For possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridLineDashStyle">https://api.highcharts.com/highcharts/xAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridLineDashStyle">https://api.highcharts.com/highstock/xAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.gridLineDashStyle">https://api.highcharts.com/highmaps/xAxis.gridLineDashStyle</a>
   *
   * @implspec gridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("gridLineDashStyle")
  void setGridLineDashStyle(GridLineDashStyle value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
   * the ticks across the plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridLineWidth">https://api.highcharts.com/highcharts/xAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridLineWidth">https://api.highcharts.com/highstock/xAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.gridLineWidth">https://api.highcharts.com/highmaps/xAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  double getGridLineWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
   * the ticks across the plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridLineWidth">https://api.highcharts.com/highcharts/xAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridLineWidth">https://api.highcharts.com/highstock/xAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.gridLineWidth">https://api.highcharts.com/highmaps/xAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  void setGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridZIndex">https://api.highcharts.com/highcharts/xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridZIndex">https://api.highcharts.com/highstock/xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.gridZIndex">https://api.highcharts.com/gantt/xAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.gridZIndex">https://api.highcharts.com/highcharts/xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.gridZIndex">https://api.highcharts.com/highstock/xAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.gridZIndex">https://api.highcharts.com/gantt/xAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  void setGridZIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
   * after render time to get a pointer to the axis object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.id">https://api.highcharts.com/highcharts/xAxis.id</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.id">https://api.highcharts.com/highstock/xAxis.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.id">https://api.highcharts.com/highmaps/xAxis.id</a>
   *
   * @implspec id?: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.id">https://api.highcharts.com/highcharts/xAxis.id</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.id">https://api.highcharts.com/highstock/xAxis.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.id">https://api.highcharts.com/highmaps/xAxis.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The axis labels show the number or
   * category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.labels">https://api.highcharts.com/highcharts/xAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.labels">https://api.highcharts.com/highstock/xAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.labels">https://api.highcharts.com/highmaps/xAxis.labels</a>
   *
   * @implspec labels?: XAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  XAxisLabelsOptions getLabels();

  /**
   * (Highcharts, Highstock, Highmaps) The axis labels show the number or
   * category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.labels">https://api.highcharts.com/highcharts/xAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.labels">https://api.highcharts.com/highstock/xAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.labels">https://api.highcharts.com/highmaps/xAxis.labels</a>
   *
   * @implspec labels?: XAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(XAxisLabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.lineColor">https://api.highcharts.com/highcharts/xAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.lineColor">https://api.highcharts.com/highstock/xAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.lineColor">https://api.highcharts.com/highmaps/xAxis.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.lineColor">https://api.highcharts.com/highcharts/xAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.lineColor">https://api.highcharts.com/highstock/xAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.lineColor">https://api.highcharts.com/highmaps/xAxis.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the line marking the axis
   * itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.lineWidth">https://api.highcharts.com/highcharts/xAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.lineWidth">https://api.highcharts.com/highstock/xAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.lineWidth">https://api.highcharts.com/highmaps/xAxis.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the line marking the axis
   * itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.lineWidth">https://api.highcharts.com/highcharts/xAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.lineWidth">https://api.highcharts.com/highstock/xAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.lineWidth">https://api.highcharts.com/highmaps/xAxis.lineWidth</a>
   *
   * @implspec lineWidth?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.linkedTo">https://api.highcharts.com/highcharts/xAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.linkedTo">https://api.highcharts.com/highstock/xAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.linkedTo">https://api.highcharts.com/gantt/xAxis.linkedTo</a>
   *
   * @implspec linkedTo?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.linkedTo">https://api.highcharts.com/highcharts/xAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.linkedTo">https://api.highcharts.com/highstock/xAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.linkedTo">https://api.highcharts.com/gantt/xAxis.linkedTo</a>
   *
   * @implspec linkedTo?: number;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The maximum value of the axis. If
   * <code>null</code>, the max value is automatically calculated.
   *
   * If the endOnTick option is true, the <code>max</code> value might be rounded up.
   *
   * If a tickAmount is set, the axis may be extended beyond the set max in
   * order to reach the given number of ticks. The same may happen in a chart
   * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
   * is applied internally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.max">https://api.highcharts.com/highcharts/xAxis.max</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.max">https://api.highcharts.com/highstock/xAxis.max</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.max">https://api.highcharts.com/highmaps/xAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * (Highcharts, Highstock, Highmaps) The maximum value of the axis. If
   * <code>null</code>, the max value is automatically calculated.
   *
   * If the endOnTick option is true, the <code>max</code> value might be rounded up.
   *
   * If a tickAmount is set, the axis may be extended beyond the set max in
   * order to reach the given number of ticks. The same may happen in a chart
   * with multiple axes, determined by chart. alignTicks, where a <code>tickAmount</code>
   * is applied internally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.max">https://api.highcharts.com/highcharts/xAxis.max</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.max">https://api.highcharts.com/highstock/xAxis.max</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.max">https://api.highcharts.com/highmaps/xAxis.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
   * the length of the axis. A padding of 0.05 will make a 100px axis 5px
   * longer. This is useful when you don't want the highest data value to
   * appear on the edge of the plot area. When the axis' <code>max</code> option is set
   * or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will
   * be ignored.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.maxPadding">https://api.highcharts.com/highcharts/xAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.maxPadding">https://api.highcharts.com/highstock/xAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.maxPadding">https://api.highcharts.com/highmaps/xAxis.maxPadding</a>
   *
   * @implspec maxPadding?: number;
   *
   */
  @JSProperty("maxPadding")
  double getMaxPadding();

  /**
   * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
   * the length of the axis. A padding of 0.05 will make a 100px axis 5px
   * longer. This is useful when you don't want the highest data value to
   * appear on the edge of the plot area. When the axis' <code>max</code> option is set
   * or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will
   * be ignored.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.maxPadding">https://api.highcharts.com/highcharts/xAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.maxPadding">https://api.highcharts.com/highstock/xAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.maxPadding">https://api.highcharts.com/highmaps/xAxis.maxPadding</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.maxRange">https://api.highcharts.com/highstock/xAxis.maxRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.maxRange">https://api.highcharts.com/highstock/xAxis.maxRange</a>
   *
   * @implspec maxRange?: number;
   *
   */
  @JSProperty("maxRange")
  void setMaxRange(double value);

  /**
   * (Highcharts, Highstock) Deprecated. Use <code>minRange</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.maxZoom">https://api.highcharts.com/highcharts/xAxis.maxZoom</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.maxZoom">https://api.highcharts.com/highstock/xAxis.maxZoom</a>
   *
   * @implspec maxZoom?: number;
   *
   */
  @JSProperty("maxZoom")
  double getMaxZoom();

  /**
   * (Highcharts, Highstock) Deprecated. Use <code>minRange</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.maxZoom">https://api.highcharts.com/highcharts/xAxis.maxZoom</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.maxZoom">https://api.highcharts.com/highstock/xAxis.maxZoom</a>
   *
   * @implspec maxZoom?: number;
   *
   */
  @JSProperty("maxZoom")
  void setMaxZoom(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The minimum value of the axis. If
   * <code>null</code> the min value is automatically calculated.
   *
   * If the startOnTick option is true (default), the <code>min</code> value might be
   * rounded down.
   *
   * The automatically calculated minimum value is also affected by floor,
   * softMin, minPadding, minRange as well as series.threshold and
   * series.softThreshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.min">https://api.highcharts.com/highcharts/xAxis.min</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.min">https://api.highcharts.com/highstock/xAxis.min</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.min">https://api.highcharts.com/highmaps/xAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * (Highcharts, Highstock, Highmaps) The minimum value of the axis. If
   * <code>null</code> the min value is automatically calculated.
   *
   * If the startOnTick option is true (default), the <code>min</code> value might be
   * rounded down.
   *
   * The automatically calculated minimum value is also affected by floor,
   * softMin, minPadding, minRange as well as series.threshold and
   * series.softThreshold.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.min">https://api.highcharts.com/highcharts/xAxis.min</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.min">https://api.highcharts.com/highstock/xAxis.min</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.min">https://api.highcharts.com/highmaps/xAxis.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorGridLineColor">https://api.highcharts.com/highcharts/xAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorGridLineColor">https://api.highcharts.com/highstock/xAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorGridLineColor">https://api.highcharts.com/highmaps/xAxis.minorGridLineColor</a>
   *
   * @implspec minorGridLineColor?: ColorString;
   *
   */
  @JSProperty("minorGridLineColor")
  @Nullable
  String getMinorGridLineColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorGridLineColor">https://api.highcharts.com/highcharts/xAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorGridLineColor">https://api.highcharts.com/highstock/xAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorGridLineColor">https://api.highcharts.com/highmaps/xAxis.minorGridLineColor</a>
   *
   * @implspec minorGridLineColor?: ColorString;
   *
   */
  @JSProperty("minorGridLineColor")
  void setMinorGridLineColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
   * lines. For possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorGridLineDashStyle">https://api.highcharts.com/highcharts/xAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/xAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorGridLineDashStyle">https://api.highcharts.com/highmaps/xAxis.minorGridLineDashStyle</a>
   *
   * @implspec minorGridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("minorGridLineDashStyle")
  @Nullable
  MinorGridLineDashStyle getMinorGridLineDashStyle();

  /**
   * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
   * lines. For possible values, see this demonstration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorGridLineDashStyle">https://api.highcharts.com/highcharts/xAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/xAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorGridLineDashStyle">https://api.highcharts.com/highmaps/xAxis.minorGridLineDashStyle</a>
   *
   * @implspec minorGridLineDashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("minorGridLineDashStyle")
  void setMinorGridLineDashStyle(MinorGridLineDashStyle value);

  /**
   * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorGridLineWidth">https://api.highcharts.com/highcharts/xAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorGridLineWidth">https://api.highcharts.com/highstock/xAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorGridLineWidth">https://api.highcharts.com/highmaps/xAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorGridLineWidth">https://api.highcharts.com/highcharts/xAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorGridLineWidth">https://api.highcharts.com/highstock/xAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorGridLineWidth">https://api.highcharts.com/highmaps/xAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickColor">https://api.highcharts.com/highcharts/xAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickColor">https://api.highcharts.com/highstock/xAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickColor">https://api.highcharts.com/highmaps/xAxis.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  String getMinorTickColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickColor">https://api.highcharts.com/highcharts/xAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickColor">https://api.highcharts.com/highstock/xAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickColor">https://api.highcharts.com/highmaps/xAxis.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickInterval">https://api.highcharts.com/highcharts/xAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickInterval">https://api.highcharts.com/highstock/xAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickInterval">https://api.highcharts.com/highmaps/xAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  @Nullable
  Unknown getMinorTickInterval();

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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickInterval">https://api.highcharts.com/highcharts/xAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickInterval">https://api.highcharts.com/highstock/xAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickInterval">https://api.highcharts.com/highmaps/xAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickInterval">https://api.highcharts.com/highcharts/xAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickInterval">https://api.highcharts.com/highstock/xAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickInterval">https://api.highcharts.com/highmaps/xAxis.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
   * marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickLength">https://api.highcharts.com/highcharts/xAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickLength">https://api.highcharts.com/highstock/xAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickLength">https://api.highcharts.com/highmaps/xAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
   * marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickLength">https://api.highcharts.com/highcharts/xAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickLength">https://api.highcharts.com/highstock/xAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickLength">https://api.highcharts.com/highmaps/xAxis.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  void setMinorTickLength(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickPosition">https://api.highcharts.com/highcharts/xAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickPosition">https://api.highcharts.com/highstock/xAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickPosition">https://api.highcharts.com/highmaps/xAxis.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  @Nullable
  MinorTickPosition getMinorTickPosition();

  /**
   * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickPosition">https://api.highcharts.com/highcharts/xAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickPosition">https://api.highcharts.com/highstock/xAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickPosition">https://api.highcharts.com/highmaps/xAxis.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  void setMinorTickPosition(MinorTickPosition value);

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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTicks">https://api.highcharts.com/highcharts/xAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTicks">https://api.highcharts.com/highstock/xAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTicks">https://api.highcharts.com/highmaps/xAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTicks">https://api.highcharts.com/highcharts/xAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTicks">https://api.highcharts.com/highstock/xAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTicks">https://api.highcharts.com/highmaps/xAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickWidth">https://api.highcharts.com/highcharts/xAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickWidth">https://api.highcharts.com/highstock/xAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickWidth">https://api.highcharts.com/highmaps/xAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minorTickWidth">https://api.highcharts.com/highcharts/xAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minorTickWidth">https://api.highcharts.com/highstock/xAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minorTickWidth">https://api.highcharts.com/highmaps/xAxis.minorTickWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minPadding">https://api.highcharts.com/highcharts/xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minPadding">https://api.highcharts.com/highstock/xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.minPadding">https://api.highcharts.com/gantt/xAxis.minPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minPadding">https://api.highcharts.com/highcharts/xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minPadding">https://api.highcharts.com/highstock/xAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.minPadding">https://api.highcharts.com/gantt/xAxis.minPadding</a>
   *
   * @implspec minPadding?: number;
   *
   */
  @JSProperty("minPadding")
  void setMinPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The minimum range to display on this
   * axis. The entire axis will not be allowed to span over a smaller interval
   * than this. For example, for a datetime axis the main unit is
   * milliseconds. If minRange is set to 3600000, you can't zoom in more than
   * to one hour.
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minRange">https://api.highcharts.com/highcharts/xAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minRange">https://api.highcharts.com/highstock/xAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minRange">https://api.highcharts.com/highmaps/xAxis.minRange</a>
   *
   * @implspec minRange?: number;
   *
   */
  @JSProperty("minRange")
  double getMinRange();

  /**
   * (Highcharts, Highstock, Highmaps) The minimum range to display on this
   * axis. The entire axis will not be allowed to span over a smaller interval
   * than this. For example, for a datetime axis the main unit is
   * milliseconds. If minRange is set to 3600000, you can't zoom in more than
   * to one hour.
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minRange">https://api.highcharts.com/highcharts/xAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minRange">https://api.highcharts.com/highstock/xAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minRange">https://api.highcharts.com/highmaps/xAxis.minRange</a>
   *
   * @implspec minRange?: number;
   *
   */
  @JSProperty("minRange")
  void setMinRange(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The minimum tick interval allowed in
   * axis values. For example on zooming in on an axis with daily data, this
   * can be used to prevent the axis from showing hours. Defaults to the
   * closest distance between two points on the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minTickInterval">https://api.highcharts.com/highcharts/xAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minTickInterval">https://api.highcharts.com/highstock/xAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minTickInterval">https://api.highcharts.com/highmaps/xAxis.minTickInterval</a>
   *
   * @implspec minTickInterval?: number;
   *
   */
  @JSProperty("minTickInterval")
  double getMinTickInterval();

  /**
   * (Highcharts, Highstock, Highmaps) The minimum tick interval allowed in
   * axis values. For example on zooming in on an axis with daily data, this
   * can be used to prevent the axis from showing hours. Defaults to the
   * closest distance between two points on the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.minTickInterval">https://api.highcharts.com/highcharts/xAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.minTickInterval">https://api.highcharts.com/highstock/xAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.minTickInterval">https://api.highcharts.com/highmaps/xAxis.minTickInterval</a>
   *
   * @implspec minTickInterval?: number;
   *
   */
  @JSProperty("minTickInterval")
  void setMinTickInterval(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The distance in pixels from the plot
   * area to the axis line. A positive offset moves the axis with it's line,
   * labels and ticks away from the plot area. This is typically used when two
   * or more axes are displayed on the same side of the plot. With multiple
   * axes the offset is dynamically adjusted to avoid collision, this can be
   * overridden by setting offset explicitly.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.offset">https://api.highcharts.com/highcharts/xAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.offset">https://api.highcharts.com/highstock/xAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.offset">https://api.highcharts.com/highmaps/xAxis.offset</a>
   *
   * @implspec offset?: number;
   *
   */
  @JSProperty("offset")
  double getOffset();

  /**
   * (Highcharts, Highstock, Highmaps) The distance in pixels from the plot
   * area to the axis line. A positive offset moves the axis with it's line,
   * labels and ticks away from the plot area. This is typically used when two
   * or more axes are displayed on the same side of the plot. With multiple
   * axes the offset is dynamically adjusted to avoid collision, this can be
   * overridden by setting offset explicitly.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.offset">https://api.highcharts.com/highcharts/xAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.offset">https://api.highcharts.com/highstock/xAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.offset">https://api.highcharts.com/highmaps/xAxis.offset</a>
   *
   * @implspec offset?: number;
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to display the axis on the
   * opposite side of the normal. The normal is on the left side for vertical
   * axes and bottom for horizontal, so the opposite sides will be right and
   * top respectively. This is typically used with dual or multiple axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.opposite">https://api.highcharts.com/highcharts/xAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.opposite">https://api.highcharts.com/highstock/xAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.opposite">https://api.highcharts.com/highmaps/xAxis.opposite</a>
   *
   * @implspec opposite?: boolean;
   *
   */
  @JSProperty("opposite")
  boolean getOpposite();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to display the axis on the
   * opposite side of the normal. The normal is on the left side for vertical
   * axes and bottom for horizontal, so the opposite sides will be right and
   * top respectively. This is typically used with dual or multiple axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.opposite">https://api.highcharts.com/highcharts/xAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.opposite">https://api.highcharts.com/highstock/xAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.opposite">https://api.highcharts.com/highmaps/xAxis.opposite</a>
   *
   * @implspec opposite?: boolean;
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.ordinal">https://api.highcharts.com/highstock/xAxis.ordinal</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.ordinal">https://api.highcharts.com/highstock/xAxis.ordinal</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.overscroll">https://api.highcharts.com/highstock/xAxis.overscroll</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.overscroll">https://api.highcharts.com/highstock/xAxis.overscroll</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.pane">https://api.highcharts.com/highcharts/xAxis.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.pane">https://api.highcharts.com/highcharts/xAxis.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.plotBands">https://api.highcharts.com/highcharts/xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.plotBands">https://api.highcharts.com/highstock/xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.plotBands">https://api.highcharts.com/gantt/xAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<XAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  @Nullable
  Array<XAxisPlotBandsOptions> getPlotBands();

  /**
   * (Highcharts, Highstock, Gantt) An array of colored bands stretching
   * across the plot area marking an interval on the axis.
   *
   * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
   * class in addition to the <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.plotBands">https://api.highcharts.com/highcharts/xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.plotBands">https://api.highcharts.com/highstock/xAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.plotBands">https://api.highcharts.com/gantt/xAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<XAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  void setPlotBands(Array<XAxisPlotBandsOptions> value);

  /**
   * (Highcharts, Highstock, Gantt) An array of lines stretching across the
   * plot area, marking a specific value on one of the axes.
   *
   * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
   * class in addition to the <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.plotLines">https://api.highcharts.com/highcharts/xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.plotLines">https://api.highcharts.com/highstock/xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.plotLines">https://api.highcharts.com/gantt/xAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<XAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  @Nullable
  Array<XAxisPlotLinesOptions> getPlotLines();

  /**
   * (Highcharts, Highstock, Gantt) An array of lines stretching across the
   * plot area, marking a specific value on one of the axes.
   *
   * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
   * class in addition to the <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.plotLines">https://api.highcharts.com/highcharts/xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.plotLines">https://api.highcharts.com/highstock/xAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.plotLines">https://api.highcharts.com/gantt/xAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<XAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  void setPlotLines(Array<XAxisPlotLinesOptions> value);

  /**
   * (Highstock) The zoomed range to display when only defining one or none of
   * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
   * month can be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.range">https://api.highcharts.com/highstock/xAxis.range</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.range">https://api.highcharts.com/highstock/xAxis.range</a>
   *
   * @implspec range?: number;
   *
   */
  @JSProperty("range")
  void setRange(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
   * highest number is closest to the origin. If the chart is inverted, the x
   * axis is reversed by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.reversed">https://api.highcharts.com/highcharts/xAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.reversed">https://api.highcharts.com/highstock/xAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.reversed">https://api.highcharts.com/highmaps/xAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
   * highest number is closest to the origin. If the chart is inverted, the x
   * axis is reversed by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.reversed">https://api.highcharts.com/highcharts/xAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.reversed">https://api.highcharts.com/highstock/xAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.reversed">https://api.highcharts.com/highmaps/xAxis.reversed</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.reversedStacks">https://api.highcharts.com/highcharts/xAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.reversedStacks">https://api.highcharts.com/highstock/xAxis.reversedStacks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.reversedStacks">https://api.highcharts.com/highcharts/xAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.reversedStacks">https://api.highcharts.com/highstock/xAxis.reversedStacks</a>
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
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar">https://api.highcharts.com/highstock/xAxis.scrollbar</a>
   *
   * @implspec scrollbar?: XAxisScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  @Nullable
  XAxisScrollbarOptions getScrollbar();

  /**
   * (Highstock) An optional scrollbar to display on the X axis in response to
   * limiting the minimum and maximum of the axis values.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar">https://api.highcharts.com/highstock/xAxis.scrollbar</a>
   *
   * @implspec scrollbar?: XAxisScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  void setScrollbar(XAxisScrollbarOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the axis line and title
   * when the axis has no data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.showEmpty">https://api.highcharts.com/highcharts/xAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.showEmpty">https://api.highcharts.com/highstock/xAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.showEmpty">https://api.highcharts.com/highmaps/xAxis.showEmpty</a>
   *
   * @implspec showEmpty?: boolean;
   *
   */
  @JSProperty("showEmpty")
  boolean getShowEmpty();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the axis line and title
   * when the axis has no data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.showEmpty">https://api.highcharts.com/highcharts/xAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.showEmpty">https://api.highcharts.com/highstock/xAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.showEmpty">https://api.highcharts.com/highmaps/xAxis.showEmpty</a>
   *
   * @implspec showEmpty?: boolean;
   *
   */
  @JSProperty("showEmpty")
  void setShowEmpty(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.showFirstLabel">https://api.highcharts.com/highcharts/xAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.showFirstLabel">https://api.highcharts.com/highstock/xAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.showFirstLabel">https://api.highcharts.com/highmaps/xAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.showFirstLabel">https://api.highcharts.com/highcharts/xAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.showFirstLabel">https://api.highcharts.com/highstock/xAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.showFirstLabel">https://api.highcharts.com/highmaps/xAxis.showFirstLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.showLastLabel">https://api.highcharts.com/highcharts/xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.showLastLabel">https://api.highcharts.com/highstock/xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.showLastLabel">https://api.highcharts.com/gantt/xAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.showLastLabel">https://api.highcharts.com/highcharts/xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.showLastLabel">https://api.highcharts.com/highstock/xAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.showLastLabel">https://api.highcharts.com/gantt/xAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.softMax">https://api.highcharts.com/highcharts/xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.softMax">https://api.highcharts.com/highstock/xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.softMax">https://api.highcharts.com/gantt/xAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.softMax">https://api.highcharts.com/highcharts/xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.softMax">https://api.highcharts.com/highstock/xAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.softMax">https://api.highcharts.com/gantt/xAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.softMin">https://api.highcharts.com/highcharts/xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.softMin">https://api.highcharts.com/highstock/xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.softMin">https://api.highcharts.com/gantt/xAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.softMin">https://api.highcharts.com/highcharts/xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.softMin">https://api.highcharts.com/highstock/xAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.softMin">https://api.highcharts.com/gantt/xAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.startOfWeek">https://api.highcharts.com/highcharts/xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.startOfWeek">https://api.highcharts.com/highstock/xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.startOfWeek">https://api.highcharts.com/gantt/xAxis.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.startOfWeek">https://api.highcharts.com/highcharts/xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.startOfWeek">https://api.highcharts.com/highstock/xAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.startOfWeek">https://api.highcharts.com/gantt/xAxis.startOfWeek</a>
   *
   * @implspec startOfWeek?: number;
   *
   */
  @JSProperty("startOfWeek")
  void setStartOfWeek(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
   * tick. Use this option with the <code>minPadding</code> option to control the axis
   * start.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.startOnTick">https://api.highcharts.com/highcharts/xAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.startOnTick">https://api.highcharts.com/highstock/xAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.startOnTick">https://api.highcharts.com/highmaps/xAxis.startOnTick</a>
   *
   * @implspec startOnTick?: boolean;
   *
   */
  @JSProperty("startOnTick")
  boolean getStartOnTick();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
   * tick. Use this option with the <code>minPadding</code> option to control the axis
   * start.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.startOnTick">https://api.highcharts.com/highcharts/xAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.startOnTick">https://api.highcharts.com/highstock/xAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.startOnTick">https://api.highcharts.com/highmaps/xAxis.startOnTick</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickAmount">https://api.highcharts.com/highcharts/xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickAmount">https://api.highcharts.com/highstock/xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.tickAmount">https://api.highcharts.com/gantt/xAxis.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickAmount">https://api.highcharts.com/highcharts/xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickAmount">https://api.highcharts.com/highstock/xAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.tickAmount">https://api.highcharts.com/gantt/xAxis.tickAmount</a>
   *
   * @implspec tickAmount?: number;
   *
   */
  @JSProperty("tickAmount")
  void setTickAmount(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickColor">https://api.highcharts.com/highcharts/xAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickColor">https://api.highcharts.com/highstock/xAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickColor">https://api.highcharts.com/highmaps/xAxis.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  @Nullable
  String getTickColor();

  /**
   * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickColor">https://api.highcharts.com/highcharts/xAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickColor">https://api.highcharts.com/highstock/xAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickColor">https://api.highcharts.com/highmaps/xAxis.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  void setTickColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
   * units. When <code>undefined</code>, the tick interval is computed to approximately
   * follow the tickPixelInterval on linear and datetime axes. On categorized
   * axes, a <code>undefined</code> tickInterval will default to 1, one category. Note
   * that datetime axes are based on milliseconds, so for example an interval
   * of one day is expressed as <code>24 * 3600 * 1000</code>.
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickInterval">https://api.highcharts.com/highcharts/xAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickInterval">https://api.highcharts.com/highstock/xAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickInterval">https://api.highcharts.com/highmaps/xAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  double getTickInterval();

  /**
   * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
   * units. When <code>undefined</code>, the tick interval is computed to approximately
   * follow the tickPixelInterval on linear and datetime axes. On categorized
   * axes, a <code>undefined</code> tickInterval will default to 1, one category. Note
   * that datetime axes are based on milliseconds, so for example an interval
   * of one day is expressed as <code>24 * 3600 * 1000</code>.
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickInterval">https://api.highcharts.com/highcharts/xAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickInterval">https://api.highcharts.com/highstock/xAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickInterval">https://api.highcharts.com/highmaps/xAxis.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the main tick
   * marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickLength">https://api.highcharts.com/highcharts/xAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickLength">https://api.highcharts.com/highstock/xAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickLength">https://api.highcharts.com/highmaps/xAxis.tickLength</a>
   *
   * @implspec tickLength?: number;
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel length of the main tick
   * marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickLength">https://api.highcharts.com/highcharts/xAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickLength">https://api.highcharts.com/highstock/xAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickLength">https://api.highcharts.com/highmaps/xAxis.tickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/xAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.tickmarkPlacement">https://api.highcharts.com/gantt/xAxis.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/xAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.tickmarkPlacement">https://api.highcharts.com/gantt/xAxis.tickmarkPlacement</a>
   *
   * @implspec tickmarkPlacement?: (&quot;between&quot;|&quot;on&quot;|undefined);
   *
   */
  @JSProperty("tickmarkPlacement")
  void setTickmarkPlacement(TickmarkPlacement value);

  /**
   * (Highcharts, Highstock, Highmaps) If tickInterval is <code>null</code> this option
   * sets the approximate pixel interval of the tick marks. Not applicable to
   * categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPixelInterval">https://api.highcharts.com/highcharts/xAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPixelInterval">https://api.highcharts.com/highstock/xAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPixelInterval">https://api.highcharts.com/highmaps/xAxis.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  double getTickPixelInterval();

  /**
   * (Highcharts, Highstock, Highmaps) If tickInterval is <code>null</code> this option
   * sets the approximate pixel interval of the tick marks. Not applicable to
   * categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPixelInterval">https://api.highcharts.com/highcharts/xAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPixelInterval">https://api.highcharts.com/highstock/xAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPixelInterval">https://api.highcharts.com/highmaps/xAxis.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  void setTickPixelInterval(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The position of the major tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPosition">https://api.highcharts.com/highcharts/xAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPosition">https://api.highcharts.com/highstock/xAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPosition">https://api.highcharts.com/highmaps/xAxis.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  @Nullable
  TickPosition getTickPosition();

  /**
   * (Highcharts, Highstock, Highmaps) The position of the major tick marks
   * relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPosition">https://api.highcharts.com/highcharts/xAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPosition">https://api.highcharts.com/highstock/xAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPosition">https://api.highcharts.com/highmaps/xAxis.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  void setTickPosition(TickPosition value);

  /**
   * (Highcharts, Highstock, Highmaps) A callback function returning array
   * defining where the ticks are laid out on the axis. This overrides the
   * default behaviour of tickPixelInterval and tickInterval. The automatic
   * tick positions are accessible through <code>this.tickPositions</code> and can be
   * modified by the callback.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPositioner">https://api.highcharts.com/highcharts/xAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPositioner">https://api.highcharts.com/highstock/xAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPositioner">https://api.highcharts.com/highmaps/xAxis.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  @Nullable
  TickPositioner getTickPositioner();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function returning array
   * defining where the ticks are laid out on the axis. This overrides the
   * default behaviour of tickPixelInterval and tickInterval. The automatic
   * tick positions are accessible through <code>this.tickPositions</code> and can be
   * modified by the callback.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPositioner">https://api.highcharts.com/highcharts/xAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPositioner">https://api.highcharts.com/highstock/xAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPositioner">https://api.highcharts.com/highmaps/xAxis.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  void setTickPositioner(TickPositioner value);

  /**
   * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
   * laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPositions">https://api.highcharts.com/highcharts/xAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPositions">https://api.highcharts.com/highstock/xAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPositions">https://api.highcharts.com/highmaps/xAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickPositions">https://api.highcharts.com/highcharts/xAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickPositions">https://api.highcharts.com/highstock/xAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickPositions">https://api.highcharts.com/highmaps/xAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
   * marks.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickWidth">https://api.highcharts.com/highcharts/xAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickWidth">https://api.highcharts.com/highstock/xAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickWidth">https://api.highcharts.com/highmaps/xAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
   * marks.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.tickWidth">https://api.highcharts.com/highcharts/xAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.tickWidth">https://api.highcharts.com/highstock/xAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.tickWidth">https://api.highcharts.com/highmaps/xAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The axis title, showing next to the
   * axis line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.title">https://api.highcharts.com/highcharts/xAxis.title</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.title">https://api.highcharts.com/highstock/xAxis.title</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.title">https://api.highcharts.com/highmaps/xAxis.title</a>
   *
   * @implspec title?: XAxisTitleOptions;
   *
   */
  @JSProperty("title")
  @Nullable
  XAxisTitleOptions getTitle();

  /**
   * (Highcharts, Highstock, Highmaps) The axis title, showing next to the
   * axis line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.title">https://api.highcharts.com/highcharts/xAxis.title</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.title">https://api.highcharts.com/highstock/xAxis.title</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis.title">https://api.highcharts.com/highmaps/xAxis.title</a>
   *
   * @implspec title?: XAxisTitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(XAxisTitleOptions value);

  /**
   * (Highcharts, Gantt) The type of axis. Can be one of <code>linear</code>,
   * <code>logarithmic</code>, <code>datetime</code> or <code>category</code>. In a datetime axis, the numbers
   * are given in milliseconds, and tick marks are placed on appropriate
   * values like full hours or days. In a category axis, the point names of
   * the chart's series are used for categories, if not a categories array is
   * defined.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.type">https://api.highcharts.com/highcharts/xAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.type">https://api.highcharts.com/gantt/xAxis.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.type">https://api.highcharts.com/highcharts/xAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.type">https://api.highcharts.com/gantt/xAxis.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.uniqueNames">https://api.highcharts.com/highcharts/xAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.uniqueNames">https://api.highcharts.com/gantt/xAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.uniqueNames">https://api.highcharts.com/highcharts/xAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.uniqueNames">https://api.highcharts.com/gantt/xAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.units">https://api.highcharts.com/highcharts/xAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.units">https://api.highcharts.com/highstock/xAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.units">https://api.highcharts.com/gantt/xAxis.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.units">https://api.highcharts.com/highcharts/xAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.units">https://api.highcharts.com/highstock/xAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.units">https://api.highcharts.com/gantt/xAxis.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.visible">https://api.highcharts.com/highcharts/xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.visible">https://api.highcharts.com/highstock/xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.visible">https://api.highcharts.com/gantt/xAxis.visible</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.visible">https://api.highcharts.com/highcharts/xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.visible">https://api.highcharts.com/highstock/xAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.visible">https://api.highcharts.com/gantt/xAxis.visible</a>
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
