package js.lang.external.polymer.elements;

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
    symbols = {"ArraySelectorMixinConstructor as ArraySelectorMixinConstructor_ArraySelectorMixinConstructor"},
    module = "@polymer/polymer/lib/elements/array-selector.js"
)
public interface ArraySelectorMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ArraySelectorMixinConstructor_ArraySelectorMixinConstructor.apply(null, args)"
  )
  static ArraySelectorMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
