package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ChartParallelAxesOptions | Array < ChartParallelAxesOptions > ) */;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( boolean | CSSObject ) */;
import js.lang.Unknown /* ( number | Array < number > ) */;
import js.lang.Unknown /* ( number | string | null ) */;
import js.lang.Unknown /* ( string | GeoJSON | Array < any > ) */;
import js.lang.Unknown /* ( string | HTMLDOMElement ) */;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartOptions extends Any {
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
   * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
   * all chart updating. Animation can be disabled throughout the chart by
   * setting it to false here. It can be overridden for each individual API
   * method as a function parameter. The only animation not affected by this
   * option is the initial series animation, see plotOptions.series.animation.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <strong>duration</strong>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <strong>easing</strong>: A string reference to an easing function set on the <code>Math</code>
   * object. See the easing demo.
   *
   * </li>
   * </ul>
   * When zooming on a series with less than 100 points, the chart redraw will
   * be done with animation, but in case of more data points, it is necessary
   * to set this option to ensure animation on zoom.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
   * all chart updating. Animation can be disabled throughout the chart by
   * setting it to false here. It can be overridden for each individual API
   * method as a function parameter. The only animation not affected by this
   * option is the initial series animation, see plotOptions.series.animation.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <strong>duration</strong>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <strong>easing</strong>: A string reference to an easing function set on the <code>Math</code>
   * object. See the easing demo.
   *
   * </li>
   * </ul>
   * When zooming on a series with less than 100 points, the chart redraw will
   * be done with animation, but in case of more data points, it is necessary
   * to set this option to ensure animation on zoom.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
   * all chart updating. Animation can be disabled throughout the chart by
   * setting it to false here. It can be overridden for each individual API
   * method as a function parameter. The only animation not affected by this
   * option is the initial series animation, see plotOptions.series.animation.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <strong>duration</strong>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <strong>easing</strong>: A string reference to an easing function set on the <code>Math</code>
   * object. See the easing demo.
   *
   * </li>
   * </ul>
   * When zooming on a series with less than 100 points, the chart redraw will
   * be done with animation, but in case of more data points, it is necessary
   * to set this option to ensure animation on zoom.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the outer chart area.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the outer chart area.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the outer chart area.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the outer chart area.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
   * border.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
   * border.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
   * border.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
   * border.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The corner radius of the outer
   * chart border.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The corner radius of the outer
   * chart border.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the outer
   * chart border.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the outer
   * chart border.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
   * charts container <code>div</code>, allowing unique CSS styling for each chart.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
   * charts container <code>div</code>, allowing unique CSS styling for each chart.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In styled mode, this sets how
   * many colors the class names should rotate between. With ten colors,
   * series (or points) are given class names like <code>highcharts-color-0</code>,
   * <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in
   * non-styled mode is to set colors using the colors setting.
   *
   */
  @JSProperty("colorCount")
  double getColorCount();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In styled mode, this sets how
   * many colors the class names should rotate between. With ten colors,
   * series (or points) are given class names like <code>highcharts-color-0</code>,
   * <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in
   * non-styled mode is to set colors using the colors setting.
   *
   */
  @JSProperty("colorCount")
  void setColorCount(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to display errors on the
   * chart. When <code>false</code>, the errors will be shown only in the console.
   *
   */
  @JSProperty("displayErrors")
  boolean getDisplayErrors();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to display errors on the
   * chart. When <code>false</code>, the errors will be shown only in the console.
   *
   */
  @JSProperty("displayErrors")
  void setDisplayErrors(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
   *
   */
  @JSProperty("events")
  @Nullable
  ChartEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ChartEventsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
   * chart. If a <em>number</em>, the height is given in pixels. If given a
   * <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the
   * percentage of the actual chart width. This allows for preserving the
   * aspect ratio across responsive sizes.
   *
   * By default (when <code>null</code>) the height is calculated from the offset height
   * of the containing element, or 400 pixels if the containing element's
   * height is 0.
   *
   */
  @JSProperty("height")
  @Nullable
  Unknown /* ( number | string | null ) */ getHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
   * chart. If a <em>number</em>, the height is given in pixels. If given a
   * <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the
   * percentage of the actual chart width. This allows for preserving the
   * aspect ratio across responsive sizes.
   *
   * By default (when <code>null</code>) the height is calculated from the offset height
   * of the containing element, or 400 pixels if the containing element's
   * height is 0.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
   * chart. If a <em>number</em>, the height is given in pixels. If given a
   * <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the
   * percentage of the actual chart width. This allows for preserving the
   * aspect ratio across responsive sizes.
   *
   * By default (when <code>null</code>) the height is calculated from the offset height
   * of the containing element, or 400 pixels if the containing element's
   * height is 0.
   *
   */
  @JSProperty("height")
  void setHeight(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) If true, the axes will scale to the
   * remaining visible series once one series is hidden. If false, hiding and
   * showing a series will not affect the axes or the other series. For
   * stacks, once one series within the stack is hidden, the rest of the stack
   * will close in around it even if the axis is not affected.
   *
   */
  @JSProperty("ignoreHiddenSeries")
  boolean getIgnoreHiddenSeries();

  /**
   * (Highcharts, Highstock, Gantt) If true, the axes will scale to the
   * remaining visible series once one series is hidden. If false, hiding and
   * showing a series will not affect the axes or the other series. For
   * stacks, once one series within the stack is hidden, the rest of the stack
   * will close in around it even if the axis is not affected.
   *
   */
  @JSProperty("ignoreHiddenSeries")
  void setIgnoreHiddenSeries(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
   * axis is vertical and y axis is horizontal. When <code>true</code>, the x axis is
   * reversed by default.
   *
   */
  @JSProperty("inverted")
  boolean getInverted();

  /**
   * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
   * axis is vertical and y axis is horizontal. When <code>true</code>, the x axis is
   * reversed by default.
   *
   */
  @JSProperty("inverted")
  void setInverted(boolean value);

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted as map data.
   *
   */
  @JSProperty("map")
  @Nullable
  Unknown /* ( string | GeoJSON | Array < any > ) */ getMap();

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted as map data.
   *
   */
  @JSProperty("map")
  void setMap(Any... value);

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted as map data.
   *
   */
  @JSProperty("map")
  void setMap(@Nullable String value);

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted as map data.
   *
   */
  @JSProperty("map")
  void setMap(@Nullable GeoJSON value);

  /**
   * (Highmaps) Set lat/lon transformation definitions for the chart. If not
   * defined, these are extracted from the map data.
   *
   */
  @JSProperty("mapTransforms")
  @Nullable
  Any getMapTransforms();

  /**
   * (Highmaps) Set lat/lon transformation definitions for the chart. If not
   * defined, these are extracted from the map data.
   *
   */
  @JSProperty("mapTransforms")
  void setMapTransforms(@Nullable Any value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
   * edge of the chart and the plot area. The numbers in the array designate
   * top, right, bottom and left respectively. Use the options <code>marginTop</code>,
   * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
   * one option.
   *
   * By default there is no margin. The actual space is dynamically calculated
   * from the offset of axis labels, axis title, title, subtitle and legend in
   * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
   * <code>spacingLeft</code> options.
   *
   */
  @JSProperty("margin")
  @Nullable
  Unknown /* ( number | Array < number > ) */ getMargin();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
   * edge of the chart and the plot area. The numbers in the array designate
   * top, right, bottom and left respectively. Use the options <code>marginTop</code>,
   * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
   * one option.
   *
   * By default there is no margin. The actual space is dynamically calculated
   * from the offset of axis labels, axis title, title, subtitle and legend in
   * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
   * <code>spacingLeft</code> options.
   *
   */
  @JSProperty("margin")
  void setMargin(double... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
   * edge of the chart and the plot area. The numbers in the array designate
   * top, right, bottom and left respectively. Use the options <code>marginTop</code>,
   * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
   * one option.
   *
   * By default there is no margin. The actual space is dynamically calculated
   * from the offset of axis labels, axis title, title, subtitle and legend in
   * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
   * <code>spacingLeft</code> options.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the bottom
   * outer edge of the chart and the plot area. Use this to set a fixed pixel
   * value for the margin as opposed to the default dynamic margin. See also
   * <code>spacingBottom</code>.
   *
   */
  @JSProperty("marginBottom")
  double getMarginBottom();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the bottom
   * outer edge of the chart and the plot area. Use this to set a fixed pixel
   * value for the margin as opposed to the default dynamic margin. See also
   * <code>spacingBottom</code>.
   *
   */
  @JSProperty("marginBottom")
  void setMarginBottom(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the left
   * outer edge of the chart and the plot area. Use this to set a fixed pixel
   * value for the margin as opposed to the default dynamic margin. See also
   * <code>spacingLeft</code>.
   *
   */
  @JSProperty("marginLeft")
  double getMarginLeft();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the left
   * outer edge of the chart and the plot area. Use this to set a fixed pixel
   * value for the margin as opposed to the default dynamic margin. See also
   * <code>spacingLeft</code>.
   *
   */
  @JSProperty("marginLeft")
  void setMarginLeft(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the right
   * outer edge of the chart and the plot area. Use this to set a fixed pixel
   * value for the margin as opposed to the default dynamic margin. See also
   * <code>spacingRight</code>.
   *
   */
  @JSProperty("marginRight")
  double getMarginRight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the right
   * outer edge of the chart and the plot area. Use this to set a fixed pixel
   * value for the margin as opposed to the default dynamic margin. See also
   * <code>spacingRight</code>.
   *
   */
  @JSProperty("marginRight")
  void setMarginRight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the top outer
   * edge of the chart and the plot area. Use this to set a fixed pixel value
   * for the margin as opposed to the default dynamic margin. See also
   * <code>spacingTop</code>.
   *
   */
  @JSProperty("marginTop")
  double getMarginTop();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the top outer
   * edge of the chart and the plot area. Use this to set a fixed pixel value
   * for the margin as opposed to the default dynamic margin. See also
   * <code>spacingTop</code>.
   *
   */
  @JSProperty("marginTop")
  void setMarginTop(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to override
   * the default function that formats all the numbers in the chart. Returns a
   * string with the formatted number.
   *
   */
  @JSProperty("numberFormatter")
  @Nullable
  NumberFormatterCallbackFunction getNumberFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to override
   * the default function that formats all the numbers in the chart. Returns a
   * string with the formatted number.
   *
   */
  @JSProperty("numberFormatter")
  void setNumberFormatter(@Nullable NumberFormatterCallbackFunction value);

  /**
   * (Highcharts) Options to render charts in 3 dimensions. This feature
   * requires <code>highcharts-3d.js</code>, found in the download package or online at
   * code.highcharts.com/highcharts-3d.js.
   *
   */
  @JSProperty("options3d")
  @Nullable
  Chart3dOptions getOptions3d();

  /**
   * (Highcharts) Options to render charts in 3 dimensions. This feature
   * requires <code>highcharts-3d.js</code>, found in the download package or online at
   * code.highcharts.com/highcharts-3d.js.
   *
   */
  @JSProperty("options3d")
  void setOptions3d(@Nullable Chart3dOptions value);

  /**
   * (Highcharts, Gantt) Allows setting a key to switch between zooming and
   * panning. Can be one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and
   * Windows key on Windows) or <code>shift</code>. The keys are mapped directly to the
   * key properties of the click event argument (<code>event.altKey</code>,
   * <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).
   *
   */
  @JSProperty("panKey")
  @Nullable
  PanKey getPanKey();

  /**
   * (Highcharts, Gantt) Allows setting a key to switch between zooming and
   * panning. Can be one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and
   * Windows key on Windows) or <code>shift</code>. The keys are mapped directly to the
   * key properties of the click event argument (<code>event.altKey</code>,
   * <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).
   *
   */
  @JSProperty("panKey")
  void setPanKey(@Nullable PanKey value);

  /**
   * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
   * panKey to combine zooming and panning.
   *
   * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
   * (default), panning requires two fingers. To allow panning with one
   * finger, set <code>followTouchMove</code> to <code>false</code>.
   *
   */
  @JSProperty("panning")
  @Nullable
  ChartPanningOptions getPanning();

  /**
   * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
   * panKey to combine zooming and panning.
   *
   * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
   * (default), panning requires two fingers. To allow panning with one
   * finger, set <code>followTouchMove</code> to <code>false</code>.
   *
   */
  @JSProperty("panning")
  void setPanning(@Nullable ChartPanningOptions value);

  /**
   * (Highcharts) Common options for all yAxes rendered in a parallel
   * coordinates plot. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   * The default options are: (see online documentation for example)
   *
   */
  @JSProperty("parallelAxes")
  @Nullable
  Unknown /* ( ChartParallelAxesOptions | Array < ChartParallelAxesOptions > ) */ getParallelAxes();

  /**
   * (Highcharts) Common options for all yAxes rendered in a parallel
   * coordinates plot. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   * The default options are: (see online documentation for example)
   *
   */
  @JSProperty("parallelAxes")
  void setParallelAxes(@Nullable ChartParallelAxesOptions value);

  /**
   * (Highcharts) Common options for all yAxes rendered in a parallel
   * coordinates plot. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   * The default options are: (see online documentation for example)
   *
   */
  @JSProperty("parallelAxes")
  void setParallelAxes(ChartParallelAxesOptions... value);

  /**
   * (Highcharts) Flag to render charts as a parallel coordinates plot. In a
   * parallel coordinates plot (||-coords) by default all required yAxes are
   * generated and the legend is disabled. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   */
  @JSProperty("parallelCoordinates")
  boolean getParallelCoordinates();

  /**
   * (Highcharts) Flag to render charts as a parallel coordinates plot. In a
   * parallel coordinates plot (||-coords) by default all required yAxes are
   * generated and the legend is disabled. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   */
  @JSProperty("parallelCoordinates")
  void setParallelCoordinates(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Equivalent to zoomType, but for multitouch
   * gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code>
   * setting. However, pinching can be enabled separately in some cases, for
   * example in stock charts where a mouse drag pans the chart, while pinching
   * is enabled. When tooltip.followTouchMove is true, pinchType only applies
   * to two-finger touches.
   *
   */
  @JSProperty("pinchType")
  @Nullable
  PinchType getPinchType();

  /**
   * (Highcharts, Highstock, Gantt) Equivalent to zoomType, but for multitouch
   * gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code>
   * setting. However, pinching can be enabled separately in some cases, for
   * example in stock charts where a mouse drag pans the chart, while pinching
   * is enabled. When tooltip.followTouchMove is true, pinchType only applies
   * to two-finger touches.
   *
   */
  @JSProperty("pinchType")
  void setPinchType(@Nullable PinchType value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the plot area.
   *
   */
  @JSProperty("plotBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getPlotBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the plot area.
   *
   */
  @JSProperty("plotBackgroundColor")
  void setPlotBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the plot area.
   *
   */
  @JSProperty("plotBackgroundColor")
  void setPlotBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the plot area.
   *
   */
  @JSProperty("plotBackgroundColor")
  void setPlotBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
   * the plot background. To set an image as the background for the entire
   * chart, set a CSS background image to the container element. Note that for
   * the image to be applied to exported charts, its URL needs to be
   * accessible by the export server.
   *
   */
  @JSProperty("plotBackgroundImage")
  @Nullable
  String getPlotBackgroundImage();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
   * the plot background. To set an image as the background for the entire
   * chart, set a CSS background image to the container element. Note that for
   * the image to be applied to exported charts, its URL needs to be
   * accessible by the export server.
   *
   */
  @JSProperty("plotBackgroundImage")
  void setPlotBackgroundImage(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
   * plot area border.
   *
   */
  @JSProperty("plotBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getPlotBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
   * plot area border.
   *
   */
  @JSProperty("plotBorderColor")
  void setPlotBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
   * plot area border.
   *
   */
  @JSProperty("plotBorderColor")
  void setPlotBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
   * plot area border.
   *
   */
  @JSProperty("plotBorderColor")
  void setPlotBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the plot area
   * border.
   *
   */
  @JSProperty("plotBorderWidth")
  double getPlotBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the plot area
   * border.
   *
   */
  @JSProperty("plotBorderWidth")
  void setPlotBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the plot area. Requires that plotBackgroundColor be set. The shadow
   * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("plotShadow")
  @Nullable
  Unknown /* ( boolean | CSSObject ) */ getPlotShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the plot area. Requires that plotBackgroundColor be set. The shadow
   * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("plotShadow")
  void setPlotShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the plot area. Requires that plotBackgroundColor be set. The shadow
   * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("plotShadow")
  void setPlotShadow(@Nullable CSSObject value);

  /**
   * (Highcharts) When true, cartesian charts like line, spline, area and
   * column are transformed into the polar coordinate system. This produces
   * <em>polar charts</em>, also known as <em>radar charts</em>.
   *
   */
  @JSProperty("polar")
  boolean getPolar();

  /**
   * (Highcharts) When true, cartesian charts like line, spline, area and
   * column are transformed into the polar coordinate system. This produces
   * <em>polar charts</em>, also known as <em>radar charts</em>.
   *
   */
  @JSProperty("polar")
  void setPolar(boolean value);

  /**
   * (Highmaps) Allows to manually load the proj4 library from Highcharts
   * options instead of the <code>window</code>. In case of loading the library from a
   * <code>script</code> tag, this option is not needed, it will be loaded from there by
   * default.
   *
   */
  @JSProperty("proj4")
  @Nullable
  JsFunction getProj4();

  /**
   * (Highmaps) Allows to manually load the proj4 library from Highcharts
   * options instead of the <code>window</code>. In case of loading the library from a
   * <code>script</code> tag, this option is not needed, it will be loaded from there by
   * default.
   *
   */
  @JSProperty("proj4")
  void setProj4(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to reflow the chart to
   * fit the width of the container div on resizing the window.
   *
   */
  @JSProperty("reflow")
  boolean getReflow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to reflow the chart to
   * fit the width of the container div on resizing the window.
   *
   */
  @JSProperty("reflow")
  void setReflow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
   * will be rendered. If it is a string, the element by that id is used. The
   * HTML element can also be passed by direct reference, or as the first
   * argument of the chart constructor, in which case the option is not
   * needed.
   *
   */
  @JSProperty("renderTo")
  @Nullable
  Unknown /* ( string | HTMLDOMElement ) */ getRenderTo();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
   * will be rendered. If it is a string, the element by that id is used. The
   * HTML element can also be passed by direct reference, or as the first
   * argument of the chart constructor, in which case the option is not
   * needed.
   *
   */
  @JSProperty("renderTo")
  void setRenderTo(@Nullable HTMLElement value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
   * will be rendered. If it is a string, the element by that id is used. The
   * HTML element can also be passed by direct reference, or as the first
   * argument of the chart constructor, in which case the option is not
   * needed.
   *
   */
  @JSProperty("renderTo")
  void setRenderTo(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
   * selection zoom, allowing the user to reset zoom.
   *
   */
  @JSProperty("resetZoomButton")
  @Nullable
  ChartResetZoomButtonOptions getResetZoomButton();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
   * selection zoom, allowing the user to reset zoom.
   *
   */
  @JSProperty("resetZoomButton")
  void setResetZoomButton(@Nullable ChartResetZoomButtonOptions value);

  /**
   * (Highcharts, Gantt) Options for a scrollable plot area. This feature
   * provides a minimum size for the plot area of the chart. If the size gets
   * smaller than this, typically on mobile devices, a native browser
   * scrollbar is presented. This scrollbar provides smooth scrolling for the
   * contents of the plot area, whereas the title, legend and unaffected axes
   * are fixed.
   *
   * Since v7.1.2, a scrollable plot area can be defined for either horizontal
   * or vertical scrolling, depending on whether the <code>minWidth</code> or <code>minHeight</code>
   * option is set.
   *
   */
  @JSProperty("scrollablePlotArea")
  @Nullable
  ChartScrollablePlotAreaOptions getScrollablePlotArea();

  /**
   * (Highcharts, Gantt) Options for a scrollable plot area. This feature
   * provides a minimum size for the plot area of the chart. If the size gets
   * smaller than this, typically on mobile devices, a native browser
   * scrollbar is presented. This scrollbar provides smooth scrolling for the
   * contents of the plot area, whereas the title, legend and unaffected axes
   * are fixed.
   *
   * Since v7.1.2, a scrollable plot area can be defined for either horizontal
   * or vertical scrolling, depending on whether the <code>minWidth</code> or <code>minHeight</code>
   * option is set.
   *
   */
  @JSProperty("scrollablePlotArea")
  void setScrollablePlotArea(@Nullable ChartScrollablePlotAreaOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * marker square when selecting (zooming in on) an area of the chart.
   *
   */
  @JSProperty("selectionMarkerFill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getSelectionMarkerFill();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * marker square when selecting (zooming in on) an area of the chart.
   *
   */
  @JSProperty("selectionMarkerFill")
  void setSelectionMarkerFill(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * marker square when selecting (zooming in on) an area of the chart.
   *
   */
  @JSProperty("selectionMarkerFill")
  void setSelectionMarkerFill(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * marker square when selecting (zooming in on) an area of the chart.
   *
   */
  @JSProperty("selectionMarkerFill")
  void setSelectionMarkerFill(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the outer chart area. Requires that backgroundColor be set. The shadow
   * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | CSSObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the outer chart area. Requires that backgroundColor be set. The shadow
   * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the outer chart area. Requires that backgroundColor be set. The shadow
   * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable CSSObject value);

  /**
   * (Highcharts, Gantt) Whether to show the axes initially. This only applies
   * to empty charts where series are added dynamically, as axes are
   * automatically added to cartesian series.
   *
   */
  @JSProperty("showAxes")
  boolean getShowAxes();

  /**
   * (Highcharts, Gantt) Whether to show the axes initially. This only applies
   * to empty charts where series are added dynamically, as axes are
   * automatically added to cartesian series.
   *
   */
  @JSProperty("showAxes")
  void setShowAxes(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The distance between the outer
   * edge of the chart and the content, like title or legend, or axis title
   * and labels if present. The numbers in the array designate top, right,
   * bottom and left respectively. Use the options spacingTop, spacingRight,
   * spacingBottom and spacingLeft options for shorthand setting of one
   * option.
   *
   */
  @JSProperty("spacing")
  @Nullable
  double[] getSpacing();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The distance between the outer
   * edge of the chart and the content, like title or legend, or axis title
   * and labels if present. The numbers in the array designate top, right,
   * bottom and left respectively. Use the options spacingTop, spacingRight,
   * spacingBottom and spacingLeft options for shorthand setting of one
   * option.
   *
   */
  @JSProperty("spacing")
  void setSpacing(double... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the bottom
   * edge of the chart and the content (plot area, axis title and labels,
   * title, subtitle or legend in top position).
   *
   */
  @JSProperty("spacingBottom")
  double getSpacingBottom();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the bottom
   * edge of the chart and the content (plot area, axis title and labels,
   * title, subtitle or legend in top position).
   *
   */
  @JSProperty("spacingBottom")
  void setSpacingBottom(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the left edge
   * of the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   */
  @JSProperty("spacingLeft")
  double getSpacingLeft();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the left edge
   * of the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   */
  @JSProperty("spacingLeft")
  void setSpacingLeft(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the right edge
   * of the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   */
  @JSProperty("spacingRight")
  double getSpacingRight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the right edge
   * of the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   */
  @JSProperty("spacingRight")
  void setSpacingRight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the top edge
   * of the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   */
  @JSProperty("spacingTop")
  double getSpacingTop();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The space between the top edge
   * of the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   */
  @JSProperty("spacingTop")
  void setSpacingTop(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional CSS styles to apply
   * inline to the container <code>div</code>. Note that since the default font styles
   * are applied in the renderer, it is ignorant of the individual chart
   * options and must be set globally.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional CSS styles to apply
   * inline to the container <code>div</code>. Note that since the default font styles
   * are applied in the renderer, it is ignorant of the individual chart
   * options and must be set globally.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply styled mode.
   * When in styled mode, no presentational attributes or CSS are applied to
   * the chart SVG. Instead, CSS rules are required to style the chart. The
   * default style sheet is available from
   * <code>https://code.highcharts.com/css/highcharts.css</code>.
   *
   */
  @JSProperty("styledMode")
  boolean getStyledMode();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply styled mode.
   * When in styled mode, no presentational attributes or CSS are applied to
   * the chart SVG. Instead, CSS rules are required to style the chart. The
   * default style sheet is available from
   * <code>https://code.highcharts.com/css/highcharts.css</code>.
   *
   */
  @JSProperty("styledMode")
  void setStyledMode(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default series type for the
   * chart. Can be any of the chart types listed under plotOptions and series
   * or can be a series provided by an additional module.
   *
   * In TypeScript this option has no effect in sense of typing and instead
   * the <code>type</code> option must always be set in the series.
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default series type for the
   * chart. Can be any of the chart types listed under plotOptions and series
   * or can be a series provided by an additional module.
   *
   * In TypeScript this option has no effect in sense of typing and instead
   * the <code>type</code> option must always be set in the series.
   *
   */
  @JSProperty("type")
  void setType(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
   * By default (when <code>null</code>) the width is calculated from the offset width of
   * the containing element.
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown /* ( number | string | null ) */ getWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
   * By default (when <code>null</code>) the width is calculated from the offset width of
   * the containing element.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
   * By default (when <code>null</code>) the width is calculated from the offset width of
   * the containing element.
   *
   */
  @JSProperty("width")
  void setWidth(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging
   * to zoom the chart. This is useful to avoid zooming while moving points.
   * Should be set different than chart.panKey.
   *
   */
  @JSProperty("zoomKey")
  @Nullable
  ZoomKey getZoomKey();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging
   * to zoom the chart. This is useful to avoid zooming while moving points.
   * Should be set different than chart.panKey.
   *
   */
  @JSProperty("zoomKey")
  void setZoomKey(@Nullable ZoomKey value);

  /**
   * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
   * zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
   *
   */
  @JSProperty("zoomType")
  @Nullable
  ZoomType getZoomType();

  /**
   * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
   * zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
   *
   */
  @JSProperty("zoomType")
  void setZoomType(@Nullable ZoomType value);

  static Builder builder() {
    return new Builder();
  }

  abstract class PanKey extends JsEnum {
    public static final PanKey ALT = JsEnum.of("alt");

    public static final PanKey CTRL = JsEnum.of("ctrl");

    public static final PanKey META = JsEnum.of("meta");

    public static final PanKey SHIFT = JsEnum.of("shift");
  }

  abstract class PinchType extends JsEnum {
    public static final PinchType X = JsEnum.of("x");

    public static final PinchType XY = JsEnum.of("xy");

    public static final PinchType Y = JsEnum.of("y");
  }

  abstract class ZoomKey extends JsEnum {
    public static final ZoomKey ALT = JsEnum.of("alt");

    public static final ZoomKey CTRL = JsEnum.of("ctrl");

    public static final ZoomKey META = JsEnum.of("meta");

    public static final ZoomKey SHIFT = JsEnum.of("shift");
  }

  abstract class ZoomType extends JsEnum {
    public static final ZoomType X = JsEnum.of("x");

    public static final ZoomType XY = JsEnum.of("xy");

    public static final ZoomType Y = JsEnum.of("y");
  }

  final class Builder {
    private final ChartOptions object = Any.empty();

    private Builder() {
    }

    public ChartOptions build() {
      return object;
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
     * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
     * all chart updating. Animation can be disabled throughout the chart by
     * setting it to false here. It can be overridden for each individual API
     * method as a function parameter. The only animation not affected by this
     * option is the initial series animation, see plotOptions.series.animation.
     *
     * The animation can either be set as a boolean or a configuration object.
     * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
     * ms. If used as a configuration object, the following properties are
     * supported:
     *
     * <ul>
     * <li>
     * <strong>duration</strong>: The duration of the animation in milliseconds.
     *
     * </li>
     * <li>
     * <strong>easing</strong>: A string reference to an easing function set on the <code>Math</code>
     * object. See the easing demo.
     *
     * </li>
     * </ul>
     * When zooming on a series with less than 100 points, the chart redraw will
     * be done with animation, but in case of more data points, it is necessary
     * to set this option to ensure animation on zoom.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
     * all chart updating. Animation can be disabled throughout the chart by
     * setting it to false here. It can be overridden for each individual API
     * method as a function parameter. The only animation not affected by this
     * option is the initial series animation, see plotOptions.series.animation.
     *
     * The animation can either be set as a boolean or a configuration object.
     * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
     * ms. If used as a configuration object, the following properties are
     * supported:
     *
     * <ul>
     * <li>
     * <strong>duration</strong>: The duration of the animation in milliseconds.
     *
     * </li>
     * <li>
     * <strong>easing</strong>: A string reference to an easing function set on the <code>Math</code>
     * object. See the easing demo.
     *
     * </li>
     * </ul>
     * When zooming on a series with less than 100 points, the chart redraw will
     * be done with animation, but in case of more data points, it is necessary
     * to set this option to ensure animation on zoom.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the outer chart area.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the outer chart area.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the outer chart area.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
     * border.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
     * border.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
     * border.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The corner radius of the outer
     * chart border.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the outer
     * chart border.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
     * charts container <code>div</code>, allowing unique CSS styling for each chart.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In styled mode, this sets how
     * many colors the class names should rotate between. With ten colors,
     * series (or points) are given class names like <code>highcharts-color-0</code>,
     * <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in
     * non-styled mode is to set colors using the colors setting.
     *
     */
    public Builder colorCount(double value) {
      object.setColorCount(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to display errors on the
     * chart. When <code>false</code>, the errors will be shown only in the console.
     *
     */
    public Builder displayErrors(boolean value) {
      object.setDisplayErrors(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
     *
     */
    public Builder events(@Nullable ChartEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
     * chart. If a <em>number</em>, the height is given in pixels. If given a
     * <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the
     * percentage of the actual chart width. This allows for preserving the
     * aspect ratio across responsive sizes.
     *
     * By default (when <code>null</code>) the height is calculated from the offset height
     * of the containing element, or 400 pixels if the containing element's
     * height is 0.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
     * chart. If a <em>number</em>, the height is given in pixels. If given a
     * <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the
     * percentage of the actual chart width. This allows for preserving the
     * aspect ratio across responsive sizes.
     *
     * By default (when <code>null</code>) the height is calculated from the offset height
     * of the containing element, or 400 pixels if the containing element's
     * height is 0.
     *
     */
    public Builder height(@Nullable String value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) If true, the axes will scale to the
     * remaining visible series once one series is hidden. If false, hiding and
     * showing a series will not affect the axes or the other series. For
     * stacks, once one series within the stack is hidden, the rest of the stack
     * will close in around it even if the axis is not affected.
     *
     */
    public Builder ignoreHiddenSeries(boolean value) {
      object.setIgnoreHiddenSeries(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
     * axis is vertical and y axis is horizontal. When <code>true</code>, the x axis is
     * reversed by default.
     *
     */
    public Builder inverted(boolean value) {
      object.setInverted(value);
      return this;
    }

    /**
     * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
     * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
     * interpreted as map data.
     *
     */
    public Builder map(Any... value) {
      object.setMap(value);
      return this;
    }

    /**
     * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
     * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
     * interpreted as map data.
     *
     */
    public Builder map(@Nullable String value) {
      object.setMap(value);
      return this;
    }

    /**
     * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
     * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
     * interpreted as map data.
     *
     */
    public Builder map(@Nullable GeoJSON value) {
      object.setMap(value);
      return this;
    }

    /**
     * (Highmaps) Set lat/lon transformation definitions for the chart. If not
     * defined, these are extracted from the map data.
     *
     */
    public Builder mapTransforms(@Nullable Any value) {
      object.setMapTransforms(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
     * edge of the chart and the plot area. The numbers in the array designate
     * top, right, bottom and left respectively. Use the options <code>marginTop</code>,
     * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
     * one option.
     *
     * By default there is no margin. The actual space is dynamically calculated
     * from the offset of axis labels, axis title, title, subtitle and legend in
     * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
     * <code>spacingLeft</code> options.
     *
     */
    public Builder margin(double... value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
     * edge of the chart and the plot area. The numbers in the array designate
     * top, right, bottom and left respectively. Use the options <code>marginTop</code>,
     * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
     * one option.
     *
     * By default there is no margin. The actual space is dynamically calculated
     * from the offset of axis labels, axis title, title, subtitle and legend in
     * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
     * <code>spacingLeft</code> options.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the bottom
     * outer edge of the chart and the plot area. Use this to set a fixed pixel
     * value for the margin as opposed to the default dynamic margin. See also
     * <code>spacingBottom</code>.
     *
     */
    public Builder marginBottom(double value) {
      object.setMarginBottom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the left
     * outer edge of the chart and the plot area. Use this to set a fixed pixel
     * value for the margin as opposed to the default dynamic margin. See also
     * <code>spacingLeft</code>.
     *
     */
    public Builder marginLeft(double value) {
      object.setMarginLeft(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the right
     * outer edge of the chart and the plot area. Use this to set a fixed pixel
     * value for the margin as opposed to the default dynamic margin. See also
     * <code>spacingRight</code>.
     *
     */
    public Builder marginRight(double value) {
      object.setMarginRight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the top outer
     * edge of the chart and the plot area. Use this to set a fixed pixel value
     * for the margin as opposed to the default dynamic margin. See also
     * <code>spacingTop</code>.
     *
     */
    public Builder marginTop(double value) {
      object.setMarginTop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback function to override
     * the default function that formats all the numbers in the chart. Returns a
     * string with the formatted number.
     *
     */
    public Builder numberFormatter(@Nullable NumberFormatterCallbackFunction value) {
      object.setNumberFormatter(value);
      return this;
    }

    /**
     * (Highcharts) Options to render charts in 3 dimensions. This feature
     * requires <code>highcharts-3d.js</code>, found in the download package or online at
     * code.highcharts.com/highcharts-3d.js.
     *
     */
    public Builder options3d(@Nullable Chart3dOptions value) {
      object.setOptions3d(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) Allows setting a key to switch between zooming and
     * panning. Can be one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and
     * Windows key on Windows) or <code>shift</code>. The keys are mapped directly to the
     * key properties of the click event argument (<code>event.altKey</code>,
     * <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).
     *
     */
    public Builder panKey(@Nullable PanKey value) {
      object.setPanKey(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
     * panKey to combine zooming and panning.
     *
     * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
     * (default), panning requires two fingers. To allow panning with one
     * finger, set <code>followTouchMove</code> to <code>false</code>.
     *
     */
    public Builder panning(@Nullable ChartPanningOptions value) {
      object.setPanning(value);
      return this;
    }

    /**
     * (Highcharts) Common options for all yAxes rendered in a parallel
     * coordinates plot. This feature requires
     * <code>modules/parallel-coordinates.js</code>.
     *
     * The default options are: (see online documentation for example)
     *
     */
    public Builder parallelAxes(@Nullable ChartParallelAxesOptions value) {
      object.setParallelAxes(value);
      return this;
    }

    /**
     * (Highcharts) Common options for all yAxes rendered in a parallel
     * coordinates plot. This feature requires
     * <code>modules/parallel-coordinates.js</code>.
     *
     * The default options are: (see online documentation for example)
     *
     */
    public Builder parallelAxes(ChartParallelAxesOptions... value) {
      object.setParallelAxes(value);
      return this;
    }

    /**
     * (Highcharts) Flag to render charts as a parallel coordinates plot. In a
     * parallel coordinates plot (||-coords) by default all required yAxes are
     * generated and the legend is disabled. This feature requires
     * <code>modules/parallel-coordinates.js</code>.
     *
     */
    public Builder parallelCoordinates(boolean value) {
      object.setParallelCoordinates(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Equivalent to zoomType, but for multitouch
     * gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code>
     * setting. However, pinching can be enabled separately in some cases, for
     * example in stock charts where a mouse drag pans the chart, while pinching
     * is enabled. When tooltip.followTouchMove is true, pinchType only applies
     * to two-finger touches.
     *
     */
    public Builder pinchType(@Nullable PinchType value) {
      object.setPinchType(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the plot area.
     *
     */
    public Builder plotBackgroundColor(@Nullable PatternObject value) {
      object.setPlotBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the plot area.
     *
     */
    public Builder plotBackgroundColor(@Nullable String value) {
      object.setPlotBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the plot area.
     *
     */
    public Builder plotBackgroundColor(@Nullable GradientColorObject value) {
      object.setPlotBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
     * the plot background. To set an image as the background for the entire
     * chart, set a CSS background image to the container element. Note that for
     * the image to be applied to exported charts, its URL needs to be
     * accessible by the export server.
     *
     */
    public Builder plotBackgroundImage(@Nullable String value) {
      object.setPlotBackgroundImage(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
     * plot area border.
     *
     */
    public Builder plotBorderColor(@Nullable PatternObject value) {
      object.setPlotBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
     * plot area border.
     *
     */
    public Builder plotBorderColor(@Nullable String value) {
      object.setPlotBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
     * plot area border.
     *
     */
    public Builder plotBorderColor(@Nullable GradientColorObject value) {
      object.setPlotBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the plot area
     * border.
     *
     */
    public Builder plotBorderWidth(double value) {
      object.setPlotBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the plot area. Requires that plotBackgroundColor be set. The shadow
     * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder plotShadow(boolean value) {
      object.setPlotShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the plot area. Requires that plotBackgroundColor be set. The shadow
     * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder plotShadow(@Nullable CSSObject value) {
      object.setPlotShadow(value);
      return this;
    }

    /**
     * (Highcharts) When true, cartesian charts like line, spline, area and
     * column are transformed into the polar coordinate system. This produces
     * <em>polar charts</em>, also known as <em>radar charts</em>.
     *
     */
    public Builder polar(boolean value) {
      object.setPolar(value);
      return this;
    }

    /**
     * (Highmaps) Allows to manually load the proj4 library from Highcharts
     * options instead of the <code>window</code>. In case of loading the library from a
     * <code>script</code> tag, this option is not needed, it will be loaded from there by
     * default.
     *
     */
    public Builder proj4(@Nullable JsFunction value) {
      object.setProj4(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to reflow the chart to
     * fit the width of the container div on resizing the window.
     *
     */
    public Builder reflow(boolean value) {
      object.setReflow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
     * will be rendered. If it is a string, the element by that id is used. The
     * HTML element can also be passed by direct reference, or as the first
     * argument of the chart constructor, in which case the option is not
     * needed.
     *
     */
    public Builder renderTo(@Nullable HTMLElement value) {
      object.setRenderTo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
     * will be rendered. If it is a string, the element by that id is used. The
     * HTML element can also be passed by direct reference, or as the first
     * argument of the chart constructor, in which case the option is not
     * needed.
     *
     */
    public Builder renderTo(@Nullable String value) {
      object.setRenderTo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
     * selection zoom, allowing the user to reset zoom.
     *
     */
    public Builder resetZoomButton(@Nullable ChartResetZoomButtonOptions value) {
      object.setResetZoomButton(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) Options for a scrollable plot area. This feature
     * provides a minimum size for the plot area of the chart. If the size gets
     * smaller than this, typically on mobile devices, a native browser
     * scrollbar is presented. This scrollbar provides smooth scrolling for the
     * contents of the plot area, whereas the title, legend and unaffected axes
     * are fixed.
     *
     * Since v7.1.2, a scrollable plot area can be defined for either horizontal
     * or vertical scrolling, depending on whether the <code>minWidth</code> or <code>minHeight</code>
     * option is set.
     *
     */
    public Builder scrollablePlotArea(@Nullable ChartScrollablePlotAreaOptions value) {
      object.setScrollablePlotArea(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
     * marker square when selecting (zooming in on) an area of the chart.
     *
     */
    public Builder selectionMarkerFill(@Nullable PatternObject value) {
      object.setSelectionMarkerFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
     * marker square when selecting (zooming in on) an area of the chart.
     *
     */
    public Builder selectionMarkerFill(@Nullable String value) {
      object.setSelectionMarkerFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
     * marker square when selecting (zooming in on) an area of the chart.
     *
     */
    public Builder selectionMarkerFill(@Nullable GradientColorObject value) {
      object.setSelectionMarkerFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the outer chart area. Requires that backgroundColor be set. The shadow
     * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the outer chart area. Requires that backgroundColor be set. The shadow
     * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable CSSObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) Whether to show the axes initially. This only applies
     * to empty charts where series are added dynamically, as axes are
     * automatically added to cartesian series.
     *
     */
    public Builder showAxes(boolean value) {
      object.setShowAxes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The distance between the outer
     * edge of the chart and the content, like title or legend, or axis title
     * and labels if present. The numbers in the array designate top, right,
     * bottom and left respectively. Use the options spacingTop, spacingRight,
     * spacingBottom and spacingLeft options for shorthand setting of one
     * option.
     *
     */
    public Builder spacing(double... value) {
      object.setSpacing(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The space between the bottom
     * edge of the chart and the content (plot area, axis title and labels,
     * title, subtitle or legend in top position).
     *
     */
    public Builder spacingBottom(double value) {
      object.setSpacingBottom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The space between the left edge
     * of the chart and the content (plot area, axis title and labels, title,
     * subtitle or legend in top position).
     *
     */
    public Builder spacingLeft(double value) {
      object.setSpacingLeft(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The space between the right edge
     * of the chart and the content (plot area, axis title and labels, title,
     * subtitle or legend in top position).
     *
     */
    public Builder spacingRight(double value) {
      object.setSpacingRight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The space between the top edge
     * of the chart and the content (plot area, axis title and labels, title,
     * subtitle or legend in top position).
     *
     */
    public Builder spacingTop(double value) {
      object.setSpacingTop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Additional CSS styles to apply
     * inline to the container <code>div</code>. Note that since the default font styles
     * are applied in the renderer, it is ignorant of the individual chart
     * options and must be set globally.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply styled mode.
     * When in styled mode, no presentational attributes or CSS are applied to
     * the chart SVG. Instead, CSS rules are required to style the chart. The
     * default style sheet is available from
     * <code>https://code.highcharts.com/css/highcharts.css</code>.
     *
     */
    public Builder styledMode(boolean value) {
      object.setStyledMode(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default series type for the
     * chart. Can be any of the chart types listed under plotOptions and series
     * or can be a series provided by an additional module.
     *
     * In TypeScript this option has no effect in sense of typing and instead
     * the <code>type</code> option must always be set in the series.
     *
     */
    public Builder type(@Nullable String value) {
      object.setType(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
     * By default (when <code>null</code>) the width is calculated from the offset width of
     * the containing element.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
     * By default (when <code>null</code>) the width is calculated from the offset width of
     * the containing element.
     *
     */
    public Builder width(@Nullable String value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging
     * to zoom the chart. This is useful to avoid zooming while moving points.
     * Should be set different than chart.panKey.
     *
     */
    public Builder zoomKey(@Nullable ZoomKey value) {
      object.setZoomKey(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
     * zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
     *
     */
    public Builder zoomType(@Nullable ZoomType value) {
      object.setZoomType(value);
      return this;
    }
  }
}
