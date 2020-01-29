package js.util.function;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface JsIntConsumer extends JSObject {
    void accept(boolean value);
}
