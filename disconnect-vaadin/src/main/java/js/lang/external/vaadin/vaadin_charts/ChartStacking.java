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
public abstract class ChartStacking extends JsEnum {
  public static final ChartStacking NORMAL = JsEnum.of("normal");

  public static final ChartStacking PERCENT = JsEnum.of("percent");
}
