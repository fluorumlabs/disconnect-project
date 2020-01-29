package js.web.dom;

import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


@JSFunctor
@FunctionalInterface
        public interface OnErrorEventHandler extends JSObject {
        void handle(Unknown event, @Nullable String source, int lineno, int colno, @Nullable Error error);
        }
