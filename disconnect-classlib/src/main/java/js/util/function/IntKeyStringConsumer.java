package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface IntKeyStringConsumer<A extends Any> extends JSObject {
    void accept(String value, int key, A parent);
}
