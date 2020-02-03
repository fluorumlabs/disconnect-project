package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface JsSupplier<T extends Any> extends JSObject {
    T get();
}
