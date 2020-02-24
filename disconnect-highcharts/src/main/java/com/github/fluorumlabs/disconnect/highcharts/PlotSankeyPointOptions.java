package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.point">https://api.highcharts.com/highcharts/plotOptions.sankey.point</a>
 *
 */
public interface PlotSankeyPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.point.events">https://api.highcharts.com/highcharts/plotOptions.sankey.point.events</a>
   *
   * @implspec events?: PlotSankeyPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSankeyPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.point.events">https://api.highcharts.com/highcharts/plotOptions.sankey.point.events</a>
   *
   * @implspec events?: PlotSankeyPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSankeyPointEventsOptions value);
}
