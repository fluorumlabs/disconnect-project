package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Style options for the guide box default state.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default</a>
 *
 */
public interface PlotHeatmapDragDropGuideBoxDefaultOptions extends Any {
  /**
   * (Highcharts, Highmaps) CSS class name of the guide box in this state.
   * Defaults to <code>highcharts-drag-box-default</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.className">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.className">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highmaps) CSS class name of the guide box in this state.
   * Defaults to <code>highcharts-drag-box-default</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.className">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.className</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.className">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts, Highmaps) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highmaps) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highmaps) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highmaps) Guide box fill color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highmaps) Guide box cursor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.cursor">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.cursor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.cursor">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * (Highcharts, Highmaps) Guide box cursor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.cursor">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.cursor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.cursor">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.cursor</a>
   *
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * (Highcharts, Highmaps) Color of the border around the guide box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highcharts, Highmaps) Color of the border around the guide box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineColor">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineColor">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineColor</a>
   *
   * @implspec lineColor?: ColorString;
   *
   */
  @JSProperty("lineColor")
  void setLineColor(String value);

  /**
   * (Highcharts, Highmaps) Width of the line around the guide box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highmaps) Width of the line around the guide box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highmaps) Guide box zIndex.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.zIndex">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.zIndex">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highmaps) Guide box zIndex.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.zIndex">https://api.highcharts.com/highcharts/plotOptions.heatmap.dragDrop.guideBox.default.zIndex</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.zIndex">https://api.highcharts.com/highmaps/plotOptions.heatmap.dragDrop.guideBox.default.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
