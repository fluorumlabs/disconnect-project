package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface RangeSelectorButtonsEventsOptions extends Any {
  /**
   * (Highstock) Fires when clicking on the rangeSelector button. One
   * parameter, event, is passed to the function, containing common event
   * information.
   *
   * (see online documentation for example)
   *
   * Return false to stop default button's click action.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.events.click">https://api.highcharts.com/highstock/rangeSelector.buttons.events.click</a>
   *
   * @implspec click?: RangeSelectorClickCallbackFunction;
   *
   */
  @JSProperty("click")
  @Nullable
  RangeSelectorClickCallbackFunction getClick();

  /**
   * (Highstock) Fires when clicking on the rangeSelector button. One
   * parameter, event, is passed to the function, containing common event
   * information.
   *
   * (see online documentation for example)
   *
   * Return false to stop default button's click action.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector.buttons.events.click">https://api.highcharts.com/highstock/rangeSelector.buttons.events.click</a>
   *
   * @implspec click?: RangeSelectorClickCallbackFunction;
   *
   */
  @JSProperty("click")
  void setClick(RangeSelectorClickCallbackFunction value);
}
