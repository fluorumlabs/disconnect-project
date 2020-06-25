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
    symbols = {"MutableDataConstructor as MutableDataConstructor_MutableDataConstructor"},
    module = "@polymer/polymer/lib/mixins/mutable-data.js"
)
public interface MutableDataConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return MutableDataConstructor_MutableDataConstructor.apply(null, args)"
  )
  static MutableData create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
