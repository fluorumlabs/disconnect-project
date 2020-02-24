package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Exporting menu format strings for
 * accessibility module.
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.exporting">https://api.highcharts.com/highcharts/lang.accessibility.exporting</a>
 * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.exporting">https://api.highcharts.com/highstock/lang.accessibility.exporting</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.exporting">https://api.highcharts.com/highmaps/lang.accessibility.exporting</a>
 *
 */
public interface LangAccessibilityExportingOptions extends Any {
  /**
   * @implspec chartMenuLabel?: string;
   *
   */
  @JSProperty("chartMenuLabel")
  @Nullable
  String getChartMenuLabel();

  /**
   * @implspec chartMenuLabel?: string;
   *
   */
  @JSProperty("chartMenuLabel")
  void setChartMenuLabel(String value);

  /**
   * @implspec exportRegionLabel?: string;
   *
   */
  @JSProperty("exportRegionLabel")
  @Nullable
  String getExportRegionLabel();

  /**
   * @implspec exportRegionLabel?: string;
   *
   */
  @JSProperty("exportRegionLabel")
  void setExportRegionLabel(String value);

  /**
   * @implspec menuButtonLabel?: string;
   *
   */
  @JSProperty("menuButtonLabel")
  @Nullable
  String getMenuButtonLabel();

  /**
   * @implspec menuButtonLabel?: string;
   *
   */
  @JSProperty("menuButtonLabel")
  void setMenuButtonLabel(String value);
}
