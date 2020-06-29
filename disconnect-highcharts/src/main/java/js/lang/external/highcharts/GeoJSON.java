package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Represents the loose structure of a geographic JSON file.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface GeoJSON extends Any {
  /**
   * Full copyright note of the geographic data.
   *
   */
  @JSProperty("copyright")
  @Nullable
  String getCopyright();

  /**
   * Full copyright note of the geographic data.
   *
   */
  @JSProperty("copyright")
  void setCopyright(@Nullable String value);

  /**
   * Short copyright note of the geographic data suitable for watermarks.
   *
   */
  @JSProperty("copyrightShort")
  @Nullable
  String getCopyrightShort();

  /**
   * Short copyright note of the geographic data suitable for watermarks.
   *
   */
  @JSProperty("copyrightShort")
  void setCopyrightShort(@Nullable String value);

  /**
   * Additional meta information based on the coordinate reference system.
   *
   */
  @JSProperty("crs")
  @Nullable
  Dictionary<Any> getCrs();

  /**
   * Additional meta information based on the coordinate reference system.
   *
   */
  @JSProperty("crs")
  void setCrs(@Nullable Dictionary<Any> value);

  /**
   * Data sets of geographic features.
   *
   */
  @JSProperty("features")
  GeoJSONFeature[] getFeatures();

  /**
   * Data sets of geographic features.
   *
   */
  @JSProperty("features")
  void setFeatures(GeoJSONFeature... value);

  /**
   * Map projections and transformations to be used when calculating between
   * lat/lon and chart values. Required for lat/lon support on maps. Allows
   * resizing, rotating, and moving portions of a map within its projected
   * coordinate system while still retaining lat/lon support. If using lat/lon
   * on a portion of the map that does not match a <code>hitZone</code>, the definition
   * with the key <code>default</code> is used.
   *
   */
  @JSBody(
      script = "return this['hc-transform']"
  )
  @Nullable
  Dictionary<GeoJSONTranslation> getHcTransform();

  /**
   * Map projections and transformations to be used when calculating between
   * lat/lon and chart values. Required for lat/lon support on maps. Allows
   * resizing, rotating, and moving portions of a map within its projected
   * coordinate system while still retaining lat/lon support. If using lat/lon
   * on a portion of the map that does not match a <code>hitZone</code>, the definition
   * with the key <code>default</code> is used.
   *
   */
  @JSBody(
      params = "value",
      script = "this['hc-transform'] = value"
  )
  void setHcTransform(@Nullable Dictionary<GeoJSONTranslation> value);

  /**
   * Title of the geographic data.
   *
   */
  @JSProperty("title")
  @Nullable
  String getTitle();

  /**
   * Title of the geographic data.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable String value);

  /**
   * Type of the geographic data. Type of an optimized map collection is
   * <code>FeatureCollection</code>.
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * Type of the geographic data. Type of an optimized map collection is
   * <code>FeatureCollection</code>.
   *
   */
  @JSProperty("type")
  void setType(@Nullable String value);

  /**
   * Version of the geographic data.
   *
   */
  @JSProperty("version")
  @Nullable
  String getVersion();

  /**
   * Version of the geographic data.
   *
   */
  @JSProperty("version")
  void setVersion(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final GeoJSON object = Any.empty();

    private Builder() {
    }

    public GeoJSON build() {
      return object;
    }

    /**
     * Full copyright note of the geographic data.
     *
     */
    public Builder copyright(@Nullable String value) {
      object.setCopyright(value);
      return this;
    }

    /**
     * Short copyright note of the geographic data suitable for watermarks.
     *
     */
    public Builder copyrightShort(@Nullable String value) {
      object.setCopyrightShort(value);
      return this;
    }

    /**
     * Additional meta information based on the coordinate reference system.
     *
     */
    public Builder crs(@Nullable Dictionary<Any> value) {
      object.setCrs(value);
      return this;
    }

    /**
     * Data sets of geographic features.
     *
     */
    public Builder features(GeoJSONFeature... value) {
      object.setFeatures(value);
      return this;
    }

    /**
     * Map projections and transformations to be used when calculating between
     * lat/lon and chart values. Required for lat/lon support on maps. Allows
     * resizing, rotating, and moving portions of a map within its projected
     * coordinate system while still retaining lat/lon support. If using lat/lon
     * on a portion of the map that does not match a <code>hitZone</code>, the definition
     * with the key <code>default</code> is used.
     *
     */
    public Builder hcTransform(@Nullable Dictionary<GeoJSONTranslation> value) {
      object.setHcTransform(value);
      return this;
    }

    /**
     * Title of the geographic data.
     *
     */
    public Builder title(@Nullable String value) {
      object.setTitle(value);
      return this;
    }

    /**
     * Type of the geographic data. Type of an optimized map collection is
     * <code>FeatureCollection</code>.
     *
     */
    public Builder type(@Nullable String value) {
      object.setType(value);
      return this;
    }

    /**
     * Version of the geographic data.
     *
     */
    public Builder version(@Nullable String value) {
      object.setVersion(value);
      return this;
    }
  }
}
