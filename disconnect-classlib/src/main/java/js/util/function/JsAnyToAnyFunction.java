package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface JsAnyToAnyFunction<T extends Any, R extends Any> extends JSObject {
    R apply(T value);
}
