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
 * (Highcharts, Highstock, Highmaps) The Y axis or value axis. Normally this is
 * the vertical axis, though if the chart is inverted this is the horizontal
 * axis. In case of multiple axes, the yAxis node is an array of configuration
 * objects.
 *
 * See the Axis object for programmatic access to the axis.
 *
 * @see <a href="https://api.highcharts.com/highcharts/yAxis">https://api.highcharts.com/highcharts/yAxis</a>
 * @see <a href="https://api.highcharts.com/highstock/yAxis">https://api.highcharts.com/highstock/yAxis</a>
 * @see <a href="https://api.highcharts.com/highmaps/yAxis">https://api.highcharts.com/highmaps/yAxis</a>
 *
 */
public interface YAxisOptions extends Any {
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.alignTicks">https://api.highcharts.com/highcharts/yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.alignTicks">https://api.highcharts.com/highstock/yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.alignTicks">https://api.highcharts.com/gantt/yAxis.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.alignTicks">https://api.highcharts.com/highcharts/yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.alignTicks">https://api.highcharts.com/highstock/yAxis.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.alignTicks">https://api.highcharts.com/gantt/yAxis.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.allowDecimals">https://api.highcharts.com/highcharts/yAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.allowDecimals">https://api.highcharts.com/highstock/yAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.allowDecimals">https://api.highcharts.com/highmaps/yAxis.allowDecimals</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.allowDecimals">https://api.highcharts.com/highcharts/yAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.allowDecimals">https://api.highcharts.com/highstock/yAxis.allowDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.allowDecimals">https://api.highcharts.com/highmaps/yAxis.allowDecimals</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.alternateGridColor">https://api.highcharts.com/highcharts/yAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.alternateGridColor">https://api.highcharts.com/highstock/yAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.alternateGridColor">https://api.highcharts.com/highmaps/yAxis.alternateGridColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.alternateGridColor">https://api.highcharts.com/highcharts/yAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.alternateGridColor">https://api.highcharts.com/highstock/yAxis.alternateGridColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.alternateGridColor">https://api.highcharts.com/highmaps/yAxis.alternateGridColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.angle">https://api.highcharts.com/highcharts/yAxis.angle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.angle">https://api.highcharts.com/highcharts/yAxis.angle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks">https://api.highcharts.com/highcharts/yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks">https://api.highcharts.com/highstock/yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks">https://api.highcharts.com/gantt/yAxis.breaks</a>
   *
   * @implspec breaks?: Array<YAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  @Nullable
  Array<YAxisBreaksOptions> getBreaks();

