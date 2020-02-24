package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface MapNavigationOptions extends Any {
  /**
   * (Highmaps) General options for the map navigation buttons. Individual
   * options can be given from the mapNavigation.buttons option set.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttonOptions">https://api.highcharts.com/highmaps/mapNavigation.buttonOptions</a>
   *
   * @implspec buttonOptions?: MapNavigationButtonOptions;
   *
   */
  @JSProperty("buttonOptions")
  @Nullable
  MapNavigationButtonOptions getButtonOptions();

  /**
   * (Highmaps) General options for the map navigation buttons. Individual
   * options can be given from the mapNavigation.buttons option set.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttonOptions">https://api.highcharts.com/highmaps/mapNavigation.buttonOptions</a>
   *
   * @implspec buttonOptions?: MapNavigationButtonOptions;
   *
   */
  @JSProperty("buttonOptions")
  void setButtonOptions(MapNavigationButtonOptions value);

  /**
   * (Highmaps) The individual buttons for the map navigation. This usually
   * includes the zoom in and zoom out buttons. Properties for each button is
   * inherited from mapNavigation.buttonOptions, while individual options can
   * be overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are
   * individual.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons">https://api.highcharts.com/highmaps/mapNavigation.buttons</a>
   *
   * @implspec buttons?: MapNavigationButtonsOptions;
   *
   */
  @JSProperty("buttons")
  @Nullable
  MapNavigationButtonsOptions getButtons();

  /**
   * (Highmaps) The individual buttons for the map navigation. This usually
   * includes the zoom in and zoom out buttons. Properties for each button is
   * inherited from mapNavigation.buttonOptions, while individual options can
   * be overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are
   * individual.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.buttons">https://api.highcharts.com/highmaps/mapNavigation.buttons</a>
   *
   * @implspec buttons?: MapNavigationButtonsOptions;
   *
   */
  @JSProperty("buttons")
  void setButtons(MapNavigationButtonsOptions value);

  /**
   * (Highmaps) Whether to enable navigation buttons. By default it inherits
   * the enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableButtons">https://api.highcharts.com/highmaps/mapNavigation.enableButtons</a>
   *
   * @implspec enableButtons?: boolean;
   *
   */
  @JSProperty("enableButtons")
  boolean getEnableButtons();

  /**
   * (Highmaps) Whether to enable navigation buttons. By default it inherits
   * the enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableButtons">https://api.highcharts.com/highmaps/mapNavigation.enableButtons</a>
   *
   * @implspec enableButtons?: boolean;
   *
   */
  @JSProperty("enableButtons")
  void setEnableButtons(boolean value);

  /**
   * (Highmaps) Whether to enable map navigation. The default is not to enable
   * navigation, as many choropleth maps are simple and don't need it.
   * Additionally, when touch zoom and mousewheel zoom is enabled, it breaks
   * the default behaviour of these interactions in the website, and the
   * implementer should be aware of this.
   *
   * Individual interactions can be enabled separately, namely buttons,
   * multitouch zoom, double click zoom, double click zoom to element and
   * mousewheel zoom.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enabled">https://api.highcharts.com/highmaps/mapNavigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highmaps) Whether to enable map navigation. The default is not to enable
   * navigation, as many choropleth maps are simple and don't need it.
   * Additionally, when touch zoom and mousewheel zoom is enabled, it breaks
   * the default behaviour of these interactions in the website, and the
   * implementer should be aware of this.
   *
   * Individual interactions can be enabled separately, namely buttons,
   * multitouch zoom, double click zoom, double click zoom to element and
   * mousewheel zoom.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enabled">https://api.highcharts.com/highmaps/mapNavigation.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highmaps) Enables zooming in on an area on double clicking in the map.
   * By default it inherits the enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoom">https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoom</a>
   *
   * @implspec enableDoubleClickZoom?: boolean;
   *
   */
  @JSProperty("enableDoubleClickZoom")
  boolean getEnableDoubleClickZoom();

  /**
   * (Highmaps) Enables zooming in on an area on double clicking in the map.
   * By default it inherits the enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoom">https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoom</a>
   *
   * @implspec enableDoubleClickZoom?: boolean;
   *
   */
  @JSProperty("enableDoubleClickZoom")
  void setEnableDoubleClickZoom(boolean value);

  /**
   * (Highmaps) Whether to zoom in on an area when that area is double
   * clicked.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoomTo">https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoomTo</a>
   *
   * @implspec enableDoubleClickZoomTo?: boolean;
   *
   */
  @JSProperty("enableDoubleClickZoomTo")
  boolean getEnableDoubleClickZoomTo();

  /**
   * (Highmaps) Whether to zoom in on an area when that area is double
   * clicked.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoomTo">https://api.highcharts.com/highmaps/mapNavigation.enableDoubleClickZoomTo</a>
   *
   * @implspec enableDoubleClickZoomTo?: boolean;
   *
   */
  @JSProperty("enableDoubleClickZoomTo")
  void setEnableDoubleClickZoomTo(boolean value);

  /**
   * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
   * enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableMouseWheelZoom">https://api.highcharts.com/highmaps/mapNavigation.enableMouseWheelZoom</a>
   *
   * @implspec enableMouseWheelZoom?: boolean;
   *
   */
  @JSProperty("enableMouseWheelZoom")
  boolean getEnableMouseWheelZoom();

  /**
   * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
   * enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableMouseWheelZoom">https://api.highcharts.com/highmaps/mapNavigation.enableMouseWheelZoom</a>
   *
   * @implspec enableMouseWheelZoom?: boolean;
   *
   */
  @JSProperty("enableMouseWheelZoom")
  void setEnableMouseWheelZoom(boolean value);

  /**
   * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
   * covers the viewport, this prevents the user from using multitouch and
   * touchdrag on the web page, so you should make sure the user is not
   * trapped inside the chart. By default it inherits the enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableTouchZoom">https://api.highcharts.com/highmaps/mapNavigation.enableTouchZoom</a>
   *
   * @implspec enableTouchZoom?: boolean;
   *
   */
  @JSProperty("enableTouchZoom")
  boolean getEnableTouchZoom();

  /**
   * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
   * covers the viewport, this prevents the user from using multitouch and
   * touchdrag on the web page, so you should make sure the user is not
   * trapped inside the chart. By default it inherits the enabled setting.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.enableTouchZoom">https://api.highcharts.com/highmaps/mapNavigation.enableTouchZoom</a>
   *
   * @implspec enableTouchZoom?: boolean;
   *
   */
  @JSProperty("enableTouchZoom")
  void setEnableTouchZoom(boolean value);

  /**
   * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
   * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.mouseWheelSensitivity">https://api.highcharts.com/highmaps/mapNavigation.mouseWheelSensitivity</a>
   *
   * @implspec mouseWheelSensitivity?: number;
   *
   */
  @JSProperty("mouseWheelSensitivity")
  double getMouseWheelSensitivity();

  /**
   * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
   * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
   *
   * @see <a href="https://api.highcharts.com/highmaps/mapNavigation.mouseWheelSensitivity">https://api.highcharts.com/highmaps/mapNavigation.mouseWheelSensitivity</a>
   *
   * @implspec mouseWheelSensitivity?: number;
   *
   */
  @JSProperty("mouseWheelSensitivity")
  void setMouseWheelSensitivity(double value);
}
