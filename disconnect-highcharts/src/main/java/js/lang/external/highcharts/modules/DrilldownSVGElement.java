package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.external.highcharts.AnimationOptionsObject;
import js.lang.external.highcharts.SVGElement;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/drilldown.src.js"
)
public interface DrilldownSVGElement extends SVGElement {
  /**
   * A general fadeIn method.
   *
   * @param animation
   * The animation options for the element fade.
   *
   */
  void fadeIn(@Nullable AnimationOptionsObject animation);

  /**
   * A general fadeIn method.
   *
   * @param animation
   * The animation options for the element fade.
   *
   */
  void fadeIn(boolean animation);

  /**
   * A general fadeIn method.
   *
   */
  void fadeIn();
}
