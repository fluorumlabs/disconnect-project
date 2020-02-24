package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.point">https://api.highcharts.com/highcharts/plotOptions.pareto.point</a>
 *
 */
public interface PlotParetoPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.point.events">https://api.highcharts.com/highcharts/plotOptions.pareto.point.events</a>
   *
   * @implspec events?: PlotParetoPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotParetoPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.point.events">https://api.highcharts.com/highcharts/plotOptions.pareto.point.events</a>
   *
   * @implspec events?: PlotParetoPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotParetoPointEventsOptions value);
}
