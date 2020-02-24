package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) CSS styles for the tooltip. The tooltip can
 * also be styled through the CSS class <code>.highcharts-tooltip</code>.
 *
 * @see <a href="https://api.highcharts.com/highcharts/tooltip.style">https://api.highcharts.com/highcharts/tooltip.style</a>
 * @see <a href="https://api.highcharts.com/highstock/tooltip.style">https://api.highcharts.com/highstock/tooltip.style</a>
 * @see <a href="https://api.highcharts.com/highmaps/tooltip.style">https://api.highcharts.com/highmaps/tooltip.style</a>
 *
 */
public interface TooltipStyleOptions extends Any {
  /**
   * @implspec whiteSpace?: string;
   *
   */
  @JSProperty("whiteSpace")
  @Nullable
  String getWhiteSpace();

  /**
   * @implspec whiteSpace?: string;
   *
   */
  @JSProperty("whiteSpace")
  void setWhiteSpace(String value);
}
