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
public abstract class Type extends JsEnum {
  public static final Type ARC = JsEnum.of("arc");

  public static final Type CALLOUT = JsEnum.of("callout");

  public static final Type CIRCLE = JsEnum.of("circle");

  public static final Type DIAMOND = JsEnum.of("diamond");

  public static final Type SQUARE = JsEnum.of("square");

  public static final Type TRIANGLE = JsEnum.of("triangle");

  public static final Type TRIANGLE_DOWN = JsEnum.of("triangle-down");
}
