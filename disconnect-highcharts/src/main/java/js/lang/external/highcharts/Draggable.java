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
public abstract class Draggable extends JsEnum {
  public static final Draggable EMPTY_VALUE = JsEnum.of("");

  public static final Draggable X = JsEnum.of("x");

  public static final Draggable XY = JsEnum.of("xy");

  public static final Draggable Y = JsEnum.of("y");
}
