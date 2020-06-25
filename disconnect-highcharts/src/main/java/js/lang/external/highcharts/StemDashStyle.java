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
public abstract class StemDashStyle extends JsEnum {
  public static final StemDashStyle DASH = JsEnum.of("Dash");

  public static final StemDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final StemDashStyle DOT = JsEnum.of("Dot");

  public static final StemDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final StemDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final StemDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final StemDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final StemDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final StemDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final StemDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final StemDashStyle SOLID = JsEnum.of("Solid");
}
