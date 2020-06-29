package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for specific range. One range
 * consists of bubble, label and connector.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendBubbleLegendRangesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The color of the border for individual
   * range.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the border for individual
   * range.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the border for individual
   * range.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the border for individual
   * range.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
   * range.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
   * range.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
   * range.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
   * range.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector for
   * individual range.
   *
   */
  @JSProperty("connectorColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getConnectorColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector for
   * individual range.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector for
   * individual range.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector for
   * individual range.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Range size value, similar to bubble Z
   * data.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock, Highmaps) Range size value, similar to bubble Z
   * data.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LegendBubbleLegendRangesOptions object = Any.empty();

    private Builder() {
    }

    public LegendBubbleLegendRangesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the border for individual
     * range.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the border for individual
     * range.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the border for individual
     * range.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
     * range.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
     * range.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
     * range.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector for
     * individual range.
     *
     */
    public Builder connectorColor(@Nullable PatternObject value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector for
     * individual range.
     *
     */
    public Builder connectorColor(@Nullable String value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector for
     * individual range.
     *
     */
    public Builder connectorColor(@Nullable GradientColorObject value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Range size value, similar to bubble Z
     * data.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
