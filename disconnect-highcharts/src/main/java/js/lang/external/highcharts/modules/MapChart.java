package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.highcharts.Chart;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/map.src.js"
)
public interface MapChart extends Chart {
  /**
   * Highmaps only. Get chart coordinates from latitude/longitude. Returns
   * an object with x and y values corresponding to the <code>xAxis</code> and
   * <code>yAxis</code>.
   *
   * @param latLon
   * Coordinates.
   *
   * @return X and Y coordinates in terms of chart axis values.
   *
   */
  MapCoordinateObject fromLatLonToPoint(MapLatLonObject latLon);

  /**
   * Highmaps only. Calculate latitude/longitude values for a point.
   * Returns an object with the numeric properties <code>lat</code> and <code>lon</code>.
   *
   * @param point
   * A <code>Point</code> instance or anything containing <code>x</code> and <code>y</code>
   * properties with numeric values.
   *
   * @return An object with <code>lat</code> and <code>lon</code> properties.
   *
   */
  @Nullable
  MapLatLonObject fromPointToLatLon(MapPoint point);

  /**
   * Highmaps only. Calculate latitude/longitude values for a point.
   * Returns an object with the numeric properties <code>lat</code> and <code>lon</code>.
   *
   * @param point
   * A <code>Point</code> instance or anything containing <code>x</code> and <code>y</code>
   * properties with numeric values.
   *
   * @return An object with <code>lat</code> and <code>lon</code> properties.
   *
   */
  @Nullable
  MapLatLonObject fromPointToLatLon(MapCoordinateObject point);

  /**
   * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
   * Chart#fromLatLonToPoint for how to get the <code>centerX</code> and <code>centerY</code>
   * parameters for a geographic location.
   *
   * @param howMuch
   * How much to zoom the map. Values less than 1 zooms in. 0.5
   * zooms in to half the current view. 2 zooms to twice the
   * current view. If omitted, the zoom is reset.
   *
   * @param centerX
   * The X axis position to center around if available space.
   *
   * @param centerY
   * The Y axis position to center around if available space.
   *
   * @param mouseX
   * Fix the zoom to this position if possible. This is used for
   * example in mousewheel events, where the area under the mouse
   * should be fixed as we zoom in.
   *
   * @param mouseY
   * Fix the zoom to this position if possible.
   *
   */
  void mapZoom(double howMuch, double centerX, double centerY, double mouseX, double mouseY);

  /**
   * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
   * Chart#fromLatLonToPoint for how to get the <code>centerX</code> and <code>centerY</code>
   * parameters for a geographic location.
   *
   * @param howMuch
   * How much to zoom the map. Values less than 1 zooms in. 0.5
   * zooms in to half the current view. 2 zooms to twice the
   * current view. If omitted, the zoom is reset.
   *
   * @param centerX
   * The X axis position to center around if available space.
   *
   * @param centerY
   * The Y axis position to center around if available space.
   *
   * @param mouseX
   * Fix the zoom to this position if possible. This is used for
   * example in mousewheel events, where the area under the mouse
   * should be fixed as we zoom in.
   *
   */
  void mapZoom(double howMuch, double centerX, double centerY, double mouseX);

  /**
   * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
   * Chart#fromLatLonToPoint for how to get the <code>centerX</code> and <code>centerY</code>
   * parameters for a geographic location.
   *
   * @param howMuch
   * How much to zoom the map. Values less than 1 zooms in. 0.5
   * zooms in to half the current view. 2 zooms to twice the
   * current view. If omitted, the zoom is reset.
   *
   * @param centerX
   * The X axis position to center around if available space.
   *
   * @param centerY
   * The Y axis position to center around if available space.
   *
   */
  void mapZoom(double howMuch, double centerX, double centerY);

  /**
   * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
   * Chart#fromLatLonToPoint for how to get the <code>centerX</code> and <code>centerY</code>
   * parameters for a geographic location.
   *
   * @param howMuch
   * How much to zoom the map. Values less than 1 zooms in. 0.5
   * zooms in to half the current view. 2 zooms to twice the
   * current view. If omitted, the zoom is reset.
   *
   * @param centerX
   * The X axis position to center around if available space.
   *
   */
  void mapZoom(double howMuch, double centerX);

  /**
   * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
   * Chart#fromLatLonToPoint for how to get the <code>centerX</code> and <code>centerY</code>
   * parameters for a geographic location.
   *
   * @param howMuch
   * How much to zoom the map. Values less than 1 zooms in. 0.5
   * zooms in to half the current view. 2 zooms to twice the
   * current view. If omitted, the zoom is reset.
   *
   */
  void mapZoom(double howMuch);

  /**
   * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
   * Chart#fromLatLonToPoint for how to get the <code>centerX</code> and <code>centerY</code>
   * parameters for a geographic location.
   *
   */
  void mapZoom();

  /**
   * Highmaps only. Get point from latitude and longitude using specified
   * transform definition.
   *
   * @param latLon
   * A latitude/longitude object.
   *
   * @param transform
   * The transform definition to use as explained in the
   * documentation.
   *
   * @return An object with <code>x</code> and <code>y</code> properties.
   *
   */
  MapCoordinateObject transformFromLatLon(MapLatLonObject latLon, Any transform);

  /**
   * Highmaps only. Get latLon from point using specified transform
   * definition. The method returns an object with the numeric properties
   * <code>lat</code> and <code>lon</code>.
   *
   * @param point
   * A <code>Point</code> instance, or any object containing the properties
   * <code>x</code> and <code>y</code> with numeric values.
   *
   * @param transform
   * The transform definition to use as explained in the
   * documentation.
   *
   * @return An object with <code>lat</code> and <code>lon</code> properties.
   *
   */
  @Nullable
  MapLatLonObject transformToLatLon(MapPoint point, Any transform);

  /**
   * Highmaps only. Get latLon from point using specified transform
   * definition. The method returns an object with the numeric properties
   * <code>lat</code> and <code>lon</code>.
   *
   * @param point
   * A <code>Point</code> instance, or any object containing the properties
   * <code>x</code> and <code>y</code> with numeric values.
   *
   * @param transform
   * The transform definition to use as explained in the
   * documentation.
   *
   * @return An object with <code>lat</code> and <code>lon</code> properties.
   *
   */
  @Nullable
  MapLatLonObject transformToLatLon(MapCoordinateObject point, Any transform);
}
