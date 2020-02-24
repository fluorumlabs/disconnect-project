package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for the export button.
 *
 * In styled mode, export button styles can be applied with the
 * <code>.highcharts-contextbutton</code> class.
 *
 * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton">https://api.highcharts.com/highcharts/exporting.buttons.contextButton</a>
 * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton">https://api.highcharts.com/highstock/exporting.buttons.contextButton</a>
 * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton">https://api.highcharts.com/highmaps/exporting.buttons.contextButton</a>
 *
 */
public interface ExportingButtonsContextButtonOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) This option is deprecated, use titleKey
   * instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton._titleKey">https://api.highcharts.com/highcharts/exporting.buttons.contextButton._titleKey</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton._titleKey">https://api.highcharts.com/highstock/exporting.buttons.contextButton._titleKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton._titleKey">https://api.highcharts.com/highmaps/exporting.buttons.contextButton._titleKey</a>
   *
   * @implspec _titleKey?: string;
   *
   */
  @JSProperty("_titleKey")
  @Nullable
  String get_titleKey();

  /**
   * (Highcharts, Highstock, Highmaps) This option is deprecated, use titleKey
   * instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton._titleKey">https://api.highcharts.com/highcharts/exporting.buttons.contextButton._titleKey</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton._titleKey">https://api.highcharts.com/highstock/exporting.buttons.contextButton._titleKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton._titleKey">https://api.highcharts.com/highmaps/exporting.buttons.contextButton._titleKey</a>
   *
   * @implspec _titleKey?: string;
   *
   */
  @JSProperty("_titleKey")
  void set_titleKey(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Alignment for the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.align">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.align</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.align">https://api.highcharts.com/highstock/exporting.buttons.contextButton.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.align">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) Alignment for the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.align">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.align</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.align">https://api.highcharts.com/highstock/exporting.buttons.contextButton.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.align">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel spacing between buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.buttonSpacing">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.buttonSpacing">https://api.highcharts.com/highstock/exporting.buttons.contextButton.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.buttonSpacing">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.buttonSpacing</a>
   *
   * @implspec buttonSpacing?: number;
   *
   */
  @JSProperty("buttonSpacing")
  double getButtonSpacing();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel spacing between buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.buttonSpacing">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.buttonSpacing">https://api.highcharts.com/highstock/exporting.buttons.contextButton.buttonSpacing</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.buttonSpacing">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.buttonSpacing</a>
   *
   * @implspec buttonSpacing?: number;
   *
   */
  @JSProperty("buttonSpacing")
  void setButtonSpacing(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The class name of the context button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.className">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.className</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.className">https://api.highcharts.com/highstock/exporting.buttons.contextButton.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.className">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps) The class name of the context button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.className">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.className</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.className">https://api.highcharts.com/highstock/exporting.buttons.contextButton.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.className">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.enabled">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.enabled">https://api.highcharts.com/highstock/exporting.buttons.contextButton.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.enabled">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.enabled">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.enabled">https://api.highcharts.com/highstock/exporting.buttons.contextButton.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.enabled">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Pixel height of the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.height">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.height</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.height">https://api.highcharts.com/highstock/exporting.buttons.contextButton.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.height">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps) Pixel height of the buttons.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.height">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.height</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.height">https://api.highcharts.com/highstock/exporting.buttons.contextButton.height</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.height">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The class name of the menu appearing
   * from the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuClassName">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuClassName</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuClassName">https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuClassName</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuClassName">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuClassName</a>
   *
   * @implspec menuClassName?: string;
   *
   */
  @JSProperty("menuClassName")
  @Nullable
  String getMenuClassName();

  /**
   * (Highcharts, Highstock, Highmaps) The class name of the menu appearing
   * from the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuClassName">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuClassName</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuClassName">https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuClassName</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuClassName">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuClassName</a>
   *
   * @implspec menuClassName?: string;
   *
   */
  @JSProperty("menuClassName")
  void setMenuClassName(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A collection of strings pointing to
   * config options for the menu items. The config options are defined in the
   * <code>menuItemDefinitions</code> option.
   *
   * By default, there is the &quot;Print&quot; menu item plus one menu item for each of
   * the available export types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuItems">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuItems</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuItems">https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuItems</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuItems">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuItems</a>
   *
   * @implspec menuItems?: Array<string>;
   *
   */
  @JSProperty("menuItems")
  @Nullable
  String[] getMenuItems();

  /**
   * (Highcharts, Highstock, Highmaps) A collection of strings pointing to
   * config options for the menu items. The config options are defined in the
   * <code>menuItemDefinitions</code> option.
   *
   * By default, there is the &quot;Print&quot; menu item plus one menu item for each of
   * the available export types.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuItems">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.menuItems</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuItems">https://api.highcharts.com/highstock/exporting.buttons.contextButton.menuItems</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuItems">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.menuItems</a>
   *
   * @implspec menuItems?: Array<string>;
   *
   */
  @JSProperty("menuItems")
  void setMenuItems(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps) A click handler callback to use on the
   * button directly instead of the popup menu.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.onclick">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.onclick</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.onclick">https://api.highcharts.com/highstock/exporting.buttons.contextButton.onclick</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.onclick">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.onclick</a>
   *
   * @implspec onclick?: () =&gt; void;
   *
   */
  @JSProperty("onclick")
  @Nullable
  Onclick getOnclick();

  /**
   * (Highcharts, Highstock, Highmaps) A click handler callback to use on the
   * button directly instead of the popup menu.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.onclick">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.onclick</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.onclick">https://api.highcharts.com/highstock/exporting.buttons.contextButton.onclick</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.onclick">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.onclick</a>
   *
   * @implspec onclick?: () =&gt; void;
   *
   */
  @JSProperty("onclick")
  void setOnclick(Onclick value);

  /**
   * (Highcharts, Highstock, Highmaps) The symbol for the button. Points to a
   * definition function in the <code>Highcharts.Renderer.symbols</code> collection. The
   * default <code>exportIcon</code> function is part of the exporting module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbol">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbol">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbol</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbol">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbol</a>
   *
   * @implspec symbol?: (&quot;circle&quot;|&quot;diamond&quot;|&quot;menu&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;|&quot;exportIcon&quot;);
   *
   */
  @JSProperty("symbol")
  @Nullable
  Symbol getSymbol();

  /**
   * (Highcharts, Highstock, Highmaps) The symbol for the button. Points to a
   * definition function in the <code>Highcharts.Renderer.symbols</code> collection. The
   * default <code>exportIcon</code> function is part of the exporting module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbol">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbol</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbol">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbol</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbol">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbol</a>
   *
   * @implspec symbol?: (&quot;circle&quot;|&quot;diamond&quot;|&quot;menu&quot;|&quot;square&quot;|&quot;triangle&quot;|&quot;triangle-down&quot;|&quot;exportIcon&quot;);
   *
   */
  @JSProperty("symbol")
  void setSymbol(Symbol value);

  /**
   * (Highcharts, Highstock, Highmaps) See
   * navigation.buttonOptions.symbolFill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolFill">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolFill">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolFill">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolFill</a>
   *
   * @implspec symbolFill?: ColorString;
   *
   */
  @JSProperty("symbolFill")
  @Nullable
  String getSymbolFill();

  /**
   * (Highcharts, Highstock, Highmaps) See
   * navigation.buttonOptions.symbolFill.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolFill">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolFill">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolFill</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolFill">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolFill</a>
   *
   * @implspec symbolFill?: ColorString;
   *
   */
  @JSProperty("symbolFill")
  void setSymbolFill(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel size of the symbol on the
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolSize">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolSize">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolSize">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolSize</a>
   *
   * @implspec symbolSize?: number;
   *
   */
  @JSProperty("symbolSize")
  double getSymbolSize();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel size of the symbol on the
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolSize">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolSize">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolSize</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolSize">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolSize</a>
   *
   * @implspec symbolSize?: number;
   *
   */
  @JSProperty("symbolSize")
  void setSymbolSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the symbol's stroke or
   * line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStroke">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStroke">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStroke">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStroke</a>
   *
   * @implspec symbolStroke?: ColorString;
   *
   */
  @JSProperty("symbolStroke")
  @Nullable
  String getSymbolStroke();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the symbol's stroke or
   * line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStroke">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStroke">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStroke</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStroke">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStroke</a>
   *
   * @implspec symbolStroke?: ColorString;
   *
   */
  @JSProperty("symbolStroke")
  void setSymbolStroke(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the symbol on
   * the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStrokeWidth">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStrokeWidth">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStrokeWidth">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStrokeWidth</a>
   *
   * @implspec symbolStrokeWidth?: number;
   *
   */
  @JSProperty("symbolStrokeWidth")
  double getSymbolStrokeWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel stroke width of the symbol on
   * the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStrokeWidth">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStrokeWidth">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolStrokeWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStrokeWidth">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolStrokeWidth</a>
   *
   * @implspec symbolStrokeWidth?: number;
   *
   */
  @JSProperty("symbolStrokeWidth")
  void setSymbolStrokeWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolX">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolX</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolX">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolX</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolX">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolX</a>
   *
   * @implspec symbolX?: number;
   *
   */
  @JSProperty("symbolX")
  double getSymbolX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolX">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolX</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolX">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolX</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolX">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolX</a>
   *
   * @implspec symbolX?: number;
   *
   */
  @JSProperty("symbolX")
  void setSymbolX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolY">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolY</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolY">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolY</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolY">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolY</a>
   *
   * @implspec symbolY?: number;
   *
   */
  @JSProperty("symbolY")
  double getSymbolY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position of the center of the
   * symbol inside the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolY">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.symbolY</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolY">https://api.highcharts.com/highstock/exporting.buttons.contextButton.symbolY</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolY">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.symbolY</a>
   *
   * @implspec symbolY?: number;
   *
   */
  @JSProperty("symbolY")
  void setSymbolY(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A text string to add to the individual
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.text">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.text</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.text">https://api.highcharts.com/highstock/exporting.buttons.contextButton.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.text">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) A text string to add to the individual
   * button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.text">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.text</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.text">https://api.highcharts.com/highstock/exporting.buttons.contextButton.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.text">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A configuration object for the button
   * theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code>
   * and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code>
   * and <code>states.select</code> objects.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.theme">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.theme</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.theme">https://api.highcharts.com/highstock/exporting.buttons.contextButton.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.theme">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.theme</a>
   *
   * @implspec theme?: ExportingButtonsContextButtonThemeOptions;
   *
   */
  @JSProperty("theme")
  @Nullable
  ExportingButtonsContextButtonThemeOptions getTheme();

  /**
   * (Highcharts, Highstock, Highmaps) A configuration object for the button
   * theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code>
   * and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code>
   * and <code>states.select</code> objects.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.theme">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.theme</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.theme">https://api.highcharts.com/highstock/exporting.buttons.contextButton.theme</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.theme">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.theme</a>
   *
   * @implspec theme?: ExportingButtonsContextButtonThemeOptions;
   *
   */
  @JSProperty("theme")
  void setTheme(ExportingButtonsContextButtonThemeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The key to a lang option setting that
   * is used for the button's title tooltip. When the key is
   * <code>contextButtonTitle</code>, it refers to lang.contextButtonTitle that defaults
   * to &quot;Chart context menu&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.titleKey">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.titleKey</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.titleKey">https://api.highcharts.com/highstock/exporting.buttons.contextButton.titleKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.titleKey">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.titleKey</a>
   *
   * @implspec titleKey?: string;
   *
   */
  @JSProperty("titleKey")
  @Nullable
  String getTitleKey();

  /**
   * (Highcharts, Highstock, Highmaps) The key to a lang option setting that
   * is used for the button's title tooltip. When the key is
   * <code>contextButtonTitle</code>, it refers to lang.contextButtonTitle that defaults
   * to &quot;Chart context menu&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.titleKey">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.titleKey</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.titleKey">https://api.highcharts.com/highstock/exporting.buttons.contextButton.titleKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.titleKey">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.titleKey</a>
   *
   * @implspec titleKey?: string;
   *
   */
  @JSProperty("titleKey")
  void setTitleKey(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the buttons.
   * Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.verticalAlign">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.verticalAlign">https://api.highcharts.com/highstock/exporting.buttons.contextButton.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.verticalAlign">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the buttons.
   * Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.verticalAlign">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.verticalAlign">https://api.highcharts.com/highstock/exporting.buttons.contextButton.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.verticalAlign">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.width">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.width</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.width">https://api.highcharts.com/highstock/exporting.buttons.contextButton.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.width">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.width">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.width</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.width">https://api.highcharts.com/highstock/exporting.buttons.contextButton.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.width">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal position of the button
   * relative to the <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.x">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.x</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.x">https://api.highcharts.com/highstock/exporting.buttons.contextButton.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.x">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal position of the button
   * relative to the <code>align</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.x">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.x</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.x">https://api.highcharts.com/highstock/exporting.buttons.contextButton.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.x">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the button's
   * position relative to its <code>verticalAlign</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.y">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.y</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.y">https://api.highcharts.com/highstock/exporting.buttons.contextButton.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.y">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the button's
   * position relative to its <code>verticalAlign</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton.y">https://api.highcharts.com/highcharts/exporting.buttons.contextButton.y</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton.y">https://api.highcharts.com/highstock/exporting.buttons.contextButton.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton.y">https://api.highcharts.com/highmaps/exporting.buttons.contextButton.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align CENTER = JsEnum.of("center");

    public static final Align LEFT = JsEnum.of("left");

    public static final Align RIGHT = JsEnum.of("right");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Onclick extends Any {
    void apply();
  }

  /**
   */
  abstract class Symbol extends JsEnum {
    public static final Symbol CIRCLE = JsEnum.of("circle");

    public static final Symbol DIAMOND = JsEnum.of("diamond");

    public static final Symbol MENU = JsEnum.of("menu");

    public static final Symbol SQUARE = JsEnum.of("square");

    public static final Symbol TRIANGLE = JsEnum.of("triangle");

    public static final Symbol TRIANGLE_DOWN = JsEnum.of("triangle-down");

    public static final Symbol EXPORTICON = JsEnum.of("exportIcon");
  }

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
