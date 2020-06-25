package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of colored bands stretching across
 * the plot area marking an interval on the axis.
 *
 * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
 * class in addition to the <code>className</code> option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ZAxisPlotBandsOptions extends Any {
  /**
   * (Highstock) Flag to decide if plotBand should be rendered across all
   * panes.
   *
   */
  @JSProperty("acrossPanes")
  boolean getAcrossPanes();

  /**
   * (Highstock) Flag to decide if plotBand should be rendered across all
   * panes.
   *
   */
  @JSProperty("acrossPanes")
  void setAcrossPanes(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
   * requires <code>borderWidth</code> to be set.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
   * requires <code>borderWidth</code> to be set.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
   * requires <code>borderColor</code> to be set.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
   * requires <code>borderColor</code> to be set.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-band</code>, to apply to each individual band.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-band</code>, to apply to each individual band.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  @Nullable
  ZAxisPlotBandsEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable ZAxisPlotBandsEventsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The start position of the plot band in
   * axis units.
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highstock, Gantt) The start position of the plot band in
   * axis units.
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
   * in Axis.removePlotBand.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
   * in Axis.removePlotBand.
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
  ZAxisPlotBandsLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable ZAxisPlotBandsLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
   * units.
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
   * units.
   *
   */
  @JSProperty("to")
  void setTo(double value);

  /**
   * (Highcharts, Highstock, Gantt) The z index of the plot band within the
   * chart, relative to other elements. Using the same z index as another
   * element may give unpredictable results, as the last rendered element will
   * be on top. Values from 0 to 20 make sense.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The z index of the plot band within the
   * chart, relative to other elements. Using the same z index as another
   * element may give unpredictable results, as the last rendered element will
   * be on top. Values from 0 to 20 make sense.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  class Builder {
    private final ZAxisPlotBandsOptions object = Any.empty();

    public ZAxisPlotBandsOptions build() {
      return object;
    }

    /**
     * (Highstock) Flag to decide if plotBand should be rendered across all
     * panes.
     *
     */
    public Builder acrossPanes(boolean value) {
      object.setAcrossPanes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
     * requires <code>borderWidth</code> to be set.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
     * requires <code>borderColor</code> to be set.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
     * default <code>highcharts-plot-band</code>, to apply to each individual band.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the plot band.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the plot band.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The color of the plot band.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An object defining mouse events for the
     * plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
     * <code>mousemove</code>.
     *
     */
    public Builder events(@Nullable ZAxisPlotBandsEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The start position of the plot band in
     * axis units.
     *
     */
    public Builder from(double value) {
      object.setFrom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
     * in Axis.removePlotBand.
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
    public Builder label(@Nullable ZAxisPlotBandsLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
     * units.
     *
     */
    public Builder to(double value) {
      object.setTo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The z index of the plot band within the
     * chart, relative to other elements. Using the same z index as another
     * element may give unpredictable results, as the last rendered element will
     * be on top. Values from 0 to 20 make sense.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
