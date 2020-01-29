package js.web.cssom;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Events providing information related to animations. */
public interface AnimationEvent extends Event {
    @JSProperty
    String getAnimationName();

    @JSProperty
    double getElapsedTime();

    @JSProperty
    String getPseudoElement();

    @JSBody(script = "return AnimationEvent.prototype")
    static AnimationEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","animationEventInitDict"}, script = "return new AnimationEvent(type, animationEventInitDict)")
    static AnimationEvent create(String type, AnimationEventInit animationEventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new AnimationEvent(type)")
    static AnimationEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


    interface AnimationEventInit extends EventInit {
        @JSProperty
        @Nullable
        String getAnimationName();

        @JSProperty
        void setAnimationName(String animationName);

        @JSProperty
        double getElapsedTime();

        @JSProperty
        void setElapsedTime(double elapsedTime);

        @JSProperty
        @Nullable
        String getPseudoElement();

        @JSProperty
        void setPseudoElement(String pseudoElement);

    }
}
