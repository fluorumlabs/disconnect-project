package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The axis labels show the number or category for each tick.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels">https://api.highcharts.com/highcharts/chart.parallelAxes.labels</a>
 *
 */
public interface ChartParallelAxesLabelsOptions extends Any {
  /**
   * (Highcharts) What part of the string the given position is anchored to.
   * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The exact position also
   * depends on the <code>labels.x</code> setting.
   *
   * Angular gauges and solid gauges defaults to <code>center</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.align">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts) What part of the string the given position is anchored to.
   * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The exact position also
   * depends on the <code>labels.x</code> setting.
   *
   * Angular gauges and solid gauges defaults to <code>center</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.align">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotation">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.labels.autoRotation">https://api.highcharts.com/highstock/chart.parallelAxes.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotation">https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotation</a>
   *
   * @implspec autoRotation?: Array<number>;
   *
   */
  @JSProperty("autoRotation")
  @Nullable
  double[] getAutoRotation();

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotation">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.labels.autoRotation">https://api.highcharts.com/highstock/chart.parallelAxes.labels.autoRotation</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotation">https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotation</a>
   *
   * @implspec autoRotation?: Array<number>;
   *
   */
  @JSProperty("autoRotation")
  void setAutoRotation(double[] value);

  /**
   * (Highcharts, Gantt) When each category width is more than this many
   * pixels, we don't apply auto rotation. Instead, we lay out the axis label
   * with word wrap. A lower limit makes sense when the label contains
   * multiple short words that don't extend the available horizontal space for
   * each label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotationLimit">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotationLimit</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotationLimit">https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotationLimit</a>
   *
   * @implspec autoRotationLimit?: number;
   *
   */
  @JSProperty("autoRotationLimit")
  double getAutoRotationLimit();

  /**
   * (Highcharts, Gantt) When each category width is more than this many
   * pixels, we don't apply auto rotation. Instead, we lay out the axis label
   * with word wrap. A lower limit makes sense when the label contains
   * multiple short words that don't extend the available horizontal space for
   * each label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotationLimit">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.autoRotationLimit</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotationLimit">https://api.highcharts.com/gantt/chart.parallelAxes.labels.autoRotationLimit</a>
   *
   * @implspec autoRotationLimit?: number;
   *
   */
  @JSProperty("autoRotationLimit")
  void setAutoRotationLimit(double value);

  /**
   * (Highcharts) Angular gauges and solid gauges only. The label's pixel
   * distance from the perimeter of the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.distance">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highcharts) Angular gauges and solid gauges only. The label's pixel
   * distance from the perimeter of the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.distance">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.distance</a>
   *
   * @implspec distance?: number;
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts) Enable or disable the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.enabled">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Enable or disable the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.enabled">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) A format string for the axis label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.format">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts) A format string for the axis label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.format">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.format</a>
   *
   * @implspec format?: string;
   *
   */
  @JSProperty("format")
  void setFormat(String value);

  /**
   * (Highcharts) Callback JavaScript function to format the label. The value
   * is given by <code>this.value</code>. Additional properties for <code>this</code> are <code>axis</code>,
   * <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label formatter
   * can be retrieved by calling <code>this.axis.defaultLabelFormatter.call(this)</code>
   * within the function.
   *
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.formatter">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<AxisLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<AxisLabelsFormatterContextObject> getFormatter();

  /**
   * (Highcharts) Callback JavaScript function to format the label. The value
   * is given by <code>this.value</code>. Additional properties for <code>this</code> are <code>axis</code>,
   * <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label formatter
   * can be retrieved by calling <code>this.axis.defaultLabelFormatter.call(this)</code>
   * within the function.
   *
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.formatter">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<AxisLabelsFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<AxisLabelsFormatterContextObject> value);

  /**
   * (Gantt) The number of pixels to indent the labels per level in a treegrid
   * axis.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.indentation">https://api.highcharts.com/gantt/chart.parallelAxes.labels.indentation</a>
   *
   * @implspec indentation?: number;
   *
   */
  @JSProperty("indentation")
  double getIndentation();

  /**
   * (Gantt) The number of pixels to indent the labels per level in a treegrid
   * axis.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.indentation">https://api.highcharts.com/gantt/chart.parallelAxes.labels.indentation</a>
   *
   * @implspec indentation?: number;
   *
   */
  @JSProperty("indentation")
  void setIndentation(double value);

  /**
   * (Gantt) Set options on specific levels in a tree grid axis. Takes
   * precedence over labels options.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.levels">https://api.highcharts.com/gantt/chart.parallelAxes.labels.levels</a>
   *
   * @implspec levels?: Array<ChartParallelAxesLabelsLevelsOptions>;
   *
   */
  @JSProperty("levels")
  @Nullable
  Array<ChartParallelAxesLabelsLevelsOptions> getLevels();

  /**
   * (Gantt) Set options on specific levels in a tree grid axis. Takes
   * precedence over labels options.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.levels">https://api.highcharts.com/gantt/chart.parallelAxes.labels.levels</a>
   *
   * @implspec levels?: Array<ChartParallelAxesLabelsLevelsOptions>;
   *
   */
  @JSProperty("levels")
  void setLevels(Array<ChartParallelAxesLabelsLevelsOptions> value);

