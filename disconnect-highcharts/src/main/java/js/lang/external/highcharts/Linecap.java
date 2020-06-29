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
public abstract class Linecap extends JsEnum {
  public static final Linecap BUTT = JsEnum.of("butt");

  public static final Linecap ROUND = JsEnum.of("round");

  public static final Linecap SQUARE = JsEnum.of("square");
}
