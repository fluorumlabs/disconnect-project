package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for the
 * choropleth map. If none given, the color axis is scalar and values are
 * distributed as a gradient between the minimum and maximum colors.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ColorAxisDataClassesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The color of each data class. If not
   * set, the color is pulled from the global or chart-specific colors array.
   * In styled mode, this option is ignored. Instead, use colors defined in
   * CSS.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of each data class. If not
   * set, the color is pulled from the global or chart-specific colors array.
   * In styled mode, this option is ignored. Instead, use colors defined in
   * CSS.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of each data class. If not
   * set, the color is pulled from the global or chart-specific colors array.
   * In styled mode, this option is ignored. Instead, use colors defined in
   * CSS.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of each data class. If not
   * set, the color is pulled from the global or chart-specific colors array.
   * In styled mode, this option is ignored. Instead, use colors defined in
   * CSS.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The start of the value range that the
   * data class represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highstock, Highmaps) The start of the value range that the
   * data class represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The name of the data class as it
   * appears in the legend. If no name is given, it is automatically created
   * based on the <code>from</code> and <code>to</code> values. For full programmatic control,
   * legend.labelFormatter can be used. In the formatter, <code>this.from</code> and
   * <code>this.to</code> can be accessed.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highstock, Highmaps) The name of the data class as it
   * appears in the legend. If no name is given, it is automatically created
   * based on the <code>from</code> and <code>to</code> values. For full programmatic control,
   * legend.labelFormatter can be used. In the formatter, <code>this.from</code> and
   * <code>this.to</code> can be accessed.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The end of the value range that the
   * data class represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highstock, Highmaps) The end of the value range that the
   * data class represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   */
  @JSProperty("to")
  void setTo(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ColorAxisDataClassesOptions object = Any.empty();

    private Builder() {
    }

    public ColorAxisDataClassesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of each data class. If not
     * set, the color is pulled from the global or chart-specific colors array.
     * In styled mode, this option is ignored. Instead, use colors defined in
     * CSS.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of each data class. If not
     * set, the color is pulled from the global or chart-specific colors array.
     * In styled mode, this option is ignored. Instead, use colors defined in
     * CSS.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of each data class. If not
     * set, the color is pulled from the global or chart-specific colors array.
     * In styled mode, this option is ignored. Instead, use colors defined in
     * CSS.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The start of the value range that the
     * data class represents, relating to the point value.
     *
     * The range of each <code>dataClass</code> is closed in both ends, but can be
     * overridden by the next <code>dataClass</code>.
     *
     */
    public Builder from(double value) {
      object.setFrom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The name of the data class as it
     * appears in the legend. If no name is given, it is automatically created
     * based on the <code>from</code> and <code>to</code> values. For full programmatic control,
     * legend.labelFormatter can be used. In the formatter, <code>this.from</code> and
     * <code>this.to</code> can be accessed.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The end of the value range that the
     * data class represents, relating to the point value.
     *
     * The range of each <code>dataClass</code> is closed in both ends, but can be
     * overridden by the next <code>dataClass</code>.
     *
     */
    public Builder to(double value) {
      object.setTo(value);
      return this;
    }
  }
}
