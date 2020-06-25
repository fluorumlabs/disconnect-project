package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
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
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface MapNavigationButtonsOptions extends Any {
  /**
   * (Highmaps) Options for the zoom in button. Properties for the zoom in and
   * zoom out buttons are inherited from mapNavigation.buttonOptions, while
   * individual options can be overridden. By default, the <code>onclick</code>, <code>text</code>
   * and <code>y</code> options are individual.
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
   */
  @JSProperty("zoomIn")
  void setZoomIn(@Nullable MapNavigationButtonsZoomInOptions value);

  /**
   * (Highmaps) Options for the zoom out button. Properties for the zoom in
   * and zoom out buttons are inherited from mapNavigation.buttonOptions,
   * while individual options can be overridden. By default, the <code>onclick</code>,
   * <code>text</code> and <code>y</code> options are individual.
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
   */
  @JSProperty("zoomOut")
  void setZoomOut(@Nullable MapNavigationButtonsZoomOutOptions value);

  class Builder {
    private final MapNavigationButtonsOptions object = Any.empty();

    public MapNavigationButtonsOptions build() {
      return object;
    }

    /**
     * (Highmaps) Options for the zoom in button. Properties for the zoom in and
     * zoom out buttons are inherited from mapNavigation.buttonOptions, while
     * individual options can be overridden. By default, the <code>onclick</code>, <code>text</code>
     * and <code>y</code> options are individual.
     *
     */
    public Builder zoomIn(@Nullable MapNavigationButtonsZoomInOptions value) {
      object.setZoomIn(value);
      return this;
    }

    /**
     * (Highmaps) Options for the zoom out button. Properties for the zoom in
     * and zoom out buttons are inherited from mapNavigation.buttonOptions,
     * while individual options can be overridden. By default, the <code>onclick</code>,
     * <code>text</code> and <code>y</code> options are individual.
     *
     */
    public Builder zoomOut(@Nullable MapNavigationButtonsZoomOutOptions value) {
      object.setZoomOut(value);
      return this;
    }
  }
}
