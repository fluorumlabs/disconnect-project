package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for lines which determine price zones.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines</a>
 *
 */
public interface PlotVbpZoneLinesOptions extends Any {
  /**
   * (Highstock) Enable/disable zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.enabled">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable/disable zone lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.enabled">https://api.highcharts.com/highstock/plotOptions.vbp.zoneLines.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * @implspec styles?: PlotVbpZoneLinesStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotVbpZoneLinesStylesOptions getStyles();

  /**
   * @implspec styles?: PlotVbpZoneLinesStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotVbpZoneLinesStylesOptions value);
}
