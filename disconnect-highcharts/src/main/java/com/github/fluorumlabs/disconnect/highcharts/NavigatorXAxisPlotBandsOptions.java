package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of colored bands stretching across
 * the plot area marking an interval on the axis.
 *
 * In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
 * class in addition to the <code>className</code> option.
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands</a>
 * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands">https://api.highcharts.com/highstock/navigator.xAxis.plotBands</a>
 * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands">https://api.highcharts.com/gantt/navigator.xAxis.plotBands</a>
 *
 */
public interface NavigatorXAxisPlotBandsOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
   * requires <code>borderWidth</code> to be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderColor">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderColor">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderColor">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
   * requires <code>borderWidth</code> to be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderColor">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderColor">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderColor">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
   * requires <code>borderColor</code> to be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderWidth">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderWidth">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderWidth">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
   * requires <code>borderColor</code> to be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderWidth">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderWidth">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderWidth">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-band</code>, to apply to each individual band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.className">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.className">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.className">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
   * default <code>highcharts-plot-band</code>, to apply to each individual band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.className">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.className">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.className">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.events">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.events">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.events">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.events</a>
   *
   * @implspec events?: object;
   *
   */
  @JSProperty("events")
  @Nullable
  Any getEvents();

  /**
   * (Highcharts, Highstock, Gantt) An object defining mouse events for the
   * plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>,
   * <code>mousemove</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.events">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.events">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.events">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.events</a>
   *
   * @implspec events?: object;
   *
   */
  @JSProperty("events")
  void setEvents(Any value);

  /**
   * (Highcharts, Highstock, Gantt) The start position of the plot band in
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.from">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.from">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.from">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highstock, Gantt) The start position of the plot band in
   * axis units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.from">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.from">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.from">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
   * in Axis.removePlotBand.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.id">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.id">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.id">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
   * in Axis.removePlotBand.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.id">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.id">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.id">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.label">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.label">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.label">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.label</a>
   *
   * @implspec label?: NavigatorXAxisPlotBandsLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  NavigatorXAxisPlotBandsLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.label">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.label">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.label">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.label</a>
   *
   * @implspec label?: NavigatorXAxisPlotBandsLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(NavigatorXAxisPlotBandsLabelOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
   * units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.to">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.to">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.to">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
   * units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.to">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.to">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.to">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.to</a>
   *
   * @implspec to?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.zIndex">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.zIndex">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.zIndex">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.zIndex</a>
   *
   * @implspec zIndex?: number;
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.zIndex">https://api.highcharts.com/highcharts/navigator.xAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.xAxis.plotBands.zIndex">https://api.highcharts.com/highstock/navigator.xAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.xAxis.plotBands.zIndex">https://api.highcharts.com/gantt/navigator.xAxis.plotBands.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
