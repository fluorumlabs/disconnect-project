package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the dial or arrow pointer of the gauge.
 *
 * In styled mode, the dial is styled with the <code>.highcharts-gauge-series .highcharts-dial</code> rule.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotGaugeDialOptions extends Any {
  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The length of the dial's base part, relative to the total
   * radius or length of the dial.
   *
   */
  @JSProperty("baseLength")
  @Nullable
  String getBaseLength();

  /**
   * (Highcharts) The length of the dial's base part, relative to the total
   * radius or length of the dial.
   *
   */
  @JSProperty("baseLength")
  void setBaseLength(@Nullable String value);

  /**
   * (Highcharts) The pixel width of the base of the gauge dial. The base is
   * the part closest to the pivot, defined by baseLength.
   *
   */
  @JSProperty("baseWidth")
  double getBaseWidth();

  /**
   * (Highcharts) The pixel width of the base of the gauge dial. The base is
   * the part closest to the pivot, defined by baseLength.
   *
   */
  @JSProperty("baseWidth")
  void setBaseWidth(double value);

  /**
   * (Highcharts) The border color or stroke of the gauge's dial. By default,
   * the borderWidth is 0, so this must be set in addition to a custom border
   * color.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts) The border color or stroke of the gauge's dial. By default,
   * the borderWidth is 0, so this must be set in addition to a custom border
   * color.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The border color or stroke of the gauge's dial. By default,
   * the borderWidth is 0, so this must be set in addition to a custom border
   * color.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) The border color or stroke of the gauge's dial. By default,
   * the borderWidth is 0, so this must be set in addition to a custom border
   * color.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The width of the gauge dial border in pixels.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The width of the gauge dial border in pixels.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The radius or length of the dial, in percentages relative to
   * the radius of the gauge itself.
   *
   */
  @JSProperty("radius")
  @Nullable
  String getRadius();

  /**
   * (Highcharts) The radius or length of the dial, in percentages relative to
   * the radius of the gauge itself.
   *
   */
  @JSProperty("radius")
  void setRadius(@Nullable String value);

  /**
   * (Highcharts) The length of the dial's rear end, the part that extends out
   * on the other side of the pivot. Relative to the dial's length.
   *
   */
  @JSProperty("rearLength")
  @Nullable
  String getRearLength();

  /**
   * (Highcharts) The length of the dial's rear end, the part that extends out
   * on the other side of the pivot. Relative to the dial's length.
   *
   */
  @JSProperty("rearLength")
  void setRearLength(@Nullable String value);

  /**
   * (Highcharts) The width of the top of the dial, closest to the perimeter.
   * The pivot narrows in from the base to the top.
   *
   */
  @JSProperty("topWidth")
  double getTopWidth();

  /**
   * (Highcharts) The width of the top of the dial, closest to the perimeter.
   * The pivot narrows in from the base to the top.
   *
   */
  @JSProperty("topWidth")
  void setTopWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotGaugeDialOptions object = Any.empty();

    private Builder() {
    }

    public PlotGaugeDialOptions build() {
      return object;
    }

    /**
     * (Highcharts) The background or fill color of the gauge's dial.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background or fill color of the gauge's dial.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background or fill color of the gauge's dial.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The length of the dial's base part, relative to the total
     * radius or length of the dial.
     *
     */
    public Builder baseLength(@Nullable String value) {
      object.setBaseLength(value);
      return this;
    }

    /**
     * (Highcharts) The pixel width of the base of the gauge dial. The base is
     * the part closest to the pivot, defined by baseLength.
     *
     */
    public Builder baseWidth(double value) {
      object.setBaseWidth(value);
      return this;
    }

    /**
     * (Highcharts) The border color or stroke of the gauge's dial. By default,
     * the borderWidth is 0, so this must be set in addition to a custom border
     * color.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border color or stroke of the gauge's dial. By default,
     * the borderWidth is 0, so this must be set in addition to a custom border
     * color.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border color or stroke of the gauge's dial. By default,
     * the borderWidth is 0, so this must be set in addition to a custom border
     * color.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The width of the gauge dial border in pixels.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) The radius or length of the dial, in percentages relative to
     * the radius of the gauge itself.
     *
     */
    public Builder radius(@Nullable String value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Highcharts) The length of the dial's rear end, the part that extends out
     * on the other side of the pivot. Relative to the dial's length.
     *
     */
    public Builder rearLength(@Nullable String value) {
      object.setRearLength(value);
      return this;
    }

    /**
     * (Highcharts) The width of the top of the dial, closest to the perimeter.
     * The pivot narrows in from the base to the top.
     *
     */
    public Builder topWidth(double value) {
      object.setTopWidth(value);
      return this;
    }
  }
}
