package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Point;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/gantt.src.js"
)
public interface GanttPoint extends Point {
  /**
   * The ending X value of the range point.
   *
   */
  @JSProperty("x2")
  double getX2();

  /**
   * The ending X value of the range point.
   *
   */
  @JSProperty("x2")
  void setX2(double value);
}
