package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSIndexer;

/**
 * Generic dictionary in TypeScript notation.
 *
 */
public interface Dictionary<T extends Any> extends Any {
  /**
   * @implspec [key: string]: T;
   *
   */
  @JSIndexer
  T get(String key);

  /**
   * @implspec [key: string]: T;
   *
   */
  @JSIndexer
  void set(String key, T value);
}
