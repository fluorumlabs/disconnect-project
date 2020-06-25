package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.PointOptionsObject;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/heatmap.src.js"
)
public interface HeatmapPointOptionsObject extends PointOptionsObject {
  /**
   * Heatmap series only. Point padding for a single point.
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * Heatmap series only. Point padding for a single point.
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
