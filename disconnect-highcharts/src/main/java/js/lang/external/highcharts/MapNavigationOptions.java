package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface MapNavigationOptions extends Any {
  /**
   * (Highmaps) General options for the map navigation buttons. Individual
   * options can be given from the mapNavigation.buttons option set.
   *
   */
  @JSProperty("buttonOptions")
  @Nullable
  MapNavigationButtonOptions getButtonOptions();

  /**
   * (Highmaps) General options for the map navigation buttons. Individual
   * options can be given from the mapNavigation.buttons option set.
   *
   */
  @JSProperty("buttonOptions")
  void setButtonOptions(@Nullable MapNavigationButtonOptions value);

  /**
   * (Highmaps) The individual buttons for the map navigation. This usually
   * includes the zoom in and zoom out buttons. Properties for each button is
   * inherited from mapNavigation.buttonOptions, while individual options can
   * be overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are
   * individual.
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
   */
  @JSProperty("buttons")
  void setButtons(@Nullable MapNavigationButtonsOptions value);

  /**
   * (Highmaps) Whether to enable navigation buttons. By default it inherits
   * the enabled setting.
   *
   */
  @JSProperty("enableButtons")
  boolean getEnableButtons();

  /**
   * (Highmaps) Whether to enable navigation buttons. By default it inherits
   * the enabled setting.
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
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highmaps) Enables zooming in on an area on double clicking in the map.
   * By default it inherits the enabled setting.
   *
   */
  @JSProperty("enableDoubleClickZoom")
  boolean getEnableDoubleClickZoom();

  /**
   * (Highmaps) Enables zooming in on an area on double clicking in the map.
   * By default it inherits the enabled setting.
   *
   */
  @JSProperty("enableDoubleClickZoom")
  void setEnableDoubleClickZoom(boolean value);

  /**
   * (Highmaps) Whether to zoom in on an area when that area is double
   * clicked.
   *
   */
  @JSProperty("enableDoubleClickZoomTo")
  boolean getEnableDoubleClickZoomTo();

  /**
   * (Highmaps) Whether to zoom in on an area when that area is double
   * clicked.
   *
   */
  @JSProperty("enableDoubleClickZoomTo")
  void setEnableDoubleClickZoomTo(boolean value);

  /**
   * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
   * enabled setting.
   *
   */
  @JSProperty("enableMouseWheelZoom")
  boolean getEnableMouseWheelZoom();

  /**
   * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
   * enabled setting.
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
   */
  @JSProperty("enableTouchZoom")
  boolean getEnableTouchZoom();

  /**
   * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
   * covers the viewport, this prevents the user from using multitouch and
   * touchdrag on the web page, so you should make sure the user is not
   * trapped inside the chart. By default it inherits the enabled setting.
   *
   */
  @JSProperty("enableTouchZoom")
  void setEnableTouchZoom(boolean value);

  /**
   * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
   * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
   *
   */
  @JSProperty("mouseWheelSensitivity")
  double getMouseWheelSensitivity();

  /**
   * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
   * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
   *
   */
  @JSProperty("mouseWheelSensitivity")
  void setMouseWheelSensitivity(double value);

  class Builder {
    private final MapNavigationOptions object = Any.empty();

    public MapNavigationOptions build() {
      return object;
    }

    /**
     * (Highmaps) General options for the map navigation buttons. Individual
     * options can be given from the mapNavigation.buttons option set.
     *
     */
    public Builder buttonOptions(@Nullable MapNavigationButtonOptions value) {
      object.setButtonOptions(value);
      return this;
    }

    /**
     * (Highmaps) The individual buttons for the map navigation. This usually
     * includes the zoom in and zoom out buttons. Properties for each button is
     * inherited from mapNavigation.buttonOptions, while individual options can
     * be overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are
     * individual.
     *
     */
    public Builder buttons(@Nullable MapNavigationButtonsOptions value) {
      object.setButtons(value);
      return this;
    }

    /**
     * (Highmaps) Whether to enable navigation buttons. By default it inherits
     * the enabled setting.
     *
     */
    public Builder enableButtons(boolean value) {
      object.setEnableButtons(value);
      return this;
    }

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
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highmaps) Enables zooming in on an area on double clicking in the map.
     * By default it inherits the enabled setting.
     *
     */
    public Builder enableDoubleClickZoom(boolean value) {
      object.setEnableDoubleClickZoom(value);
      return this;
    }

    /**
     * (Highmaps) Whether to zoom in on an area when that area is double
     * clicked.
     *
     */
    public Builder enableDoubleClickZoomTo(boolean value) {
      object.setEnableDoubleClickZoomTo(value);
      return this;
    }

    /**
     * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
     * enabled setting.
     *
     */
    public Builder enableMouseWheelZoom(boolean value) {
      object.setEnableMouseWheelZoom(value);
      return this;
    }

    /**
     * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
     * covers the viewport, this prevents the user from using multitouch and
     * touchdrag on the web page, so you should make sure the user is not
     * trapped inside the chart. By default it inherits the enabled setting.
     *
     */
    public Builder enableTouchZoom(boolean value) {
      object.setEnableTouchZoom(value);
      return this;
    }

    /**
     * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
     * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
     *
     */
    public Builder mouseWheelSensitivity(double value) {
      object.setMouseWheelSensitivity(value);
      return this;
    }
  }
}
