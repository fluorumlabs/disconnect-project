package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
 * sections defined will be left out and all the points shifted closer to each
 * other.
 *
 * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks">https://api.highcharts.com/highcharts/yAxis.breaks</a>
 * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks">https://api.highcharts.com/highstock/yAxis.breaks</a>
 * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks">https://api.highcharts.com/gantt/yAxis.breaks</a>
 *
 */
public interface YAxisBreaksOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A number indicating how much space should
   * be left between the start and the end of the break. The break size is
   * given in axis units, so for instance on a <code>datetime</code> axis, a break size
   * of 3600000 would indicate the equivalent of an hour.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.breakSize">https://api.highcharts.com/highcharts/yAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.breakSize">https://api.highcharts.com/highstock/yAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.breakSize">https://api.highcharts.com/gantt/yAxis.breaks.breakSize</a>
   *
   * @implspec breakSize?: number;
   *
   */
  @JSProperty("breakSize")
  double getBreakSize();

  /**
   * (Highcharts, Highstock, Gantt) A number indicating how much space should
   * be left between the start and the end of the break. The break size is
   * given in axis units, so for instance on a <code>datetime</code> axis, a break size
   * of 3600000 would indicate the equivalent of an hour.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.breakSize">https://api.highcharts.com/highcharts/yAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.breakSize">https://api.highcharts.com/highstock/yAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.breakSize">https://api.highcharts.com/gantt/yAxis.breaks.breakSize</a>
   *
   * @implspec breakSize?: number;
   *
   */
  @JSProperty("breakSize")
  void setBreakSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) The point where the break starts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.from">https://api.highcharts.com/highcharts/yAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.from">https://api.highcharts.com/highstock/yAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.from">https://api.highcharts.com/gantt/yAxis.breaks.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highstock, Gantt) The point where the break starts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.from">https://api.highcharts.com/highcharts/yAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.from">https://api.highcharts.com/highstock/yAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.from">https://api.highcharts.com/gantt/yAxis.breaks.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highstock, Gantt) Defines an interval after which the break
   * appears again. By default the breaks do not repeat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.repeat">https://api.highcharts.com/highcharts/yAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.repeat">https://api.highcharts.com/highstock/yAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.repeat">https://api.highcharts.com/gantt/yAxis.breaks.repeat</a>
   *
   * @implspec repeat?: number;
   *
   */
  @JSProperty("repeat")
  double getRepeat();

  /**
   * (Highcharts, Highstock, Gantt) Defines an interval after which the break
   * appears again. By default the breaks do not repeat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.repeat">https://api.highcharts.com/highcharts/yAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.repeat">https://api.highcharts.com/highstock/yAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.repeat">https://api.highcharts.com/gantt/yAxis.breaks.repeat</a>
   *
   * @implspec repeat?: number;
   *
   */
  @JSProperty("repeat")
  void setRepeat(double value);

  /**
   * (Highcharts, Highstock, Gantt) The point where the break ends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.to">https://api.highcharts.com/highcharts/yAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.to">https://api.highcharts.com/highstock/yAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.to">https://api.highcharts.com/gantt/yAxis.breaks.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highstock, Gantt) The point where the break ends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis.breaks.to">https://api.highcharts.com/highcharts/yAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis.breaks.to">https://api.highcharts.com/highstock/yAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/gantt/yAxis.breaks.to">https://api.highcharts.com/gantt/yAxis.breaks.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  void setTo(double value);
}
