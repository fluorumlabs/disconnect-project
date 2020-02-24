package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) The individual buttons for the map navigation. This usually
 * includes the zoom in and zoom out buttons. Properties for each button is
 * inherited from mapNavigation.buttonOptions, while individual options can be
 * overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are
 * individual.
 *
 * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons">https://api.highcharts.com/highmaps/mapNavigation.buttons</a>
 *
 */
public interface MapNavigationButtonsOptions extends Any {
  /**
   * (Highmaps) Options for the zoom in button. Properties for the zoom in and
   * zoom out buttons are inherited from mapNavigation.buttonOptions, while
   * individual options can be overridden. By default, the <code>onclick</code>, <code>text</code>
   * and <code>y</code> options are individual.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn</a>
   *
   * @implspec zoomIn?: MapNavigationButtonsZoomInOptions;
   *
   */
  @JSProperty("zoomIn")
  @Nullable
  MapNavigationButtonsZoomInOptions getZoomIn();

  /**
   * (Highmaps) Options for the zoom in button. Properties for the zoom in and
   * zoom out buttons are inherited from mapNavigation.buttonOptions, while
   * individual options can be overridden. By default, the <code>onclick</code>, <code>text</code>
   * and <code>y</code> options are individual.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomIn</a>
   *
   * @implspec zoomIn?: MapNavigationButtonsZoomInOptions;
   *
   */
  @JSProperty("zoomIn")
  void setZoomIn(MapNavigationButtonsZoomInOptions value);

  /**
   * (Highmaps) Options for the zoom out button. Properties for the zoom in
   * and zoom out buttons are inherited from mapNavigation.buttonOptions,
   * while individual options can be overridden. By default, the <code>onclick</code>,
   * <code>text</code> and <code>y</code> options are individual.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomOut">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomOut</a>
   *
   * @implspec zoomOut?: MapNavigationButtonsZoomOutOptions;
   *
   */
  @JSProperty("zoomOut")
  @Nullable
  MapNavigationButtonsZoomOutOptions getZoomOut();

  /**
   * (Highmaps) Options for the zoom out button. Properties for the zoom in
   * and zoom out buttons are inherited from mapNavigation.buttonOptions,
   * while individual options can be overridden. By default, the <code>onclick</code>,
   * <code>text</code> and <code>y</code> options are individual.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomOut">https://api.highcharts.com/highmaps/mapNavigation.buttons.zoomOut</a>
   *
   * @implspec zoomOut?: MapNavigationButtonsZoomOutOptions;
   *
   */
  @JSProperty("zoomOut")
  void setZoomOut(MapNavigationButtonsZoomOutOptions value);
}
