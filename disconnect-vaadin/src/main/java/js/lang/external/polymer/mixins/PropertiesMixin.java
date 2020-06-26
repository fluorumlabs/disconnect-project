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
    symbols = {"PropertiesMixin as PropertiesMixin_PropertiesMixin"},
    module = "@polymer/polymer/lib/mixins/properties-mixin.js"
)
@Import(
    module = "@polymer/polymer/lib/mixins/properties-mixin.js"
)
public interface PropertiesMixin extends PropertiesChanged {
  /**
   * Mixin that provides a minimal starting point to using the PropertiesChanged
   * mixin by providing a mechanism to declare properties in a static
   * getter (e.g. static get properties() { return { foo: String } }). Changes
   * are reported via the <code>_propertiesChanged</code> method.
   *
   * This mixin provides no specific support for rendering. Users are expected
   * to create a ShadowRoot and put content into it and update it in whatever
   * way makes sense. This can be done in reaction to properties changing by
   * implementing <code>_propertiesChanged</code>.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return PropertiesMixin_PropertiesMixin(base)"
  )
  static <T extends JsFunction> Any PropertiesMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
