package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    symbols = {"DragAndDropMixin as VaadinGridDragAndDropMixin_DragAndDropMixin"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-drag-and-drop-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-drag-and-drop-mixin.js"
)
public interface VaadinGridDragAndDropMixin extends Any {
  /**
   * DO NOT EDIT
   *
   * This file was automatically generated by
   * <a href="https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations">https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations</a>
   *
   * To modify these typings, edit the source file(s):
   * src/vaadin-grid-drag-and-drop-mixin.js
   *
   */
  @JSBody(
      params = {"base"},
      script = "return VaadinGridDragAndDropMixin_DragAndDropMixin(base)"
  )
  static <T extends JsFunction> Any DragAndDropMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}