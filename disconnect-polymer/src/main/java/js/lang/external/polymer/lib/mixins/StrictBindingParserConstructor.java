package js.lang.external.polymer.lib.mixins;

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
    symbols = {"StrictBindingParserConstructor as StrictBindingParserConstructor_StrictBindingParserConstructor"},
    module = "@polymer/polymer/lib/mixins/strict-binding-parser.js"
)
public interface StrictBindingParserConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return StrictBindingParserConstructor_StrictBindingParserConstructor.apply(null, args)"
  )
  static StrictBindingParser create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
