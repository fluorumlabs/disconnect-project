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
    symbols = {"DirMixinConstructor as DirMixinConstructor_DirMixinConstructor"},
    module = "@polymer/polymer/lib/mixins/dir-mixin.js"
)
@Import(
    module = "@polymer/polymer/lib/mixins/dir-mixin.js"
)
public interface DirMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DirMixinConstructor_DirMixinConstructor.apply(null, args)"
  )
  static DirMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
