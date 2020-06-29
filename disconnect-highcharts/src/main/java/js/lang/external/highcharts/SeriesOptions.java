package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data and
 * the data itself. In TypeScript you have to cast the series options to
 * specific series types, to get all possible options for a series.
 *
 * You have to extend the <code>SeriesOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesOptions { customProperty: string; }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
   * be used after render time to get a pointer to the series object through
   * <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
   * be used after render time to get a pointer to the series object through
   * <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
   * chart, affecting the internal index in the <code>chart.series</code> array, the
   * visible Z index as well as the order in the legend.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
   * chart, affecting the internal index in the <code>chart.series</code> array, the
   * visible Z index as well as the order in the legend.
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
   * series in the legend.
   *
   */
  @JSProperty("legendIndex")
  double getLegendIndex();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
   * series in the legend.
   *
   */
  @JSProperty("legendIndex")
  void setLegendIndex(double value);

  /**
   * (Highmaps) A map data object containing a <code>path</code> definition and
   * optionally additional properties to join in the data as per the <code>joinBy</code>
   * option.
   *
   */
  @JSProperty("mapData")
  @Nullable
  Unknown /* ( Array < SeriesMapDataOptions > | any ) */ getMapData();

  /**
   * (Highmaps) A map data object containing a <code>path</code> definition and
   * optionally additional properties to join in the data as per the <code>joinBy</code>
   * option.
   *
   */
  @JSProperty("mapData")
  void setMapData(SeriesMapDataOptions... value);

  /**
   * (Highmaps) A map data object containing a <code>path</code> definition and
   * optionally additional properties to join in the data as per the <code>joinBy</code>
   * option.
   *
   */
  @JSProperty("mapData")
  void setMapData(@Nullable Any value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
   * in the legend, tooltip etc.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
   * in the legend, tooltip etc.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Highcharts, Highstock) This option allows grouping series in a stacked
   * chart. The stack option can be a string or anything else, as long as the
   * grouped series' stack options match each other after conversion into a
   * string.
   *
   */
  @JSProperty("stack")
  @Nullable
  Unknown /* ( number | string ) */ getStack();

  /**
   * (Highcharts, Highstock) This option allows grouping series in a stacked
   * chart. The stack option can be a string or anything else, as long as the
   * grouped series' stack options match each other after conversion into a
   * string.
   *
   */
  @JSProperty("stack")
  void setStack(double value);

  /**
   * (Highcharts, Highstock) This option allows grouping series in a stacked
   * chart. The stack option can be a string or anything else, as long as the
   * grouped series' stack options match each other after conversion into a
   * string.
   *
   */
  @JSProperty("stack")
  void setStack(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The type of series, for example
   * <code>line</code> or <code>column</code>. By default, the series type is inherited from
   * chart.type, so unless the chart is a combination of series types, there
   * is no need to set it on the series level.
   *
   */
  @JSProperty("type")
  JsEnum getType();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The type of series, for example
   * <code>line</code> or <code>column</code>. By default, the series type is inherited from
   * chart.type, so unless the chart is a combination of series types, there
   * is no need to set it on the series level.
   *
   */
  @JSProperty("type")
  void setType(JsEnum value);

  /**
   * (Highcharts, Highstock) When using dual or multiple x axes, this number
   * defines which xAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the xAxis array, with 0
   * being the first.
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown /* ( number | string ) */ getXAxis();

  /**
   * (Highcharts, Highstock) When using dual or multiple x axes, this number
   * defines which xAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the xAxis array, with 0
   * being the first.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(double value);

  /**
   * (Highcharts, Highstock) When using dual or multiple x axes, this number
   * defines which xAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the xAxis array, with 0
   * being the first.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(@Nullable String value);

  /**
   * (Highcharts, Highstock) When using dual or multiple y axes, this number
   * defines which yAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the yAxis array, with 0
   * being the first.
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown /* ( number | string ) */ getYAxis();

  /**
   * (Highcharts, Highstock) When using dual or multiple y axes, this number
   * defines which yAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the yAxis array, with 0
   * being the first.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(double value);

  /**
   * (Highcharts, Highstock) When using dual or multiple y axes, this number
   * defines which yAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the yAxis array, with 0
   * being the first.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(@Nullable String value);

  /**
   * (Highcharts, Highstock) Define the visual z index of the series.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock) Define the visual z index of the series.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesOptions object = Any.empty();

    private Builder() {
    }

    public SeriesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
     * be used after render time to get a pointer to the series object through
     * <code>chart.get()</code>.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
     * chart, affecting the internal index in the <code>chart.series</code> array, the
     * visible Z index as well as the order in the legend.
     *
     */
    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
     * series in the legend.
     *
     */
    public Builder legendIndex(double value) {
      object.setLegendIndex(value);
      return this;
    }

    /**
     * (Highmaps) A map data object containing a <code>path</code> definition and
     * optionally additional properties to join in the data as per the <code>joinBy</code>
     * option.
     *
     */
    public Builder mapData(SeriesMapDataOptions... value) {
      object.setMapData(value);
      return this;
    }

    /**
     * (Highmaps) A map data object containing a <code>path</code> definition and
     * optionally additional properties to join in the data as per the <code>joinBy</code>
     * option.
     *
     */
    public Builder mapData(@Nullable Any value) {
      object.setMapData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
     * in the legend, tooltip etc.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) This option allows grouping series in a stacked
     * chart. The stack option can be a string or anything else, as long as the
     * grouped series' stack options match each other after conversion into a
     * string.
     *
     */
    public Builder stack(double value) {
      object.setStack(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) This option allows grouping series in a stacked
     * chart. The stack option can be a string or anything else, as long as the
     * grouped series' stack options match each other after conversion into a
     * string.
     *
     */
    public Builder stack(@Nullable String value) {
      object.setStack(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The type of series, for example
     * <code>line</code> or <code>column</code>. By default, the series type is inherited from
     * chart.type, so unless the chart is a combination of series types, there
     * is no need to set it on the series level.
     *
     */
    public Builder type(JsEnum value) {
      object.setType(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When using dual or multiple x axes, this number
     * defines which xAxis the particular series is connected to. It refers to
     * either the axis id or the index of the axis in the xAxis array, with 0
     * being the first.
     *
     */
    public Builder xAxis(double value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When using dual or multiple x axes, this number
     * defines which xAxis the particular series is connected to. It refers to
     * either the axis id or the index of the axis in the xAxis array, with 0
     * being the first.
     *
     */
    public Builder xAxis(@Nullable String value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When using dual or multiple y axes, this number
     * defines which yAxis the particular series is connected to. It refers to
     * either the axis id or the index of the axis in the yAxis array, with 0
     * being the first.
     *
     */
    public Builder yAxis(double value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When using dual or multiple y axes, this number
     * defines which yAxis the particular series is connected to. It refers to
     * either the axis id or the index of the axis in the yAxis array, with 0
     * being the first.
     *
     */
    public Builder yAxis(@Nullable String value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Define the visual z index of the series.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
