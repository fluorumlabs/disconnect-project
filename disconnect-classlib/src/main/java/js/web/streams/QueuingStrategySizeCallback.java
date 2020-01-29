package js.web.streams;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface QueuingStrategySizeCallback<T extends Any> extends JSObject {
        int getSize(T chunk);
        }
