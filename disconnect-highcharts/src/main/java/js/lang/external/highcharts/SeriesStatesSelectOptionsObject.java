package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( string | ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Specific options for point in selected states, after being
 * selected by allowPointSelect or programmatically.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesStatesSelectOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) Animation setting for hovering the graph in
   * line-type series.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highstock) Animation setting for hovering the graph in
   * line-type series.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock) Animation setting for hovering the graph in
   * line-type series.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highmaps) The border color of the point in this state.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( string | ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highmaps) The border color of the point in this state.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highmaps) The border color of the point in this state.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highmaps) The border color of the point in this state.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highmaps) The border width of the point in this state
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highmaps) The border width of the point in this state
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( string | ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highmaps) The color of the shape in this state.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable separate styles for the hovered series to visualize
   * that the user hovers either the series itself or the legend.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) Options for the halo appearing around the hovered
   * point in line-type series as well as outside the hovered slice in pie
   * charts. By default the halo is filled by the current point or series
   * color with an opacity of 0.25. The halo can be disabled by setting the
   * <code>halo</code> option to <code>null</code>.
   *
   * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
   * with colors inherited from <code>.highcharts-color-{n}</code>.
   *
   */
  @JSProperty("halo")
  @Nullable
  SeriesStatesHoverHaloOptionsObject getHalo();

  /**
   * (Highcharts, Highstock) Options for the halo appearing around the hovered
   * point in line-type series as well as outside the hovered slice in pie
   * charts. By default the halo is filled by the current point or series
   * color with an opacity of 0.25. The halo can be disabled by setting the
   * <code>halo</code> option to <code>null</code>.
   *
   * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
   * with colors inherited from <code>.highcharts-color-{n}</code>.
   *
   */
  @JSProperty("halo")
  void setHalo(@Nullable SeriesStatesHoverHaloOptionsObject value);

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the graph line. By default this
   * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
   * to increase the linewidth from normal state.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The additional line width for the graph of a
   * hovered series.
   *
   */
  @JSProperty("lineWidthPlus")
  double getLineWidthPlus();

  /**
   * (Highcharts, Highstock) The additional line width for the graph of a
   * hovered series.
   *
   */
  @JSProperty("lineWidthPlus")
  void setLineWidthPlus(double value);

  class Builder {
    private final SeriesStatesSelectOptionsObject object = Any.empty();

    public SeriesStatesSelectOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Animation setting for hovering the graph in
     * line-type series.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Animation setting for hovering the graph in
     * line-type series.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highmaps) The border color of the point in this state.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highmaps) The border color of the point in this state.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highmaps) The border color of the point in this state.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highmaps) The border width of the point in this state
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highmaps) The color of the shape in this state.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) The color of the shape in this state.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) The color of the shape in this state.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock) Enable separate styles for the hovered series to visualize
     * that the user hovers either the series itself or the legend.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Options for the halo appearing around the hovered
     * point in line-type series as well as outside the hovered slice in pie
     * charts. By default the halo is filled by the current point or series
     * color with an opacity of 0.25. The halo can be disabled by setting the
     * <code>halo</code> option to <code>null</code>.
     *
     * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class,
     * with colors inherited from <code>.highcharts-color-{n}</code>.
     *
     */
    public Builder halo(@Nullable SeriesStatesHoverHaloOptionsObject value) {
      object.setHalo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Pixel width of the graph line. By default this
     * property is undefined, and the <code>lineWidthPlus</code> property dictates how much
     * to increase the linewidth from normal state.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The additional line width for the graph of a
     * hovered series.
     *
     */
    public Builder lineWidthPlus(double value) {
      object.setLineWidthPlus(value);
      return this;
    }
  }
}
