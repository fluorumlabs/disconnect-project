package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A collection of options for buttons and
 * menus appearing in the exporting module.
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigation">https://api.highcharts.com/highcharts/navigation</a>
 * @see <a href="https://api.highcharts.com/highstock/navigation">https://api.highcharts.com/highstock/navigation</a>
 * @see <a href="https://api.highcharts.com/highmaps/navigation">https://api.highcharts.com/highmaps/navigation</a>
 *
 */
public interface NavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) A collection of options for buttons
   * appearing in the exporting module.
   *
   * In styled mode, the buttons are styled with the
   * <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions">https://api.highcharts.com/highcharts/navigation.buttonOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions">https://api.highcharts.com/highstock/navigation.buttonOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions">https://api.highcharts.com/highmaps/navigation.buttonOptions</a>
   *
   * @implspec buttonOptions?: NavigationButtonOptions;
   *
   */
  @JSProperty("buttonOptions")
  @Nullable
  NavigationButtonOptions getButtonOptions();

  /**
   * (Highcharts, Highstock, Highmaps) A collection of options for buttons
   * appearing in the exporting module.
   *
   * In styled mode, the buttons are styled with the
   * <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.buttonOptions">https://api.highcharts.com/highcharts/navigation.buttonOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.buttonOptions">https://api.highcharts.com/highstock/navigation.buttonOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.buttonOptions">https://api.highcharts.com/highmaps/navigation.buttonOptions</a>
   *
   * @implspec buttonOptions?: NavigationButtonOptions;
   *
   */
  @JSProperty("buttonOptions")
  void setButtonOptions(NavigationButtonOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the hover state of the
   * individual items within the popup menu appearing by default when the
   * export icon is clicked. The menu items are rendered in HTML.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.menuItemHoverStyle">https://api.highcharts.com/highcharts/navigation.menuItemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.menuItemHoverStyle">https://api.highcharts.com/highstock/navigation.menuItemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.menuItemHoverStyle">https://api.highcharts.com/highmaps/navigation.menuItemHoverStyle</a>
   *
   * @implspec menuItemHoverStyle?: CSSObject;
   *
   */
  @JSProperty("menuItemHoverStyle")
  @Nullable
  CSSObject getMenuItemHoverStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the hover state of the
   * individual items within the popup menu appearing by default when the
   * export icon is clicked. The menu items are rendered in HTML.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.menuItemHoverStyle">https://api.highcharts.com/highcharts/navigation.menuItemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.menuItemHoverStyle">https://api.highcharts.com/highstock/navigation.menuItemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.menuItemHoverStyle">https://api.highcharts.com/highmaps/navigation.menuItemHoverStyle</a>
   *
   * @implspec menuItemHoverStyle?: CSSObject;
   *
   */
  @JSProperty("menuItemHoverStyle")
  void setMenuItemHoverStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the individual items
   * within the popup menu appearing by default when the export icon is
   * clicked. The menu items are rendered in HTML. Font size defaults to
   * <code>11px</code> on desktop and <code>14px</code> on touch devices.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.menuItemStyle">https://api.highcharts.com/highcharts/navigation.menuItemStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.menuItemStyle">https://api.highcharts.com/highstock/navigation.menuItemStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.menuItemStyle">https://api.highcharts.com/highmaps/navigation.menuItemStyle</a>
   *
   * @implspec menuItemStyle?: CSSObject;
   *
   */
  @JSProperty("menuItemStyle")
  @Nullable
  CSSObject getMenuItemStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the individual items
   * within the popup menu appearing by default when the export icon is
   * clicked. The menu items are rendered in HTML. Font size defaults to
   * <code>11px</code> on desktop and <code>14px</code> on touch devices.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.menuItemStyle">https://api.highcharts.com/highcharts/navigation.menuItemStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.menuItemStyle">https://api.highcharts.com/highstock/navigation.menuItemStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.menuItemStyle">https://api.highcharts.com/highmaps/navigation.menuItemStyle</a>
   *
   * @implspec menuItemStyle?: CSSObject;
   *
   */
  @JSProperty("menuItemStyle")
  void setMenuItemStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the popup menu appearing
   * by default when the export icon is clicked. This menu is rendered in
   * HTML.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.menuStyle">https://api.highcharts.com/highcharts/navigation.menuStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.menuStyle">https://api.highcharts.com/highstock/navigation.menuStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.menuStyle">https://api.highcharts.com/highmaps/navigation.menuStyle</a>
   *
   * @implspec menuStyle?: CSSObject;
   *
   */
  @JSProperty("menuStyle")
  @Nullable
  CSSObject getMenuStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the popup menu appearing
   * by default when the export icon is clicked. This menu is rendered in
   * HTML.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation.menuStyle">https://api.highcharts.com/highcharts/navigation.menuStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation.menuStyle">https://api.highcharts.com/highstock/navigation.menuStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation.menuStyle">https://api.highcharts.com/highmaps/navigation.menuStyle</a>
   *
   * @implspec menuStyle?: CSSObject;
   *
   */
  @JSProperty("menuStyle")
  void setMenuStyle(CSSObject value);
}
