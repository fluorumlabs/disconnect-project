package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.highcharts.Point;
import js.lang.external.highcharts.Series;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/boost.src.js"
)
public interface BoostSeries extends Series {
  /**
   * If implemented in the core, parts of this can probably be shared with
   * other similar methods in Highcharts.
   *
   */
  void destroyGraphics();

  /**
   * Enter boost mode and apply boost-specific properties.
   *
   */
  void enterBoost();

  /**
   * Exit from boost mode and restore non-boost properties.
   *
   */
  void exitBoost();

  /**
   * Return a full Point object based on the index. The boost module uses
   * stripped point objects for performance reasons.
   *
   * @param boostPoint
   * A stripped-down point object
   *
   * @return A Point object as per
   * <a href="https://api.highcharts.com/highcharts#Point">https://api.highcharts.com/highcharts#Point</a>
   *
   */
  Point getPoint(Point boostPoint);

  /**
   * Return a full Point object based on the index. The boost module uses
   * stripped point objects for performance reasons.
   *
   * @param boostPoint
   * A stripped-down point object
   *
   * @return A Point object as per
   * <a href="https://api.highcharts.com/highcharts#Point">https://api.highcharts.com/highcharts#Point</a>
   *
   */
  Point getPoint(Any boostPoint);
}
