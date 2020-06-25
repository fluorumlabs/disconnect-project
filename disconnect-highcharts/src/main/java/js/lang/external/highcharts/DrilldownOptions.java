package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( CSSObject | DrilldownActiveDataLabelStyleOptions ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Options for drill down, the concept of inspecting
 * increasingly high resolution data through clicking on chart items like
 * columns or pie slices.
 *
 * The drilldown feature requires the drilldown.js file to be loaded, found in
 * the modules directory of the download package, or online at
 * code.highcharts.com/modules/drilldown.js.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DrilldownOptions extends Any {
  /**
   * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
   * a point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active label styles can be set with the
   * <code>.highcharts-drilldown-axis-label</code> class.
   *
   */
  @JSProperty("activeAxisLabelStyle")
  @Nullable
  CSSObject getActiveAxisLabelStyle();

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
   * a point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active label styles can be set with the
   * <code>.highcharts-drilldown-axis-label</code> class.
   *
   */
  @JSProperty("activeAxisLabelStyle")
  void setActiveAxisLabelStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the data label of a
   * point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active data label styles can be applied with the
   * <code>.highcharts-drilldown-data-label</code> class.
   *
   */
  @JSProperty("activeDataLabelStyle")
  @Nullable
  Unknown /* ( CSSObject | DrilldownActiveDataLabelStyleOptions ) */ getActiveDataLabelStyle();

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the data label of a
   * point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active data label styles can be applied with the
   * <code>.highcharts-drilldown-data-label</code> class.
   *
   */
  @JSProperty("activeDataLabelStyle")
  void setActiveDataLabelStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the data label of a
   * point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active data label styles can be applied with the
   * <code>.highcharts-drilldown-data-label</code> class.
   *
   */
  @JSProperty("activeDataLabelStyle")
  void setActiveDataLabelStyle(@Nullable DrilldownActiveDataLabelStyleOptions value);

  /**
   * (Highcharts) When this option is false, clicking a single point will
   * drill down all points in the same category, equivalent to clicking the X
   * axis label.
   *
   */
  @JSProperty("allowPointDrilldown")
  boolean getAllowPointDrilldown();

  /**
   * (Highcharts) When this option is false, clicking a single point will
   * drill down all points in the same category, equivalent to clicking the X
   * axis label.
   *
   */
  @JSProperty("allowPointDrilldown")
  void setAllowPointDrilldown(boolean value);

  /**
   * (Highcharts, Highmaps) Set the animation for all drilldown animations.
   * Animation of a drilldown occurs when drilling between a column point and
   * a column series, or a pie slice and a full pie series. Drilldown can
   * still be used between series and points of different types, but animation
   * will not occur.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <code>duration</code>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <code>easing</code>: A string reference to an easing function set on the <code>Math</code>
   * object. See the easing demo.
   *
   * </li>
   * </ul>
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highmaps) Set the animation for all drilldown animations.
   * Animation of a drilldown occurs when drilling between a column point and
   * a column series, or a pie slice and a full pie series. Drilldown can
   * still be used between series and points of different types, but animation
   * will not occur.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <code>duration</code>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <code>easing</code>: A string reference to an easing function set on the <code>Math</code>
   * object. See the easing demo.
   *
   * </li>
   * </ul>
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highmaps) Set the animation for all drilldown animations.
   * Animation of a drilldown occurs when drilling between a column point and
   * a column series, or a pie slice and a full pie series. Drilldown can
   * still be used between series and points of different types, but animation
   * will not occur.
   *
   * The animation can either be set as a boolean or a configuration object.
   * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
   * ms. If used as a configuration object, the following properties are
   * supported:
   *
   * <ul>
   * <li>
   * <code>duration</code>: The duration of the animation in milliseconds.
   *
   * </li>
   * <li>
   * <code>easing</code>: A string reference to an easing function set on the <code>Math</code>
   * object. See the easing demo.
   *
   * </li>
   * </ul>
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts, Highmaps) Options for the drill up button that appears when
   * drilling down on a series. The text for the button is defined in
   * lang.drillUpText.
   *
   */
  @JSProperty("drillUpButton")
  @Nullable
  DrilldownDrillUpButtonOptions getDrillUpButton();

  /**
   * (Highcharts, Highmaps) Options for the drill up button that appears when
   * drilling down on a series. The text for the button is defined in
   * lang.drillUpText.
   *
   */
  @JSProperty("drillUpButton")
  void setDrillUpButton(@Nullable DrilldownDrillUpButtonOptions value);

  /**
   * (Highcharts, Highmaps) An array of series configurations for the drill
   * down. Each series configuration uses the same syntax as the series option
   * set. These drilldown series are hidden by default. The drilldown series
   * is linked to the parent series' point by its <code>id</code>.
   *
   */
  @JSProperty("series")
  @Nullable
  SeriesOptionsRegistry[] getSeries();

  /**
   * (Highcharts, Highmaps) An array of series configurations for the drill
   * down. Each series configuration uses the same syntax as the series option
   * set. These drilldown series are hidden by default. The drilldown series
   * is linked to the parent series' point by its <code>id</code>.
   *
   */
  @JSProperty("series")
  void setSeries(SeriesOptionsRegistry[] value);

  class Builder {
    private final DrilldownOptions object = Any.empty();

    public DrilldownOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
     * a point that has drilldown data. By default it is underlined and blue to
     * invite to interaction.
     *
     * In styled mode, active label styles can be set with the
     * <code>.highcharts-drilldown-axis-label</code> class.
     *
     */
    public Builder activeAxisLabelStyle(@Nullable CSSObject value) {
      object.setActiveAxisLabelStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Additional styles to apply to the data label of a
     * point that has drilldown data. By default it is underlined and blue to
     * invite to interaction.
     *
     * In styled mode, active data label styles can be applied with the
     * <code>.highcharts-drilldown-data-label</code> class.
     *
     */
    public Builder activeDataLabelStyle(@Nullable CSSObject value) {
      object.setActiveDataLabelStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Additional styles to apply to the data label of a
     * point that has drilldown data. By default it is underlined and blue to
     * invite to interaction.
     *
     * In styled mode, active data label styles can be applied with the
     * <code>.highcharts-drilldown-data-label</code> class.
     *
     */
    public Builder activeDataLabelStyle(@Nullable DrilldownActiveDataLabelStyleOptions value) {
      object.setActiveDataLabelStyle(value);
      return this;
    }

    /**
     * (Highcharts) When this option is false, clicking a single point will
     * drill down all points in the same category, equivalent to clicking the X
     * axis label.
     *
     */
    public Builder allowPointDrilldown(boolean value) {
      object.setAllowPointDrilldown(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Set the animation for all drilldown animations.
     * Animation of a drilldown occurs when drilling between a column point and
     * a column series, or a pie slice and a full pie series. Drilldown can
     * still be used between series and points of different types, but animation
     * will not occur.
     *
     * The animation can either be set as a boolean or a configuration object.
     * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
     * ms. If used as a configuration object, the following properties are
     * supported:
     *
     * <ul>
     * <li>
     * <code>duration</code>: The duration of the animation in milliseconds.
     *
     * </li>
     * <li>
     * <code>easing</code>: A string reference to an easing function set on the <code>Math</code>
     * object. See the easing demo.
     *
     * </li>
     * </ul>
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Set the animation for all drilldown animations.
     * Animation of a drilldown occurs when drilling between a column point and
     * a column series, or a pie slice and a full pie series. Drilldown can
     * still be used between series and points of different types, but animation
     * will not occur.
     *
     * The animation can either be set as a boolean or a configuration object.
     * If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500
     * ms. If used as a configuration object, the following properties are
     * supported:
     *
     * <ul>
     * <li>
     * <code>duration</code>: The duration of the animation in milliseconds.
     *
     * </li>
     * <li>
     * <code>easing</code>: A string reference to an easing function set on the <code>Math</code>
     * object. See the easing demo.
     *
     * </li>
     * </ul>
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for the drill up button that appears when
     * drilling down on a series. The text for the button is defined in
     * lang.drillUpText.
     *
     */
    public Builder drillUpButton(@Nullable DrilldownDrillUpButtonOptions value) {
      object.setDrillUpButton(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) An array of series configurations for the drill
     * down. Each series configuration uses the same syntax as the series option
     * set. These drilldown series are hidden by default. The drilldown series
     * is linked to the parent series' point by its <code>id</code>.
     *
     */
    public Builder series(SeriesOptionsRegistry[] value) {
      object.setSeries(value);
      return this;
    }
  }
}
