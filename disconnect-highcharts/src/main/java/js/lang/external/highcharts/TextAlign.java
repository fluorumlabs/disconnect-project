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
public abstract class TextAlign extends JsEnum {
  public static final TextAlign CENTER = JsEnum.of("center");

  public static final TextAlign LEFT = JsEnum.of("left");

  public static final TextAlign RIGHT = JsEnum.of("right");
}
