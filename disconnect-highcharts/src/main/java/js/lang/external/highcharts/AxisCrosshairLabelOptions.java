package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A label on the axis next to the crosshair.
 *
 * In styled mode, the label is styled with the <code>.highcharts-crosshair-label</code>
 * class.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisCrosshairLabelOptions extends Any {
  /**
   * (Highstock) Alignment of the label compared to the axis. Defaults to
   * <code>&quot;left&quot;</code> for right-side axes, <code>&quot;right&quot;</code> for left-side axes and <code>&quot;center&quot;</code>
   * for horizontal axes.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highstock) Alignment of the label compared to the axis. Defaults to
   * <code>&quot;left&quot;</code> for right-side axes, <code>&quot;right&quot;</code> for left-side axes and <code>&quot;center&quot;</code>
   * for horizontal axes.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highstock) The background color for the label. Defaults to the related
   * series color, or <code>#666666</code> if that is not available.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The border color for the crosshair label
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highstock) The border color for the crosshair label
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock) The border color for the crosshair label
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highstock) The border color for the crosshair label
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The border corner radius of the crosshair label.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highstock) The border corner radius of the crosshair label.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highstock) The border width for the crosshair label.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highstock) The border width for the crosshair label.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highstock) Flag to enable crosshair's label.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Flag to enable crosshair's label.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) A format string for the crosshair label. Defaults to
   * <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highstock) A format string for the crosshair label. Defaults to
   * <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highstock) Formatter function for the label text.
   *
   */
  @JSProperty("formatter")
  @Nullable
  XAxisCrosshairLabelFormatterCallbackFunction getFormatter();

  /**
   * (Highstock) Formatter function for the label text.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable XAxisCrosshairLabelFormatterCallbackFunction value);

  /**
   * (Highstock) Padding inside the crosshair label.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highstock) Padding inside the crosshair label.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highstock) The shape to use for the label box.
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highstock) The shape to use for the label box.
   *
   */
  @JSProperty("shape")
  void setShape(@Nullable String value);

  /**
   * (Highstock) Text styles for the crosshair label.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highstock) Text styles for the crosshair label.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  class Builder {
    private final AxisCrosshairLabelOptions object = Any.empty();

    public AxisCrosshairLabelOptions build() {
      return object;
    }

    /**
     * (Highstock) Alignment of the label compared to the axis. Defaults to
     * <code>&quot;left&quot;</code> for right-side axes, <code>&quot;right&quot;</code> for left-side axes and <code>&quot;center&quot;</code>
     * for horizontal axes.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highstock) The background color for the label. Defaults to the related
     * series color, or <code>#666666</code> if that is not available.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The background color for the label. Defaults to the related
     * series color, or <code>#666666</code> if that is not available.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The background color for the label. Defaults to the related
     * series color, or <code>#666666</code> if that is not available.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The border color for the crosshair label
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The border color for the crosshair label
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The border color for the crosshair label
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The border corner radius of the crosshair label.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highstock) The border width for the crosshair label.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highstock) Flag to enable crosshair's label.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) A format string for the crosshair label. Defaults to
     * <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highstock) Formatter function for the label text.
     *
     */
    public Builder formatter(@Nullable XAxisCrosshairLabelFormatterCallbackFunction value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highstock) Padding inside the crosshair label.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highstock) The shape to use for the label box.
     *
     */
    public Builder shape(@Nullable String value) {
      object.setShape(value);
      return this;
    }

    /**
     * (Highstock) Text styles for the crosshair label.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }
  }
}
