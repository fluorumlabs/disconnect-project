package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * title. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * title. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the title is floating, the
   * plot area will not move to make space for it.
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the title is floating, the
   * plot area will not move to make space for it.
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the title and
   * the plot area, or if a subtitle is present, the margin between the
   * subtitle and the plot area.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the title and
   * the plot area, or if a subtitle is present, the margin between the
   * subtitle and the plot area.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. Use
   * this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
   *
   * In styled mode, the title style is given in the <code>.highcharts-title</code>
   * class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. Use
   * this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
   *
   * In styled mode, the title style is given in the <code>.highcharts-title</code>
   * class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The title of the chart. To
   * disable the title, set the <code>text</code> to <code>undefined</code>.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The title of the chart. To
   * disable the title, set the <code>text</code> to <code>undefined</code>.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the text.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the text.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * title. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is
   * given, the title behaves as if floating were <code>true</code>.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * title. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is
   * given, the title behaves as if floating were <code>true</code>.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the title
   * width, normally to reserve space for the exporting burger menu.
   *
   */
  @JSProperty("widthAdjust")
  double getWidthAdjust();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the title
   * width, normally to reserve space for the exporting burger menu.
   *
   */
  @JSProperty("widthAdjust")
  void setWidthAdjust(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the title
   * relative to the alignment within <code>chart.spacingLeft</code> and
   * <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the title
   * relative to the alignment within <code>chart.spacingLeft</code> and
   * <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the title
   * relative to the alignment within chart.spacingTop and
   * chart.spacingBottom. By default it depends on the font size.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the title
   * relative to the alignment within chart.spacingTop and
   * chart.spacingBottom. By default it depends on the font size.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final TitleOptions object = Any.empty();

    private Builder() {
    }

    public TitleOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * title. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the title is floating, the
     * plot area will not move to make space for it.
     *
     */
    public Builder floating(boolean value) {
      object.setFloating(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the title and
     * the plot area, or if a subtitle is present, the margin between the
     * subtitle and the plot area.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. Use
     * this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
     *
     * In styled mode, the title style is given in the <code>.highcharts-title</code>
     * class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The title of the chart. To
     * disable the title, set the <code>text</code> to <code>undefined</code>.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the text.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * title. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is
     * given, the title behaves as if floating were <code>true</code>.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the title
     * width, normally to reserve space for the exporting burger menu.
     *
     */
    public Builder widthAdjust(double value) {
      object.setWidthAdjust(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the title
     * relative to the alignment within <code>chart.spacingLeft</code> and
     * <code>chart.spacingRight</code>.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the title
     * relative to the alignment within chart.spacingTop and
     * chart.spacingBottom. By default it depends on the font size.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
