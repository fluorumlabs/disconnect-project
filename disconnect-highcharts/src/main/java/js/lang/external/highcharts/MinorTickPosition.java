package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public abstract class MinorTickPosition extends JsEnum {
  public static final MinorTickPosition INSIDE = JsEnum.of("inside");

  public static final MinorTickPosition OUTSIDE = JsEnum.of("outside");
}
