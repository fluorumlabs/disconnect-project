package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for area between Senkou Span A and B.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotIkhSenkouSpanOptions extends Any {
  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getNegativeColor();

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable PatternObject value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable String value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(@Nullable GradientColorObject value);

  @JSProperty("styles")
  @Nullable
  Any getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable Any value);

  class Builder {
    private final PlotIkhSenkouSpanOptions object = Any.empty();

    public PlotIkhSenkouSpanOptions build() {
      return object;
    }

    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
     * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
     * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
     * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is under Senkou Span B.
     *
     */
    public Builder negativeColor(@Nullable PatternObject value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is under Senkou Span B.
     *
     */
    public Builder negativeColor(@Nullable String value) {
      object.setNegativeColor(value);
      return this;
    }

    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is under Senkou Span B.
     *
     */
    public Builder negativeColor(@Nullable GradientColorObject value) {
      object.setNegativeColor(value);
      return this;
    }

    public Builder styles(@Nullable Any value) {
      object.setStyles(value);
      return this;
    }
  }
}
