package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Options for the drag handles.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle</a>
 *
 */
public interface PlotMapDragDropDragHandleOptions extends Any {
  /**
   * (Highmaps) The class name of the drag handles. Defaults to
   * <code>highcharts-drag-handle</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.className">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highmaps) The class name of the drag handles. Defaults to
   * <code>highcharts-drag-handle</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.className">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highmaps) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highmaps) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highmaps) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highmaps) The fill color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highmaps) The mouse cursor to use for the drag handles. By default this
   * is intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending
   * on the direction the point is being dragged.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.cursor">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Highmaps) The mouse cursor to use for the drag handles. By default this
   * is intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending
   * on the direction the point is being dragged.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.cursor">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highmaps) The line color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineColor">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highmaps) The line color of the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineColor">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highmaps) The line width for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineWidth">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highmaps) The line width for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineWidth">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highmaps) Function to define the SVG path to use for the drag handles.
   * Takes the point as argument. Should return an SVG path in array format.
   * The SVG path is automatically positioned on the point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.pathFormatter">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.pathFormatter</a>
   *
   * @implspec pathFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pathFormatter")
  @Nullable
  PathFormatter getPathFormatter();

  /**
   * (Highmaps) Function to define the SVG path to use for the drag handles.
   * Takes the point as argument. Should return an SVG path in array format.
   * The SVG path is automatically positioned on the point.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.pathFormatter">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.pathFormatter</a>
   *
   * @implspec pathFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pathFormatter")
  void setPathFormatter(PathFormatter value);

  /**
   * (Highmaps) The z index for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.zIndex">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highmaps) The z index for the drag handles.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.zIndex">https://api.highcharts.com/highmaps/plotOptions.map.dragDrop.dragHandle.zIndex</a>
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
