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
public abstract class WhiskerDashStyle extends JsEnum {
  public static final WhiskerDashStyle DASH = JsEnum.of("Dash");

  public static final WhiskerDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final WhiskerDashStyle DOT = JsEnum.of("Dot");

  public static final WhiskerDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final WhiskerDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final WhiskerDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final WhiskerDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final WhiskerDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final WhiskerDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final WhiskerDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final WhiskerDashStyle SOLID = JsEnum.of("Solid");
}
