package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for macd line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.macdLine">https://api.highcharts.com/highstock/plotOptions.macd.macdLine</a>
 *
 */
public interface PlotMacdMacdLineOptions extends Any {
  /**
   * @implspec styles?: PlotMacdMacdLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotMacdMacdLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotMacdMacdLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotMacdMacdLineStylesOptions value);

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.macdLine.zones">https://api.highcharts.com/highcharts/plotOptions.macd.macdLine.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.macdLine.zones">https://api.highcharts.com/highstock/plotOptions.macd.macdLine.zones</a>
   *
   * @implspec zones?: Array<PlotMacdMacdLineZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotMacdMacdLineZonesOptions> getZones();

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.macdLine.zones">https://api.highcharts.com/highcharts/plotOptions.macd.macdLine.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.macdLine.zones">https://api.highcharts.com/highstock/plotOptions.macd.macdLine.zones</a>
   *
   * @implspec zones?: Array<PlotMacdMacdLineZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotMacdMacdLineZonesOptions> value);
}
