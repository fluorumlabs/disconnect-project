package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) An array of data points for the series. For the <code>map</code> series type,
 * points can be given in the following ways:
 *
 * <ol>
 * <li>
 * An array of numerical values. In this case, the numerical values will be
 * interpreted as <code>value</code> options. Example: (see online documentation for
 * example)
 *
 * </li>
 * <li>
 * An array of arrays with 2 values. In this case, the values correspond to
 * <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesMapDataOptions extends Any {
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
   * (Highmaps) When data labels are laid out on a map, Highmaps runs a
   * simplified algorithm to detect collision. When two labels collide, the
   * one with the lowest rank is hidden. By default the rank is computed from
   * the area.
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highmaps) When data labels are laid out on a map, Highmaps runs a
   * simplified algorithm to detect collision. When two labels collide, the
   * one with the lowest rank is hidden. By default the rank is computed from
   * the area.
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be
   * defined there.
   *
   */
  @JSProperty("middleX")
  double getMiddleX();

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be
   * defined there.
   *
   */
  @JSProperty("middleX")
  void setMiddleX(double value);

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be
   * defined there.
   *
   */
  @JSProperty("middleY")
  double getMiddleY();

  /**
   * (Highmaps) The relative mid point of an area, used to place the data
   * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be
   * defined there.
   *
   */
  @JSProperty("middleY")
  void setMiddleY(double value);

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
   * (Highmaps) For map and mapline series types, the SVG path for the shape.
   * For compatibily with old IE, not all SVG path definitions are supported,
   * but M, L and C operators are safe.
   *
   * To achieve a better separation between the structure and the data, it is
   * recommended to use <code>mapData</code> to define that paths instead of defining
   * them on the data points themselves.
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * (Highmaps) For map and mapline series types, the SVG path for the shape.
   * For compatibily with old IE, not all SVG path definitions are supported,
   * but M, L and C operators are safe.
   *
   * To achieve a better separation between the structure and the data, it is
   * recommended to use <code>mapData</code> to define that paths instead of defining
   * them on the data points themselves.
   *
   */
  @JSProperty("path")
  void setPath(@Nullable String value);

  /**
   * (Highmaps) The numeric value of the data point.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highmaps) The numeric value of the data point.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  class Builder {
    private final SeriesMapDataOptions object = Any.empty();

    public SeriesMapDataOptions build() {
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
     * (Highmaps) When data labels are laid out on a map, Highmaps runs a
     * simplified algorithm to detect collision. When two labels collide, the
     * one with the lowest rank is hidden. By default the rank is computed from
     * the area.
     *
     */
    public Builder labelrank(double value) {
      object.setLabelrank(value);
      return this;
    }

    /**
     * (Highmaps) The relative mid point of an area, used to place the data
     * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be
     * defined there.
     *
     */
    public Builder middleX(double value) {
      object.setMiddleX(value);
      return this;
    }

    /**
     * (Highmaps) The relative mid point of an area, used to place the data
     * label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be
     * defined there.
     *
     */
    public Builder middleY(double value) {
      object.setMiddleY(value);
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
     * (Highmaps) For map and mapline series types, the SVG path for the shape.
     * For compatibily with old IE, not all SVG path definitions are supported,
     * but M, L and C operators are safe.
     *
     * To achieve a better separation between the structure and the data, it is
     * recommended to use <code>mapData</code> to define that paths instead of defining
     * them on the data points themselves.
     *
     */
    public Builder path(@Nullable String value) {
      object.setPath(value);
      return this;
    }

    /**
     * (Highmaps) The numeric value of the data point.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
