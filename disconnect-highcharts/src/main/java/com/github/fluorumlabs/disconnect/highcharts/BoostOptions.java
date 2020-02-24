package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the Boost module. The Boost module allows
 * certain series types to be rendered by WebGL instead of the default SVG. This
 * allows hundreds of thousands of data points to be rendered in milliseconds.
 * In addition to the WebGL rendering it saves time by skipping processing and
 * inspection of the data wherever possible. This introduces some limitations to
 * what features are available in Boost mode. See the docs for details.
 *
 * In addition to the global <code>boost</code> option, each series has a boostThreshold
 * that defines when the boost should kick in.
 *
 * Requires the <code>modules/boost.js</code> module.
 *
 * @see <a href="https://api.highcharts.com/highcharts/boost">https://api.highcharts.com/highcharts/boost</a>
 * @see <a href="https://api.highcharts.com/highstock/boost">https://api.highcharts.com/highstock/boost</a>
 *
 */
public interface BoostOptions extends Any {
  /**
   * (Highcharts, Highstock) If set to true, the whole chart will be boosted
   * if one of the series crosses its threshold, and all the series can be
   * boosted.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.allowForce">https://api.highcharts.com/highcharts/boost.allowForce</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.allowForce">https://api.highcharts.com/highstock/boost.allowForce</a>
   *
   * @implspec allowForce?: boolean;
   *
   */
  @JSProperty("allowForce")
  boolean getAllowForce();

  /**
   * (Highcharts, Highstock) If set to true, the whole chart will be boosted
   * if one of the series crosses its threshold, and all the series can be
   * boosted.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.allowForce">https://api.highcharts.com/highcharts/boost.allowForce</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.allowForce">https://api.highcharts.com/highstock/boost.allowForce</a>
   *
   * @implspec allowForce?: boolean;
   *
   */
  @JSProperty("allowForce")
  void setAllowForce(boolean value);

  /**
   * (Highcharts, Highstock) Debugging options for boost. Useful for
   * benchmarking, and general timing.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug">https://api.highcharts.com/highcharts/boost.debug</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug">https://api.highcharts.com/highstock/boost.debug</a>
   *
   * @implspec debug?: BoostDebugOptions;
   *
   */
  @JSProperty("debug")
  @Nullable
  BoostDebugOptions getDebug();

  /**
   * (Highcharts, Highstock) Debugging options for boost. Useful for
   * benchmarking, and general timing.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug">https://api.highcharts.com/highcharts/boost.debug</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug">https://api.highcharts.com/highstock/boost.debug</a>
   *
   * @implspec debug?: BoostDebugOptions;
   *
   */
  @JSProperty("debug")
  void setDebug(BoostDebugOptions value);

  /**
   * (Highcharts, Highstock) Enable or disable boost on a chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.enabled">https://api.highcharts.com/highcharts/boost.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.enabled">https://api.highcharts.com/highstock/boost.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable boost on a chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.enabled">https://api.highcharts.com/highcharts/boost.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.enabled">https://api.highcharts.com/highstock/boost.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) Set the series threshold for when the boost
   * should kick in globally.
   *
   * Setting to e.g. 20 will cause the whole chart to enter boost mode if
   * there are 20 or more series active. When the chart is in boost mode,
   * every series in it will be rendered to a common canvas. This offers a
   * significant speed improvment in charts with a very high amount of series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.seriesThreshold">https://api.highcharts.com/highcharts/boost.seriesThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.seriesThreshold">https://api.highcharts.com/highstock/boost.seriesThreshold</a>
   *
   * @implspec seriesThreshold?: (number|null);
   *
   */
  @JSProperty("seriesThreshold")
  double getSeriesThreshold();

  /**
   * (Highcharts, Highstock) Set the series threshold for when the boost
   * should kick in globally.
   *
   * Setting to e.g. 20 will cause the whole chart to enter boost mode if
   * there are 20 or more series active. When the chart is in boost mode,
   * every series in it will be rendered to a common canvas. This offers a
   * significant speed improvment in charts with a very high amount of series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.seriesThreshold">https://api.highcharts.com/highcharts/boost.seriesThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.seriesThreshold">https://api.highcharts.com/highstock/boost.seriesThreshold</a>
   *
   * @implspec seriesThreshold?: (number|null);
   *
   */
  @JSProperty("seriesThreshold")
  void setSeriesThreshold(double value);

  /**
   * (Highcharts, Highstock) Enable or disable GPU translations. GPU
   * translations are faster than doing the translation in JavaScript.
   *
   * This option may cause rendering issues with certain datasets. Namely, if
   * your dataset has large numbers with small increments (such as
   * timestamps), it won't work correctly. This is due to floating point
   * precission.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.useGPUTranslations">https://api.highcharts.com/highcharts/boost.useGPUTranslations</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.useGPUTranslations">https://api.highcharts.com/highstock/boost.useGPUTranslations</a>
   *
   * @implspec useGPUTranslations?: boolean;
   *
   */
  @JSProperty("useGPUTranslations")
  boolean getUseGPUTranslations();

  /**
   * (Highcharts, Highstock) Enable or disable GPU translations. GPU
   * translations are faster than doing the translation in JavaScript.
   *
   * This option may cause rendering issues with certain datasets. Namely, if
   * your dataset has large numbers with small increments (such as
   * timestamps), it won't work correctly. This is due to floating point
   * precission.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.useGPUTranslations">https://api.highcharts.com/highcharts/boost.useGPUTranslations</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.useGPUTranslations">https://api.highcharts.com/highstock/boost.useGPUTranslations</a>
   *
   * @implspec useGPUTranslations?: boolean;
   *
   */
  @JSProperty("useGPUTranslations")
  void setUseGPUTranslations(boolean value);
}
