package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Style options for the guide box default state.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default</a>
 *
 */
public interface PlotGanttDragDropGuideBoxDefaultOptions extends Any {
  /**
   * (Gantt) CSS class name of the guide box in this state. Defaults to
   * <code>highcharts-drag-box-default</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.className">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Gantt) CSS class name of the guide box in this state. Defaults to
   * <code>highcharts-drag-box-default</code>.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.className">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Gantt) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Gantt) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Gantt) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Gantt) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Gantt) Guide box cursor.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.cursor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Gantt) Guide box cursor.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.cursor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Gantt) Color of the border around the guide box.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineColor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Gantt) Color of the border around the guide box.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineColor">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Gantt) Width of the line around the guide box.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineWidth">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) Width of the line around the guide box.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineWidth">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Gantt) Guide box zIndex.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.zIndex">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Gantt) Guide box zIndex.
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.zIndex">https://api.highcharts.com/gantt/plotOptions.gantt.dragDrop.guideBox.default.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
