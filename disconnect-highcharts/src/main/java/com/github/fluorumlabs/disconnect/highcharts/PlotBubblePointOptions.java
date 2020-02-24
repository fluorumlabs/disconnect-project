package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.point">https://api.highcharts.com/highcharts/plotOptions.bubble.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.point">https://api.highcharts.com/highstock/plotOptions.bubble.point</a>
 *
 */
public interface PlotBubblePointOptions extends Any {
  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.point.events">https://api.highcharts.com/highcharts/plotOptions.bubble.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.point.events">https://api.highcharts.com/highstock/plotOptions.bubble.point.events</a>
   *
   * @implspec events?: PlotBubblePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBubblePointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.point.events">https://api.highcharts.com/highcharts/plotOptions.bubble.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.point.events">https://api.highcharts.com/highstock/plotOptions.bubble.point.events</a>
   *
   * @implspec events?: PlotBubblePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBubblePointEventsOptions value);
}
