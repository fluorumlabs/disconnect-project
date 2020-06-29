package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the pivot or the center point of the gauge.
 *
 * In styled mode, the pivot is styled with the <code>.highcharts-gauge-series .highcharts-pivot</code> rule.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotGaugePivotOptions extends Any {
  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts) The background color or fill of the pivot.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The border or stroke color of the pivot. In able to change
   * this, the borderWidth must also be set to something other than the
   * default 0.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts) The border or stroke color of the pivot. In able to change
   * this, the borderWidth must also be set to something other than the
   * default 0.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The border or stroke color of the pivot. In able to change
   * this, the borderWidth must also be set to something other than the
   * default 0.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) The border or stroke color of the pivot. In able to change
   * this, the borderWidth must also be set to something other than the
   * default 0.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The border or stroke width of the pivot.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The border or stroke width of the pivot.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The pixel radius of the pivot.
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts) The pixel radius of the pivot.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotGaugePivotOptions object = Any.empty();

    private Builder() {
    }

    public PlotGaugePivotOptions build() {
      return object;
    }

    /**
     * (Highcharts) The background color or fill of the pivot.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background color or fill of the pivot.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The background color or fill of the pivot.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts) The border or stroke color of the pivot. In able to change
     * this, the borderWidth must also be set to something other than the
     * default 0.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border or stroke color of the pivot. In able to change
     * this, the borderWidth must also be set to something other than the
     * default 0.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border or stroke color of the pivot. In able to change
     * this, the borderWidth must also be set to something other than the
     * default 0.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border or stroke width of the pivot.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) The pixel radius of the pivot.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }
  }
}
