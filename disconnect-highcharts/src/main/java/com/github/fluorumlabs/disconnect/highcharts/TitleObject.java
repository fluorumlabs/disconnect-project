package com.github.fluorumlabs.disconnect.highcharts;

/**
 * The chart title. The title has an <code>update</code> method that allows modifying the
 * options directly or indirectly via <code>chart.update</code>.
 *
 */
public interface TitleObject extends SVGElement {
  /**
   * Modify options for the title.
   *
   * @param titleOptions
   * Options to modify.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @implspec update(titleOptions: TitleOptions, redraw?: boolean): void;
   *
   */
  void update(TitleOptions titleOptions, boolean redraw);

  /**
   * Modify options for the title.
   *
   * @param titleOptions
   * Options to modify.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @implspec update(titleOptions: TitleOptions, redraw?: boolean): void;
   *
   */
  void update(TitleOptions titleOptions);
}
