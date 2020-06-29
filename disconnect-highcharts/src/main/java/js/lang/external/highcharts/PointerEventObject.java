package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.pointerevents.PointerEvent;
import org.teavm.jso.JSProperty;

/**
 * A native browser mouse or touch event, extended with position information
 * relative to the Chart.container.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointerEventObject extends PointerEvent {
  /**
   * The X coordinate of the pointer interaction relative to the chart.
   *
   */
  @JSProperty("chartX")
  double getChartX();

  /**
   * The X coordinate of the pointer interaction relative to the chart.
   *
   */
  @JSProperty("chartX")
  void setChartX(double value);

  /**
   * The Y coordinate of the pointer interaction relative to the chart.
   *
   */
  @JSProperty("chartY")
  double getChartY();

  /**
   * The Y coordinate of the pointer interaction relative to the chart.
   *
   */
  @JSProperty("chartY")
  void setChartY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointerEventObject object = Any.empty();

    private Builder() {
    }

    public PointerEventObject build() {
      return object;
    }

    /**
     * The X coordinate of the pointer interaction relative to the chart.
     *
     */
    public Builder chartX(double value) {
      object.setChartX(value);
      return this;
    }

    /**
     * The Y coordinate of the pointer interaction relative to the chart.
     *
     */
    public Builder chartY(double value) {
      object.setChartY(value);
      return this;
    }
  }
}
