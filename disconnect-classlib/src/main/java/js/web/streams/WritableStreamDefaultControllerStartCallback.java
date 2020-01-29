package js.web.streams;

import js.lang.VoidPromiseLike;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface WritableStreamDefaultControllerStartCallback extends JSObject {
    VoidPromiseLike handle(WritableStreamDefaultController controller);
}
