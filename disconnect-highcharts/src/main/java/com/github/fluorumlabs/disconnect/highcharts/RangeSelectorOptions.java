package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The range selector is a tool for selecting ranges to display
 * within the chart. It provides buttons to select preconfigured ranges in the
 * chart, like 1 day, 1 week, 1 month etc. It also provides input boxes where
 * min and max dates can be manually input.
 *
 * @see <a href="https://api.highcharts.com/highstock/rangeSelector">https://api.highcharts.com/highstock/rangeSelector</a>
 *
 */
public interface RangeSelectorOptions extends Any {
  /**
   * (Highstock) Whether to enable all buttons from the start. By default
   * buttons are only enabled if the corresponding time range exists on the X
   * axis, but enabling all buttons allows for dynamically loading different
   * time ranges.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.allButtonsEnabled">https://api.highcharts.com/highstock/rangeSelector.allButtonsEnabled</a>
   *
   * @implspec allButtonsEnabled?: boolean;
   *
   */
  @JSProperty("allButtonsEnabled")
  boolean getAllButtonsEnabled();

  /**
   * (Highstock) Whether to enable all buttons from the start. By default
   * buttons are only enabled if the corresponding time range exists on the X
   * axis, but enabling all buttons allows for dynamically loading different
   * time ranges.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.allButtonsEnabled">https://api.highcharts.com/highstock/rangeSelector.allButtonsEnabled</a>
   *
   * @implspec allButtonsEnabled?: boolean;
   *
   */
  @JSProperty("allButtonsEnabled")
  void setAllButtonsEnabled(boolean value);

  /**
   * (Highstock) Positioning for the button row.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttonPosition">https://api.highcharts.com/highstock/rangeSelector.buttonPosition</a>
   *
   * @implspec buttonPosition?: RangeSelectorButtonPositionOptions;
   *
   */
  @JSProperty("buttonPosition")
  @Nullable
  RangeSelectorButtonPositionOptions getButtonPosition();

  /**
   * (Highstock) Positioning for the button row.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttonPosition">https://api.highcharts.com/highstock/rangeSelector.buttonPosition</a>
   *
   * @implspec buttonPosition?: RangeSelectorButtonPositionOptions;
   *
   */
  @JSProperty("buttonPosition")
  void setButtonPosition(RangeSelectorButtonPositionOptions value);

  /**
   * (Highstock) An array of configuration objects for the buttons.
   *
   * Defaults to
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons">https://api.highcharts.com/highstock/rangeSelector.buttons</a>
   *
   * @implspec buttons?: Array<RangeSelectorButtonsOptions>;
   *
   */
  @JSProperty("buttons")
  @Nullable
  Array<RangeSelectorButtonsOptions> getButtons();

  /**
   * (Highstock) An array of configuration objects for the buttons.
   *
   * Defaults to
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons">https://api.highcharts.com/highstock/rangeSelector.buttons</a>
   *
   * @implspec buttons?: Array<RangeSelectorButtonsOptions>;
   *
   */
  @JSProperty("buttons")
  void setButtons(Array<RangeSelectorButtonsOptions> value);

  /**
   * (Highstock) The space in pixels between the buttons in the range
   * selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttonSpacing">https://api.highcharts.com/highstock/rangeSelector.buttonSpacing</a>
   *
   * @implspec buttonSpacing?: number;
   *
   */
  @JSProperty("buttonSpacing")
  double getButtonSpacing();

  /**
   * (Highstock) The space in pixels between the buttons in the range
   * selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttonSpacing">https://api.highcharts.com/highstock/rangeSelector.buttonSpacing</a>
   *
   * @implspec buttonSpacing?: number;
   *
   */
  @JSProperty("buttonSpacing")
  void setButtonSpacing(double value);

