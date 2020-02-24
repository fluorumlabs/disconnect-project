package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The returned object literal from the Highcharts.Axis#getExtremes function.
 *
 */
public interface ExtremesObject extends Any {
  /**
   * The maximum value of the axis' associated series.
   *
   * @implspec dataMax: number;
   *
   */
  @JSProperty("dataMax")
  double getDataMax();

  /**
   * The maximum value of the axis' associated series.
   *
   * @implspec dataMax: number;
   *
   */
  @JSProperty("dataMax")
  void setDataMax(double value);

  /**
   * The minimum value of the axis' associated series.
   *
   * @implspec dataMin: number;
   *
   */
  @JSProperty("dataMin")
  double getDataMin();

  /**
   * The minimum value of the axis' associated series.
   *
   * @implspec dataMin: number;
   *
   */
  @JSProperty("dataMin")
  void setDataMin(double value);

  /**
   * The maximum axis value, either automatic or set manually. If the <code>max</code>
   * option is not set, <code>maxPadding</code> is 0 and <code>endOnTick</code> is false, this value
   * will be the same as <code>dataMax</code>.
   *
   * @implspec max: number;
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * The maximum axis value, either automatic or set manually. If the <code>max</code>
   * option is not set, <code>maxPadding</code> is 0 and <code>endOnTick</code> is false, this value
   * will be the same as <code>dataMax</code>.
   *
   * @implspec max: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * The minimum axis value, either automatic or set manually. If the <code>min</code>
   * option is not set, <code>minPadding</code> is 0 and <code>startOnTick</code> is false, this
   * value will be the same as <code>dataMin</code>.
   *
   * @implspec min: number;
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * The minimum axis value, either automatic or set manually. If the <code>min</code>
   * option is not set, <code>minPadding</code> is 0 and <code>startOnTick</code> is false, this
   * value will be the same as <code>dataMin</code>.
   *
   * @implspec min: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * The user defined maximum, either from the <code>max</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   * @implspec userMax: number;
   *
   */
  @JSProperty("userMax")
  double getUserMax();

  /**
   * The user defined maximum, either from the <code>max</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   * @implspec userMax: number;
   *
   */
  @JSProperty("userMax")
  void setUserMax(double value);

  /**
   * The user defined minimum, either from the <code>min</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   * @implspec userMin: number;
   *
   */
  @JSProperty("userMin")
  double getUserMin();

  /**
   * The user defined minimum, either from the <code>min</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   * @implspec userMin: number;
   *
   */
  @JSProperty("userMin")
  void setUserMin(double value);
}
