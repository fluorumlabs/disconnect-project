package js.lang.external.vaadin.vaadin_form_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-form-layout",
    version = "^2.3.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-form-layout/vaadin-form-layout.js"
)
public abstract class FormLayoutLabelsPosition extends JsEnum {
  public static final FormLayoutLabelsPosition ASIDE = JsEnum.of("aside");

  public static final FormLayoutLabelsPosition TOP = JsEnum.of("top");
}
