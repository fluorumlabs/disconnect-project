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
public abstract class LayoutStartingDirection extends JsEnum {
  public static final LayoutStartingDirection HORIZONTAL = JsEnum.of("horizontal");

  public static final LayoutStartingDirection VERTICAL = JsEnum.of("vertical");
}
