package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
@Import(
        symbols = {"Router as Router_Router"},
        module = "@vaadin/router/dist/vaadin-router.js"
)
public interface NavigationTriggers extends Any {
  /**
   * @deprecated use <code>NavigationTrigger</code> instead of <code>Router.NavigationTrigger</code>
   *
   */
  @JSBody(script = "return Router_Router.CLICK")
  static NavigationTrigger CLICK() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(script = "return Router_Router.POPSTATE")
  static NavigationTrigger POPSTATE() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
