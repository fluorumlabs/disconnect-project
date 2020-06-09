package js.lang.external.polymer.lib.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.polymer.PolymerInit;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"Polymer as PolymerFn_Polymer"},
    module = "@polymer/polymer/lib/legacy/polymer-fn.js"
)
public interface PolymerFn extends Any {
  /**
   * Legacy class factory and registration helper for defining Polymer
   * elements.
   *
   * This method is equivalent to
   *
   * <pre><code> import {Class} from '@polymer/polymer/lib/legacy/class.js';
   *  customElements.define(info.is, Class(info));
   * </code></pre>
   * See <code>Class</code> for details on valid legacy metadata format for <code>info</code>.
   *
   * @return Generated class
   *
   */
  @JSBody(
      params = {"info"},
      script = "return PolymerFn_Polymer(info)"
  )
  static PolymerResult Polymer(PolymerInit info) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  interface PolymerResult extends Any {
  }
}
