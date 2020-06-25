package js.lang.external.polymer.mixins;

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
    symbols = {"StrictBindingParser as StrictBindingParser_StrictBindingParser"},
    module = "@polymer/polymer/lib/mixins/strict-binding-parser.js"
)
public interface StrictBindingParser extends TemplateStamp, PropertyEffects, PropertyAccessors, PropertiesChanged {
  /**
   * Mixin that parses binding expressions and generates corresponding metadata.
   * The implementation is different than in <code>property-effects</code>, as it uses a
   * state machine instead of a regex. As such, this implementation is able to
   * handle more cases, with the potential performance hit.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return StrictBindingParser_StrictBindingParser(base)"
  )
  static <T extends JsFunction> Any StrictBindingParser(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
