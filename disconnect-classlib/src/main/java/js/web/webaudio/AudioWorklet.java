package js.web.webaudio;

import org.teavm.jso.JSBody;


public interface AudioWorklet extends Worklet {
    @JSBody(script = "return AudioWorklet.prototype")
    static AudioWorklet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AudioWorklet()")
    static AudioWorklet create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
