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
public abstract class PointValKey extends JsEnum {
  public static final PointValKey CLOSE = JsEnum.of("close");

  public static final PointValKey HIGH = JsEnum.of("high");

  public static final PointValKey LOW = JsEnum.of("low");

  public static final PointValKey OPEN = JsEnum.of("open");
}
