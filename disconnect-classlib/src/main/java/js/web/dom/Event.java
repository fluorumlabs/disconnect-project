package js.web.dom;

import js.extras.JsEnum;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** An event which takes place in the DOM. */
public interface Event extends Any {
    /**
     * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
     */
    @JSProperty
    boolean isBubbles();

    @JSProperty
    boolean isCancelBubble();

    @JSProperty
    void setCancelBubble(boolean cancelBubble);

    /**
     * Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method.
     */
    @JSProperty
    boolean isCancelable();

    /**
     * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
     */
    @JSProperty
    boolean isComposed();

    /**
     * Returns the object whose event listener's callback is currently being invoked.
     */
    @JSProperty
    @Nullable
    EventTarget  getCurrentTarget();

    /**
     * Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise.
     */
    @JSProperty
    boolean isDefaultPrevented();

    /**
     * Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE.
     */
    @JSProperty
    EventPhase getEventPhase();

    /**
     * Returns true if event was dispatched by the user agent, and false otherwise.
     */
    @JSProperty
    boolean isIsTrusted();

    @JSProperty
    boolean isReturnValue();

    @JSProperty
    void setReturnValue(boolean returnValue);

    @Deprecated
    @JSProperty
    @Nullable
    EventTarget  getSrcElement();

    /**
     * Returns the object to which event is dispatched (its target).
     */
    @JSProperty
    @Nullable
    EventTarget  getTarget();

    /**
     * Returns the event's timestamp as the number of milliseconds measured relative to the time origin.
     */
    @JSProperty
    double getTimeStamp();

    /**
     * Returns the type of event, e.g. "click", "hashchange", or "submit".
     */
    @JSProperty
    String getType();

    /**
     * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
     */
    Array<EventTarget> composedPath();

    void initEvent(String type, boolean bubbles, boolean cancelable);
    void initEvent(String type, boolean bubbles);
    void initEvent(String type);
    /**
     * If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled.
     */
    void preventDefault();
    /**
     * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
     */
    void stopImmediatePropagation();
    /**
     * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
     */
    void stopPropagation();

    abstract class EventPhase extends JsEnum {
        public static final EventPhase AT_TARGET = JsEnum.from("return Event.AT_TARGET");

    public static final EventPhase BUBBLING_PHASE = JsEnum.from("return Event.BUBBLING_PHASE");

    public static final EventPhase CAPTURING_PHASE = JsEnum.from("return Event.CAPTURING_PHASE");
    public static final EventPhase NONE = JsEnum.from("return Event.NONE");
    }


    @JSBody(params={"type","eventInitDict"}, script = "return new Event(type, eventInitDict)")
    static Event create(String type, EventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type"}, script = "return new Event(type)")
    static Event create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Event.prototype")
    static Event prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


    interface EventInit extends Any {
        @JSProperty
        boolean isBubbles();

        @JSProperty
        void setBubbles(boolean bubbles);

        @JSProperty
        boolean isCancelable();

        @JSProperty
        void setCancelable(boolean cancelable);

        @JSProperty
        boolean isComposed();

        @JSProperty
        void setComposed(boolean composed);

    }
}
