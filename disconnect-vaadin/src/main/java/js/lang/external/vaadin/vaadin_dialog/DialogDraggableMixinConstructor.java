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
    symbols = {"DialogDraggableMixinConstructor as DialogDraggableMixinConstructor_DialogDraggableMixinConstructor"},
    module = "@vaadin/vaadin-dialog/src/vaadin-dialog-draggable-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-dialog/src/vaadin-dialog-draggable-mixin.js"
)
public interface DialogDraggableMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DialogDraggableMixinConstructor_DialogDraggableMixinConstructor.apply(null, args)"
  )
  static DialogDraggableMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
