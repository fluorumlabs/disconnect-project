package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Options for the drill up button that appears when
 * drilling down on a series. The text for the button is defined in
 * lang.drillUpText.
 *
 * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton">https://api.highcharts.com/highcharts/drilldown.drillUpButton</a>
 * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton">https://api.highcharts.com/highmaps/drilldown.drillUpButton</a>
 *
 */
public interface DrilldownDrillUpButtonOptions extends Any {
  /**
   * (Highcharts, Highmaps) Positioning options for the button within the
   * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
   * <code>verticalAlign</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position</a>
   *
   * @implspec position?: DrilldownDrillUpButtonPositionOptions;
   *
   */
  @JSProperty("position")
  @Nullable
  DrilldownDrillUpButtonPositionOptions getPosition();

  /**
   * (Highcharts, Highmaps) Positioning options for the button within the
   * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
   * <code>verticalAlign</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.position">https://api.highcharts.com/highcharts/drilldown.drillUpButton.position</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.position">https://api.highcharts.com/highmaps/drilldown.drillUpButton.position</a>
   *
   * @implspec position?: DrilldownDrillUpButtonPositionOptions;
   *
   */
  @JSProperty("position")
  void setPosition(DrilldownDrillUpButtonPositionOptions value);

  /**
   * (Highcharts, Highmaps) What box to align the button to. Can be either
   * <code>plotBox</code> or <code>spacingBox</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.relativeTo">https://api.highcharts.com/highcharts/drilldown.drillUpButton.relativeTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.relativeTo">https://api.highcharts.com/highmaps/drilldown.drillUpButton.relativeTo</a>
   *
   * @implspec relativeTo?: (&quot;plotBox&quot;|&quot;spacingBox&quot;);
   *
   */
  @JSProperty("relativeTo")
  @Nullable
  RelativeTo getRelativeTo();

  /**
   * (Highcharts, Highmaps) What box to align the button to. Can be either
   * <code>plotBox</code> or <code>spacingBox</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.relativeTo">https://api.highcharts.com/highcharts/drilldown.drillUpButton.relativeTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.relativeTo">https://api.highcharts.com/highmaps/drilldown.drillUpButton.relativeTo</a>
   *
   * @implspec relativeTo?: (&quot;plotBox&quot;|&quot;spacingBox&quot;);
   *
   */
  @JSProperty("relativeTo")
  void setRelativeTo(RelativeTo value);

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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.theme">https://api.highcharts.com/highcharts/drilldown.drillUpButton.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.theme">https://api.highcharts.com/highmaps/drilldown.drillUpButton.theme</a>
   *
   * @implspec theme?: object;
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
   * @see <a href="https://api.highcharts.com/highcharts/drilldown.drillUpButton.theme">https://api.highcharts.com/highcharts/drilldown.drillUpButton.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown.drillUpButton.theme">https://api.highcharts.com/highmaps/drilldown.drillUpButton.theme</a>
   *
   * @implspec theme?: object;
   *
   */
  @JSProperty("theme")
  void setTheme(Any value);

  /**
   */
  abstract class RelativeTo extends JsEnum {
    public static final RelativeTo PLOTBOX = JsEnum.of("plotBox");

    public static final RelativeTo SPACINGBOX = JsEnum.of("spacingBox");
  }
}
