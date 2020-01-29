package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface JsAnyToAnyBiFunction<T1 extends Any, T2 extends Any, R extends Any> extends JSObject {
    R apply(T1 value1, T2 value2);
}
