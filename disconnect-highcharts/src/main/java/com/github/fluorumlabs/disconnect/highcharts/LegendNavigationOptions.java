package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for the paging or navigation
 * appearing when the legend is overflown. Navigation works well on screen, but
 * not in static exported images. One way of working around that is to increase
 * the chart height in export.
 *
 * @see <a href="https://api.highcharts.com/highcharts/legend.navigation">https://api.highcharts.com/highcharts/legend.navigation</a>
 * @see <a href="https://api.highcharts.com/highstock/legend.navigation">https://api.highcharts.com/highstock/legend.navigation</a>
 * @see <a href="https://api.highcharts.com/highmaps/legend.navigation">https://api.highcharts.com/highmaps/legend.navigation</a>
 *
 */
public interface LegendNavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The color for the active up or down
   * arrow in the legend page navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.activeColor">https://api.highcharts.com/highcharts/legend.navigation.activeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.activeColor">https://api.highcharts.com/highstock/legend.navigation.activeColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.activeColor">https://api.highcharts.com/highmaps/legend.navigation.activeColor</a>
   *
   * @implspec activeColor?: ColorString;
   *
   */
  @JSProperty("activeColor")
  @Nullable
  String getActiveColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color for the active up or down
   * arrow in the legend page navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.activeColor">https://api.highcharts.com/highcharts/legend.navigation.activeColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.activeColor">https://api.highcharts.com/highstock/legend.navigation.activeColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.activeColor">https://api.highcharts.com/highmaps/legend.navigation.activeColor</a>
   *
   * @implspec activeColor?: ColorString;
   *
   */
  @JSProperty("activeColor")
  void setActiveColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) How to animate the pages when
   * navigating up or down. A value of <code>true</code> applies the default navigation
   * given in the <code>chart.animation</code> option. Additional options can be given as
   * an object containing values for easing and duration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.animation">https://api.highcharts.com/highcharts/legend.navigation.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.animation">https://api.highcharts.com/highstock/legend.navigation.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.animation">https://api.highcharts.com/highmaps/legend.navigation.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps) How to animate the pages when
   * navigating up or down. A value of <code>true</code> applies the default navigation
   * given in the <code>chart.animation</code> option. Additional options can be given as
   * an object containing values for easing and duration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.animation">https://api.highcharts.com/highcharts/legend.navigation.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.animation">https://api.highcharts.com/highstock/legend.navigation.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.animation">https://api.highcharts.com/highmaps/legend.navigation.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) How to animate the pages when
   * navigating up or down. A value of <code>true</code> applies the default navigation
   * given in the <code>chart.animation</code> option. Additional options can be given as
   * an object containing values for easing and duration.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.animation">https://api.highcharts.com/highcharts/legend.navigation.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.animation">https://api.highcharts.com/highstock/legend.navigation.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.animation">https://api.highcharts.com/highmaps/legend.navigation.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel size of the up and down
   * arrows in the legend paging navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.arrowSize">https://api.highcharts.com/highcharts/legend.navigation.arrowSize</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.arrowSize">https://api.highcharts.com/highstock/legend.navigation.arrowSize</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.arrowSize">https://api.highcharts.com/highmaps/legend.navigation.arrowSize</a>
   *
   * @implspec arrowSize?: number;
   *
   */
  @JSProperty("arrowSize")
  double getArrowSize();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel size of the up and down
   * arrows in the legend paging navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.arrowSize">https://api.highcharts.com/highcharts/legend.navigation.arrowSize</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.arrowSize">https://api.highcharts.com/highstock/legend.navigation.arrowSize</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.arrowSize">https://api.highcharts.com/highmaps/legend.navigation.arrowSize</a>
   *
   * @implspec arrowSize?: number;
   *
   */
  @JSProperty("arrowSize")
  void setArrowSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable the legend
   * navigation. In most cases, disabling the navigation results in an
   * unwanted overflow.
   *
   * See also the adapt chart to legend plugin for a solution to extend the
   * chart height to make room for the legend, optionally in exported charts
   * only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.enabled">https://api.highcharts.com/highcharts/legend.navigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.enabled">https://api.highcharts.com/highstock/legend.navigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.enabled">https://api.highcharts.com/highmaps/legend.navigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable the legend
   * navigation. In most cases, disabling the navigation results in an
   * unwanted overflow.
   *
   * See also the adapt chart to legend plugin for a solution to extend the
   * chart height to make room for the legend, optionally in exported charts
   * only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.enabled">https://api.highcharts.com/highcharts/legend.navigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.enabled">https://api.highcharts.com/highstock/legend.navigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.enabled">https://api.highcharts.com/highmaps/legend.navigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the inactive up or down
   * arrow in the legend page navigation. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.inactiveColor">https://api.highcharts.com/highcharts/legend.navigation.inactiveColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.inactiveColor">https://api.highcharts.com/highstock/legend.navigation.inactiveColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.inactiveColor">https://api.highcharts.com/highmaps/legend.navigation.inactiveColor</a>
   *
   * @implspec inactiveColor?: ColorString;
   *
   */
  @JSProperty("inactiveColor")
  @Nullable
  String getInactiveColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the inactive up or down
   * arrow in the legend page navigation. .
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.inactiveColor">https://api.highcharts.com/highcharts/legend.navigation.inactiveColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.inactiveColor">https://api.highcharts.com/highstock/legend.navigation.inactiveColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.inactiveColor">https://api.highcharts.com/highmaps/legend.navigation.inactiveColor</a>
   *
   * @implspec inactiveColor?: ColorString;
   *
   */
  @JSProperty("inactiveColor")
  void setInactiveColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Text styles for the legend page
   * navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.style">https://api.highcharts.com/highcharts/legend.navigation.style</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.style">https://api.highcharts.com/highstock/legend.navigation.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.style">https://api.highcharts.com/highmaps/legend.navigation.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Text styles for the legend page
   * navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation.style">https://api.highcharts.com/highcharts/legend.navigation.style</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation.style">https://api.highcharts.com/highstock/legend.navigation.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation.style">https://api.highcharts.com/highmaps/legend.navigation.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
