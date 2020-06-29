package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( AlignObject | ChartResetZoomButtonPositionOptions ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
 * selection zoom, allowing the user to reset zoom.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartResetZoomButtonOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
   *
   */
  @JSProperty("position")
  @Nullable
  Unknown /* ( AlignObject | ChartResetZoomButtonPositionOptions ) */ getPosition();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable AlignObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable ChartResetZoomButtonPositionOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
   * should be related to. Can be either <code>plotBox</code> or <code>spacingBox</code>.
   *
   */
  @JSProperty("relativeTo")
  @Nullable
  RelativeTo getRelativeTo();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
   * should be related to. Can be either <code>plotBox</code> or <code>spacingBox</code>.
   *
   */
  @JSProperty("relativeTo")
  void setRelativeTo(@Nullable RelativeTo value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
   * the button. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports
   * <code>style</code>, a collection of CSS properties for the text. Equivalent
   * attributes for the hover state are given in <code>theme.states.hover</code>.
   *
   */
  @JSProperty("theme")
  @Nullable
  SVGAttributes getTheme();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
   * the button. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports
   * <code>style</code>, a collection of CSS properties for the text. Equivalent
   * attributes for the hover state are given in <code>theme.states.hover</code>.
   *
   */
  @JSProperty("theme")
  void setTheme(@Nullable SVGAttributes value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ChartResetZoomButtonOptions object = Any.empty();

    private Builder() {
    }

    public ChartResetZoomButtonOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
     *
     */
    public Builder position(@Nullable AlignObject value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
     *
     */
    public Builder position(@Nullable ChartResetZoomButtonPositionOptions value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
     * should be related to. Can be either <code>plotBox</code> or <code>spacingBox</code>.
     *
     */
    public Builder relativeTo(@Nullable RelativeTo value) {
      object.setRelativeTo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
     * the button. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>,
     * <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports
     * <code>style</code>, a collection of CSS properties for the text. Equivalent
     * attributes for the hover state are given in <code>theme.states.hover</code>.
     *
     */
    public Builder theme(@Nullable SVGAttributes value) {
      object.setTheme(value);
      return this;
    }
  }
}
