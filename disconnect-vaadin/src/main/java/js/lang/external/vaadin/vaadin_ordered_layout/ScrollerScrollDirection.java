package js.lang.external.vaadin.vaadin_ordered_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-ordered-layout",
    version = "^1.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-ordered-layout/imports.js"
)
public abstract class ScrollerScrollDirection extends JsEnum {
  public static final ScrollerScrollDirection HORIZONTAL = JsEnum.of("horizontal");

  public static final ScrollerScrollDirection VERTICAL = JsEnum.of("vertical");

  public static final ScrollerScrollDirection NONE = JsEnum.of("none");
}
