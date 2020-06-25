package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/data.src.js"
)
public abstract class DataType extends JsEnum {
  public static final DataType JSON = JsEnum.of("json");

  public static final DataType OCTET = JsEnum.of("octet");

  public static final DataType TEXT = JsEnum.of("text");

  public static final DataType XML = JsEnum.of("xml");
}
