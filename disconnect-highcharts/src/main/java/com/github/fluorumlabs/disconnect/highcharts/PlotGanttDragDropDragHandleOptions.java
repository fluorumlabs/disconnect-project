package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Options for the drag handles.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle</a>
 *
 */
public interface PlotGanttDragDropDragHandleOptions extends Any {
  /**
   * (Gantt) The class name of the drag handles. Defaults to
   * <code>highcharts-drag-handle</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.className">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Gantt) The class name of the drag handles. Defaults to
   * <code>highcharts-drag-handle</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.className">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Gantt) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Gantt) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Gantt) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Gantt) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Gantt) The mouse cursor to use for the drag handles. By default this is
   * intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending on
   * the direction the point is being dragged.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.cursor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Gantt) The mouse cursor to use for the drag handles. By default this is
   * intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending on
   * the direction the point is being dragged.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.cursor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Gantt) The line color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineColor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Gantt) The line color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineColor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Gantt) The line width for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineWidth">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) The line width for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineWidth">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Gantt) Function to define the SVG path to use for the drag handles.
   * Takes the point as argument. Should return an SVG path in array format.
   * The SVG path is automatically positioned on the point.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.pathFormatter">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.pathFormatter</a>
   *
   * @implspec pathFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pathFormatter")
  @Nullable
  PathFormatter getPathFormatter();

  /**
   * (Gantt) Function to define the SVG path to use for the drag handles.
   * Takes the point as argument. Should return an SVG path in array format.
   * The SVG path is automatically positioned on the point.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.pathFormatter">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.pathFormatter</a>
   *
   * @implspec pathFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pathFormatter")
  void setPathFormatter(PathFormatter value);

  /**
   * (Gantt) The z index for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.zIndex">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Gantt) The z index for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.zIndex">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.dragHandle.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PathFormatter extends Any {
    void apply();
  }
}
