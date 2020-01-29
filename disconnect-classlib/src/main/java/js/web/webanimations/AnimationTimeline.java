package js.web.webanimations;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface AnimationTimeline extends Any {
    @JSBody(script = "return AnimationTimeline.prototype")
    static AnimationTimeline prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AnimationTimeline()")
    static AnimationTimeline create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getCurrentTime();

}
