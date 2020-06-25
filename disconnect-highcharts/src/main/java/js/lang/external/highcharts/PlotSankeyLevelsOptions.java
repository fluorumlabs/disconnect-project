package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( SeriesSankeyDataLabelsOptionsObject | Array < SeriesSankeyDataLabelsOptionsObject > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not node and link options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSankeyLevelsOptions extends Any {
  /**
   * (Highcharts) Can set <code>borderColor</code> on all nodes which lay on the same
   * level.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) Can set <code>borderColor</code> on all nodes which lay on the same
   * level.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) Can set <code>borderWidth</code> on all nodes which lay on the same
   * level.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) Can set <code>borderWidth</code> on all nodes which lay on the same
   * level.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) Can set <code>colorByPoint</code> on all nodes which lay on the same
   * level.
   *
   */
  @JSProperty("colorByPoint")
  boolean getColorByPoint();

  /**
   * (Highcharts) Can set <code>colorByPoint</code> on all nodes which lay on the same
   * level.
   *
   */
  @JSProperty("colorByPoint")
  void setColorByPoint(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
   * points which lay on the same level.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( SeriesSankeyDataLabelsOptionsObject | Array < SeriesSankeyDataLabelsOptionsObject > ) */ getDataLabels(
      );

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
   * points which lay on the same level.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesSankeyDataLabelsOptionsObject[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
   * points which lay on the same level.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesSankeyDataLabelsOptionsObject value);

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

  /**
   * (Highcharts) Can set <code>linkOpacity</code> on all points which lay on the same
   * level.
   *
   */
  @JSProperty("linkOpacity")
  double getLinkOpacity();

  /**
   * (Highcharts) Can set <code>linkOpacity</code> on all points which lay on the same
   * level.
   *
   */
  @JSProperty("linkOpacity")
  void setLinkOpacity(double value);

  /**
   * (Highcharts) Can set <code>states</code> on all nodes and points which lay on the
   * same level.
   *
   */
  @JSProperty("states")
  @Nullable
  SeriesStatesOptionsObject getStates();

  /**
   * (Highcharts) Can set <code>states</code> on all nodes and points which lay on the
   * same level.
   *
   */
  @JSProperty("states")
  void setStates(@Nullable SeriesStatesOptionsObject value);

  class Builder {
    private final PlotSankeyLevelsOptions object = Any.empty();

    public PlotSankeyLevelsOptions build() {
      return object;
    }

    /**
     * (Highcharts) Can set <code>borderColor</code> on all nodes which lay on the same
     * level.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set <code>borderWidth</code> on all nodes which lay on the same
     * level.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set <code>color</code> on all nodes which lay on the same level.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) Can set <code>colorByPoint</code> on all nodes which lay on the same
     * level.
     *
     */
    public Builder colorByPoint(boolean value) {
      object.setColorByPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
     * points which lay on the same level.
     *
     */
    public Builder dataLabels(SeriesSankeyDataLabelsOptionsObject[] value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all
     * points which lay on the same level.
     *
     */
    public Builder dataLabels(@Nullable SeriesSankeyDataLabelsOptionsObject value) {
      object.setDataLabels(value);
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

    /**
     * (Highcharts) Can set <code>linkOpacity</code> on all points which lay on the same
     * level.
     *
     */
    public Builder linkOpacity(double value) {
      object.setLinkOpacity(value);
      return this;
    }

    /**
     * (Highcharts) Can set <code>states</code> on all nodes and points which lay on the
     * same level.
     *
     */
    public Builder states(@Nullable SeriesStatesOptionsObject value) {
      object.setStates(value);
      return this;
    }
  }
}
