package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;

/**
 * The chart caption. The caption has an <code>update</code> method that allows modifying
 * the options directly or indirectly via <code>chart.update</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface CaptionObject extends SVGElement {
  /**
   * Modify options for the caption.
   *
   * @param captionOptions
   * Options to modify.
   *
   * @param redraw
   * Whether to redraw the chart after the caption is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void update(CaptionOptions captionOptions, boolean redraw);

  /**
   * Modify options for the caption.
   *
   * @param captionOptions
   * Options to modify.
   *
   */
  void update(CaptionOptions captionOptions);
}
