package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) Positioning for the input boxes. Allowed properties are
 * <code>align</code>, <code>x</code> and <code>y</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface RangeSelectorInputPositionOptions extends Any {
  /**
   * (Highstock, Gantt) The alignment of the input box. Allowed properties are
   * <code>left</code>, <code>center</code>, <code>right</code>.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highstock, Gantt) The alignment of the input box. Allowed properties are
   * <code>left</code>, <code>center</code>, <code>right</code>.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highstock, Gantt) X offset of the input row.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock, Gantt) X offset of the input row.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock, Gantt) Y offset of the input row.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock, Gantt) Y offset of the input row.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final RangeSelectorInputPositionOptions object = Any.empty();

    public RangeSelectorInputPositionOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) The alignment of the input box. Allowed properties are
     * <code>left</code>, <code>center</code>, <code>right</code>.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highstock, Gantt) X offset of the input row.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Y offset of the input row.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
