package js.web.webanimations;

import org.teavm.jso.JSBody;

import js.lang.Any;


public interface AnimationEffect extends Any {
    ComputedEffectTiming getComputedTiming();
    EffectTiming getTiming();
    void updateTiming(OptionalEffectTiming timing);
    void updateTiming();

    @JSBody(script = "return AnimationEffect.prototype")
    static AnimationEffect prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new AnimationEffect()")
    static AnimationEffect create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
