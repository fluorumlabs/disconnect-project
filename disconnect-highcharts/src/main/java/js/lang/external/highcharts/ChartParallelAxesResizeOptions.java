package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for axis resizing. It adds a thick line between panes
 * which the user can drag in order to resize the panes.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartParallelAxesResizeOptions extends Any {
  /**
   * (Highstock) Contains two arrays of axes that are controlled by control
   * line of the axis.
   *
   */
  @JSProperty("controlledAxis")
  @Nullable
  ChartParallelAxesResizeControlledAxisOptions getControlledAxis();

  /**
   * (Highstock) Contains two arrays of axes that are controlled by control
   * line of the axis.
   *
   */
  @JSProperty("controlledAxis")
  void setControlledAxis(@Nullable ChartParallelAxesResizeControlledAxisOptions value);

  /**
   * (Highstock) Cursor style for the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Highstock) Cursor style for the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable String value);

  /**
   * (Highstock) Enable or disable resize by drag for the axis.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable resize by drag for the axis.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Color of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) Color of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highstock) Dash style of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("lineDashStyle")
  @Nullable
  String getLineDashStyle();

  /**
   * (Highstock) Dash style of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("lineDashStyle")
  void setLineDashStyle(@Nullable String value);

  /**
   * (Highstock) Width of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) Width of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) Horizontal offset of the control line.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock) Horizontal offset of the control line.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock) Vertical offset of the control line.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock) Vertical offset of the control line.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ChartParallelAxesResizeOptions object = Any.empty();

    private Builder() {
    }

    public ChartParallelAxesResizeOptions build() {
      return object;
    }

    /**
     * (Highstock) Contains two arrays of axes that are controlled by control
     * line of the axis.
     *
     */
    public Builder controlledAxis(@Nullable ChartParallelAxesResizeControlledAxisOptions value) {
      object.setControlledAxis(value);
      return this;
    }

    /**
     * (Highstock) Cursor style for the control line.
     *
     * In styled mode use class <code>highcharts-axis-resizer</code> instead.
     *
     */
    public Builder cursor(@Nullable String value) {
      object.setCursor(value);
      return this;
    }

    /**
     * (Highstock) Enable or disable resize by drag for the axis.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) Color of the control line.
     *
     * In styled mode use class <code>highcharts-axis-resizer</code> instead.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highstock) Dash style of the control line.
     *
     * In styled mode use class <code>highcharts-axis-resizer</code> instead.
     *
     */
    public Builder lineDashStyle(@Nullable String value) {
      object.setLineDashStyle(value);
      return this;
    }

    /**
     * (Highstock) Width of the control line.
     *
     * In styled mode use class <code>highcharts-axis-resizer</code> instead.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highstock) Horizontal offset of the control line.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock) Vertical offset of the control line.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
