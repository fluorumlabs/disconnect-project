package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * The event arguments when all the series have been drilled up.
 *
 */
public interface DrillupAllEventObject extends Any {
  /**
   * Prevents the default behaviour of the event.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  PreventDefault getPreventDefault();

  /**
   * Prevents the default behaviour of the event.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(PreventDefault value);

  /**
   * The event target.
   *
   * @implspec target: Chart;
   *
   */
  @JSProperty("target")
  Chart getTarget();

  /**
   * The event target.
   *
   * @implspec target: Chart;
   *
   */
  @JSProperty("target")
  void setTarget(Chart value);

  /**
   * The event type.
   *
   * @implspec type: &quot;drillupall&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * The event type.
   *
   * @implspec type: &quot;drillupall&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PreventDefault extends Any {
    void apply();
  }

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type DRILLUPALL = JsEnum.of("drillupall");
  }
}
