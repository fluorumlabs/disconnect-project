package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The position of the button.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSunburstTraverseUpButtonPositionOptions extends Any {
  /**
   * (Highcharts) Horizontal alignment of the button.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts) Horizontal alignment of the button.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts) Vertical alignment of the button.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts) Vertical alignment of the button.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts) Horizontal offset of the button.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts) Horizontal offset of the button.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts) Vertical offset of the button.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts) Vertical offset of the button.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotSunburstTraverseUpButtonPositionOptions object = Any.empty();

    private Builder() {
    }

    public PlotSunburstTraverseUpButtonPositionOptions build() {
      return object;
    }

    /**
     * (Highcharts) Horizontal alignment of the button.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts) Vertical alignment of the button.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts) Horizontal offset of the button.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts) Vertical offset of the button.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
