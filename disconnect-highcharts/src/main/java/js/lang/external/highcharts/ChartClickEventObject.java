package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Contains information about the clicked spot on the chart. Remember the unit
 * of a datetime axis is milliseconds since 1970-01-01 00:00:00.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartClickEventObject extends PointerEventObject {
  /**
   * Information about the x-axis on the clicked spot.
   *
   */
  @JSProperty("xAxis")
  ChartClickEventAxisObject[] getXAxis();

  /**
   * Information about the x-axis on the clicked spot.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(ChartClickEventAxisObject[] value);

  /**
   * Information about the y-axis on the clicked spot.
   *
   */
  @JSProperty("yAxis")
  ChartClickEventAxisObject[] getYAxis();

  /**
   * Information about the y-axis on the clicked spot.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(ChartClickEventAxisObject[] value);

  /**
   * Information about the z-axis on the clicked spot.
   *
   */
  @JSProperty("zAxis")
  @Nullable
  ChartClickEventAxisObject[] getZAxis();

  /**
   * Information about the z-axis on the clicked spot.
   *
   */
  @JSProperty("zAxis")
  void setZAxis(ChartClickEventAxisObject[] value);

  class Builder {
    private final ChartClickEventObject object = Any.empty();

    public ChartClickEventObject build() {
      return object;
    }

    /**
     * Information about the x-axis on the clicked spot.
     *
     */
    public Builder xAxis(ChartClickEventAxisObject[] value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * Information about the y-axis on the clicked spot.
     *
     */
    public Builder yAxis(ChartClickEventAxisObject[] value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * Information about the z-axis on the clicked spot.
     *
     */
    public Builder zAxis(ChartClickEventAxisObject[] value) {
      object.setZAxis(value);
      return this;
    }
  }
}
