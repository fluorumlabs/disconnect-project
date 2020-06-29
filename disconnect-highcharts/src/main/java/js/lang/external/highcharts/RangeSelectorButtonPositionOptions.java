package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) Positioning for the button row.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface RangeSelectorButtonPositionOptions extends Any {
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
   * (Highstock, Gantt) X offset of the button row.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock, Gantt) X offset of the button row.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock, Gantt) Y offset of the button row.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock, Gantt) Y offset of the button row.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final RangeSelectorButtonPositionOptions object = Any.empty();

    private Builder() {
    }

    public RangeSelectorButtonPositionOptions build() {
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
     * (Highstock, Gantt) X offset of the button row.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Y offset of the button row.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
