package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.point">https://api.highcharts.com/highcharts/plotOptions.bellcurve.point</a>
 *
 */
public interface PlotBellcurvePointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.point.events">https://api.highcharts.com/highcharts/plotOptions.bellcurve.point.events</a>
   *
   * @implspec events?: PlotBellcurvePointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotBellcurvePointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.point.events">https://api.highcharts.com/highcharts/plotOptions.bellcurve.point.events</a>
   *
   * @implspec events?: PlotBellcurvePointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotBellcurvePointEventsOptions value);
}
