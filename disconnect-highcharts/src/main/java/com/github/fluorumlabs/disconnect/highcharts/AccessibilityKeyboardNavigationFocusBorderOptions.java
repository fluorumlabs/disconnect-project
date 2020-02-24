package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for the focus border drawn around
 * elements while navigating through them.
 *
 * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder</a>
 * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder</a>
 * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder</a>
 *
 */
public interface AccessibilityKeyboardNavigationFocusBorderOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Enable/disable focus border for chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.enabled">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.enabled">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.enabled">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable/disable focus border for chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.enabled">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.enabled">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.enabled">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Hide the browser's default focus
   * indicator.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline</a>
   *
   * @implspec hideBrowserFocusOutline?: boolean;
   *
   */
  @JSProperty("hideBrowserFocusOutline")
  boolean getHideBrowserFocusOutline();

  /**
   * (Highcharts, Highstock, Highmaps) Hide the browser's default focus
   * indicator.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.hideBrowserFocusOutline</a>
   *
   * @implspec hideBrowserFocusOutline?: boolean;
   *
   */
  @JSProperty("hideBrowserFocusOutline")
  void setHideBrowserFocusOutline(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Focus border margin around the
   * elements.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.margin">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.margin">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.margin">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps) Focus border margin around the
   * elements.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.margin">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.margin">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.margin">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the focus border
   * drawn around elements while navigating through them. Note that some
   * browsers in addition draw their own borders for focused elements. These
   * automatic borders can not be styled by Highcharts.
   *
   * In styled mode, the border is given the <code>.highcharts-focus-border</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.style">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.style</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.style">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.style">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Style options for the focus border
   * drawn around elements while navigating through them. Note that some
   * browsers in addition draw their own borders for focused elements. These
   * automatic borders can not be styled by Highcharts.
   *
   * In styled mode, the border is given the <code>.highcharts-focus-border</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.style">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder.style</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.style">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.style">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
