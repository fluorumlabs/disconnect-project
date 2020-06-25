package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Positioning options for the button within the
 * <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and
 * <code>verticalAlign</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DrilldownDrillUpButtonPositionOptions extends Any {
  /**
   * (Highcharts, Highmaps) Horizontal alignment.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highmaps) Horizontal alignment.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highmaps) Vertical alignment of the button.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highmaps) Vertical alignment of the button.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highmaps) The X offset of the button.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highmaps) The X offset of the button.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highmaps) The Y offset of the button.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highmaps) The Y offset of the button.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final DrilldownDrillUpButtonPositionOptions object = Any.empty();

    public DrilldownDrillUpButtonPositionOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) Horizontal alignment.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Vertical alignment of the button.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The X offset of the button.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The Y offset of the button.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
