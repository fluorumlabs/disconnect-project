package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) CSS styles for each legend item. Only a
 * subset of CSS is supported, notably those options related to text. The
 * default <code>textOverflow</code> property makes long texts truncate. Set it to
 * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to control
 * the text width.
 *
 * @see <a href="https://api.highcharts.com/highcharts/legend.itemStyle">https://api.highcharts.com/highcharts/legend.itemStyle</a>
 * @see <a href="https://api.highcharts.com/highstock/legend.itemStyle">https://api.highcharts.com/highstock/legend.itemStyle</a>
 * @see <a href="https://api.highcharts.com/highmaps/legend.itemStyle">https://api.highcharts.com/highmaps/legend.itemStyle</a>
 *
 */
public interface LegendItemStyleOptions extends Any {
  /**
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);
}
