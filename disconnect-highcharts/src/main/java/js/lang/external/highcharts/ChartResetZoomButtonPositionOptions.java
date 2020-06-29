package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartResetZoomButtonPositionOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * button.
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * button.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * button.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * button.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal offset of the
   * button.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal offset of the
   * button.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
   * button.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
   * button.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ChartResetZoomButtonPositionOptions object = Any.empty();

    private Builder() {
    }

    public ChartResetZoomButtonPositionOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * button.
     *
     */
    public Builder align(@Nullable String value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * button.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal offset of the
     * button.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
     * button.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
