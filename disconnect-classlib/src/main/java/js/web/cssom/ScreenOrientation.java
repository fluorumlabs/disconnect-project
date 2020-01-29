package js.web.cssom;

import js.lang.VoidPromise;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface ScreenOrientation extends EventTarget {
    @JSBody(script = "return ScreenOrientation.prototype")
    static ScreenOrientation prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ScreenOrientation()")
    static ScreenOrientation create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getAngle();

    @JSProperty
    @Nullable
    EventListener<Event> getOnchange();

    @JSProperty
    void setOnchange(EventListener<Event> onchange);

    default void addChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("change", listener, options);
    }

    default void addChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("change", listener, options);
    }

    default void addChangeEventListener(EventListener<Event> listener) {
        addEventListener("change", listener);
    }

    default void removeChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("change", listener, options);
    }

    default void removeChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("change", listener, options);
    }

    default void removeChangeEventListener(EventListener<Event> listener) {
        removeEventListener("change", listener);
    }

    @JSProperty
    OrientationType getType();

    VoidPromise lock(OrientationLockType orientation);

    void unlock();

}
