package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) The range selector is a tool for selecting ranges to
 * display within the chart. It provides buttons to select preconfigured ranges
 * in the chart, like 1 day, 1 week, 1 month etc. It also provides input boxes
 * where min and max dates can be manually input.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface RangeSelectorOptions extends Any {
  /**
   * (Highstock, Gantt) Whether to enable all buttons from the start. By
   * default buttons are only enabled if the corresponding time range exists
   * on the X axis, but enabling all buttons allows for dynamically loading
   * different time ranges.
   *
   */
  @JSProperty("allButtonsEnabled")
  boolean getAllButtonsEnabled();

  /**
   * (Highstock, Gantt) Whether to enable all buttons from the start. By
   * default buttons are only enabled if the corresponding time range exists
   * on the X axis, but enabling all buttons allows for dynamically loading
   * different time ranges.
   *
   */
  @JSProperty("allButtonsEnabled")
  void setAllButtonsEnabled(boolean value);

  /**
   * (Highstock, Gantt) Positioning for the button row.
   *
   */
  @JSProperty("buttonPosition")
  @Nullable
  RangeSelectorButtonPositionOptions getButtonPosition();

  /**
   * (Highstock, Gantt) Positioning for the button row.
   *
   */
  @JSProperty("buttonPosition")
  void setButtonPosition(@Nullable RangeSelectorButtonPositionOptions value);

  /**
   * (Highstock, Gantt) An array of configuration objects for the buttons.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("buttons")
  @Nullable
  RangeSelectorButtonsOptions[] getButtons();

  /**
   * (Highstock, Gantt) An array of configuration objects for the buttons.
   *
   * Defaults to: (see online documentation for example)
   *
   */
  @JSProperty("buttons")
  void setButtons(RangeSelectorButtonsOptions[] value);

  /**
   * (Highstock, Gantt) The space in pixels between the buttons in the range
   * selector.
   *
   */
  @JSProperty("buttonSpacing")
  double getButtonSpacing();

  /**
   * (Highstock, Gantt) The space in pixels between the buttons in the range
   * selector.
   *
   */
  @JSProperty("buttonSpacing")
  void setButtonSpacing(double value);

  /**
   * (Highstock, Gantt) A collection of attributes for the buttons. The object
   * takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as
   * <code>style</code>, a collection of CSS properties for the text.
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
   */
  @JSProperty("buttonTheme")
  @Nullable
  SVGAttributes getButtonTheme();

  /**
   * (Highstock, Gantt) A collection of attributes for the buttons. The object
   * takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as
   * <code>style</code>, a collection of CSS properties for the text.
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
   */
  @JSProperty("buttonTheme")
  void setButtonTheme(@Nullable SVGAttributes value);

  /**
   * (Highstock, Gantt) Enable or disable the range selector.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock, Gantt) Enable or disable the range selector.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock, Gantt) When the rangeselector is floating, the plot area does
   * not reserve space for it. This opens for positioning anywhere on the
   * chart.
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highstock, Gantt) When the rangeselector is floating, the plot area does
   * not reserve space for it. This opens for positioning anywhere on the
   * chart.
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highstock, Gantt) The border color of the date input boxes.
   *
   */
  @JSProperty("inputBoxBorderColor")
  @Nullable
  String getInputBoxBorderColor();

  /**
   * (Highstock, Gantt) The border color of the date input boxes.
   *
   */
  @JSProperty("inputBoxBorderColor")
  void setInputBoxBorderColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The pixel height of the date input boxes.
   *
   */
  @JSProperty("inputBoxHeight")
  double getInputBoxHeight();

  /**
   * (Highstock, Gantt) The pixel height of the date input boxes.
   *
   */
  @JSProperty("inputBoxHeight")
  void setInputBoxHeight(double value);

  /**
   * (Highstock, Gantt) The pixel width of the date input boxes.
   *
   */
  @JSProperty("inputBoxWidth")
  double getInputBoxWidth();

  /**
   * (Highstock, Gantt) The pixel width of the date input boxes.
   *
   */
  @JSProperty("inputBoxWidth")
  void setInputBoxWidth(double value);

  /**
   * (Highstock, Gantt) The date format in the input boxes when not selected
   * for editing. Defaults to <code>%b %e, %Y</code>.
   *
   */
  @JSProperty("inputDateFormat")
  @Nullable
  String getInputDateFormat();

  /**
   * (Highstock, Gantt) The date format in the input boxes when not selected
   * for editing. Defaults to <code>%b %e, %Y</code>.
   *
   */
  @JSProperty("inputDateFormat")
  void setInputDateFormat(@Nullable String value);

  /**
   * (Highstock, Gantt) A custom callback function to parse values entered in
   * the input boxes and return a valid JavaScript time as milliseconds since
   * 1970.
   *
   */
  @JSProperty("inputDateParser")
  @Nullable
  RangeSelectorParseCallbackFunction getInputDateParser();

  /**
   * (Highstock, Gantt) A custom callback function to parse values entered in
   * the input boxes and return a valid JavaScript time as milliseconds since
   * 1970.
   *
   */
  @JSProperty("inputDateParser")
  void setInputDateParser(@Nullable RangeSelectorParseCallbackFunction value);

  /**
   * (Highstock, Gantt) The date format in the input boxes when they are
   * selected for editing. This must be a format that is recognized by
   * JavaScript Date.parse.
   *
   */
  @JSProperty("inputEditDateFormat")
  @Nullable
  String getInputEditDateFormat();

  /**
   * (Highstock, Gantt) The date format in the input boxes when they are
   * selected for editing. This must be a format that is recognized by
   * JavaScript Date.parse.
   *
   */
  @JSProperty("inputEditDateFormat")
  void setInputEditDateFormat(@Nullable String value);

  /**
   * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
   * enabled when there is enough space, disabled if not (typically mobile).
   *
   */
  @JSProperty("inputEnabled")
  boolean getInputEnabled();

  /**
   * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
   * enabled when there is enough space, disabled if not (typically mobile).
   *
   */
  @JSProperty("inputEnabled")
  void setInputEnabled(boolean value);

  /**
   * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
   * are <code>align</code>, <code>x</code> and <code>y</code>.
   *
   */
  @JSProperty("inputPosition")
  @Nullable
  RangeSelectorInputPositionOptions getInputPosition();

  /**
   * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
   * are <code>align</code>, <code>x</code> and <code>y</code>.
   *
   */
  @JSProperty("inputPosition")
  void setInputPosition(@Nullable RangeSelectorInputPositionOptions value);

  /**
   * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
   *
   * In styled mode, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when
   * active.
   *
   */
  @JSProperty("inputStyle")
  @Nullable
  CSSObject getInputStyle();

  /**
   * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
   *
   * In styled mode, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when
   * active.
   *
   */
  @JSProperty("inputStyle")
  void setInputStyle(@Nullable CSSObject value);

  /**
   * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
   * texts.
   *
   * In styled mode, the labels are styled by the <code>.highcharts-range-label</code>
   * class.
   *
   */
  @JSProperty("labelStyle")
  @Nullable
  CSSObject getLabelStyle();

  /**
   * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
   * texts.
   *
   * In styled mode, the labels are styled by the <code>.highcharts-range-label</code>
   * class.
   *
   */
  @JSProperty("labelStyle")
  void setLabelStyle(@Nullable CSSObject value);

  /**
   * (Highstock, Gantt) The index of the button to appear pre-selected.
   *
   */
  @JSProperty("selected")
  double getSelected();

  /**
   * (Highstock, Gantt) The index of the button to appear pre-selected.
   *
   */
  @JSProperty("selected")
  void setSelected(double value);

  /**
   * (Highstock, Gantt) The vertical alignment of the rangeselector box.
   * Allowed properties are <code>top</code>, <code>middle</code>, <code>bottom</code>.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highstock, Gantt) The vertical alignment of the rangeselector box.
   * Allowed properties are <code>top</code>, <code>middle</code>, <code>bottom</code>.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highstock, Gantt) The x offset of the range selector relative to its
   * horizontal alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock, Gantt) The x offset of the range selector relative to its
   * horizontal alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock, Gantt) The y offset of the range selector relative to its
   * horizontal alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock, Gantt) The y offset of the range selector relative to its
   * horizontal alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final RangeSelectorOptions object = Any.empty();

    public RangeSelectorOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) Whether to enable all buttons from the start. By
     * default buttons are only enabled if the corresponding time range exists
     * on the X axis, but enabling all buttons allows for dynamically loading
     * different time ranges.
     *
     */
    public Builder allButtonsEnabled(boolean value) {
      object.setAllButtonsEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Positioning for the button row.
     *
     */
    public Builder buttonPosition(@Nullable RangeSelectorButtonPositionOptions value) {
      object.setButtonPosition(value);
      return this;
    }

    /**
     * (Highstock, Gantt) An array of configuration objects for the buttons.
     *
     * Defaults to: (see online documentation for example)
     *
     */
    public Builder buttons(RangeSelectorButtonsOptions[] value) {
      object.setButtons(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The space in pixels between the buttons in the range
     * selector.
     *
     */
    public Builder buttonSpacing(double value) {
      object.setButtonSpacing(value);
      return this;
    }

    /**
     * (Highstock, Gantt) A collection of attributes for the buttons. The object
     * takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as
     * <code>style</code>, a collection of CSS properties for the text.
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
     */
    public Builder buttonTheme(@Nullable SVGAttributes value) {
      object.setButtonTheme(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Enable or disable the range selector.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) When the rangeselector is floating, the plot area does
     * not reserve space for it. This opens for positioning anywhere on the
     * chart.
     *
     */
    public Builder floating(boolean value) {
      object.setFloating(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The border color of the date input boxes.
     *
     */
    public Builder inputBoxBorderColor(@Nullable String value) {
      object.setInputBoxBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The pixel height of the date input boxes.
     *
     */
    public Builder inputBoxHeight(double value) {
      object.setInputBoxHeight(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The pixel width of the date input boxes.
     *
     */
    public Builder inputBoxWidth(double value) {
      object.setInputBoxWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The date format in the input boxes when not selected
     * for editing. Defaults to <code>%b %e, %Y</code>.
     *
     */
    public Builder inputDateFormat(@Nullable String value) {
      object.setInputDateFormat(value);
      return this;
    }

    /**
     * (Highstock, Gantt) A custom callback function to parse values entered in
     * the input boxes and return a valid JavaScript time as milliseconds since
     * 1970.
     *
     */
    public Builder inputDateParser(@Nullable RangeSelectorParseCallbackFunction value) {
      object.setInputDateParser(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The date format in the input boxes when they are
     * selected for editing. This must be a format that is recognized by
     * JavaScript Date.parse.
     *
     */
    public Builder inputEditDateFormat(@Nullable String value) {
      object.setInputEditDateFormat(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
     * enabled when there is enough space, disabled if not (typically mobile).
     *
     */
    public Builder inputEnabled(boolean value) {
      object.setInputEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
     * are <code>align</code>, <code>x</code> and <code>y</code>.
     *
     */
    public Builder inputPosition(@Nullable RangeSelectorInputPositionOptions value) {
      object.setInputPosition(value);
      return this;
    }

    /**
     * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
     *
     * In styled mode, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when
     * active.
     *
     */
    public Builder inputStyle(@Nullable CSSObject value) {
      object.setInputStyle(value);
      return this;
    }

    /**
     * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
     * texts.
     *
     * In styled mode, the labels are styled by the <code>.highcharts-range-label</code>
     * class.
     *
     */
    public Builder labelStyle(@Nullable CSSObject value) {
      object.setLabelStyle(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The index of the button to appear pre-selected.
     *
     */
    public Builder selected(double value) {
      object.setSelected(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The vertical alignment of the rangeselector box.
     * Allowed properties are <code>top</code>, <code>middle</code>, <code>bottom</code>.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The x offset of the range selector relative to its
     * horizontal alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The y offset of the range selector relative to its
     * horizontal alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
