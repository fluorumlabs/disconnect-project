package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Chart type description strings. This is
 * added to the chart information region.
 *
 * If there is only a single series type used in the chart, we use the format
 * string for the series type, or default if missing. There is one format string
 * for cases where there is only a single series in the chart, and one for
 * multiple series of the same type.
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.chartTypes">https://api.highcharts.com/highcharts/lang.accessibility.chartTypes</a>
 * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.chartTypes">https://api.highcharts.com/highstock/lang.accessibility.chartTypes</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.chartTypes">https://api.highcharts.com/highmaps/lang.accessibility.chartTypes</a>
 *
 */
public interface LangAccessibilityChartTypesOptions extends Any {
  /**
   * @implspec barMultiple?: string;
   *
   */
  @JSProperty("barMultiple")
  @Nullable
  String getBarMultiple();

  /**
   * @implspec barMultiple?: string;
   *
   */
  @JSProperty("barMultiple")
  void setBarMultiple(String value);

  /**
   * @implspec barSingle?: string;
   *
   */
  @JSProperty("barSingle")
  @Nullable
  String getBarSingle();

  /**
   * @implspec barSingle?: string;
   *
   */
  @JSProperty("barSingle")
  void setBarSingle(String value);

  /**
   * @implspec boxplotMultiple?: string;
   *
   */
  @JSProperty("boxplotMultiple")
  @Nullable
  String getBoxplotMultiple();

  /**
   * @implspec boxplotMultiple?: string;
   *
   */
  @JSProperty("boxplotMultiple")
  void setBoxplotMultiple(String value);

  /**
   * @implspec boxplotSingle?: string;
   *
   */
  @JSProperty("boxplotSingle")
  @Nullable
  String getBoxplotSingle();

  /**
   * @implspec boxplotSingle?: string;
   *
   */
  @JSProperty("boxplotSingle")
  void setBoxplotSingle(String value);

  /**
   * @implspec bubbleMultiple?: string;
   *
   */
  @JSProperty("bubbleMultiple")
  @Nullable
  String getBubbleMultiple();

  /**
   * @implspec bubbleMultiple?: string;
   *
   */
  @JSProperty("bubbleMultiple")
  void setBubbleMultiple(String value);

  /**
   * @implspec bubbleSingle?: string;
   *
   */
  @JSProperty("bubbleSingle")
  @Nullable
  String getBubbleSingle();

  /**
   * @implspec bubbleSingle?: string;
   *
   */
  @JSProperty("bubbleSingle")
  void setBubbleSingle(String value);

  /**
   * @implspec columnMultiple?: string;
   *
   */
  @JSProperty("columnMultiple")
  @Nullable
  String getColumnMultiple();

  /**
   * @implspec columnMultiple?: string;
   *
   */
  @JSProperty("columnMultiple")
  void setColumnMultiple(String value);

  /**
   * @implspec columnSingle?: string;
   *
   */
  @JSProperty("columnSingle")
  @Nullable
  String getColumnSingle();

  /**
   * @implspec columnSingle?: string;
   *
   */
  @JSProperty("columnSingle")
  void setColumnSingle(String value);

  /**
   * @implspec combinationChart?: string;
   *
   */
  @JSProperty("combinationChart")
  @Nullable
  String getCombinationChart();

  /**
   * @implspec combinationChart?: string;
   *
   */
  @JSProperty("combinationChart")
  void setCombinationChart(String value);

  /**
   * @implspec defaultMultiple?: string;
   *
   */
  @JSProperty("defaultMultiple")
  @Nullable
  String getDefaultMultiple();

  /**
   * @implspec defaultMultiple?: string;
   *
   */
  @JSProperty("defaultMultiple")
  void setDefaultMultiple(String value);

  /**
   * @implspec defaultSingle?: string;
   *
   */
  @JSProperty("defaultSingle")
  @Nullable
  String getDefaultSingle();

  /**
   * @implspec defaultSingle?: string;
   *
   */
  @JSProperty("defaultSingle")
  void setDefaultSingle(String value);

  /**
   * @implspec emptyChart?: string;
   *
   */
  @JSProperty("emptyChart")
  @Nullable
  String getEmptyChart();

  /**
   * @implspec emptyChart?: string;
   *
   */
  @JSProperty("emptyChart")
  void setEmptyChart(String value);

  /**
   * @implspec lineMultiple?: string;
   *
   */
  @JSProperty("lineMultiple")
  @Nullable
  String getLineMultiple();

  /**
   * @implspec lineMultiple?: string;
   *
   */
  @JSProperty("lineMultiple")
  void setLineMultiple(String value);

  /**
   * @implspec lineSingle?: string;
   *
   */
  @JSProperty("lineSingle")
  @Nullable
  String getLineSingle();

  /**
   * @implspec lineSingle?: string;
   *
   */
  @JSProperty("lineSingle")
  void setLineSingle(String value);

  /**
   * @implspec mapTypeDescription?: string;
   *
   */
  @JSProperty("mapTypeDescription")
  @Nullable
  String getMapTypeDescription();

  /**
   * @implspec mapTypeDescription?: string;
   *
   */
  @JSProperty("mapTypeDescription")
  void setMapTypeDescription(String value);

  /**
   * @implspec pieMultiple?: string;
   *
   */
  @JSProperty("pieMultiple")
  @Nullable
  String getPieMultiple();

  /**
   * @implspec pieMultiple?: string;
   *
   */
  @JSProperty("pieMultiple")
  void setPieMultiple(String value);

  /**
   * @implspec pieSingle?: string;
   *
   */
  @JSProperty("pieSingle")
  @Nullable
  String getPieSingle();

  /**
   * @implspec pieSingle?: string;
   *
   */
  @JSProperty("pieSingle")
  void setPieSingle(String value);

  /**
   * @implspec scatterMultiple?: string;
   *
   */
  @JSProperty("scatterMultiple")
  @Nullable
  String getScatterMultiple();

  /**
   * @implspec scatterMultiple?: string;
   *
   */
  @JSProperty("scatterMultiple")
  void setScatterMultiple(String value);

  /**
   * @implspec scatterSingle?: string;
   *
   */
  @JSProperty("scatterSingle")
  @Nullable
  String getScatterSingle();

  /**
   * @implspec scatterSingle?: string;
   *
   */
  @JSProperty("scatterSingle")
  void setScatterSingle(String value);

  /**
   * @implspec splineMultiple?: string;
   *
   */
  @JSProperty("splineMultiple")
  @Nullable
  String getSplineMultiple();

  /**
   * @implspec splineMultiple?: string;
   *
   */
  @JSProperty("splineMultiple")
  void setSplineMultiple(String value);

  /**
   * @implspec splineSingle?: string;
   *
   */
  @JSProperty("splineSingle")
  @Nullable
  String getSplineSingle();

  /**
   * @implspec splineSingle?: string;
   *
   */
  @JSProperty("splineSingle")
  void setSplineSingle(String value);

  /**
   * @implspec unknownMap?: string;
   *
   */
  @JSProperty("unknownMap")
  @Nullable
  String getUnknownMap();

  /**
   * @implspec unknownMap?: string;
   *
   */
  @JSProperty("unknownMap")
  void setUnknownMap(String value);
}
