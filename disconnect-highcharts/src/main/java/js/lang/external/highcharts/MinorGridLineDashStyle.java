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
public abstract class MinorGridLineDashStyle extends JsEnum {
  public static final MinorGridLineDashStyle DASH = JsEnum.of("Dash");

  public static final MinorGridLineDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final MinorGridLineDashStyle DOT = JsEnum.of("Dot");

  public static final MinorGridLineDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final MinorGridLineDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final MinorGridLineDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final MinorGridLineDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final MinorGridLineDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final MinorGridLineDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final MinorGridLineDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final MinorGridLineDashStyle SOLID = JsEnum.of("Solid");
}
