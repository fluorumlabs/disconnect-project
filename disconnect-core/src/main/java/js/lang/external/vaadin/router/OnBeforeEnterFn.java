package js.lang.external.vaadin.router;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@FunctionalInterface
@JSFunctor
public
interface OnBeforeEnterFn extends Any {
  Unknown apply(RouterLocation location, PreventAndRedirectCommands commands, Router router);
}
