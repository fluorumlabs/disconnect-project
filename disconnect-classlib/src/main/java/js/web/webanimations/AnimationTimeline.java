package js.web.webanimations;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface AnimationTimeline extends Any {
    @JSProperty
    double  getCurrentTime();

    @JSBody(script = "return AnimationTimeline.prototype")
    static AnimationTimeline prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AnimationTimeline()")
    static AnimationTimeline create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
