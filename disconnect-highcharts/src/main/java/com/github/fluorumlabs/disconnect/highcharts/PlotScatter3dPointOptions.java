package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.point">https://api.highcharts.com/highcharts/plotOptions.scatter3d.point</a>
 *
 */
public interface PlotScatter3dPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.point.events">https://api.highcharts.com/highcharts/plotOptions.scatter3d.point.events</a>
   *
   * @implspec events?: PlotScatter3dPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotScatter3dPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.point.events">https://api.highcharts.com/highcharts/plotOptions.scatter3d.point.events</a>
   *
   * @implspec events?: PlotScatter3dPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotScatter3dPointEventsOptions value);
}
