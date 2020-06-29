package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for buttons
 * appearing in the exporting module.
 *
 * In styled mode, the buttons are styled with the <code>.highcharts-contextbutton</code>
 * and <code>.highcharts-button-symbol</code> classes.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationButtonOptions extends Any {
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
   * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
   * the button.
   *
   */
  @JSProperty("symbolFill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getSymbolFill();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
   * the button.
   *
   */
  @JSProperty("symbolFill")
  void setSymbolFill(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
   * the button.
   *
   */
  @JSProperty("symbolFill")
  void setSymbolFill(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
   * the button.
   *
   */
  @JSProperty("symbolFill")
  void setSymbolFill(@Nullable GradientColorObject value);

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
  NavigationButtonThemeOptions getTheme();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
   * button theme. The object accepts SVG properties like <code>stroke-width</code>,
   * <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the
   * <code>states.hover</code> and <code>states.select</code> objects.
   *
   */
  @JSProperty("theme")
  void setTheme(@Nullable NavigationButtonThemeOptions value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigationButtonOptions object = Any.empty();

    private Builder() {
    }

    public NavigationButtonOptions build() {
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
     * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
     * the button.
     *
     */
    public Builder symbolFill(@Nullable PatternObject value) {
      object.setSymbolFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
     * the button.
     *
     */
    public Builder symbolFill(@Nullable String value) {
      object.setSymbolFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
     * the button.
     *
     */
    public Builder symbolFill(@Nullable GradientColorObject value) {
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
    public Builder theme(@Nullable NavigationButtonThemeOptions value) {
      object.setTheme(value);
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
