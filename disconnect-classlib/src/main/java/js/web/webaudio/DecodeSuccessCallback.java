package js.web.webaudio;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
public interface DecodeSuccessCallback extends JSObject {
    void accept(AudioBuffer decodedData);
}
