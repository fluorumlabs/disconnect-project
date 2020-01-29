package js.util.function;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface JsDoubleConsumer extends JSObject {
    void accept(double value);
}
