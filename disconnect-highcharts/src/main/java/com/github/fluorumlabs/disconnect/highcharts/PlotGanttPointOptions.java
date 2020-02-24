package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.point">https://api.highcharts.com/gantt/plotOptions.gantt.point</a>
 *
 */
public interface PlotGanttPointOptions extends Any {
  /**
   * (Gantt) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.point.events">https://api.highcharts.com/gantt/plotOptions.gantt.point.events</a>
   *
   * @implspec events?: PlotGanttPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotGanttPointEventsOptions getEvents();

  /**
   * (Gantt) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.point.events">https://api.highcharts.com/gantt/plotOptions.gantt.point.events</a>
   *
   * @implspec events?: PlotGanttPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotGanttPointEventsOptions value);
}
