package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Apply a jitter effect for the rendered markers. When
 * plotting discrete values, a little random noise may help telling the points
 * apart. The jitter setting applies a random displacement of up to <code>n</code> axis
 * units in either direction. So for example on a horizontal X axis, setting the
 * <code>jitter.x</code> to 0.24 will render the point in a random position between 0.24
 * units to the left and 0.24 units to the right of the true axis position. On a
 * category axis, setting it to 0.5 will fill up the bin and make the data
 * appear continuous.
 *
 * When rendered on top of a box plot or a column series, a jitter value of 0.24
 * will correspond to the underlying series' default groupPadding and
 * pointPadding settings.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotScatterJitterOptions extends Any {
  /**
   * (Highcharts, Highstock) The maximal X offset for the random jitter
   * effect.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock) The maximal X offset for the random jitter
   * effect.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock) The maximal Y offset for the random jitter
   * effect.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The maximal Y offset for the random jitter
   * effect.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final PlotScatterJitterOptions object = Any.empty();

    public PlotScatterJitterOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) The maximal X offset for the random jitter
     * effect.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The maximal Y offset for the random jitter
     * effect.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
