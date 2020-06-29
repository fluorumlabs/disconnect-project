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
public abstract class MedianDashStyle extends JsEnum {
  public static final MedianDashStyle DASH = JsEnum.of("Dash");

  public static final MedianDashStyle DASHDOT = JsEnum.of("DashDot");

  public static final MedianDashStyle DOT = JsEnum.of("Dot");

  public static final MedianDashStyle LONGDASH = JsEnum.of("LongDash");

  public static final MedianDashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

  public static final MedianDashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

  public static final MedianDashStyle SHORTDASH = JsEnum.of("ShortDash");

  public static final MedianDashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

  public static final MedianDashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

  public static final MedianDashStyle SHORTDOT = JsEnum.of("ShortDot");

  public static final MedianDashStyle SOLID = JsEnum.of("Solid");
}
