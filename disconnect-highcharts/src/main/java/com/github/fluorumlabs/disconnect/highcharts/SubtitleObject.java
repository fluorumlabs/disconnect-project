package com.github.fluorumlabs.disconnect.highcharts;

/**
 * The chart subtitle. The subtitle has an <code>update</code> method that allows modifying
 * the options directly or indirectly via <code>chart.update</code>.
 *
 */
public interface SubtitleObject extends SVGElement {
  /**
   * Modify options for the subtitle.
   *
   * @param subtitleOptions
   * Options to modify.
   *
   * @param redraw
   * Wether to redraw the chart.
   *
   * @implspec update(subtitleOptions: SubtitleOptions, redraw?: boolean): void;
   *
   */
  void update(SubtitleOptions subtitleOptions);

  /**
   * Modify options for the subtitle.
   *
   * @param subtitleOptions
   * Options to modify.
   *
   * @param redraw
   * Wether to redraw the chart.
   *
   * @implspec update(subtitleOptions: SubtitleOptions, redraw?: boolean): void;
   *
   */
  void update(SubtitleOptions subtitleOptions, boolean redraw);
}
