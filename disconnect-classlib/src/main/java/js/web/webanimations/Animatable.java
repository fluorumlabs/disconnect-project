package js.web.webanimations;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;


public interface Animatable extends Any {
    Animation animate(@JSByRef Keyframe[] keyframes, double options);

    Animation animate(@JSByRef Keyframe[] keyframes, KeyframeAnimationOptions options);

    Animation animate(@JSByRef Keyframe... keyframes);

    Animation animate(Array<Keyframe> keyframes, double options);

    Animation animate(Array<Keyframe> keyframes, KeyframeAnimationOptions options);

    Animation animate(Array<Keyframe> keyframes);

    Animation animate(PropertyIndexedKeyframes keyframes, double options);

    Animation animate(PropertyIndexedKeyframes keyframes, KeyframeAnimationOptions options);

    Animation animate(PropertyIndexedKeyframes keyframes);

    Array<Animation> getAnimations();
}
