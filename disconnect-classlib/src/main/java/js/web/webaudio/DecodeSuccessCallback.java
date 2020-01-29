package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface DecodeSuccessCallback extends JSObject {
        void accept(AudioBuffer decodedData);
        }
