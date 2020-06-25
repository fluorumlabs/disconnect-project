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
public abstract class Stacking extends JsEnum {
  public static final Stacking NORMAL = JsEnum.of("normal");

  public static final Stacking OVERLAP = JsEnum.of("overlap");

  public static final Stacking PERCENT = JsEnum.of("percent");

  public static final Stacking STREAM = JsEnum.of("stream");
}
