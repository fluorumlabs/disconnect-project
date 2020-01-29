package js.web.dom;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface EventListener<E extends Event> extends JSObject {
    void handleEvent(E evt);
}
