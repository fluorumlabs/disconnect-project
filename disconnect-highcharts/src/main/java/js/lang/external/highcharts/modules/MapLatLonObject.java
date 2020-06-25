package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * A latitude/longitude object.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/map.src.js"
)
public interface MapLatLonObject extends Any {
  /**
   * The latitude.
   *
   */
  @JSProperty("lat")
  double getLat();

  /**
   * The latitude.
   *
   */
  @JSProperty("lat")
  void setLat(double value);

  /**
   * The longitude.
   *
   */
  @JSProperty("lon")
  double getLon();

  /**
   * The longitude.
   *
   */
  @JSProperty("lon")
  void setLon(double value);

  class Builder {
    private final MapLatLonObject object = Any.empty();

    public MapLatLonObject build() {
      return object;
    }

    /**
     * The latitude.
     *
     */
    public Builder lat(double value) {
      object.setLat(value);
      return this;
    }

    /**
     * The longitude.
     *
     */
    public Builder lon(double value) {
      object.setLon(value);
      return this;
    }
  }
}
