package js.web.mediastreams;

import js.web.dom.BufferSource;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


@JSFunctor
@FunctionalInterface
public interface ForEachCallback extends JSObject {
        void accept(@Nullable BufferSource keyId, MediaKeyStatus status);
        }
