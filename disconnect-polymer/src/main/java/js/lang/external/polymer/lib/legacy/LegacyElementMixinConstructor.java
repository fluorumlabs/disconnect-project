package js.lang.external.polymer.lib.legacy;

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
    symbols = {"LegacyElementMixinConstructor as LegacyElementMixinConstructor_LegacyElementMixinConstructor"},
    module = "@polymer/polymer/lib/legacy/legacy-element-mixin.js"
)
public interface LegacyElementMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return LegacyElementMixinConstructor_LegacyElementMixinConstructor.apply(null, args)"
  )
  static LegacyElementMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
