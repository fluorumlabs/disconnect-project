package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"TemplateStamp as TemplateStamp_TemplateStamp"},
    module = "@polymer/polymer/lib/mixins/template-stamp.js"
)
public interface TemplateStamp extends Any {
  /**
   * Element mixin that provides basic template parsing and stamping, including
   * the following template-related features for stamped templates:
   *
   * <ul>
   * <li>Declarative event listeners (<code>on-eventname=&quot;listener&quot;</code>)</li>
   * <li>Map of node id's to stamped node instances (<code>this.$.id</code>)</li>
   * <li>Nested template content caching/removal and re-installation (performance
   * optimization)</li>
   * </ul>
   */
  @JSBody(
      params = {"base"},
      script = "return TemplateStamp_TemplateStamp(base)"
  )
  static <T extends JsFunction> Any TemplateStamp(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
