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
public abstract class SetStateState extends JsEnum {
  public static final SetStateState SELECT = JsEnum.of("select");

  public static final SetStateState NORMAL = JsEnum.of("normal");

  public static final SetStateState INACTIVE = JsEnum.of("inactive");

  public static final SetStateState HOVER = JsEnum.of("hover");

  public static final SetStateState EMPTY_VALUE = JsEnum.of("");
}
