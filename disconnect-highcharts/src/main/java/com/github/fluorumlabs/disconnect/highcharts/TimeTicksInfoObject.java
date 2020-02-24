package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import org.teavm.jso.JSProperty;

/**
 * Additonal time tick information.
 *
 */
public interface TimeTicksInfoObject extends NormalizedIntervalObject {
  /**
   * @implspec higherRanks: Array<string>;
   *
   */
  @JSProperty("higherRanks")
  String[] getHigherRanks();

  /**
   * @implspec higherRanks: Array<string>;
   *
   */
  @JSProperty("higherRanks")
  void setHigherRanks(String[] value);

  /**
   * @implspec totalRange: number;
   *
   */
  @JSProperty("totalRange")
  double getTotalRange();

  /**
   * @implspec totalRange: number;
   *
   */
  @JSProperty("totalRange")
  void setTotalRange(double value);
}
