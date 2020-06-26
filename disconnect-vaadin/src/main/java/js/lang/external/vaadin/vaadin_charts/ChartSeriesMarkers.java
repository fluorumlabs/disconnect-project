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
public abstract class ChartSeriesMarkers extends JsEnum {
  public static final ChartSeriesMarkers SHOWN = JsEnum.of("shown");

  public static final ChartSeriesMarkers HIDDEN = JsEnum.of("hidden");

  public static final ChartSeriesMarkers AUTO = JsEnum.of("auto");
}