  /**
   * (Highcharts) Horizontal axis only. When <code>staggerLines</code> is not set,
   * <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to
   * automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap
   * detection.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.maxStaggerLines">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.maxStaggerLines</a>
   *
   * @implspec maxStaggerLines?: number;
   *
   */
  @JSProperty("maxStaggerLines")
  double getMaxStaggerLines();

  /**
   * (Highcharts) Horizontal axis only. When <code>staggerLines</code> is not set,
   * <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to
   * automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap
   * detection.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.maxStaggerLines">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.maxStaggerLines</a>
   *
   * @implspec maxStaggerLines?: number;
   *
   */
  @JSProperty("maxStaggerLines")
  void setMaxStaggerLines(double value);

  /**
   * (Highcharts) How to handle overflowing labels on horizontal axis. If set
   * to <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it <code>&quot;justify&quot;</code>
   * labels inside the chart area. If there is room to move it, it will be
   * aligned to the edge, else it will be removed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.overflow">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts) How to handle overflowing labels on horizontal axis. If set
   * to <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it <code>&quot;justify&quot;</code>
   * labels inside the chart area. If there is room to move it, it will be
   * aligned to the edge, else it will be removed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.overflow">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.overflow</a>
   *
   * @implspec overflow?: (&quot;allow&quot;|&quot;justify&quot;);
   *
   */
  @JSProperty("overflow")
  void setOverflow(Overflow value);

  /**
   * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
   * space between them.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.padding">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.padding</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.padding">https://api.highcharts.com/gantt/chart.parallelAxes.labels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
   * space between them.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.padding">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.padding</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.padding">https://api.highcharts.com/gantt/chart.parallelAxes.labels.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts) Defines how the labels are be repositioned according to the
   * 3D chart orientation.
   *
   * <ul>
   * <li>
   * <code>'offset'</code>: Maintain a fixed horizontal/vertical distance from the tick
   * marks, despite the chart orientation. This is the backwards compatible
   * behavior, and causes skewing of X and Z axes.
   *
   * </li>
   * <li>
   * <code>'chart'</code>: Preserve 3D position relative to the chart. This looks nice,
   * but hard to read if the text isn't forward-facing.
   *
   * </li>
   * <li>
   * <code>'flap'</code>: Rotated text along the axis to compensate for the chart
   * orientation. This tries to maintain text as legible as possible on all
   * orientations.
   *
   * </li>
   * <li>
   * <code>'ortho'</code>: Rotated text along the axis direction so that the labels are
   * orthogonal to the axis. This is very similar to <code>'flap'</code>, but prevents
   * skewing the labels (X and Y scaling are still present).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.position3d">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.position3d</a>
   *
   * @implspec position3d?: (&quot;chart&quot;|&quot;flap&quot;|&quot;offset&quot;|&quot;ortho&quot;);
   *
   */
  @JSProperty("position3d")
  @Nullable
  Position3d getPosition3d();

  /**
   * (Highcharts) Defines how the labels are be repositioned according to the
   * 3D chart orientation.
   *
   * <ul>
   * <li>
   * <code>'offset'</code>: Maintain a fixed horizontal/vertical distance from the tick
   * marks, despite the chart orientation. This is the backwards compatible
   * behavior, and causes skewing of X and Z axes.
   *
   * </li>
   * <li>
   * <code>'chart'</code>: Preserve 3D position relative to the chart. This looks nice,
   * but hard to read if the text isn't forward-facing.
   *
   * </li>
   * <li>
   * <code>'flap'</code>: Rotated text along the axis to compensate for the chart
   * orientation. This tries to maintain text as legible as possible on all
   * orientations.
   *
   * </li>
   * <li>
   * <code>'ortho'</code>: Rotated text along the axis direction so that the labels are
   * orthogonal to the axis. This is very similar to <code>'flap'</code>, but prevents
   * skewing the labels (X and Y scaling are still present).
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.position3d">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.position3d</a>
   *
   * @implspec position3d?: (&quot;chart&quot;|&quot;flap&quot;|&quot;offset&quot;|&quot;ortho&quot;);
   *
   */
  @JSProperty("position3d")
  void setPosition3d(Position3d value);

  /**
   * (Highcharts, Gantt) Whether to reserve space for the labels. By default,
   * space is reserved for the labels in these cases:
   *
   * <ul>
   * <li>
   * On all horizontal axes.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>right</code> on a left-side axis or
   * <code>left</code> on a right-side axis.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>center</code>.
   *
   * </li>
   * </ul>
   * This can be turned off when for example the labels are rendered inside
   * the plot area instead of outside.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.reserveSpace">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.reserveSpace">https://api.highcharts.com/gantt/chart.parallelAxes.labels.reserveSpace</a>
   *
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  boolean getReserveSpace();

  /**
   * (Highcharts, Gantt) Whether to reserve space for the labels. By default,
   * space is reserved for the labels in these cases:
   *
   * <ul>
   * <li>
   * On all horizontal axes.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>right</code> on a left-side axis or
   * <code>left</code> on a right-side axis.
   *
   * </li>
   * <li>
   * On vertical axes if <code>label.align</code> is <code>center</code>.
   *
   * </li>
   * </ul>
   * This can be turned off when for example the labels are rendered inside
   * the plot area instead of outside.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.reserveSpace">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.reserveSpace</a>
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.reserveSpace">https://api.highcharts.com/gantt/chart.parallelAxes.labels.reserveSpace</a>
   *
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  /**
   * (Highcharts) Rotation of the labels in degrees.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.rotation">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts) Rotation of the labels in degrees.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.rotation">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) If enabled, the axis labels will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>labels.position3d</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.skew3d">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.skew3d</a>
   *
   * @implspec skew3d?: boolean;
   *
   */
  @JSProperty("skew3d")
  boolean getSkew3d();

