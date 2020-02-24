package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Tooltip of a chart.
 *
 */
public interface Tooltip extends Any {
  /**
   * Tooltip of a chart.
   *
   * @param chart
   * The chart instance.
   *
   * @param options
   * Tooltip options.
   *
   * @implspec constructor(chart: Chart, options: TooltipOptions);
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Tooltip(chart, options)"
  )
  static Tooltip create(Chart chart, TooltipOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Chart of the tooltip.
   *
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * Chart of the tooltip.
   *
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  void setChart(Chart value);

  /**
   * Tooltips are initially hidden.
   *
   * @implspec isHidden: boolean;
   *
   */
  @JSProperty("isHidden")
  boolean getIsHidden();

  /**
   * Tooltips are initially hidden.
   *
   * @implspec isHidden: boolean;
   *
   */
  @JSProperty("isHidden")
  void setIsHidden(boolean value);

  /**
   * Used tooltip options.
   *
   * @implspec options: TooltipOptions;
   *
   */
  @JSProperty("options")
  TooltipOptions getOptions();

  /**
   * Used tooltip options.
   *
   * @implspec options: TooltipOptions;
   *
   */
  @JSProperty("options")
  void setOptions(TooltipOptions value);

  /**
   * Whether to allow the tooltip to render outside the chart's SVG element
   * box. By default (false), the tooltip is rendered within the chart's SVG
   * element, which results in the tooltip being aligned inside the chart
   * area.
   *
   * @implspec outside: boolean;
   *
   */
  @JSProperty("outside")
  boolean getOutside();

  /**
   * Whether to allow the tooltip to render outside the chart's SVG element
   * box. By default (false), the tooltip is rendered within the chart's SVG
   * element, which results in the tooltip being aligned inside the chart
   * area.
   *
   * @implspec outside: boolean;
   *
   */
  @JSProperty("outside")
  void setOutside(boolean value);

  /**
   * When the tooltip is shared, the entire plot area will capture mouse
   * movement or touch events.
   *
   * @implspec shared: boolean;
   *
   */
  @JSProperty("shared")
  boolean getShared();

  /**
   * When the tooltip is shared, the entire plot area will capture mouse
   * movement or touch events.
   *
   * @implspec shared: boolean;
   *
   */
  @JSProperty("shared")
  void setShared(boolean value);

  /**
   * True, if the tooltip is splitted into one label per series, with the
   * header close to the axis.
   *
   * @implspec split: boolean;
   *
   */
  @JSProperty("split")
  boolean getSplit();

  /**
   * True, if the tooltip is splitted into one label per series, with the
   * header close to the axis.
   *
   * @implspec split: boolean;
   *
   */
  @JSProperty("split")
  void setSplit(boolean value);

  /**
   * Removes and destroys the tooltip and its elements.
   *
   * @implspec destroy(): void;
   *
   */
  void destroy();

  /**
   * Creates the Tooltip label element if it does not exist, then returns it.
   *
   * @implspec getLabel(): SVGElement;
   *
   */
  SVGElement getLabel();

  /**
   * Hides the tooltip with a fade out animation.
   *
   * @param delay
   * The fade out in milliseconds. If no value is provided the value of
   * the tooltip.hideDelay option is used. A value of 0 disables the
   * fade out animation.
   *
   * @implspec hide(delay?: number): void;
   *
   */
  void hide(double delay);

  /**
   * Hides the tooltip with a fade out animation.
   *
   * @param delay
   * The fade out in milliseconds. If no value is provided the value of
   * the tooltip.hideDelay option is used. A value of 0 disables the
   * fade out animation.
   *
   * @implspec hide(delay?: number): void;
   *
   */
  void hide();

  /**
   * Moves the tooltip with a soft animation to a new position.
   *
   * @implspec move(x: number, y: number, anchorX: number, anchorY: number): void;
   *
   */
  void move(double x, double y, double anchorX, double anchorY);

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   * @param mouseEvent
   * Mouse event, that is responsible for the refresh and should be
   * used for the tooltip update.
   *
   * @implspec refresh(pointOrPoints: (Point|Array<Point>), mouseEvent?: Event): void;
   *
   */
  void refresh(Array<Point> pointOrPoints, Event mouseEvent);

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   * @param mouseEvent
   * Mouse event, that is responsible for the refresh and should be
   * used for the tooltip update.
   *
   * @implspec refresh(pointOrPoints: (Point|Array<Point>), mouseEvent?: Event): void;
   *
   */
  void refresh(Point pointOrPoints, Event mouseEvent);

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   * @param mouseEvent
   * Mouse event, that is responsible for the refresh and should be
   * used for the tooltip update.
   *
   * @implspec refresh(pointOrPoints: (Point|Array<Point>), mouseEvent?: Event): void;
   *
   */
  void refresh(Array<Point> pointOrPoints);

  /**
   * Updates the tooltip with the provided tooltip options.
   *
   * @implspec update(options: TooltipOptions): void;
   *
   */
  void update(TooltipOptions options);
}
