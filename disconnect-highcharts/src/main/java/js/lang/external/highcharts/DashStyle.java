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
public abstract class DashStyle extends JsEnum {
  public static final DashStyle DASH = JsEnum.of("Dash");

  public static final DashStyle DASHDOT = JsEnum.of("DashDot");

  public static final DashStyle DOT = JsEnum.of("Dot");

  public static final DashStyle LONGDASH = JsEnum.of("LongDash");

  public static final DashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final DashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final DashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final DashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final DashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final DashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final DashStyle SOLID = JsEnum.of("Solid");
}
