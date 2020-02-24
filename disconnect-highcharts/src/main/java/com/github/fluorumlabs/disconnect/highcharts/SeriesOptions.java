package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps) Series options for specific data and the
 * data itself. In TypeScript you have to cast the series options to specific
 * series types, to get all possible options for a series.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series">https://api.highcharts.com/highcharts/series</a>
 * @see <a href="https://api.highcharts.com/highstock/series">https://api.highcharts.com/highstock/series</a>
 * @see <a href="https://api.highcharts.com/highmaps/series">https://api.highcharts.com/highmaps/series</a>
 *
 */
public interface SeriesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) An id for the series. This can be used
   * after render time to get a pointer to the series object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.id">https://api.highcharts.com/highcharts/series.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.id">https://api.highcharts.com/highstock/series.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.id">https://api.highcharts.com/highmaps/series.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Highmaps) An id for the series. This can be used
   * after render time to get a pointer to the series object through
   * <code>chart.get()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.id">https://api.highcharts.com/highcharts/series.id</a>
   * @see <a href="https://api.highcharts.com/highstock/series.id">https://api.highcharts.com/highstock/series.id</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.id">https://api.highcharts.com/highmaps/series.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The index of the series in the chart,
   * affecting the internal index in the <code>chart.series</code> array, the visible Z
   * index as well as the order in the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.index">https://api.highcharts.com/highcharts/series.index</a>
   * @see <a href="https://api.highcharts.com/highstock/series.index">https://api.highcharts.com/highstock/series.index</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.index">https://api.highcharts.com/highmaps/series.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highcharts, Highstock, Highmaps) The index of the series in the chart,
   * affecting the internal index in the <code>chart.series</code> array, the visible Z
   * index as well as the order in the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.index">https://api.highcharts.com/highcharts/series.index</a>
   * @see <a href="https://api.highcharts.com/highstock/series.index">https://api.highcharts.com/highstock/series.index</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.index">https://api.highcharts.com/highmaps/series.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The sequential index of the series in
   * the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.legendIndex">https://api.highcharts.com/highcharts/series.legendIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/series.legendIndex">https://api.highcharts.com/highstock/series.legendIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.legendIndex">https://api.highcharts.com/highmaps/series.legendIndex</a>
   *
   * @implspec legendIndex?: number;
   *
   */
  @JSProperty("legendIndex")
  double getLegendIndex();

  /**
   * (Highcharts, Highstock, Highmaps) The sequential index of the series in
   * the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.legendIndex">https://api.highcharts.com/highcharts/series.legendIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/series.legendIndex">https://api.highcharts.com/highstock/series.legendIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.legendIndex">https://api.highcharts.com/highmaps/series.legendIndex</a>
   *
   * @implspec legendIndex?: number;
   *
   */
  @JSProperty("legendIndex")
  void setLegendIndex(double value);

  /**
   * (Highmaps) A map data object containing a <code>path</code> definition and
   * optionally additional properties to join in the data as per the <code>joinBy</code>
   * option.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapData">https://api.highcharts.com/highmaps/series.mapData</a>
   *
   * @implspec mapData?: (MapDataObject|Array<MapDataObject>);
   *
   */
  @JSProperty("mapData")
  @Nullable
  Unknown getMapData();

  /**
   * (Highmaps) A map data object containing a <code>path</code> definition and
   * optionally additional properties to join in the data as per the <code>joinBy</code>
   * option.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapData">https://api.highcharts.com/highmaps/series.mapData</a>
   *
   * @implspec mapData?: (MapDataObject|Array<MapDataObject>);
   *
   */
  @JSProperty("mapData")
  void setMapData(MapDataObject value);

  /**
   * (Highmaps) A map data object containing a <code>path</code> definition and
   * optionally additional properties to join in the data as per the <code>joinBy</code>
   * option.
   *
   * @see <a href="https://api.highcharts.com/highmaps/series.mapData">https://api.highcharts.com/highmaps/series.mapData</a>
   *
   * @implspec mapData?: (MapDataObject|Array<MapDataObject>);
   *
   */
  @JSProperty("mapData")
  void setMapData(Array<MapDataObject> value);

  /**
   * (Highcharts, Highstock, Highmaps) The name of the series as shown in the
   * legend, tooltip etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.name">https://api.highcharts.com/highcharts/series.name</a>
   * @see <a href="https://api.highcharts.com/highstock/series.name">https://api.highcharts.com/highstock/series.name</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.name">https://api.highcharts.com/highmaps/series.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highstock, Highmaps) The name of the series as shown in the
   * legend, tooltip etc.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.name">https://api.highcharts.com/highcharts/series.name</a>
   * @see <a href="https://api.highcharts.com/highstock/series.name">https://api.highcharts.com/highstock/series.name</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.name">https://api.highcharts.com/highmaps/series.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highstock) This option allows grouping series in a stacked
   * chart. The stack option can be a string or anything else, as long as the
   * grouped series' stack options match each other after conversion into a
   * string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.stack">https://api.highcharts.com/highcharts/series.stack</a>
   * @see <a href="https://api.highcharts.com/highstock/series.stack">https://api.highcharts.com/highstock/series.stack</a>
   *
   * @implspec stack?: (object|string);
   *
   */
  @JSProperty("stack")
  @Nullable
  Unknown getStack();

  /**
   * (Highcharts, Highstock) This option allows grouping series in a stacked
   * chart. The stack option can be a string or anything else, as long as the
   * grouped series' stack options match each other after conversion into a
   * string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.stack">https://api.highcharts.com/highcharts/series.stack</a>
   * @see <a href="https://api.highcharts.com/highstock/series.stack">https://api.highcharts.com/highstock/series.stack</a>
   *
   * @implspec stack?: (object|string);
   *
   */
  @JSProperty("stack")
  void setStack(String value);

  /**
   * (Highcharts, Highstock) This option allows grouping series in a stacked
   * chart. The stack option can be a string or anything else, as long as the
   * grouped series' stack options match each other after conversion into a
   * string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.stack">https://api.highcharts.com/highcharts/series.stack</a>
   * @see <a href="https://api.highcharts.com/highstock/series.stack">https://api.highcharts.com/highstock/series.stack</a>
   *
   * @implspec stack?: (object|string);
   *
   */
  @JSProperty("stack")
  void setStack(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The type of series, for example <code>line</code>
   * or <code>column</code>. By default, the series type is inherited from chart.type, so
   * unless the chart is a combination of series types, there is no need to
   * set it on the series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.type">https://api.highcharts.com/highcharts/series.type</a>
   * @see <a href="https://api.highcharts.com/highstock/series.type">https://api.highcharts.com/highstock/series.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.type">https://api.highcharts.com/highmaps/series.type</a>
   *
   * @implspec type: string;
   *
   */
  @JSProperty("type")
  JsEnum getType();

  /**
   * (Highcharts, Highstock, Highmaps) The type of series, for example <code>line</code>
   * or <code>column</code>. By default, the series type is inherited from chart.type, so
   * unless the chart is a combination of series types, there is no need to
   * set it on the series level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.type">https://api.highcharts.com/highcharts/series.type</a>
   * @see <a href="https://api.highcharts.com/highstock/series.type">https://api.highcharts.com/highstock/series.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.type">https://api.highcharts.com/highmaps/series.type</a>
   *
   * @implspec type: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/series.xAxis">https://api.highcharts.com/highcharts/series.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xAxis">https://api.highcharts.com/highstock/series.xAxis</a>
   *
   * @implspec xAxis?: (number|string);
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown getXAxis();

  /**
   * (Highcharts, Highstock) When using dual or multiple x axes, this number
   * defines which xAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the xAxis array, with 0
   * being the first.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xAxis">https://api.highcharts.com/highcharts/series.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xAxis">https://api.highcharts.com/highstock/series.xAxis</a>
   *
   * @implspec xAxis?: (number|string);
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
   * @see <a href="https://api.highcharts.com/highcharts/series.xAxis">https://api.highcharts.com/highcharts/series.xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xAxis">https://api.highcharts.com/highstock/series.xAxis</a>
   *
   * @implspec xAxis?: (number|string);
   *
   */
  @JSProperty("xAxis")
  void setXAxis(String value);

  /**
   * (Highcharts, Highstock) When using dual or multiple y axes, this number
   * defines which yAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the yAxis array, with 0
   * being the first.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.yAxis">https://api.highcharts.com/highcharts/series.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/series.yAxis">https://api.highcharts.com/highstock/series.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown getYAxis();

  /**
   * (Highcharts, Highstock) When using dual or multiple y axes, this number
   * defines which yAxis the particular series is connected to. It refers to
   * either the axis id or the index of the axis in the yAxis array, with 0
   * being the first.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.yAxis">https://api.highcharts.com/highcharts/series.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/series.yAxis">https://api.highcharts.com/highstock/series.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
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
   * @see <a href="https://api.highcharts.com/highcharts/series.yAxis">https://api.highcharts.com/highcharts/series.yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/series.yAxis">https://api.highcharts.com/highstock/series.yAxis</a>
   *
   * @implspec yAxis?: (number|string);
   *
   */
  @JSProperty("yAxis")
  void setYAxis(String value);

  /**
   * (Highcharts, Highstock) Define the visual z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.zIndex">https://api.highcharts.com/highcharts/series.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/series.zIndex">https://api.highcharts.com/highstock/series.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock) Define the visual z index of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.zIndex">https://api.highcharts.com/highcharts/series.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/series.zIndex">https://api.highcharts.com/highstock/series.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
