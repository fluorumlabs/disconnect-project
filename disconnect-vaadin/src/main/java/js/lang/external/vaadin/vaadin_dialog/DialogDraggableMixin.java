package js.lang.external.vaadin.vaadin_dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@vaadin/vaadin-dialog",
    version = "^2.5.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-dialog/src/vaadin-dialog-draggable-mixin.js"
)
public interface DialogDraggableMixin extends Any {
  void ready();
}
