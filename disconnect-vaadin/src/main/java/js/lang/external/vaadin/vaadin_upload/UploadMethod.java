package js.lang.external.vaadin.vaadin_upload;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-upload",
    version = "^4.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-upload/vaadin-upload.js"
)
public abstract class UploadMethod extends JsEnum {
  public static final UploadMethod POST = JsEnum.of("POST");

  public static final UploadMethod PUT = JsEnum.of("PUT");
}
