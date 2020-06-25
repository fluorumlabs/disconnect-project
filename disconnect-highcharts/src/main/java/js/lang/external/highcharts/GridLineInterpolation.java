package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public abstract class GridLineInterpolation extends JsEnum {
  public static final GridLineInterpolation CIRCLE = JsEnum.of("circle");

  public static final GridLineInterpolation POLYGON = JsEnum.of("polygon");
}
