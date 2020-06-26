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
    symbols = {"Templatizer as TemplatizerBehavior_Templatizer"},
    module = "@polymer/polymer/lib/legacy/templatizer-behavior.js"
)
@Import(
    module = "@polymer/polymer/lib/legacy/templatizer-behavior.js"
)
public interface TemplatizerBehavior extends Any {
  @JSBody(
      script = "return TemplatizerBehavior_Templatizer"
  )
  static Any Templatizer() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
