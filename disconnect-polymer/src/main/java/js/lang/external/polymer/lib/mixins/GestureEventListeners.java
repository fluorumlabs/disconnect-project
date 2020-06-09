package js.lang.external.polymer.lib.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"GestureEventListeners as GestureEventListeners_GestureEventListeners"},
    module = "@polymer/polymer/lib/mixins/gesture-event-listeners.js"
)
public interface GestureEventListeners extends Any {
  /**
   * Element class mixin that provides API for adding Polymer's cross-platform
   * gesture events to nodes.
   *
   * The API is designed to be compatible with override points implemented
   * in <code>TemplateStamp</code> such that declarative event listeners in
   * templates will support gesture events when this mixin is applied along with
   * <code>TemplateStamp</code>.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return GestureEventListeners_GestureEventListeners(base)"
  )
  static <T extends JsFunction> Any GestureEventListeners(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
