package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for drill down, the concept of
 * inspecting increasingly high resolution data through clicking on chart items
 * like columns or pie slices.
 *
 * The drilldown feature requires the drilldown.js file to be loaded, found in
 * the modules directory of the download package, or online at
 * code.highcharts.com/modules/drilldown.js.
 *
 * @see <a href="https://api.highcharts.com/highcharts/drilldown">https://api.highcharts.com/highcharts/drilldown</a>
 * @see <a href="https://api.highcharts.com/highstock/drilldown">https://api.highcharts.com/highstock/drilldown</a>
 * @see <a href="https://api.highcharts.com/highmaps/drilldown">https://api.highcharts.com/highmaps/drilldown</a>
 *
 */
public interface DrilldownOptions extends Any {
  /**
   * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
   * a point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active label styles can be set with the
   * <code>.highcharts-drilldown-axis-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.activeAxisLabelStyle">https://api.highcharts.com/highcharts/drilldown.activeAxisLabelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.activeAxisLabelStyle">https://api.highcharts.com/highmaps/drilldown.activeAxisLabelStyle</a>
   *
   * @implspec activeAxisLabelStyle?: CSSObject;
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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.activeAxisLabelStyle">https://api.highcharts.com/highcharts/drilldown.activeAxisLabelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.activeAxisLabelStyle">https://api.highcharts.com/highmaps/drilldown.activeAxisLabelStyle</a>
   *
   * @implspec activeAxisLabelStyle?: CSSObject;
   *
   */
  @JSProperty("activeAxisLabelStyle")
  void setActiveAxisLabelStyle(CSSObject value);

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the data label of a
   * point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active data label styles can be applied with the
   * <code>.highcharts-drilldown-data-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle">https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle">https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle</a>
   *
   * @implspec activeDataLabelStyle?: (CSSObject|DrilldownActiveDataLabelStyleOptions);
   *
   */
  @JSProperty("activeDataLabelStyle")
  @Nullable
  Unknown getActiveDataLabelStyle();

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the data label of a
   * point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active data label styles can be applied with the
   * <code>.highcharts-drilldown-data-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle">https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle">https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle</a>
   *
   * @implspec activeDataLabelStyle?: (CSSObject|DrilldownActiveDataLabelStyleOptions);
   *
   */
  @JSProperty("activeDataLabelStyle")
  void setActiveDataLabelStyle(CSSObject value);

  /**
   * (Highcharts, Highmaps) Additional styles to apply to the data label of a
   * point that has drilldown data. By default it is underlined and blue to
   * invite to interaction.
   *
   * In styled mode, active data label styles can be applied with the
   * <code>.highcharts-drilldown-data-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle">https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle">https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle</a>
   *
   * @implspec activeDataLabelStyle?: (CSSObject|DrilldownActiveDataLabelStyleOptions);
   *
   */
  @JSProperty("activeDataLabelStyle")
  void setActiveDataLabelStyle(DrilldownActiveDataLabelStyleOptions value);

  /**
   * (Highcharts) When this option is false, clicking a single point will
   * drill down all points in the same category, equivalent to clicking the X
   * axis label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.allowPointDrilldown">https://api.highcharts.com/highcharts/drilldown.allowPointDrilldown</a>
   *
   * @implspec allowPointDrilldown?: boolean;
   *
   */
  @JSProperty("allowPointDrilldown")
  boolean getAllowPointDrilldown();

  /**
   * (Highcharts) When this option is false, clicking a single point will
   * drill down all points in the same category, equivalent to clicking the X
   * axis label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.allowPointDrilldown">https://api.highcharts.com/highcharts/drilldown.allowPointDrilldown</a>
   *
   * @implspec allowPointDrilldown?: boolean;
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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.animation">https://api.highcharts.com/highcharts/drilldown.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.animation">https://api.highcharts.com/highmaps/drilldown.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.animation">https://api.highcharts.com/highcharts/drilldown.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.animation">https://api.highcharts.com/highmaps/drilldown.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.animation">https://api.highcharts.com/highcharts/drilldown.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.animation">https://api.highcharts.com/highmaps/drilldown.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highmaps) Options for the drill up button that appears when
   * drilling down on a series. The text for the button is defined in
   * lang.drillUpText.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton">https://api.highcharts.com/highcharts/drilldown.drillUpButton</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton">https://api.highcharts.com/highmaps/drilldown.drillUpButton</a>
   *
   * @implspec drillUpButton?: DrilldownDrillUpButtonOptions;
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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton">https://api.highcharts.com/highcharts/drilldown.drillUpButton</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton">https://api.highcharts.com/highmaps/drilldown.drillUpButton</a>
   *
   * @implspec drillUpButton?: DrilldownDrillUpButtonOptions;
   *
   */
  @JSProperty("drillUpButton")
  void setDrillUpButton(DrilldownDrillUpButtonOptions value);

  /**
   * (Highcharts, Highmaps) An array of series configurations for the drill
   * down. Each series configuration uses the same syntax as the series option
   * set. These drilldown series are hidden by default. The drilldown series
   * is linked to the parent series' point by its <code>id</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.series">https://api.highcharts.com/highcharts/drilldown.series</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.series">https://api.highcharts.com/highmaps/drilldown.series</a>
   *
   * @implspec series?: Array<SeriesOptionsType>;
   *
   */
  @JSProperty("series")
  @Nullable
  Array<Unknown> getSeries();

  /**
   * (Highcharts, Highmaps) An array of series configurations for the drill
   * down. Each series configuration uses the same syntax as the series option
   * set. These drilldown series are hidden by default. The drilldown series
   * is linked to the parent series' point by its <code>id</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.series">https://api.highcharts.com/highcharts/drilldown.series</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.series">https://api.highcharts.com/highmaps/drilldown.series</a>
   *
   * @implspec series?: Array<SeriesOptionsType>;
   *
   */
  @JSProperty("series")
  void setSeries(Array<Unknown> value);
}
