package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A configuration object for the button
 * theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and
 * <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and
 * <code>states.select</code> objects.
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.theme">https://api.highcharts.com/highcharts/navigation.buttonOptions.theme</a>
 * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.theme">https://api.highcharts.com/highstock/navigation.buttonOptions.theme</a>
 * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.theme">https://api.highcharts.com/highmaps/navigation.buttonOptions.theme</a>
 *
 */
public interface NavigationButtonThemeOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The default fill exists only to capture
   * hover events.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.theme.fill">https://api.highcharts.com/highcharts/navigation.buttonOptions.theme.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.theme.fill">https://api.highcharts.com/highstock/navigation.buttonOptions.theme.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.theme.fill">https://api.highcharts.com/highmaps/navigation.buttonOptions.theme.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  @Nullable
  String getFill();

  /**
   * (Highcharts, Highstock, Highmaps) The default fill exists only to capture
   * hover events.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions.theme.fill">https://api.highcharts.com/highcharts/navigation.buttonOptions.theme.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions.theme.fill">https://api.highcharts.com/highstock/navigation.buttonOptions.theme.fill</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions.theme.fill">https://api.highcharts.com/highmaps/navigation.buttonOptions.theme.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  void setFill(String value);

  /**
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * @implspec stroke?: string;
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * @implspec stroke?: string;
   *
   */
  @JSProperty("stroke")
  void setStroke(String value);
}
