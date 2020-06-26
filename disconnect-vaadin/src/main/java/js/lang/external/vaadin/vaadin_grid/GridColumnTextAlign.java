package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public abstract class GridColumnTextAlign extends JsEnum {
  public static final GridColumnTextAlign START = JsEnum.of("start");

  public static final GridColumnTextAlign CENTER = JsEnum.of("center");

  public static final GridColumnTextAlign END = JsEnum.of("end");
}
