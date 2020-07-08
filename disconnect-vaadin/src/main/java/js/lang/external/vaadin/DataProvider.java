package js.lang.external.vaadin;

import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 7/2/2020.
 */
@FunctionalInterface
@JSFunctor
public interface DataProvider<P extends Any, T extends Any> extends Any {
    void provide(P params, DataProviderCallback<T> callback);
}
