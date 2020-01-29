package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface StringKeyFunction<T extends Any, U extends Any, A extends Any> extends JSObject {
    U apply(T value, String key, A parent);
}
