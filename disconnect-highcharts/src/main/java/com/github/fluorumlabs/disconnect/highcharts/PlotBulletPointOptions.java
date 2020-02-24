package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.point">https://api.highcharts.com/highcharts/plotOptions.bullet.point</a>
 *
 */
public interface PlotBulletPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.point.events">https://api.highcharts.com/highcharts/plotOptions.bullet.point.events</a>
   *
   * @implspec events?: PlotBulletPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBulletPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.point.events">https://api.highcharts.com/highcharts/plotOptions.bullet.point.events</a>
   *
   * @implspec events?: PlotBulletPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBulletPointEventsOptions value);
}
