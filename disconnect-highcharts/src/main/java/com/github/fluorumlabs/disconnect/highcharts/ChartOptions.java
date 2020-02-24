package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps) General options for the chart.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart">https://api.highcharts.com/highcharts/chart</a>
 * @see <a href="https://api.highcharts.com/highstock/chart">https://api.highcharts.com/highstock/chart</a>
 * @see <a href="https://api.highcharts.com/highmaps/chart">https://api.highcharts.com/highmaps/chart</a>
 *
 */
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.alignTicks">https://api.highcharts.com/highcharts/chart.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.alignTicks">https://api.highcharts.com/highstock/chart.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.alignTicks">https://api.highcharts.com/gantt/chart.alignTicks</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.alignTicks">https://api.highcharts.com/highcharts/chart.alignTicks</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.alignTicks">https://api.highcharts.com/highstock/chart.alignTicks</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.alignTicks">https://api.highcharts.com/gantt/chart.alignTicks</a>
   *
   * @implspec alignTicks?: boolean;
   *
   */
  @JSProperty("alignTicks")
  void setAlignTicks(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the overall animation for all chart
   * updating. Animation can be disabled throughout the chart by setting it to
   * false here. It can be overridden for each individual API method as a
   * function parameter. The only animation not affected by this option is the
   * initial series animation, see plotOptions.series.animation.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.animation">https://api.highcharts.com/highcharts/chart.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.animation">https://api.highcharts.com/highstock/chart.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.animation">https://api.highcharts.com/highmaps/chart.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps) Set the overall animation for all chart
   * updating. Animation can be disabled throughout the chart by setting it to
   * false here. It can be overridden for each individual API method as a
   * function parameter. The only animation not affected by this option is the
   * initial series animation, see plotOptions.series.animation.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.animation">https://api.highcharts.com/highcharts/chart.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.animation">https://api.highcharts.com/highstock/chart.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.animation">https://api.highcharts.com/highmaps/chart.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the overall animation for all chart
   * updating. Animation can be disabled throughout the chart by setting it to
   * false here. It can be overridden for each individual API method as a
   * function parameter. The only animation not affected by this option is the
   * initial series animation, see plotOptions.series.animation.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.animation">https://api.highcharts.com/highcharts/chart.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.animation">https://api.highcharts.com/highstock/chart.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.animation">https://api.highcharts.com/highmaps/chart.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the outer chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.backgroundColor">https://api.highcharts.com/highcharts/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.backgroundColor">https://api.highcharts.com/highstock/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.backgroundColor">https://api.highcharts.com/highmaps/chart.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the outer chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.backgroundColor">https://api.highcharts.com/highcharts/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.backgroundColor">https://api.highcharts.com/highstock/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.backgroundColor">https://api.highcharts.com/highmaps/chart.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the outer chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.backgroundColor">https://api.highcharts.com/highcharts/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.backgroundColor">https://api.highcharts.com/highstock/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.backgroundColor">https://api.highcharts.com/highmaps/chart.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the outer chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.backgroundColor">https://api.highcharts.com/highcharts/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.backgroundColor">https://api.highcharts.com/highstock/chart.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.backgroundColor">https://api.highcharts.com/highmaps/chart.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the outer chart border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.borderColor">https://api.highcharts.com/highcharts/chart.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.borderColor">https://api.highcharts.com/highstock/chart.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.borderColor">https://api.highcharts.com/highmaps/chart.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the outer chart border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.borderColor">https://api.highcharts.com/highcharts/chart.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.borderColor">https://api.highcharts.com/highstock/chart.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.borderColor">https://api.highcharts.com/highmaps/chart.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The corner radius of the outer chart
   * border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.borderRadius">https://api.highcharts.com/highcharts/chart.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.borderRadius">https://api.highcharts.com/highstock/chart.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.borderRadius">https://api.highcharts.com/highmaps/chart.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The corner radius of the outer chart
   * border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.borderRadius">https://api.highcharts.com/highcharts/chart.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.borderRadius">https://api.highcharts.com/highstock/chart.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.borderRadius">https://api.highcharts.com/highmaps/chart.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the outer chart
   * border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.borderWidth">https://api.highcharts.com/highcharts/chart.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.borderWidth">https://api.highcharts.com/highstock/chart.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.borderWidth">https://api.highcharts.com/highmaps/chart.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the outer chart
   * border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.borderWidth">https://api.highcharts.com/highcharts/chart.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.borderWidth">https://api.highcharts.com/highstock/chart.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.borderWidth">https://api.highcharts.com/highmaps/chart.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A CSS class name to apply to the charts
   * container <code>div</code>, allowing unique CSS styling for each chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.className">https://api.highcharts.com/highcharts/chart.className</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.className">https://api.highcharts.com/highstock/chart.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.className">https://api.highcharts.com/highmaps/chart.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps) A CSS class name to apply to the charts
   * container <code>div</code>, allowing unique CSS styling for each chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.className">https://api.highcharts.com/highcharts/chart.className</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.className">https://api.highcharts.com/highstock/chart.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.className">https://api.highcharts.com/highmaps/chart.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Highmaps) In styled mode, this sets how many
   * colors the class names should rotate between. With ten colors, series (or
   * points) are given class names like <code>highcharts-color-0</code>,
   * <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in
   * non-styled mode is to set colors using the colors setting.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.colorCount">https://api.highcharts.com/highcharts/chart.colorCount</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.colorCount">https://api.highcharts.com/highstock/chart.colorCount</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.colorCount">https://api.highcharts.com/highmaps/chart.colorCount</a>
   *
   * @implspec colorCount?: number;
   *
   */
  @JSProperty("colorCount")
  double getColorCount();

  /**
   * (Highcharts, Highstock, Highmaps) In styled mode, this sets how many
   * colors the class names should rotate between. With ten colors, series (or
   * points) are given class names like <code>highcharts-color-0</code>,
   * <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in
   * non-styled mode is to set colors using the colors setting.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.colorCount">https://api.highcharts.com/highcharts/chart.colorCount</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.colorCount">https://api.highcharts.com/highstock/chart.colorCount</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.colorCount">https://api.highcharts.com/highmaps/chart.colorCount</a>
   *
   * @implspec colorCount?: number;
   *
   */
  @JSProperty("colorCount")
  void setColorCount(double value);

  /**
   * (Highcharts) Alias of <code>type</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.defaultSeriesType">https://api.highcharts.com/highcharts/chart.defaultSeriesType</a>
   *
   * @implspec defaultSeriesType?: string;
   *
   */
  @JSProperty("defaultSeriesType")
  @Nullable
  String getDefaultSeriesType();

  /**
   * (Highcharts) Alias of <code>type</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.defaultSeriesType">https://api.highcharts.com/highcharts/chart.defaultSeriesType</a>
   *
   * @implspec defaultSeriesType?: string;
   *
   */
  @JSProperty("defaultSeriesType")
  void setDefaultSeriesType(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A text description of the chart.
   *
   * If the Accessibility module is loaded, this is included by default as a
   * long description of the chart and its contents in the hidden screen
   * reader information region.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.description">https://api.highcharts.com/highcharts/chart.description</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.description">https://api.highcharts.com/highstock/chart.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.description">https://api.highcharts.com/highmaps/chart.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Highmaps) A text description of the chart.
   *
   * If the Accessibility module is loaded, this is included by default as a
   * long description of the chart and its contents in the hidden screen
   * reader information region.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.description">https://api.highcharts.com/highcharts/chart.description</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.description">https://api.highcharts.com/highstock/chart.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.description">https://api.highcharts.com/highmaps/chart.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Event listeners for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events">https://api.highcharts.com/highcharts/chart.events</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events">https://api.highcharts.com/highstock/chart.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events">https://api.highcharts.com/highmaps/chart.events</a>
   *
   * @implspec events?: ChartEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  ChartEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps) Event listeners for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events">https://api.highcharts.com/highcharts/chart.events</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events">https://api.highcharts.com/highstock/chart.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events">https://api.highcharts.com/highmaps/chart.events</a>
   *
   * @implspec events?: ChartEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(ChartEventsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) An explicit height for the chart. If a
   * <em>number</em>, the height is given in pixels. If given a <em>percentage string</em>
   * (for example <code>'56%'</code>), the height is given as the percentage of the
   * actual chart width. This allows for preserving the aspect ratio across
   * responsive sizes.
   *
   * By default (when <code>null</code>) the height is calculated from the offset height
   * of the containing element, or 400 pixels if the containing element's
   * height is 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.height">https://api.highcharts.com/highcharts/chart.height</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.height">https://api.highcharts.com/highstock/chart.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.height">https://api.highcharts.com/highmaps/chart.height</a>
   *
   * @implspec height?: (number|string|null);
   *
   */
  @JSProperty("height")
  @Nullable
  Unknown getHeight();

  /**
   * (Highcharts, Highstock, Highmaps) An explicit height for the chart. If a
   * <em>number</em>, the height is given in pixels. If given a <em>percentage string</em>
   * (for example <code>'56%'</code>), the height is given as the percentage of the
   * actual chart width. This allows for preserving the aspect ratio across
   * responsive sizes.
   *
   * By default (when <code>null</code>) the height is calculated from the offset height
   * of the containing element, or 400 pixels if the containing element's
   * height is 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.height">https://api.highcharts.com/highcharts/chart.height</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.height">https://api.highcharts.com/highstock/chart.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.height">https://api.highcharts.com/highmaps/chart.height</a>
   *
   * @implspec height?: (number|string|null);
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) An explicit height for the chart. If a
   * <em>number</em>, the height is given in pixels. If given a <em>percentage string</em>
   * (for example <code>'56%'</code>), the height is given as the percentage of the
   * actual chart width. This allows for preserving the aspect ratio across
   * responsive sizes.
   *
   * By default (when <code>null</code>) the height is calculated from the offset height
   * of the containing element, or 400 pixels if the containing element's
   * height is 0.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.height">https://api.highcharts.com/highcharts/chart.height</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.height">https://api.highcharts.com/highstock/chart.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.height">https://api.highcharts.com/highmaps/chart.height</a>
   *
   * @implspec height?: (number|string|null);
   *
   */
  @JSProperty("height")
  void setHeight(String value);

  /**
   * (Highcharts, Highstock, Gantt) If true, the axes will scale to the
   * remaining visible series once one series is hidden. If false, hiding and
   * showing a series will not affect the axes or the other series. For
   * stacks, once one series within the stack is hidden, the rest of the stack
   * will close in around it even if the axis is not affected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.ignoreHiddenSeries">https://api.highcharts.com/highcharts/chart.ignoreHiddenSeries</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.ignoreHiddenSeries">https://api.highcharts.com/highstock/chart.ignoreHiddenSeries</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.ignoreHiddenSeries">https://api.highcharts.com/gantt/chart.ignoreHiddenSeries</a>
   *
   * @implspec ignoreHiddenSeries?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.ignoreHiddenSeries">https://api.highcharts.com/highcharts/chart.ignoreHiddenSeries</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.ignoreHiddenSeries">https://api.highcharts.com/highstock/chart.ignoreHiddenSeries</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.ignoreHiddenSeries">https://api.highcharts.com/gantt/chart.ignoreHiddenSeries</a>
   *
   * @implspec ignoreHiddenSeries?: boolean;
   *
   */
  @JSProperty("ignoreHiddenSeries")
  void setIgnoreHiddenSeries(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
   * axis is vertical and y axis is horizontal. When <code>true</code>, the x axis is
   * reversed by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.inverted">https://api.highcharts.com/highcharts/chart.inverted</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.inverted">https://api.highcharts.com/highstock/chart.inverted</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.inverted">https://api.highcharts.com/gantt/chart.inverted</a>
   *
   * @implspec inverted?: boolean;
   *
   */
  @JSProperty("inverted")
  boolean getInverted();

  /**
   * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
   * axis is vertical and y axis is horizontal. When <code>true</code>, the x axis is
   * reversed by default.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.inverted">https://api.highcharts.com/highcharts/chart.inverted</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.inverted">https://api.highcharts.com/highstock/chart.inverted</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.inverted">https://api.highcharts.com/gantt/chart.inverted</a>
   *
   * @implspec inverted?: boolean;
   *
   */
  @JSProperty("inverted")
  void setInverted(boolean value);

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted s map data.
   *
   * @see <a href="https://api.highcharts.com/highmaps/chart.map">https://api.highcharts.com/highmaps/chart.map</a>
   *
   * @implspec map?: (string|Array<any>);
   *
   */
  @JSProperty("map")
  @Nullable
  Unknown getMap();

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted s map data.
   *
   * @see <a href="https://api.highcharts.com/highmaps/chart.map">https://api.highcharts.com/highmaps/chart.map</a>
   *
   * @implspec map?: (string|Array<any>);
   *
   */
  @JSProperty("map")
  void setMap(Array<Any> value);

  /**
   * (Highmaps) Default <code>mapData</code> for all series. If set to a string, it
   * functions as an index into the <code>Highcharts.maps</code> array. Otherwise it is
   * interpreted s map data.
   *
   * @see <a href="https://api.highcharts.com/highmaps/chart.map">https://api.highcharts.com/highmaps/chart.map</a>
   *
   * @implspec map?: (string|Array<any>);
   *
   */
  @JSProperty("map")
  void setMap(String value);

  /**
   * (Highmaps) Set lat/lon transformation definitions for the chart. If not
   * defined, these are extracted from the map data.
   *
   * @see <a href="https://api.highcharts.com/highmaps/chart.mapTransforms">https://api.highcharts.com/highmaps/chart.mapTransforms</a>
   *
   * @implspec mapTransforms?: any;
   *
   */
  @JSProperty("mapTransforms")
  @Nullable
  Any getMapTransforms();

  /**
   * (Highmaps) Set lat/lon transformation definitions for the chart. If not
   * defined, these are extracted from the map data.
   *
   * @see <a href="https://api.highcharts.com/highmaps/chart.mapTransforms">https://api.highcharts.com/highmaps/chart.mapTransforms</a>
   *
   * @implspec mapTransforms?: any;
   *
   */
  @JSProperty("mapTransforms")
  void setMapTransforms(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the outer edge of
   * the chart and the plot area. The numbers in the array designate top,
   * right, bottom and left respectively. Use the options <code>marginTop</code>,
   * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
   * one option.
   *
   * By default there is no margin. The actual space is dynamically calculated
   * from the offset of axis labels, axis title, title, subtitle and legend in
   * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
   * <code>spacingLeft</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.margin">https://api.highcharts.com/highcharts/chart.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.margin">https://api.highcharts.com/highstock/chart.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.margin">https://api.highcharts.com/highmaps/chart.margin</a>
   *
   * @implspec margin?: (number|Array<number>);
   *
   */
  @JSProperty("margin")
  @Nullable
  Unknown getMargin();

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the outer edge of
   * the chart and the plot area. The numbers in the array designate top,
   * right, bottom and left respectively. Use the options <code>marginTop</code>,
   * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
   * one option.
   *
   * By default there is no margin. The actual space is dynamically calculated
   * from the offset of axis labels, axis title, title, subtitle and legend in
   * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
   * <code>spacingLeft</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.margin">https://api.highcharts.com/highcharts/chart.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.margin">https://api.highcharts.com/highstock/chart.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.margin">https://api.highcharts.com/highmaps/chart.margin</a>
   *
   * @implspec margin?: (number|Array<number>);
   *
   */
  @JSProperty("margin")
  void setMargin(double[] value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the outer edge of
   * the chart and the plot area. The numbers in the array designate top,
   * right, bottom and left respectively. Use the options <code>marginTop</code>,
   * <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of
   * one option.
   *
   * By default there is no margin. The actual space is dynamically calculated
   * from the offset of axis labels, axis title, title, subtitle and legend in
   * addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and
   * <code>spacingLeft</code> options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.margin">https://api.highcharts.com/highcharts/chart.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.margin">https://api.highcharts.com/highstock/chart.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.margin">https://api.highcharts.com/highmaps/chart.margin</a>
   *
   * @implspec margin?: (number|Array<number>);
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the bottom outer
   * edge of the chart and the plot area. Use this to set a fixed pixel value
   * for the margin as opposed to the default dynamic margin. See also
   * <code>spacingBottom</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginBottom">https://api.highcharts.com/highcharts/chart.marginBottom</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginBottom">https://api.highcharts.com/highstock/chart.marginBottom</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginBottom">https://api.highcharts.com/highmaps/chart.marginBottom</a>
   *
   * @implspec marginBottom?: number;
   *
   */
  @JSProperty("marginBottom")
  double getMarginBottom();

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the bottom outer
   * edge of the chart and the plot area. Use this to set a fixed pixel value
   * for the margin as opposed to the default dynamic margin. See also
   * <code>spacingBottom</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginBottom">https://api.highcharts.com/highcharts/chart.marginBottom</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginBottom">https://api.highcharts.com/highstock/chart.marginBottom</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginBottom">https://api.highcharts.com/highmaps/chart.marginBottom</a>
   *
   * @implspec marginBottom?: number;
   *
   */
  @JSProperty("marginBottom")
  void setMarginBottom(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the left outer edge
   * of the chart and the plot area. Use this to set a fixed pixel value for
   * the margin as opposed to the default dynamic margin. See also
   * <code>spacingLeft</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginLeft">https://api.highcharts.com/highcharts/chart.marginLeft</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginLeft">https://api.highcharts.com/highstock/chart.marginLeft</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginLeft">https://api.highcharts.com/highmaps/chart.marginLeft</a>
   *
   * @implspec marginLeft?: number;
   *
   */
  @JSProperty("marginLeft")
  double getMarginLeft();

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the left outer edge
   * of the chart and the plot area. Use this to set a fixed pixel value for
   * the margin as opposed to the default dynamic margin. See also
   * <code>spacingLeft</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginLeft">https://api.highcharts.com/highcharts/chart.marginLeft</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginLeft">https://api.highcharts.com/highstock/chart.marginLeft</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginLeft">https://api.highcharts.com/highmaps/chart.marginLeft</a>
   *
   * @implspec marginLeft?: number;
   *
   */
  @JSProperty("marginLeft")
  void setMarginLeft(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the right outer edge
   * of the chart and the plot area. Use this to set a fixed pixel value for
   * the margin as opposed to the default dynamic margin. See also
   * <code>spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginRight">https://api.highcharts.com/highcharts/chart.marginRight</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginRight">https://api.highcharts.com/highstock/chart.marginRight</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginRight">https://api.highcharts.com/highmaps/chart.marginRight</a>
   *
   * @implspec marginRight?: number;
   *
   */
  @JSProperty("marginRight")
  double getMarginRight();

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the right outer edge
   * of the chart and the plot area. Use this to set a fixed pixel value for
   * the margin as opposed to the default dynamic margin. See also
   * <code>spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginRight">https://api.highcharts.com/highcharts/chart.marginRight</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginRight">https://api.highcharts.com/highstock/chart.marginRight</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginRight">https://api.highcharts.com/highmaps/chart.marginRight</a>
   *
   * @implspec marginRight?: number;
   *
   */
  @JSProperty("marginRight")
  void setMarginRight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the top outer edge
   * of the chart and the plot area. Use this to set a fixed pixel value for
   * the margin as opposed to the default dynamic margin. See also
   * <code>spacingTop</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginTop">https://api.highcharts.com/highcharts/chart.marginTop</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginTop">https://api.highcharts.com/highstock/chart.marginTop</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginTop">https://api.highcharts.com/highmaps/chart.marginTop</a>
   *
   * @implspec marginTop?: number;
   *
   */
  @JSProperty("marginTop")
  double getMarginTop();

  /**
   * (Highcharts, Highstock, Highmaps) The margin between the top outer edge
   * of the chart and the plot area. Use this to set a fixed pixel value for
   * the margin as opposed to the default dynamic margin. See also
   * <code>spacingTop</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.marginTop">https://api.highcharts.com/highcharts/chart.marginTop</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.marginTop">https://api.highcharts.com/highstock/chart.marginTop</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.marginTop">https://api.highcharts.com/highmaps/chart.marginTop</a>
   *
   * @implspec marginTop?: number;
   *
   */
  @JSProperty("marginTop")
  void setMarginTop(double value);

  /**
   * (Highcharts) Options to render charts in 3 dimensions. This feature
   * requires <code>highcharts-3d.js</code>, found in the download package or online at
   * code.highcharts.com/highcharts-3d.js.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d">https://api.highcharts.com/highcharts/chart.options3d</a>
   *
   * @implspec options3d?: Chart3dOptions;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d">https://api.highcharts.com/highcharts/chart.options3d</a>
   *
   * @implspec options3d?: Chart3dOptions;
   *
   */
  @JSProperty("options3d")
  void setOptions3d(Chart3dOptions value);

  /**
   * (Highcharts, Gantt) Allows setting a key to switch between zooming and
   * panning. Can be one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and
   * Windows key on Windows) or <code>shift</code>. The keys are mapped directly to the
   * key properties of the click event argument (<code>event.altKey</code>,
   * <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.panKey">https://api.highcharts.com/highcharts/chart.panKey</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.panKey">https://api.highcharts.com/gantt/chart.panKey</a>
   *
   * @implspec panKey?: (&quot;alt&quot;|&quot;ctrl&quot;|&quot;meta&quot;|&quot;shift&quot;);
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.panKey">https://api.highcharts.com/highcharts/chart.panKey</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.panKey">https://api.highcharts.com/gantt/chart.panKey</a>
   *
   * @implspec panKey?: (&quot;alt&quot;|&quot;ctrl&quot;|&quot;meta&quot;|&quot;shift&quot;);
   *
   */
  @JSProperty("panKey")
  void setPanKey(PanKey value);

  /**
   * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
   * panKey to combine zooming and panning.
   *
   * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
   * (default), panning requires two fingers. To allow panning with one
   * finger, set <code>followTouchMove</code> to <code>false</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.panning">https://api.highcharts.com/highcharts/chart.panning</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.panning">https://api.highcharts.com/highstock/chart.panning</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.panning">https://api.highcharts.com/gantt/chart.panning</a>
   *
   * @implspec panning?: boolean;
   *
   */
  @JSProperty("panning")
  boolean getPanning();

  /**
   * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
   * panKey to combine zooming and panning.
   *
   * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
   * (default), panning requires two fingers. To allow panning with one
   * finger, set <code>followTouchMove</code> to <code>false</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.panning">https://api.highcharts.com/highcharts/chart.panning</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.panning">https://api.highcharts.com/highstock/chart.panning</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.panning">https://api.highcharts.com/gantt/chart.panning</a>
   *
   * @implspec panning?: boolean;
   *
   */
  @JSProperty("panning")
  void setPanning(boolean value);

  /**
   * (Highcharts) Common options for all yAxes rendered in a parallel
   * coordinates plot. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   * The default options are: (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes">https://api.highcharts.com/highcharts/chart.parallelAxes</a>
   *
   * @implspec parallelAxes?: ChartParallelAxesOptions;
   *
   */
  @JSProperty("parallelAxes")
  @Nullable
  ChartParallelAxesOptions getParallelAxes();

  /**
   * (Highcharts) Common options for all yAxes rendered in a parallel
   * coordinates plot. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   * The default options are: (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes">https://api.highcharts.com/highcharts/chart.parallelAxes</a>
   *
   * @implspec parallelAxes?: ChartParallelAxesOptions;
   *
   */
  @JSProperty("parallelAxes")
  void setParallelAxes(ChartParallelAxesOptions value);

  /**
   * (Highcharts) Flag to render charts as a parallel coordinates plot. In a
   * parallel coordinates plot (||-coords) by default all required yAxes are
   * generated and the legend is disabled. This feature requires
   * <code>modules/parallel-coordinates.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelCoordinates">https://api.highcharts.com/highcharts/chart.parallelCoordinates</a>
   *
   * @implspec parallelCoordinates?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelCoordinates">https://api.highcharts.com/highcharts/chart.parallelCoordinates</a>
   *
   * @implspec parallelCoordinates?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.pinchType">https://api.highcharts.com/highcharts/chart.pinchType</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.pinchType">https://api.highcharts.com/highstock/chart.pinchType</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.pinchType">https://api.highcharts.com/gantt/chart.pinchType</a>
   *
   * @implspec pinchType?: (&quot;x&quot;|&quot;xy&quot;|&quot;y&quot;);
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
   * @see <a href="https://api.highcharts.com/highcharts/chart.pinchType">https://api.highcharts.com/highcharts/chart.pinchType</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.pinchType">https://api.highcharts.com/highstock/chart.pinchType</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.pinchType">https://api.highcharts.com/gantt/chart.pinchType</a>
   *
   * @implspec pinchType?: (&quot;x&quot;|&quot;xy&quot;|&quot;y&quot;);
   *
   */
  @JSProperty("pinchType")
  void setPinchType(PinchType value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBackgroundColor">https://api.highcharts.com/highcharts/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBackgroundColor">https://api.highcharts.com/highstock/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBackgroundColor">https://api.highcharts.com/highmaps/chart.plotBackgroundColor</a>
   *
   * @implspec plotBackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("plotBackgroundColor")
  @Nullable
  Unknown getPlotBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBackgroundColor">https://api.highcharts.com/highcharts/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBackgroundColor">https://api.highcharts.com/highstock/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBackgroundColor">https://api.highcharts.com/highmaps/chart.plotBackgroundColor</a>
   *
   * @implspec plotBackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("plotBackgroundColor")
  void setPlotBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBackgroundColor">https://api.highcharts.com/highcharts/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBackgroundColor">https://api.highcharts.com/highstock/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBackgroundColor">https://api.highcharts.com/highmaps/chart.plotBackgroundColor</a>
   *
   * @implspec plotBackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("plotBackgroundColor")
  void setPlotBackgroundColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBackgroundColor">https://api.highcharts.com/highcharts/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBackgroundColor">https://api.highcharts.com/highstock/chart.plotBackgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBackgroundColor">https://api.highcharts.com/highmaps/chart.plotBackgroundColor</a>
   *
   * @implspec plotBackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("plotBackgroundColor")
  void setPlotBackgroundColor(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The URL for an image to use as the plot
   * background. To set an image as the background for the entire chart, set a
   * CSS background image to the container element. Note that for the image to
   * be applied to exported charts, its URL needs to be accessible by the
   * export server.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBackgroundImage">https://api.highcharts.com/highcharts/chart.plotBackgroundImage</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBackgroundImage">https://api.highcharts.com/highstock/chart.plotBackgroundImage</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBackgroundImage">https://api.highcharts.com/highmaps/chart.plotBackgroundImage</a>
   *
   * @implspec plotBackgroundImage?: string;
   *
   */
  @JSProperty("plotBackgroundImage")
  @Nullable
  String getPlotBackgroundImage();

  /**
   * (Highcharts, Highstock, Highmaps) The URL for an image to use as the plot
   * background. To set an image as the background for the entire chart, set a
   * CSS background image to the container element. Note that for the image to
   * be applied to exported charts, its URL needs to be accessible by the
   * export server.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBackgroundImage">https://api.highcharts.com/highcharts/chart.plotBackgroundImage</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBackgroundImage">https://api.highcharts.com/highstock/chart.plotBackgroundImage</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBackgroundImage">https://api.highcharts.com/highmaps/chart.plotBackgroundImage</a>
   *
   * @implspec plotBackgroundImage?: string;
   *
   */
  @JSProperty("plotBackgroundImage")
  void setPlotBackgroundImage(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the inner chart or plot
   * area border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBorderColor">https://api.highcharts.com/highcharts/chart.plotBorderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBorderColor">https://api.highcharts.com/highstock/chart.plotBorderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBorderColor">https://api.highcharts.com/highmaps/chart.plotBorderColor</a>
   *
   * @implspec plotBorderColor?: ColorString;
   *
   */
  @JSProperty("plotBorderColor")
  @Nullable
  String getPlotBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the inner chart or plot
   * area border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBorderColor">https://api.highcharts.com/highcharts/chart.plotBorderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBorderColor">https://api.highcharts.com/highstock/chart.plotBorderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBorderColor">https://api.highcharts.com/highmaps/chart.plotBorderColor</a>
   *
   * @implspec plotBorderColor?: ColorString;
   *
   */
  @JSProperty("plotBorderColor")
  void setPlotBorderColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the plot area
   * border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBorderWidth">https://api.highcharts.com/highcharts/chart.plotBorderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBorderWidth">https://api.highcharts.com/highstock/chart.plotBorderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBorderWidth">https://api.highcharts.com/highmaps/chart.plotBorderWidth</a>
   *
   * @implspec plotBorderWidth?: number;
   *
   */
  @JSProperty("plotBorderWidth")
  double getPlotBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the plot area
   * border.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotBorderWidth">https://api.highcharts.com/highcharts/chart.plotBorderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotBorderWidth">https://api.highcharts.com/highstock/chart.plotBorderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotBorderWidth">https://api.highcharts.com/highmaps/chart.plotBorderWidth</a>
   *
   * @implspec plotBorderWidth?: number;
   *
   */
  @JSProperty("plotBorderWidth")
  void setPlotBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * plot area. Requires that plotBackgroundColor be set. The shadow can be an
   * object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code>
   * and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotShadow">https://api.highcharts.com/highcharts/chart.plotShadow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotShadow">https://api.highcharts.com/highstock/chart.plotShadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotShadow">https://api.highcharts.com/highmaps/chart.plotShadow</a>
   *
   * @implspec plotShadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("plotShadow")
  @Nullable
  Unknown getPlotShadow();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * plot area. Requires that plotBackgroundColor be set. The shadow can be an
   * object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code>
   * and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotShadow">https://api.highcharts.com/highcharts/chart.plotShadow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotShadow">https://api.highcharts.com/highstock/chart.plotShadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotShadow">https://api.highcharts.com/highmaps/chart.plotShadow</a>
   *
   * @implspec plotShadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("plotShadow")
  void setPlotShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * plot area. Requires that plotBackgroundColor be set. The shadow can be an
   * object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code>
   * and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.plotShadow">https://api.highcharts.com/highcharts/chart.plotShadow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.plotShadow">https://api.highcharts.com/highstock/chart.plotShadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.plotShadow">https://api.highcharts.com/highmaps/chart.plotShadow</a>
   *
   * @implspec plotShadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("plotShadow")
  void setPlotShadow(CSSObject value);

  /**
   * (Highcharts) When true, cartesian charts like line, spline, area and
   * column are transformed into the polar coordinate system. This produces
   * <em>polar charts</em>, also known as <em>radar charts</em>. Requires
   * <code>highcharts-more.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.polar">https://api.highcharts.com/highcharts/chart.polar</a>
   *
   * @implspec polar?: boolean;
   *
   */
  @JSProperty("polar")
  boolean getPolar();

  /**
   * (Highcharts) When true, cartesian charts like line, spline, area and
   * column are transformed into the polar coordinate system. This produces
   * <em>polar charts</em>, also known as <em>radar charts</em>. Requires
   * <code>highcharts-more.js</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.polar">https://api.highcharts.com/highcharts/chart.polar</a>
   *
   * @implspec polar?: boolean;
   *
   */
  @JSProperty("polar")
  void setPolar(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reflow the chart to fit the
   * width of the container div on resizing the window.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.reflow">https://api.highcharts.com/highcharts/chart.reflow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.reflow">https://api.highcharts.com/highstock/chart.reflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.reflow">https://api.highcharts.com/highmaps/chart.reflow</a>
   *
   * @implspec reflow?: boolean;
   *
   */
  @JSProperty("reflow")
  boolean getReflow();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reflow the chart to fit the
   * width of the container div on resizing the window.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.reflow">https://api.highcharts.com/highcharts/chart.reflow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.reflow">https://api.highcharts.com/highstock/chart.reflow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.reflow">https://api.highcharts.com/highmaps/chart.reflow</a>
   *
   * @implspec reflow?: boolean;
   *
   */
  @JSProperty("reflow")
  void setReflow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The HTML element where the chart will
   * be rendered. If it is a string, the element by that id is used. The HTML
   * element can also be passed by direct reference, or as the first argument
   * of the chart constructor, in which case the option is not needed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.renderTo">https://api.highcharts.com/highcharts/chart.renderTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.renderTo">https://api.highcharts.com/highstock/chart.renderTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.renderTo">https://api.highcharts.com/highmaps/chart.renderTo</a>
   *
   * @implspec renderTo?: (string|SVGDOMElement);
   *
   */
  @JSProperty("renderTo")
  @Nullable
  Unknown getRenderTo();

  /**
   * (Highcharts, Highstock, Highmaps) The HTML element where the chart will
   * be rendered. If it is a string, the element by that id is used. The HTML
   * element can also be passed by direct reference, or as the first argument
   * of the chart constructor, in which case the option is not needed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.renderTo">https://api.highcharts.com/highcharts/chart.renderTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.renderTo">https://api.highcharts.com/highstock/chart.renderTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.renderTo">https://api.highcharts.com/highmaps/chart.renderTo</a>
   *
   * @implspec renderTo?: (string|SVGDOMElement);
   *
   */
  @JSProperty("renderTo")
  void setRenderTo(js.web.dom.svg.SVGElement value);

  /**
   * (Highcharts, Highstock, Highmaps) The HTML element where the chart will
   * be rendered. If it is a string, the element by that id is used. The HTML
   * element can also be passed by direct reference, or as the first argument
   * of the chart constructor, in which case the option is not needed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.renderTo">https://api.highcharts.com/highcharts/chart.renderTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.renderTo">https://api.highcharts.com/highstock/chart.renderTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.renderTo">https://api.highcharts.com/highmaps/chart.renderTo</a>
   *
   * @implspec renderTo?: (string|SVGDOMElement);
   *
   */
  @JSProperty("renderTo")
  void setRenderTo(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The button that appears after a
   * selection zoom, allowing the user to reset zoom.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton">https://api.highcharts.com/highcharts/chart.resetZoomButton</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton">https://api.highcharts.com/highstock/chart.resetZoomButton</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton">https://api.highcharts.com/highmaps/chart.resetZoomButton</a>
   *
   * @implspec resetZoomButton?: ChartResetZoomButtonOptions;
   *
   */
  @JSProperty("resetZoomButton")
  @Nullable
  ChartResetZoomButtonOptions getResetZoomButton();

  /**
   * (Highcharts, Highstock, Highmaps) The button that appears after a
   * selection zoom, allowing the user to reset zoom.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton">https://api.highcharts.com/highcharts/chart.resetZoomButton</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton">https://api.highcharts.com/highstock/chart.resetZoomButton</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton">https://api.highcharts.com/highmaps/chart.resetZoomButton</a>
   *
   * @implspec resetZoomButton?: ChartResetZoomButtonOptions;
   *
   */
  @JSProperty("resetZoomButton")
  void setResetZoomButton(ChartResetZoomButtonOptions value);

  /**
   * (Highcharts, Gantt) Options for a scrollable plot area. This feature
   * provides a minimum width for the plot area of the chart. If the width
   * gets smaller than this, typically on mobile devices, a native browser
   * scrollbar is presented below the chart. This scrollbar provides smooth
   * scrolling for the contents of the plot area, whereas the title, legend
   * and axes are fixed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea">https://api.highcharts.com/highcharts/chart.scrollablePlotArea</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea">https://api.highcharts.com/gantt/chart.scrollablePlotArea</a>
   *
   * @implspec scrollablePlotArea?: ChartScrollablePlotAreaOptions;
   *
   */
  @JSProperty("scrollablePlotArea")
  @Nullable
  ChartScrollablePlotAreaOptions getScrollablePlotArea();

  /**
   * (Highcharts, Gantt) Options for a scrollable plot area. This feature
   * provides a minimum width for the plot area of the chart. If the width
   * gets smaller than this, typically on mobile devices, a native browser
   * scrollbar is presented below the chart. This scrollbar provides smooth
   * scrolling for the contents of the plot area, whereas the title, legend
   * and axes are fixed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea">https://api.highcharts.com/highcharts/chart.scrollablePlotArea</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.scrollablePlotArea">https://api.highcharts.com/gantt/chart.scrollablePlotArea</a>
   *
   * @implspec scrollablePlotArea?: ChartScrollablePlotAreaOptions;
   *
   */
  @JSProperty("scrollablePlotArea")
  void setScrollablePlotArea(ChartScrollablePlotAreaOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color of the marker
   * square when selecting (zooming in on) an area of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.selectionMarkerFill">https://api.highcharts.com/highcharts/chart.selectionMarkerFill</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.selectionMarkerFill">https://api.highcharts.com/highstock/chart.selectionMarkerFill</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.selectionMarkerFill">https://api.highcharts.com/highmaps/chart.selectionMarkerFill</a>
   *
   * @implspec selectionMarkerFill?: ColorString;
   *
   */
  @JSProperty("selectionMarkerFill")
  @Nullable
  String getSelectionMarkerFill();

  /**
   * (Highcharts, Highstock, Highmaps) The background color of the marker
   * square when selecting (zooming in on) an area of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.selectionMarkerFill">https://api.highcharts.com/highcharts/chart.selectionMarkerFill</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.selectionMarkerFill">https://api.highcharts.com/highstock/chart.selectionMarkerFill</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.selectionMarkerFill">https://api.highcharts.com/highmaps/chart.selectionMarkerFill</a>
   *
   * @implspec selectionMarkerFill?: ColorString;
   *
   */
  @JSProperty("selectionMarkerFill")
  void setSelectionMarkerFill(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * outer chart area. Requires that backgroundColor be set. The shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.shadow">https://api.highcharts.com/highcharts/chart.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.shadow">https://api.highcharts.com/highstock/chart.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.shadow">https://api.highcharts.com/highmaps/chart.shadow</a>
   *
   * @implspec shadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * outer chart area. Requires that backgroundColor be set. The shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.shadow">https://api.highcharts.com/highcharts/chart.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.shadow">https://api.highcharts.com/highstock/chart.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.shadow">https://api.highcharts.com/highmaps/chart.shadow</a>
   *
   * @implspec shadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * outer chart area. Requires that backgroundColor be set. The shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.shadow">https://api.highcharts.com/highcharts/chart.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.shadow">https://api.highcharts.com/highstock/chart.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.shadow">https://api.highcharts.com/highmaps/chart.shadow</a>
   *
   * @implspec shadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(CSSObject value);

  /**
   * (Highcharts, Gantt) Whether to show the axes initially. This only applies
   * to empty charts where series are added dynamically, as axes are
   * automatically added to cartesian series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.showAxes">https://api.highcharts.com/highcharts/chart.showAxes</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.showAxes">https://api.highcharts.com/gantt/chart.showAxes</a>
   *
   * @implspec showAxes?: boolean;
   *
   */
  @JSProperty("showAxes")
  boolean getShowAxes();

  /**
   * (Highcharts, Gantt) Whether to show the axes initially. This only applies
   * to empty charts where series are added dynamically, as axes are
   * automatically added to cartesian series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.showAxes">https://api.highcharts.com/highcharts/chart.showAxes</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.showAxes">https://api.highcharts.com/gantt/chart.showAxes</a>
   *
   * @implspec showAxes?: boolean;
   *
   */
  @JSProperty("showAxes")
  void setShowAxes(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The distance between the outer edge of
   * the chart and the content, like title or legend, or axis title and labels
   * if present. The numbers in the array designate top, right, bottom and
   * left respectively. Use the options spacingTop, spacingRight,
   * spacingBottom and spacingLeft options for shorthand setting of one
   * option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacing">https://api.highcharts.com/highcharts/chart.spacing</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacing">https://api.highcharts.com/highstock/chart.spacing</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacing">https://api.highcharts.com/highmaps/chart.spacing</a>
   *
   * @implspec spacing?: Array<number>;
   *
   */
  @JSProperty("spacing")
  @Nullable
  double[] getSpacing();

  /**
   * (Highcharts, Highstock, Highmaps) The distance between the outer edge of
   * the chart and the content, like title or legend, or axis title and labels
   * if present. The numbers in the array designate top, right, bottom and
   * left respectively. Use the options spacingTop, spacingRight,
   * spacingBottom and spacingLeft options for shorthand setting of one
   * option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacing">https://api.highcharts.com/highcharts/chart.spacing</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacing">https://api.highcharts.com/highstock/chart.spacing</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacing">https://api.highcharts.com/highmaps/chart.spacing</a>
   *
   * @implspec spacing?: Array<number>;
   *
   */
  @JSProperty("spacing")
  void setSpacing(double[] value);

  /**
   * (Highcharts, Highstock, Highmaps) The space between the bottom edge of
   * the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingBottom">https://api.highcharts.com/highcharts/chart.spacingBottom</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingBottom">https://api.highcharts.com/highstock/chart.spacingBottom</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingBottom">https://api.highcharts.com/highmaps/chart.spacingBottom</a>
   *
   * @implspec spacingBottom?: number;
   *
   */
  @JSProperty("spacingBottom")
  double getSpacingBottom();

  /**
   * (Highcharts, Highstock, Highmaps) The space between the bottom edge of
   * the chart and the content (plot area, axis title and labels, title,
   * subtitle or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingBottom">https://api.highcharts.com/highcharts/chart.spacingBottom</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingBottom">https://api.highcharts.com/highstock/chart.spacingBottom</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingBottom">https://api.highcharts.com/highmaps/chart.spacingBottom</a>
   *
   * @implspec spacingBottom?: number;
   *
   */
  @JSProperty("spacingBottom")
  void setSpacingBottom(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The space between the left edge of the
   * chart and the content (plot area, axis title and labels, title, subtitle
   * or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingLeft">https://api.highcharts.com/highcharts/chart.spacingLeft</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingLeft">https://api.highcharts.com/highstock/chart.spacingLeft</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingLeft">https://api.highcharts.com/highmaps/chart.spacingLeft</a>
   *
   * @implspec spacingLeft?: number;
   *
   */
  @JSProperty("spacingLeft")
  double getSpacingLeft();

  /**
   * (Highcharts, Highstock, Highmaps) The space between the left edge of the
   * chart and the content (plot area, axis title and labels, title, subtitle
   * or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingLeft">https://api.highcharts.com/highcharts/chart.spacingLeft</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingLeft">https://api.highcharts.com/highstock/chart.spacingLeft</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingLeft">https://api.highcharts.com/highmaps/chart.spacingLeft</a>
   *
   * @implspec spacingLeft?: number;
   *
   */
  @JSProperty("spacingLeft")
  void setSpacingLeft(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The space between the right edge of the
   * chart and the content (plot area, axis title and labels, title, subtitle
   * or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingRight">https://api.highcharts.com/highcharts/chart.spacingRight</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingRight">https://api.highcharts.com/highstock/chart.spacingRight</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingRight">https://api.highcharts.com/highmaps/chart.spacingRight</a>
   *
   * @implspec spacingRight?: number;
   *
   */
  @JSProperty("spacingRight")
  double getSpacingRight();

  /**
   * (Highcharts, Highstock, Highmaps) The space between the right edge of the
   * chart and the content (plot area, axis title and labels, title, subtitle
   * or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingRight">https://api.highcharts.com/highcharts/chart.spacingRight</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingRight">https://api.highcharts.com/highstock/chart.spacingRight</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingRight">https://api.highcharts.com/highmaps/chart.spacingRight</a>
   *
   * @implspec spacingRight?: number;
   *
   */
  @JSProperty("spacingRight")
  void setSpacingRight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The space between the top edge of the
   * chart and the content (plot area, axis title and labels, title, subtitle
   * or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingTop">https://api.highcharts.com/highcharts/chart.spacingTop</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingTop">https://api.highcharts.com/highstock/chart.spacingTop</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingTop">https://api.highcharts.com/highmaps/chart.spacingTop</a>
   *
   * @implspec spacingTop?: number;
   *
   */
  @JSProperty("spacingTop")
  double getSpacingTop();

  /**
   * (Highcharts, Highstock, Highmaps) The space between the top edge of the
   * chart and the content (plot area, axis title and labels, title, subtitle
   * or legend in top position).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.spacingTop">https://api.highcharts.com/highcharts/chart.spacingTop</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.spacingTop">https://api.highcharts.com/highstock/chart.spacingTop</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.spacingTop">https://api.highcharts.com/highmaps/chart.spacingTop</a>
   *
   * @implspec spacingTop?: number;
   *
   */
  @JSProperty("spacingTop")
  void setSpacingTop(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Additional CSS styles to apply inline
   * to the container <code>div</code>. Note that since the default font styles are
   * applied in the renderer, it is ignorant of the individual chart options
   * and must be set globally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.style">https://api.highcharts.com/highcharts/chart.style</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.style">https://api.highcharts.com/highstock/chart.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.style">https://api.highcharts.com/highmaps/chart.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Additional CSS styles to apply inline
   * to the container <code>div</code>. Note that since the default font styles are
   * applied in the renderer, it is ignorant of the individual chart options
   * and must be set globally.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.style">https://api.highcharts.com/highcharts/chart.style</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.style">https://api.highcharts.com/highstock/chart.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.style">https://api.highcharts.com/highmaps/chart.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The default series type for the chart.
   * Can be any of the chart types listed under plotOptions.
   *
   * This property has no effect in TypeScript. Instead you always have to set
   * the <code>type</code> option in plotOptions and series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.type">https://api.highcharts.com/highcharts/chart.type</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.type">https://api.highcharts.com/highstock/chart.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.type">https://api.highcharts.com/highmaps/chart.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * (Highcharts, Highstock, Highmaps) The default series type for the chart.
   * Can be any of the chart types listed under plotOptions.
   *
   * This property has no effect in TypeScript. Instead you always have to set
   * the <code>type</code> option in plotOptions and series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.type">https://api.highcharts.com/highcharts/chart.type</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.type">https://api.highcharts.com/highstock/chart.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.type">https://api.highcharts.com/highmaps/chart.type</a>
   *
   * @implspec type?: string;
   *
   */
  @JSProperty("type")
  void setType(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A text description of the chart type.
   *
   * If the Accessibility module is loaded, this will be included in the
   * description of the chart in the screen reader information region.
   *
   * Highcharts will by default attempt to guess the chart type, but for more
   * complex charts it is recommended to specify this property for clarity.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.typeDescription">https://api.highcharts.com/highcharts/chart.typeDescription</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.typeDescription">https://api.highcharts.com/highstock/chart.typeDescription</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.typeDescription">https://api.highcharts.com/highmaps/chart.typeDescription</a>
   *
   * @implspec typeDescription?: string;
   *
   */
  @JSProperty("typeDescription")
  @Nullable
  String getTypeDescription();

  /**
   * (Highcharts, Highstock, Highmaps) A text description of the chart type.
   *
   * If the Accessibility module is loaded, this will be included in the
   * description of the chart in the screen reader information region.
   *
   * Highcharts will by default attempt to guess the chart type, but for more
   * complex charts it is recommended to specify this property for clarity.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.typeDescription">https://api.highcharts.com/highcharts/chart.typeDescription</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.typeDescription">https://api.highcharts.com/highstock/chart.typeDescription</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.typeDescription">https://api.highcharts.com/highmaps/chart.typeDescription</a>
   *
   * @implspec typeDescription?: string;
   *
   */
  @JSProperty("typeDescription")
  void setTypeDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An explicit width for the chart. By
   * default (when <code>null</code>) the width is calculated from the offset width of
   * the containing element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.width">https://api.highcharts.com/highcharts/chart.width</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.width">https://api.highcharts.com/highstock/chart.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.width">https://api.highcharts.com/highmaps/chart.width</a>
   *
   * @implspec width?: (number|null);
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) An explicit width for the chart. By
   * default (when <code>null</code>) the width is calculated from the offset width of
   * the containing element.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.width">https://api.highcharts.com/highcharts/chart.width</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.width">https://api.highcharts.com/highstock/chart.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.width">https://api.highcharts.com/highmaps/chart.width</a>
   *
   * @implspec width?: (number|null);
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Set a key to hold when dragging to zoom
   * the chart. Requires the draggable-points module. This is useful to avoid
   * zooming while moving points. Should be set different than chart.panKey.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.zoomKey">https://api.highcharts.com/highcharts/chart.zoomKey</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.zoomKey">https://api.highcharts.com/highstock/chart.zoomKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.zoomKey">https://api.highcharts.com/highmaps/chart.zoomKey</a>
   *
   * @implspec zoomKey?: (&quot;alt&quot;|&quot;ctrl&quot;|&quot;meta&quot;|&quot;shift&quot;);
   *
   */
  @JSProperty("zoomKey")
  @Nullable
  ZoomKey getZoomKey();

  /**
   * (Highcharts, Highstock, Highmaps) Set a key to hold when dragging to zoom
   * the chart. Requires the draggable-points module. This is useful to avoid
   * zooming while moving points. Should be set different than chart.panKey.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.zoomKey">https://api.highcharts.com/highcharts/chart.zoomKey</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.zoomKey">https://api.highcharts.com/highstock/chart.zoomKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.zoomKey">https://api.highcharts.com/highmaps/chart.zoomKey</a>
   *
   * @implspec zoomKey?: (&quot;alt&quot;|&quot;ctrl&quot;|&quot;meta&quot;|&quot;shift&quot;);
   *
   */
  @JSProperty("zoomKey")
  void setZoomKey(ZoomKey value);

  /**
   * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
   * zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.zoomType">https://api.highcharts.com/highcharts/chart.zoomType</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.zoomType">https://api.highcharts.com/highstock/chart.zoomType</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.zoomType">https://api.highcharts.com/gantt/chart.zoomType</a>
   *
   * @implspec zoomType?: (&quot;x&quot;|&quot;xy&quot;|&quot;y&quot;);
   *
   */
  @JSProperty("zoomType")
  @Nullable
  ZoomType getZoomType();

  /**
   * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
   * zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.zoomType">https://api.highcharts.com/highcharts/chart.zoomType</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.zoomType">https://api.highcharts.com/highstock/chart.zoomType</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.zoomType">https://api.highcharts.com/gantt/chart.zoomType</a>
   *
   * @implspec zoomType?: (&quot;x&quot;|&quot;xy&quot;|&quot;y&quot;);
   *
   */
  @JSProperty("zoomType")
  void setZoomType(ZoomType value);

  /**
   */
  abstract class PanKey extends JsEnum {
    public static final PanKey ALT = JsEnum.of("alt");

    public static final PanKey CTRL = JsEnum.of("ctrl");

    public static final PanKey META = JsEnum.of("meta");

    public static final PanKey SHIFT = JsEnum.of("shift");
  }

  /**
   */
  abstract class PinchType extends JsEnum {
    public static final PinchType X = JsEnum.of("x");

    public static final PinchType XY = JsEnum.of("xy");

    public static final PinchType Y = JsEnum.of("y");
  }

  /**
   */
  abstract class ZoomKey extends JsEnum {
    public static final ZoomKey ALT = JsEnum.of("alt");

    public static final ZoomKey CTRL = JsEnum.of("ctrl");

    public static final ZoomKey META = JsEnum.of("meta");

    public static final ZoomKey SHIFT = JsEnum.of("shift");
  }

  /**
   */
  abstract class ZoomType extends JsEnum {
    public static final ZoomType X = JsEnum.of("x");

    public static final ZoomType XY = JsEnum.of("xy");

    public static final ZoomType Y = JsEnum.of("y");
  }
}
