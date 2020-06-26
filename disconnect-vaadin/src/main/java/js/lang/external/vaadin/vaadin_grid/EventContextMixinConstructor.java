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
    symbols = {"EventContextMixinConstructor as EventContextMixinConstructor_EventContextMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-event-context-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-event-context-mixin.js"
)
public interface EventContextMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return EventContextMixinConstructor_EventContextMixinConstructor.apply(null, args)"
  )
  static EventContextMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
