package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent
 * wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis
 * (dots).
 *
 * In styled mode, the labels are styled with the <code>.highcharts-axis-labels</code>
 * class.
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.labels.style">https://api.highcharts.com/highstock/navigator.xAxis.labels.style</a>
 *
 */
public interface NavigatorXAxisLabelsStyleOptions extends Any {
  /**
   * @implspec color?: string;
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * @implspec color?: string;
   *
   */
  @JSProperty("color")
  void setColor(String value);
}
