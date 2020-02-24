package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for keyboard navigation.
 *
 * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation</a>
 * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation">https://api.highcharts.com/highstock/accessibility.keyboardNavigation</a>
 * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation</a>
 *
 */
public interface AccessibilityKeyboardNavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Enable keyboard navigation for the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.enabled">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.enabled">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.enabled">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable keyboard navigation for the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.enabled">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.enabled">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.enabled">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the focus border drawn
   * around elements while navigating through them.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder</a>
   *
   * @implspec focusBorder?: AccessibilityKeyboardNavigationFocusBorderOptions;
   *
   */
  @JSProperty("focusBorder")
  @Nullable
  AccessibilityKeyboardNavigationFocusBorderOptions getFocusBorder();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the focus border drawn
   * around elements while navigating through them.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.focusBorder</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.focusBorder</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.focusBorder</a>
   *
   * @implspec focusBorder?: AccessibilityKeyboardNavigationFocusBorderOptions;
   *
   */
  @JSProperty("focusBorder")
  void setFocusBorder(AccessibilityKeyboardNavigationFocusBorderOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Set the keyboard navigation mode for
   * the chart. Can be &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right
   * arrow keys move between points in a series, while up/down arrow keys move
   * between series. Up/down navigation acts intelligently to figure out which
   * series makes sense to move to from any given point.
   *
   * In &quot;serialize&quot; mode, points are instead navigated as a single list.
   * Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys will behave
   * like left/right. This is useful for unifying navigation behavior
   * with/without screen readers enabled.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.mode">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.mode</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.mode">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.mode</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.mode">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.mode</a>
   *
   * @implspec mode?: (&quot;normal&quot;|&quot;serialize&quot;);
   *
   */
  @JSProperty("mode")
  @Nullable
  Mode getMode();

  /**
   * (Highcharts, Highstock, Highmaps) Set the keyboard navigation mode for
   * the chart. Can be &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right
   * arrow keys move between points in a series, while up/down arrow keys move
   * between series. Up/down navigation acts intelligently to figure out which
   * series makes sense to move to from any given point.
   *
   * In &quot;serialize&quot; mode, points are instead navigated as a single list.
   * Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys will behave
   * like left/right. This is useful for unifying navigation behavior
   * with/without screen readers enabled.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.mode">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.mode</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.mode">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.mode</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.mode">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.mode</a>
   *
   * @implspec mode?: (&quot;normal&quot;|&quot;serialize&quot;);
   *
   */
  @JSProperty("mode")
  void setMode(Mode value);

  /**
   * (Highcharts, Highstock, Highmaps) Skip null points when navigating
   * through points with the keyboard.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.skipNullPoints">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.skipNullPoints</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.skipNullPoints">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.skipNullPoints</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.skipNullPoints">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.skipNullPoints</a>
   *
   * @implspec skipNullPoints?: boolean;
   *
   */
  @JSProperty("skipNullPoints")
  boolean getSkipNullPoints();

  /**
   * (Highcharts, Highstock, Highmaps) Skip null points when navigating
   * through points with the keyboard.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.skipNullPoints">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation.skipNullPoints</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation.skipNullPoints">https://api.highcharts.com/highstock/accessibility.keyboardNavigation.skipNullPoints</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.skipNullPoints">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation.skipNullPoints</a>
   *
   * @implspec skipNullPoints?: boolean;
   *
   */
  @JSProperty("skipNullPoints")
  void setSkipNullPoints(boolean value);

  /**
   */
  abstract class Mode extends JsEnum {
    public static final Mode NORMAL = JsEnum.of("normal");

    public static final Mode SERIALIZE = JsEnum.of("serialize");
  }
}