  /**
   * (Highstock) A collection of attributes for the buttons. The object takes
   * SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>,
   * a collection of CSS properties for the text.
   *
   * The object can also be extended with states, so you can set
   * presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button states.
   *
   * CSS styles for the text label.
   *
   * In styled mode, the buttons are styled by the
   * <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its
   * different states.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttonTheme">https://api.highcharts.com/highstock/rangeSelector.buttonTheme</a>
   *
   * @implspec buttonTheme?: CSSObject;
   *
   */
  @JSProperty("buttonTheme")
  @Nullable
  CSSObject getButtonTheme();

  /**
   * (Highstock) A collection of attributes for the buttons. The object takes
   * SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>,
   * a collection of CSS properties for the text.
   *
   * The object can also be extended with states, so you can set
   * presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button states.
   *
   * CSS styles for the text label.
   *
   * In styled mode, the buttons are styled by the
   * <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its
   * different states.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttonTheme">https://api.highcharts.com/highstock/rangeSelector.buttonTheme</a>
   *
   * @implspec buttonTheme?: CSSObject;
   *
   */
  @JSProperty("buttonTheme")
  void setButtonTheme(CSSObject value);

  /**
   * (Highstock) Enable or disable the range selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.enabled">https://api.highcharts.com/highstock/rangeSelector.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the range selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.enabled">https://api.highcharts.com/highstock/rangeSelector.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) When the rangeselector is floating, the plot area does not
   * reserve space for it. This opens for positioning anywhere on the chart.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.floating">https://api.highcharts.com/highstock/rangeSelector.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highstock) When the rangeselector is floating, the plot area does not
   * reserve space for it. This opens for positioning anywhere on the chart.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.floating">https://api.highcharts.com/highstock/rangeSelector.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highstock) Deprecated. The height of the range selector. Currently it is
   * calculated dynamically.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.height">https://api.highcharts.com/highstock/rangeSelector.height</a>
   *
   * @implspec height?: (number|undefined);
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) Deprecated. The height of the range selector. Currently it is
   * calculated dynamically.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.height">https://api.highcharts.com/highstock/rangeSelector.height</a>
   *
   * @implspec height?: (number|undefined);
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) The border color of the date input boxes.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxBorderColor">https://api.highcharts.com/highstock/rangeSelector.inputBoxBorderColor</a>
   *
   * @implspec inputBoxBorderColor?: ColorString;
   *
   */
  @JSProperty("inputBoxBorderColor")
  @Nullable
  String getInputBoxBorderColor();

  /**
   * (Highstock) The border color of the date input boxes.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxBorderColor">https://api.highcharts.com/highstock/rangeSelector.inputBoxBorderColor</a>
   *
   * @implspec inputBoxBorderColor?: ColorString;
   *
   */
  @JSProperty("inputBoxBorderColor")
  void setInputBoxBorderColor(String value);

  /**
   * (Highstock) The pixel height of the date input boxes.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxHeight">https://api.highcharts.com/highstock/rangeSelector.inputBoxHeight</a>
   *
   * @implspec inputBoxHeight?: number;
   *
   */
  @JSProperty("inputBoxHeight")
  double getInputBoxHeight();

  /**
   * (Highstock) The pixel height of the date input boxes.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxHeight">https://api.highcharts.com/highstock/rangeSelector.inputBoxHeight</a>
   *
   * @implspec inputBoxHeight?: number;
   *
   */
  @JSProperty("inputBoxHeight")
  void setInputBoxHeight(double value);

  /**
   * (Highstock) CSS for the container DIV holding the input boxes. Deprecated
   * as of 1.2.5. Use inputPosition instead.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxStyle">https://api.highcharts.com/highstock/rangeSelector.inputBoxStyle</a>
   *
   * @implspec inputBoxStyle?: CSSObject;
   *
   */
  @JSProperty("inputBoxStyle")
  @Nullable
  CSSObject getInputBoxStyle();

  /**
   * (Highstock) CSS for the container DIV holding the input boxes. Deprecated
   * as of 1.2.5. Use inputPosition instead.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxStyle">https://api.highcharts.com/highstock/rangeSelector.inputBoxStyle</a>
   *
   * @implspec inputBoxStyle?: CSSObject;
   *
   */
  @JSProperty("inputBoxStyle")
  void setInputBoxStyle(CSSObject value);

