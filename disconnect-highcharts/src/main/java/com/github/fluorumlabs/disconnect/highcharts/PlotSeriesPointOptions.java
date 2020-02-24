package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.point">https://api.highcharts.com/highcharts/plotOptions.series.point</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.point">https://api.highcharts.com/highstock/plotOptions.series.point</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.point">https://api.highcharts.com/highmaps/plotOptions.series.point</a>
 *
 */
public interface PlotSeriesPointOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.point.events">https://api.highcharts.com/highcharts/plotOptions.series.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.point.events">https://api.highcharts.com/highstock/plotOptions.series.point.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.point.events">https://api.highcharts.com/highmaps/plotOptions.series.point.events</a>
   *
   * @implspec events?: PlotSeriesPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotSeriesPointEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Highmaps) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.point.events">https://api.highcharts.com/highcharts/plotOptions.series.point.events</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.point.events">https://api.highcharts.com/highstock/plotOptions.series.point.events</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.point.events">https://api.highcharts.com/highmaps/plotOptions.series.point.events</a>
   *
   * @implspec events?: PlotSeriesPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotSeriesPointEventsOptions value);
}
