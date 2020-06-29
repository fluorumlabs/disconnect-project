package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Point;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/heatmap.src.js"
)
public interface HeatmapPoint extends Point {
  /**
   * Heatmap series only. Padding between the points in the heatmap.
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * Heatmap series only. Padding between the points in the heatmap.
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * Heatmap series only. The value of the point, resulting in a color
   * controled by options as set in the colorAxis configuration.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * Heatmap series only. The value of the point, resulting in a color
   * controled by options as set in the colorAxis configuration.
   *
   */
  @JSProperty("value")
  void setValue(double value);
}
