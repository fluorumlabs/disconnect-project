package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) The appearance of the point marker when selected. In
 * order to allow a point to be selected, set the <code>series.allowPointSelect</code>
 * option to true.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointStatesSelectOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) Enable or disable visible feedback for selection.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable visible feedback for selection.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highcharts, Highstock) The fill color of the point marker.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highmaps) Set the marker's fixed height on select state.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highmaps) Set the marker's fixed height on select state.
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
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getLineColor();

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The radius of the point marker. In hover state,
   * it defaults to the normal state's radius + 2.
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock) The radius of the point marker. In hover state,
   * it defaults to the normal state's radius + 2.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highmaps) Set the marker's fixed width on select state.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highmaps) Set the marker's fixed width on select state.
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
    private final PointStatesSelectOptionsObject object = Any.empty();

    private Builder() {
    }

    public PointStatesSelectOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Enable or disable visible feedback for selection.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the point marker.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the point marker.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the point marker.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Set the marker's fixed height on select state.
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
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder lineColor(@Nullable PatternObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder lineColor(@Nullable GradientColorObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The width of the point marker's outline.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The radius of the point marker. In hover state,
     * it defaults to the normal state's radius + 2.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Set the marker's fixed width on select state.
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
