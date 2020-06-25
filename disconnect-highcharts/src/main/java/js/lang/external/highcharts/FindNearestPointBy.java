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
public abstract class FindNearestPointBy extends JsEnum {
  public static final FindNearestPointBy X = JsEnum.of("x");

  public static final FindNearestPointBy XY = JsEnum.of("xy");
}
