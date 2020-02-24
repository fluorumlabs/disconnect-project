package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function to call if the offline-exporting module fails to export a chart on
 * the client side.
 *
 * @param options
 * The exporting options.
 *
 * @param err
 * The error from the module.
 *
 */
@JSFunctor
@FunctionalInterface
public interface ExportingErrorCallbackFunction extends Any {
  void apply(ExportingOptions options, Error err);
}
