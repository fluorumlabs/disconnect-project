package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the button appearing when drilling down in a
 * treemap.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton</a>
 *
 */
public interface PlotTreemapDrillUpButtonOptions extends Any {
  /**
   * (Highcharts) The position of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position</a>
   *
   * @implspec position?: PlotTreemapDrillUpButtonPositionOptions;
   *
   */
  @JSProperty("position")
  @Nullable
  PlotTreemapDrillUpButtonPositionOptions getPosition();

  /**
   * (Highcharts) The position of the button.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position">https://api.highcharts.com/highcharts/plotOptions.treemap.drillUpButton.position</a>
   *
   * @implspec position?: PlotTreemapDrillUpButtonPositionOptions;
   *
   */
  @JSProperty("position")
  void setPosition(PlotTreemapDrillUpButtonPositionOptions value);
}
