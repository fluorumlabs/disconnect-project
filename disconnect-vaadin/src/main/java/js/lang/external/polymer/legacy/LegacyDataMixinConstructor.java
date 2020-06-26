package js.lang.external.polymer.legacy;

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
    symbols = {"LegacyDataMixinConstructor as LegacyDataMixinConstructor_LegacyDataMixinConstructor"},
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
@Import(
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface LegacyDataMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return LegacyDataMixinConstructor_LegacyDataMixinConstructor.apply(null, args)"
  )
  static LegacyDataMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
