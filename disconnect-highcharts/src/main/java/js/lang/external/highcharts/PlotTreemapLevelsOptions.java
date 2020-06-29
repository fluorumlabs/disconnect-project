package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( PlotTreemapLevelsDataLabelsOptions | Array < PlotTreemapLevelsDataLabelsOptions > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not point options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotTreemapLevelsOptions extends Any {
  /**
   * (Highcharts) Can set a <code>borderColor</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) Can set a <code>borderColor</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) Set the dash style of the border of all the point which lies
   * on the level. See plotOptions.scatter.dashStyle for possible options.
   *
   */
  @JSProperty("borderDashStyle")
  @Nullable
  BorderDashStyle getBorderDashStyle();

  /**
   * (Highcharts) Set the dash style of the border of all the point which lies
   * on the level. See plotOptions.scatter.dashStyle for possible options.
   *
   */
  @JSProperty("borderDashStyle")
  void setBorderDashStyle(@Nullable BorderDashStyle value);

  /**
   * (Highcharts) Can set the borderWidth on all points which lies on the same
   * level.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) Can set the borderWidth on all points which lies on the same
   * level.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) A configuration object to define how the color of a child
   * varies from the parent's color. The variation is distributed among the
   * children of node. For example when setting brightness, the brightness
   * change will range from the parent's original brightness on the first
   * child, to the amount set in the <code>to</code> setting on the last node. This
   * allows a gradient-like color scheme that sets children out from each
   * other while highlighting the grouping on treemaps and sectors on sunburst
   * charts.
   *
   */
  @JSProperty("colorVariation")
  @Nullable
  PlotTreemapLevelsColorVariationOptions getColorVariation();

  /**
   * (Highcharts) A configuration object to define how the color of a child
   * varies from the parent's color. The variation is distributed among the
   * children of node. For example when setting brightness, the brightness
   * change will range from the parent's original brightness on the first
   * child, to the amount set in the <code>to</code> setting on the last node. This
   * allows a gradient-like color scheme that sets children out from each
   * other while highlighting the grouping on treemaps and sectors on sunburst
   * charts.
   *
   */
  @JSProperty("colorVariation")
  void setColorVariation(@Nullable PlotTreemapLevelsColorVariationOptions value);

  /**
   * (Highcharts) Can set the options of dataLabels on each point which lies
   * on the level. plotOptions.treemap.dataLabels for possible values.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( PlotTreemapLevelsDataLabelsOptions | Array < PlotTreemapLevelsDataLabelsOptions > ) */ getDataLabels(
      );

  /**
   * (Highcharts) Can set the options of dataLabels on each point which lies
   * on the level. plotOptions.treemap.dataLabels for possible values.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(PlotTreemapLevelsDataLabelsOptions... value);

  /**
   * (Highcharts) Can set the options of dataLabels on each point which lies
   * on the level. plotOptions.treemap.dataLabels for possible values.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable PlotTreemapLevelsDataLabelsOptions value);

  /**
   * (Highcharts) Can set the layoutAlgorithm option on a specific level.
   *
   */
  @JSProperty("layoutAlgorithm")
  @Nullable
  LayoutAlgorithm getLayoutAlgorithm();

  /**
   * (Highcharts) Can set the layoutAlgorithm option on a specific level.
   *
   */
  @JSProperty("layoutAlgorithm")
  void setLayoutAlgorithm(@Nullable LayoutAlgorithm value);

  /**
   * (Highcharts) Can set the layoutStartingDirection option on a specific
   * level.
   *
   */
  @JSProperty("layoutStartingDirection")
  @Nullable
  LayoutStartingDirection getLayoutStartingDirection();

  /**
   * (Highcharts) Can set the layoutStartingDirection option on a specific
   * level.
   *
   */
  @JSProperty("layoutStartingDirection")
  void setLayoutStartingDirection(@Nullable LayoutStartingDirection value);

  /**
   * (Highcharts) Decides which level takes effect from the options set in the
   * levels object.
   *
   */
  @JSProperty("level")
  double getLevel();

  /**
   * (Highcharts) Decides which level takes effect from the options set in the
   * levels object.
   *
   */
  @JSProperty("level")
  void setLevel(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotTreemapLevelsOptions object = Any.empty();

    private Builder() {
    }

    public PlotTreemapLevelsOptions build() {
      return object;
    }

    /**
     * (Highcharts) Can set a <code>borderColor</code> on all points which lies on the same
     * level.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) Set the dash style of the border of all the point which lies
     * on the level. See plotOptions.scatter.dashStyle for possible options.
     *
     */
    public Builder borderDashStyle(@Nullable BorderDashStyle value) {
      object.setBorderDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) Can set the borderWidth on all points which lies on the same
     * level.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) Can set a color on all points which lies on the same level.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set a color on all points which lies on the same level.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set a color on all points which lies on the same level.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) A configuration object to define how the color of a child
     * varies from the parent's color. The variation is distributed among the
     * children of node. For example when setting brightness, the brightness
     * change will range from the parent's original brightness on the first
     * child, to the amount set in the <code>to</code> setting on the last node. This
     * allows a gradient-like color scheme that sets children out from each
     * other while highlighting the grouping on treemaps and sectors on sunburst
     * charts.
     *
     */
    public Builder colorVariation(@Nullable PlotTreemapLevelsColorVariationOptions value) {
      object.setColorVariation(value);
      return this;
    }

    /**
     * (Highcharts) Can set the options of dataLabels on each point which lies
     * on the level. plotOptions.treemap.dataLabels for possible values.
     *
     */
    public Builder dataLabels(PlotTreemapLevelsDataLabelsOptions... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Can set the options of dataLabels on each point which lies
     * on the level. plotOptions.treemap.dataLabels for possible values.
     *
     */
    public Builder dataLabels(@Nullable PlotTreemapLevelsDataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Can set the layoutAlgorithm option on a specific level.
     *
     */
    public Builder layoutAlgorithm(@Nullable LayoutAlgorithm value) {
      object.setLayoutAlgorithm(value);
      return this;
    }

    /**
     * (Highcharts) Can set the layoutStartingDirection option on a specific
     * level.
     *
     */
    public Builder layoutStartingDirection(@Nullable LayoutStartingDirection value) {
      object.setLayoutStartingDirection(value);
      return this;
    }

    /**
     * (Highcharts) Decides which level takes effect from the options set in the
     * levels object.
     *
     */
    public Builder level(double value) {
      object.setLevel(value);
      return this;
    }
  }
}
