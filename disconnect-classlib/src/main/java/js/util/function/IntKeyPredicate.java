package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface IntKeyPredicate<T extends Any, A extends Any> extends JSObject {
    boolean test(T value, int key, A parent);
}
