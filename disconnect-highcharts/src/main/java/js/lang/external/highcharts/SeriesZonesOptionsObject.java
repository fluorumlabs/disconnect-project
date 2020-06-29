package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) An array defining zones within a series. Zones can be
 * applied to the X axis, Y axis or Z axis for bubbles, according to the
 * <code>zoneAxis</code> option. The zone definitions have to be in ascending order
 * regarding to the value.
 *
 * In styled mode, the color zones are styled with the <code>.highcharts-zone-{n}</code>
 * class, or custom classed from the <code>className</code> option (view live demo).
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesZonesOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) Styled mode only. A custom class name for the
   * zone.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock) Styled mode only. A custom class name for the
   * zone.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) A name for the dash style to use for the graph.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock) A name for the dash style to use for the graph.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) The value up to where the zone extends, if
   * undefined the zones stretches to the last value in the series.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock) The value up to where the zone extends, if
   * undefined the zones stretches to the last value in the series.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesZonesOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesZonesOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Styled mode only. A custom class name for the
     * zone.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the color of the series.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the color of the series.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the color of the series.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A name for the dash style to use for the graph.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the fill color for the series (in area
     * type series)
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the fill color for the series (in area
     * type series)
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Defines the fill color for the series (in area
     * type series)
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The value up to where the zone extends, if
     * undefined the zones stretches to the last value in the series.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
