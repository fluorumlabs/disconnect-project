package js.lang.external.vaadin.grid;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 7/2/2020.
 */
@FunctionalInterface
@JSFunctor
public interface ItemIdExtractor<T extends Any> extends JSObject {
    Unknown getItemId(T item);
}
