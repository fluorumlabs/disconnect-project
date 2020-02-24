package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for the export related buttons,
 * print and export. In addition to the default buttons listed here, custom
 * buttons can be added. See navigation.buttonOptions for general options.
 *
 * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons">https://api.highcharts.com/highcharts/exporting.buttons</a>
 * @see <a href="https://api.highcharts.com/highstock/exporting.buttons">https://api.highcharts.com/highstock/exporting.buttons</a>
 * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons">https://api.highcharts.com/highmaps/exporting.buttons</a>
 *
 */
public interface ExportingButtonsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Options for the export button.
   *
   * In styled mode, export button styles can be applied with the
   * <code>.highcharts-contextbutton</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton">https://api.highcharts.com/highcharts/exporting.buttons.contextButton</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton">https://api.highcharts.com/highstock/exporting.buttons.contextButton</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton">https://api.highcharts.com/highmaps/exporting.buttons.contextButton</a>
   *
   * @implspec contextButton?: ExportingButtonsContextButtonOptions;
   *
   */
  @JSProperty("contextButton")
  @Nullable
  ExportingButtonsContextButtonOptions getContextButton();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the export button.
   *
   * In styled mode, export button styles can be applied with the
   * <code>.highcharts-contextbutton</code> class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons.contextButton">https://api.highcharts.com/highcharts/exporting.buttons.contextButton</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons.contextButton">https://api.highcharts.com/highstock/exporting.buttons.contextButton</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons.contextButton">https://api.highcharts.com/highmaps/exporting.buttons.contextButton</a>
   *
   * @implspec contextButton?: ExportingButtonsContextButtonOptions;
   *
   */
  @JSProperty("contextButton")
  void setContextButton(ExportingButtonsContextButtonOptions value);
}
