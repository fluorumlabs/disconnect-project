package js.lang.external.vaadin.vaadin_grid_pro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-grid-pro",
    version = "^2.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro.js"
)
public abstract class GridProEditorType extends JsEnum {
  public static final GridProEditorType TEXT = JsEnum.of("text");

  public static final GridProEditorType CHECKBOX = JsEnum.of("checkbox");

  public static final GridProEditorType SELECT = JsEnum.of("select");

  public static final GridProEditorType CUSTOM = JsEnum.of("custom");
}
