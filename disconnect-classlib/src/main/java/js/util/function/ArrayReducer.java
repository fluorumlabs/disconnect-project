package js.util.function;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface ArrayReducer<T extends Any, U extends Any, A extends Any> extends JSObject {
    U reduce(U previousValue, T currentValue, int currentIndex, A array);
}
