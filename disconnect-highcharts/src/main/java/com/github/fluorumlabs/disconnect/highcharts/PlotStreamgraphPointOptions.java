package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph.point">https://api.highcharts.com/highcharts/plotOptions.streamgraph.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph.point">https://api.highcharts.com/highstock/plotOptions.streamgraph.point</a>
 *
 */
public interface PlotStreamgraphPointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph.point.events">https://api.highcharts.com/highcharts/plotOptions.streamgraph.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph.point.events">https://api.highcharts.com/highstock/plotOptions.streamgraph.point.events</a>
   *
   * @implspec events?: PlotStreamgraphPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotStreamgraphPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph.point.events">https://api.highcharts.com/highcharts/plotOptions.streamgraph.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph.point.events">https://api.highcharts.com/highstock/plotOptions.streamgraph.point.events</a>
   *
   * @implspec events?: PlotStreamgraphPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotStreamgraphPointEventsOptions value);
}
