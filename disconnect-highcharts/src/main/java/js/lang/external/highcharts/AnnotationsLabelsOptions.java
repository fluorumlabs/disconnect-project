package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* ( string | AnnotationMockPointOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
 * annotation. For options that apply to multiple labels, they can be added to
 * the labelOptions.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsLabelsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for an
   * annotation label.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  AnnotationLabelAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for an
   * annotation label.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable AnnotationLabelAccessibilityOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the
   * annotation's label. If right, the right side of the label should be
   * touching the point.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the
   * annotation's label. If right, the right side of the label should be
   * touching the point.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the
   * annotation's labels to overlap. To make the labels less sensitive for
   * overlapping, the can be set to 0.
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the
   * annotation's labels to overlap. To make the labels less sensitive for
   * overlapping, the can be set to 0.
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the annotation's label.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the annotation's label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the annotation's label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the annotation's label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the
   * annotation's label.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the
   * annotation's label.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
   * the annotaiton's label.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
   * the annotaiton's label.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
   * the annotation's label
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
   * the annotation's label
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for styling by CSS.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for styling by CSS.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide the annotation's
   * label that is outside the plot area.
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide the annotation's
   * label that is outside the plot area.
   *
   */
  @JSProperty("crop")
  void setCrop(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The label's pixel distance from
   * the point.
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The label's pixel distance from
   * the point.
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
   * label.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
   * label.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
   * format the annotation's label. Note that if a <code>format</code> or <code>text</code> are
   * defined, the format or text take precedence and the formatter is ignored.
   * <code>This</code> refers to a point object.
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<Point> getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
   * format the annotation's label. Note that if a <code>format</code> or <code>text</code> are
   * defined, the format or text take precedence and the formatter is ignored.
   * <code>This</code> refers to a point object.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable FormatterCallbackFunction<Point> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to handle the annotation's
   * label that flow outside the plot area. The justify option aligns the
   * label inside the plot area.
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to handle the annotation's
   * label that flow outside the plot area. The justify option aligns the
   * label inside the plot area.
   *
   */
  @JSProperty("overflow")
  void setOverflow(@Nullable Overflow value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When either the borderWidth or
   * the backgroundColor is set, this is the padding within the box.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When either the borderWidth or
   * the backgroundColor is set, this is the padding within the box.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
   * which the label will be connected. It can be either the point which
   * exists in the series - it is referenced by the point's id - or a new
   * point with defined x, y properties and optionally axes.
   *
   */
  @JSProperty("point")
  @Nullable
  Unknown /* ( string | AnnotationMockPointOptionsObject ) */ getPoint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
   * which the label will be connected. It can be either the point which
   * exists in the series - it is referenced by the point's id - or a new
   * point with defined x, y properties and optionally axes.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
   * which the label will be connected. It can be either the point which
   * exists in the series - it is referenced by the point's id - or a new
   * point with defined x, y properties and optionally axes.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable AnnotationMockPointOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. The
   * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. The
   * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. The
   * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
   * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the label. Symbols are predefined functions on the
   * Renderer object.
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the label. Symbols are predefined functions on the
   * Renderer object.
   *
   */
  @JSProperty("shape")
  void setShape(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styles for the annotation's
   * label.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styles for the annotation's
   * label.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alias for the format option.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alias for the format option.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the annotation's label.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the annotation's label.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * annotation's label.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * annotation's label.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
   * label relative to the point. Note that if a <code>distance</code> is defined, the
   * distance takes precedence over <code>x</code> and <code>y</code> options.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
   * label relative to the point. Note that if a <code>distance</code> is defined, the
   * distance takes precedence over <code>x</code> and <code>y</code> options.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
   * label relative to the point. Note that if a <code>distance</code> is defined, the
   * distance takes precedence over <code>x</code> and <code>y</code> options.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
   * label relative to the point. Note that if a <code>distance</code> is defined, the
   * distance takes precedence over <code>x</code> and <code>y</code> options.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsLabelsOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsLabelsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for an
     * annotation label.
     *
     */
    public Builder accessibility(@Nullable AnnotationLabelAccessibilityOptionsObject value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the
     * annotation's label. If right, the right side of the label should be
     * touching the point.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the
     * annotation's labels to overlap. To make the labels less sensitive for
     * overlapping, the can be set to 0.
     *
     */
    public Builder allowOverlap(boolean value) {
      object.setAllowOverlap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the annotation's label.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the annotation's label.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the annotation's label.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the
     * annotation's label.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
     * the annotaiton's label.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
     * the annotation's label
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for styling by CSS.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide the annotation's
     * label that is outside the plot area.
     *
     */
    public Builder crop(boolean value) {
      object.setCrop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The label's pixel distance from
     * the point.
     *
     */
    public Builder distance(double value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
     * label.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
     * format the annotation's label. Note that if a <code>format</code> or <code>text</code> are
     * defined, the format or text take precedence and the formatter is ignored.
     * <code>This</code> refers to a point object.
     *
     */
    public Builder formatter(@Nullable FormatterCallbackFunction<Point> value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to handle the annotation's
     * label that flow outside the plot area. The justify option aligns the
     * label inside the plot area.
     *
     */
    public Builder overflow(@Nullable Overflow value) {
      object.setOverflow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When either the borderWidth or
     * the backgroundColor is set, this is the padding within the box.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
     * which the label will be connected. It can be either the point which
     * exists in the series - it is referenced by the point's id - or a new
     * point with defined x, y properties and optionally axes.
     *
     */
    public Builder point(@Nullable String value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
     * which the label will be connected. It can be either the point which
     * exists in the series - it is referenced by the point's id - or a new
     * point with defined x, y properties and optionally axes.
     *
     */
    public Builder point(@Nullable AnnotationMockPointOptionsObject value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. The
     * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
     * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. The
     * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
     * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the label. Symbols are predefined functions on the
     * Renderer object.
     *
     */
    public Builder shape(@Nullable String value) {
      object.setShape(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Styles for the annotation's
     * label.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alias for the format option.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the annotation's label.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * annotation's label.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
     * label relative to the point. Note that if a <code>distance</code> is defined, the
     * distance takes precedence over <code>x</code> and <code>y</code> options.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
     * label relative to the point. Note that if a <code>distance</code> is defined, the
     * distance takes precedence over <code>x</code> and <code>y</code> options.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
