package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.highcharts.Point;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/map.src.js"
)
public interface MapPoint extends Point {
  @JSProperty("pointPadding")
  double getPointPadding();

  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
   * properies are copied over here.
   *
   */
  @JSProperty("properties")
  Any getProperties();

  /**
   * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
   * properies are copied over here.
   *
   */
  @JSProperty("properties")
  void setProperties(Any value);

  @JSProperty("value")
  double getValue();

  @JSProperty("value")
  void setValue(double value);

  /**
   * Highmaps only. Zoom in on the point using the global animation.
   *
   */
  void zoomTo();
}
