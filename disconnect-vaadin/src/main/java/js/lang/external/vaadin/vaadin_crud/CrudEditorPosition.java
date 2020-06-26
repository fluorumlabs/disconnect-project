package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/vaadin-crud.js"
)
public abstract class CrudEditorPosition extends JsEnum {
  public static final CrudEditorPosition EMPTY_VALUE = JsEnum.of("");

  public static final CrudEditorPosition BOTTOM = JsEnum.of("bottom");

  public static final CrudEditorPosition ASIDE = JsEnum.of("aside");
}
