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
 * (Highcharts) Common options for all yAxes rendered in a parallel coordinates
 * plot. This feature requires <code>modules/parallel-coordinates.js</code>.
 *
 * The default options are: (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes">https://api.highcharts.com/highcharts/chart.parallelAxes</a>
 *
 */
public interface ChartParallelAxesOptions extends Any {
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.alignTicks">https://api.highcharts.com/highcharts/chart.parallelAxes.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.alignTicks">https://api.highcharts.com/highstock/chart.parallelAxes.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.alignTicks">https://api.highcharts.com/gantt/chart.parallelAxes.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.alignTicks">https://api.highcharts.com/highcharts/chart.parallelAxes.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.alignTicks">https://api.highcharts.com/highstock/chart.parallelAxes.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.alignTicks">https://api.highcharts.com/gantt/chart.parallelAxes.alignTicks</a>
   *
   * @implspec alignTicks?: boolean;
   *
   */
  @JSProperty("alignTicks")
  void setAlignTicks(boolean value);

  /**
   * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
   * integers, like persons or hits on a web page, decimals should be avoided
   * in the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.allowDecimals">https://api.highcharts.com/highcharts/chart.parallelAxes.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  boolean getAllowDecimals();

  /**
   * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
   * integers, like persons or hits on a web page, decimals should be avoided
   * in the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.allowDecimals">https://api.highcharts.com/highcharts/chart.parallelAxes.allowDecimals</a>
   *
   * @implspec allowDecimals?: boolean;
   *
   */
  @JSProperty("allowDecimals")
  void setAllowDecimals(boolean value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.categories">https://api.highcharts.com/highcharts/chart.parallelAxes.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.categories">https://api.highcharts.com/gantt/chart.parallelAxes.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.categories">https://api.highcharts.com/highcharts/chart.parallelAxes.categories</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.categories">https://api.highcharts.com/gantt/chart.parallelAxes.categories</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.ceiling">https://api.highcharts.com/highcharts/chart.parallelAxes.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.ceiling">https://api.highcharts.com/highstock/chart.parallelAxes.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.ceiling">https://api.highcharts.com/gantt/chart.parallelAxes.ceiling</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.ceiling">https://api.highcharts.com/highcharts/chart.parallelAxes.ceiling</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.ceiling">https://api.highcharts.com/highstock/chart.parallelAxes.ceiling</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.ceiling">https://api.highcharts.com/gantt/chart.parallelAxes.ceiling</a>
   *
   * @implspec ceiling?: number;
   *
   */
  @JSProperty("ceiling")
  void setCeiling(double value);

  /**
   * (Highcharts) A class name that opens for styling the axis by CSS,
   * especially in Highcharts styled mode. The class name is applied to group
   * elements for the grid, axis elements and labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.className">https://api.highcharts.com/highcharts/chart.parallelAxes.className</a>
   *
   * @implspec className?: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.className">https://api.highcharts.com/highcharts/chart.parallelAxes.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair</a>
   *
   * @implspec crosshair?: (boolean|ChartParallelAxesCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  @Nullable
  Unknown getCrosshair();

  /**
   * (Highcharts) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair</a>
   *
   * @implspec crosshair?: (boolean|ChartParallelAxesCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(ChartParallelAxesCrosshairOptions value);

  /**
   * (Highcharts) Configure a crosshair that follows either the mouse pointer
   * or the hovered point.
   *
   * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
   * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair</a>
   *
   * @implspec crosshair?: (boolean|ChartParallelAxesCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/highcharts/chart.parallelAxes.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/highstock/chart.parallelAxes.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/gantt/chart.parallelAxes.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: ChartParallelAxesDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  ChartParallelAxesDateTimeLabelFormatsOptions getDateTimeLabelFormats();

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/highcharts/chart.parallelAxes.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/highstock/chart.parallelAxes.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.dateTimeLabelFormats">https://api.highcharts.com/gantt/chart.parallelAxes.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: ChartParallelAxesDateTimeLabelFormatsOptions;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(ChartParallelAxesDateTimeLabelFormatsOptions value);

  /**
   * (Highcharts) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.description">https://api.highcharts.com/highcharts/chart.parallelAxes.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) <em>Requires Accessibility module</em>
   *
   * Description of the axis to screen reader users.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.description">https://api.highcharts.com/highcharts/chart.parallelAxes.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.endOnTick">https://api.highcharts.com/highcharts/chart.parallelAxes.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  boolean getEndOnTick();

  /**
   * (Highcharts) Whether to force the axis to end on a tick. Use this option
   * with the <code>maxPadding</code> option to control the axis end.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.endOnTick">https://api.highcharts.com/highcharts/chart.parallelAxes.endOnTick</a>
   *
   * @implspec endOnTick?: boolean;
   *
   */
  @JSProperty("endOnTick")
  void setEndOnTick(boolean value);

  /**
   * (Highcharts) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.events">https://api.highcharts.com/highcharts/chart.parallelAxes.events</a>
   *
   * @implspec events?: ChartParallelAxesEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  ChartParallelAxesEventsOptions getEvents();

  /**
   * (Highcharts) Event handlers for the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.events">https://api.highcharts.com/highcharts/chart.parallelAxes.events</a>
   *
   * @implspec events?: ChartParallelAxesEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(ChartParallelAxesEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
   * computed axis extremes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.floor">https://api.highcharts.com/highcharts/chart.parallelAxes.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.floor">https://api.highcharts.com/highstock/chart.parallelAxes.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.floor">https://api.highcharts.com/gantt/chart.parallelAxes.floor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.floor">https://api.highcharts.com/highcharts/chart.parallelAxes.floor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.floor">https://api.highcharts.com/highstock/chart.parallelAxes.floor</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.floor">https://api.highcharts.com/gantt/chart.parallelAxes.floor</a>
   *
   * @implspec floor?: number;
   *
   */
  @JSProperty("floor")
  void setFloor(double value);

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.grid">https://api.highcharts.com/gantt/chart.parallelAxes.grid</a>
   *
   * @implspec grid?: ChartParallelAxesGridOptions;
   *
   */
  @JSProperty("grid")
  @Nullable
  ChartParallelAxesGridOptions getGrid();

  /**
   * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.grid">https://api.highcharts.com/gantt/chart.parallelAxes.grid</a>
   *
   * @implspec grid?: ChartParallelAxesGridOptions;
   *
   */
  @JSProperty("grid")
  void setGrid(ChartParallelAxesGridOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.gridZIndex">https://api.highcharts.com/highcharts/chart.parallelAxes.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.gridZIndex">https://api.highcharts.com/highstock/chart.parallelAxes.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.gridZIndex">https://api.highcharts.com/gantt/chart.parallelAxes.gridZIndex</a>
   *
   * @implspec gridZIndex?: number;
   *
   */
  @JSProperty("gridZIndex")
  double getGridZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.gridZIndex">https://api.highcharts.com/highcharts/chart.parallelAxes.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.gridZIndex">https://api.highcharts.com/highstock/chart.parallelAxes.gridZIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.gridZIndex">https://api.highcharts.com/gantt/chart.parallelAxes.gridZIndex</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.height">https://api.highcharts.com/highstock/chart.parallelAxes.height</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.height">https://api.highcharts.com/highstock/chart.parallelAxes.height</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.height">https://api.highcharts.com/highstock/chart.parallelAxes.height</a>
   *
   * @implspec height?: (number|string);
   *
   */
  @JSProperty("height")
  void setHeight(String value);

  /**
   * (Highcharts) The axis labels show the number or category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels">https://api.highcharts.com/highcharts/chart.parallelAxes.labels</a>
   *
   * @implspec labels?: ChartParallelAxesLabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  ChartParallelAxesLabelsOptions getLabels();

  /**
   * (Highcharts) The axis labels show the number or category for each tick.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels">https://api.highcharts.com/highcharts/chart.parallelAxes.labels</a>
   *
   * @implspec labels?: ChartParallelAxesLabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(ChartParallelAxesLabelsOptions value);

  /**
   * (Highcharts) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.lineColor">https://api.highcharts.com/highcharts/chart.parallelAxes.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts) The color of the line marking the axis itself.
   *
   * In styled mode, the line stroke is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.lineColor">https://api.highcharts.com/highcharts/chart.parallelAxes.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts) The width of the line marking the axis itself.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-line</code>
   * or <code>.highcharts-xaxis-line</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.lineWidth">https://api.highcharts.com/highcharts/chart.parallelAxes.lineWidth</a>
   *
   * @implspec lineWidth?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.lineWidth">https://api.highcharts.com/highcharts/chart.parallelAxes.lineWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.linkedTo">https://api.highcharts.com/highcharts/chart.parallelAxes.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.linkedTo">https://api.highcharts.com/highstock/chart.parallelAxes.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.linkedTo">https://api.highcharts.com/gantt/chart.parallelAxes.linkedTo</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.linkedTo">https://api.highcharts.com/highcharts/chart.parallelAxes.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.linkedTo">https://api.highcharts.com/highstock/chart.parallelAxes.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.linkedTo">https://api.highcharts.com/gantt/chart.parallelAxes.linkedTo</a>
   *
   * @implspec linkedTo?: number;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(double value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.max">https://api.highcharts.com/highcharts/chart.parallelAxes.max</a>
   *
   * @implspec max?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.max">https://api.highcharts.com/highcharts/chart.parallelAxes.max</a>
   *
   * @implspec max?: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * (Highstock) Maximal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxLength">https://api.highcharts.com/highstock/chart.parallelAxes.maxLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxLength">https://api.highcharts.com/highstock/chart.parallelAxes.maxLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxLength">https://api.highcharts.com/highstock/chart.parallelAxes.maxLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.maxPadding">https://api.highcharts.com/highcharts/chart.parallelAxes.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxPadding">https://api.highcharts.com/highstock/chart.parallelAxes.maxPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.maxPadding">https://api.highcharts.com/gantt/chart.parallelAxes.maxPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.maxPadding">https://api.highcharts.com/highcharts/chart.parallelAxes.maxPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxPadding">https://api.highcharts.com/highstock/chart.parallelAxes.maxPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.maxPadding">https://api.highcharts.com/gantt/chart.parallelAxes.maxPadding</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxRange">https://api.highcharts.com/highstock/chart.parallelAxes.maxRange</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.maxRange">https://api.highcharts.com/highstock/chart.parallelAxes.maxRange</a>
   *
   * @implspec maxRange?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.min">https://api.highcharts.com/highcharts/chart.parallelAxes.min</a>
   *
   * @implspec min?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.min">https://api.highcharts.com/highcharts/chart.parallelAxes.min</a>
   *
   * @implspec min?: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * (Highstock) Minimal size of a resizable axis. Could be set as a percent
   * of plot area or pixel size.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.minLength">https://api.highcharts.com/highstock/chart.parallelAxes.minLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.minLength">https://api.highcharts.com/highstock/chart.parallelAxes.minLength</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.minLength">https://api.highcharts.com/highstock/chart.parallelAxes.minLength</a>
   *
   * @implspec minLength?: (number|string);
   *
   */
  @JSProperty("minLength")
  void setMinLength(String value);

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickColor">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  @Nullable
  String getMinorTickColor();

  /**
   * (Highcharts) Color for the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickColor">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickColor</a>
   *
   * @implspec minorTickColor?: ColorString;
   *
   */
  @JSProperty("minorTickColor")
  void setMinorTickColor(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  @Nullable
  Unknown getMinorTickInterval();

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickInterval</a>
   *
   * @implspec minorTickInterval?: (number|string|null);
   *
   */
  @JSProperty("minorTickInterval")
  void setMinorTickInterval(String value);

  /**
   * (Highcharts) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickLength">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  double getMinorTickLength();

  /**
   * (Highcharts) The pixel length of the minor tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickLength">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickLength</a>
   *
   * @implspec minorTickLength?: number;
   *
   */
  @JSProperty("minorTickLength")
  void setMinorTickLength(double value);

  /**
   * (Highcharts) The position of the minor tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickPosition">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  @Nullable
  MinorTickPosition getMinorTickPosition();

  /**
   * (Highcharts) The position of the minor tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickPosition">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickPosition</a>
   *
   * @implspec minorTickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("minorTickPosition")
  void setMinorTickPosition(MinorTickPosition value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTicks">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTicks">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTicks</a>
   *
   * @implspec minorTicks?: boolean;
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(boolean value);

  /**
   * (Highcharts) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickWidth">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickWidth</a>
   *
   * @implspec minorTickWidth?: number;
   *
   */
  @JSProperty("minorTickWidth")
  double getMinorTickWidth();

  /**
   * (Highcharts) The pixel width of the minor tick mark.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickWidth">https://api.highcharts.com/highcharts/chart.parallelAxes.minorTickWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minPadding">https://api.highcharts.com/highcharts/chart.parallelAxes.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.minPadding">https://api.highcharts.com/highstock/chart.parallelAxes.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.minPadding">https://api.highcharts.com/gantt/chart.parallelAxes.minPadding</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minPadding">https://api.highcharts.com/highcharts/chart.parallelAxes.minPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.minPadding">https://api.highcharts.com/highstock/chart.parallelAxes.minPadding</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.minPadding">https://api.highcharts.com/gantt/chart.parallelAxes.minPadding</a>
   *
   * @implspec minPadding?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minRange">https://api.highcharts.com/highcharts/chart.parallelAxes.minRange</a>
   *
   * @implspec minRange?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minRange">https://api.highcharts.com/highcharts/chart.parallelAxes.minRange</a>
   *
   * @implspec minRange?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minTickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.minTickInterval</a>
   *
   * @implspec minTickInterval?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.minTickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.minTickInterval</a>
   *
   * @implspec minTickInterval?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.offset">https://api.highcharts.com/highcharts/chart.parallelAxes.offset</a>
   *
   * @implspec offset?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.offset">https://api.highcharts.com/highcharts/chart.parallelAxes.offset</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.opposite">https://api.highcharts.com/highstock/chart.parallelAxes.opposite</a>
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.opposite">https://api.highcharts.com/highcharts/chart.parallelAxes.opposite</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.opposite">https://api.highcharts.com/gantt/chart.parallelAxes.opposite</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.opposite">https://api.highcharts.com/highstock/chart.parallelAxes.opposite</a>
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.opposite">https://api.highcharts.com/highcharts/chart.parallelAxes.opposite</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.opposite">https://api.highcharts.com/gantt/chart.parallelAxes.opposite</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.pane">https://api.highcharts.com/highcharts/chart.parallelAxes.pane</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.pane">https://api.highcharts.com/highcharts/chart.parallelAxes.pane</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.range">https://api.highcharts.com/highstock/chart.parallelAxes.range</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.range">https://api.highcharts.com/highstock/chart.parallelAxes.range</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.resize">https://api.highcharts.com/highstock/chart.parallelAxes.resize</a>
   *
   * @implspec resize?: ChartParallelAxesResizeOptions;
   *
   */
  @JSProperty("resize")
  @Nullable
  ChartParallelAxesResizeOptions getResize();

  /**
   * (Highstock) Options for axis resizing. This feature requires the
   * <code>drag-panes.js</code> - classic or styled mode - module.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.resize">https://api.highcharts.com/highstock/chart.parallelAxes.resize</a>
   *
   * @implspec resize?: ChartParallelAxesResizeOptions;
   *
   */
  @JSProperty("resize")
  void setResize(ChartParallelAxesResizeOptions value);

  /**
   * (Highcharts) Whether to reverse the axis so that the highest number is
   * closest to the origin.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.reversed">https://api.highcharts.com/highcharts/chart.parallelAxes.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts) Whether to reverse the axis so that the highest number is
   * closest to the origin.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.reversed">https://api.highcharts.com/highcharts/chart.parallelAxes.reversed</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.reversedStacks">https://api.highcharts.com/highcharts/chart.parallelAxes.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.reversedStacks">https://api.highcharts.com/highstock/chart.parallelAxes.reversedStacks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.reversedStacks">https://api.highcharts.com/highcharts/chart.parallelAxes.reversedStacks</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.reversedStacks">https://api.highcharts.com/highstock/chart.parallelAxes.reversedStacks</a>
   *
   * @implspec reversedStacks?: boolean;
   *
   */
  @JSProperty("reversedStacks")
  void setReversedStacks(boolean value);

  /**
   * (Highcharts) Whether to show the axis line and title when the axis has no
   * data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.showEmpty">https://api.highcharts.com/highcharts/chart.parallelAxes.showEmpty</a>
   *
   * @implspec showEmpty?: boolean;
   *
   */
  @JSProperty("showEmpty")
  boolean getShowEmpty();

  /**
   * (Highcharts) Whether to show the axis line and title when the axis has no
   * data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.showEmpty">https://api.highcharts.com/highcharts/chart.parallelAxes.showEmpty</a>
   *
   * @implspec showEmpty?: boolean;
   *
   */
  @JSProperty("showEmpty")
  void setShowEmpty(boolean value);

  /**
   * (Highcharts) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.showFirstLabel">https://api.highcharts.com/highcharts/chart.parallelAxes.showFirstLabel</a>
   *
   * @implspec showFirstLabel?: boolean;
   *
   */
  @JSProperty("showFirstLabel")
  boolean getShowFirstLabel();

  /**
   * (Highcharts) Whether to show the first tick label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.showFirstLabel">https://api.highcharts.com/highcharts/chart.parallelAxes.showFirstLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.showLastLabel">https://api.highcharts.com/highcharts/chart.parallelAxes.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.showLastLabel">https://api.highcharts.com/highstock/chart.parallelAxes.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.showLastLabel">https://api.highcharts.com/gantt/chart.parallelAxes.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.showLastLabel">https://api.highcharts.com/highcharts/chart.parallelAxes.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.showLastLabel">https://api.highcharts.com/highstock/chart.parallelAxes.showLastLabel</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.showLastLabel">https://api.highcharts.com/gantt/chart.parallelAxes.showLastLabel</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.softMax">https://api.highcharts.com/highcharts/chart.parallelAxes.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.softMax">https://api.highcharts.com/highstock/chart.parallelAxes.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.softMax">https://api.highcharts.com/gantt/chart.parallelAxes.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.softMax">https://api.highcharts.com/highcharts/chart.parallelAxes.softMax</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.softMax">https://api.highcharts.com/highstock/chart.parallelAxes.softMax</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.softMax">https://api.highcharts.com/gantt/chart.parallelAxes.softMax</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.softMin">https://api.highcharts.com/highcharts/chart.parallelAxes.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.softMin">https://api.highcharts.com/highstock/chart.parallelAxes.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.softMin">https://api.highcharts.com/gantt/chart.parallelAxes.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.softMin">https://api.highcharts.com/highcharts/chart.parallelAxes.softMin</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.softMin">https://api.highcharts.com/highstock/chart.parallelAxes.softMin</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.softMin">https://api.highcharts.com/gantt/chart.parallelAxes.softMin</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.startOfWeek">https://api.highcharts.com/highcharts/chart.parallelAxes.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.startOfWeek">https://api.highcharts.com/highstock/chart.parallelAxes.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.startOfWeek">https://api.highcharts.com/gantt/chart.parallelAxes.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.startOfWeek">https://api.highcharts.com/highcharts/chart.parallelAxes.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.startOfWeek">https://api.highcharts.com/highstock/chart.parallelAxes.startOfWeek</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.startOfWeek">https://api.highcharts.com/gantt/chart.parallelAxes.startOfWeek</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.startOnTick">https://api.highcharts.com/highcharts/chart.parallelAxes.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.startOnTick">https://api.highcharts.com/highstock/chart.parallelAxes.startOnTick</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.startOnTick">https://api.highcharts.com/gantt/chart.parallelAxes.startOnTick</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.startOnTick">https://api.highcharts.com/highcharts/chart.parallelAxes.startOnTick</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.startOnTick">https://api.highcharts.com/highstock/chart.parallelAxes.startOnTick</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.startOnTick">https://api.highcharts.com/gantt/chart.parallelAxes.startOnTick</a>
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
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.staticScale">https://api.highcharts.com/gantt/chart.parallelAxes.staticScale</a>
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
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.staticScale">https://api.highcharts.com/gantt/chart.parallelAxes.staticScale</a>
   *
   * @implspec staticScale?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickAmount">https://api.highcharts.com/highcharts/chart.parallelAxes.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.tickAmount">https://api.highcharts.com/highstock/chart.parallelAxes.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.tickAmount">https://api.highcharts.com/gantt/chart.parallelAxes.tickAmount</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickAmount">https://api.highcharts.com/highcharts/chart.parallelAxes.tickAmount</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.tickAmount">https://api.highcharts.com/highstock/chart.parallelAxes.tickAmount</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.tickAmount">https://api.highcharts.com/gantt/chart.parallelAxes.tickAmount</a>
   *
   * @implspec tickAmount?: number;
   *
   */
  @JSProperty("tickAmount")
  void setTickAmount(double value);

  /**
   * (Highcharts) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickColor">https://api.highcharts.com/highcharts/chart.parallelAxes.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  @Nullable
  String getTickColor();

  /**
   * (Highcharts) Color for the main tick marks.
   *
   * In styled mode, the stroke is given in the <code>.highcharts-tick</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickColor">https://api.highcharts.com/highcharts/chart.parallelAxes.tickColor</a>
   *
   * @implspec tickColor?: ColorString;
   *
   */
  @JSProperty("tickColor")
  void setTickColor(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.tickInterval</a>
   *
   * @implspec tickInterval?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.tickInterval</a>
   *
   * @implspec tickInterval?: number;
   *
   */
  @JSProperty("tickInterval")
  void setTickInterval(double value);

  /**
   * (Highcharts) The pixel length of the main tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickLength">https://api.highcharts.com/highcharts/chart.parallelAxes.tickLength</a>
   *
   * @implspec tickLength?: number;
   *
   */
  @JSProperty("tickLength")
  double getTickLength();

  /**
   * (Highcharts) The pixel length of the main tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickLength">https://api.highcharts.com/highcharts/chart.parallelAxes.tickLength</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickmarkPlacement">https://api.highcharts.com/highcharts/chart.parallelAxes.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.tickmarkPlacement">https://api.highcharts.com/gantt/chart.parallelAxes.tickmarkPlacement</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickmarkPlacement">https://api.highcharts.com/highcharts/chart.parallelAxes.tickmarkPlacement</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.tickmarkPlacement">https://api.highcharts.com/gantt/chart.parallelAxes.tickmarkPlacement</a>
   *
   * @implspec tickmarkPlacement?: (&quot;between&quot;|&quot;on&quot;|undefined);
   *
   */
  @JSProperty("tickmarkPlacement")
  void setTickmarkPlacement(TickmarkPlacement value);

  /**
   * (Highcharts) If tickInterval is <code>null</code> this option sets the approximate
   * pixel interval of the tick marks. Not applicable to categorized axis.
   *
   * The tick interval is also influenced by the minTickInterval option, that,
   * by default prevents ticks from being denser than the data points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPixelInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPixelInterval">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPixelInterval</a>
   *
   * @implspec tickPixelInterval?: number;
   *
   */
  @JSProperty("tickPixelInterval")
  void setTickPixelInterval(double value);

  /**
   * (Highcharts) The position of the major tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPosition">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  @Nullable
  TickPosition getTickPosition();

  /**
   * (Highcharts) The position of the major tick marks relative to the axis
   * line. Can be one of <code>inside</code> and <code>outside</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPosition">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPosition</a>
   *
   * @implspec tickPosition?: (&quot;inside&quot;|&quot;outside&quot;);
   *
   */
  @JSProperty("tickPosition")
  void setTickPosition(TickPosition value);

  /**
   * (Highcharts) A callback function returning array defining where the ticks
   * are laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositioner">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  @Nullable
  TickPositioner getTickPositioner();

  /**
   * (Highcharts) A callback function returning array defining where the ticks
   * are laid out on the axis. This overrides the default behaviour of
   * tickPixelInterval and tickInterval. The automatic tick positions are
   * accessible through <code>this.tickPositions</code> and can be modified by the
   * callback.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositioner">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositioner</a>
   *
   * @implspec tickPositioner?: () =&gt; void;
   *
   */
  @JSProperty("tickPositioner")
  void setTickPositioner(TickPositioner value);

  /**
   * (Highcharts) An array defining where the ticks are laid out on the axis.
   * This overrides the default behaviour of tickPixelInterval and
   * tickInterval.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositions">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositions">https://api.highcharts.com/highcharts/chart.parallelAxes.tickPositions</a>
   *
   * @implspec tickPositions?: Array<number>;
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(double[] value);

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickWidth">https://api.highcharts.com/highcharts/chart.parallelAxes.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.tickWidth">https://api.highcharts.com/highstock/chart.parallelAxes.tickWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.tickWidth">https://api.highcharts.com/gantt/chart.parallelAxes.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  double getTickWidth();

  /**
   * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tickWidth">https://api.highcharts.com/highcharts/chart.parallelAxes.tickWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.tickWidth">https://api.highcharts.com/highstock/chart.parallelAxes.tickWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.tickWidth">https://api.highcharts.com/gantt/chart.parallelAxes.tickWidth</a>
   *
   * @implspec tickWidth?: number;
   *
   */
  @JSProperty("tickWidth")
  void setTickWidth(double value);

  /**
   * (Highcharts) Titles for yAxes are taken from xAxis.categories. All
   * options for <code>xAxis.labels</code> applies to parallel coordinates titles. For
   * example, to style categories, use xAxis.labels.style.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.title">https://api.highcharts.com/highcharts/chart.parallelAxes.title</a>
   *
   * @implspec title?: ChartParallelAxesTitleOptions;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.title">https://api.highcharts.com/highcharts/chart.parallelAxes.title</a>
   *
   * @implspec title?: ChartParallelAxesTitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(ChartParallelAxesTitleOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tooltipValueFormat">https://api.highcharts.com/highcharts/chart.parallelAxes.tooltipValueFormat</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.tooltipValueFormat">https://api.highcharts.com/highcharts/chart.parallelAxes.tooltipValueFormat</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.top">https://api.highcharts.com/highstock/chart.parallelAxes.top</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.top">https://api.highcharts.com/highstock/chart.parallelAxes.top</a>
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
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.top">https://api.highcharts.com/highstock/chart.parallelAxes.top</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.type">https://api.highcharts.com/highcharts/chart.parallelAxes.type</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.type">https://api.highcharts.com/gantt/chart.parallelAxes.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.type">https://api.highcharts.com/highcharts/chart.parallelAxes.type</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.type">https://api.highcharts.com/gantt/chart.parallelAxes.type</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.uniqueNames">https://api.highcharts.com/highcharts/chart.parallelAxes.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.uniqueNames">https://api.highcharts.com/gantt/chart.parallelAxes.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.uniqueNames">https://api.highcharts.com/highcharts/chart.parallelAxes.uniqueNames</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.uniqueNames">https://api.highcharts.com/gantt/chart.parallelAxes.uniqueNames</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.units">https://api.highcharts.com/highcharts/chart.parallelAxes.units</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.units">https://api.highcharts.com/highstock/chart.parallelAxes.units</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.units">https://api.highcharts.com/gantt/chart.parallelAxes.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.units">https://api.highcharts.com/highcharts/chart.parallelAxes.units</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.units">https://api.highcharts.com/highstock/chart.parallelAxes.units</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.units">https://api.highcharts.com/gantt/chart.parallelAxes.units</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.visible">https://api.highcharts.com/highcharts/chart.parallelAxes.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.visible">https://api.highcharts.com/highstock/chart.parallelAxes.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.visible">https://api.highcharts.com/gantt/chart.parallelAxes.visible</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.visible">https://api.highcharts.com/highcharts/chart.parallelAxes.visible</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.visible">https://api.highcharts.com/highstock/chart.parallelAxes.visible</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.visible">https://api.highcharts.com/gantt/chart.parallelAxes.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

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
