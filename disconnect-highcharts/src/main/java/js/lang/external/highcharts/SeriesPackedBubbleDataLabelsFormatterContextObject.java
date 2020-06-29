package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Context for the formatter function.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesPackedBubbleDataLabelsFormatterContextObject extends PointLabelObject {
  /**
   * The color of the node.
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * The ID of the node.
   *
   */
  @JSProperty("key")
  String getKey();

  /**
   * The ID of the node.
   *
   */
  @JSProperty("key")
  void setKey(String value);

  /**
   * The point (node) object. The node name, if defined, is available through
   * <code>this.point.name</code>. Arrays: <code>this.point.linksFrom</code> and
   * <code>this.point.linksTo</code> contains all nodes connected to this point.
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * The point (node) object. The node name, if defined, is available through
   * <code>this.point.name</code>. Arrays: <code>this.point.linksFrom</code> and
   * <code>this.point.linksTo</code> contains all nodes connected to this point.
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesPackedBubbleDataLabelsFormatterContextObject object = Any.empty();

    private Builder() {
    }

    public SeriesPackedBubbleDataLabelsFormatterContextObject build() {
      return object;
    }

    /**
     * The color of the node.
     *
     */
    public Builder color(String value) {
      object.setColor(value);
      return this;
    }

    /**
     * The ID of the node.
     *
     */
    public Builder key(String value) {
      object.setKey(value);
      return this;
    }

    /**
     * The point (node) object. The node name, if defined, is available through
     * <code>this.point.name</code>. Arrays: <code>this.point.linksFrom</code> and
     * <code>this.point.linksTo</code> contains all nodes connected to this point.
     *
     */
    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }
  }
}
