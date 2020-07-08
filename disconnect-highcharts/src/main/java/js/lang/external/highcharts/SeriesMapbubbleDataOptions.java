package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highmaps) An array of data points for the series. For the <code>mapbubble</code> series
 * type, points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>z</code> options. Example: (see online documentation for example)
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
public interface SeriesMapbubbleDataOptions extends Any {
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
   * (Highmaps) While the <code>x</code> and <code>y</code> values of the bubble are determined by
   * the underlying map, the <code>z</code> indicates the actual value that gives the
   * size of the bubble.
   *
   */
  @JSProperty("z")
  double getZ();

  /**
   * (Highmaps) While the <code>x</code> and <code>y</code> values of the bubble are determined by
   * the underlying map, the <code>z</code> indicates the actual value that gives the
   * size of the bubble.
   *
   */
  @JSProperty("z")
  void setZ(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesMapbubbleDataOptions object = Any.empty();

    private Builder() {
    }

    public SeriesMapbubbleDataOptions build() {
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
     * (Highmaps) The name of the point as shown in the legend, tooltip,
     * dataLabel etc.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highmaps) While the <code>x</code> and <code>y</code> values of the bubble are determined by
     * the underlying map, the <code>z</code> indicates the actual value that gives the
     * size of the bubble.
     *
     */
    public Builder z(double value) {
      object.setZ(value);
      return this;
    }
  }
}
