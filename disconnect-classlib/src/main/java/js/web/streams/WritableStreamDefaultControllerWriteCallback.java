package js.web.streams;

import js.lang.Any;
import js.lang.VoidPromiseLike;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface WritableStreamDefaultControllerWriteCallback<W extends Any> extends JSObject {
        VoidPromiseLike handle(W chunk, WritableStreamDefaultController controller);
        }
