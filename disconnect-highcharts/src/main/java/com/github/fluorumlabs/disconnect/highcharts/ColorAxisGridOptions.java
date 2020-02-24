package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
 *
 * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid">https://api.highcharts.com/gantt/colorAxis.grid</a>
 *
 */
public interface ColorAxisGridOptions extends Any {
  /**
   * (Gantt) Set border color for the label grid lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.borderColor">https://api.highcharts.com/gantt/colorAxis.grid.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Gantt) Set border color for the label grid lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.borderColor">https://api.highcharts.com/gantt/colorAxis.grid.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Gantt) Set border width of the label grid lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.borderWidth">https://api.highcharts.com/gantt/colorAxis.grid.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Gantt) Set border width of the label grid lines.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.borderWidth">https://api.highcharts.com/gantt/colorAxis.grid.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Gantt) Set cell height for grid axis labels. By default this is
   * calculated from font size.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.cellHeight">https://api.highcharts.com/gantt/colorAxis.grid.cellHeight</a>
   *
   * @implspec cellHeight?: number;
   *
   */
  @JSProperty("cellHeight")
  double getCellHeight();

  /**
   * (Gantt) Set cell height for grid axis labels. By default this is
   * calculated from font size.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.cellHeight">https://api.highcharts.com/gantt/colorAxis.grid.cellHeight</a>
   *
   * @implspec cellHeight?: number;
   *
   */
  @JSProperty("cellHeight")
  void setCellHeight(double value);

  /**
   * (Gantt) Set specific options for each column (or row for horizontal axes)
   * in the grid. Each extra column/row is its own axis, and the axis options
   * can be set here.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.columns">https://api.highcharts.com/gantt/colorAxis.grid.columns</a>
   *
   * @implspec columns?: Array<XAxisOptions>;
   *
   */
  @JSProperty("columns")
  @Nullable
  Array<XAxisOptions> getColumns();

  /**
   * (Gantt) Set specific options for each column (or row for horizontal axes)
   * in the grid. Each extra column/row is its own axis, and the axis options
   * can be set here.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.columns">https://api.highcharts.com/gantt/colorAxis.grid.columns</a>
   *
   * @implspec columns?: Array<XAxisOptions>;
   *
   */
  @JSProperty("columns")
  void setColumns(Array<XAxisOptions> value);

  /**
   * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
   * charts.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.enabled">https://api.highcharts.com/gantt/colorAxis.grid.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
   * charts.
   *
   * @see <a href="https://api.highcharts.com/gantt/colorAxis.grid.enabled">https://api.highcharts.com/gantt/colorAxis.grid.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);
}
