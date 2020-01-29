package js.web.cssom;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Events providing information related to transitions.
 */
public interface TransitionEvent extends Event {
    @JSBody(script = "return TransitionEvent.prototype")
    static TransitionEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new TransitionEvent(type, eventInitDict)")
    static TransitionEvent create(String type, TransitionEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new TransitionEvent(type)")
    static TransitionEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getElapsedTime();

    @JSProperty
    String getPropertyName();

    @JSProperty
    String getPseudoElement();


    interface TransitionEventInit extends EventInit {
        @JSProperty
        double getElapsedTime();

        @JSProperty
        void setElapsedTime(double elapsedTime);

        @JSProperty
        @Nullable
        String getPropertyName();

        @JSProperty
        void setPropertyName(String propertyName);

        @JSProperty
        @Nullable
        String getPseudoElement();

        @JSProperty
        void setPseudoElement(String pseudoElement);

    }
}
