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
public interface BeforeLeaveObserver extends Any {
  Unknown /* void | Router.PreventResult | Promise < void | Router.PreventResult > */ onBeforeLeave(
      RouterLocation location, PreventCommands commands, Router router);
}
