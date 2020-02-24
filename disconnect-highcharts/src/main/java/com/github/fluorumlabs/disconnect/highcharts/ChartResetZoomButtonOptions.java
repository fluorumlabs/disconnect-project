package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The button that appears after a selection
 * zoom, allowing the user to reset zoom.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton">https://api.highcharts.com/highcharts/chart.resetZoomButton</a>
 * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton">https://api.highcharts.com/highstock/chart.resetZoomButton</a>
 * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton">https://api.highcharts.com/highmaps/chart.resetZoomButton</a>
 *
 */
public interface ChartResetZoomButtonOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The position of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position">https://api.highcharts.com/highcharts/chart.resetZoomButton.position</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position">https://api.highcharts.com/highstock/chart.resetZoomButton.position</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position">https://api.highcharts.com/highmaps/chart.resetZoomButton.position</a>
   *
   * @implspec position?: ChartResetZoomButtonPositionOptions;
   *
   */
  @JSProperty("position")
  @Nullable
  ChartResetZoomButtonPositionOptions getPosition();

  /**
   * (Highcharts, Highstock, Highmaps) The position of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.position">https://api.highcharts.com/highcharts/chart.resetZoomButton.position</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.position">https://api.highcharts.com/highstock/chart.resetZoomButton.position</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.position">https://api.highcharts.com/highmaps/chart.resetZoomButton.position</a>
   *
   * @implspec position?: ChartResetZoomButtonPositionOptions;
   *
   */
  @JSProperty("position")
  void setPosition(ChartResetZoomButtonPositionOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) What frame the button should be placed
   * related to. Can be either <code>plot</code> or <code>chart</code>
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.relativeTo">https://api.highcharts.com/highcharts/chart.resetZoomButton.relativeTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.relativeTo">https://api.highcharts.com/highstock/chart.resetZoomButton.relativeTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.relativeTo">https://api.highcharts.com/highmaps/chart.resetZoomButton.relativeTo</a>
   *
   * @implspec relativeTo?: (&quot;chart&quot;|&quot;plot&quot;);
   *
   */
  @JSProperty("relativeTo")
  @Nullable
  RelativeTo getRelativeTo();

  /**
   * (Highcharts, Highstock, Highmaps) What frame the button should be placed
   * related to. Can be either <code>plot</code> or <code>chart</code>
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.relativeTo">https://api.highcharts.com/highcharts/chart.resetZoomButton.relativeTo</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.relativeTo">https://api.highcharts.com/highstock/chart.resetZoomButton.relativeTo</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.relativeTo">https://api.highcharts.com/highmaps/chart.resetZoomButton.relativeTo</a>
   *
   * @implspec relativeTo?: (&quot;chart&quot;|&quot;plot&quot;);
   *
   */
  @JSProperty("relativeTo")
  void setRelativeTo(RelativeTo value);

  /**
   * (Highcharts, Highstock, Highmaps) A collection of attributes for the
   * button. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports
   * <code>style</code>, a collection of CSS properties for the text. Equivalent
   * attributes for the hover state are given in <code>theme.states.hover</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.theme">https://api.highcharts.com/highcharts/chart.resetZoomButton.theme</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.theme">https://api.highcharts.com/highstock/chart.resetZoomButton.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.theme">https://api.highcharts.com/highmaps/chart.resetZoomButton.theme</a>
   *
   * @implspec theme?: ChartResetZoomButtonThemeOptions;
   *
   */
  @JSProperty("theme")
  @Nullable
  ChartResetZoomButtonThemeOptions getTheme();

  /**
   * (Highcharts, Highstock, Highmaps) A collection of attributes for the
   * button. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports
   * <code>style</code>, a collection of CSS properties for the text. Equivalent
   * attributes for the hover state are given in <code>theme.states.hover</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.resetZoomButton.theme">https://api.highcharts.com/highcharts/chart.resetZoomButton.theme</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.resetZoomButton.theme">https://api.highcharts.com/highstock/chart.resetZoomButton.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.resetZoomButton.theme">https://api.highcharts.com/highmaps/chart.resetZoomButton.theme</a>
   *
   * @implspec theme?: ChartResetZoomButtonThemeOptions;
   *
   */
  @JSProperty("theme")
  void setTheme(ChartResetZoomButtonThemeOptions value);

  /**
   */
  abstract class RelativeTo extends JsEnum {
    public static final RelativeTo CHART = JsEnum.of("chart");

    public static final RelativeTo PLOT = JsEnum.of("plot");
  }
}
