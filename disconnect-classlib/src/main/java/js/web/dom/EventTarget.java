package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * EventTarget is a DOM interface implemented by objects that can receive events and may have listeners for them.
 */
public interface EventTarget extends Any {
    @JSBody(script = "return new EventTarget()")
    static EventTarget create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return EventTarget.prototype")
    static EventTarget prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
     * <p>
     * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
     * <p>
     * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
     * <p>
     * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
     * <p>
     * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
     * <p>
     * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
     */
    <E extends Event> void addEventListener(String type, EventListener<E> listener, AddEventListenerOptions options);

    <E extends Event> void addEventListener(String type, EventListener<E> listener, boolean options);

    <E extends Event> void addEventListener(String type, EventListener<E> listener);

    /**
     * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
     */
    boolean dispatchEvent(Event event);

    /**
     * Removes the event listener in target's event listener list with the same type, callback, and options.
     */
    <E extends Event> void removeEventListener(String type, EventListener<E> callback, EventListenerOptions options);

    <E extends Event> void removeEventListener(String type, EventListener<E> callback, boolean options);

    <E extends Event> void removeEventListener(String type, EventListener<E> callback);

}
