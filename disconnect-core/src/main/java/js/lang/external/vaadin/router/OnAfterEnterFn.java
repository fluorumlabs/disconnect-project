package js.lang.external.vaadin.router;

import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@FunctionalInterface
@JSFunctor
public
interface OnAfterEnterFn extends Any {
  void apply(RouterLocation location, EmptyCommands commands, Router router);
}
