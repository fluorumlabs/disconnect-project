package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for signal line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.signalLine">https://api.highcharts.com/highstock/plotOptions.macd.signalLine</a>
 *
 */
public interface PlotMacdSignalLineOptions extends Any {
  /**
   * @implspec styles?: PlotMacdSignalLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotMacdSignalLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotMacdSignalLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotMacdSignalLineStylesOptions value);

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.signalLine.zones">https://api.highcharts.com/highcharts/plotOptions.macd.signalLine.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.signalLine.zones">https://api.highcharts.com/highstock/plotOptions.macd.signalLine.zones</a>
   *
   * @implspec zones?: Array<PlotMacdSignalLineZonesOptions>;
   *
   */
  @JSProperty("zones")
  @Nullable
  Array<PlotMacdSignalLineZonesOptions> getZones();

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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.macd.signalLine.zones">https://api.highcharts.com/highcharts/plotOptions.macd.signalLine.zones</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.signalLine.zones">https://api.highcharts.com/highstock/plotOptions.macd.signalLine.zones</a>
   *
   * @implspec zones?: Array<PlotMacdSignalLineZonesOptions>;
   *
   */
  @JSProperty("zones")
  void setZones(Array<PlotMacdSignalLineZonesOptions> value);
}
