package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array of objects defining plot bands on the
 * Y axis.
 *
 * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands</a>
 * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands">https://api.highcharts.com/highstock/navigator.yAxis.plotBands</a>
 * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands">https://api.highcharts.com/gantt/navigator.yAxis.plotBands</a>
 *
 */
public interface NavigatorYAxisPlotBandsOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
   * requires <code>borderWidth</code> to be set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderColor">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderColor">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderColor">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderColor">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderColor">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderColor</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderColor">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderWidth">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderWidth">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderWidth">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderWidth">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderWidth">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.borderWidth</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderWidth">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.borderWidth</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.className">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.className">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.className">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.className</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.className">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.className">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.className</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.className">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highstock, Gantt) The color of the plot band.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.color</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.color</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.events">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.events">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.events">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.events</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.events">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.events">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.events</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.events">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.events</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.from">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.from">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.from">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.from</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.from">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.from">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.from</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.from">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.from</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.id">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.id">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.id">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.id</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.id">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.id">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.id</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.id">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.id</a>
   *
   * @implspec id?: string;
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts) In a gauge chart, this option determines the inner radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
   * default, the inner radius is controlled by the thickness option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.innerRadius">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  @Nullable
  Unknown getInnerRadius();

  /**
   * (Highcharts) In a gauge chart, this option determines the inner radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>. By
   * default, the inner radius is controlled by the thickness option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.innerRadius">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.innerRadius">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.innerRadius</a>
   *
   * @implspec innerRadius?: (number|string);
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(String value);

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.label">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.label">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.label">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.label</a>
   *
   * @implspec label?: NavigatorYAxisPlotBandsLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  NavigatorYAxisPlotBandsLabelOptions getLabel();

  /**
   * (Highcharts, Highstock, Gantt) Text labels for the plot bands
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.label">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.label">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.label</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.label">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.label</a>
   *
   * @implspec label?: NavigatorYAxisPlotBandsLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(NavigatorYAxisPlotBandsLabelOptions value);

  /**
   * (Highcharts) In a gauge chart, this option determines the outer radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.outerRadius">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.outerRadius</a>
   *
   * @implspec outerRadius?: (number|string);
   *
   */
  @JSProperty("outerRadius")
  @Nullable
  Unknown getOuterRadius();

  /**
   * (Highcharts) In a gauge chart, this option determines the outer radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.outerRadius">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.outerRadius</a>
   *
   * @implspec outerRadius?: (number|string);
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(double value);

  /**
   * (Highcharts) In a gauge chart, this option determines the outer radius of
   * the plot band that stretches along the perimeter. It can be given as a
   * percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.outerRadius">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.outerRadius</a>
   *
   * @implspec outerRadius?: (number|string);
   *
   */
  @JSProperty("outerRadius")
  void setOuterRadius(String value);

  /**
   * (Highcharts) In a gauge chart, this option sets the width of the plot
   * band stretching along the perimeter. It can be given as a percentage
   * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
   * 10 is the same as the default tickLength, thus making the plot band act
   * as a background for the tick markers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.thickness">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.thickness</a>
   *
   * @implspec thickness?: (number|string);
   *
   */
  @JSProperty("thickness")
  @Nullable
  Unknown getThickness();

  /**
   * (Highcharts) In a gauge chart, this option sets the width of the plot
   * band stretching along the perimeter. It can be given as a percentage
   * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default value
   * 10 is the same as the default tickLength, thus making the plot band act
   * as a background for the tick markers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.thickness">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.thickness</a>
   *
   * @implspec thickness?: (number|string);
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.thickness">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.thickness</a>
   *
   * @implspec thickness?: (number|string);
   *
   */
  @JSProperty("thickness")
  void setThickness(String value);

  /**
   * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
   * units.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.to">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.to">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.to">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.to</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.to">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.to">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.to</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.to">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.to</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.zIndex">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.zIndex">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.zIndex">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.zIndex</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.zIndex">https://api.highcharts.com/highcharts/navigator.yAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.plotBands.zIndex">https://api.highcharts.com/highstock/navigator.yAxis.plotBands.zIndex</a>
   * @see <a href="https://api.highcharts.com/gantt/navigator.yAxis.plotBands.zIndex">https://api.highcharts.com/gantt/navigator.yAxis.plotBands.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
