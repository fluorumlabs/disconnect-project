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
public abstract class VerticalAlign extends JsEnum {
  public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

  public static final VerticalAlign MIDDLE = JsEnum.of("middle");

  public static final VerticalAlign TOP = JsEnum.of("top");
}
