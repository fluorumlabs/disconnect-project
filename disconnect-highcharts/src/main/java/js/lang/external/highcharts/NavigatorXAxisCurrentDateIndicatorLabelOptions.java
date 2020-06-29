package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Text labels for the plot bands
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorXAxisCurrentDateIndicatorLabelOptions extends Any {
  /**
   * (Gantt) Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot;
   * or &quot;right&quot;.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Gantt) Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot;
   * or &quot;right&quot;.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Gantt) Format of the label. This options is passed as the fist argument
   * to dateFormat function.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Gantt) Format of the label. This options is passed as the fist argument
   * to dateFormat function.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Gantt) Callback JavaScript function to format the label. Useful
   * properties like the value of plot line or the range of plot band (<code>from</code>
   * &amp; <code>to</code> properties) can be found in <code>this.options</code> object.
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<PlotLineOrBand> getFormatter();

  /**
   * (Gantt) Callback JavaScript function to format the label. Useful
   * properties like the value of plot line or the range of plot band (<code>from</code>
   * &amp; <code>to</code> properties) can be found in <code>this.options</code> object.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable FormatterCallbackFunction<PlotLineOrBand> value);

  /**
   * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
   * horizontal plot lines and 90 for vertical lines.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
   * horizontal plot lines and 90 for vertical lines.
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-line-label</code> class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-line-label</code> class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Gantt) The text itself. A subset of HTML is supported.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Gantt) The text itself. A subset of HTML is supported.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Gantt) The text alignment for the label. While <code>align</code> determines where
   * the texts anchor point is placed within the plot band, <code>textAlign</code>
   * determines how the text is aligned against its anchor point. Possible
   * values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the
   * <code>align</code> option.
   *
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Gantt) The text alignment for the label. While <code>align</code> determines where
   * the texts anchor point is placed within the plot band, <code>textAlign</code>
   * determines how the text is aligned against its anchor point. Possible
   * values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the
   * <code>align</code> option.
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable TextAlign value);

  /**
   * (Gantt) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Gantt) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Gantt) Vertical alignment of the label relative to the plot line. Can be
   * one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Gantt) Vertical alignment of the label relative to the plot line. Can be
   * one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Gantt) Horizontal position relative the alignment. Default varies by
   * orientation.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Gantt) Horizontal position relative the alignment. Default varies by
   * orientation.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Gantt) Vertical position of the text baseline relative to the alignment.
   * Default varies by orientation.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Gantt) Vertical position of the text baseline relative to the alignment.
   * Default varies by orientation.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigatorXAxisCurrentDateIndicatorLabelOptions object = Any.empty();

    private Builder() {
    }

    public NavigatorXAxisCurrentDateIndicatorLabelOptions build() {
      return object;
    }

    /**
     * (Gantt) Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot;
     * or &quot;right&quot;.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Gantt) Format of the label. This options is passed as the fist argument
     * to dateFormat function.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Gantt) Callback JavaScript function to format the label. Useful
     * properties like the value of plot line or the range of plot band (<code>from</code>
     * &amp; <code>to</code> properties) can be found in <code>this.options</code> object.
     *
     */
    public Builder formatter(@Nullable FormatterCallbackFunction<PlotLineOrBand> value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
     * horizontal plot lines and 90 for vertical lines.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Gantt) CSS styles for the text label.
     *
     * In styled mode, the labels are styled by the
     * <code>.highcharts-plot-line-label</code> class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Gantt) The text itself. A subset of HTML is supported.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Gantt) The text alignment for the label. While <code>align</code> determines where
     * the texts anchor point is placed within the plot band, <code>textAlign</code>
     * determines how the text is aligned against its anchor point. Possible
     * values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the
     * <code>align</code> option.
     *
     */
    public Builder textAlign(@Nullable TextAlign value) {
      object.setTextAlign(value);
      return this;
    }

    /**
     * (Gantt) Whether to use HTML to render the labels.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Gantt) Vertical alignment of the label relative to the plot line. Can be
     * one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Gantt) Horizontal position relative the alignment. Default varies by
     * orientation.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Gantt) Vertical position of the text baseline relative to the alignment.
     * Default varies by orientation.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
