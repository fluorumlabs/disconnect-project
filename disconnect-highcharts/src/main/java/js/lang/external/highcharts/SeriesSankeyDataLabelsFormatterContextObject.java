package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Context for the node formatter function.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesSankeyDataLabelsFormatterContextObject extends PointLabelObject {
  /**
   * The node object. The node name, if defined, is available through
   * <code>this.point.name</code>.
   *
   */
  @JSProperty("point")
  SankeyNodeObject getPoint();

  /**
   * The node object. The node name, if defined, is available through
   * <code>this.point.name</code>.
   *
   */
  @JSProperty("point")
  void setPoint(SankeyNodeObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesSankeyDataLabelsFormatterContextObject object = Any.empty();

    private Builder() {
    }

    public SeriesSankeyDataLabelsFormatterContextObject build() {
      return object;
    }

    /**
     * The node object. The node name, if defined, is available through
     * <code>this.point.name</code>.
     *
     */
    public Builder point(SankeyNodeObject value) {
      object.setPoint(value);
      return this;
    }
  }
}
