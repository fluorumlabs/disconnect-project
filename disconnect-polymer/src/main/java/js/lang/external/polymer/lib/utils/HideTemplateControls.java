package js.lang.external.polymer.lib.utils;

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
    symbols = {"hideElementsGlobally as HideTemplateControls_hideElementsGlobally"},
    module = "@polymer/polymer/lib/utils/hide-template-controls.js"
)
public interface HideTemplateControls extends Any {
  /**
   * @return True if elements will be hidden globally
   *
   */
  @JSBody(
      script = "return HideTemplateControls_hideElementsGlobally()"
  )
  static boolean hideElementsGlobally() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
