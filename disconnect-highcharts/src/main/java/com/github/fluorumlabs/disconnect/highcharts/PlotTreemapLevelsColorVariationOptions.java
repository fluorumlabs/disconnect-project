package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A configuration object to define how the color of a child varies
 * from the parent's color. The variation is distributed among the children of
 * node. For example when setting brightness, the brightness change will range
 * from the parent's original brightness on the first child, to the amount set
 * in the <code>to</code> setting on the last node. This allows a gradient-like color
 * scheme that sets children out from each other while highlighting the grouping
 * on treemaps and sectors on sunburst charts.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation</a>
 *
 */
public interface PlotTreemapLevelsColorVariationOptions extends Any {
  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.key">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.key</a>
   *
   * @implspec key?: &quot;brightness&quot;;
   *
   */
  @JSProperty("key")
  @Nullable
  Key getKey();

  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.key">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.key</a>
   *
   * @implspec key?: &quot;brightness&quot;;
   *
   */
  @JSProperty("key")
  void setKey(Key value);

  /**
   * (Highcharts) The ending value of a color variation. The last sibling will
   * receive this value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.to">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.to</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.to">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  void setTo(double value);

  /**
   */
  abstract class Key extends JsEnum {
    public static final Key BRIGHTNESS = JsEnum.of("brightness");
  }
}
