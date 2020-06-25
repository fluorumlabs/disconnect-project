package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( number | string ) */;
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
public interface NavigatorYAxisPlotBandsOptions extends Any {
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
  NavigatorYAxisPlotBandsEventsOptions getEvents();

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable NavigatorYAxisPlotBandsEventsOptions value);

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
   * (Highcharts) In a gauge chart, this option determines the inner radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
   * default, the inner radius is controlled by the thickness option.
   *
   */
  @JSProperty("innerRadius")
  @Nullable
  Unknown /* ( number | string ) */ getInnerRadius();

  /**
   * (Highcharts) In a gauge chart, this option determines the inner radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
   * default, the inner radius is controlled by the thickness option.
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(double value);

  /**
   * (Highcharts) In a gauge chart, this option determines the inner radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
   * default, the inner radius is controlled by the thickness option.
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  @Nullable
  NavigatorYAxisPlotBandsLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable NavigatorYAxisPlotBandsLabelOptions value);

  /**
   * (Highcharts) In a gauge chart, this option determines the outer radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
   *
   */
  @JSProperty("outerRadius")
  @Nullable
  Unknown /* ( number | string ) */ getOuterRadius();

  /**
   * (Highcharts) In a gauge chart, this option determines the outer radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(double value);

  /**
   * (Highcharts) In a gauge chart, this option determines the outer radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(@Nullable String value);

  /**
   * (Highcharts) In a gauge chart, this option sets the width of the plot
   * band stretching along the perimeter. It can be given as a percentage
   * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
   * 10 is the same as the default tickLength, thus making the plot band act
   * as a background for the tick markers.
   *
   */
  @JSProperty("thickness")
  @Nullable
  Unknown /* ( number | string ) */ getThickness();

  /**
   * (Highcharts) In a gauge chart, this option sets the width of the plot
   * band stretching along the perimeter. It can be given as a percentage
   * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
   * 10 is the same as the default tickLength, thus making the plot band act
   * as a background for the tick markers.
   *
   */
  @JSProperty("thickness")
  void setThickness(double value);

  /**
   * (Highcharts) In a gauge chart, this option sets the width of the plot
   * band stretching along the perimeter. It can be given as a percentage
   * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
   * 10 is the same as the default tickLength, thus making the plot band act
   * as a background for the tick markers.
   *
   */
  @JSProperty("thickness")
  void setThickness(@Nullable String value);

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
    private final NavigatorYAxisPlotBandsOptions object = Any.empty();

    public NavigatorYAxisPlotBandsOptions build() {
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
    public Builder events(@Nullable NavigatorYAxisPlotBandsEventsOptions value) {
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
     * (Highcharts) In a gauge chart, this option determines the inner radius of
     * the plot band that stretches along the perimeter. It can be given as a
     * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
     * default, the inner radius is controlled by the thickness option.
     *
     */
    public Builder innerRadius(double value) {
      object.setInnerRadius(value);
      return this;
    }

    /**
     * (Highcharts) In a gauge chart, this option determines the inner radius of
     * the plot band that stretches along the perimeter. It can be given as a
     * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
     * default, the inner radius is controlled by the thickness option.
     *
     */
    public Builder innerRadius(@Nullable String value) {
      object.setInnerRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Text labels for the plot bands
     *
     */
    public Builder label(@Nullable NavigatorYAxisPlotBandsLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highcharts) In a gauge chart, this option determines the outer radius of
     * the plot band that stretches along the perimeter. It can be given as a
     * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
     *
     */
    public Builder outerRadius(double value) {
      object.setOuterRadius(value);
      return this;
    }

    /**
     * (Highcharts) In a gauge chart, this option determines the outer radius of
     * the plot band that stretches along the perimeter. It can be given as a
     * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
     *
     */
    public Builder outerRadius(@Nullable String value) {
      object.setOuterRadius(value);
      return this;
    }

    /**
     * (Highcharts) In a gauge chart, this option sets the width of the plot
     * band stretching along the perimeter. It can be given as a percentage
     * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
     * 10 is the same as the default tickLength, thus making the plot band act
     * as a background for the tick markers.
     *
     */
    public Builder thickness(double value) {
      object.setThickness(value);
      return this;
    }

    /**
     * (Highcharts) In a gauge chart, this option sets the width of the plot
     * band stretching along the perimeter. It can be given as a percentage
     * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
     * 10 is the same as the default tickLength, thus making the plot band act
     * as a background for the tick markers.
     *
     */
    public Builder thickness(@Nullable String value) {
      object.setThickness(value);
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
