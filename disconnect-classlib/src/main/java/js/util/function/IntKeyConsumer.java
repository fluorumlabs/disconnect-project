package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface IntKeyConsumer<T extends Any, A extends Any> extends JSObject {
    void accept(T value, int key, A parent);
}
