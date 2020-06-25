package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The stack labels show the total value for each bar in a stacked
 * column or bar chart. The label will be placed on top of positive columns and
 * below negative columns. In case of an inverted column chart or a bar chart
 * the label is placed to the right of positive bars and to the left of negative
 * bars.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorYAxisStackLabelsOptions extends Any {
  /**
   * (Highcharts) Defines the horizontal alignment of the stack total label.
   * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts) Defines the horizontal alignment of the stack total label.
   * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts) Allow the stack labels to overlap.
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts) Allow the stack labels to overlap.
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts) The background color or gradient for the stack label.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts) The background color or gradient for the stack label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The background color or gradient for the stack label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts) The background color or gradient for the stack label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The border color for the stack label. Defaults to
   * <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts) The border color for the stack label. Defaults to
   * <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The border color for the stack label. Defaults to
   * <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) The border color for the stack label. Defaults to
   * <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The border radius in pixels for the stack label.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts) The border radius in pixels for the stack label.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts) The border width in pixels for the stack label.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The border width in pixels for the stack label.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) Whether to hide stack labels that are outside the plot area.
   * By default, the stack label is moved inside the plot area according to
   * the overflow option.
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Highcharts) Whether to hide stack labels that are outside the plot area.
   * By default, the stack label is moved inside the plot area according to
   * the overflow option.
   *
   */
  @JSProperty("crop")
  void setCrop(boolean value);

  /**
   * (Highcharts) Enable or disable the stack total labels.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Enable or disable the stack total labels.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) A format string for the data label. Available
   * variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock) A format string for the data label. Available
   * variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highcharts) Callback JavaScript function to format the label. The value
   * is given by <code>this.total</code>.
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<StackItemObject> getFormatter();

  /**
   * (Highcharts) Callback JavaScript function to format the label. The value
   * is given by <code>this.total</code>.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable FormatterCallbackFunction<StackItemObject> value);

  /**
   * (Highcharts) How to handle stack total labels that flow outside the plot
   * area. The default is set to <code>&quot;justify&quot;</code>, which aligns them inside the
   * plot area. For columns and bars, this means it will be moved inside the
   * bar. To display stack labels outside the plot area, set <code>crop</code> to <code>false</code>
   * and <code>overflow</code> to <code>&quot;allow&quot;</code>.
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts) How to handle stack total labels that flow outside the plot
   * area. The default is set to <code>&quot;justify&quot;</code>, which aligns them inside the
   * plot area. For columns and bars, this means it will be moved inside the
   * bar. To display stack labels outside the plot area, set <code>crop</code> to <code>false</code>
   * and <code>overflow</code> to <code>&quot;allow&quot;</code>.
   *
   */
  @JSProperty("overflow")
  void setOverflow(@Nullable Overflow value);

  /**
   * (Highcharts) Rotation of the labels in degrees.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts) Rotation of the labels in degrees.
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) CSS styles for the label.
   *
   * In styled mode, the styles are set in the <code>.highcharts-stack-label</code>
   * class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts) CSS styles for the label.
   *
   * In styled mode, the styles are set in the <code>.highcharts-stack-label</code>
   * class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts) The text alignment for the label. While <code>align</code> determines
   * where the texts anchor point is placed with regards to the stack,
   * <code>textAlign</code> determines how the text is aligned against its anchor point.
   * Possible values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value
   * is calculated at runtime and depends on orientation and whether the stack
   * is positive or negative.
   *
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Highcharts) The text alignment for the label. While <code>align</code> determines
   * where the texts anchor point is placed with regards to the stack,
   * <code>textAlign</code> determines how the text is aligned against its anchor point.
   * Possible values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value
   * is calculated at runtime and depends on orientation and whether the stack
   * is positive or negative.
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable TextAlign value);

  /**
   * (Highcharts, Highstock) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts) Defines the vertical alignment of the stack total label. Can
   * be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts) Defines the vertical alignment of the stack total label. Can
   * be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is
   * calculated at runtime and depends on orientation and whether the stack is
   * positive or negative.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts) The x position offset of the label relative to the left of
   * the stacked bar. The default value is calculated at runtime and depends
   * on orientation and whether the stack is positive or negative.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts) The x position offset of the label relative to the left of
   * the stacked bar. The default value is calculated at runtime and depends
   * on orientation and whether the stack is positive or negative.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts) The y position offset of the label relative to the tick
   * position on the axis. The default value is calculated at runtime and
   * depends on orientation and whether the stack is positive or negative.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts) The y position offset of the label relative to the tick
   * position on the axis. The default value is calculated at runtime and
   * depends on orientation and whether the stack is positive or negative.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final NavigatorYAxisStackLabelsOptions object = Any.empty();

    public NavigatorYAxisStackLabelsOptions build() {
      return object;
    }

    /**
     * (Highcharts) Defines the horizontal alignment of the stack total label.
     * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is
     * calculated at runtime and depends on orientation and whether the stack is
     * positive or negative.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts) Allow the stack labels to overlap.
     *
     */
    public Builder allowOverlap(boolean value) {
      object.setAllowOverlap(value);
      return this;
    }

    /**
     * (Highcharts) The background color or gradient for the stack label.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background color or gradient for the stack label.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background color or gradient for the stack label.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The border color for the stack label. Defaults to
     * <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border color for the stack label. Defaults to
     * <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border color for the stack label. Defaults to
     * <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border radius in pixels for the stack label.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts) The border width in pixels for the stack label.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) Whether to hide stack labels that are outside the plot area.
     * By default, the stack label is moved inside the plot area according to
     * the overflow option.
     *
     */
    public Builder crop(boolean value) {
      object.setCrop(value);
      return this;
    }

    /**
     * (Highcharts) Enable or disable the stack total labels.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A format string for the data label. Available
     * variables are the same as for <code>formatter</code>.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highcharts) Callback JavaScript function to format the label. The value
     * is given by <code>this.total</code>.
     *
     */
    public Builder formatter(@Nullable FormatterCallbackFunction<StackItemObject> value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts) How to handle stack total labels that flow outside the plot
     * area. The default is set to <code>&quot;justify&quot;</code>, which aligns them inside the
     * plot area. For columns and bars, this means it will be moved inside the
     * bar. To display stack labels outside the plot area, set <code>crop</code> to <code>false</code>
     * and <code>overflow</code> to <code>&quot;allow&quot;</code>.
     *
     */
    public Builder overflow(@Nullable Overflow value) {
      object.setOverflow(value);
      return this;
    }

    /**
     * (Highcharts) Rotation of the labels in degrees.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts) CSS styles for the label.
     *
     * In styled mode, the styles are set in the <code>.highcharts-stack-label</code>
     * class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts) The text alignment for the label. While <code>align</code> determines
     * where the texts anchor point is placed with regards to the stack,
     * <code>textAlign</code> determines how the text is aligned against its anchor point.
     * Possible values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value
     * is calculated at runtime and depends on orientation and whether the stack
     * is positive or negative.
     *
     */
    public Builder textAlign(@Nullable TextAlign value) {
      object.setTextAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to use HTML to render the labels.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts) Defines the vertical alignment of the stack total label. Can
     * be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is
     * calculated at runtime and depends on orientation and whether the stack is
     * positive or negative.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts) The x position offset of the label relative to the left of
     * the stacked bar. The default value is calculated at runtime and depends
     * on orientation and whether the stack is positive or negative.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts) The y position offset of the label relative to the tick
     * position on the axis. The default value is calculated at runtime and
     * depends on orientation and whether the stack is positive or negative.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
