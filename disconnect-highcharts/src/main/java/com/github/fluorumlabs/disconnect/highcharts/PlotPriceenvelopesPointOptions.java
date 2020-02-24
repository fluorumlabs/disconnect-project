package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.point">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.point</a>
 *
 */
public interface PlotPriceenvelopesPointOptions extends Any {
  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.point.events">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.point.events</a>
   *
   * @implspec events?: PlotPriceenvelopesPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotPriceenvelopesPointEventsOptions getEvents();

  /**
   * (Highstock) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.point.events">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.point.events</a>
   *
   * @implspec events?: PlotPriceenvelopesPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotPriceenvelopesPointEventsOptions value);
}
