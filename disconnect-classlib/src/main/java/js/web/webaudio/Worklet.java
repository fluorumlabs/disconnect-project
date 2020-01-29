package js.web.webaudio;

import js.lang.Any;
import js.lang.VoidPromise;
import js.web.webworkers.WorkletOptions;
import org.teavm.jso.JSBody;


public interface Worklet extends Any {
    @JSBody(script = "return Worklet.prototype")
    static Worklet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Worklet()")
    static Worklet create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    VoidPromise addModule(String moduleURL, WorkletOptions options);

    VoidPromise addModule(String moduleURL);

}
