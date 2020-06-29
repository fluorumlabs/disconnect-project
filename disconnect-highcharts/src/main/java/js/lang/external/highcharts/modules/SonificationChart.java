package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.JsFunction;
import js.lang.external.highcharts.Chart;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface SonificationChart extends Chart {
  /**
   * Cancel current sonification and reset cursor.
   *
   * @param fadeOut
   * Fade out as we pause to avoid clicks.
   *
   */
  void cancelSonify(boolean fadeOut);

  /**
   * Cancel current sonification and reset cursor.
   *
   */
  void cancelSonify();

  /**
   * Get a list of the points currently under cursor.
   *
   * @return The points currently under the cursor.
   *
   */
  SonificationPoint[] getCurrentSonifyPoints();

  /**
   * Pause the running sonification.
   *
   * @param fadeOut
   * Fade out as we pause to avoid clicks.
   *
   */
  void pauseSonify(boolean fadeOut);

  /**
   * Pause the running sonification.
   *
   */
  void pauseSonify();

  /**
   * Reset cursor to start. Requires series.sonify or chart.sonify to have
   * been played at some point earlier.
   *
   */
  void resetSonifyCursor();

  /**
   * Reset cursor to end. Requires series.sonify or chart.sonify to have
   * been played at some point earlier.
   *
   */
  void resetSonifyCursorEnd();

  /**
   * Resume the currently running sonification. Requires series.sonify or
   * chart.sonify to have been played at some point earlier.
   *
   * @param onEnd
   * Callback to call when play finished.
   *
   */
  void resumeSonify(JsFunction onEnd);

  /**
   * Play backwards from cursor. Requires series.sonify or chart.sonify to
   * have been played at some point earlier.
   *
   * @param onEnd
   * Callback to call when play finished.
   *
   */
  void rewindSonify(JsFunction onEnd);

  /**
   * Set the cursor to a point or set of points in different series.
   *
   * @param points
   * The point or points to set the cursor to. If setting multiple
   * points under the cursor, the points have to be in different
   * series that are being played simultaneously.
   *
   */
  void setSonifyCursor(SonificationPoint[] points);

  /**
   * Set the cursor to a point or set of points in different series.
   *
   * @param points
   * The point or points to set the cursor to. If setting multiple
   * points under the cursor, the points have to be in different
   * series that are being played simultaneously.
   *
   */
  void setSonifyCursor(SonificationPoint points);

  /**
   * Sonify a chart.
   *
   * @param options
   * The options for sonifying this chart.
   *
   */
  void sonify(SonificationOptions options);
}
