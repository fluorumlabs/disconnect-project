package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    symbols = {"DragAndDropMixinConstructor as DragAndDropMixinConstructor_DragAndDropMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-drag-and-drop-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-drag-and-drop-mixin.js"
)
public interface DragAndDropMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DragAndDropMixinConstructor_DragAndDropMixinConstructor.apply(null, args)"
  )
  static DragAndDropMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
