package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Text labels for the plot bands
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ZAxisPlotBandsLabelOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
   * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
   * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-band-label</code> class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the text label.
   *
   * In styled mode, the labels are styled by the
   * <code>.highcharts-plot-band-label</code> class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
   * is supported.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
   * is supported.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The text alignment for the label. While
   * <code>align</code> determines where the texts anchor point is placed within the plot
   * band, <code>textAlign</code> determines how the text is aligned against its anchor
   * point. Possible values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the
   * same as the <code>align</code> option.
   *
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Highcharts, Highstock, Gantt) The text alignment for the label. While
   * <code>align</code> determines where the texts anchor point is placed within the plot
   * band, <code>textAlign</code> determines how the text is aligned against its anchor
   * point. Possible values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the
   * same as the <code>align</code> option.
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable TextAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
   * to the plot band. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
   * to the plot band. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Horizontal position relative the
   * alignment. Default varies by orientation.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal position relative the
   * alignment. Default varies by orientation.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
   * relative to the alignment. Default varies by orientation.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
   * relative to the alignment. Default varies by orientation.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final ZAxisPlotBandsLabelOptions object = Any.empty();

    public ZAxisPlotBandsLabelOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
     * one of &quot;left&quot;, &quot;center&quot; or &quot;right&quot;.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) CSS styles for the text label.
     *
     * In styled mode, the labels are styled by the
     * <code>.highcharts-plot-band-label</code> class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
     * is supported.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The text alignment for the label. While
     * <code>align</code> determines where the texts anchor point is placed within the plot
     * band, <code>textAlign</code> determines how the text is aligned against its anchor
     * point. Possible values are &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the
     * same as the <code>align</code> option.
     *
     */
    public Builder textAlign(@Nullable TextAlign value) {
      object.setTextAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
     * to the plot band. Can be one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Horizontal position relative the
     * alignment. Default varies by orientation.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
     * relative to the alignment. Default varies by orientation.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
