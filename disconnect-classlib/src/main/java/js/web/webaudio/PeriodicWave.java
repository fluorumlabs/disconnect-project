package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * PeriodicWave has no inputs or outputs; it is used to define custom oscillators when calling OscillatorNode.setPeriodicWave(). The PeriodicWave itself is created/returned by AudioContext.createPeriodicWave().
 */
public interface PeriodicWave extends Any {
    @JSBody(script = "return PeriodicWave.prototype")
    static PeriodicWave prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"context", "options"}, script = "return new PeriodicWave(context, options)")
    static PeriodicWave create(BaseAudioContext context, PeriodicWaveOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "context", script = "return new PeriodicWave(context)")
    static PeriodicWave create(BaseAudioContext context) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
