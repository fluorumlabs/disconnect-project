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
public abstract class Align extends JsEnum {
  public static final Align CENTER = JsEnum.of("center");

  public static final Align LEFT = JsEnum.of("left");

  public static final Align RIGHT = JsEnum.of("right");
}
