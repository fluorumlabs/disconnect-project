package js.web.permissions;

import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/22/2020.
 */
public interface PermissionStatus extends EventTarget {

    @JSBody(script = "return PermissionStatus.prototype")
    static PermissionStatus prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new PermissionStatus()")
    static PermissionStatus create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

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
    PermissionState getState();

}
