package js.web.cssom;


import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Stores information on a media query applied to a document, and handles sending notifications to listeners when the media query state change (i.e. when the media query test starts or stops evaluating to true).
 */
public interface MediaQueryList extends EventTarget {
    @JSBody(script = "return MediaQueryList.prototype")
    static MediaQueryList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaQueryList()")
    static MediaQueryList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isMatches();

    @JSProperty
    String getMedia();

    @JSProperty
    @Nullable
    EventListener<MediaQueryListEvent> getOnchange();

    @JSProperty
    void setOnchange(EventListener<MediaQueryListEvent> onchange);

    default void addChangeEventListener(EventListener<MediaQueryListEvent> listener, AddEventListenerOptions options) {
        addEventListener("change", listener, options);
    }

    default void addChangeEventListener(EventListener<MediaQueryListEvent> listener, boolean options) {
        addEventListener("change", listener, options);
    }

    default void addChangeEventListener(EventListener<MediaQueryListEvent> listener) {
        addEventListener("change", listener);
    }

    default void removeChangeEventListener(EventListener<MediaQueryListEvent> listener, EventListenerOptions options) {
        removeEventListener("change", listener, options);
    }

    default void removeChangeEventListener(EventListener<MediaQueryListEvent> listener, boolean options) {
        removeEventListener("change", listener, options);
    }

    default void removeChangeEventListener(EventListener<MediaQueryListEvent> listener) {
        removeEventListener("change", listener);
    }

    @Deprecated
    void addListener(EventListener<MediaQueryListEvent> listener);

    @Deprecated
    void removeListener(EventListener<MediaQueryListEvent> listener);

}
