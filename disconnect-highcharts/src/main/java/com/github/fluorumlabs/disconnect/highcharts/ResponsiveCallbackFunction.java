package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * A callback function to gain complete control on when the responsive rule
 * applies.
 *
 * @return Return <code>true</code> if it applies.
 *
 */
@JSFunctor
@FunctionalInterface
public interface ResponsiveCallbackFunction extends Any {
  boolean apply();
}
