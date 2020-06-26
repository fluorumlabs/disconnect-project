package js.lang.external.vaadin.vaadin_list_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-list-mixin",
    version = "^2.5.0"
)
@Import(
    module = "@vaadin/vaadin-list-mixin/vaadin-list-mixin.js"
)
public abstract class ListOrientation extends JsEnum {
  public static final ListOrientation HORIZONTAL = JsEnum.of("horizontal");

  public static final ListOrientation VERTICAL = JsEnum.of("vertical");
}
