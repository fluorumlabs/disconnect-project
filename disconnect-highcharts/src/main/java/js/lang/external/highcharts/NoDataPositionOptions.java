package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) The position of the no-data label, relative to
 * the plot area.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NoDataPositionOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final NoDataPositionOptions object = Any.empty();

    public NoDataPositionOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
