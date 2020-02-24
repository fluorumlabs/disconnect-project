package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Event information regarding completed animation of a series.
 *
 */
public interface SeriesAfterAnimateEventObject extends Any {
  /**
   * Animated series.
   *
   * @implspec target: Series;
   *
   */
  @JSProperty("target")
  Series getTarget();

  /**
   * Animated series.
   *
   * @implspec target: Series;
   *
   */
  @JSProperty("target")
  void setTarget(Series value);

  /**
   * Event type.
   *
   * @implspec type: &quot;afterAnimate&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * Event type.
   *
   * @implspec type: &quot;afterAnimate&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type AFTERANIMATE = JsEnum.of("afterAnimate");
  }
}
