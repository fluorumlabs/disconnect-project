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
public abstract class Position extends JsEnum {
  public static final Position CENTER = JsEnum.of("center");

  public static final Position LEFT = JsEnum.of("left");

  public static final Position RIGHT = JsEnum.of("right");
}
