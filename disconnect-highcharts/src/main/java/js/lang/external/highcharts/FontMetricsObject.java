package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The font metrics.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface FontMetricsObject extends Any {
  /**
   * The baseline relative to the top of the box.
   *
   */
  @JSProperty("b")
  double getB();

  /**
   * The baseline relative to the top of the box.
   *
   */
  @JSProperty("b")
  void setB(double value);

  /**
   * The font size.
   *
   */
  @JSProperty("f")
  double getF();

  /**
   * The font size.
   *
   */
  @JSProperty("f")
  void setF(double value);

  /**
   * The line height.
   *
   */
  @JSProperty("h")
  double getH();

  /**
   * The line height.
   *
   */
  @JSProperty("h")
  void setH(double value);

  class Builder {
    private final FontMetricsObject object = Any.empty();

    public FontMetricsObject build() {
      return object;
    }

    /**
     * The baseline relative to the top of the box.
     *
     */
    public Builder b(double value) {
      object.setB(value);
      return this;
    }

    /**
     * The font size.
     *
     */
    public Builder f(double value) {
      object.setF(value);
      return this;
    }

    /**
     * The line height.
     *
     */
    public Builder h(double value) {
      object.setH(value);
      return this;
    }
  }
}
