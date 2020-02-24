package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotPriceenvelopesBottomLineStylesOptions extends Any {
  /**
   * (Highstock) Color of the line. If not set, it's inherited from
   * plotOptions.priceenvelopes.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineColor">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) Color of the line. If not set, it's inherited from
   * plotOptions.priceenvelopes.color.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineColor">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) Pixel width of the line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineWidth">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) Pixel width of the line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineWidth">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.bottomLine.styles.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);
}
