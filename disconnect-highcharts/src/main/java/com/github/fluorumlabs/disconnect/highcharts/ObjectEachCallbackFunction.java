package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * The iterator callback.
 *
 * @param value
 * The property value.
 *
 * @param key
 * The property key.
 *
 * @param obj
 * The object that objectEach is being applied to.
 *
 */
@JSFunctor
@FunctionalInterface
public interface ObjectEachCallbackFunction extends Any {
  void apply(Any value, String key, Any obj);
}
