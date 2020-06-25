package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can be
 * used both to display a subtitle below the main title, and to display random
 * text anywhere in the chart. The subtitle can be updated after chart
 * initialization through the <code>Chart.setTitle</code> method.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SubtitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * subtitle. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * subtitle. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the subtitle is floating,
   * the plot area will not move to make space for it.
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the subtitle is floating,
   * the plot area will not move to make space for it.
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title.
   *
   * In styled mode, the subtitle style is given in the <code>.highcharts-subtitle</code>
   * class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title.
   *
   * In styled mode, the subtitle style is given in the <code>.highcharts-subtitle</code>
   * class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The subtitle of the chart.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The subtitle of the chart.
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
   * title. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the
   * subtitle behaves as floating.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * title. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the
   * subtitle behaves as floating.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the subtitle
   * width, normally to reserve space for the exporting burger menu.
   *
   */
  @JSProperty("widthAdjust")
  double getWidthAdjust();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the subtitle
   * width, normally to reserve space for the exporting burger menu.
   *
   */
  @JSProperty("widthAdjust")
  void setWidthAdjust(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the subtitle
   * relative to the alignment within <code>chart.spacingLeft</code> and
   * <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the subtitle
   * relative to the alignment within <code>chart.spacingLeft</code> and
   * <code>chart.spacingRight</code>.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the subtitle
   * relative to the alignment within <code>chart.spacingTop</code> and
   * <code>chart.spacingBottom</code>. By default the subtitle is laid out below the
   * title unless the title is floating.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the subtitle
   * relative to the alignment within <code>chart.spacingTop</code> and
   * <code>chart.spacingBottom</code>. By default the subtitle is laid out below the
   * title unless the title is floating.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final SubtitleOptions object = Any.empty();

    public SubtitleOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * subtitle. Can be one of &quot;left&quot;, &quot;center&quot; and &quot;right&quot;.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the subtitle is floating,
     * the plot area will not move to make space for it.
     *
     */
    public Builder floating(boolean value) {
      object.setFloating(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title.
     *
     * In styled mode, the subtitle style is given in the <code>.highcharts-subtitle</code>
     * class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The subtitle of the chart.
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
     * title. Can be one of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the
     * subtitle behaves as floating.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the subtitle
     * width, normally to reserve space for the exporting burger menu.
     *
     */
    public Builder widthAdjust(double value) {
      object.setWidthAdjust(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the subtitle
     * relative to the alignment within <code>chart.spacingLeft</code> and
     * <code>chart.spacingRight</code>.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the subtitle
     * relative to the alignment within <code>chart.spacingTop</code> and
     * <code>chart.spacingBottom</code>. By default the subtitle is laid out below the
     * title unless the title is floating.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
