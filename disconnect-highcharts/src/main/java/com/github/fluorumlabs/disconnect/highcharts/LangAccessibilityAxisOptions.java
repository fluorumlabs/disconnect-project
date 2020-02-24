package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Axis description format strings.
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.axis">https://api.highcharts.com/highcharts/lang.accessibility.axis</a>
 * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.axis">https://api.highcharts.com/highstock/lang.accessibility.axis</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.axis">https://api.highcharts.com/highmaps/lang.accessibility.axis</a>
 *
 */
public interface LangAccessibilityAxisOptions extends Any {
  /**
   * @implspec xAxisDescriptionPlural?: string;
   *
   */
  @JSProperty("xAxisDescriptionPlural")
  @Nullable
  String getXAxisDescriptionPlural();

  /**
   * @implspec xAxisDescriptionPlural?: string;
   *
   */
  @JSProperty("xAxisDescriptionPlural")
  void setXAxisDescriptionPlural(String value);

  /**
   * @implspec xAxisDescriptionSingular?: string;
   *
   */
  @JSProperty("xAxisDescriptionSingular")
  @Nullable
  String getXAxisDescriptionSingular();

  /**
   * @implspec xAxisDescriptionSingular?: string;
   *
   */
  @JSProperty("xAxisDescriptionSingular")
  void setXAxisDescriptionSingular(String value);

  /**
   * @implspec yAxisDescriptionPlural?: string;
   *
   */
  @JSProperty("yAxisDescriptionPlural")
  @Nullable
  String getYAxisDescriptionPlural();

  /**
   * @implspec yAxisDescriptionPlural?: string;
   *
   */
  @JSProperty("yAxisDescriptionPlural")
  void setYAxisDescriptionPlural(String value);

  /**
   * @implspec yAxisDescriptionSingular?: string;
   *
   */
  @JSProperty("yAxisDescriptionSingular")
  @Nullable
  String getYAxisDescriptionSingular();

  /**
   * @implspec yAxisDescriptionSingular?: string;
   *
   */
  @JSProperty("yAxisDescriptionSingular")
  void setYAxisDescriptionSingular(String value);
}
