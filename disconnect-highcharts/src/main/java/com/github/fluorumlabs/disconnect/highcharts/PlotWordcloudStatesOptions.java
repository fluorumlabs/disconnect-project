package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states</a>
 *
 */
public interface PlotWordcloudStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover</a>
   *
   * @implspec hover?: PlotWordcloudStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotWordcloudStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.hover</a>
   *
   * @implspec hover?: PlotWordcloudStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotWordcloudStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.normal">https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.normal</a>
   *
   * @implspec normal?: PlotWordcloudStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotWordcloudStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.normal">https://api.highcharts.com/highmaps/plotOptions.wordcloud.states.normal</a>
   *
   * @implspec normal?: PlotWordcloudStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotWordcloudStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.select">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.select">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.select">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.select</a>
   *
   * @implspec select?: PlotWordcloudStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotWordcloudStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.select">https://api.highcharts.com/highcharts/plotOptions.wordcloud.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wordcloud.states.select">https://api.highcharts.com/highstock/plotOptions.wordcloud.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.wordcloud.states.select">https://api.highcharts.com/gantt/plotOptions.wordcloud.states.select</a>
   *
   * @implspec select?: PlotWordcloudStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotWordcloudStatesSelectOptions value);
}
