package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of lines stretching across the plot
 * area, marking a specific value on one of the axes.
 *
 * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
 * class in addition to the <code>className</code> option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ZAxisPlotLinesOptions extends Any {
  /**
   * (Highstock) Flag to decide if plotLine should be rendered across all
   * panes.
   *
   */
  @JSProperty("acrossPanes")
  boolean getAcrossPanes();

  /**
   * (Highstock) Flag to decide if plotLine should be rendered across all
   * panes.
   *
   */
  @JSProperty("acrossPanes")
  void setAcrossPanes(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
   * line. For possible values see this overview.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
   * line. For possible values see this overview.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  @Nullable
  ZAxisPlotLinesEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ZAxisPlotLinesEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
   * in Axis.removePlotLine.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
   * in Axis.removePlotLine.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  @Nullable
  ZAxisPlotLinesLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable ZAxisPlotLinesLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The position of the line in axis units.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock, Gantt) The position of the line in axis units.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The z index of the plot line within the
   * chart.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The z index of the plot line within the
   * chart.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ZAxisPlotLinesOptions object = Any.empty();

    private Builder() {
    }

    public ZAxisPlotLinesOptions build() {
      return object;
    }

    /**
     * (Highstock) Flag to decide if plotLine should be rendered across all
     * panes.
     *
     */
    public Builder acrossPanes(boolean value) {
      object.setAcrossPanes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
     * default <code>highcharts-plot-line</code>, to apply to each individual line.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the line.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
     * line. For possible values see this overview.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An object defining mouse events for the
     * plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
     * <code>mousemove</code>.
     *
     */
    public Builder events(@Nullable ZAxisPlotLinesEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
     * in Axis.removePlotLine.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Text labels for the plot bands
     *
     */
    public Builder label(@Nullable ZAxisPlotLinesLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The position of the line in axis units.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The z index of the plot line within the
     * chart.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