  /**
   * (Highcharts) If enabled, the axis labels will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>labels.position3d</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.skew3d">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.skew3d</a>
   *
   * @implspec skew3d?: boolean;
   *
   */
  @JSProperty("skew3d")
  void setSkew3d(boolean value);

  /**
   * (Highcharts) Horizontal axes only. The number of lines to spread the
   * labels over to make room or tighter labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.staggerLines">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.staggerLines</a>
   *
   * @implspec staggerLines?: number;
   *
   */
  @JSProperty("staggerLines")
  double getStaggerLines();

  /**
   * (Highcharts) Horizontal axes only. The number of lines to spread the
   * labels over to make room or tighter labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.staggerLines">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.staggerLines</a>
   *
   * @implspec staggerLines?: number;
   *
   */
  @JSProperty("staggerLines")
  void setStaggerLines(double value);

  /**
   * (Highcharts) To show only every <em>n</em>'th label on the axis, set the step to
   * <em>n</em>. Setting the step to 2 shows every other label.
   *
   * By default, the step is calculated automatically to avoid overlap. To
   * prevent this, set it to 1. This usually only happens on a category axis,
   * and is often a sign that you have chosen the wrong axis type.
   *
   * Read more at Axis docs =&gt; What axis should I use?
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.step">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.step</a>
   *
   * @implspec step?: number;
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * (Highcharts) To show only every <em>n</em>'th label on the axis, set the step to
   * <em>n</em>. Setting the step to 2 shows every other label.
   *
   * By default, the step is calculated automatically to avoid overlap. To
   * prevent this, set it to 1. This usually only happens on a category axis,
   * and is often a sign that you have chosen the wrong axis type.
   *
   * Read more at Axis docs =&gt; What axis should I use?
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.step">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.step</a>
   *
   * @implspec step?: number;
   *
   */
  @JSProperty("step")
  void setStep(double value);

  /**
   * (Highcharts) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to
   * prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to
   * prevent ellipsis (dots).
   *
   * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.style">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to
   * prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to
   * prevent ellipsis (dots).
   *
   * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.style">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Gantt) The symbol for the collapse and expand icon in a treegrid.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.symbol">https://api.highcharts.com/gantt/chart.parallelAxes.labels.symbol</a>
   *
   * @implspec symbol?: ChartParallelAxesLabelsSymbolOptions;
   *
   */
  @JSProperty("symbol")
  @Nullable
  ChartParallelAxesLabelsSymbolOptions getSymbol();

  /**
   * (Gantt) The symbol for the collapse and expand icon in a treegrid.
   *
   * @see <a href="https://api.highcharts.com/gantt/chart.parallelAxes.labels.symbol">https://api.highcharts.com/gantt/chart.parallelAxes.labels.symbol</a>
   *
   * @implspec symbol?: ChartParallelAxesLabelsSymbolOptions;
   *
   */
  @JSProperty("symbol")
  void setSymbol(ChartParallelAxesLabelsSymbolOptions value);

  /**
   * (Highcharts) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.useHTML">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts) Whether to use HTML to render the labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.useHTML">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts) The x position offset of the label relative to the tick
   * position on the axis. Defaults to -15 for left axis, 15 for right axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.x">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts) The x position offset of the label relative to the tick
   * position on the axis. Defaults to -15 for left axis, 15 for right axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.x">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts) The y position offset of the label relative to the tick
   * position on the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.y">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts) The y position offset of the label relative to the tick
   * position on the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.y">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts) The Z index for the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.zIndex">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts) The Z index for the axis labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.labels.zIndex">https://api.highcharts.com/highcharts/chart.parallelAxes.labels.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align CENTER = JsEnum.of("center");

    public static final Align LEFT = JsEnum.of("left");

    public static final Align RIGHT = JsEnum.of("right");
  }

  /**
   */
  abstract class Overflow extends JsEnum {
    public static final Overflow ALLOW = JsEnum.of("allow");

    public static final Overflow JUSTIFY = JsEnum.of("justify");
  }

  /**
   */
  abstract class Position3d extends JsEnum {
    public static final Position3d CHART = JsEnum.of("chart");

    public static final Position3d FLAP = JsEnum.of("flap");

    public static final Position3d OFFSET = JsEnum.of("offset");

    public static final Position3d ORTHO = JsEnum.of("ortho");
  }
}
