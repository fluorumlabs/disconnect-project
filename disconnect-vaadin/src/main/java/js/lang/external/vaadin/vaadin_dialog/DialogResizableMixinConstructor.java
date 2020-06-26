package js.lang.external.vaadin.vaadin_dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-dialog",
    version = "^2.5.0-alpha4"
)
@Import(
    symbols = {"DialogResizableMixinConstructor as DialogResizableMixinConstructor_DialogResizableMixinConstructor"},
    module = "@vaadin/vaadin-dialog/src/vaadin-dialog-resizable-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-dialog/src/vaadin-dialog-resizable-mixin.js"
)
public interface DialogResizableMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DialogResizableMixinConstructor_DialogResizableMixinConstructor.apply(null, args)"
  )
  static DialogResizableMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
