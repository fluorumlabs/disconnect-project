package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A Sunburst displays hierarchical data, where a level in the
 * hierarchy is represented by a circle. The center represents the root node of
 * the tree. The visualization bears a resemblance to both treemap and pie
 * charts.
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
 * Options for all <code>sunburst</code> series are defined in plotOptions.sunburst.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array.
 *
 * </li>
 * </ol>
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst">https://api.highcharts.com/highcharts/plotOptions.sunburst</a>
 *
 */
public interface PlotSunburstOptions extends Any {
  /**
   * (Highcharts) When enabled the user can click on a point which is a parent
   * and zoom in on its children.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.allowDrillToNode">https://api.highcharts.com/highcharts/plotOptions.sunburst.allowDrillToNode</a>
   *
   * @implspec allowDrillToNode?: boolean;
   *
   */
  @JSProperty("allowDrillToNode")
  boolean getAllowDrillToNode();

  /**
   * (Highcharts) When enabled the user can click on a point which is a parent
   * and zoom in on its children.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.allowDrillToNode">https://api.highcharts.com/highcharts/plotOptions.sunburst.allowDrillToNode</a>
   *
   * @implspec allowDrillToNode?: boolean;
   *
   */
  @JSProperty("allowDrillToNode")
  void setAllowDrillToNode(boolean value);

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.sunburst.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts) Allow this series' points to be selected by clicking on the
   * graphic (columns, point markers, pie slices, map areas etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.allowPointSelect">https://api.highcharts.com/highcharts/plotOptions.sunburst.allowPointSelect</a>
   *
   * @implspec allowPointSelect?: boolean;
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstAnimationOptions);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(PlotSunburstAnimationOptions value);

  /**
   * (Highcharts) Enable or disable the initial animation when a series is
   * displayed. The animation can also be set as a configuration object.
   * Please note that this option only applies to the initial animation of the
   * series itself. For other animations, see chart.animation and the
   * animation parameter under the API methods. The following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * Due to poor performance, animation is disabled in old IE browsers for
   * several chart types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.animation">https://api.highcharts.com/highcharts/plotOptions.sunburst.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject|PlotSunburstAnimationOptions);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.borderColor">https://api.highcharts.com/highcharts/plotOptions.sunburst.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The color of the border surrounding each slice. When <code>null</code>,
   * the border takes the same color as the slice fill. This can be used
   * together with a <code>borderWidth</code> to fill drawing gaps created by
   * antialiazing artefacts in borderless pies.
   *
   * In styled mode, the border stroke is given in the <code>.highcharts-point</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.borderColor">https://api.highcharts.com/highcharts/plotOptions.sunburst.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.borderWidth">https://api.highcharts.com/highcharts/plotOptions.sunburst.borderWidth</a>
   *
   * @implspec borderWidth?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.borderWidth">https://api.highcharts.com/highcharts/plotOptions.sunburst.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The center of the sunburst chart relative to the plot area.
   * Can be percentages or pixel values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.center">https://api.highcharts.com/highcharts/plotOptions.sunburst.center</a>
   *
   * @implspec center?: Array&lt;(number|string)&gt;;
   *
   */
  @JSProperty("center")
  @Nullable
  Array<Unknown> getCenter();

  /**
   * (Highcharts) The center of the sunburst chart relative to the plot area.
   * Can be percentages or pixel values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.center">https://api.highcharts.com/highcharts/plotOptions.sunburst.center</a>
   *
   * @implspec center?: Array&lt;(number|string)&gt;;
   *
   */
  @JSProperty("center")
  void setCenter(Array<Unknown> value);

  /**
   * (Highcharts) An additional class name to apply to the series' graphical
   * elements. This option does not replace default class names of the
   * graphical element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.className">https://api.highcharts.com/highcharts/plotOptions.sunburst.className</a>
   *
   * @implspec className?: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.className">https://api.highcharts.com/highcharts/plotOptions.sunburst.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The main color of the series. In line type series it applies
   * to the line and the point markers unless otherwise specified. In bar type
   * series it applies to the bars unless a color is specified per point. The
   * default value is pulled from the <code>options.colors</code> array.
   *
   * In styled mode, the color can be defined by the colorIndex option. Also,
   * the series color can be set with the <code>.highcharts-series</code>,
   * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
   * <code>.highcharts-series-{n}</code> class, or individual classes given by the
   * <code>className</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * @implspec colorByPoint?: boolean;
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.colorIndex">https://api.highcharts.com/highcharts/plotOptions.sunburst.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts) Styled mode only. A specific color index to use for the
   * series, so its graphic representations are given the class name
   * <code>highcharts-color-{n}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.colorIndex">https://api.highcharts.com/highcharts/plotOptions.sunburst.colorIndex</a>
   *
   * @implspec colorIndex?: number;
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.colors">https://api.highcharts.com/highcharts/plotOptions.sunburst.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts) A series specific or series type specific color set to use
   * instead of the global colors.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.colors">https://api.highcharts.com/highcharts/plotOptions.sunburst.colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  void setColors(String[] value);

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.compareStart">https://api.highcharts.com/highstock/plotOptions.sunburst.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  boolean getCompareStart();

  /**
   * (Highstock) Defines if comparison should start from the first point
   * within the visible range or should start from the first point (see online
   * documentation for example) the range. In other words, this flag
   * determines if first point within the visible range will have 0%
   * (<code>compareStart=true</code>) or should have been already calculated according to
   * the previous point (<code>compareStart=false</code>).
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.compareStart">https://api.highcharts.com/highstock/plotOptions.sunburst.compareStart</a>
   *
   * @implspec compareStart?: boolean;
   *
   */
  @JSProperty("compareStart")
  void setCompareStart(boolean value);

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sunburst.connectors">https://api.highcharts.com/gantt/plotOptions.sunburst.connectors</a>
   *
   * @implspec connectors?: PlotSunburstConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  @Nullable
  PlotSunburstConnectorsOptions getConnectors();

  /**
   * (Gantt) Override Pathfinder connector options for a series. Requires
   * Highcharts Gantt to be loaded.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sunburst.connectors">https://api.highcharts.com/gantt/plotOptions.sunburst.connectors</a>
   *
   * @implspec connectors?: PlotSunburstConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(PlotSunburstConnectorsOptions value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.cursor">https://api.highcharts.com/highcharts/plotOptions.sunburst.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  @Nullable
  Unknown getCursor();

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.cursor">https://api.highcharts.com/highcharts/plotOptions.sunburst.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(CursorType value);

  /**
   * (Highcharts) You can set the cursor to &quot;pointer&quot; if you have click events
   * attached to the series, to signal to the user that the points and lines
   * can be clicked.
   *
   * In styled mode, the series cursor can be set with the same classes as
   * listed under series.color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.cursor">https://api.highcharts.com/highcharts/plotOptions.sunburst.cursor</a>
   *
   * @implspec cursor?: (string|CursorType);
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.dataLabels">https://api.highcharts.com/highcharts/plotOptions.sunburst.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSunburstDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  PlotSunburstDataLabelsOptions getDataLabels();

  /**
   * (Highcharts) Options for the series data labels, appearing next to each
   * data point.
   *
   * Since v6.2.0, multiple data labels can be applied to each single point by
   * defining them as an array of configs.
   *
   * In styled mode, the data labels can be styled with the
   * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
   * (see example).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.dataLabels">https://api.highcharts.com/highcharts/plotOptions.sunburst.dataLabels</a>
   *
   * @implspec dataLabels?: PlotSunburstDataLabelsOptions;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotSunburstDataLabelsOptions value);

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.description">https://api.highcharts.com/highcharts/plotOptions.sunburst.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) Requires the Accessibility module.
   *
   * A description of the series to add to the screen reader information about
   * the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.description">https://api.highcharts.com/highcharts/plotOptions.sunburst.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.dragDrop">https://api.highcharts.com/highcharts/plotOptions.sunburst.dragDrop</a>
   *
   * @implspec dragDrop?: PlotSunburstDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  PlotSunburstDragDropOptions getDragDrop();

  /**
   * (Highcharts) The draggable-points module allows points to be moved around
   * or modified in the chart. In addition to the options mentioned under the
   * <code>dragDrop</code> API structure, the module fires three events, point.dragStart,
   * point.drag and point.drop.
   *
   * It requires the <code>modules/draggable-points.js</code> file to be loaded.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.dragDrop">https://api.highcharts.com/highcharts/plotOptions.sunburst.dragDrop</a>
   *
   * @implspec dragDrop?: PlotSunburstDragDropOptions;
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(PlotSunburstDragDropOptions value);

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.sunburst.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  boolean getEnableMouseTracking();

  /**
   * (Highcharts) Enable or disable the mouse tracking for a specific series.
   * This includes point tooltips and click events on graphs and points. For
   * large datasets it improves performance.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.enableMouseTracking">https://api.highcharts.com/highcharts/plotOptions.sunburst.enableMouseTracking</a>
   *
   * @implspec enableMouseTracking?: boolean;
   *
   */
  @JSProperty("enableMouseTracking")
  void setEnableMouseTracking(boolean value);

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.events">https://api.highcharts.com/highcharts/plotOptions.sunburst.events</a>
   *
   * @implspec events?: PlotSunburstEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSunburstEventsOptions getEvents();

  /**
   * (Highcharts) General event handlers for the series items. These event
   * hooks can also be attached to the series at run time using the
   * <code>Highcharts.addEvent</code> function.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.events">https://api.highcharts.com/highcharts/plotOptions.sunburst.events</a>
   *
   * @implspec events?: PlotSunburstEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSunburstEventsOptions value);

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.sunburst.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  boolean getExposeElementToA11y();

  /**
   * (Highcharts) By default, series are exposed to screen readers as regions.
   * By enabling this option, the series element itself will be exposed in the
   * same way as the data points. This is useful if the series is not used as
   * a grouping entity in the chart, but you still want to attach a
   * description to the series.
   *
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.exposeElementToA11y">https://api.highcharts.com/highcharts/plotOptions.sunburst.exposeElementToA11y</a>
   *
   * @implspec exposeElementToA11y?: boolean;
   *
   */
  @JSProperty("exposeElementToA11y")
  void setExposeElementToA11y(boolean value);

  /**
   * (Highcharts) An array specifying which option maps to which key in the
   * data point array. This makes it convenient to work with unstructured data
   * arrays from different sources.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.keys">https://api.highcharts.com/highcharts/plotOptions.sunburst.keys</a>
   *
   * @implspec keys?: Array<string>;
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.keys">https://api.highcharts.com/highcharts/plotOptions.sunburst.keys</a>
   *
   * @implspec keys?: Array<string>;
   *
   */
  @JSProperty("keys")
  void setKeys(String[] value);

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   * Requires the <code>series-label.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.label">https://api.highcharts.com/highcharts/plotOptions.sunburst.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.label">https://api.highcharts.com/highstock/plotOptions.sunburst.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sunburst.label">https://api.highcharts.com/gantt/plotOptions.sunburst.label</a>
   *
   * @implspec label?: PlotSunburstLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  PlotSunburstLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
   * series as possible in a natural way, seeking to avoid other series. The
   * goal of this feature is to make the chart more easily readable, like if a
   * human designer placed the labels in the optimal position.
   *
   * The series labels currently work with series types having a <code>graph</code> or an
   * <code>area</code>.
   *
   * Requires the <code>series-label.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.label">https://api.highcharts.com/highcharts/plotOptions.sunburst.label</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.label">https://api.highcharts.com/highstock/plotOptions.sunburst.label</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sunburst.label">https://api.highcharts.com/gantt/plotOptions.sunburst.label</a>
   *
   * @implspec label?: PlotSunburstLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(PlotSunburstLabelOptions value);

  /**
   * (Highcharts) Used together with the levels and <code>allowDrillToNode</code>
   * options. When set to false the first level visible when drilling is
   * considered to be level one. Otherwise the level will be the same as the
   * tree structure.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelIsConstant">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelIsConstant</a>
   *
   * @implspec levelIsConstant?: boolean;
   *
   */
  @JSProperty("levelIsConstant")
  boolean getLevelIsConstant();

  /**
   * (Highcharts) Used together with the levels and <code>allowDrillToNode</code>
   * options. When set to false the first level visible when drilling is
   * considered to be level one. Otherwise the level will be the same as the
   * tree structure.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelIsConstant">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelIsConstant</a>
   *
   * @implspec levelIsConstant?: boolean;
   *
   */
  @JSProperty("levelIsConstant")
  void setLevelIsConstant(boolean value);

  /**
   * (Highcharts) Set options on specific levels. Takes precedence over series
   * options, but not point options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels</a>
   *
   * @implspec levels?: Array<PlotSunburstLevelsOptions>;
   *
   */
  @JSProperty("levels")
  @Nullable
  Array<PlotSunburstLevelsOptions> getLevels();

  /**
   * (Highcharts) Set options on specific levels. Takes precedence over series
   * options, but not point options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels</a>
   *
   * @implspec levels?: Array<PlotSunburstLevelsOptions>;
   *
   */
  @JSProperty("levels")
  void setLevels(Array<PlotSunburstLevelsOptions> value);

  /**
   * (Highcharts) Determines the width of the ring per level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize</a>
   *
   * @implspec levelSize?: PlotSunburstLevelSizeOptions;
   *
   */
  @JSProperty("levelSize")
  @Nullable
  PlotSunburstLevelSizeOptions getLevelSize();

  /**
   * (Highcharts) Determines the width of the ring per level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize</a>
   *
   * @implspec levelSize?: PlotSunburstLevelSizeOptions;
   *
   */
  @JSProperty("levelSize")
  void setLevelSize(PlotSunburstLevelSizeOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The id of another series to link to.
   * Additionally, the value can be &quot;:previous&quot; to link to the previous
   * series. When two series are linked, only the first one appears in the
   * legend. Toggling the visibility of this also toggles the linked series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.linkedTo">https://api.highcharts.com/highcharts/plotOptions.sunburst.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.linkedTo">https://api.highcharts.com/highstock/plotOptions.sunburst.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sunburst.linkedTo">https://api.highcharts.com/gantt/plotOptions.sunburst.linkedTo</a>
   *
   * @implspec linkedTo?: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.linkedTo">https://api.highcharts.com/highcharts/plotOptions.sunburst.linkedTo</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.linkedTo">https://api.highcharts.com/highstock/plotOptions.sunburst.linkedTo</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sunburst.linkedTo">https://api.highcharts.com/gantt/plotOptions.sunburst.linkedTo</a>
   *
   * @implspec linkedTo?: string;
   *
   */
  @JSProperty("linkedTo")
  void setLinkedTo(String value);

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.point">https://api.highcharts.com/highcharts/plotOptions.sunburst.point</a>
   *
   * @implspec point?: PlotSunburstPointOptions;
   *
   */
  @JSProperty("point")
  @Nullable
  PlotSunburstPointOptions getPoint();

  /**
   * (Highcharts) Properties for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.point">https://api.highcharts.com/highcharts/plotOptions.sunburst.point</a>
   *
   * @implspec point?: PlotSunburstPointOptions;
   *
   */
  @JSProperty("point")
  void setPoint(PlotSunburstPointOptions value);

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.sunburst.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
   * individual series. Overrides the chart wide configuration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.pointDescriptionFormatter">https://api.highcharts.com/highcharts/plotOptions.sunburst.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts) Which point to use as a root in the visualization.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.rootId">https://api.highcharts.com/highcharts/plotOptions.sunburst.rootId</a>
   *
   * @implspec rootId?: string;
   *
   */
  @JSProperty("rootId")
  @Nullable
  String getRootId();

  /**
   * (Highcharts) Which point to use as a root in the visualization.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.rootId">https://api.highcharts.com/highcharts/plotOptions.sunburst.rootId</a>
   *
   * @implspec rootId?: string;
   *
   */
  @JSProperty("rootId")
  void setRootId(String value);

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.selected">https://api.highcharts.com/highcharts/plotOptions.sunburst.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts) Whether to select the series initially. If <code>showCheckbox</code> is
   * true, the checkbox next to the series name in the legend will be checked
   * for a selected series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.selected">https://api.highcharts.com/highcharts/plotOptions.sunburst.selected</a>
   *
   * @implspec selected?: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.shadow">https://api.highcharts.com/highcharts/plotOptions.sunburst.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.shadow">https://api.highcharts.com/highcharts/plotOptions.sunburst.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(ShadowOptionsObject value);

  /**
   * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
   * the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.shadow">https://api.highcharts.com/highcharts/plotOptions.sunburst.shadow</a>
   *
   * @implspec shadow?: (boolean|ShadowOptionsObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.sunburst.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  boolean getShowCheckbox();

  /**
   * (Highcharts) If true, a checkbox is displayed next to the legend item to
   * allow selecting the series. The state of the checkbox is determined by
   * the <code>selected</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.showCheckbox">https://api.highcharts.com/highcharts/plotOptions.sunburst.showCheckbox</a>
   *
   * @implspec showCheckbox?: boolean;
   *
   */
  @JSProperty("showCheckbox")
  void setShowCheckbox(boolean value);

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Since 2.1, pies are not shown in the legend by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.showInLegend">https://api.highcharts.com/highcharts/plotOptions.sunburst.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  boolean getShowInLegend();

  /**
   * (Highcharts) Whether to display this particular series or series type in
   * the legend. Since 2.1, pies are not shown in the legend by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.showInLegend">https://api.highcharts.com/highcharts/plotOptions.sunburst.showInLegend</a>
   *
   * @implspec showInLegend?: boolean;
   *
   */
  @JSProperty("showInLegend")
  void setShowInLegend(boolean value);

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.showInNavigator">https://api.highcharts.com/highstock/plotOptions.sunburst.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  boolean getShowInNavigator();

  /**
   * (Highstock) Whether or not to show the series in the navigator. Takes
   * precedence over navigator.baseSeries if defined.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sunburst.showInNavigator">https://api.highcharts.com/highstock/plotOptions.sunburst.showInNavigator</a>
   *
   * @implspec showInNavigator?: boolean;
   *
   */
  @JSProperty("showInNavigator")
  void setShowInNavigator(boolean value);

  /**
   * (Highcharts) The diameter of the pie relative to the plot area. Can be a
   * percentage or pixel value. Pixel values are given as integers. The
   * default behaviour (as of 3.0) is to scale to the plot area and give room
   * for data labels within the plot area. slicedOffset is also included in
   * the default size calculation. As a consequence, the size of the pie may
   * vary when points are updated and data labels more around. In that case it
   * is best to set a fixed value, for example <code>&quot;75%&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.size">https://api.highcharts.com/highcharts/plotOptions.sunburst.size</a>
   *
   * @implspec size?: (number|string|null);
   *
   */
  @JSProperty("size")
  @Nullable
  Unknown getSize();

  /**
   * (Highcharts) The diameter of the pie relative to the plot area. Can be a
   * percentage or pixel value. Pixel values are given as integers. The
   * default behaviour (as of 3.0) is to scale to the plot area and give room
   * for data labels within the plot area. slicedOffset is also included in
   * the default size calculation. As a consequence, the size of the pie may
   * vary when points are updated and data labels more around. In that case it
   * is best to set a fixed value, for example <code>&quot;75%&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.size">https://api.highcharts.com/highcharts/plotOptions.sunburst.size</a>
   *
   * @implspec size?: (number|string|null);
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) The diameter of the pie relative to the plot area. Can be a
   * percentage or pixel value. Pixel values are given as integers. The
   * default behaviour (as of 3.0) is to scale to the plot area and give room
   * for data labels within the plot area. slicedOffset is also included in
   * the default size calculation. As a consequence, the size of the pie may
   * vary when points are updated and data labels more around. In that case it
   * is best to set a fixed value, for example <code>&quot;75%&quot;</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.size">https://api.highcharts.com/highcharts/plotOptions.sunburst.size</a>
   *
   * @implspec size?: (number|string|null);
   *
   */
  @JSProperty("size")
  void setSize(String value);

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.sunburst.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  boolean getSkipKeyboardNavigation();

  /**
   * (Highcharts) If set to <code>true</code>, the accessibility module will skip past
   * the points in this series for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.skipKeyboardNavigation">https://api.highcharts.com/highcharts/plotOptions.sunburst.skipKeyboardNavigation</a>
   *
   * @implspec skipKeyboardNavigation?: boolean;
   *
   */
  @JSProperty("skipKeyboardNavigation")
  void setSkipKeyboardNavigation(boolean value);

  /**
   * (Highcharts) If a point is sliced, moved out from the center, how many
   * pixels should it be moved?.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.slicedOffset">https://api.highcharts.com/highcharts/plotOptions.sunburst.slicedOffset</a>
   *
   * @implspec slicedOffset?: number;
   *
   */
  @JSProperty("slicedOffset")
  double getSlicedOffset();

  /**
   * (Highcharts) If a point is sliced, moved out from the center, how many
   * pixels should it be moved?.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.slicedOffset">https://api.highcharts.com/highcharts/plotOptions.sunburst.slicedOffset</a>
   *
   * @implspec slicedOffset?: number;
   *
   */
  @JSProperty("slicedOffset")
  void setSlicedOffset(double value);

  /**
   * (Highcharts) The start angle of the pie slices in degrees where 0 is top
   * and 90 right.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.startAngle">https://api.highcharts.com/highcharts/plotOptions.sunburst.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  double getStartAngle();

  /**
   * (Highcharts) The start angle of the pie slices in degrees where 0 is top
   * and 90 right.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.startAngle">https://api.highcharts.com/highcharts/plotOptions.sunburst.startAngle</a>
   *
   * @implspec startAngle?: number;
   *
   */
  @JSProperty("startAngle")
  void setStartAngle(double value);

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states">https://api.highcharts.com/highcharts/plotOptions.sunburst.states</a>
   *
   * @implspec states?: PlotSunburstStatesOptions;
   *
   */
  @JSProperty("states")
  @Nullable
  PlotSunburstStatesOptions getStates();

  /**
   * (Highcharts) A wrapper object for all the series options in specific
   * states.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states">https://api.highcharts.com/highcharts/plotOptions.sunburst.states</a>
   *
   * @implspec states?: PlotSunburstStatesOptions;
   *
   */
  @JSProperty("states")
  void setStates(PlotSunburstStatesOptions value);

  /**
   * (Highcharts) Sticky tracking of mouse events. When true, the <code>mouseOut</code>
   * event on a series isn't triggered until the mouse moves over another
   * series, or out of the plot area. When false, the <code>mouseOut</code> event on a
   * series is triggered when the mouse leaves the area around the series'
   * graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is
   * false and <code>tooltip.shared</code> is false, the tooltip will be hidden when
   * moving the mouse between series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.sunburst.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.stickyTracking">https://api.highcharts.com/highcharts/plotOptions.sunburst.stickyTracking</a>
   *
   * @implspec stickyTracking?: boolean;
   *
   */
  @JSProperty("stickyTracking")
  void setStickyTracking(boolean value);

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.tooltip">https://api.highcharts.com/highcharts/plotOptions.sunburst.tooltip</a>
   *
   * @implspec tooltip?: PlotSunburstTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  PlotSunburstTooltipOptions getTooltip();

  /**
   * (Highcharts) A configuration object for the tooltip rendering of each
   * single series. Properties are inherited from tooltip, but only the
   * following properties can be defined on a series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.tooltip">https://api.highcharts.com/highcharts/plotOptions.sunburst.tooltip</a>
   *
   * @implspec tooltip?: PlotSunburstTooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(PlotSunburstTooltipOptions value);

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.visible">https://api.highcharts.com/highcharts/plotOptions.sunburst.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * (Highcharts) Set the initial visibility of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.visible">https://api.highcharts.com/highcharts/plotOptions.sunburst.visible</a>
   *
   * @implspec visible?: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.zIndex">https://api.highcharts.com/highmaps/plotOptions.sunburst.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) Define the z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.zIndex">https://api.highcharts.com/highmaps/plotOptions.sunburst.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }
}
