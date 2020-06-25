package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( string | ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for the hovered series. These settings override the
 * normal state options when a series is moused over or touched.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesStatesHoverOptionsObject extends Any {
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
   * (Highmaps) The relative brightness of the point when hovered, relative to
   * the normal point color.
   *
   */
  @JSProperty("brightness")
  double getBrightness();

  /**
   * (Highmaps) The relative brightness of the point when hovered, relative to
   * the normal point color.
   *
   */
  @JSProperty("brightness")
  void setBrightness(double value);

  /**
   * (Highmaps) The color of the shape in this state.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

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
   * (Highcharts, Highstock) The additional connector line width for a hovered
   * point.
   *
   */
  @JSProperty("connectorWidthPlus")
  double getConnectorWidthPlus();

  /**
   * (Highcharts, Highstock) The additional connector line width for a hovered
   * point.
   *
   */
  @JSProperty("connectorWidthPlus")
  void setConnectorWidthPlus(double value);

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
   * (Highstock) The fill or background color of the flag.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highstock) The fill or background color of the flag.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highstock) The fill or background color of the flag.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highstock) The fill or background color of the flag.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

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
   * (Highstock) The color of the line/border of the flag.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getLineColor();

  /**
   * (Highstock) The color of the line/border of the flag.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the line/border of the flag.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highstock) The color of the line/border of the flag.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable GradientColorObject value);

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

  /**
   * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
   * sankey diagram in hover mode.
   *
   */
  @JSProperty("linkOpacity")
  double getLinkOpacity();

  /**
   * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
   * sankey diagram in hover mode.
   *
   */
  @JSProperty("linkOpacity")
  void setLinkOpacity(double value);

  /**
   * (Highcharts) The opacity of a point in treemap. When a point has
   * children, the visibility of the children is determined by the opacity.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts) The opacity of a point in treemap. When a point has
   * children, the visibility of the children is determined by the opacity.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts) The shadow option for hovered state.
   *
   */
  @JSProperty("shadow")
  boolean getShadow();

  /**
   * (Highcharts) The shadow option for hovered state.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  class Builder {
    private final SeriesStatesHoverOptionsObject object = Any.empty();

    public SeriesStatesHoverOptionsObject build() {
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
     * (Highmaps) The relative brightness of the point when hovered, relative to
     * the normal point color.
     *
     */
    public Builder brightness(double value) {
      object.setBrightness(value);
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
     * (Highcharts, Highstock) The additional connector line width for a hovered
     * point.
     *
     */
    public Builder connectorWidthPlus(double value) {
      object.setConnectorWidthPlus(value);
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
     * (Highstock) The fill or background color of the flag.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highstock) The fill or background color of the flag.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highstock) The fill or background color of the flag.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
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
     * (Highstock) The color of the line/border of the flag.
     *
     */
    public Builder lineColor(@Nullable PatternObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the line/border of the flag.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the line/border of the flag.
     *
     */
    public Builder lineColor(@Nullable GradientColorObject value) {
      object.setLineColor(value);
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

    /**
     * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
     * sankey diagram in hover mode.
     *
     */
    public Builder linkOpacity(double value) {
      object.setLinkOpacity(value);
      return this;
    }

    /**
     * (Highcharts) The opacity of a point in treemap. When a point has
     * children, the visibility of the children is determined by the opacity.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highcharts) The shadow option for hovered state.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }
  }
}
