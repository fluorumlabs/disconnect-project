package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Lang configuration for the series main
 * summary. Each series type has two modes:
 *
 * <ol>
 * <li>
 * This series type is the only series type used in the chart
 *
 * </li>
 * <li>
 * This is a combination chart with multiple series types
 *
 * </li>
 * </ol>
 * If a definition does not exist for the specific series type and mode, the
 * 'default' lang definitions are used.
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.summary">https://api.highcharts.com/highcharts/lang.accessibility.series.summary</a>
 * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.summary">https://api.highcharts.com/highstock/lang.accessibility.series.summary</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.summary">https://api.highcharts.com/highmaps/lang.accessibility.series.summary</a>
 *
 */
public interface LangAccessibilitySeriesSummaryOptions extends Any {
  /**
   * @implspec bar?: string;
   *
   */
  @JSProperty("bar")
  @Nullable
  String getBar();

  /**
   * @implspec bar?: string;
   *
   */
  @JSProperty("bar")
  void setBar(String value);

  /**
   * @implspec barCombination?: string;
   *
   */
  @JSProperty("barCombination")
  @Nullable
  String getBarCombination();

  /**
   * @implspec barCombination?: string;
   *
   */
  @JSProperty("barCombination")
  void setBarCombination(String value);

  /**
   * @implspec boxplot?: string;
   *
   */
  @JSProperty("boxplot")
  @Nullable
  String getBoxplot();

  /**
   * @implspec boxplot?: string;
   *
   */
  @JSProperty("boxplot")
  void setBoxplot(String value);

  /**
   * @implspec boxplotCombination?: string;
   *
   */
  @JSProperty("boxplotCombination")
  @Nullable
  String getBoxplotCombination();

  /**
   * @implspec boxplotCombination?: string;
   *
   */
  @JSProperty("boxplotCombination")
  void setBoxplotCombination(String value);

  /**
   * @implspec bubble?: string;
   *
   */
  @JSProperty("bubble")
  @Nullable
  String getBubble();

  /**
   * @implspec bubble?: string;
   *
   */
  @JSProperty("bubble")
  void setBubble(String value);

  /**
   * @implspec bubbleCombination?: string;
   *
   */
  @JSProperty("bubbleCombination")
  @Nullable
  String getBubbleCombination();

  /**
   * @implspec bubbleCombination?: string;
   *
   */
  @JSProperty("bubbleCombination")
  void setBubbleCombination(String value);

  /**
   * @implspec column?: string;
   *
   */
  @JSProperty("column")
  @Nullable
  String getColumn();

  /**
   * @implspec column?: string;
   *
   */
  @JSProperty("column")
  void setColumn(String value);

  /**
   * @implspec columnCombination?: string;
   *
   */
  @JSProperty("columnCombination")
  @Nullable
  String getColumnCombination();

  /**
   * @implspec columnCombination?: string;
   *
   */
  @JSProperty("columnCombination")
  void setColumnCombination(String value);

  /**
   * @implspec default?: string;
   *
   */
  @JSProperty("default")
  @Nullable
  String getDefault();

  /**
   * @implspec default?: string;
   *
   */
  @JSProperty("default")
  void setDefault(String value);

  /**
   * @implspec defaultCombination?: string;
   *
   */
  @JSProperty("defaultCombination")
  @Nullable
  String getDefaultCombination();

  /**
   * @implspec defaultCombination?: string;
   *
   */
  @JSProperty("defaultCombination")
  void setDefaultCombination(String value);

  /**
   * @implspec line?: string;
   *
   */
  @JSProperty("line")
  @Nullable
  String getLine();

  /**
   * @implspec line?: string;
   *
   */
  @JSProperty("line")
  void setLine(String value);

  /**
   * @implspec lineCombination?: string;
   *
   */
  @JSProperty("lineCombination")
  @Nullable
  String getLineCombination();

  /**
   * @implspec lineCombination?: string;
   *
   */
  @JSProperty("lineCombination")
  void setLineCombination(String value);

  /**
   * @implspec map?: string;
   *
   */
  @JSProperty("map")
  @Nullable
  String getMap();

  /**
   * @implspec map?: string;
   *
   */
  @JSProperty("map")
  void setMap(String value);

  /**
   * @implspec mapbubble?: string;
   *
   */
  @JSProperty("mapbubble")
  @Nullable
  String getMapbubble();

  /**
   * @implspec mapbubble?: string;
   *
   */
  @JSProperty("mapbubble")
  void setMapbubble(String value);

  /**
   * @implspec mapbubbleCombination?: string;
   *
   */
  @JSProperty("mapbubbleCombination")
  @Nullable
  String getMapbubbleCombination();

  /**
   * @implspec mapbubbleCombination?: string;
   *
   */
  @JSProperty("mapbubbleCombination")
  void setMapbubbleCombination(String value);

  /**
   * @implspec mapCombination?: string;
   *
   */
  @JSProperty("mapCombination")
  @Nullable
  String getMapCombination();

  /**
   * @implspec mapCombination?: string;
   *
   */
  @JSProperty("mapCombination")
  void setMapCombination(String value);

  /**
   * @implspec mapline?: string;
   *
   */
  @JSProperty("mapline")
  @Nullable
  String getMapline();

  /**
   * @implspec mapline?: string;
   *
   */
  @JSProperty("mapline")
  void setMapline(String value);

  /**
   * @implspec maplineCombination?: string;
   *
   */
  @JSProperty("maplineCombination")
  @Nullable
  String getMaplineCombination();

  /**
   * @implspec maplineCombination?: string;
   *
   */
  @JSProperty("maplineCombination")
  void setMaplineCombination(String value);

  /**
   * @implspec pie?: string;
   *
   */
  @JSProperty("pie")
  @Nullable
  String getPie();

  /**
   * @implspec pie?: string;
   *
   */
  @JSProperty("pie")
  void setPie(String value);

  /**
   * @implspec pieCombination?: string;
   *
   */
  @JSProperty("pieCombination")
  @Nullable
  String getPieCombination();

  /**
   * @implspec pieCombination?: string;
   *
   */
  @JSProperty("pieCombination")
  void setPieCombination(String value);

  /**
   * @implspec scatter?: string;
   *
   */
  @JSProperty("scatter")
  @Nullable
  String getScatter();

  /**
   * @implspec scatter?: string;
   *
   */
  @JSProperty("scatter")
  void setScatter(String value);

  /**
   * @implspec scatterCombination?: string;
   *
   */
  @JSProperty("scatterCombination")
  @Nullable
  String getScatterCombination();

  /**
   * @implspec scatterCombination?: string;
   *
   */
  @JSProperty("scatterCombination")
  void setScatterCombination(String value);

  /**
   * @implspec spline?: string;
   *
   */
  @JSProperty("spline")
  @Nullable
  String getSpline();

  /**
   * @implspec spline?: string;
   *
   */
  @JSProperty("spline")
  void setSpline(String value);

  /**
   * @implspec splineCombination?: string;
   *
   */
  @JSProperty("splineCombination")
  @Nullable
  String getSplineCombination();

  /**
   * @implspec splineCombination?: string;
   *
   */
  @JSProperty("splineCombination")
  void setSplineCombination(String value);
}
