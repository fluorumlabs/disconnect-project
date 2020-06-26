package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"GestureEventListenersConstructor as GestureEventListenersConstructor_GestureEventListenersConstructor"},
    module = "@polymer/polymer/lib/mixins/gesture-event-listeners.js"
)
@Import(
    module = "@polymer/polymer/lib/mixins/gesture-event-listeners.js"
)
public interface GestureEventListenersConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return GestureEventListenersConstructor_GestureEventListenersConstructor.apply(null, args)"
  )
  static GestureEventListeners create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
