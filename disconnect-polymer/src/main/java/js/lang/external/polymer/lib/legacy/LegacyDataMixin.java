package js.lang.external.polymer.lib.legacy;

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
    symbols = {"LegacyDataMixin as LegacyDataMixin_LegacyDataMixin"},
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface LegacyDataMixin extends Any {
  /**
   * Mixin to selectively add back Polymer 1.x's <code>undefined</code> rules
   * governing when observers &amp; computing functions run based
   * on all arguments being defined (reference https: *
   * When loaded, all legacy elements (defined with <code>Polymer({...})</code>)
   * will have the mixin applied. The mixin only restores legacy data handling
   * if <code>_legacyUndefinedCheck: true</code> is set on the element's prototype.
   *
   * This mixin is intended for use to help migration from Polymer 1.x to
   * 2.x+ by allowing legacy code to work while identifying observers and
   * computing functions that need undefined checks to work without
   * the mixin in Polymer 2.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return LegacyDataMixin_LegacyDataMixin(base)"
  )
  static <T extends JsFunction> Any LegacyDataMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
