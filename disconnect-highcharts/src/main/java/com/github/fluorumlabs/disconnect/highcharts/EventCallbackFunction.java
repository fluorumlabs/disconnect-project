package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * The function callback to execute when the event is fired. The <code>this</code> context
 * contains the instance, that fired the event.
 *
 * @param eventArguments
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface EventCallbackFunction extends Any {
  void apply(Dictionary<Any> eventArguments);
}
