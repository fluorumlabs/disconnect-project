package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( false | Array < number > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) The axis labels show the number or category for each tick.
 *
 * Since v8.0.0: Labels are animated in categorized x-axis with updating data if
 * <code>tickInterval</code> and <code>step</code> is set to 1.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorXAxisLabelsOptions extends Any {
  /**
   * (Highstock, Gantt) What part of the string the given position is anchored
   * to. If <code>left</code>, the left side of the string is at the axis position. Can
   * be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to an intelligent
   * guess based on which side of the chart the axis is on and the rotation of
   * the label.
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * (Highstock, Gantt) What part of the string the given position is anchored
   * to. If <code>left</code>, the left side of the string is at the axis position. Can
   * be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to an intelligent
   * guess based on which side of the chart the axis is on and the rotation of
   * the label.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   */
  @JSProperty("autoRotation")
  @Nullable
  Unknown /* ( false | Array < number > ) */ getAutoRotation();

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   */
  @JSProperty("autoRotation")
  void setAutoRotation(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
   * of label rotation to prevent overlapping labels. If there is enough
   * space, labels are not rotated. As the chart gets narrower, it will start
   * rotating the labels -45 degrees, then remove every second label and try
   * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
   * rotation, which will cause the labels to word-wrap if possible.
   *
   */
  @JSProperty("autoRotation")
  void setAutoRotation(double... value);

  /**
   * (Highcharts, Gantt) When each category width is more than this many
   * pixels, we don't apply auto rotation. Instead, we lay out the axis label
   * with word wrap. A lower limit makes sense when the label contains
   * multiple short words that don't extend the available horizontal space for
   * each label.
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
   */
  @JSProperty("autoRotationLimit")
  void setAutoRotationLimit(double value);

  /**
   * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
   * the perimeter of the plot area.
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
   * the perimeter of the plot area.
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highstock, Gantt) Enable or disable the axis labels.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock, Gantt) Enable or disable the axis labels.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock, Gantt) A format string for the axis label.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highstock, Gantt) A format string for the axis label.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highstock, Gantt) Callback JavaScript function to format the label. The
   * value is given by <code>this.value</code>. Additional properties for <code>this</code> are
   * <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label
   * formatter can be retrieved by calling
   * <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("formatter")
  @Nullable
  AxisLabelsFormatterCallbackFunction getFormatter();

  /**
   * (Highstock, Gantt) Callback JavaScript function to format the label. The
   * value is given by <code>this.value</code>. Additional properties for <code>this</code> are
   * <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label
   * formatter can be retrieved by calling
   * <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable AxisLabelsFormatterCallbackFunction value);

  /**
   * (Gantt) The number of pixels to indent the labels per level in a treegrid
   * axis.
   *
   */
  @JSProperty("indentation")
  double getIndentation();

  /**
   * (Gantt) The number of pixels to indent the labels per level in a treegrid
   * axis.
   *
   */
  @JSProperty("indentation")
  void setIndentation(double value);

  /**
   * (Highstock, Gantt) How to handle overflowing labels on horizontal axis.
   * If set to <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it
   * <code>&quot;justify&quot;</code> labels inside the chart area. If there is room to move it, it
   * will be aligned to the edge, else it will be removed.
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highstock, Gantt) How to handle overflowing labels on horizontal axis.
   * If set to <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it
   * <code>&quot;justify&quot;</code> labels inside the chart area. If there is room to move it, it
   * will be aligned to the edge, else it will be removed.
   *
   */
  @JSProperty("overflow")
  void setOverflow(@Nullable Overflow value);

  /**
   * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
   * space between them.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
   * space between them.
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
   */
  @JSProperty("position3d")
  void setPosition3d(@Nullable Position3d value);

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
   */
  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  /**
   * (Highstock, Gantt) Rotation of the labels in degrees.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highstock, Gantt) Rotation of the labels in degrees.
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
   */
  @JSProperty("skew3d")
  void setSkew3d(boolean value);

  /**
   * (Highstock, Gantt) Horizontal axes only. The number of lines to spread
   * the labels over to make room or tighter labels.
   *
   */
  @JSProperty("staggerLines")
  double getStaggerLines();

  /**
   * (Highstock, Gantt) Horizontal axes only. The number of lines to spread
   * the labels over to make room or tighter labels.
   *
   */
  @JSProperty("staggerLines")
  void setStaggerLines(double value);

  /**
   * (Highstock, Gantt) To show only every <em>n</em>'th label on the axis, set the
   * step to <em>n</em>. Setting the step to 2 shows every other label.
   *
   * By default, the step is calculated automatically to avoid overlap. To
   * prevent this, set it to 1. This usually only happens on a category axis,
   * and is often a sign that you have chosen the wrong axis type.
   *
   * Read more at Axis docs =&gt; What axis should I use?
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * (Highstock, Gantt) To show only every <em>n</em>'th label on the axis, set the
   * step to <em>n</em>. Setting the step to 2 shows every other label.
   *
   * By default, the step is calculated automatically to avoid overlap. To
   * prevent this, set it to 1. This usually only happens on a category axis,
   * and is often a sign that you have chosen the wrong axis type.
   *
   * Read more at Axis docs =&gt; What axis should I use?
   *
   */
  @JSProperty("step")
  void setStep(double value);

  /**
   * (Highstock, Gantt) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code>
   * to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to
   * prevent ellipsis (dots).
   *
   * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
   * class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highstock, Gantt) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code>
   * to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to
   * prevent ellipsis (dots).
   *
   * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
   * class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highstock, Gantt) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highstock, Gantt) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highstock, Gantt) The x position offset of the label relative to the
   * tick position on the axis.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock, Gantt) The x position offset of the label relative to the
   * tick position on the axis.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock, Gantt) The y position offset of the label relative to the
   * tick position on the axis. The default makes it adapt to the font size on
   * bottom axis.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock, Gantt) The y position offset of the label relative to the
   * tick position on the axis. The default makes it adapt to the font size on
   * bottom axis.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highstock, Gantt) The Z index for the axis labels.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highstock, Gantt) The Z index for the axis labels.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigatorXAxisLabelsOptions object = Any.empty();

    private Builder() {
    }

    public NavigatorXAxisLabelsOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) What part of the string the given position is anchored
     * to. If <code>left</code>, the left side of the string is at the axis position. Can
     * be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to an intelligent
     * guess based on which side of the chart the axis is on and the rotation of
     * the label.
     *
     */
    public Builder align(@Nullable String value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
     * of label rotation to prevent overlapping labels. If there is enough
     * space, labels are not rotated. As the chart gets narrower, it will start
     * rotating the labels -45 degrees, then remove every second label and try
     * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
     * rotation, which will cause the labels to word-wrap if possible.
     *
     */
    public Builder autoRotation(boolean value) {
      object.setAutoRotation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
     * of label rotation to prevent overlapping labels. If there is enough
     * space, labels are not rotated. As the chart gets narrower, it will start
     * rotating the labels -45 degrees, then remove every second label and try
     * again with rotations 0 and -45 etc. Set it to <code>false</code> to disable
     * rotation, which will cause the labels to word-wrap if possible.
     *
     */
    public Builder autoRotation(double... value) {
      object.setAutoRotation(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) When each category width is more than this many
     * pixels, we don't apply auto rotation. Instead, we lay out the axis label
     * with word wrap. A lower limit makes sense when the label contains
     * multiple short words that don't extend the available horizontal space for
     * each label.
     *
     */
    public Builder autoRotationLimit(double value) {
      object.setAutoRotationLimit(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
     * the perimeter of the plot area.
     *
     */
    public Builder distance(double value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Enable or disable the axis labels.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) A format string for the axis label.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Callback JavaScript function to format the label. The
     * value is given by <code>this.value</code>. Additional properties for <code>this</code> are
     * <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label
     * formatter can be retrieved by calling
     * <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.
     *
     * Defaults to: (see online documentation for example)
     *
     */
    public Builder formatter(@Nullable AxisLabelsFormatterCallbackFunction value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Gantt) The number of pixels to indent the labels per level in a treegrid
     * axis.
     *
     */
    public Builder indentation(double value) {
      object.setIndentation(value);
      return this;
    }

    /**
     * (Highstock, Gantt) How to handle overflowing labels on horizontal axis.
     * If set to <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it
     * <code>&quot;justify&quot;</code> labels inside the chart area. If there is room to move it, it
     * will be aligned to the edge, else it will be removed.
     *
     */
    public Builder overflow(@Nullable Overflow value) {
      object.setOverflow(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
     * space between them.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

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
     */
    public Builder position3d(@Nullable Position3d value) {
      object.setPosition3d(value);
      return this;
    }

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
     */
    public Builder reserveSpace(boolean value) {
      object.setReserveSpace(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Rotation of the labels in degrees.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts) If enabled, the axis labels will skewed to follow the
     * perspective.
     *
     * This will fix overlapping labels and titles, but texts become less
     * legible due to the distortion.
     *
     * The final appearance depends heavily on <code>labels.position3d</code>.
     *
     */
    public Builder skew3d(boolean value) {
      object.setSkew3d(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Horizontal axes only. The number of lines to spread
     * the labels over to make room or tighter labels.
     *
     */
    public Builder staggerLines(double value) {
      object.setStaggerLines(value);
      return this;
    }

    /**
     * (Highstock, Gantt) To show only every <em>n</em>'th label on the axis, set the
     * step to <em>n</em>. Setting the step to 2 shows every other label.
     *
     * By default, the step is calculated automatically to avoid overlap. To
     * prevent this, set it to 1. This usually only happens on a category axis,
     * and is often a sign that you have chosen the wrong axis type.
     *
     * Read more at Axis docs =&gt; What axis should I use?
     *
     */
    public Builder step(double value) {
      object.setStep(value);
      return this;
    }

    /**
     * (Highstock, Gantt) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code>
     * to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to
     * prevent ellipsis (dots).
     *
     * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
     * class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Whether to use HTML to render the labels.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The x position offset of the label relative to the
     * tick position on the axis.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The y position offset of the label relative to the
     * tick position on the axis. The default makes it adapt to the font size on
     * bottom axis.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The Z index for the axis labels.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
