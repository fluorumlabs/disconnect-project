package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Translation and scale for the plot area of a series.
 *
 */
public interface SeriesPlotBoxObject extends Any {
  /**
   * @implspec scaleX: number;
   *
   */
  @JSProperty("scaleX")
  double getScaleX();

  /**
   * @implspec scaleX: number;
   *
   */
  @JSProperty("scaleX")
  void setScaleX(double value);

  /**
   * @implspec scaleY: number;
   *
   */
  @JSProperty("scaleY")
  double getScaleY();

  /**
   * @implspec scaleY: number;
   *
   */
  @JSProperty("scaleY")
  void setScaleY(double value);

  /**
   * @implspec translateX: number;
   *
   */
  @JSProperty("translateX")
  double getTranslateX();

  /**
   * @implspec translateX: number;
   *
   */
  @JSProperty("translateX")
  void setTranslateX(double value);

  /**
   * @implspec translateY: number;
   *
   */
  @JSProperty("translateY")
  double getTranslateY();

  /**
   * @implspec translateY: number;
   *
   */
  @JSProperty("translateY")
  void setTranslateY(double value);
}
