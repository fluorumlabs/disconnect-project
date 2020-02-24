package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.point">https://api.highcharts.com/highstock/plotOptions.atr.point</a>
 *
 */
public interface PlotAtrPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.point.events">https://api.highcharts.com/highstock/plotOptions.atr.point.events</a>
   *
   * @implspec events?: PlotAtrPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotAtrPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.point.events">https://api.highcharts.com/highstock/plotOptions.atr.point.events</a>
   *
   * @implspec events?: PlotAtrPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotAtrPointEventsOptions value);
}
