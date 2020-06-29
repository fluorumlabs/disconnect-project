package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Determines the width of the ring per level.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSunburstLevelSizeOptions extends Any {
  /**
   * (Highcharts) How to interpret <code>levelSize.value</code>.
   *
   * <ul>
   * <li>
   * <code>percentage</code> gives a width relative to result of outer radius minus
   * inner radius.
   *
   * </li>
   * <li>
   * <code>pixels</code> gives the ring a fixed width in pixels.
   *
   * </li>
   * <li>
   * <code>weight</code> takes the remaining width after percentage and pixels, and
   * distributes it accross all &quot;weighted&quot; levels. The value relative to the
   * sum of all weights determines the width.
   *
   * </li>
   * </ul>
   */
  @JSProperty("unit")
  @Nullable
  Unit getUnit();

  /**
   * (Highcharts) How to interpret <code>levelSize.value</code>.
   *
   * <ul>
   * <li>
   * <code>percentage</code> gives a width relative to result of outer radius minus
   * inner radius.
   *
   * </li>
   * <li>
   * <code>pixels</code> gives the ring a fixed width in pixels.
   *
   * </li>
   * <li>
   * <code>weight</code> takes the remaining width after percentage and pixels, and
   * distributes it accross all &quot;weighted&quot; levels. The value relative to the
   * sum of all weights determines the width.
   *
   * </li>
   * </ul>
   */
  @JSProperty("unit")
  void setUnit(@Nullable Unit value);

  /**
   * (Highcharts) The value used for calculating the width of the ring. Its'
   * affect is determined by <code>levelSize.unit</code>.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts) The value used for calculating the width of the ring. Its'
   * affect is determined by <code>levelSize.unit</code>.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Unit extends JsEnum {
    public static final Unit PERCENTAGE = JsEnum.of("percentage");

    public static final Unit PIXELS = JsEnum.of("pixels");

    public static final Unit WEIGHT = JsEnum.of("weight");
  }

  final class Builder {
    private final PlotSunburstLevelSizeOptions object = Any.empty();

    private Builder() {
    }

    public PlotSunburstLevelSizeOptions build() {
      return object;
    }

    /**
     * (Highcharts) How to interpret <code>levelSize.value</code>.
     *
     * <ul>
     * <li>
     * <code>percentage</code> gives a width relative to result of outer radius minus
     * inner radius.
     *
     * </li>
     * <li>
     * <code>pixels</code> gives the ring a fixed width in pixels.
     *
     * </li>
     * <li>
     * <code>weight</code> takes the remaining width after percentage and pixels, and
     * distributes it accross all &quot;weighted&quot; levels. The value relative to the
     * sum of all weights determines the width.
     *
     * </li>
     * </ul>
     */
    public Builder unit(@Nullable Unit value) {
      object.setUnit(value);
      return this;
    }

    /**
     * (Highcharts) The value used for calculating the width of the ring. Its'
     * affect is determined by <code>levelSize.unit</code>.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
