package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Titles for yAxes are taken from xAxis.categories. All options
 * for <code>xAxis.labels</code> applies to parallel coordinates titles. For example, to
 * style categories, use xAxis.labels.style.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.title">https://api.highcharts.com/highcharts/chart.parallelAxes.title</a>
 *
 */
public interface ChartParallelAxesTitleOptions extends Any {
  /**
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  boolean getReserveSpace();

  /**
   * @implspec reserveSpace?: boolean;
   *
   */
  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  /**
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * (Highcharts) Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or
   * <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.title.textAlign">https://api.highcharts.com/highcharts/chart.parallelAxes.title.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  @Nullable
  String getTextAlign();

  /**
   * (Highcharts) Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or
   * <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.title.textAlign">https://api.highcharts.com/highcharts/chart.parallelAxes.title.textAlign</a>
   *
   * @implspec textAlign?: string;
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(String value);
}
