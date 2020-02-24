package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Descriptions of lesser known series types.
 * The relevant description is added to the screen reader information region
 * when these series types are used.
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highcharts/lang.accessibility.seriesTypeDescriptions</a>
 * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highstock/lang.accessibility.seriesTypeDescriptions</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highmaps/lang.accessibility.seriesTypeDescriptions</a>
 *
 */
public interface LangAccessibilitySeriesTypeDescriptionsOptions extends Any {
  /**
   * @implspec arearange?: string;
   *
   */
  @JSProperty("arearange")
  @Nullable
  String getArearange();

  /**
   * @implspec arearange?: string;
   *
   */
  @JSProperty("arearange")
  void setArearange(String value);

  /**
   * @implspec areasplinerange?: string;
   *
   */
  @JSProperty("areasplinerange")
  @Nullable
  String getAreasplinerange();

  /**
   * @implspec areasplinerange?: string;
   *
   */
  @JSProperty("areasplinerange")
  void setAreasplinerange(String value);

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
   * @implspec columnrange?: string;
   *
   */
  @JSProperty("columnrange")
  @Nullable
  String getColumnrange();

  /**
   * @implspec columnrange?: string;
   *
   */
  @JSProperty("columnrange")
  void setColumnrange(String value);

  /**
   * @implspec errorbar?: string;
   *
   */
  @JSProperty("errorbar")
  @Nullable
  String getErrorbar();

  /**
   * @implspec errorbar?: string;
   *
   */
  @JSProperty("errorbar")
  void setErrorbar(String value);

  /**
   * @implspec funnel?: string;
   *
   */
  @JSProperty("funnel")
  @Nullable
  String getFunnel();

  /**
   * @implspec funnel?: string;
   *
   */
  @JSProperty("funnel")
  void setFunnel(String value);

  /**
   * @implspec pyramid?: string;
   *
   */
  @JSProperty("pyramid")
  @Nullable
  String getPyramid();

  /**
   * @implspec pyramid?: string;
   *
   */
  @JSProperty("pyramid")
  void setPyramid(String value);

  /**
   * @implspec waterfall?: string;
   *
   */
  @JSProperty("waterfall")
  @Nullable
  String getWaterfall();

  /**
   * @implspec waterfall?: string;
   *
   */
  @JSProperty("waterfall")
  void setWaterfall(String value);
}
