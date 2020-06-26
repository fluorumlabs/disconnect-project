package js.lang.external.vaadin.vaadin_app_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-app-layout",
    version = "^2.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-app-layout/vaadin-app-layout.js"
)
public abstract class PrimarySection extends JsEnum {
  public static final PrimarySection NAVBAR = JsEnum.of("navbar");

  public static final PrimarySection DRAWER = JsEnum.of("drawer");
}
