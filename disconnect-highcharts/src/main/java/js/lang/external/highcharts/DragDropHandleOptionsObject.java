package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Options for the drag handles.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DragDropHandleOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) The class name of the drag handles.
   * Defaults to <code>highcharts-drag-handle</code>.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Gantt) The class name of the drag handles.
   * Defaults to <code>highcharts-drag-handle</code>.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The mouse cursor to use for the drag
   * handles. By default this is intelligently switching between <code>ew-resize</code>
   * and <code>ns-resize</code> depending on the direction the point is being dragged.
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Highcharts, Highstock, Gantt) The mouse cursor to use for the drag
   * handles. By default this is intelligently switching between <code>ew-resize</code>
   * and <code>ns-resize</code> depending on the direction the point is being dragged.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The line color of the drag handles.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highstock, Gantt) The line color of the drag handles.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The line width for the drag handles.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock, Gantt) The line width for the drag handles.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) Function to define the SVG path to use for
   * the drag handles. Takes the point as argument. Should return an SVG path
   * in array format. The SVG path is automatically positioned on the point.
   *
   */
  @JSProperty("pathFormatter")
  @Nullable
  JsFunction getPathFormatter();

  /**
   * (Highcharts, Highstock, Gantt) Function to define the SVG path to use for
   * the drag handles. Takes the point as argument. Should return an SVG path
   * in array format. The SVG path is automatically positioned on the point.
   *
   */
  @JSProperty("pathFormatter")
  void setPathFormatter(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock, Gantt) The z index for the drag handles.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The z index for the drag handles.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  class Builder {
    private final DragDropHandleOptionsObject object = Any.empty();

    public DragDropHandleOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) The class name of the drag handles.
     * Defaults to <code>highcharts-drag-handle</code>.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The mouse cursor to use for the drag
     * handles. By default this is intelligently switching between <code>ew-resize</code>
     * and <code>ns-resize</code> depending on the direction the point is being dragged.
     *
     */
    public Builder cursor(@Nullable String value) {
      object.setCursor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The line color of the drag handles.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The line width for the drag handles.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Function to define the SVG path to use for
     * the drag handles. Takes the point as argument. Should return an SVG path
     * in array format. The SVG path is automatically positioned on the point.
     *
     */
    public Builder pathFormatter(@Nullable JsFunction value) {
      object.setPathFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The z index for the drag handles.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
