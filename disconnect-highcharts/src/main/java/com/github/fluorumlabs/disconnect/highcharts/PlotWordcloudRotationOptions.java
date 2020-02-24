package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Rotation options for the words in the wordcloud.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation</a>
 *
 */
public interface PlotWordcloudRotationOptions extends Any {
  /**
   * (Highcharts) The smallest degree of rotation for a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.from">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts) The smallest degree of rotation for a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.from">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts) The number of possible orientations for a word, within the
   * range of <code>rotation.from</code> and <code>rotation.to</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.orientations">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.orientations</a>
   *
   * @implspec orientations?: number;
   *
   */
  @JSProperty("orientations")
  double getOrientations();

  /**
   * (Highcharts) The number of possible orientations for a word, within the
   * range of <code>rotation.from</code> and <code>rotation.to</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.orientations">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.orientations</a>
   *
   * @implspec orientations?: number;
   *
   */
  @JSProperty("orientations")
  void setOrientations(double value);

  /**
   * (Highcharts) The largest degree of rotation for a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.to">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts) The largest degree of rotation for a word.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.to">https://api.highcharts.com/highcharts/plotOptions.wordcloud.rotation.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  void setTo(double value);
}
