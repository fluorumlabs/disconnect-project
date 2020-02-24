package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) An array defining zones within a series. Zones can be
 * applied to the X axis, Y axis or Z axis for bubbles, according to the
 * <code>zoneAxis</code> option. The zone definitions have to be in ascending order
 * regarding to the value.
 *
 * In styled mode, the color zones are styled with the <code>.highcharts-zone-{n}</code>
 * class, or custom classed from the <code>className</code> option (view live demo).
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones">https://api.highcharts.com/highcharts/plotOptions.macd.zones</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones">https://api.highcharts.com/highstock/plotOptions.macd.zones</a>
 *
 */
public interface PlotMacdZonesOptions extends Any {
  /**
   * (Highcharts, Highstock) Styled mode only. A custom class name for the
   * zone.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.className">https://api.highcharts.com/highcharts/plotOptions.macd.zones.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.className">https://api.highcharts.com/highstock/plotOptions.macd.zones.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock) Styled mode only. A custom class name for the
   * zone.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.className">https://api.highcharts.com/highcharts/plotOptions.macd.zones.className</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.className">https://api.highcharts.com/highstock/plotOptions.macd.zones.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.color">https://api.highcharts.com/highcharts/plotOptions.macd.zones.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.color">https://api.highcharts.com/highstock/plotOptions.macd.zones.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.color">https://api.highcharts.com/highcharts/plotOptions.macd.zones.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.color">https://api.highcharts.com/highstock/plotOptions.macd.zones.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.color">https://api.highcharts.com/highcharts/plotOptions.macd.zones.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.color">https://api.highcharts.com/highstock/plotOptions.macd.zones.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock) Defines the color of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.color">https://api.highcharts.com/highcharts/plotOptions.macd.zones.color</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.color">https://api.highcharts.com/highstock/plotOptions.macd.zones.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highstock) A name for the dash style to use for the graph.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.dashStyle">https://api.highcharts.com/highcharts/plotOptions.macd.zones.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.dashStyle">https://api.highcharts.com/highstock/plotOptions.macd.zones.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  String getDashStyle();

  /**
   * (Highcharts, Highstock) A name for the dash style to use for the graph.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.dashStyle">https://api.highcharts.com/highcharts/plotOptions.macd.zones.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.dashStyle">https://api.highcharts.com/highstock/plotOptions.macd.zones.dashStyle</a>
   *
   * @implspec dashStyle?: string;
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(String value);

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown getFillColor();

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(String value);

  /**
   * (Highcharts, Highstock) Defines the fill color for the series (in area
   * type series)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highcharts/plotOptions.macd.zones.fillColor</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor">https://api.highcharts.com/highstock/plotOptions.macd.zones.fillColor</a>
   *
   * @implspec fillColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("fillColor")
  void setFillColor(Any value);

  /**
   * (Highcharts, Highstock) The value up to where the zone extends, if
   * undefined the zones stretches to the last value in the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.value">https://api.highcharts.com/highcharts/plotOptions.macd.zones.value</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.value">https://api.highcharts.com/highstock/plotOptions.macd.zones.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock) The value up to where the zone extends, if
   * undefined the zones stretches to the last value in the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.zones.value">https://api.highcharts.com/highcharts/plotOptions.macd.zones.value</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.zones.value">https://api.highcharts.com/highstock/plotOptions.macd.zones.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);
}
