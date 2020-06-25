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
public abstract class GridLineDashStyle extends JsEnum {
  public static final GridLineDashStyle DASH = JsEnum.of("Dash");

  public static final GridLineDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final GridLineDashStyle DOT = JsEnum.of("Dot");

  public static final GridLineDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final GridLineDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final GridLineDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final GridLineDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final GridLineDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final GridLineDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final GridLineDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final GridLineDashStyle SOLID = JsEnum.of("Solid");
}
