package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.point">https://api.highcharts.com/highstock/plotOptions.pivotpoints.point</a>
 *
 */
public interface PlotPivotpointsPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.point.events">https://api.highcharts.com/highstock/plotOptions.pivotpoints.point.events</a>
   *
   * @implspec events?: PlotPivotpointsPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPivotpointsPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.point.events">https://api.highcharts.com/highstock/plotOptions.pivotpoints.point.events</a>
   *
   * @implspec events?: PlotPivotpointsPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPivotpointsPointEventsOptions value);
}
