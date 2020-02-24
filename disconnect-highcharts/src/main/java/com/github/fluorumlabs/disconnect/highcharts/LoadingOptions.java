package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The loading options control the appearance
 * of the loading screen that covers the plot area on chart operations. This
 * screen only appears after an explicit call to <code>chart.showLoading()</code>. It is a
 * utility for developers to communicate to the end user that something is going
 * on, for example while retrieving new data via an XHR connection. The
 * &quot;Loading...&quot; text itself is not part of this configuration object, but part
 * of the <code>lang</code> object.
 *
 * @see <a href="https://api.highcharts.com/highcharts/loading">https://api.highcharts.com/highcharts/loading</a>
 * @see <a href="https://api.highcharts.com/highstock/loading">https://api.highcharts.com/highstock/loading</a>
 * @see <a href="https://api.highcharts.com/highmaps/loading">https://api.highcharts.com/highmaps/loading</a>
 *
 */
public interface LoadingOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The duration in milliseconds of the
   * fade out effect.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.hideDuration">https://api.highcharts.com/highcharts/loading.hideDuration</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.hideDuration">https://api.highcharts.com/highstock/loading.hideDuration</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.hideDuration">https://api.highcharts.com/highmaps/loading.hideDuration</a>
   *
   * @implspec hideDuration?: number;
   *
   */
  @JSProperty("hideDuration")
  double getHideDuration();

  /**
   * (Highcharts, Highstock, Highmaps) The duration in milliseconds of the
   * fade out effect.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.hideDuration">https://api.highcharts.com/highcharts/loading.hideDuration</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.hideDuration">https://api.highcharts.com/highstock/loading.hideDuration</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.hideDuration">https://api.highcharts.com/highmaps/loading.hideDuration</a>
   *
   * @implspec hideDuration?: number;
   *
   */
  @JSProperty("hideDuration")
  void setHideDuration(double value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the loading label
   * <code>span</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.labelStyle">https://api.highcharts.com/highcharts/loading.labelStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.labelStyle">https://api.highcharts.com/highstock/loading.labelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.labelStyle">https://api.highcharts.com/highmaps/loading.labelStyle</a>
   *
   * @implspec labelStyle?: CSSObject;
   *
   */
  @JSProperty("labelStyle")
  @Nullable
  CSSObject getLabelStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the loading label
   * <code>span</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.labelStyle">https://api.highcharts.com/highcharts/loading.labelStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.labelStyle">https://api.highcharts.com/highstock/loading.labelStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.labelStyle">https://api.highcharts.com/highmaps/loading.labelStyle</a>
   *
   * @implspec labelStyle?: CSSObject;
   *
   */
  @JSProperty("labelStyle")
  void setLabelStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The duration in milliseconds of the
   * fade in effect.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.showDuration">https://api.highcharts.com/highcharts/loading.showDuration</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.showDuration">https://api.highcharts.com/highstock/loading.showDuration</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.showDuration">https://api.highcharts.com/highmaps/loading.showDuration</a>
   *
   * @implspec showDuration?: number;
   *
   */
  @JSProperty("showDuration")
  double getShowDuration();

  /**
   * (Highcharts, Highstock, Highmaps) The duration in milliseconds of the
   * fade in effect.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.showDuration">https://api.highcharts.com/highcharts/loading.showDuration</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.showDuration">https://api.highcharts.com/highstock/loading.showDuration</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.showDuration">https://api.highcharts.com/highmaps/loading.showDuration</a>
   *
   * @implspec showDuration?: number;
   *
   */
  @JSProperty("showDuration")
  void setShowDuration(double value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the loading screen that
   * covers the plot area.
   *
   * In styled mode, the loading label is styled with the
   * <code>.highcharts-loading</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.style">https://api.highcharts.com/highcharts/loading.style</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.style">https://api.highcharts.com/highstock/loading.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.style">https://api.highcharts.com/highmaps/loading.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the loading screen that
   * covers the plot area.
   *
   * In styled mode, the loading label is styled with the
   * <code>.highcharts-loading</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading.style">https://api.highcharts.com/highcharts/loading.style</a>
   * @see <a href="https://api.highcharts.com/highstock/loading.style">https://api.highcharts.com/highstock/loading.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading.style">https://api.highcharts.com/highmaps/loading.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
