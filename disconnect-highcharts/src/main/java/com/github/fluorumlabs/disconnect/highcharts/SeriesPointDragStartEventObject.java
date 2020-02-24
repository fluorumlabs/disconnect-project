package com.github.fluorumlabs.disconnect.highcharts;

import com.github.fluorumlabs.disconnect.types.DoubleRecord;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Contains common information for a drag event on series point.
 *
 */
public interface SeriesPointDragStartEventObject extends Any {
  /**
   * Data property being dragged.
   *
   * @implspec updateProp: Dictionary<number>;
   *
   */
  @JSProperty("updateProp")
  DoubleRecord getUpdateProp();

  /**
   * Data property being dragged.
   *
   * @implspec updateProp: Dictionary<number>;
   *
   */
  @JSProperty("updateProp")
  void setUpdateProp(DoubleRecord value);
}
