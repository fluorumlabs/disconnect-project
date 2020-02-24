package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of objects representing plot lines on
 * the X axis
 *
 * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines">https://api.highcharts.com/highcharts/yAxis.plotLines</a>
 * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines">https://api.highcharts.com/highstock/yAxis.plotLines</a>
 * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines">https://api.highcharts.com/gantt/yAxis.plotLines</a>
 *
 */
public interface YAxisPlotLinesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-line</code>, to apply to each individual line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.className">https://api.highcharts.com/highcharts/yAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.className">https://api.highcharts.com/highstock/yAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.className">https://api.highcharts.com/gantt/yAxis.plotLines.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.className">https://api.highcharts.com/highcharts/yAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.className">https://api.highcharts.com/highstock/yAxis.plotLines.className</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.className">https://api.highcharts.com/gantt/yAxis.plotLines.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.color">https://api.highcharts.com/highcharts/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.color">https://api.highcharts.com/highstock/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.color">https://api.highcharts.com/gantt/yAxis.plotLines.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.color">https://api.highcharts.com/highcharts/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.color">https://api.highcharts.com/highstock/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.color">https://api.highcharts.com/gantt/yAxis.plotLines.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.color">https://api.highcharts.com/highcharts/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.color">https://api.highcharts.com/highstock/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.color">https://api.highcharts.com/gantt/yAxis.plotLines.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.color">https://api.highcharts.com/highcharts/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.color">https://api.highcharts.com/highstock/yAxis.plotLines.color</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.color">https://api.highcharts.com/gantt/yAxis.plotLines.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.dashStyle">https://api.highcharts.com/highcharts/yAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.dashStyle">https://api.highcharts.com/highstock/yAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.dashStyle">https://api.highcharts.com/gantt/yAxis.plotLines.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.dashStyle">https://api.highcharts.com/highcharts/yAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.dashStyle">https://api.highcharts.com/highstock/yAxis.plotLines.dashStyle</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.dashStyle">https://api.highcharts.com/gantt/yAxis.plotLines.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.events">https://api.highcharts.com/highcharts/yAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.events">https://api.highcharts.com/highstock/yAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.events">https://api.highcharts.com/gantt/yAxis.plotLines.events</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.events">https://api.highcharts.com/highcharts/yAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.events">https://api.highcharts.com/highstock/yAxis.plotLines.events</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.events">https://api.highcharts.com/gantt/yAxis.plotLines.events</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.id">https://api.highcharts.com/highcharts/yAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.id">https://api.highcharts.com/highstock/yAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.id">https://api.highcharts.com/gantt/yAxis.plotLines.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.id">https://api.highcharts.com/highcharts/yAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.id">https://api.highcharts.com/highstock/yAxis.plotLines.id</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.id">https://api.highcharts.com/gantt/yAxis.plotLines.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.label">https://api.highcharts.com/highcharts/yAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.label">https://api.highcharts.com/highstock/yAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.label">https://api.highcharts.com/gantt/yAxis.plotLines.label</a>
   *
   * @implspec label?: YAxisPlotLinesLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  YAxisPlotLinesLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.label">https://api.highcharts.com/highcharts/yAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.label">https://api.highcharts.com/highstock/yAxis.plotLines.label</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.label">https://api.highcharts.com/gantt/yAxis.plotLines.label</a>
   *
   * @implspec label?: YAxisPlotLinesLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(YAxisPlotLinesLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The position of the line in axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.value">https://api.highcharts.com/highcharts/yAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.value">https://api.highcharts.com/highstock/yAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.value">https://api.highcharts.com/gantt/yAxis.plotLines.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock, Gantt) The position of the line in axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.value">https://api.highcharts.com/highcharts/yAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.value">https://api.highcharts.com/highstock/yAxis.plotLines.value</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.value">https://api.highcharts.com/gantt/yAxis.plotLines.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.width">https://api.highcharts.com/highcharts/yAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.width">https://api.highcharts.com/highstock/yAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.width">https://api.highcharts.com/gantt/yAxis.plotLines.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.width">https://api.highcharts.com/highcharts/yAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.width">https://api.highcharts.com/highstock/yAxis.plotLines.width</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.width">https://api.highcharts.com/gantt/yAxis.plotLines.width</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.zIndex">https://api.highcharts.com/highcharts/yAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.zIndex">https://api.highcharts.com/highstock/yAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.zIndex">https://api.highcharts.com/gantt/yAxis.plotLines.zIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.plotLines.zIndex">https://api.highcharts.com/highcharts/yAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.plotLines.zIndex">https://api.highcharts.com/highstock/yAxis.plotLines.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.plotLines.zIndex">https://api.highcharts.com/gantt/yAxis.plotLines.zIndex</a>
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
