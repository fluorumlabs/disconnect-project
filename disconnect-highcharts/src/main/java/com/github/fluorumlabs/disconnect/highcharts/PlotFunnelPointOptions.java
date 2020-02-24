package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel.point">https://api.highcharts.com/highcharts/plotOptions.funnel.point</a>
 *
 */
public interface PlotFunnelPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel.point.events">https://api.highcharts.com/highcharts/plotOptions.funnel.point.events</a>
   *
   * @implspec events?: PlotFunnelPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotFunnelPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel.point.events">https://api.highcharts.com/highcharts/plotOptions.funnel.point.events</a>
   *
   * @implspec events?: PlotFunnelPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotFunnelPointEventsOptions value);
}
