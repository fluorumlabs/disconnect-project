package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) An array of data points for the series. For the <code>mappoint</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
 * either starting at 0 and incremented by 1, or from <code>pointStart</code> and
 * <code>pointInterval</code> given in the series options. If the axis has categories,
 * these will be used. Example: (see online documentation for example)
 *
 * </li>
 * <li>
 * An array of arrays with 2 values. In this case, the values correspond to
 * <code>x,y</code>. If the first value is a string, it is applied as the name of the
 * point, and the <code>x</code> value is inferred. (see online documentation for example)
 *
 * </li>
 * <li>
 * An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesMappointDataOptions extends Any {
  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highmaps) Individual color for the point. By default the color is either
   * used to denote the value, or pulled from the global <code>colors</code> array.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highmaps) Individual data label for each point. The options are the same
   * as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  DataLabelsOptions getDataLabels();

  /**
   * (Highmaps) Individual data label for each point. The options are the same
   * as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable DataLabelsOptions value);

  /**
   * (Highmaps) The <code>id</code> of a series in the drilldown.series array to use for
   * a drilldown for this point.
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highmaps) The <code>id</code> of a series in the drilldown.series array to use for
   * a drilldown for this point.
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(@Nullable String value);

  /**
   * (Highmaps) Individual point events
   *
   */
  @JSProperty("events")
  @Nullable
  PointEventsOptionsObject getEvents();

  /**
   * (Highmaps) Individual point events
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable PointEventsOptionsObject value);

  /**
   * (Highmaps) An id for the point. This can be used after render time to get
   * a pointer to the point object through <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highmaps) An id for the point. This can be used after render time to get
   * a pointer to the point object through <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highmaps) The latitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   */
  @JSProperty("lat")
  double getLat();

  /**
   * (Highmaps) The latitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   */
  @JSProperty("lat")
  void setLat(double value);

  /**
   * (Highmaps) The longitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   */
  @JSProperty("lon")
  double getLon();

  /**
   * (Highmaps) The longitude of the point. Must be combined with the <code>lon</code>
   * option to work. Overrides <code>x</code> and <code>y</code> values.
   *
   */
  @JSProperty("lon")
  void setLon(double value);

  /**
   * (Highmaps) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highmaps) The name of the point as shown in the legend, tooltip,
   * dataLabel etc.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highmaps) The x coordinate of the point in terms of the map path
   * coordinates.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesMappointDataOptions object = Any.empty();

    private Builder() {
    }

    public SeriesMappointDataOptions build() {
      return object;
    }

    /**
     * (Highmaps) Individual color for the point. By default the color is either
     * used to denote the value, or pulled from the global <code>colors</code> array.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) Individual color for the point. By default the color is either
     * used to denote the value, or pulled from the global <code>colors</code> array.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) Individual color for the point. By default the color is either
     * used to denote the value, or pulled from the global <code>colors</code> array.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highmaps) Individual data label for each point. The options are the same
     * as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable DataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highmaps) The <code>id</code> of a series in the drilldown.series array to use for
     * a drilldown for this point.
     *
     */
    public Builder drilldown(@Nullable String value) {
      object.setDrilldown(value);
      return this;
    }

    /**
     * (Highmaps) Individual point events
     *
     */
    public Builder events(@Nullable PointEventsOptionsObject value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highmaps) An id for the point. This can be used after render time to get
     * a pointer to the point object through <code>chart.get()</code>.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highmaps) The latitude of the point. Must be combined with the <code>lon</code>
     * option to work. Overrides <code>x</code> and <code>y</code> values.
     *
     */
    public Builder lat(double value) {
      object.setLat(value);
      return this;
    }

    /**
     * (Highmaps) The longitude of the point. Must be combined with the <code>lon</code>
     * option to work. Overrides <code>x</code> and <code>y</code> values.
     *
     */
    public Builder lon(double value) {
      object.setLon(value);
      return this;
    }

    /**
     * (Highmaps) The name of the point as shown in the legend, tooltip,
     * dataLabel etc.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highmaps) The x coordinate of the point in terms of the map path
     * coordinates.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highmaps) The x coordinate of the point in terms of the map path
     * coordinates.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
