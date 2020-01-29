package js.web.webanimations;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface AnimationEffect extends Any {
    @JSBody(script = "return AnimationEffect.prototype")
    static AnimationEffect prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AnimationEffect()")
    static AnimationEffect create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    ComputedEffectTiming getComputedTiming();

    EffectTiming getTiming();

    void updateTiming(OptionalEffectTiming timing);

    void updateTiming();

}
