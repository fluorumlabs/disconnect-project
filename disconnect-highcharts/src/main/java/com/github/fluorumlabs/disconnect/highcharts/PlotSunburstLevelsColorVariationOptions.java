package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the same
 * level.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation</a>
 *
 */
public interface PlotSunburstLevelsColorVariationOptions extends Any {
  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.key">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.key</a>
   *
   * @implspec key?: string;
   *
   */
  @JSProperty("key")
  @Nullable
  String getKey();

  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.key">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.key</a>
   *
   * @implspec key?: string;
   *
   */
  @JSProperty("key")
  void setKey(String value);

  /**
   * (Highcharts) The ending value of a color variation. The last sibling will
   * receive this value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.to">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts) The ending value of a color variation. The last sibling will
   * receive this value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.to">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  void setTo(double value);
}
