package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The hover state for a single point marker.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointStatesHoverOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) Animation when hovering over the marker.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highstock) Animation when hovering over the marker.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock) Animation when hovering over the marker.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock) Enable or disable the point marker.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable the point marker.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highcharts, Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The fill color of the marker in hover state. When
   * <code>undefined</code>, the series' or point's fillColor for normal state is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highmaps) Set the marker's fixed height on hover state.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highmaps) Set the marker's fixed height on hover state.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock) The number of pixels to increase the height of
   * the hovered point.
   *
   */
  @JSProperty("heightPlus")
  double getHeightPlus();

  /**
   * (Highcharts, Highstock) The number of pixels to increase the height of
   * the hovered point.
   *
   */
  @JSProperty("heightPlus")
  void setHeightPlus(double value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's lineColor for normal state is used.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getLineColor();

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's lineColor for normal state is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's lineColor for normal state is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's lineColor for normal state is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) The width of the point marker's outline. When
   * <code>undefined</code>, the series' or point's lineWidth for normal state is used.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the point marker's outline. When
   * <code>undefined</code>, the series' or point's lineWidth for normal state is used.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The additional line width for a hovered point.
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highcharts, Highstock) The additional line width for a hovered point.
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  /**
   * (Highcharts, Highstock) The radius of the point marker. In hover state,
   * it defaults to the normal state's radius + 2 as per the radiusPlus
   * option.
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock) The radius of the point marker. In hover state,
   * it defaults to the normal state's radius + 2 as per the radiusPlus
   * option.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highstock) The number of pixels to increase the radius of
   * the hovered point.
   *
   */
  @JSProperty("radiusPlus")
  double getRadiusPlus();

  /**
   * (Highcharts, Highstock) The number of pixels to increase the radius of
   * the hovered point.
   *
   */
  @JSProperty("radiusPlus")
  void setRadiusPlus(double value);

  /**
   * (Highcharts, Highmaps) Set the marker's fixed width on hover state.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highmaps) Set the marker's fixed width on hover state.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock) The number of pixels to increase the width of the
   * hovered point.
   *
   */
  @JSProperty("widthPlus")
  double getWidthPlus();

  /**
   * (Highcharts, Highstock) The number of pixels to increase the width of the
   * hovered point.
   *
   */
  @JSProperty("widthPlus")
  void setWidthPlus(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointStatesHoverOptionsObject object = Any.empty();

    private Builder() {
    }

    public PointStatesHoverOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Animation when hovering over the marker.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Animation when hovering over the marker.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Enable or disable the point marker.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the marker in hover state. When
     * <code>undefined</code>, the series' or point's fillColor for normal state is used.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the marker in hover state. When
     * <code>undefined</code>, the series' or point's fillColor for normal state is used.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the marker in hover state. When
     * <code>undefined</code>, the series' or point's fillColor for normal state is used.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Set the marker's fixed height on hover state.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The number of pixels to increase the height of
     * the hovered point.
     *
     */
    public Builder heightPlus(double value) {
      object.setHeightPlus(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's lineColor for normal state is used.
     *
     */
    public Builder lineColor(@Nullable PatternObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's lineColor for normal state is used.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's lineColor for normal state is used.
     *
     */
    public Builder lineColor(@Nullable GradientColorObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The width of the point marker's outline. When
     * <code>undefined</code>, the series' or point's lineWidth for normal state is used.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The additional line width for a hovered point.
     *
     */
    public Builder lineWidthPlus(double value) {
      object.setLineWidthPlus(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The radius of the point marker. In hover state,
     * it defaults to the normal state's radius + 2 as per the radiusPlus
     * option.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The number of pixels to increase the radius of
     * the hovered point.
     *
     */
    public Builder radiusPlus(double value) {
      object.setRadiusPlus(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Set the marker's fixed width on hover state.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The number of pixels to increase the width of the
     * hovered point.
     *
     */
    public Builder widthPlus(double value) {
      object.setWidthPlus(value);
      return this;
    }
  }
}
