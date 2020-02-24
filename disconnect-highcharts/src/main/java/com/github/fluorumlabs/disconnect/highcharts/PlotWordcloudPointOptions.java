package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Properties for each single point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.point">https://api.highcharts.com/highcharts/plotOptions.wordcloud.point</a>
 *
 */
public interface PlotWordcloudPointOptions extends Any {
  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.point.events">https://api.highcharts.com/highcharts/plotOptions.wordcloud.point.events</a>
   *
   * @implspec events?: PlotWordcloudPointEventsOptions;
   *
   */
  @JSProperty("events")
  @Nullable
  PlotWordcloudPointEventsOptions getEvents();

  /**
   * (Highcharts) Events for each single point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.point.events">https://api.highcharts.com/highcharts/plotOptions.wordcloud.point.events</a>
   *
   * @implspec events?: PlotWordcloudPointEventsOptions;
   *
   */
  @JSProperty("events")
  void setEvents(PlotWordcloudPointEventsOptions value);
}
