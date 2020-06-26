package js.lang.external.polymer.utils;

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
    symbols = {"dedupingMixin as Mixin_dedupingMixin"},
    module = "@polymer/polymer/lib/utils/mixin.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/mixin.js"
)
public interface Mixin extends Any {
  /**
   * Wraps an ES6 class expression mixin such that the mixin is only applied
   * if it has not already been applied its base argument. Also memoizes mixin
   * applications.
   *
   */
  @JSBody(
      params = {"mixin"},
      script = "return Mixin_dedupingMixin(mixin)"
  )
  static <T extends Any> T dedupingMixin(T mixin) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