  /**
   * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
   * sections defined will be left out and all the points shifted closer to
   * each other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks">https://api.highcharts.com/highcharts/yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks">https://api.highcharts.com/highstock/yAxis.breaks</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks">https://api.highcharts.com/gantt/yAxis.breaks</a>
   *
   * @implspec breaks?: Array<YAxisBreaksOptions>;
   *
   */
  @JSProperty("breaks")
  void setBreaks(Array<YAxisBreaksOptions> value);

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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.categories">https://api.highcharts.com/highcharts/yAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.categories">https://api.highcharts.com/gantt/yAxis.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.categories">https://api.highcharts.com/highcharts/yAxis.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.categories">https://api.highcharts.com/gantt/yAxis.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.ceiling">https://api.highcharts.com/highcharts/yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.ceiling">https://api.highcharts.com/highstock/yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.ceiling">https://api.highcharts.com/gantt/yAxis.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.ceiling">https://api.highcharts.com/highcharts/yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.ceiling">https://api.highcharts.com/highstock/yAxis.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.ceiling">https://api.highcharts.com/gantt/yAxis.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.className">https://api.highcharts.com/highcharts/yAxis.className</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.className">https://api.highcharts.com/highstock/yAxis.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.className">https://api.highcharts.com/highmaps/yAxis.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.className">https://api.highcharts.com/highcharts/yAxis.className</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.className">https://api.highcharts.com/highstock/yAxis.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.className">https://api.highcharts.com/highmaps/yAxis.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.crosshair">https://api.highcharts.com/highcharts/yAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.crosshair">https://api.highcharts.com/highstock/yAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.crosshair">https://api.highcharts.com/highmaps/yAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|YAxisCrosshairOptions);
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.crosshair">https://api.highcharts.com/highcharts/yAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.crosshair">https://api.highcharts.com/highstock/yAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.crosshair">https://api.highcharts.com/highmaps/yAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|YAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Configure a crosshair that follows
   * either the mouse pointer or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.crosshair">https://api.highcharts.com/highcharts/yAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.crosshair">https://api.highcharts.com/highstock/yAxis.crosshair</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.crosshair">https://api.highcharts.com/highmaps/yAxis.crosshair</a>
   *
   * @implspec crosshair?: (boolean|YAxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(YAxisCrosshairOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/yAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: YAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  YAxisDateTimeLabelFormatsOptions getDateTimeLabelFormats();

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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.dateTimeLabelFormats">https://api.highcharts.com/highcharts/yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.dateTimeLabelFormats">https://api.highcharts.com/highstock/yAxis.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.dateTimeLabelFormats">https://api.highcharts.com/gantt/yAxis.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: YAxisDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(YAxisDateTimeLabelFormatsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.description">https://api.highcharts.com/highcharts/yAxis.description</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.description">https://api.highcharts.com/highstock/yAxis.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.description">https://api.highcharts.com/highmaps/yAxis.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.description">https://api.highcharts.com/highcharts/yAxis.description</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.description">https://api.highcharts.com/highstock/yAxis.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.description">https://api.highcharts.com/highmaps/yAxis.description</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.endOnTick">https://api.highcharts.com/highcharts/yAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.endOnTick">https://api.highcharts.com/highstock/yAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.endOnTick">https://api.highcharts.com/highmaps/yAxis.endOnTick</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.endOnTick">https://api.highcharts.com/highcharts/yAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.endOnTick">https://api.highcharts.com/highstock/yAxis.endOnTick</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.endOnTick">https://api.highcharts.com/highmaps/yAxis.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.events">https://api.highcharts.com/highcharts/yAxis.events</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.events">https://api.highcharts.com/highstock/yAxis.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.events">https://api.highcharts.com/highmaps/yAxis.events</a>
   *
   * @implspec events?: YAxisEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  YAxisEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.events">https://api.highcharts.com/highcharts/yAxis.events</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.events">https://api.highcharts.com/highstock/yAxis.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.events">https://api.highcharts.com/highmaps/yAxis.events</a>
   *
   * @implspec events?: YAxisEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(YAxisEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.floor">https://api.highcharts.com/highcharts/yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.floor">https://api.highcharts.com/highstock/yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.floor">https://api.highcharts.com/gantt/yAxis.floor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.floor">https://api.highcharts.com/highcharts/yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.floor">https://api.highcharts.com/highstock/yAxis.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.floor">https://api.highcharts.com/gantt/yAxis.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/yAxis.grid">https://api.highcharts.com/gantt/yAxis.grid</a>
   *
   * @implspec grid?: YAxisGridOptions;
   *
   */
  @JSProperty("grid")
  @Nullable
  YAxisGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/yAxis.grid">https://api.highcharts.com/gantt/yAxis.grid</a>
   *
   * @implspec grid?: YAxisGridOptions;
   *
   */
  @JSProperty("grid")
  void setGrid(YAxisGridOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the grid lines extending the
   * ticks across the plot area.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineColor">https://api.highcharts.com/highcharts/yAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridLineColor">https://api.highcharts.com/highstock/yAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.gridLineColor">https://api.highcharts.com/highmaps/yAxis.gridLineColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineColor">https://api.highcharts.com/highcharts/yAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridLineColor">https://api.highcharts.com/highstock/yAxis.gridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.gridLineColor">https://api.highcharts.com/highmaps/yAxis.gridLineColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineDashStyle">https://api.highcharts.com/highcharts/yAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridLineDashStyle">https://api.highcharts.com/highstock/yAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.gridLineDashStyle">https://api.highcharts.com/highmaps/yAxis.gridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineDashStyle">https://api.highcharts.com/highcharts/yAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridLineDashStyle">https://api.highcharts.com/highstock/yAxis.gridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.gridLineDashStyle">https://api.highcharts.com/highmaps/yAxis.gridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineInterpolation">https://api.highcharts.com/highcharts/yAxis.gridLineInterpolation</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineInterpolation">https://api.highcharts.com/highcharts/yAxis.gridLineInterpolation</a>
   *
   * @implspec gridLineInterpolation?: (&quot;circle&quot;|&quot;polygon&quot;);
   *
   */
  @JSProperty("gridLineInterpolation")
  void setGridLineInterpolation(GridLineInterpolation value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
   * the ticks across the plot area.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-grid-line</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineWidth">https://api.highcharts.com/highcharts/yAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridLineWidth">https://api.highcharts.com/highstock/yAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.gridLineWidth">https://api.highcharts.com/highmaps/yAxis.gridLineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridLineWidth">https://api.highcharts.com/highcharts/yAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridLineWidth">https://api.highcharts.com/highstock/yAxis.gridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.gridLineWidth">https://api.highcharts.com/highmaps/yAxis.gridLineWidth</a>
   *
   * @implspec gridLineWidth?: number;
   *
   */
  @JSProperty("gridLineWidth")
  void setGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridZIndex">https://api.highcharts.com/highcharts/yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridZIndex">https://api.highcharts.com/highstock/yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.gridZIndex">https://api.highcharts.com/gantt/yAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.gridZIndex">https://api.highcharts.com/highcharts/yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.gridZIndex">https://api.highcharts.com/highstock/yAxis.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.gridZIndex">https://api.highcharts.com/gantt/yAxis.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  void setGridZIndex(double value);

  /**
   * (Highstock) The height of the Y axis. If it's a number, it is interpreted
   * as pixels.
   *
   * Since Highstock 2: If it's a percentage string, it is interpreted as
   * percentages of the total plot height.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.height">https://api.highcharts.com/highstock/yAxis.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  @Nullable
  Unknown getHeight();

  /**
   * (Highstock) The height of the Y axis. If it's a number, it is interpreted
   * as pixels.
   *
   * Since Highstock 2: If it's a percentage string, it is interpreted as
   * percentages of the total plot height.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.height">https://api.highcharts.com/highstock/yAxis.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) The height of the Y axis. If it's a number, it is interpreted
   * as pixels.
   *
   * Since Highstock 2: If it's a percentage string, it is interpreted as
   * percentages of the total plot height.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.height">https://api.highcharts.com/highstock/yAxis.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  void setHeight(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
   * after render time to get a pointer to the axis object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.id">https://api.highcharts.com/highcharts/yAxis.id</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.id">https://api.highcharts.com/highstock/yAxis.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.id">https://api.highcharts.com/highmaps/yAxis.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.id">https://api.highcharts.com/highcharts/yAxis.id</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.id">https://api.highcharts.com/highstock/yAxis.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.id">https://api.highcharts.com/highmaps/yAxis.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.labels">https://api.highcharts.com/highcharts/yAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.labels">https://api.highcharts.com/highstock/yAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.labels">https://api.highcharts.com/highmaps/yAxis.labels</a>
   *
   * @implspec labels?: YAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  YAxisLabelsOptions getLabels();

  /**
   * (Highcharts, Highstock, Highmaps) The axis labels show the number or
   * category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.labels">https://api.highcharts.com/highcharts/yAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.labels">https://api.highcharts.com/highstock/yAxis.labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.labels">https://api.highcharts.com/highmaps/yAxis.labels</a>
   *
   * @implspec labels?: YAxisLabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(YAxisLabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
   * itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.lineColor">https://api.highcharts.com/highcharts/yAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.lineColor">https://api.highcharts.com/highstock/yAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.lineColor">https://api.highcharts.com/highmaps/yAxis.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.lineColor">https://api.highcharts.com/highcharts/yAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.lineColor">https://api.highcharts.com/highstock/yAxis.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.lineColor">https://api.highcharts.com/highmaps/yAxis.lineColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.lineWidth">https://api.highcharts.com/highcharts/yAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.lineWidth">https://api.highcharts.com/highstock/yAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.lineWidth">https://api.highcharts.com/highmaps/yAxis.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.lineWidth">https://api.highcharts.com/highcharts/yAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.lineWidth">https://api.highcharts.com/highstock/yAxis.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.lineWidth">https://api.highcharts.com/highmaps/yAxis.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.linkedTo">https://api.highcharts.com/highcharts/yAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.linkedTo">https://api.highcharts.com/highstock/yAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.linkedTo">https://api.highcharts.com/gantt/yAxis.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.linkedTo">https://api.highcharts.com/highcharts/yAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.linkedTo">https://api.highcharts.com/highstock/yAxis.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.linkedTo">https://api.highcharts.com/gantt/yAxis.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.max">https://api.highcharts.com/highcharts/yAxis.max</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.max">https://api.highcharts.com/highstock/yAxis.max</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.max">https://api.highcharts.com/highmaps/yAxis.max</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.max">https://api.highcharts.com/highcharts/yAxis.max</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.max">https://api.highcharts.com/highstock/yAxis.max</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.max">https://api.highcharts.com/highmaps/yAxis.max</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.maxColor">https://api.highcharts.com/highcharts/yAxis.maxColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.maxColor">https://api.highcharts.com/highcharts/yAxis.maxColor</a>
   *
   * @implspec maxColor?: ColorString;
   *
   */
  @JSProperty("maxColor")
  void setMaxColor(String value);

  /**
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxLength">https://api.highcharts.com/highstock/yAxis.maxLength</a>
   *
   * @implspec maxLength?: (number|string);
   *
   */
  @JSProperty("maxLength")
  @Nullable
  Unknown getMaxLength();

  /**
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxLength">https://api.highcharts.com/highstock/yAxis.maxLength</a>
   *
   * @implspec maxLength?: (number|string);
   *
   */
  @JSProperty("maxLength")
  void setMaxLength(double value);

  /**
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxLength">https://api.highcharts.com/highstock/yAxis.maxLength</a>
   *
   * @implspec maxLength?: (number|string);
   *
   */
  @JSProperty("maxLength")
  void setMaxLength(String value);

  /**
   * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
   * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
   * This is useful when you don't want the highest data value to appear on
   * the edge of the plot area. When the axis' <code>max</code> option is set or a max
   * extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be
   * ignored.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.maxPadding">https://api.highcharts.com/highcharts/yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxPadding">https://api.highcharts.com/highstock/yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.maxPadding">https://api.highcharts.com/gantt/yAxis.maxPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.maxPadding">https://api.highcharts.com/highcharts/yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxPadding">https://api.highcharts.com/highstock/yAxis.maxPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.maxPadding">https://api.highcharts.com/gantt/yAxis.maxPadding</a>
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
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxRange">https://api.highcharts.com/highstock/yAxis.maxRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxRange">https://api.highcharts.com/highstock/yAxis.maxRange</a>
   *
   * @implspec maxRange?: number;
   *
   */
  @JSProperty("maxRange")
  void setMaxRange(double value);

  /**
   * (Highcharts, Highstock) Deprecated. Use <code>minRange</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.maxZoom">https://api.highcharts.com/highcharts/yAxis.maxZoom</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxZoom">https://api.highcharts.com/highstock/yAxis.maxZoom</a>
   *
   * @implspec maxZoom?: number;
   *
   */
  @JSProperty("maxZoom")
  double getMaxZoom();

  /**
   * (Highcharts, Highstock) Deprecated. Use <code>minRange</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.maxZoom">https://api.highcharts.com/highcharts/yAxis.maxZoom</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.maxZoom">https://api.highcharts.com/highstock/yAxis.maxZoom</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.min">https://api.highcharts.com/highcharts/yAxis.min</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.min">https://api.highcharts.com/highstock/yAxis.min</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.min">https://api.highcharts.com/highmaps/yAxis.min</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.min">https://api.highcharts.com/highcharts/yAxis.min</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.min">https://api.highcharts.com/highstock/yAxis.min</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.min">https://api.highcharts.com/highmaps/yAxis.min</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minColor">https://api.highcharts.com/highcharts/yAxis.minColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minColor">https://api.highcharts.com/highcharts/yAxis.minColor</a>
   *
   * @implspec minColor?: ColorString;
   *
   */
  @JSProperty("minColor")
  void setMinColor(String value);

  /**
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minLength">https://api.highcharts.com/highstock/yAxis.minLength</a>
   *
   * @implspec minLength?: (number|string);
   *
   */
  @JSProperty("minLength")
  @Nullable
  Unknown getMinLength();

  /**
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minLength">https://api.highcharts.com/highstock/yAxis.minLength</a>
   *
   * @implspec minLength?: (number|string);
   *
   */
  @JSProperty("minLength")
  void setMinLength(double value);

  /**
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minLength">https://api.highcharts.com/highstock/yAxis.minLength</a>
   *
   * @implspec minLength?: (number|string);
   *
   */
  @JSProperty("minLength")
  void setMinLength(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
   * lines.
   *
   * In styled mode, the stroke width is given in the
   * <code>.highcharts-minor-grid-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorGridLineColor">https://api.highcharts.com/highcharts/yAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorGridLineColor">https://api.highcharts.com/highstock/yAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorGridLineColor">https://api.highcharts.com/highmaps/yAxis.minorGridLineColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorGridLineColor">https://api.highcharts.com/highcharts/yAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorGridLineColor">https://api.highcharts.com/highstock/yAxis.minorGridLineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorGridLineColor">https://api.highcharts.com/highmaps/yAxis.minorGridLineColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorGridLineDashStyle">https://api.highcharts.com/highcharts/yAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/yAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorGridLineDashStyle">https://api.highcharts.com/highmaps/yAxis.minorGridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorGridLineDashStyle">https://api.highcharts.com/highcharts/yAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorGridLineDashStyle">https://api.highcharts.com/highstock/yAxis.minorGridLineDashStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorGridLineDashStyle">https://api.highcharts.com/highmaps/yAxis.minorGridLineDashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorGridLineWidth">https://api.highcharts.com/highcharts/yAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorGridLineWidth">https://api.highcharts.com/highstock/yAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorGridLineWidth">https://api.highcharts.com/highmaps/yAxis.minorGridLineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorGridLineWidth">https://api.highcharts.com/highcharts/yAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorGridLineWidth">https://api.highcharts.com/highstock/yAxis.minorGridLineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorGridLineWidth">https://api.highcharts.com/highmaps/yAxis.minorGridLineWidth</a>
   *
   * @implspec minorGridLineWidth?: number;
   *
   */
  @JSProperty("minorGridLineWidth")
  void setMinorGridLineWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickColor">https://api.highcharts.com/highcharts/yAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickColor">https://api.highcharts.com/highstock/yAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickColor">https://api.highcharts.com/highmaps/yAxis.minorTickColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickColor">https://api.highcharts.com/highcharts/yAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickColor">https://api.highcharts.com/highstock/yAxis.minorTickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickColor">https://api.highcharts.com/highmaps/yAxis.minorTickColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickInterval">https://api.highcharts.com/highcharts/yAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickInterval">https://api.highcharts.com/highstock/yAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickInterval">https://api.highcharts.com/highmaps/yAxis.minorTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickInterval">https://api.highcharts.com/highcharts/yAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickInterval">https://api.highcharts.com/highstock/yAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickInterval">https://api.highcharts.com/highmaps/yAxis.minorTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickInterval">https://api.highcharts.com/highcharts/yAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickInterval">https://api.highcharts.com/highstock/yAxis.minorTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickInterval">https://api.highcharts.com/highmaps/yAxis.minorTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickLength">https://api.highcharts.com/highcharts/yAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickLength">https://api.highcharts.com/highstock/yAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickLength">https://api.highcharts.com/highmaps/yAxis.minorTickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickLength">https://api.highcharts.com/highcharts/yAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickLength">https://api.highcharts.com/highstock/yAxis.minorTickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickLength">https://api.highcharts.com/highmaps/yAxis.minorTickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickPosition">https://api.highcharts.com/highcharts/yAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickPosition">https://api.highcharts.com/highstock/yAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickPosition">https://api.highcharts.com/highmaps/yAxis.minorTickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickPosition">https://api.highcharts.com/highcharts/yAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickPosition">https://api.highcharts.com/highstock/yAxis.minorTickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickPosition">https://api.highcharts.com/highmaps/yAxis.minorTickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTicks">https://api.highcharts.com/highcharts/yAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTicks">https://api.highcharts.com/highstock/yAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTicks">https://api.highcharts.com/highmaps/yAxis.minorTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTicks">https://api.highcharts.com/highcharts/yAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTicks">https://api.highcharts.com/highstock/yAxis.minorTicks</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTicks">https://api.highcharts.com/highmaps/yAxis.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickWidth">https://api.highcharts.com/highcharts/yAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickWidth">https://api.highcharts.com/highstock/yAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickWidth">https://api.highcharts.com/highmaps/yAxis.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minorTickWidth">https://api.highcharts.com/highcharts/yAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minorTickWidth">https://api.highcharts.com/highstock/yAxis.minorTickWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minorTickWidth">https://api.highcharts.com/highmaps/yAxis.minorTickWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minPadding">https://api.highcharts.com/highcharts/yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minPadding">https://api.highcharts.com/highstock/yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.minPadding">https://api.highcharts.com/gantt/yAxis.minPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minPadding">https://api.highcharts.com/highcharts/yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minPadding">https://api.highcharts.com/highstock/yAxis.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.minPadding">https://api.highcharts.com/gantt/yAxis.minPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minRange">https://api.highcharts.com/highcharts/yAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minRange">https://api.highcharts.com/highstock/yAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minRange">https://api.highcharts.com/highmaps/yAxis.minRange</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minRange">https://api.highcharts.com/highcharts/yAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minRange">https://api.highcharts.com/highstock/yAxis.minRange</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minRange">https://api.highcharts.com/highmaps/yAxis.minRange</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minTickInterval">https://api.highcharts.com/highcharts/yAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minTickInterval">https://api.highcharts.com/highstock/yAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minTickInterval">https://api.highcharts.com/highmaps/yAxis.minTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.minTickInterval">https://api.highcharts.com/highcharts/yAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.minTickInterval">https://api.highcharts.com/highstock/yAxis.minTickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.minTickInterval">https://api.highcharts.com/highmaps/yAxis.minTickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.offset">https://api.highcharts.com/highcharts/yAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.offset">https://api.highcharts.com/highstock/yAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.offset">https://api.highcharts.com/highmaps/yAxis.offset</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.offset">https://api.highcharts.com/highcharts/yAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.offset">https://api.highcharts.com/highstock/yAxis.offset</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.offset">https://api.highcharts.com/highmaps/yAxis.offset</a>
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
   * @see <a href="https://api.highcharts.com/highstock/yAxis.opposite">https://api.highcharts.com/highstock/yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.opposite">https://api.highcharts.com/highcharts/yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.opposite">https://api.highcharts.com/gantt/yAxis.opposite</a>
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
   * @see <a href="https://api.highcharts.com/highstock/yAxis.opposite">https://api.highcharts.com/highstock/yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.opposite">https://api.highcharts.com/highcharts/yAxis.opposite</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.opposite">https://api.highcharts.com/gantt/yAxis.opposite</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.pane">https://api.highcharts.com/highcharts/yAxis.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.pane">https://api.highcharts.com/highcharts/yAxis.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotBands">https://api.highcharts.com/highcharts/yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotBands">https://api.highcharts.com/highstock/yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotBands">https://api.highcharts.com/gantt/yAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<YAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  @Nullable
  Array<YAxisPlotBandsOptions> getPlotBands();

  /**
   * (Highcharts, Highstock, Gantt) An array of objects defining plot bands on
   * the Y axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotBands">https://api.highcharts.com/highcharts/yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotBands">https://api.highcharts.com/highstock/yAxis.plotBands</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotBands">https://api.highcharts.com/gantt/yAxis.plotBands</a>
   *
   * @implspec plotBands?: Array<YAxisPlotBandsOptions>;
   *
   */
  @JSProperty("plotBands")
  void setPlotBands(Array<YAxisPlotBandsOptions> value);

  /**
   * (Highcharts, Highstock, Gantt) An array of objects representing plot
   * lines on the X axis
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines">https://api.highcharts.com/highcharts/yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines">https://api.highcharts.com/highstock/yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines">https://api.highcharts.com/gantt/yAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<YAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  @Nullable
  Array<YAxisPlotLinesOptions> getPlotLines();

  /**
   * (Highcharts, Highstock, Gantt) An array of objects representing plot
   * lines on the X axis
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines">https://api.highcharts.com/highcharts/yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines">https://api.highcharts.com/highstock/yAxis.plotLines</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines">https://api.highcharts.com/gantt/yAxis.plotLines</a>
   *
   * @implspec plotLines?: Array<YAxisPlotLinesOptions>;
   *
   */
  @JSProperty("plotLines")
  void setPlotLines(Array<YAxisPlotLinesOptions> value);

  /**
   * (Highstock) The zoomed range to display when only defining one or none of
   * <code>min</code> or <code>max</code>. For example, to show the latest month, a range of one
   * month can be set.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.range">https://api.highcharts.com/highstock/yAxis.range</a>
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
   * @see <a href="https://api.highcharts.com/highstock/yAxis.range">https://api.highcharts.com/highstock/yAxis.range</a>
   *
   * @implspec range?: number;
   *
   */
  @JSProperty("range")
  void setRange(double value);

  /**
   * (Highstock) Options for axis resizing. This feature requires the
   * <code>drag-panes.js</code> - classic or styled mode - module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize">https://api.highcharts.com/highstock/yAxis.resize</a>
   *
   * @implspec resize?: YAxisResizeOptions;
   *
   */
  @JSProperty("resize")
  @Nullable
  YAxisResizeOptions getResize();

  /**
   * (Highstock) Options for axis resizing. This feature requires the
   * <code>drag-panes.js</code> - classic or styled mode - module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize">https://api.highcharts.com/highstock/yAxis.resize</a>
   *
   * @implspec resize?: YAxisResizeOptions;
   *
   */
  @JSProperty("resize")
  void setResize(YAxisResizeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
   * highest number is closest to the origin.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.reversed">https://api.highcharts.com/highcharts/yAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.reversed">https://api.highcharts.com/highstock/yAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.reversed">https://api.highcharts.com/highmaps/yAxis.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
   * highest number is closest to the origin.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.reversed">https://api.highcharts.com/highcharts/yAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.reversed">https://api.highcharts.com/highstock/yAxis.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.reversed">https://api.highcharts.com/highmaps/yAxis.reversed</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.reversedStacks">https://api.highcharts.com/highcharts/yAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.reversedStacks">https://api.highcharts.com/highstock/yAxis.reversedStacks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.reversedStacks">https://api.highcharts.com/highcharts/yAxis.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.reversedStacks">https://api.highcharts.com/highstock/yAxis.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
   *
   */
  @JSProperty("reversedStacks")
  void setReversedStacks(boolean value);

  /**
   * (Highstock) An optional scrollbar to display on the Y axis in response to
   * limiting the minimum an maximum of the axis values.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.scrollbar">https://api.highcharts.com/highstock/yAxis.scrollbar</a>
   *
   * @implspec scrollbar?: YAxisScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  @Nullable
  YAxisScrollbarOptions getScrollbar();

  /**
   * (Highstock) An optional scrollbar to display on the Y axis in response to
   * limiting the minimum an maximum of the axis values.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.scrollbar">https://api.highcharts.com/highstock/yAxis.scrollbar</a>
   *
   * @implspec scrollbar?: YAxisScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  void setScrollbar(YAxisScrollbarOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the axis line and title
   * when the axis has no data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.showEmpty">https://api.highcharts.com/highcharts/yAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.showEmpty">https://api.highcharts.com/highstock/yAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.showEmpty">https://api.highcharts.com/highmaps/yAxis.showEmpty</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.showEmpty">https://api.highcharts.com/highcharts/yAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.showEmpty">https://api.highcharts.com/highstock/yAxis.showEmpty</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.showEmpty">https://api.highcharts.com/highmaps/yAxis.showEmpty</a>
   *
   * @implspec showEmpty?: boolean;
   *
   */
  @JSProperty("showEmpty")
  void setShowEmpty(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.showFirstLabel">https://api.highcharts.com/highcharts/yAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.showFirstLabel">https://api.highcharts.com/highstock/yAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.showFirstLabel">https://api.highcharts.com/highmaps/yAxis.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.showFirstLabel">https://api.highcharts.com/highcharts/yAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.showFirstLabel">https://api.highcharts.com/highstock/yAxis.showFirstLabel</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.showFirstLabel">https://api.highcharts.com/highmaps/yAxis.showFirstLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.showLastLabel">https://api.highcharts.com/highcharts/yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.showLastLabel">https://api.highcharts.com/highstock/yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.showLastLabel">https://api.highcharts.com/gantt/yAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.showLastLabel">https://api.highcharts.com/highcharts/yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.showLastLabel">https://api.highcharts.com/highstock/yAxis.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.showLastLabel">https://api.highcharts.com/gantt/yAxis.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.softMax">https://api.highcharts.com/highcharts/yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.softMax">https://api.highcharts.com/highstock/yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.softMax">https://api.highcharts.com/gantt/yAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.softMax">https://api.highcharts.com/highcharts/yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.softMax">https://api.highcharts.com/highstock/yAxis.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.softMax">https://api.highcharts.com/gantt/yAxis.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.softMin">https://api.highcharts.com/highcharts/yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.softMin">https://api.highcharts.com/highstock/yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.softMin">https://api.highcharts.com/gantt/yAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.softMin">https://api.highcharts.com/highcharts/yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.softMin">https://api.highcharts.com/highstock/yAxis.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.softMin">https://api.highcharts.com/gantt/yAxis.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.stackLabels">https://api.highcharts.com/highcharts/yAxis.stackLabels</a>
   *
   * @implspec stackLabels?: YAxisStackLabelsOptions;
   *
   */
  @JSProperty("stackLabels")
  @Nullable
  YAxisStackLabelsOptions getStackLabels();

  /**
   * (Highcharts) The stack labels show the total value for each bar in a
   * stacked column or bar chart. The label will be placed on top of positive
   * columns and below negative columns. In case of an inverted column chart
   * or a bar chart the label is placed to the right of positive bars and to
   * the left of negative bars.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.stackLabels">https://api.highcharts.com/highcharts/yAxis.stackLabels</a>
   *
   * @implspec stackLabels?: YAxisStackLabelsOptions;
   *
   */
  @JSProperty("stackLabels")
  void setStackLabels(YAxisStackLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
   * put the tick between weeks. 0 = Sunday, 1 = Monday.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.startOfWeek">https://api.highcharts.com/highcharts/yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.startOfWeek">https://api.highcharts.com/highstock/yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.startOfWeek">https://api.highcharts.com/gantt/yAxis.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.startOfWeek">https://api.highcharts.com/highcharts/yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.startOfWeek">https://api.highcharts.com/highstock/yAxis.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.startOfWeek">https://api.highcharts.com/gantt/yAxis.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.startOnTick">https://api.highcharts.com/highcharts/yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.startOnTick">https://api.highcharts.com/highstock/yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.startOnTick">https://api.highcharts.com/gantt/yAxis.startOnTick</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.startOnTick">https://api.highcharts.com/highcharts/yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.startOnTick">https://api.highcharts.com/highstock/yAxis.startOnTick</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.startOnTick">https://api.highcharts.com/gantt/yAxis.startOnTick</a>
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
   * @see <a href="https://api.highcharts.com/gantt/yAxis.staticScale">https://api.highcharts.com/gantt/yAxis.staticScale</a>
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
   * @see <a href="https://api.highcharts.com/gantt/yAxis.staticScale">https://api.highcharts.com/gantt/yAxis.staticScale</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.stops">https://api.highcharts.com/highcharts/yAxis.stops</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.stops">https://api.highcharts.com/highcharts/yAxis.stops</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickAmount">https://api.highcharts.com/highcharts/yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickAmount">https://api.highcharts.com/highstock/yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.tickAmount">https://api.highcharts.com/gantt/yAxis.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickAmount">https://api.highcharts.com/highcharts/yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickAmount">https://api.highcharts.com/highstock/yAxis.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.tickAmount">https://api.highcharts.com/gantt/yAxis.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickColor">https://api.highcharts.com/highcharts/yAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickColor">https://api.highcharts.com/highstock/yAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickColor">https://api.highcharts.com/highmaps/yAxis.tickColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickColor">https://api.highcharts.com/highcharts/yAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickColor">https://api.highcharts.com/highstock/yAxis.tickColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickColor">https://api.highcharts.com/highmaps/yAxis.tickColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickInterval">https://api.highcharts.com/highcharts/yAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickInterval">https://api.highcharts.com/highstock/yAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickInterval">https://api.highcharts.com/highmaps/yAxis.tickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickInterval">https://api.highcharts.com/highcharts/yAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickInterval">https://api.highcharts.com/highstock/yAxis.tickInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickInterval">https://api.highcharts.com/highmaps/yAxis.tickInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickLength">https://api.highcharts.com/highcharts/yAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickLength">https://api.highcharts.com/highstock/yAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickLength">https://api.highcharts.com/highmaps/yAxis.tickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickLength">https://api.highcharts.com/highcharts/yAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickLength">https://api.highcharts.com/highstock/yAxis.tickLength</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickLength">https://api.highcharts.com/highmaps/yAxis.tickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/yAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.tickmarkPlacement">https://api.highcharts.com/gantt/yAxis.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickmarkPlacement">https://api.highcharts.com/highcharts/yAxis.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.tickmarkPlacement">https://api.highcharts.com/gantt/yAxis.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPixelInterval">https://api.highcharts.com/highcharts/yAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPixelInterval">https://api.highcharts.com/highstock/yAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPixelInterval">https://api.highcharts.com/highmaps/yAxis.tickPixelInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPixelInterval">https://api.highcharts.com/highcharts/yAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPixelInterval">https://api.highcharts.com/highstock/yAxis.tickPixelInterval</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPixelInterval">https://api.highcharts.com/highmaps/yAxis.tickPixelInterval</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPosition">https://api.highcharts.com/highcharts/yAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPosition">https://api.highcharts.com/highstock/yAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPosition">https://api.highcharts.com/highmaps/yAxis.tickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPosition">https://api.highcharts.com/highcharts/yAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPosition">https://api.highcharts.com/highstock/yAxis.tickPosition</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPosition">https://api.highcharts.com/highmaps/yAxis.tickPosition</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPositioner">https://api.highcharts.com/highcharts/yAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPositioner">https://api.highcharts.com/highstock/yAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPositioner">https://api.highcharts.com/highmaps/yAxis.tickPositioner</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPositioner">https://api.highcharts.com/highcharts/yAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPositioner">https://api.highcharts.com/highstock/yAxis.tickPositioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPositioner">https://api.highcharts.com/highmaps/yAxis.tickPositioner</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPositions">https://api.highcharts.com/highcharts/yAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPositions">https://api.highcharts.com/highstock/yAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPositions">https://api.highcharts.com/highmaps/yAxis.tickPositions</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickPositions">https://api.highcharts.com/highcharts/yAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickPositions">https://api.highcharts.com/highstock/yAxis.tickPositions</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.tickPositions">https://api.highcharts.com/highmaps/yAxis.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickWidth">https://api.highcharts.com/highcharts/yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickWidth">https://api.highcharts.com/highstock/yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.tickWidth">https://api.highcharts.com/gantt/yAxis.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tickWidth">https://api.highcharts.com/highcharts/yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.tickWidth">https://api.highcharts.com/highstock/yAxis.tickWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.tickWidth">https://api.highcharts.com/gantt/yAxis.tickWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.title">https://api.highcharts.com/highcharts/yAxis.title</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.title">https://api.highcharts.com/highstock/yAxis.title</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.title">https://api.highcharts.com/highmaps/yAxis.title</a>
   *
   * @implspec title?: YAxisTitleOptions;
   *
   */
  @JSProperty("title")
  @Nullable
  YAxisTitleOptions getTitle();

  /**
   * (Highcharts, Highstock, Highmaps) The axis title, showing next to the
   * axis line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.title">https://api.highcharts.com/highcharts/yAxis.title</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.title">https://api.highcharts.com/highstock/yAxis.title</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis.title">https://api.highcharts.com/highmaps/yAxis.title</a>
   *
   * @implspec title?: YAxisTitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(YAxisTitleOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tooltipValueFormat">https://api.highcharts.com/highcharts/yAxis.tooltipValueFormat</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.tooltipValueFormat">https://api.highcharts.com/highcharts/yAxis.tooltipValueFormat</a>
   *
   * @implspec tooltipValueFormat?: string;
   *
   */
  @JSProperty("tooltipValueFormat")
  void setTooltipValueFormat(String value);

  /**
   * (Highstock) The top position of the Y axis. If it's a number, it is
   * interpreted as pixel position relative to the chart.
   *
   * Since Highstock 2: If it's a percentage string, it is interpreted as
   * percentages of the plot height, offset from plot area top.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.top">https://api.highcharts.com/highstock/yAxis.top</a>
   *
   * @implspec top?: (number|string);
   *
   */
  @JSProperty("top")
  @Nullable
  Unknown getTop();

  /**
   * (Highstock) The top position of the Y axis. If it's a number, it is
   * interpreted as pixel position relative to the chart.
   *
   * Since Highstock 2: If it's a percentage string, it is interpreted as
   * percentages of the plot height, offset from plot area top.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.top">https://api.highcharts.com/highstock/yAxis.top</a>
   *
   * @implspec top?: (number|string);
   *
   */
  @JSProperty("top")
  void setTop(double value);

  /**
   * (Highstock) The top position of the Y axis. If it's a number, it is
   * interpreted as pixel position relative to the chart.
   *
   * Since Highstock 2: If it's a percentage string, it is interpreted as
   * percentages of the plot height, offset from plot area top.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.top">https://api.highcharts.com/highstock/yAxis.top</a>
   *
   * @implspec top?: (number|string);
   *
   */
  @JSProperty("top")
  void setTop(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.type">https://api.highcharts.com/highcharts/yAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.type">https://api.highcharts.com/gantt/yAxis.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.type">https://api.highcharts.com/highcharts/yAxis.type</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.type">https://api.highcharts.com/gantt/yAxis.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.uniqueNames">https://api.highcharts.com/highcharts/yAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.uniqueNames">https://api.highcharts.com/gantt/yAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.uniqueNames">https://api.highcharts.com/highcharts/yAxis.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.uniqueNames">https://api.highcharts.com/gantt/yAxis.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.units">https://api.highcharts.com/highcharts/yAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.units">https://api.highcharts.com/highstock/yAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.units">https://api.highcharts.com/gantt/yAxis.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.units">https://api.highcharts.com/highcharts/yAxis.units</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.units">https://api.highcharts.com/highstock/yAxis.units</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.units">https://api.highcharts.com/gantt/yAxis.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.visible">https://api.highcharts.com/highcharts/yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.visible">https://api.highcharts.com/highstock/yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.visible">https://api.highcharts.com/gantt/yAxis.visible</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.visible">https://api.highcharts.com/highcharts/yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.visible">https://api.highcharts.com/highstock/yAxis.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.visible">https://api.highcharts.com/gantt/yAxis.visible</a>
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