  /**
   * (Highstock) The pixel width of the date input boxes.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxWidth">https://api.highcharts.com/highstock/rangeSelector.inputBoxWidth</a>
   *
   * @implspec inputBoxWidth?: number;
   *
   */
  @JSProperty("inputBoxWidth")
  double getInputBoxWidth();

  /**
   * (Highstock) The pixel width of the date input boxes.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputBoxWidth">https://api.highcharts.com/highstock/rangeSelector.inputBoxWidth</a>
   *
   * @implspec inputBoxWidth?: number;
   *
   */
  @JSProperty("inputBoxWidth")
  void setInputBoxWidth(double value);

  /**
   * (Highstock) The date format in the input boxes when not selected for
   * editing. Defaults to <code>%b %e, %Y</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputDateFormat">https://api.highcharts.com/highstock/rangeSelector.inputDateFormat</a>
   *
   * @implspec inputDateFormat?: string;
   *
   */
  @JSProperty("inputDateFormat")
  @Nullable
  String getInputDateFormat();

  /**
   * (Highstock) The date format in the input boxes when not selected for
   * editing. Defaults to <code>%b %e, %Y</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputDateFormat">https://api.highcharts.com/highstock/rangeSelector.inputDateFormat</a>
   *
   * @implspec inputDateFormat?: string;
   *
   */
  @JSProperty("inputDateFormat")
  void setInputDateFormat(String value);

  /**
   * (Highstock) A custom callback function to parse values entered in the
   * input boxes and return a valid JavaScript time as milliseconds since
   * 1970.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputDateParser">https://api.highcharts.com/highstock/rangeSelector.inputDateParser</a>
   *
   * @implspec inputDateParser?: RangeSelectorParseCallbackFunction;
   *
   */
  @JSProperty("inputDateParser")
  @Nullable
  RangeSelectorParseCallbackFunction getInputDateParser();

  /**
   * (Highstock) A custom callback function to parse values entered in the
   * input boxes and return a valid JavaScript time as milliseconds since
   * 1970.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputDateParser">https://api.highcharts.com/highstock/rangeSelector.inputDateParser</a>
   *
   * @implspec inputDateParser?: RangeSelectorParseCallbackFunction;
   *
   */
  @JSProperty("inputDateParser")
  void setInputDateParser(RangeSelectorParseCallbackFunction value);

  /**
   * (Highstock) The date format in the input boxes when they are selected for
   * editing. This must be a format that is recognized by JavaScript
   * Date.parse.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputEditDateFormat">https://api.highcharts.com/highstock/rangeSelector.inputEditDateFormat</a>
   *
   * @implspec inputEditDateFormat?: string;
   *
   */
  @JSProperty("inputEditDateFormat")
  @Nullable
  String getInputEditDateFormat();

  /**
   * (Highstock) The date format in the input boxes when they are selected for
   * editing. This must be a format that is recognized by JavaScript
   * Date.parse.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputEditDateFormat">https://api.highcharts.com/highstock/rangeSelector.inputEditDateFormat</a>
   *
   * @implspec inputEditDateFormat?: string;
   *
   */
  @JSProperty("inputEditDateFormat")
  void setInputEditDateFormat(String value);

  /**
   * (Highstock) Enable or disable the date input boxes. Defaults to enabled
   * when there is enough space, disabled if not (typically mobile).
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputEnabled">https://api.highcharts.com/highstock/rangeSelector.inputEnabled</a>
   *
   * @implspec inputEnabled?: boolean;
   *
   */
  @JSProperty("inputEnabled")
  boolean getInputEnabled();

  /**
   * (Highstock) Enable or disable the date input boxes. Defaults to enabled
   * when there is enough space, disabled if not (typically mobile).
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputEnabled">https://api.highcharts.com/highstock/rangeSelector.inputEnabled</a>
   *
   * @implspec inputEnabled?: boolean;
   *
   */
  @JSProperty("inputEnabled")
  void setInputEnabled(boolean value);

