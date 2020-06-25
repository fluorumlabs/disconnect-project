package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( 'menu' | 'menuball' | 'exportIcon' | string | SymbolKeyValue ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
 *
 * In styled mode, export button styles can be applied with the
 * <code>.highcharts-contextbutton</code> class.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingButtonsOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alignment for the buttons.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Alignment for the buttons.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel spacing between
   * buttons.
   *
   */
  @JSProperty("buttonSpacing")
  double getButtonSpacing();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel spacing between
   * buttons.
   *
   */
  @JSProperty("buttonSpacing")
  void setButtonSpacing(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
   * button.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
   * button.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Pixel height of the buttons.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Pixel height of the buttons.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
   * appearing from the button.
   *
   */
  @JSProperty("menuClassName")
  @Nullable
  String getMenuClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
   * appearing from the button.
   *
   */
  @JSProperty("menuClassName")
  void setMenuClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
   * to config options for the menu items. The config options are defined in
   * the <code>menuItemDefinitions</code> option.
   *
   * By default, there is the &quot;View in full screen&quot; and &quot;Print&quot; menu items,
   * plus one menu item for each of the available export types.
   *
   */
  @JSProperty("menuItems")
  @Nullable
  String[] getMenuItems();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
   * to config options for the menu items. The config options are defined in
   * the <code>menuItemDefinitions</code> option.
   *
   * By default, there is the &quot;View in full screen&quot; and &quot;Print&quot; menu items,
   * plus one menu item for each of the available export types.
   *
   */
  @JSProperty("menuItems")
  void setMenuItems(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
   * on the button directly instead of the popup menu.
   *
   */
  @JSProperty("onclick")
  @Nullable
  JsFunction getOnclick();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
   * on the button directly instead of the popup menu.
   *
   */
  @JSProperty("onclick")
  void setOnclick(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
   * Points to a definition function in the <code>Highcharts.Renderer.symbols</code>
   * collection. The default <code>exportIcon</code> function is part of the exporting
   * module. Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,
   * &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.
   *
   */
  @JSProperty("symbol")
  @Nullable
  Unknown /* ( 'menu' | 'menuball' | 'exportIcon' | string | SymbolKeyValue ) */ getSymbol();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
   * Points to a definition function in the <code>Highcharts.Renderer.symbols</code>
   * collection. The default <code>exportIcon</code> function is part of the exporting
   * module. Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,
   * &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.
   *
   */
  @JSProperty("symbol")
  void setSymbol(@Nullable Symbol value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
   * Points to a definition function in the <code>Highcharts.Renderer.symbols</code>
   * collection. The default <code>exportIcon</code> function is part of the exporting
   * module. Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,
   * &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.
   *
   */
  @JSProperty("symbol")
  void setSymbol(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) See
   * navigation.buttonOptions.symbolFill.
   *
   */
  @JSProperty("symbolFill")
  @Nullable
  String getSymbolFill();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) See
   * navigation.buttonOptions.symbolFill.
   *
   */
  @JSProperty("symbolFill")
  void setSymbolFill(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the symbol on
   * the button.
   *
   */
  @JSProperty("symbolSize")
  double getSymbolSize();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the symbol on
   * the button.
   *
   */
  @JSProperty("symbolSize")
  void setSymbolSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
   * or line.
   *
   */
  @JSProperty("symbolStroke")
  @Nullable
  String getSymbolStroke();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
   * or line.
   *
   */
  @JSProperty("symbolStroke")
  void setSymbolStroke(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
   * symbol on the button.
   *
   */
  @JSProperty("symbolStrokeWidth")
  double getSymbolStrokeWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
   * symbol on the button.
   *
   */
  @JSProperty("symbolStrokeWidth")
  void setSymbolStrokeWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the center of
   * the symbol inside the button.
   *
   */
  @JSProperty("symbolX")
  double getSymbolX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the center of
   * the symbol inside the button.
   *
   */
  @JSProperty("symbolX")
  void setSymbolX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the center of
   * the symbol inside the button.
   *
   */
  @JSProperty("symbolY")
  double getSymbolY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the center of
   * the symbol inside the button.
   *
   */
  @JSProperty("symbolY")
  void setSymbolY(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
   * individual button.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
   * individual button.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
   * button theme. The object accepts SVG properties like <code>stroke-width</code>,
   * <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the
   * <code>states.hover</code> and <code>states.select</code> objects.
   *
   */
  @JSProperty("theme")
  @Nullable
  ExportingButtonsContextButtonThemeOptions getTheme();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
   * button theme. The object accepts SVG properties like <code>stroke-width</code>,
   * <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the
   * <code>states.hover</code> and <code>states.select</code> objects.
   *
   */
  @JSProperty("theme")
  void setTheme(@Nullable ExportingButtonsContextButtonThemeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
   * that is used for the button's title tooltip. When the key is
   * <code>contextButtonTitle</code>, it refers to lang.contextButtonTitle that defaults
   * to &quot;Chart context menu&quot;.
   *
   */
  @JSProperty("titleKey")
  @Nullable
  String getTitleKey();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
   * that is used for the button's title tooltip. When the key is
   * <code>contextButtonTitle</code>, it refers to lang.contextButtonTitle that defaults
   * to &quot;Chart context menu&quot;.
   *
   */
  @JSProperty("titleKey")
  void setTitleKey(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * buttons. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * buttons. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the button.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the button.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
   * button relative to the <code>align</code> option.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
   * button relative to the <code>align</code> option.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
   * button's position relative to its <code>verticalAlign</code>.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
   * button's position relative to its <code>verticalAlign</code>.
   *
   */
  @JSProperty("y")
  void setY(double value);

  abstract class Symbol extends JsEnum {
    public static final Symbol MENU = JsEnum.of("menu");

    public static final Symbol MENUBALL = JsEnum.of("menuball");

    public static final Symbol EXPORTICON = JsEnum.of("exportIcon");

    public static final Symbol ARC = JsEnum.of("arc");

    public static final Symbol CALLOUT = JsEnum.of("callout");

    public static final Symbol CIRCLE = JsEnum.of("circle");

    public static final Symbol DIAMOND = JsEnum.of("diamond");

    public static final Symbol SQUARE = JsEnum.of("square");

    public static final Symbol TRIANGLE = JsEnum.of("triangle");

    public static final Symbol TRIANGLE_DOWN = JsEnum.of("triangle-down");
  }

  class Builder {
    private final ExportingButtonsOptionsObject object = Any.empty();

    public ExportingButtonsOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alignment for the buttons.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel spacing between
     * buttons.
     *
     */
    public Builder buttonSpacing(double value) {
      object.setButtonSpacing(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
     * button.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Pixel height of the buttons.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
     * appearing from the button.
     *
     */
    public Builder menuClassName(@Nullable String value) {
      object.setMenuClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
     * to config options for the menu items. The config options are defined in
     * the <code>menuItemDefinitions</code> option.
     *
     * By default, there is the &quot;View in full screen&quot; and &quot;Print&quot; menu items,
     * plus one menu item for each of the available export types.
     *
     */
    public Builder menuItems(String[] value) {
      object.setMenuItems(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
     * on the button directly instead of the popup menu.
     *
     */
    public Builder onclick(@Nullable JsFunction value) {
      object.setOnclick(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
     * Points to a definition function in the <code>Highcharts.Renderer.symbols</code>
     * collection. The default <code>exportIcon</code> function is part of the exporting
     * module. Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,
     * &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.
     *
     */
    public Builder symbol(@Nullable Symbol value) {
      object.setSymbol(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
     * Points to a definition function in the <code>Highcharts.Renderer.symbols</code>
     * collection. The default <code>exportIcon</code> function is part of the exporting
     * module. Possible values are &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot;,
     * &quot;triangle-down&quot;, &quot;menu&quot;, &quot;menuball&quot; or custom shape.
     *
     */
    public Builder symbol(@Nullable String value) {
      object.setSymbol(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) See
     * navigation.buttonOptions.symbolFill.
     *
     */
    public Builder symbolFill(@Nullable String value) {
      object.setSymbolFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the symbol on
     * the button.
     *
     */
    public Builder symbolSize(double value) {
      object.setSymbolSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
     * or line.
     *
     */
    public Builder symbolStroke(@Nullable String value) {
      object.setSymbolStroke(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
     * symbol on the button.
     *
     */
    public Builder symbolStrokeWidth(double value) {
      object.setSymbolStrokeWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the center of
     * the symbol inside the button.
     *
     */
    public Builder symbolX(double value) {
      object.setSymbolX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the center of
     * the symbol inside the button.
     *
     */
    public Builder symbolY(double value) {
      object.setSymbolY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
     * individual button.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
     * button theme. The object accepts SVG properties like <code>stroke-width</code>,
     * <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the
     * <code>states.hover</code> and <code>states.select</code> objects.
     *
     */
    public Builder theme(@Nullable ExportingButtonsContextButtonThemeOptions value) {
      object.setTheme(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
     * that is used for the button's title tooltip. When the key is
     * <code>contextButtonTitle</code>, it refers to lang.contextButtonTitle that defaults
     * to &quot;Chart context menu&quot;.
     *
     */
    public Builder titleKey(@Nullable String value) {
      object.setTitleKey(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * buttons. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the button.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
     * button relative to the <code>align</code> option.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
     * button's position relative to its <code>verticalAlign</code>.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
