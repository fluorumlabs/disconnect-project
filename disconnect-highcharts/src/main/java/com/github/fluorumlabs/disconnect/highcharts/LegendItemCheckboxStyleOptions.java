package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Default styling for the checkbox next to a
 * legend item when <code>showCheckbox</code> is true.
 *
 * @see <a href="https://api.highcharts.com/highcharts/legend.itemCheckboxStyle">https://api.highcharts.com/highcharts/legend.itemCheckboxStyle</a>
 * @see <a href="https://api.highcharts.com/highstock/legend.itemCheckboxStyle">https://api.highcharts.com/highstock/legend.itemCheckboxStyle</a>
 * @see <a href="https://api.highcharts.com/highmaps/legend.itemCheckboxStyle">https://api.highcharts.com/highmaps/legend.itemCheckboxStyle</a>
 *
 */
public interface LegendItemCheckboxStyleOptions extends Any {
  /**
   * @implspec height?: string;
   *
   */
  @JSProperty("height")
  @Nullable
  String getHeight();

  /**
   * @implspec height?: string;
   *
   */
  @JSProperty("height")
  void setHeight(String value);
}
