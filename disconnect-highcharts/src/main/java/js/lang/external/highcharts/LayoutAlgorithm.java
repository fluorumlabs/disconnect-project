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
public abstract class LayoutAlgorithm extends JsEnum {
  public static final LayoutAlgorithm SQUARIFIED = JsEnum.of("squarified");

  public static final LayoutAlgorithm STRIP = JsEnum.of("strip");

  public static final LayoutAlgorithm STRIPES = JsEnum.of("stripes");

  public static final LayoutAlgorithm SLICEANDDICE = JsEnum.of("sliceAndDice");
}
