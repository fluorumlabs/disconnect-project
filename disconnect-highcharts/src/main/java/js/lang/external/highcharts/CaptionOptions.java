package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
 * render below the chart and will be part of exported charts. The caption can
 * be updated after chart initialization through the <code>Chart.update</code> or
 * <code>Chart.caption.update</code> methods.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface CaptionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * caption. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * caption. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the caption is floating,
   * the plot area will not move to make space for it.
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the caption is floating,
   * the plot area will not move to make space for it.
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the caption
   * and the plot area.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The margin between the caption
   * and the plot area.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the caption.
   *
   * In styled mode, the caption style is given in the <code>.highcharts-caption</code>
   * class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the caption.
   *
   * In styled mode, the caption style is given in the <code>.highcharts-caption</code>
   * class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The caption text of the chart.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The caption text of the chart.
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
   * caption. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle,
   * the caption behaves as floating.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * caption. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle,
   * the caption behaves as floating.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the caption
   * relative to the alignment within <code>chart.spacingLeft</code> and
   * <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the caption
   * relative to the alignment within <code>chart.spacingLeft</code> and
   * <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the caption
   * relative to the alignment within <code>chart.spacingTop</code> and
   * <code>chart.spacingBottom</code>.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the caption
   * relative to the alignment within <code>chart.spacingTop</code> and
   * <code>chart.spacingBottom</code>.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final CaptionOptions object = Any.empty();

    public CaptionOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * caption. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the caption is floating,
     * the plot area will not move to make space for it.
     *
     */
    public Builder floating(boolean value) {
      object.setFloating(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the caption
     * and the plot area.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the caption.
     *
     * In styled mode, the caption style is given in the <code>.highcharts-caption</code>
     * class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The caption text of the chart.
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
     * caption. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle,
     * the caption behaves as floating.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the caption
     * relative to the alignment within <code>chart.spacingLeft</code> and
     * <code>chart.spacingRight</code>.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the caption
     * relative to the alignment within <code>chart.spacingTop</code> and
     * <code>chart.spacingBottom</code>.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
