package js.lang.external.polymer.mixins;

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
    symbols = {"DisableUpgradeMixinConstructor as DisableUpgradeMixinConstructor_DisableUpgradeMixinConstructor"},
    module = "@polymer/polymer/lib/mixins/disable-upgrade-mixin.js"
)
public interface DisableUpgradeMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DisableUpgradeMixinConstructor_DisableUpgradeMixinConstructor.apply(null, args)"
  )
  static DisableUpgradeMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
