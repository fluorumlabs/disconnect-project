package js.lang.external.vaadin.vaadin_dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-dialog",
    version = "^2.5.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-dialog/vaadin-dialog.js"
)
public abstract class DialogResizableDirection extends JsEnum {
  public static final DialogResizableDirection N = JsEnum.of("n");

  public static final DialogResizableDirection E = JsEnum.of("e");

  public static final DialogResizableDirection S = JsEnum.of("s");

  public static final DialogResizableDirection W = JsEnum.of("w");

  public static final DialogResizableDirection NW = JsEnum.of("nw");

  public static final DialogResizableDirection NE = JsEnum.of("ne");

  public static final DialogResizableDirection SE = JsEnum.of("se");

  public static final DialogResizableDirection SW = JsEnum.of("sw");
}
