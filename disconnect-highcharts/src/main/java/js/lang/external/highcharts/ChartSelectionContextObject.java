package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * The primary axes are <code>xAxis[0]</code> and <code>yAxis[0]</code>. Remember the unit of a
 * datetime axis is milliseconds since 1970-01-01 00:00:00.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartSelectionContextObject extends Event {
  /**
   * Arrays containing the axes of each dimension and each axis' min and max
   * values.
   *
   */
  @JSProperty("xAxis")
  ChartSelectionAxisContextObject[] getXAxis();

  /**
   * Arrays containing the axes of each dimension and each axis' min and max
   * values.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(ChartSelectionAxisContextObject... value);

  /**
   * Arrays containing the axes of each dimension and each axis' min and max
   * values.
   *
   */
  @JSProperty("yAxis")
  ChartSelectionAxisContextObject[] getYAxis();

  /**
   * Arrays containing the axes of each dimension and each axis' min and max
   * values.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(ChartSelectionAxisContextObject... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ChartSelectionContextObject object = Any.empty();

    private Builder() {
    }

    public ChartSelectionContextObject build() {
      return object;
    }

    /**
     * Arrays containing the axes of each dimension and each axis' min and max
     * values.
     *
     */
    public Builder xAxis(ChartSelectionAxisContextObject... value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * Arrays containing the axes of each dimension and each axis' min and max
     * values.
     *
     */
    public Builder yAxis(ChartSelectionAxisContextObject... value) {
      object.setYAxis(value);
      return this;
    }
  }
}
