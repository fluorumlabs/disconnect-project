package js.web.webanimations;

import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface KeyframeEffect extends AnimationEffect {
    @JSBody(script = "return KeyframeEffect.prototype")
    static KeyframeEffect prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "source", script = "return new KeyframeEffect(source)")
    static KeyframeEffect create(KeyframeEffect source) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"target", "keyframes", "options"}, script = "return new KeyframeEffect(target, keyframes, options)")
    static KeyframeEffect create(@Nullable Element target, @Nullable PropertyIndexedKeyframes keyframes, KeyframeEffectOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"target", "keyframes", "options"}, script = "return new KeyframeEffect(target, keyframes, options)")
    static KeyframeEffect create(@Nullable Element target, @Nullable PropertyIndexedKeyframes keyframes, int options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"target", "keyframes", "options"}, script = "return new KeyframeEffect(target, keyframes, options)")
    static KeyframeEffect create(@Nullable Element target, @Nullable Array<Keyframe> keyframes, KeyframeEffectOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"target", "keyframes", "options"}, script = "return new KeyframeEffect(target, keyframes, options)")
    static KeyframeEffect create(@Nullable Element target, @Nullable Array<Keyframe> keyframes, int options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CompositeOperation getComposite();

    @JSProperty
    void setComposite(CompositeOperation composite);

    @JSProperty
    IterationCompositeOperation getIterationComposite();

    @JSProperty
    void setIterationComposite(IterationCompositeOperation iterationComposite);

    @JSProperty
    @Nullable
    Element getTarget();

    @JSProperty
    void setTarget(Element target);

    Array<ComputedKeyframe> getKeyframes();

    void setKeyframes(@Nullable PropertyIndexedKeyframes keyframes);

    void setKeyframes(@Nullable Array<Keyframe> keyframes);

    void setKeyframes(@Nullable @JSByRef Keyframe... keyframes);

}
