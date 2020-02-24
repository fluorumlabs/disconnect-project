package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.point">https://api.highcharts.com/highstock/plotOptions.cmf.point</a>
 *
 */
public interface PlotCmfPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.point.events">https://api.highcharts.com/highstock/plotOptions.cmf.point.events</a>
   *
   * @implspec events?: PlotCmfPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotCmfPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.point.events">https://api.highcharts.com/highstock/plotOptions.cmf.point.events</a>
   *
   * @implspec events?: PlotCmfPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotCmfPointEventsOptions value);
}
