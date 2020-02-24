package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.point">https://api.highcharts.com/highcharts/plotOptions.waterfall.point</a>
 *
 */
public interface PlotWaterfallPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.point.events">https://api.highcharts.com/highcharts/plotOptions.waterfall.point.events</a>
   *
   * @implspec events?: PlotWaterfallPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotWaterfallPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.point.events">https://api.highcharts.com/highcharts/plotOptions.waterfall.point.events</a>
   *
   * @implspec events?: PlotWaterfallPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotWaterfallPointEventsOptions value);
}
