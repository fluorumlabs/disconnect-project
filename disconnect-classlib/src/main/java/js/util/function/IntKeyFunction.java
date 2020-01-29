package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface IntKeyFunction<T extends Any, U extends Any, A extends Any> extends JSObject {
    U apply(T value, int key, A parent);
}
