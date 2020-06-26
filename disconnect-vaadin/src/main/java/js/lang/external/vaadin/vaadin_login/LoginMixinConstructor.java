package js.lang.external.vaadin.vaadin_login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-login",
    version = "^1.2.0-alpha2"
)
@Import(
    symbols = {"LoginMixinConstructor as LoginMixinConstructor_LoginMixinConstructor"},
    module = "@vaadin/vaadin-login/src/vaadin-login-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-login/src/vaadin-login-mixin.js"
)
public interface LoginMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return LoginMixinConstructor_LoginMixinConstructor.apply(null, args)"
  )
  static LoginMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
