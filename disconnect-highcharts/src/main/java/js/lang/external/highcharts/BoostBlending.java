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
public abstract class BoostBlending extends JsEnum {
  public static final BoostBlending ADD = JsEnum.of("add");

  public static final BoostBlending DARKEN = JsEnum.of("darken");

  public static final BoostBlending MULTIPLY = JsEnum.of("multiply");
}