  /**
   * (Highstock) Positioning for the input boxes. Allowed properties are
   * <code>align</code>, <code>x</code> and <code>y</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition">https://api.highcharts.com/highstock/rangeSelector.inputPosition</a>
   *
   * @implspec inputPosition?: RangeSelectorInputPositionOptions;
   *
   */
  @JSProperty("inputPosition")
  @Nullable
  RangeSelectorInputPositionOptions getInputPosition();

  /**
   * (Highstock) Positioning for the input boxes. Allowed properties are
   * <code>align</code>, <code>x</code> and <code>y</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputPosition">https://api.highcharts.com/highstock/rangeSelector.inputPosition</a>
   *
   * @implspec inputPosition?: RangeSelectorInputPositionOptions;
   *
   */
  @JSProperty("inputPosition")
  void setInputPosition(RangeSelectorInputPositionOptions value);

  /**
   * (Highstock) CSS for the HTML inputs in the range selector.
   *
   * In styled mode, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when
   * active.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputStyle">https://api.highcharts.com/highstock/rangeSelector.inputStyle</a>
   *
   * @implspec inputStyle?: CSSObject;
   *
   */
  @JSProperty("inputStyle")
  @Nullable
  CSSObject getInputStyle();

  /**
   * (Highstock) CSS for the HTML inputs in the range selector.
   *
   * In styled mode, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when
   * active.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.inputStyle">https://api.highcharts.com/highstock/rangeSelector.inputStyle</a>
   *
   * @implspec inputStyle?: CSSObject;
   *
   */
  @JSProperty("inputStyle")
  void setInputStyle(CSSObject value);

  /**
   * (Highstock) CSS styles for the labels - the Zoom, From and To texts.
   *
   * In styled mode, the labels are styled by the <code>.highcharts-range-label</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.labelStyle">https://api.highcharts.com/highstock/rangeSelector.labelStyle</a>
   *
   * @implspec labelStyle?: CSSObject;
   *
   */
  @JSProperty("labelStyle")
  @Nullable
  CSSObject getLabelStyle();

  /**
   * (Highstock) CSS styles for the labels - the Zoom, From and To texts.
   *
   * In styled mode, the labels are styled by the <code>.highcharts-range-label</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.labelStyle">https://api.highcharts.com/highstock/rangeSelector.labelStyle</a>
   *
   * @implspec labelStyle?: CSSObject;
   *
   */
  @JSProperty("labelStyle")
  void setLabelStyle(CSSObject value);

  /**
   * (Highstock) The index of the button to appear pre-selected.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.selected">https://api.highcharts.com/highstock/rangeSelector.selected</a>
   *
   * @implspec selected?: number;
   *
   */
  @JSProperty("selected")
  double getSelected();

  /**
   * (Highstock) The index of the button to appear pre-selected.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.selected">https://api.highcharts.com/highstock/rangeSelector.selected</a>
   *
   * @implspec selected?: number;
   *
   */
  @JSProperty("selected")
  void setSelected(double value);

  /**
   * (Highstock) The vertical alignment of the rangeselector box. Allowed
   * properties are <code>top</code>, <code>middle</code>, <code>bottom</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.verticalAlign">https://api.highcharts.com/highstock/rangeSelector.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highstock) The vertical alignment of the rangeselector box. Allowed
   * properties are <code>top</code>, <code>middle</code>, <code>bottom</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.verticalAlign">https://api.highcharts.com/highstock/rangeSelector.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highstock) The x offset of the range selector relative to its horizontal
   * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.x">https://api.highcharts.com/highstock/rangeSelector.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock) The x offset of the range selector relative to its horizontal
   * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.x">https://api.highcharts.com/highstock/rangeSelector.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock) The y offset of the range selector relative to its horizontal
   * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.y">https://api.highcharts.com/highstock/rangeSelector.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock) The y offset of the range selector relative to its horizontal
   * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.y">https://api.highcharts.com/highstock/rangeSelector.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
