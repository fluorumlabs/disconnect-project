package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( SeriesSunburstDataLabelsOptionsObject | Array < SeriesSunburstDataLabelsOptionsObject > ) */;
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
public interface PlotSunburstLevelsOptions extends Any {
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
   * (Highcharts) Can set a <code>borderDashStyle</code> on all points which lies on the
   * same level.
   *
   */
  @JSProperty("borderDashStyle")
  @Nullable
  BorderDashStyle getBorderDashStyle();

  /**
   * (Highcharts) Can set a <code>borderDashStyle</code> on all points which lies on the
   * same level.
   *
   */
  @JSProperty("borderDashStyle")
  void setBorderDashStyle(@Nullable BorderDashStyle value);

  /**
   * (Highcharts) Can set a <code>borderWidth</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) Can set a <code>borderWidth</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the
   * same level.
   *
   */
  @JSProperty("colorVariation")
  @Nullable
  PlotSunburstLevelsColorVariationOptions getColorVariation();

  /**
   * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the
   * same level.
   *
   */
  @JSProperty("colorVariation")
  void setColorVariation(@Nullable PlotSunburstLevelsColorVariationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
   * points which lies on the same level.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( SeriesSunburstDataLabelsOptionsObject | Array < SeriesSunburstDataLabelsOptionsObject > ) */ getDataLabels(
      );

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
   * points which lies on the same level.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesSunburstDataLabelsOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
   * points which lies on the same level.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesSunburstDataLabelsOptionsObject... value);

  /**
   * (Highcharts) Can set a <code>levelSize</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("levelSize")
  @Nullable
  Any getLevelSize();

  /**
   * (Highcharts) Can set a <code>levelSize</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("levelSize")
  void setLevelSize(@Nullable Any value);

  /**
   * (Highcharts) Can set a <code>rotation</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts) Can set a <code>rotation</code> on all points which lies on the same
   * level.
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) Can set a <code>rotationMode</code> on all points which lies on the
   * same level.
   *
   */
  @JSProperty("rotationMode")
  @Nullable
  String getRotationMode();

  /**
   * (Highcharts) Can set a <code>rotationMode</code> on all points which lies on the
   * same level.
   *
   */
  @JSProperty("rotationMode")
  void setRotationMode(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotSunburstLevelsOptions object = Any.empty();

    private Builder() {
    }

    public PlotSunburstLevelsOptions build() {
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
     * (Highcharts) Can set a <code>borderDashStyle</code> on all points which lies on the
     * same level.
     *
     */
    public Builder borderDashStyle(@Nullable BorderDashStyle value) {
      object.setBorderDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>borderWidth</code> on all points which lies on the same
     * level.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>color</code> on all points which lies on the same
     * level.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>color</code> on all points which lies on the same
     * level.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>color</code> on all points which lies on the same
     * level.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the
     * same level.
     *
     */
    public Builder colorVariation(@Nullable PlotSunburstLevelsColorVariationOptions value) {
      object.setColorVariation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
     * points which lies on the same level.
     *
     */
    public Builder dataLabels(@Nullable SeriesSunburstDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
     * points which lies on the same level.
     *
     */
    public Builder dataLabels(SeriesSunburstDataLabelsOptionsObject... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>levelSize</code> on all points which lies on the same
     * level.
     *
     */
    public Builder levelSize(@Nullable Any value) {
      object.setLevelSize(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>rotation</code> on all points which lies on the same
     * level.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts) Can set a <code>rotationMode</code> on all points which lies on the
     * same level.
     *
     */
    public Builder rotationMode(@Nullable String value) {
      object.setRotationMode(value);
      return this;
    }
  }
}
