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
public abstract class GridDropMode extends JsEnum {
  public static final GridDropMode BETWEEN = JsEnum.of("between");

  public static final GridDropMode ON_TOP = JsEnum.of("on-top");

  public static final GridDropMode ON_TOP_OR_BETWEEN = JsEnum.of("on-top-or-between");

  public static final GridDropMode ON_GRID = JsEnum.of("on-grid");
}
