package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * An object containing <code>left</code> and <code>top</code> properties for the position in the
 * page.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface OffsetObject extends Any {
  /**
   * Left distance to the page border.
   *
   */
  @JSProperty("left")
  double getLeft();

  /**
   * Left distance to the page border.
   *
   */
  @JSProperty("left")
  void setLeft(double value);

  /**
   * Top distance to the page border.
   *
   */
  @JSProperty("top")
  double getTop();

  /**
   * Top distance to the page border.
   *
   */
  @JSProperty("top")
  void setTop(double value);

  class Builder {
    private final OffsetObject object = Any.empty();

    public OffsetObject build() {
      return object;
    }

    /**
     * Left distance to the page border.
     *
     */
    public Builder left(double value) {
      object.setLeft(value);
      return this;
    }

    /**
     * Top distance to the page border.
     *
     */
    public Builder top(double value) {
      object.setTop(value);
      return this;
    }
  }
}
