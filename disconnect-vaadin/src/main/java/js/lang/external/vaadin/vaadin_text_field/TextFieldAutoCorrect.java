package js.lang.external.vaadin.vaadin_text_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-text-field",
    version = "^2.7.0-alpha5"
)
@Import(
    module = "@vaadin/vaadin-text-field/vaadin-text-field.js"
)
public abstract class TextFieldAutoCorrect extends JsEnum {
  public static final TextFieldAutoCorrect ON = JsEnum.of("on");

  public static final TextFieldAutoCorrect OFF = JsEnum.of("off");
}
