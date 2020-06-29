package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface BubbleLegendFormatterContextObject extends Any {
  /**
   * The center y position of the range.
   *
   */
  @JSProperty("center")
  double getCenter();

  /**
   * The center y position of the range.
   *
   */
  @JSProperty("center")
  void setCenter(double value);

  /**
   * The radius of the bubble range.
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * The radius of the bubble range.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * The bubble value.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * The bubble value.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final BubbleLegendFormatterContextObject object = Any.empty();

    private Builder() {
    }

    public BubbleLegendFormatterContextObject build() {
      return object;
    }

    /**
     * The center y position of the range.
     *
     */
    public Builder center(double value) {
      object.setCenter(value);
      return this;
    }

    /**
     * The radius of the bubble range.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }

    /**
     * The bubble value.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
