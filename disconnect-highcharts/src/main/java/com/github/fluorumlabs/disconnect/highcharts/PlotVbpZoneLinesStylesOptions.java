package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

public interface PlotVbpZoneLinesStylesOptions extends Any {
  /**
   * (Highstock) Color of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highstock) Color of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highstock) Color of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highstock) Color of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highstock) The dash style of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.dashStyle">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  String getDashStyle();

  /**
   * (Highstock) The dash style of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.dashStyle">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(String value);

  /**
   * (Highstock) Pixel width of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.lineWidth">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) Pixel width of zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.lineWidth">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.styles.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);
}
