package js.lang.external.vaadin.vaadin_charts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-charts",
    version = "^7.0.0-alpha6"
)
@Import(
    module = "@vaadin/vaadin-charts/vaadin-chart.js"
)
public abstract class ChartCategoryPosition extends JsEnum {
  public static final ChartCategoryPosition LEFT = JsEnum.of("left");

  public static final ChartCategoryPosition RIGHT = JsEnum.of("right");

  public static final ChartCategoryPosition TOP = JsEnum.of("top");

  public static final ChartCategoryPosition BOTTOM = JsEnum.of("bottom");
}
