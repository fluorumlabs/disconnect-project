package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.point">https://api.highcharts.com/highstock/plotOptions.bb.point</a>
 *
 */
public interface PlotBbPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.point.events">https://api.highcharts.com/highstock/plotOptions.bb.point.events</a>
   *
   * @implspec events?: PlotBbPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBbPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.point.events">https://api.highcharts.com/highstock/plotOptions.bb.point.events</a>
   *
   * @implspec events?: PlotBbPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBbPointEventsOptions value);
}
