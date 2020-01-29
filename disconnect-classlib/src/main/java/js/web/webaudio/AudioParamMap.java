package js.web.webaudio;

import js.util.collections.ReadonlyStringMap;
import org.teavm.jso.JSBody;


public interface AudioParamMap extends ReadonlyStringMap<AudioParam> {
    @JSBody(script = "return AudioParamMap.prototype")
    static AudioParamMap prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioParamMap()")
    static AudioParamMap create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
