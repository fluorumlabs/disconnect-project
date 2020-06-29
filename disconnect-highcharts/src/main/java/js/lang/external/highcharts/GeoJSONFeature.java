package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Data set of a geographic feature.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface GeoJSONFeature extends Dictionary<Any> {
  /**
   * Data type of the geographic feature.
   *
   */
  @JSProperty("type")
  String getType();

  /**
   * Data type of the geographic feature.
   *
   */
  @JSProperty("type")
  void setType(String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final GeoJSONFeature object = Any.empty();

    private Builder() {
    }

    public GeoJSONFeature build() {
      return object;
    }

    /**
     * Data type of the geographic feature.
     *
     */
    public Builder type(String value) {
      object.setType(value);
      return this;
    }
  }
}
