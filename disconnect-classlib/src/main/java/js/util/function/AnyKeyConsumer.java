package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface AnyKeyConsumer<T extends Any, K extends Any, A extends Any> extends JSObject {
    void accept(T value, K key, A parent);
}
