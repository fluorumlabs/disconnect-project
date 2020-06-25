package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Point;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface SonificationPoint extends Point {
  /**
   * Cancel sonification of a point. Calls onEnd functions.
   *
   * @param fadeOut
   * Whether or not to fade out as we stop. If false, the points
   * are cancelled synchronously.
   *
   */
  void cancelSonify(boolean fadeOut);

  /**
   * Cancel sonification of a point. Calls onEnd functions.
   *
   */
  void cancelSonify();

  /**
   * Sonify a single point.
   *
   * @param options
   * Options for the sonification of the point.
   *
   */
  void sonify(PointSonifyOptionsObject options);
}
