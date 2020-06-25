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
public abstract class BoxDashStyle extends JsEnum {
  public static final BoxDashStyle DASH = JsEnum.of("Dash");

  public static final BoxDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final BoxDashStyle DOT = JsEnum.of("Dot");

  public static final BoxDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final BoxDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final BoxDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final BoxDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final BoxDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final BoxDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final BoxDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final BoxDashStyle SOLID = JsEnum.of("Solid");
}
