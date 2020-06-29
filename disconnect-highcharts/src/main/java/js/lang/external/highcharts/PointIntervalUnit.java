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
public abstract class PointIntervalUnit extends JsEnum {
  public static final PointIntervalUnit DAY = JsEnum.of("day");

  public static final PointIntervalUnit MONTH = JsEnum.of("month");

  public static final PointIntervalUnit YEAR = JsEnum.of("year");
}
