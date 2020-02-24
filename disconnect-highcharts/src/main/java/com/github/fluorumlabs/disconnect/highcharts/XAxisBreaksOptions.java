package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
 * sections defined will be left out and all the points shifted closer to each
 * other.
 *
 * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks">https://api.highcharts.com/highcharts/xAxis.breaks</a>
 * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks">https://api.highcharts.com/highstock/xAxis.breaks</a>
 * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks">https://api.highcharts.com/gantt/xAxis.breaks</a>
 *
 */
public interface XAxisBreaksOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A number indicating how much space should
   * be left between the start and the end of the break. The break size is
   * given in axis units, so for instance on a <code>datetime</code> axis, a break size
   * of 3600000 would indicate the equivalent of an hour.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.breakSize">https://api.highcharts.com/highcharts/xAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.breakSize">https://api.highcharts.com/highstock/xAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.breakSize">https://api.highcharts.com/gantt/xAxis.breaks.breakSize</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.breakSize">https://api.highcharts.com/highcharts/xAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.breakSize">https://api.highcharts.com/highstock/xAxis.breaks.breakSize</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.breakSize">https://api.highcharts.com/gantt/xAxis.breaks.breakSize</a>
   *
   * @implspec breakSize?: number;
   *
   */
  @JSProperty("breakSize")
  void setBreakSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) The point where the break starts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.from">https://api.highcharts.com/highcharts/xAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.from">https://api.highcharts.com/highstock/xAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.from">https://api.highcharts.com/gantt/xAxis.breaks.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highstock, Gantt) The point where the break starts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.from">https://api.highcharts.com/highcharts/xAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.from">https://api.highcharts.com/highstock/xAxis.breaks.from</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.from">https://api.highcharts.com/gantt/xAxis.breaks.from</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.repeat">https://api.highcharts.com/highcharts/xAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.repeat">https://api.highcharts.com/highstock/xAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.repeat">https://api.highcharts.com/gantt/xAxis.breaks.repeat</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.repeat">https://api.highcharts.com/highcharts/xAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.repeat">https://api.highcharts.com/highstock/xAxis.breaks.repeat</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.repeat">https://api.highcharts.com/gantt/xAxis.breaks.repeat</a>
   *
   * @implspec repeat?: number;
   *
   */
  @JSProperty("repeat")
  void setRepeat(double value);

  /**
   * (Highcharts, Highstock, Gantt) The point where the break ends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.to">https://api.highcharts.com/highcharts/xAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.to">https://api.highcharts.com/highstock/xAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.to">https://api.highcharts.com/gantt/xAxis.breaks.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highstock, Gantt) The point where the break ends.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis.breaks.to">https://api.highcharts.com/highcharts/xAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis.breaks.to">https://api.highcharts.com/highstock/xAxis.breaks.to</a>
   * @see <a href="https://api.highcharts.com/gantt/xAxis.breaks.to">https://api.highcharts.com/gantt/xAxis.breaks.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  void setTo(double value);
}
