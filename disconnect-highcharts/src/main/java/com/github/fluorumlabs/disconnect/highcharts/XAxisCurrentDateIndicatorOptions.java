package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Show an indicator on the axis for the current date and time. Can be a
 * boolean or a configuration object similar to xAxis.plotLines.
 *
 * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator">https://api.highcharts.com/gantt/xAxis.currentDateIndicator</a>
 *
 */
public interface XAxisCurrentDateIndicatorOptions extends Any {
  /**
   * (Gantt) A custom class name, in addition to the default
   * <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.className">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Gantt) A custom class name, in addition to the default
   * <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.className">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Gantt) The dashing or dot style for the plot line. For possible values
   * see this overview.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.dashStyle">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Gantt) The dashing or dot style for the plot line. For possible values
   * see this overview.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.dashStyle">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(DashStyle value);

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.events">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.events</a>
   *
   * @implspec events?: any;
   *
   */
  @JSProperty("events")
  @Nullable
  Any getEvents();

  /**
   * (Gantt) An object defining mouse events for the plot line. Supported
   * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.events">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.events</a>
   *
   * @implspec events?: any;
   *
   */
  @JSProperty("events")
  void setEvents(Any value);

  /**
   * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.id">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.id">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.label">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.label</a>
   *
   * @implspec label?: XAxisCurrentDateIndicatorLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  XAxisCurrentDateIndicatorLabelOptions getLabel();

  /**
   * (Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.label">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.label</a>
   *
   * @implspec label?: XAxisCurrentDateIndicatorLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(XAxisCurrentDateIndicatorLabelOptions value);

  /**
   * (Gantt) The width or thickness of the plot line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.width">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Gantt) The width or thickness of the plot line.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.width">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Gantt) The z index of the plot line within the chart.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.zIndex">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Gantt) The z index of the plot line within the chart.
   *
   * @see <a href="https://api.highcharts.com/gantt/xAxis.currentDateIndicator.zIndex">https://api.highcharts.com/gantt/xAxis.currentDateIndicator.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  abstract class DashStyle extends JsEnum {
    public static final DashStyle DASH = JsEnum.of("Dash");

    public static final DashStyle DASHDOT = JsEnum.of("DashDot");

    public static final DashStyle DOT = JsEnum.of("Dot");

    public static final DashStyle LONGDASH = JsEnum.of("LongDash");

    public static final DashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final DashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final DashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final DashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final DashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final DashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final DashStyle SOLID = JsEnum.of("Solid");
  }
}
