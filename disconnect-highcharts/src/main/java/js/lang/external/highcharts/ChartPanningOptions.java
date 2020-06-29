package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
 * panKey to combine zooming and panning.
 *
 * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
 * (default), panning requires two fingers. To allow panning with one finger,
 * set <code>followTouchMove</code> to <code>false</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartPanningOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
   * pan the chart. Can be one of <code>x</code>, <code>y</code>, or <code>xy</code>.
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
   * pan the chart. Can be one of <code>x</code>, <code>y</code>, or <code>xy</code>.
   *
   */
  @JSProperty("type")
  void setType(@Nullable Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type X = JsEnum.of("x");

    public static final Type XY = JsEnum.of("xy");

    public static final Type Y = JsEnum.of("y");
  }

  final class Builder {
    private final ChartPanningOptions object = Any.empty();

    private Builder() {
    }

    public ChartPanningOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
     * pan the chart. Can be one of <code>x</code>, <code>y</code>, or <code>xy</code>.
     *
     */
    public Builder type(@Nullable Type value) {
      object.setType(value);
      return this;
    }
  }
}
