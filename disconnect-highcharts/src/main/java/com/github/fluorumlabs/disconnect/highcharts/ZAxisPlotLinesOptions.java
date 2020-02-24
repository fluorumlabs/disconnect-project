package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of lines stretching across the plot
 * area, marking a specific value on one of the axes.
 *
 * In styled mode, the plot lines are styled by the <code>.highcharts-plot-line</code>
 * class in addition to the <code>className</code> option.
 *
 * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines">https://api.highcharts.com/highcharts/zAxis.plotLines</a>
 * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines">https://api.highcharts.com/highstock/zAxis.plotLines</a>
 * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines">https://api.highcharts.com/gantt/zAxis.plotLines</a>
 *
 */
public interface ZAxisPlotLinesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.className">https://api.highcharts.com/highcharts/zAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.className">https://api.highcharts.com/highstock/zAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.className">https://api.highcharts.com/gantt/zAxis.plotLines.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.className">https://api.highcharts.com/highcharts/zAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.className">https://api.highcharts.com/highstock/zAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.className">https://api.highcharts.com/gantt/zAxis.plotLines.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.color">https://api.highcharts.com/highcharts/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.color">https://api.highcharts.com/highstock/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.color">https://api.highcharts.com/gantt/zAxis.plotLines.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.color">https://api.highcharts.com/highcharts/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.color">https://api.highcharts.com/highstock/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.color">https://api.highcharts.com/gantt/zAxis.plotLines.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.color">https://api.highcharts.com/highcharts/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.color">https://api.highcharts.com/highstock/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.color">https://api.highcharts.com/gantt/zAxis.plotLines.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.color">https://api.highcharts.com/highcharts/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.color">https://api.highcharts.com/highstock/zAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.color">https://api.highcharts.com/gantt/zAxis.plotLines.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
   * line. For possible values see this overview.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.dashStyle">https://api.highcharts.com/highcharts/zAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.dashStyle">https://api.highcharts.com/highstock/zAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.dashStyle">https://api.highcharts.com/gantt/zAxis.plotLines.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
   * line. For possible values see this overview.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.dashStyle">https://api.highcharts.com/highcharts/zAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.dashStyle">https://api.highcharts.com/highstock/zAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.dashStyle">https://api.highcharts.com/gantt/zAxis.plotLines.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(DashStyle value);

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.events">https://api.highcharts.com/highcharts/zAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.events">https://api.highcharts.com/highstock/zAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.events">https://api.highcharts.com/gantt/zAxis.plotLines.events</a>
   *
   * @implspec events?: any;
   *
   */
  @JSProperty("events")
  @Nullable
  Any getEvents();

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.events">https://api.highcharts.com/highcharts/zAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.events">https://api.highcharts.com/highstock/zAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.events">https://api.highcharts.com/gantt/zAxis.plotLines.events</a>
   *
   * @implspec events?: any;
   *
   */
  @JSProperty("events")
  void setEvents(Any value);

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
   * in Axis.removePlotLine.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.id">https://api.highcharts.com/highcharts/zAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.id">https://api.highcharts.com/highstock/zAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.id">https://api.highcharts.com/gantt/zAxis.plotLines.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
   * in Axis.removePlotLine.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.id">https://api.highcharts.com/highcharts/zAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.id">https://api.highcharts.com/highstock/zAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.id">https://api.highcharts.com/gantt/zAxis.plotLines.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.label">https://api.highcharts.com/highcharts/zAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.label">https://api.highcharts.com/highstock/zAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.label">https://api.highcharts.com/gantt/zAxis.plotLines.label</a>
   *
   * @implspec label?: ZAxisPlotLinesLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  ZAxisPlotLinesLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.label">https://api.highcharts.com/highcharts/zAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.label">https://api.highcharts.com/highstock/zAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.label">https://api.highcharts.com/gantt/zAxis.plotLines.label</a>
   *
   * @implspec label?: ZAxisPlotLinesLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(ZAxisPlotLinesLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The position of the line in axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.value">https://api.highcharts.com/highcharts/zAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.value">https://api.highcharts.com/highstock/zAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.value">https://api.highcharts.com/gantt/zAxis.plotLines.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock, Gantt) The position of the line in axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.value">https://api.highcharts.com/highcharts/zAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.value">https://api.highcharts.com/highstock/zAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.value">https://api.highcharts.com/gantt/zAxis.plotLines.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.width">https://api.highcharts.com/highcharts/zAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.width">https://api.highcharts.com/highstock/zAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.width">https://api.highcharts.com/gantt/zAxis.plotLines.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.width">https://api.highcharts.com/highcharts/zAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.width">https://api.highcharts.com/highstock/zAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.width">https://api.highcharts.com/gantt/zAxis.plotLines.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) The z index of the plot line within the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.zIndex">https://api.highcharts.com/highcharts/zAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.zIndex">https://api.highcharts.com/highstock/zAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.zIndex">https://api.highcharts.com/gantt/zAxis.plotLines.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Gantt) The z index of the plot line within the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis.plotLines.zIndex">https://api.highcharts.com/highcharts/zAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/zAxis.plotLines.zIndex">https://api.highcharts.com/highstock/zAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/zAxis.plotLines.zIndex">https://api.highcharts.com/gantt/zAxis.plotLines.zIndex</a>
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
