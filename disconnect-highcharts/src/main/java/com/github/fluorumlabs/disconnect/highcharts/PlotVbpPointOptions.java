package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.point">https://api.highcharts.com/highstock/plotOptions.vbp.point</a>
 *
 */
public interface PlotVbpPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.point.events">https://api.highcharts.com/highstock/plotOptions.vbp.point.events</a>
   *
   * @implspec events?: PlotVbpPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotVbpPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.point.events">https://api.highcharts.com/highstock/plotOptions.vbp.point.events</a>
   *
   * @implspec events?: PlotVbpPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotVbpPointEventsOptions value);
}
