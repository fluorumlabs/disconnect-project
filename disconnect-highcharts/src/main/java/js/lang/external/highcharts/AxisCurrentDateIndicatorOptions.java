package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorAxisCurrentDateIndicatorEventsOptions | NavigatorXAxisCurrentDateIndicatorEventsOptions | XAxisCurrentDateIndicatorEventsOptions | ZAxisCurrentDateIndicatorEventsOptions ) */;
import js.lang.Unknown /* ( ColorAxisCurrentDateIndicatorLabelOptions | NavigatorXAxisCurrentDateIndicatorLabelOptions | XAxisCurrentDateIndicatorLabelOptions | ZAxisCurrentDateIndicatorLabelOptions ) */;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Show an indicator on the axis for the current date and time. Can be a
 * boolean or a configuration object similar to xAxis.plotLines.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisCurrentDateIndicatorOptions extends Any {
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
   * (Gantt) A custom class name, in addition to the default
   * <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Gantt) A custom class name, in addition to the default
   * <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Gantt) The color of the line.
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * (Gantt) The color of the line.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Gantt) The dashing or dot style for the plot line. For possible values
   * see this overview.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Gantt) The dashing or dot style for the plot line. For possible values
   * see this overview.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  @Nullable
  Unknown /* ( ColorAxisCurrentDateIndicatorEventsOptions | NavigatorXAxisCurrentDateIndicatorEventsOptions | XAxisCurrentDateIndicatorEventsOptions | ZAxisCurrentDateIndicatorEventsOptions ) */ getEvents(
      );

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable NavigatorXAxisCurrentDateIndicatorEventsOptions value);

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ColorAxisCurrentDateIndicatorEventsOptions value);

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable XAxisCurrentDateIndicatorEventsOptions value);

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ZAxisCurrentDateIndicatorEventsOptions value);

  /**
   * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  @Nullable
  Unknown /* ( ColorAxisCurrentDateIndicatorLabelOptions | NavigatorXAxisCurrentDateIndicatorLabelOptions | XAxisCurrentDateIndicatorLabelOptions | ZAxisCurrentDateIndicatorLabelOptions ) */ getLabel(
      );

  /**
   * (Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable NavigatorXAxisCurrentDateIndicatorLabelOptions value);

  /**
   * (Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable ColorAxisCurrentDateIndicatorLabelOptions value);

  /**
   * (Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable XAxisCurrentDateIndicatorLabelOptions value);

  /**
   * (Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable ZAxisCurrentDateIndicatorLabelOptions value);

  /**
   * (Gantt) The width or thickness of the plot line.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Gantt) The width or thickness of the plot line.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Gantt) The z index of the plot line within the chart.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Gantt) The z index of the plot line within the chart.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  class Builder {
    private final AxisCurrentDateIndicatorOptions object = Any.empty();

    public AxisCurrentDateIndicatorOptions build() {
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
     * (Gantt) A custom class name, in addition to the default
     * <code>highcharts-plot-line</code>, to apply to each individual line.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Gantt) The color of the line.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Gantt) The dashing or dot style for the plot line. For possible values
     * see this overview.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Gantt) An object defining mouse events for the plot line. Supported
     * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
     *
     */
    public Builder events(@Nullable NavigatorXAxisCurrentDateIndicatorEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Gantt) An object defining mouse events for the plot line. Supported
     * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
     *
     */
    public Builder events(@Nullable ColorAxisCurrentDateIndicatorEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Gantt) An object defining mouse events for the plot line. Supported
     * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
     *
     */
    public Builder events(@Nullable XAxisCurrentDateIndicatorEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Gantt) An object defining mouse events for the plot line. Supported
     * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
     *
     */
    public Builder events(@Nullable ZAxisCurrentDateIndicatorEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Gantt) Text labels for the plot bands
     *
     */
    public Builder label(@Nullable NavigatorXAxisCurrentDateIndicatorLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Gantt) Text labels for the plot bands
     *
     */
    public Builder label(@Nullable ColorAxisCurrentDateIndicatorLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Gantt) Text labels for the plot bands
     *
     */
    public Builder label(@Nullable XAxisCurrentDateIndicatorLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Gantt) Text labels for the plot bands
     *
     */
    public Builder label(@Nullable ZAxisCurrentDateIndicatorLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Gantt) The width or thickness of the plot line.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Gantt) The z index of the plot line within the chart.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
