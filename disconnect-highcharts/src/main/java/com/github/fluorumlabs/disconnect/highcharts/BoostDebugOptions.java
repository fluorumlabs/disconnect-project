package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Debugging options for boost. Useful for benchmarking,
 * and general timing.
 *
 * @see <a href="https://api.highcharts.com/highcharts/boost.debug">https://api.highcharts.com/highcharts/boost.debug</a>
 * @see <a href="https://api.highcharts.com/highstock/boost.debug">https://api.highcharts.com/highstock/boost.debug</a>
 *
 */
public interface BoostDebugOptions extends Any {
  /**
   * (Highcharts, Highstock) Show the number of points skipped through
   * culling.
   *
   * When set to true, the number of points skipped in series processing is
   * outputted. Points are skipped if they are closer than 1 pixel from each
   * other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.showSkipSummary">https://api.highcharts.com/highcharts/boost.debug.showSkipSummary</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.showSkipSummary">https://api.highcharts.com/highstock/boost.debug.showSkipSummary</a>
   *
   * @implspec showSkipSummary?: boolean;
   *
   */
  @JSProperty("showSkipSummary")
  boolean getShowSkipSummary();

  /**
   * (Highcharts, Highstock) Show the number of points skipped through
   * culling.
   *
   * When set to true, the number of points skipped in series processing is
   * outputted. Points are skipped if they are closer than 1 pixel from each
   * other.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.showSkipSummary">https://api.highcharts.com/highcharts/boost.debug.showSkipSummary</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.showSkipSummary">https://api.highcharts.com/highstock/boost.debug.showSkipSummary</a>
   *
   * @implspec showSkipSummary?: boolean;
   *
   */
  @JSProperty("showSkipSummary")
  void setShowSkipSummary(boolean value);

  /**
   * (Highcharts, Highstock) Time the WebGL to SVG buffer copy
   *
   * After rendering, the result is copied to an image which is injected into
   * the SVG.
   *
   * If this property is set to true, the time it takes for the buffer copy to
   * complete is outputted.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeBufferCopy">https://api.highcharts.com/highcharts/boost.debug.timeBufferCopy</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeBufferCopy">https://api.highcharts.com/highstock/boost.debug.timeBufferCopy</a>
   *
   * @implspec timeBufferCopy?: boolean;
   *
   */
  @JSProperty("timeBufferCopy")
  boolean getTimeBufferCopy();

  /**
   * (Highcharts, Highstock) Time the WebGL to SVG buffer copy
   *
   * After rendering, the result is copied to an image which is injected into
   * the SVG.
   *
   * If this property is set to true, the time it takes for the buffer copy to
   * complete is outputted.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeBufferCopy">https://api.highcharts.com/highcharts/boost.debug.timeBufferCopy</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeBufferCopy">https://api.highcharts.com/highstock/boost.debug.timeBufferCopy</a>
   *
   * @implspec timeBufferCopy?: boolean;
   *
   */
  @JSProperty("timeBufferCopy")
  void setTimeBufferCopy(boolean value);

  /**
   * (Highcharts, Highstock) Time the building of the k-d tree.
   *
   * This outputs the time spent building the k-d tree used for markers etc.
   *
   * Note that the k-d tree is built async, and runs post-rendering.
   * Following, it does not affect the performance of the rendering itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeKDTree">https://api.highcharts.com/highcharts/boost.debug.timeKDTree</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeKDTree">https://api.highcharts.com/highstock/boost.debug.timeKDTree</a>
   *
   * @implspec timeKDTree?: boolean;
   *
   */
  @JSProperty("timeKDTree")
  boolean getTimeKDTree();

  /**
   * (Highcharts, Highstock) Time the building of the k-d tree.
   *
   * This outputs the time spent building the k-d tree used for markers etc.
   *
   * Note that the k-d tree is built async, and runs post-rendering.
   * Following, it does not affect the performance of the rendering itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeKDTree">https://api.highcharts.com/highcharts/boost.debug.timeKDTree</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeKDTree">https://api.highcharts.com/highstock/boost.debug.timeKDTree</a>
   *
   * @implspec timeKDTree?: boolean;
   *
   */
  @JSProperty("timeKDTree")
  void setTimeKDTree(boolean value);

  /**
   * (Highcharts, Highstock) Time the series rendering.
   *
   * This outputs the time spent on actual rendering in the console when set
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeRendering">https://api.highcharts.com/highcharts/boost.debug.timeRendering</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeRendering">https://api.highcharts.com/highstock/boost.debug.timeRendering</a>
   *
   * @implspec timeRendering?: boolean;
   *
   */
  @JSProperty("timeRendering")
  boolean getTimeRendering();

  /**
   * (Highcharts, Highstock) Time the series rendering.
   *
   * This outputs the time spent on actual rendering in the console when set
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeRendering">https://api.highcharts.com/highcharts/boost.debug.timeRendering</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeRendering">https://api.highcharts.com/highstock/boost.debug.timeRendering</a>
   *
   * @implspec timeRendering?: boolean;
   *
   */
  @JSProperty("timeRendering")
  void setTimeRendering(boolean value);

  /**
   * (Highcharts, Highstock) Time the series processing.
   *
   * This outputs the time spent on transforming the series data to vertex
   * buffers when set to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeSeriesProcessing">https://api.highcharts.com/highcharts/boost.debug.timeSeriesProcessing</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeSeriesProcessing">https://api.highcharts.com/highstock/boost.debug.timeSeriesProcessing</a>
   *
   * @implspec timeSeriesProcessing?: boolean;
   *
   */
  @JSProperty("timeSeriesProcessing")
  boolean getTimeSeriesProcessing();

  /**
   * (Highcharts, Highstock) Time the series processing.
   *
   * This outputs the time spent on transforming the series data to vertex
   * buffers when set to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeSeriesProcessing">https://api.highcharts.com/highcharts/boost.debug.timeSeriesProcessing</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeSeriesProcessing">https://api.highcharts.com/highstock/boost.debug.timeSeriesProcessing</a>
   *
   * @implspec timeSeriesProcessing?: boolean;
   *
   */
  @JSProperty("timeSeriesProcessing")
  void setTimeSeriesProcessing(boolean value);

  /**
   * (Highcharts, Highstock) Time the the WebGL setup.
   *
   * This outputs the time spent on setting up the WebGL context, creating
   * shaders, and textures.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeSetup">https://api.highcharts.com/highcharts/boost.debug.timeSetup</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeSetup">https://api.highcharts.com/highstock/boost.debug.timeSetup</a>
   *
   * @implspec timeSetup?: boolean;
   *
   */
  @JSProperty("timeSetup")
  boolean getTimeSetup();

  /**
   * (Highcharts, Highstock) Time the the WebGL setup.
   *
   * This outputs the time spent on setting up the WebGL context, creating
   * shaders, and textures.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost.debug.timeSetup">https://api.highcharts.com/highcharts/boost.debug.timeSetup</a>
   * @see <a href="https://api.highcharts.com/highstock/boost.debug.timeSetup">https://api.highcharts.com/highstock/boost.debug.timeSetup</a>
   *
   * @implspec timeSetup?: boolean;
   *
   */
  @JSProperty("timeSetup")
  void setTimeSetup(boolean value);
}
