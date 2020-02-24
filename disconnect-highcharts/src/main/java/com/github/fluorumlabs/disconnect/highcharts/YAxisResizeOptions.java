package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for axis resizing. This feature requires the
 * <code>drag-panes.js</code> - classic or styled mode - module.
 *
 * @see <a href="https://api.highcharts.com/highstock/yAxis.resize">https://api.highcharts.com/highstock/yAxis.resize</a>
 *
 */
public interface YAxisResizeOptions extends Any {
  /**
   * (Highstock) Contains two arrays of axes that are controlled by control
   * line of the axis.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis</a>
   *
   * @implspec controlledAxis?: YAxisResizeControlledAxisOptions;
   *
   */
  @JSProperty("controlledAxis")
  @Nullable
  YAxisResizeControlledAxisOptions getControlledAxis();

  /**
   * (Highstock) Contains two arrays of axes that are controlled by control
   * line of the axis.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.controlledAxis">https://api.highcharts.com/highstock/yAxis.resize.controlledAxis</a>
   *
   * @implspec controlledAxis?: YAxisResizeControlledAxisOptions;
   *
   */
  @JSProperty("controlledAxis")
  void setControlledAxis(YAxisResizeControlledAxisOptions value);

  /**
   * (Highstock) Cursor style for the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.cursor">https://api.highcharts.com/highstock/yAxis.resize.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Highstock) Cursor style for the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.cursor">https://api.highcharts.com/highstock/yAxis.resize.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highstock) Enable or disable resize by drag for the axis.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.enabled">https://api.highcharts.com/highstock/yAxis.resize.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable resize by drag for the axis.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.enabled">https://api.highcharts.com/highstock/yAxis.resize.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Color of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.lineColor">https://api.highcharts.com/highstock/yAxis.resize.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) Color of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.lineColor">https://api.highcharts.com/highstock/yAxis.resize.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highstock) Dash style of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.lineDashStyle">https://api.highcharts.com/highstock/yAxis.resize.lineDashStyle</a>
   *
   * @implspec lineDashStyle?: string;
   *
   */
  @JSProperty("lineDashStyle")
  @Nullable
  String getLineDashStyle();

  /**
   * (Highstock) Dash style of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.lineDashStyle">https://api.highcharts.com/highstock/yAxis.resize.lineDashStyle</a>
   *
   * @implspec lineDashStyle?: string;
   *
   */
  @JSProperty("lineDashStyle")
  void setLineDashStyle(String value);

  /**
   * (Highstock) Width of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.lineWidth">https://api.highcharts.com/highstock/yAxis.resize.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) Width of the control line.
   *
   * In styled mode use class <code>highcharts-axis-resizer</code> instead.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.lineWidth">https://api.highcharts.com/highstock/yAxis.resize.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) Horizontal offset of the control line.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.x">https://api.highcharts.com/highstock/yAxis.resize.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock) Horizontal offset of the control line.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.x">https://api.highcharts.com/highstock/yAxis.resize.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock) Vertical offset of the control line.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.y">https://api.highcharts.com/highstock/yAxis.resize.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock) Vertical offset of the control line.
   *
   * This feature requires the <code>drag-panes.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highstock/yAxis.resize.y">https://api.highcharts.com/highstock/yAxis.resize.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
