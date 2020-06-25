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
    symbols = {"TemplatizeMixinConstructor as TemplatizeMixinConstructor_TemplatizeMixinConstructor"},
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface TemplatizeMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return TemplatizeMixinConstructor_TemplatizeMixinConstructor.apply(null, args)"
  )
  static TemplatizeMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
