package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.point">https://api.highcharts.com/highstock/plotOptions.roc.point</a>
 *
 */
public interface PlotRocPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.point.events">https://api.highcharts.com/highstock/plotOptions.roc.point.events</a>
   *
   * @implspec events?: PlotRocPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotRocPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.point.events">https://api.highcharts.com/highstock/plotOptions.roc.point.events</a>
   *
   * @implspec events?: PlotRocPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotRocPointEventsOptions value);
}
