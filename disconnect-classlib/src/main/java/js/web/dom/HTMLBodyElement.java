package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Provides special properties (beyond those inherited from the regular HTMLElement interface) for manipulating <body> elements. */
public interface HTMLBodyElement extends HTMLElement, WindowEventHandlers {
    @Deprecated
    @JSProperty
    String getALink();

    @JSProperty
    void setALink(String aLink);

    @Deprecated
    @JSProperty
    String getBackground();

    @JSProperty
    void setBackground(String background);

    @Deprecated
    @JSProperty
    String getBgColor();

    @JSProperty
    void setBgColor(String bgColor);

    @JSProperty
    String getBgProperties();

    @JSProperty
    void setBgProperties(String bgProperties);

    @Deprecated
    @JSProperty
    String getLink();

    @JSProperty
    void setLink(String link);

    @Deprecated
    @JSProperty
    boolean isNoWrap();

    @JSProperty
    void setNoWrap(boolean noWrap);

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnorientationchange();

    @Deprecated
    @JSProperty
    void setOnorientationchange(EventListener<Event> onorientationchange);

    @Deprecated
    default void addOrientationChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("orientationchange", listener, options);
    }
    @Deprecated
    default void addOrientationChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("orientationchange", listener, options);
    }
    @Deprecated
    default void addOrientationChangeEventListener(EventListener<Event> listener) {
        addEventListener("orientationchange", listener);
    }

    @Deprecated
    default void removeOrientationChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("orientationchange", listener, options);
    }
    @Deprecated
    default void removeOrientationChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("orientationchange", listener, options);
    }
    @Deprecated
    default void removeOrientationChangeEventListener(EventListener<Event> listener) {
        removeEventListener("orientationchange", listener);
    }


    @Deprecated
    @JSProperty
    String getText();

    @JSProperty
    void setText(String text);

    @Deprecated
    @JSProperty
    String getVLink();

    @JSProperty
    void setVLink(String vLink);

    @JSBody(script = "return HTMLBodyElement.prototype")
    static HTMLBodyElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLBodyElement()")
    static HTMLBodyElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
