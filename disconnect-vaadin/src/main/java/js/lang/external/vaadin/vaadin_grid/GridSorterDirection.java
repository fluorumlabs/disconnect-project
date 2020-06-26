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
public abstract class GridSorterDirection extends JsEnum {
  public static final GridSorterDirection ASC = JsEnum.of("asc");

  public static final GridSorterDirection DESC = JsEnum.of("desc");
}
