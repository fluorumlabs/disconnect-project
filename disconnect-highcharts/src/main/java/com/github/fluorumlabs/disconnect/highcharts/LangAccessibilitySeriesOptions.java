package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Lang configuration for different series
 * types. For more dynamic control over the series element descriptions, see
 * accessibility.seriesDescriptionFormatter.
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series">https://api.highcharts.com/highcharts/lang.accessibility.series</a>
 * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series">https://api.highcharts.com/highstock/lang.accessibility.series</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series">https://api.highcharts.com/highmaps/lang.accessibility.series</a>
 *
 */
public interface LangAccessibilitySeriesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) User supplied description text. This is
   * added after the main summary if present.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.description">https://api.highcharts.com/highcharts/lang.accessibility.series.description</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.description">https://api.highcharts.com/highstock/lang.accessibility.series.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.description">https://api.highcharts.com/highmaps/lang.accessibility.series.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Highmaps) User supplied description text. This is
   * added after the main summary if present.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.description">https://api.highcharts.com/highcharts/lang.accessibility.series.description</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.description">https://api.highcharts.com/highstock/lang.accessibility.series.description</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.description">https://api.highcharts.com/highmaps/lang.accessibility.series.description</a>
   *
   * @implspec description?: string;
   *
   */
  @JSProperty("description")
  void setDescription(String value);

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
   * @implspec summary?: LangAccessibilitySeriesSummaryOptions;
   *
   */
  @JSProperty("summary")
  @Nullable
  LangAccessibilitySeriesSummaryOptions getSummary();

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
   * @implspec summary?: LangAccessibilitySeriesSummaryOptions;
   *
   */
  @JSProperty("summary")
  void setSummary(LangAccessibilitySeriesSummaryOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) xAxis description for series if there
   * are multiple xAxes in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.xAxisDescription">https://api.highcharts.com/highcharts/lang.accessibility.series.xAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.xAxisDescription">https://api.highcharts.com/highstock/lang.accessibility.series.xAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.xAxisDescription">https://api.highcharts.com/highmaps/lang.accessibility.series.xAxisDescription</a>
   *
   * @implspec xAxisDescription?: string;
   *
   */
  @JSProperty("xAxisDescription")
  @Nullable
  String getXAxisDescription();

  /**
   * (Highcharts, Highstock, Highmaps) xAxis description for series if there
   * are multiple xAxes in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.xAxisDescription">https://api.highcharts.com/highcharts/lang.accessibility.series.xAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.xAxisDescription">https://api.highcharts.com/highstock/lang.accessibility.series.xAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.xAxisDescription">https://api.highcharts.com/highmaps/lang.accessibility.series.xAxisDescription</a>
   *
   * @implspec xAxisDescription?: string;
   *
   */
  @JSProperty("xAxisDescription")
  void setXAxisDescription(String value);

  /**
   * (Highcharts, Highstock, Highmaps) yAxis description for series if there
   * are multiple yAxes in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.yAxisDescription">https://api.highcharts.com/highcharts/lang.accessibility.series.yAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.yAxisDescription">https://api.highcharts.com/highstock/lang.accessibility.series.yAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.yAxisDescription">https://api.highcharts.com/highmaps/lang.accessibility.series.yAxisDescription</a>
   *
   * @implspec yAxisDescription?: string;
   *
   */
  @JSProperty("yAxisDescription")
  @Nullable
  String getYAxisDescription();

  /**
   * (Highcharts, Highstock, Highmaps) yAxis description for series if there
   * are multiple yAxes in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series.yAxisDescription">https://api.highcharts.com/highcharts/lang.accessibility.series.yAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series.yAxisDescription">https://api.highcharts.com/highstock/lang.accessibility.series.yAxisDescription</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series.yAxisDescription">https://api.highcharts.com/highmaps/lang.accessibility.series.yAxisDescription</a>
   *
   * @implspec yAxisDescription?: string;
   *
   */
  @JSProperty("yAxisDescription")
  void setYAxisDescription(String value);
}
