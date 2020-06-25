package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( AlignObject | DrilldownDrillUpButtonPositionOptions ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Options for the drill up button that appears when
 * drilling down on a series. The text for the button is defined in
 * lang.drillUpText.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DrilldownDrillUpButtonOptions extends Any {
  /**
   * (Highcharts, Highmaps) Positioning options for the button within the
   * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
   * <code>verticalAlign</code>.
   *
   */
  @JSProperty("position")
  @Nullable
  Unknown /* ( AlignObject | DrilldownDrillUpButtonPositionOptions ) */ getPosition();

  /**
   * (Highcharts, Highmaps) Positioning options for the button within the
   * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
   * <code>verticalAlign</code>.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable DrilldownDrillUpButtonPositionOptions value);

  /**
   * (Highcharts, Highmaps) Positioning options for the button within the
   * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
   * <code>verticalAlign</code>.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable AlignObject value);

  /**
   * (Highcharts, Highmaps) What box to align the button to. Can be either
   * <code>plotBox</code> or <code>spacingBox</code>.
   *
   */
  @JSProperty("relativeTo")
  @Nullable
  RelativeTo getRelativeTo();

  /**
   * (Highcharts, Highmaps) What box to align the button to. Can be either
   * <code>plotBox</code> or <code>spacingBox</code>.
   *
   */
  @JSProperty("relativeTo")
  void setRelativeTo(@Nullable RelativeTo value);

  /**
   * (Highcharts, Highmaps) A collection of attributes for the button. The
   * object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>,
   * the border radius. The theme also supports <code>style</code>, a collection of CSS
   * properties for the text. Equivalent attributes for the hover state are
   * given in <code>theme.states.hover</code>.
   *
   * In styled mode, drill-up button styles can be applied with the
   * <code>.highcharts-drillup-button</code> class.
   *
   */
  @JSProperty("theme")
  @Nullable
  Any getTheme();

  /**
   * (Highcharts, Highmaps) A collection of attributes for the button. The
   * object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>,
   * the border radius. The theme also supports <code>style</code>, a collection of CSS
   * properties for the text. Equivalent attributes for the hover state are
   * given in <code>theme.states.hover</code>.
   *
   * In styled mode, drill-up button styles can be applied with the
   * <code>.highcharts-drillup-button</code> class.
   *
   */
  @JSProperty("theme")
  void setTheme(@Nullable Any value);

  class Builder {
    private final DrilldownDrillUpButtonOptions object = Any.empty();

    public DrilldownDrillUpButtonOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) Positioning options for the button within the
     * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
     * <code>verticalAlign</code>.
     *
     */
    public Builder position(@Nullable DrilldownDrillUpButtonPositionOptions value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Positioning options for the button within the
     * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
     * <code>verticalAlign</code>.
     *
     */
    public Builder position(@Nullable AlignObject value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) What box to align the button to. Can be either
     * <code>plotBox</code> or <code>spacingBox</code>.
     *
     */
    public Builder relativeTo(@Nullable RelativeTo value) {
      object.setRelativeTo(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) A collection of attributes for the button. The
     * object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>,
     * the border radius. The theme also supports <code>style</code>, a collection of CSS
     * properties for the text. Equivalent attributes for the hover state are
     * given in <code>theme.states.hover</code>.
     *
     * In styled mode, drill-up button styles can be applied with the
     * <code>.highcharts-drillup-button</code> class.
     *
     */
    public Builder theme(@Nullable Any value) {
      object.setTheme(value);
      return this;
    }
  }
}
