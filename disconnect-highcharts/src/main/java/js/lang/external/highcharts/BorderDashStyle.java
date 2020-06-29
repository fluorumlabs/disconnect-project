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
public abstract class BorderDashStyle extends JsEnum {
  public static final BorderDashStyle DASH = JsEnum.of("Dash");

  public static final BorderDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final BorderDashStyle DOT = JsEnum.of("Dot");

  public static final BorderDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final BorderDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final BorderDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final BorderDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final BorderDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final BorderDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final BorderDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final BorderDashStyle SOLID = JsEnum.of("Solid");
}
