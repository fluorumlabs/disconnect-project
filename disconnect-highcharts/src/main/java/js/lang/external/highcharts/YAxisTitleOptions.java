package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The axis title, showing next to the
 * axis line.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface YAxisTitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the title relative
   * to the axis values. Possible values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the title relative
   * to the axis values. Possible values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel distance between the
   * axis labels and the title. Positive values are outside the axis line,
   * negative are inside.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel distance between the
   * axis labels and the title. Positive values are outside the axis line,
   * negative are inside.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The distance of the axis title
   * from the axis line. By default, this distance is computed from the offset
   * width of the labels, the labels' distance from the axis and the title's
   * margin. However when the offset option is set, it overrides all this.
   *
   */
  @JSProperty("offset")
  double getOffset();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The distance of the axis title
   * from the axis line. By default, this distance is computed from the offset
   * width of the labels, the labels' distance from the axis and the title's
   * margin. However when the offset option is set, it overrides all this.
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

  /**
   * (Highcharts) Defines how the title is repositioned according to the 3D
   * chart orientation.
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
   * <li>
   * <code>undefined</code>: Will use the config from <code>labels.position3d</code>
   *
   * </li>
   * </ul>
   */
  @JSProperty("position3d")
  @Nullable
  Position3d getPosition3d();

  /**
   * (Highcharts) Defines how the title is repositioned according to the 3D
   * chart orientation.
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
   * <li>
   * <code>undefined</code>: Will use the config from <code>labels.position3d</code>
   *
   * </li>
   * </ul>
   */
  @JSProperty("position3d")
  void setPosition3d(@Nullable Position3d value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
   * when laying out the axis.
   *
   */
  @JSProperty("reserveSpace")
  boolean getReserveSpace();

  /**
   * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
   * when laying out the axis.
   *
   */
  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The rotation of the text in
   * degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The rotation of the text in
   * degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) If enabled, the axis title will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>title.position3d</code>.
   *
   * A <code>null</code> value will use the config from <code>labels.skew3d</code>.
   *
   */
  @JSProperty("skew3d")
  boolean getSkew3d();

  /**
   * (Highcharts) If enabled, the axis title will skewed to follow the
   * perspective.
   *
   * This will fix overlapping labels and titles, but texts become less
   * legible due to the distortion.
   *
   * The final appearance depends heavily on <code>title.position3d</code>.
   *
   * A <code>null</code> value will use the config from <code>labels.skew3d</code>.
   *
   */
  @JSProperty("skew3d")
  void setSkew3d(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. If the
   * title text is longer than the axis length, it will wrap to multiple lines
   * by default. This can be customized by setting <code>textOverflow: 'ellipsis'</code>,
   * by setting a specific <code>width</code> or by setting <code>whiteSpace: 'nowrap'</code>.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-title</code>
   * class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. If the
   * title text is longer than the axis length, it will wrap to multiple lines
   * by default. This can be customized by setting <code>textOverflow: 'ellipsis'</code>,
   * by setting a specific <code>width</code> or by setting <code>whiteSpace: 'nowrap'</code>.
   *
   * In styled mode, the stroke width is given in the <code>.highcharts-axis-title</code>
   * class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Gantt) The actual text of the axis title.
   * Horizontal texts can contain HTML, but rotated texts are painted using
   * vector techniques and must be clean text. The Y axis title is disabled by
   * setting the <code>text</code> option to <code>undefined</code>.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Gantt) The actual text of the axis title.
   * Horizontal texts can contain HTML, but rotated texts are painted using
   * vector techniques and must be clean text. The Y axis title is disabled by
   * setting the <code>text</code> option to <code>undefined</code>.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the text, can be
   * <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>. Default alignment depends on the
   * title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the text, can be
   * <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>. Default alignment depends on the
   * title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable TextAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
   * title.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
   * title.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
   * position.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
   * position.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
   * position.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
   * position.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Align extends JsEnum {
    public static final Align HIGH = JsEnum.of("high");

    public static final Align LOW = JsEnum.of("low");

    public static final Align MIDDLE = JsEnum.of("middle");
  }

  final class Builder {
    private final YAxisTitleOptions object = Any.empty();

    private Builder() {
    }

    public YAxisTitleOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the title relative
     * to the axis values. Possible values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel distance between the
     * axis labels and the title. Positive values are outside the axis line,
     * negative are inside.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The distance of the axis title
     * from the axis line. By default, this distance is computed from the offset
     * width of the labels, the labels' distance from the axis and the title's
     * margin. However when the offset option is set, it overrides all this.
     *
     */
    public Builder offset(double value) {
      object.setOffset(value);
      return this;
    }

    /**
     * (Highcharts) Defines how the title is repositioned according to the 3D
     * chart orientation.
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
     * <li>
     * <code>undefined</code>: Will use the config from <code>labels.position3d</code>
     *
     * </li>
     * </ul>
     */
    public Builder position3d(@Nullable Position3d value) {
      object.setPosition3d(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
     * when laying out the axis.
     *
     */
    public Builder reserveSpace(boolean value) {
      object.setReserveSpace(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The rotation of the text in
     * degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts) If enabled, the axis title will skewed to follow the
     * perspective.
     *
     * This will fix overlapping labels and titles, but texts become less
     * legible due to the distortion.
     *
     * The final appearance depends heavily on <code>title.position3d</code>.
     *
     * A <code>null</code> value will use the config from <code>labels.skew3d</code>.
     *
     */
    public Builder skew3d(boolean value) {
      object.setSkew3d(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. If the
     * title text is longer than the axis length, it will wrap to multiple lines
     * by default. This can be customized by setting <code>textOverflow: 'ellipsis'</code>,
     * by setting a specific <code>width</code> or by setting <code>whiteSpace: 'nowrap'</code>.
     *
     * In styled mode, the stroke width is given in the <code>.highcharts-axis-title</code>
     * class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The actual text of the axis title.
     * Horizontal texts can contain HTML, but rotated texts are painted using
     * vector techniques and must be clean text. The Y axis title is disabled by
     * setting the <code>text</code> option to <code>undefined</code>.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the text, can be
     * <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>. Default alignment depends on the
     * title.align:
     *
     * Horizontal axes:
     *
     * <ul>
     * <li>
     * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
     *
     * </li>
     * </ul>
     * Vertical axes:
     *
     * <ul>
     * <li>
     * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
     * <code>right</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
     * <code>left</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
     * <code>left</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
     * <code>right</code>
     *
     * </li>
     * </ul>
     */
    public Builder textAlign(@Nullable TextAlign value) {
      object.setTextAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
     * title.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
     * position.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
     * position.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
