package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface StringKeyStringConsumer<A extends Any> extends JSObject {
    void accept(String value, String key, A parent);
}
