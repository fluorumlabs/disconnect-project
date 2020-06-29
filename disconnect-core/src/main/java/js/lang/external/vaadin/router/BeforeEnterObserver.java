package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
@JSFunctor
@FunctionalInterface
public interface BeforeEnterObserver extends Any {
  Unknown /* void | Router.PreventResult | Router.RedirectResult | Promise < void | Router.PreventResult | Router.RedirectResult > */ onBeforeEnter(
      RouterLocation location, PreventAndRedirectCommands commands, Router router);
}
