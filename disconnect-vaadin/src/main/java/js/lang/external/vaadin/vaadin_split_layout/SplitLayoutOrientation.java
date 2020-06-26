package js.lang.external.vaadin.vaadin_split_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-split-layout",
    version = "^4.3.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-split-layout/vaadin-split-layout.js"
)
public abstract class SplitLayoutOrientation extends JsEnum {
  public static final SplitLayoutOrientation HORIZONTAL = JsEnum.of("horizontal");

  public static final SplitLayoutOrientation VERTICAL = JsEnum.of("vertical");
}
