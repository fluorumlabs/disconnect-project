package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"buildTemplate as BuildTemplate_buildTemplate"},
    module = "lit-html/lib/build-template.js"
)
@Import(
    module = "lit-html/lib/build-template.js"
)
public interface BuildTemplate extends Any {
  @JSBody(
      params = {"strings"},
      script = "return BuildTemplate_buildTemplate(strings)"
  )
  static String buildTemplate(String[] strings) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
