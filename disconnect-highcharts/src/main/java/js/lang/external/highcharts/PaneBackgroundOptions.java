package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of background items for the pane.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PaneBackgroundOptions extends Any {
  /**
   * (Highcharts) The background color or gradient for the pane.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts) The background color or gradient for the pane.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The background color or gradient for the pane.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts) The background color or gradient for the pane.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The pane background border color.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts) The pane background border color.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The pane background border color.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) The pane background border color.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The pixel border width of the pane background.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The pixel border width of the pane background.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The class name for this background.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) The class name for this background.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts) The inner radius of the pane background. Can be either
   * numeric (pixels) or a percentage string.
   *
   */
  @JSProperty("innerRadius")
  @Nullable
  Unknown /* ( number | string ) */ getInnerRadius();

  /**
   * (Highcharts) The inner radius of the pane background. Can be either
   * numeric (pixels) or a percentage string.
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(double value);

  /**
   * (Highcharts) The inner radius of the pane background. Can be either
   * numeric (pixels) or a percentage string.
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(@Nullable String value);

  /**
   * (Highcharts) The outer radius of the circular pane background. Can be
   * either numeric (pixels) or a percentage string.
   *
   */
  @JSProperty("outerRadius")
  @Nullable
  Unknown /* ( number | string ) */ getOuterRadius();

  /**
   * (Highcharts) The outer radius of the circular pane background. Can be
   * either numeric (pixels) or a percentage string.
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(double value);

  /**
   * (Highcharts) The outer radius of the circular pane background. Can be
   * either numeric (pixels) or a percentage string.
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(@Nullable String value);

  /**
   * (Highcharts) The shape of the pane background. When <code>solid</code>, the
   * background is circular. When <code>arc</code>, the background extends only from the
   * min to the max of the value axis.
   *
   */
  @JSProperty("shape")
  @Nullable
  Shape getShape();

  /**
   * (Highcharts) The shape of the pane background. When <code>solid</code>, the
   * background is circular. When <code>arc</code>, the background extends only from the
   * min to the max of the value axis.
   *
   */
  @JSProperty("shape")
  void setShape(@Nullable Shape value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Shape extends JsEnum {
    public static final Shape ARC = JsEnum.of("arc");

    public static final Shape CIRCLE = JsEnum.of("circle");

    public static final Shape SOLID = JsEnum.of("solid");
  }

  final class Builder {
    private final PaneBackgroundOptions object = Any.empty();

    private Builder() {
    }

    public PaneBackgroundOptions build() {
      return object;
    }

    /**
     * (Highcharts) The background color or gradient for the pane.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background color or gradient for the pane.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background color or gradient for the pane.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The pane background border color.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The pane background border color.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The pane background border color.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The pixel border width of the pane background.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) The class name for this background.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts) The inner radius of the pane background. Can be either
     * numeric (pixels) or a percentage string.
     *
     */
    public Builder innerRadius(double value) {
      object.setInnerRadius(value);
      return this;
    }

    /**
     * (Highcharts) The inner radius of the pane background. Can be either
     * numeric (pixels) or a percentage string.
     *
     */
    public Builder innerRadius(@Nullable String value) {
      object.setInnerRadius(value);
      return this;
    }

    /**
     * (Highcharts) The outer radius of the circular pane background. Can be
     * either numeric (pixels) or a percentage string.
     *
     */
    public Builder outerRadius(double value) {
      object.setOuterRadius(value);
      return this;
    }

    /**
     * (Highcharts) The outer radius of the circular pane background. Can be
     * either numeric (pixels) or a percentage string.
     *
     */
    public Builder outerRadius(@Nullable String value) {
      object.setOuterRadius(value);
      return this;
    }

    /**
     * (Highcharts) The shape of the pane background. When <code>solid</code>, the
     * background is circular. When <code>arc</code>, the background extends only from the
     * min to the max of the value axis.
     *
     */
    public Builder shape(@Nullable Shape value) {
      object.setShape(value);
      return this;
    }
  }
}
