package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSIndexer;

/**
 * An extendable collection of functions for defining symbol paths.
 *
 */
public interface SymbolDictionary extends Any {
  /**
   * @implspec [key in SymbolKey]: (() =&gt; void|undefined);
   *
   */
  @JSIndexer
  Value get(SymbolKey key);

  /**
   * @implspec [key in SymbolKey]: (() =&gt; void|undefined);
   *
   */
  @JSIndexer
  void set(SymbolKey key, Value value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Value extends Any {
    void apply();
  }
}
