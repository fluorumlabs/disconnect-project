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
    symbols = {"OptionalMutableDataConstructor as OptionalMutableDataConstructor_OptionalMutableDataConstructor"},
    module = "@polymer/polymer/lib/mixins/mutable-data.js"
)
public interface OptionalMutableDataConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return OptionalMutableDataConstructor_OptionalMutableDataConstructor.apply(null, args)"
  )
  static OptionalMutableData create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
