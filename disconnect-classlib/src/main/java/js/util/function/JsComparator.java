package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;


@JSFunctor
@FunctionalInterface
public interface JsComparator<T extends Any> {
    int compare(T a, T b);
}
