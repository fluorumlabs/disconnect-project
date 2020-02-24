package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.point">https://api.highcharts.com/highcharts/plotOptions.sunburst.point</a>
 *
 */
public interface PlotSunburstPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.point.events">https://api.highcharts.com/highcharts/plotOptions.sunburst.point.events</a>
   *
   * @implspec events?: PlotSunburstPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSunburstPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.point.events">https://api.highcharts.com/highcharts/plotOptions.sunburst.point.events</a>
   *
   * @implspec events?: PlotSunburstPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSunburstPointEventsOptions value);
}
