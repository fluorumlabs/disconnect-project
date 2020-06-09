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
    symbols = {"TemplateStampConstructor as TemplateStampConstructor_TemplateStampConstructor"},
    module = "@polymer/polymer/lib/mixins/template-stamp.js"
)
public interface TemplateStampConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return TemplateStampConstructor_TemplateStampConstructor.apply(null, args)"
  )
  static TemplateStamp create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
