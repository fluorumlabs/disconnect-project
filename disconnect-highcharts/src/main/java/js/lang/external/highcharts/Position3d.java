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
public abstract class Position3d extends JsEnum {
  public static final Position3d CHART = JsEnum.of("chart");

  public static final Position3d FLAP = JsEnum.of("flap");

  public static final Position3d OFFSET = JsEnum.of("offset");

  public static final Position3d ORTHO = JsEnum.of("ortho");
}
