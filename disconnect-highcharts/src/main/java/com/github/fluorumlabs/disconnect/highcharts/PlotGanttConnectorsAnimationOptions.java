package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotGanttConnectorsAnimationOptions extends Any {
  /**
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);
}
